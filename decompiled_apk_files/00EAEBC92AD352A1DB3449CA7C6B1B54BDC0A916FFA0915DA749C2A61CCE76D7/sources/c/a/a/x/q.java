package c.a.a.x;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import c.a.a.x.k0.c;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
class q {

    /* renamed from: b  reason: collision with root package name */
    private static a.e.h<WeakReference<Interpolator>> f2670b;

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f2669a = new LinearInterpolator();

    /* renamed from: c  reason: collision with root package name */
    static c.a f2671c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    q() {
    }

    private static a.e.h<WeakReference<Interpolator>> a() {
        if (f2670b == null) {
            f2670b = new a.e.h<>();
        }
        return f2670b;
    }

    private static <T> c.a.a.z.a<T> a(c.a.a.e eVar, c.a.a.x.k0.c cVar, float f2, j0<T> j0Var) {
        Interpolator interpolator;
        T t;
        cVar.b();
        Interpolator interpolator2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f3 = 0.0f;
        while (cVar.f()) {
            switch (cVar.a(f2671c)) {
                case 0:
                    f3 = (float) cVar.h();
                    break;
                case 1:
                    t3 = j0Var.mo113a(cVar, f2);
                    break;
                case 2:
                    t2 = j0Var.mo113a(cVar, f2);
                    break;
                case 3:
                    pointF = p.d(cVar, f2);
                    break;
                case 4:
                    pointF2 = p.d(cVar, f2);
                    break;
                case 5:
                    if (cVar.i() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = p.d(cVar, f2);
                    break;
                case 7:
                    pointF4 = p.d(cVar, f2);
                    break;
                default:
                    cVar.C();
                    break;
            }
        }
        cVar.d();
        if (z) {
            interpolator = f2669a;
            t = t3;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator = f2669a;
            } else {
                float f4 = -f2;
                pointF.x = c.a.a.y.g.a(pointF.x, f4, f2);
                pointF.y = c.a.a.y.g.a(pointF.y, -100.0f, 100.0f);
                pointF2.x = c.a.a.y.g.a(pointF2.x, f4, f2);
                pointF2.y = c.a.a.y.g.a(pointF2.y, -100.0f, 100.0f);
                int a2 = c.a.a.y.h.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
                WeakReference<Interpolator> a3 = a(a2);
                if (a3 != null) {
                    interpolator2 = a3.get();
                }
                if (a3 == null || interpolator2 == null) {
                    interpolator2 = a.g.m.f0.b.a(pointF.x / f2, pointF.y / f2, pointF2.x / f2, pointF2.y / f2);
                    try {
                        a(a2, new WeakReference(interpolator2));
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
                interpolator = interpolator2;
            }
            t = t2;
        }
        c.a.a.z.a<T> aVar = new c.a.a.z.a<>(eVar, t3, t, interpolator, f3, null);
        aVar.m = pointF3;
        aVar.n = pointF4;
        return aVar;
    }

    private static <T> c.a.a.z.a<T> a(c.a.a.x.k0.c cVar, float f2, j0<T> j0Var) {
        return new c.a.a.z.a<>(j0Var.mo113a(cVar, f2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> c.a.a.z.a<T> a(c.a.a.x.k0.c cVar, c.a.a.e eVar, float f2, j0<T> j0Var, boolean z) {
        return z ? a(eVar, cVar, f2, j0Var) : a(cVar, f2, j0Var);
    }

    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> a2;
        synchronized (q.class) {
            a2 = a().a(i);
        }
        return a2;
    }

    private static void a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (q.class) {
            f2670b.c(i, weakReference);
        }
    }
}
