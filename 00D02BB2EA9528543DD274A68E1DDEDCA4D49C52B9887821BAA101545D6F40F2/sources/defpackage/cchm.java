package defpackage;
/* compiled from: PG */
/* renamed from: cchm  reason: default package */
/* loaded from: classes.dex */
public final class cchm implements ccie {
    private final bzwd<dqwa> a;
    private final dxio<cchz> b;
    private final dxio<ckcw> c;
    private final dxio<akfa> d;

    public cchm(bzwc bzwcVar, dxio<cchz> dxioVar, dxio<ckcw> dxioVar2, dxio<akfa> dxioVar3) {
        this.a = bzwcVar.a("lg_stats", (dssr) dqwa.g.cu(7));
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
    }

    @Override // defpackage.ccie
    @dzsi
    public final synchronized dqwa a() {
        return this.a.a();
    }

    @Override // defpackage.ccie
    @dzsi
    public final ddix b() {
        dqwa a = a();
        if (a == null) {
            if (!this.d.a().c()) {
                return null;
            }
            ((ckcm) this.c.a().a(ckft.a)).a(false);
            return null;
        }
        ddiw bZ = ddix.d.bZ();
        if ((a.a & 1) != 0) {
            ddiu bZ2 = ddiv.d.bZ();
            dqvy dqvyVar = a.c;
            if (dqvyVar == null) {
                dqvyVar = dqvy.h;
            }
            if ((dqvyVar.a & 16) != 0) {
                dqvy dqvyVar2 = a.c;
                if (dqvyVar2 == null) {
                    dqvyVar2 = dqvy.h;
                }
                int i = dqvyVar2.d;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddiv ddivVar = (ddiv) bZ2.b;
                ddivVar.a |= 2;
                ddivVar.b = i;
            }
            dqvy dqvyVar3 = a.c;
            if (dqvyVar3 == null) {
                dqvyVar3 = dqvy.h;
            }
            if ((dqvyVar3.a & 256) != 0) {
                dqvy dqvyVar4 = a.c;
                if (dqvyVar4 == null) {
                    dqvyVar4 = dqvy.h;
                }
                int a2 = dqvx.a(dqvyVar4.g);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddiv ddivVar2 = (ddiv) bZ2.b;
                ddivVar2.c = a2 - 1;
                ddivVar2.a |= 4;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddix ddixVar = (ddix) bZ.b;
            ddiv bK = bZ2.bK();
            bK.getClass();
            ddixVar.c = bK;
            ddixVar.a |= 1;
        }
        for (dqvu dqvuVar : a.b) {
            ddim bZ3 = ddin.d.bZ();
            int a3 = dqvt.a(dqvuVar.b);
            if (a3 == 0) {
                a3 = 1;
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddin ddinVar = (ddin) bZ3.b;
            ddinVar.b = a3 - 1;
            int i2 = ddinVar.a | 1;
            ddinVar.a = i2;
            int i3 = dqvuVar.e;
            ddinVar.a = i2 | 2;
            ddinVar.c = i3;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddix ddixVar2 = (ddix) bZ.b;
            ddin bK2 = bZ3.bK();
            bK2.getClass();
            dsrj<ddin> dsrjVar = ddixVar2.b;
            if (!dsrjVar.a()) {
                ddixVar2.b = dsqw.cl(dsrjVar);
            }
            ddixVar2.b.add(bK2);
        }
        if (this.d.a().c()) {
            ((ckcm) this.c.a().a(ckft.a)).a(true);
        }
        return bZ.bK();
    }

    @Override // defpackage.ccie
    public final synchronized void c(btlu btluVar, @dzsi dqwa dqwaVar) {
        if (dqwaVar == null) {
            return;
        }
        this.a.b(dqwaVar);
        if (!btluVar.l() || (dqwaVar.a & 4) == 0) {
            return;
        }
        this.b.a().a(btluVar, dqwaVar.e);
    }
}
