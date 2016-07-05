package avalanche.base;

import android.app.Activity;
import android.os.Bundle;

public abstract class DefaultAvalancheFeature implements AvalancheFeature {

    private boolean mEnabled;

    public DefaultAvalancheFeature() {
        mEnabled = true;
    }

    @Override
    public String getName() {
        return getClass().getName();
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }

    @Override
    public void setEnabled(boolean enabled) {
        mEnabled = enabled;
    }

    @Override
    public boolean isEnabled() {
        return mEnabled;
    }

}