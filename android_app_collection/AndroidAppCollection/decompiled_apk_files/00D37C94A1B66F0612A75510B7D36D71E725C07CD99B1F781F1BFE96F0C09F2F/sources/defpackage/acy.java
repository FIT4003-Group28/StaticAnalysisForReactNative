package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: acy  reason: default package */
/* loaded from: classes.dex */
public final class acy {
    public static long a;
    public static Method b;
    public static acy c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }

    public static int b(adu aduVar, ads adsVar) {
        int i = adsVar != null ? 15 : PrivateKeyType.INVALID;
        return aduVar.d ? 32768 | i : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(int i) {
        return (i & 32768) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(int i) {
        return i == 15 || i == 255 || i == 0;
    }
}
