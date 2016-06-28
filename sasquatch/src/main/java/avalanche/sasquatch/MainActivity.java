package avalanche.sasquatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import avalanche.base.Avalanche;
import avalanche.base.utils.AvalancheLog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button mCrashButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Avalanche.useFeatures(getApplication());

        AvalancheLog.setLogLevel(Log.INFO);

        boolean crashManagerAvailable = Avalanche.isFeatureAvailable(Avalanche.FEATURE_CRASH);

        AvalancheLog.info("crash available: " + crashManagerAvailable);

        boolean crashManagerEnabled = Avalanche.getSharedInstance().isFeatureEnabled(Avalanche.FEATURE_CRASH);

        AvalancheLog.info("crash enabled: " + crashManagerEnabled);

        mCrashButton = (Button) findViewById(R.id.button_crash);
        mCrashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> fakeList = new ArrayList<>();
                fakeList.get(1000);
            }
        });
    }
}
