package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: nps  reason: default package */
/* loaded from: classes7.dex */
public final class nps implements cqtv, cqtu {
    private nse a;
    private final npr b;

    public nps(npr nprVar, cqtv cqtvVar) {
        dbsk.s(nprVar);
        this.b = nprVar;
        dbsk.s(cqtvVar);
        this.a = new nse(cqtvVar, 0, null);
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return (int) a(context);
    }

    public final void c(cqtv cqtvVar, int i) {
        dbsk.s(cqtvVar);
        this.a = new nse(cqtvVar, i, this.a);
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
        if (!(obj instanceof nps)) {
            return false;
        }
        nps npsVar = (nps) obj;
        if (npsVar.b != this.b) {
            return false;
        }
        nse nseVar = this.a;
        if (nseVar != null) {
            return nseVar.a(npsVar.a);
        }
        return npsVar.a == null;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        nse nseVar = this.a;
        return nseVar == null ? hashCode : (hashCode * 31) + nseVar.hashCode();
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        float a;
        float a2 = (this.b == npr.WIDTH ? cqsz.c() : cqsz.d()).a(context);
        nse nseVar = this.a;
        do {
            float a3 = nseVar.b.a(context);
            a = nseVar.a.a(context);
            if (a2 >= a3) {
                return a;
            }
            nseVar = nseVar.c;
        } while (nseVar != null);
        return a;
    }
}
