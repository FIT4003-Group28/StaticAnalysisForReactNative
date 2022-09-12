package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: bon  reason: default package */
/* loaded from: classes3.dex */
final class bon {
    private static ain<WeakReference<Interpolator>> c;
    private static final Interpolator b = new LinearInterpolator();
    static final bph a = bph.a("t", "s", "e", "o", "i", "h", "to", "ti");

    bon() {
    }

    private static <T> bpt<T> b(bis bisVar, bpj bpjVar, float f, bpe<T> bpeVar) {
        Interpolator interpolator;
        WeakReference<Interpolator> b2;
        bpjVar.f();
        Interpolator interpolator2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (bpjVar.h()) {
            switch (bpjVar.j(a)) {
                case 0:
                    f2 = (float) bpjVar.n();
                    break;
                case 1:
                    t = bpeVar.a(bpjVar, f);
                    break;
                case 2:
                    t2 = bpeVar.a(bpjVar, f);
                    break;
                case 3:
                    pointF = bom.c(bpjVar, f);
                    break;
                case 4:
                    pointF2 = bom.c(bpjVar, f);
                    break;
                case 5:
                    if (bpjVar.o() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF4 = bom.c(bpjVar, f);
                    break;
                case 7:
                    pointF3 = bom.c(bpjVar, f);
                    break;
                default:
                    bpjVar.p();
                    break;
            }
        }
        bpjVar.g();
        if (z) {
            interpolator = b;
            t2 = t;
        } else if (pointF != null && pointF2 != null) {
            float f3 = -f;
            pointF.x = bpr.g(pointF.x, f3, f);
            pointF.y = bpr.g(pointF.y, -100.0f, 100.0f);
            pointF2.x = bpr.g(pointF2.x, f3, f);
            pointF2.y = bpr.g(pointF2.y, -100.0f, 100.0f);
            int f4 = bps.f(pointF.x, pointF.y, pointF2.x, pointF2.y);
            synchronized (bon.class) {
                if (c == null) {
                    c = new ain<>();
                }
                b2 = c.b(f4);
            }
            if (b2 != null) {
                interpolator2 = b2.get();
            }
            if (b2 == null || interpolator2 == null) {
                interpolator2 = pq.a(pointF.x / f, pointF.y / f, pointF2.x / f, pointF2.y / f);
                try {
                    WeakReference<Interpolator> weakReference = new WeakReference<>(interpolator2);
                    synchronized (bon.class) {
                        c.e(f4, weakReference);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            interpolator = interpolator2;
        } else {
            interpolator = b;
        }
        bpt<T> bptVar = new bpt<>(bisVar, t, t2, interpolator, f2, null);
        bptVar.k = pointF4;
        bptVar.l = pointF3;
        return bptVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> bpt<T> a(bpj bpjVar, bis bisVar, float f, bpe<T> bpeVar, boolean z) {
        if (!z) {
            return new bpt<>(bpeVar.a(bpjVar, f));
        }
        return b(bisVar, bpjVar, f, bpeVar);
    }
}
