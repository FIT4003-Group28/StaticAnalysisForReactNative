package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: nsg  reason: default package */
/* loaded from: classes7.dex */
public final class nsg implements cqtv, cqtu {
    private final nsf a;
    private nse b;

    public nsg(nsf nsfVar, cqtv cqtvVar, int i) {
        dbsk.s(nsfVar);
        this.a = nsfVar;
        this.b = new nse(cqtvVar, i, null);
    }

    public static cqtv c(int i, int i2) {
        nsg nsgVar = new nsg(nsf.HEIGHT_CONSTRAINED, cqrp.d(i), 370);
        nsgVar.g(cqrp.d(i2), 400);
        return nsgVar;
    }

    public static cqtv d(int i, int i2, int i3) {
        nsg nsgVar = new nsg(nsf.HEIGHT_CONSTRAINED, cqrp.d(i), 370);
        nsgVar.g(cqrp.d(i2), 400);
        nsgVar.g(cqrp.d(i3), 445);
        return nsgVar;
    }

    public static cqtv f(int i, int i2) {
        nsg nsgVar = new nsg(nsf.HEIGHT_CONSTRAINED, cqrp.d(i), 400);
        nsgVar.g(cqrp.d(i2), 445);
        return nsgVar;
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return (int) a(context);
    }

    @Override // defpackage.cqtv
    public final int e(Context context) {
        float a = a(context);
        int i = (int) (0.5f + a);
        if (i != 0) {
            return i;
        }
        if (a == 0.0f) {
            return 0;
        }
        return a > 0.0f ? 1 : -1;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof nsg)) {
            return false;
        }
        nsg nsgVar = (nsg) obj;
        if (nsgVar.a != this.a) {
            return false;
        }
        nse nseVar = this.b;
        if (nseVar != null) {
            return nseVar.a(nsgVar.b);
        }
        return nsgVar.b == null;
    }

    public final void g(cqtv cqtvVar, int i) {
        this.b = new nse(cqtvVar, i, this.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        nse nseVar = this.b;
        return nseVar == null ? hashCode : (hashCode * 31) + nseVar.hashCode();
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        float a = ((this.a == nsf.WIDTH_EXTENSIBLE || this.a == nsf.WIDTH_CONSTRAINED) ? cqsz.c() : cqsz.d()).a(context);
        nse nseVar = this.b;
        float a2 = nseVar.b.a(context);
        float a3 = nseVar.a.a(context);
        if (a != a2 && (a <= a2 || (this.a != nsf.HEIGHT_CONSTRAINED && this.a != nsf.WIDTH_CONSTRAINED))) {
            while (true) {
                nseVar = nseVar.c;
                if (nseVar == null) {
                    break;
                }
                float a4 = nseVar.a.a(context);
                float a5 = nseVar.b.a(context);
                if (a == a5) {
                    return a4;
                }
                if (a > a5) {
                    return a4 + (((a3 - a4) / (a2 - a5)) * (a - a5));
                }
                a3 = a4;
                a2 = a5;
            }
        }
        return a3;
    }
}
