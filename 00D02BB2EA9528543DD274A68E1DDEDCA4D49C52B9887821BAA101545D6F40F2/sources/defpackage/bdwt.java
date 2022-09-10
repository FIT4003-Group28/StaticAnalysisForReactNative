package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdwt  reason: default package */
/* loaded from: classes3.dex */
public class bdwt implements bnhy {
    private final izl a;
    private final bdwr b;
    private final blxc c;
    private final Executor d;
    @dzsi
    private final bfch e;
    @dzsi
    private final bfch f;
    @dzsi
    private final bfvv g;
    @dzsi
    private final bhjf h;
    @dzsi
    private final bmll i;
    private boolean j;
    private boolean k;
    @dzsi
    private bfat l;
    private final crzp<bdwr> m = new bdws(this);

    public bdwt(cqhn cqhnVar, bdwr bdwrVar, Executor executor, izl izlVar, blxc blxcVar, @dzsi bfch bfchVar, @dzsi bfch bfchVar2, @dzsi bfvv bfvvVar, @dzsi bhjf bhjfVar, @dzsi bkgw bkgwVar, @dzsi bmll bmllVar) {
        this.b = bdwrVar;
        this.d = executor;
        this.a = izlVar;
        this.c = blxcVar;
        this.f = bfchVar;
        this.e = bfchVar2;
        this.g = bfvvVar;
        this.h = bhjfVar;
        this.i = bmllVar;
    }

    private final boolean j() {
        bkgv f = f();
        return f != null && Boolean.TRUE.equals(f.b());
    }

    @Deprecated
    private final boolean k() {
        bmll bmllVar;
        if (!this.j) {
            return (!this.k || (bmllVar = this.i) == null || bmllVar.f() == bege.OVERVIEW) && this.a.y().booleanValue();
        }
        return true;
    }

    private final boolean l() {
        bfvq i = i();
        return i != null && i.a().booleanValue();
    }

    public void a(boolean z, boolean z2, bfat bfatVar) {
        this.j = z;
        this.k = z2;
        this.l = bfatVar;
    }

    public void b() {
        this.b.a().a(this.m, this.d);
    }

    public void c() {
        this.b.a().c(this.m);
    }

    public void d() {
        cqkx.p(g());
        if (h() != null) {
            bmxw h = h();
            dbsk.s(h);
            cqkx.p(h);
        }
        if (f() != null) {
            bkgv f = f();
            dbsk.s(f);
            cqkx.p(f);
        }
        if (i() != null) {
            bfvq i = i();
            dbsk.s(i);
            cqkx.p(i);
        }
    }

    @Override // defpackage.bnhy
    @dzsi
    public bkgv f() {
        return null;
    }

    @Override // defpackage.bnhy
    public blwp g() {
        return this.c;
    }

    @Override // defpackage.bnhy
    @dzsi
    public bmxw h() {
        return this.h;
    }

    @Override // defpackage.bnhy
    @dzsi
    public bfvq i() {
        return this.g;
    }

    @Override // defpackage.bnhy
    public Boolean e(int i) {
        bfch bfchVar;
        bfat bfatVar;
        blwp g;
        bfch bfchVar2 = this.e;
        boolean z = false;
        if ((bfchVar2 == null || !bfchVar2.i().booleanValue()) && (((bfchVar = this.f) == null || !bfchVar.i().booleanValue()) && ((bfatVar = this.l) == null || !bfatVar.h().booleanValue()))) {
            if (i == 2) {
                return Boolean.valueOf(j());
            }
            if (j()) {
                return false;
            }
            if (i == 0) {
                return Boolean.valueOf(k());
            }
            if (!k() || (g = g()) == null || !g.aa().booleanValue()) {
                bmxw h = h();
                if (i == 1) {
                    if (h != null) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } else if (h != null && h.b().booleanValue()) {
                    return false;
                } else {
                    if (i == 3) {
                        return Boolean.valueOf(l());
                    }
                    if (l()) {
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
