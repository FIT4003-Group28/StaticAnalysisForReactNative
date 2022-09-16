package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
/* compiled from: PG */
/* renamed from: acw  reason: default package */
/* loaded from: classes.dex */
final class acw extends BiometricPrompt.AuthenticationCallback {
    final /* synthetic */ acz a;

    public acw(acz aczVar) {
        this.a = aczVar;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        this.a.b();
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject d;
        IdentityCredential b;
        ads adsVar = null;
        if (authenticationResult != null && (d = acx.d(authenticationResult)) != null) {
            Cipher e = aec.e(d);
            if (e != null) {
                adsVar = new ads(e);
            } else {
                Signature d2 = aec.d(d);
                if (d2 != null) {
                    adsVar = new ads(d2);
                } else {
                    Mac f = aec.f(d);
                    if (f != null) {
                        adsVar = new ads(f);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b = aed.b(d)) != null) {
                        adsVar = new ads(b);
                    }
                }
            }
        }
        int i = -1;
        if (Build.VERSION.SDK_INT >= 30) {
            if (authenticationResult != null) {
                i = acy.a(authenticationResult);
            }
        } else if (Build.VERSION.SDK_INT != 29) {
            i = 2;
        }
        this.a.c(new adr(adsVar, i));
    }
}
