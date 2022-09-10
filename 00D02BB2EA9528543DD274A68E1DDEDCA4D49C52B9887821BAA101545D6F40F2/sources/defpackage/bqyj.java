package defpackage;
/* compiled from: PG */
/* renamed from: bqyj  reason: default package */
/* loaded from: classes4.dex */
public final class bqyj implements amcl {
    private static final dcqe a = dcqe.c("bqyj");
    private final btnc<alyh, bqxq> b = new bqyi();

    public bqyj(long j) {
    }

    @dzsi
    private final synchronized bqxq b(alyh alyhVar, boolean z) {
        bqxq a2 = this.b.a(alyhVar);
        if (a2 != null) {
            return a2;
        }
        alyh alyhVar2 = new alyh(alyhVar.a - 1, alyhVar.b >>> 1, alyhVar.c >>> 1);
        while (a2 == null) {
            if (alyhVar2.a < 0) {
                break;
            }
            a2 = z ? this.b.a(alyhVar2) : this.b.n(alyhVar2);
            alyhVar2 = new alyh(alyhVar2.a - 1, alyhVar2.b >>> 1, alyhVar2.c >>> 1);
        }
        return a2;
    }

    @dzsi
    public final synchronized bqyo a(dmzp dmzpVar, int i) {
        dmzv dmzvVar = dmzpVar.a;
        if (dmzvVar == null) {
            dmzvVar = dmzv.c;
        }
        alyh alyhVar = new alyh(i, dmzvVar.a, dmzvVar.b);
        bqxq bqxqVar = null;
        while (bqxqVar == null && alyhVar.a >= 0) {
            bqxqVar = this.b.a(alyhVar);
            int i2 = alyhVar.b;
            int i3 = alyhVar.c;
            if (((i2 | i3) & 1) == 1) {
                break;
            }
            alyhVar = new alyh(alyhVar.a - 1, i2 >>> 1, i3 >>> 1);
        }
        if (bqxqVar == null) {
            return null;
        }
        int i4 = dmzpVar.b;
        if (i4 >= bqxqVar.b.size()) {
            return null;
        }
        return bqxqVar.b.get(i4);
    }

    @Override // defpackage.amcl
    public final boolean m(alyh alyhVar) {
        return b(alyhVar, false) != null;
    }

    @Override // defpackage.amcl
    @dzsi
    public final /* bridge */ /* synthetic */ alyg n(alyh alyhVar) {
        return b(alyhVar, true);
    }

    @Override // defpackage.amcl
    public final void o(alyh alyhVar, alyg alygVar) {
        if (!(alygVar instanceof bqxq)) {
            return;
        }
        alyh a2 = alygVar.a();
        int i = alyhVar.a - a2.a;
        if (i < 0) {
            bvoo.h("zoomDiff: %s", Integer.valueOf(i));
            return;
        }
        int i2 = a2.b;
        int i3 = i2 << i;
        int i4 = (i2 + 1) << i;
        int i5 = a2.c;
        int i6 = i5 << i;
        int i7 = (i5 + 1) << i;
        int i8 = alyhVar.b;
        if (i8 < i3 || i8 >= i4) {
            bvoo.h("Request X of %s not within bounds of [%s,%s)", Integer.valueOf(alyhVar.b), Integer.valueOf(i3), Integer.valueOf(i4));
            return;
        }
        int i9 = alyhVar.c;
        if (i9 < i6 || i9 >= i7) {
            bvoo.h("Request Y of %s not within bounds of [%s,%s)", Integer.valueOf(alyhVar.c), Integer.valueOf(i6), Integer.valueOf(i7));
            return;
        }
        synchronized (this) {
            this.b.Pz(alygVar.a(), (bqxq) alygVar);
        }
    }

    @Override // defpackage.amcl
    public final void p(alyh alyhVar) {
    }

    @Override // defpackage.amcl
    public final boolean q(alyg alygVar) {
        return false;
    }

    @Override // defpackage.amcl
    public final synchronized void r() {
        this.b.e();
    }
}
