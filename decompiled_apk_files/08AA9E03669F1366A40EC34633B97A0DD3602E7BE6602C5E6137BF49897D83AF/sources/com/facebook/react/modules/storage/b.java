package com.facebook.react.modules.storage;

import com.facebook.react.bridge.ar;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
/* compiled from: AsyncStorageErrorUtil.java */
/* loaded from: classes.dex */
public class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ar a(String str, String str2) {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE, str2);
        if (str != null) {
            b2.putString("key", str);
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ar a(String str) {
        return a(str, "Invalid key");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ar b(String str) {
        return a(str, "Invalid Value");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ar c(String str) {
        return a(str, "Database Error");
    }
}
