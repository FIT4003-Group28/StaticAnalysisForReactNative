package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cce  reason: default package */
/* loaded from: classes2.dex */
public final class cce {
    private static age d;
    private static final Interpolator c = new LinearInterpolator();
    static final ccv a = ccv.a("t", "s", "e", "o", "i", "h", "to", "ti");
    static final ccv b = ccv.a("x", "y");

    cce() {
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator linearInterpolator;
        pointF.x = cdc.b(pointF.x, -1.0f, 1.0f);
        pointF.y = cdc.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = cdc.b(pointF2.x, -1.0f, 1.0f);
        pointF2.y = cdc.b(pointF2.y, -100.0f, 100.0f);
        int d2 = cdh.d(pointF.x, pointF.y, pointF2.x, pointF2.y);
        synchronized (cce.class) {
            if (d == null) {
                d = new age();
            }
            weakReference = (WeakReference) d.e(d2);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference == null || interpolator == null) {
            try {
                linearInterpolator = kt.o(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = kt.o(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                WeakReference weakReference2 = new WeakReference(interpolator);
                synchronized (cce.class) {
                    d.k(d2, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cdi a(defpackage.ccw r21, defpackage.bwx r22, float r23, defpackage.ccs r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cce.a(ccw, bwx, float, ccs, boolean, boolean):cdi");
    }
}
