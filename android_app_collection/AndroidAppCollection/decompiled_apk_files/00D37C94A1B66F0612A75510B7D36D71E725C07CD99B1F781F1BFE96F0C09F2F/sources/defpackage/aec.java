package defpackage;

import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
/* compiled from: PG */
/* renamed from: aec  reason: default package */
/* loaded from: classes.dex */
public final class aec {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject a(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject b(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject c(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Signature d(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Cipher e(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Mac f(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    public static final float g(afn afnVar) {
        return ((afo) afnVar.a).a;
    }

    public static final void h(afn afnVar, float f) {
        Drawable drawable = afnVar.a;
        boolean c = afnVar.c();
        boolean b = afnVar.b();
        afo afoVar = (afo) drawable;
        if (f != afoVar.b || afoVar.c != c || afoVar.d != b) {
            afoVar.b = f;
            afoVar.c = c;
            afoVar.d = b;
            afoVar.b(null);
            afoVar.invalidateSelf();
        }
        if (afnVar.c()) {
            float f2 = ((afo) afnVar.a).b;
            float g = g(afnVar);
            int ceil = (int) Math.ceil(afp.a(f2, g, afnVar.b()));
            int ceil2 = (int) Math.ceil(afp.b(f2, g, afnVar.b()));
            afnVar.a(ceil, ceil2, ceil, ceil2);
            return;
        }
        afnVar.a(0, 0, 0, 0);
    }
}
