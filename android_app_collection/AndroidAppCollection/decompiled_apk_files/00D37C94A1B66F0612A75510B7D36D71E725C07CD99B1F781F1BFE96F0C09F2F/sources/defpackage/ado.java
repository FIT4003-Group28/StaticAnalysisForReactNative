package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: ado  reason: default package */
/* loaded from: classes.dex */
public final class ado {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(PrivateKeyType.INVALID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context) {
        return Build.VERSION.SDK_INT >= 23 && context != null && context.getPackageManager() != null && ael.a(context.getPackageManager());
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "TEMPORARILY_UNMETERED" : "METERED" : "NOT_ROAMING" : "UNMETERED" : "CONNECTED" : "NOT_REQUIRED";
    }
}
