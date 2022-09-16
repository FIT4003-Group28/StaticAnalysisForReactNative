package android.support.v4.c.a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
/* compiled from: FingerprintManagerCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f378a;

    public static a a(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.f378a = context;
    }

    public boolean a() {
        FingerprintManager b2;
        return Build.VERSION.SDK_INT >= 23 && (b2 = b(this.f378a)) != null && b2.hasEnrolledFingerprints();
    }

    public boolean b() {
        FingerprintManager b2;
        return Build.VERSION.SDK_INT >= 23 && (b2 = b(this.f378a)) != null && b2.isHardwareDetected();
    }

    private static FingerprintManager b(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }
}
