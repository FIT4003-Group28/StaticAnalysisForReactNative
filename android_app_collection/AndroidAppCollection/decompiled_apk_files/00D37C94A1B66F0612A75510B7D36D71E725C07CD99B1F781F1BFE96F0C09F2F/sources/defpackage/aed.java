package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: aed  reason: default package */
/* loaded from: classes.dex */
public final class aed {
    public aed() {
        Collections.emptyList();
        Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }

    public static ankt c(agr agrVar) {
        agp agpVar = new agp();
        agt agtVar = new agt(agpVar);
        agpVar.b = agtVar;
        agpVar.a = agrVar.getClass();
        try {
            Object a = agrVar.a(agpVar);
            if (a != null) {
                agpVar.a = a;
            }
        } catch (Exception e) {
            agtVar.b(e);
        }
        return agtVar;
    }
}
