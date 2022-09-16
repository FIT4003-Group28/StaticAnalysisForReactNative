package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import javax.crypto.KeyGenerator;
/* compiled from: PG */
/* renamed from: aeb  reason: default package */
/* loaded from: classes.dex */
public final class aeb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeyGenParameterSpec.Builder a(String str, int i) {
        return new KeyGenParameterSpec.Builder("androidxBiometric", 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeyGenParameterSpec b(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) {
        keyGenerator.init(keyGenParameterSpec);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes("CBC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings("PKCS7Padding");
    }
}
