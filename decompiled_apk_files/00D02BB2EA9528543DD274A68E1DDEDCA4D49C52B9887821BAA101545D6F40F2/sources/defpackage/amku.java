package defpackage;

import android.graphics.RectF;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: amku  reason: default package */
/* loaded from: classes2.dex */
public final class amku {
    private static final dcqe l = dcqe.c("amku");
    public final alxo a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public dmlo g;
    public float h;
    public float i;
    public RectF j;
    public amkz k = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
    private final boolean m;

    public amku(float f, float f2, float f3, float f4, dmlo dmloVar, alxo alxoVar, float f5, boolean z) {
        this.a = alxoVar;
        this.c = f;
        this.d = f2;
        this.e = f3 / 2.0f;
        this.f = f4 / 2.0f;
        this.b = f5;
        this.j = a(alxoVar, dmloVar, f5);
        this.m = z;
        j(dmloVar);
        this.g = dmloVar;
        this.h = h(this.j);
        this.i = i(this.j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static RectF a(alxo alxoVar, dmlo dmloVar, float f) {
        float i;
        alyd alydVar = alxoVar.r;
        float f2 = 0.0f;
        if (alydVar == null) {
            bvoo.h("Styles for GLCalloutLabels should have a TextBoxStyle.", new Object[0]);
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float g = alydVar.g() + alydVar.t();
        float h = alydVar.h() + alydVar.u();
        float g2 = alydVar.g() + alydVar.v();
        float h2 = alydVar.h() + alydVar.w();
        dmlo dmloVar2 = dmlo.CENTER;
        switch (dmloVar.ordinal()) {
            case 0:
                f2 = g;
                break;
            case 1:
                i = g2 + alydVar.i();
                g2 = i;
                f2 = g;
                break;
            case 2:
                f2 = g + alydVar.i();
                break;
            case 3:
                h2 += alydVar.i();
                f2 = g;
                break;
            case 4:
                i = g2 + alydVar.k();
                h2 = alydVar.k() + h2;
                g2 = i;
                f2 = g;
                break;
            case 5:
                f2 = g + alydVar.k();
                h2 = alydVar.k() + h2;
                break;
            case 6:
                h += alydVar.i();
                f2 = g;
                break;
            case 7:
                i = g2 + alydVar.k();
                h = alydVar.k() + h;
                g2 = i;
                f2 = g;
                break;
            case 8:
                f2 = g + alydVar.k();
                h = alydVar.k() + h;
                break;
            default:
                bvoo.h("Anchor position is not supported.", new Object[0]);
                h = 0.0f;
                g2 = 0.0f;
                h2 = 0.0f;
                break;
        }
        return new RectF(anaf.a(f, f2), anaf.a(f, h), anaf.a(f, g2), anaf.a(f, h2));
    }

    private final int g(float f) {
        return Math.round(this.b * f);
    }

    private final float h(RectF rectF) {
        return ((((this.c + rectF.left) + rectF.right) + c(this.a)) - this.e) - this.f;
    }

    private final float i(RectF rectF) {
        return this.d + rectF.top + rectF.bottom;
    }

    public final void b(dmlo dmloVar) {
        j(dmloVar);
        if (dmloVar != this.g) {
            this.g = dmloVar;
            RectF a = a(this.a, dmloVar, this.b);
            this.j = a;
            this.h = h(a);
            this.i = i(this.j);
        }
    }

    public final float c(@dzsi alxo alxoVar) {
        if (alxoVar == null || !alxoVar.c() || alxoVar.r.p() != 3) {
            return 0.0f;
        }
        return this.d;
    }

    public final void d(float f, float f2, float f3, dmlo dmloVar, RectF rectF, amkz amkzVar) {
        akse akseVar = new akse();
        f(f, f2, f3, dmloVar, rectF, akseVar);
        float h = h(rectF);
        float i = i(rectF);
        float f4 = akseVar.b;
        float f5 = (h / 2.0f) * f3;
        float f6 = akseVar.c;
        float f7 = (i / 2.0f) * f3;
        amkzVar.a(f4 - f5, f6 - f7, f4 + f5, f6 + f7);
    }

    public final void e(float f, float f2, amkz amkzVar) {
        d(f, f2, 1.0f, this.g, this.j, amkzVar);
    }

    public final void f(float f, float f2, float f3, dmlo dmloVar, RectF rectF, akse akseVar) {
        int g;
        int g2;
        float f4;
        int g3;
        float f5;
        int g4;
        float h = h(rectF);
        float i = i(rectF);
        float f6 = 0.0f;
        if (!this.a.c()) {
            bvoo.h("Styles for CalloutGeometries should have a TextBoxStyle.", new Object[0]);
        } else {
            alyd alydVar = this.a.r;
            dmlo dmloVar2 = dmlo.CENTER;
            switch (dmloVar.ordinal()) {
                case 1:
                    f6 = g(alydVar.v()) - (h / 2.0f);
                    g = g(alydVar.w());
                    g2 = g(alydVar.u());
                    f4 = (g - g2) / 2.0f;
                    break;
                case 2:
                    f6 = (h / 2.0f) - g(alydVar.t());
                    g = g(alydVar.w());
                    g2 = g(alydVar.u());
                    f4 = (g - g2) / 2.0f;
                    break;
                case 3:
                    f6 = (g(alydVar.v()) - g(alydVar.t())) / 2.0f;
                    g3 = g(alydVar.w());
                    f4 = g3 - (i / 2.0f);
                    break;
                case 4:
                    f6 = g(alydVar.v()) - (h / 2.0f);
                    g3 = g(alydVar.w());
                    f4 = g3 - (i / 2.0f);
                    break;
                case 5:
                    f6 = (h / 2.0f) - g(alydVar.t());
                    g3 = g(alydVar.w());
                    f4 = g3 - (i / 2.0f);
                    break;
                case 6:
                    f6 = (g(alydVar.v()) - g(alydVar.t())) / 2.0f;
                    f5 = i / 2.0f;
                    g4 = g(alydVar.u());
                    f4 = f5 - g4;
                    break;
                case 7:
                    f6 = g(alydVar.v()) - (h / 2.0f);
                    f5 = i / 2.0f;
                    g4 = g(alydVar.u());
                    f4 = f5 - g4;
                    break;
                case 8:
                    f6 = (h / 2.0f) - g(alydVar.t());
                    f5 = i / 2.0f;
                    g4 = g(alydVar.u());
                    f4 = f5 - g4;
                    break;
                default:
                    bvoo.h("Anchor position is not supported.", new Object[0]);
                    break;
            }
            akseVar.r(f6, f4);
            akseVar.q(f3);
            akseVar.b += f;
            akseVar.c += f2;
        }
        f4 = 0.0f;
        akseVar.r(f6, f4);
        akseVar.q(f3);
        akseVar.b += f;
        akseVar.c += f2;
    }

    private final void j(dmlo dmloVar) {
        Collection collection;
        if (!this.m) {
            return;
        }
        alxo alxoVar = this.a;
        if (alxoVar == null || !alxoVar.c()) {
            collection = dcmr.a;
        } else {
            collection = dcep.K(this.a.r.m());
        }
        if (collection.contains(dmloVar)) {
            return;
        }
        bvoo.h("The requested anchor position is not supported.", new Object[0]);
    }
}
