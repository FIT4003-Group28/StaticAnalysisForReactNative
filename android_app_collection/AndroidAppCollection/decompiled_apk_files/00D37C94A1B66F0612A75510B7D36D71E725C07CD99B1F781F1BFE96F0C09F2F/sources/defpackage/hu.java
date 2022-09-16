package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
/* compiled from: PG */
@Deprecated
/* renamed from: hu  reason: default package */
/* loaded from: classes3.dex */
public final class hu {
    public final Context a;

    private hu(Context context) {
        this.a = context;
    }

    public static FingerprintManager a(Context context) {
        if (Build.VERSION.SDK_INT == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (Build.VERSION.SDK_INT > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static hu b(Context context) {
        return new hu(context);
    }

    public final boolean c() {
        FingerprintManager a;
        return Build.VERSION.SDK_INT >= 23 && (a = a(this.a)) != null && a.hasEnrolledFingerprints();
    }

    public final boolean d() {
        FingerprintManager a;
        return Build.VERSION.SDK_INT >= 23 && (a = a(this.a)) != null && a.isHardwareDetected();
    }
}
