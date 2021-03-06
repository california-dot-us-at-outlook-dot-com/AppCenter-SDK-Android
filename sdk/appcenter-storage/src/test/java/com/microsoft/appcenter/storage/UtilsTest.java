/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 */

package com.microsoft.appcenter.storage;

import com.microsoft.appcenter.storage.models.Document;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class UtilsTest {

    @Test
    public void canParseWhenDocumentMalformed() {
        Document<TestDocument> document = Utils.parseDocument("{}", TestDocument.class);
        assertNotNull(document.getDocumentError());
    }

    @Test
    public void getETag() {
        assertNull(Utils.getEtag(null));
        assertNull(Utils.getEtag(""));
        assertNull(Utils.getEtag("{a:1}"));
    }
}
