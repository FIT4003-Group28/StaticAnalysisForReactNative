package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: akze  reason: default package */
/* loaded from: classes.dex */
public final class akze extends akzm {
    static final Interpolator a = eia.a;
    private final akzg n;
    private final akzf o;

    public akze(bvnx bvnxVar, akzh akzhVar) {
        super(bvnxVar);
        akzg akzgVar = new akzg(new akzq(), akzhVar);
        this.n = akzgVar;
        this.o = new akzf(a, akzgVar.c);
    }

    @Override // defpackage.akzm
    public final boolean a(@dzsi alad aladVar, @dzsi alad aladVar2) {
        boolean a2;
        akzg akzgVar;
        akza akzaVar;
        alad a3;
        alad a4;
        float min;
        float max;
        float a5;
        float a6;
        akra akraVar;
        float f;
        synchronized (this.l) {
            try {
                a2 = super.a(aladVar, aladVar2);
                b(a);
                akzgVar = this.n;
                dbsk.s(aladVar);
                dbsk.s(aladVar2);
                akzaVar = akzgVar.a.c;
                a3 = akzaVar.a(aladVar);
                a4 = akzaVar.a(aladVar2);
                akzgVar.f = a3;
                akzgVar.g = a4;
                akzgVar.d = akzgVar.a.C();
                akzgVar.e = akzgVar.a.z();
                min = Math.min(a3.k, a4.k);
                max = Math.max(a3.k, a4.k);
                a5 = akzgVar.a(a3.k);
                a6 = akzgVar.a(a4.k);
                akzgVar.j = Math.min(a5, a6);
                akzgVar.a.C();
                float B = akzgVar.a.B();
                float max2 = Math.max(akzgVar.e, akzgVar.a.y());
                dbsk.a(true);
                float f2 = max2 / (B * 256.0f);
                akzp akzpVar = akzgVar.b;
                akraVar = a3.j;
                f = f2 + f2;
            } catch (Throwable th) {
                th = th;
            }
            try {
                float y = akraVar.y(a4.j.Q(akraVar)) / (1.07374182E9f / ((float) Math.pow(2.0d, min)));
                float min2 = Math.min(min, akzaVar.c(min - (y > f ? bvop.d(y) - bvop.d(f) : 0.0f), a3.j));
                float a7 = akzgVar.a(min2);
                akzgVar.i = a7 - akzgVar.j;
                akzq akzqVar = akzgVar.c;
                float f3 = (a7 - a5) * 1.0E-6f;
                float f4 = (a7 - a6) * 1.0E-6f;
                dbsk.g(f3 >= 0.0f, "startValue of %s less than 0", Float.valueOf(f3));
                dbsk.g(f4 >= 0.0f, "endValue of %s less than 0", Float.valueOf(f4));
                float max3 = Math.max(f3, f4);
                if (max3 > 4.0f) {
                    f3 = (f3 * 4.0f) / max3;
                    f4 = (f4 * 4.0f) / max3;
                }
                akzqVar.a = (float) (-Math.pow(f3, 0.5d));
                akzqVar.b = (float) Math.pow(f4, 0.5d);
                akzqVar.c = Math.max(f3, f4);
                akzqVar.d = akzqVar.a(1.0f);
                akzgVar.h = (Math.min(1.0f, ((y * 0.5f) / f) + (((max - min2) * 0.5f) / 4.0f)) * 1200.0f) + 800;
                p(this.n.h);
                this.h.setEvaluator(this.n);
                s(1, true);
                s(2, true);
                s(3, true);
                s(4, true);
                s(5, false);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // defpackage.akzm
    public final void b(TimeInterpolator timeInterpolator) {
        super.b(timeInterpolator);
        this.o.a = timeInterpolator;
        synchronized (this.l) {
            this.g.setInterpolator(this.o);
        }
    }

    public final boolean c() {
        return super.r(1);
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final boolean h() {
        return true;
    }
}
