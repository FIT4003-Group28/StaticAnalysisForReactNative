package defpackage;
/* compiled from: PG */
/* renamed from: auuk  reason: default package */
/* loaded from: classes.dex */
public final class auuk extends auje {
    private final dxio<bypr> c;
    private final dxio<bypq> d;
    private final dxio<byps> e;
    private final dxio<aujo> f;
    private final dxio<ckcw> g;
    private final bvjj h;

    public auuk(dxio<bypr> dxioVar, dxio<bypq> dxioVar2, dxio<byps> dxioVar3, dxio<aujo> dxioVar4, dxio<ckcw> dxioVar5, bvjj bvjjVar) {
        super(aujd.d(dpyv.AREA_TRAFFIC.dm).a());
        this.c = dxioVar;
        this.f = dxioVar4;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.g = dxioVar5;
        this.h = bvjjVar;
    }

    @Override // defpackage.auje, defpackage.aujb
    public final boolean g(btvo btvoVar) {
        dkql dkqlVar = btvoVar.getNotificationsParameters().j;
        if (dkqlVar == null) {
            dkqlVar = dkql.k;
        }
        return this.c.a().a(dkqlVar);
    }

    @Override // defpackage.aujb
    public final void i(btvo btvoVar, boolean z) {
        if (z && e(btvoVar)) {
            this.d.a().b(bypp.NOTIFICATION_TOGGLED_ON);
            ddos l = l(btvoVar);
            if (l != null) {
                this.f.a().c(l);
            }
        }
        this.d.a().a();
        this.e.a().a();
        this.h.S(bvjk.cY, z);
    }

    @Override // defpackage.aujb
    public final auil j() {
        return null;
    }

    @Override // defpackage.aujb
    public final boolean r(dlfv dlfvVar, btlu btluVar) {
        dlef dlefVar;
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        if (dlgnVar.c == 17) {
            bypq a = this.d.a();
            if (dlgnVar.c == 17) {
                dlefVar = (dlef) dlgnVar.d;
            } else {
                dlefVar = dlef.c;
            }
            int h = a.h(dlefVar);
            if (h == 1) {
                return false;
            }
            ckco ckcoVar = (ckco) this.g.a().a(ckht.V);
            if (h == 0) {
                throw null;
            }
            ckcoVar.a(h - 1);
            return true;
        }
        return false;
    }

    @Override // defpackage.auje
    public final dkhd y(btvo btvoVar) {
        dkql dkqlVar = btvoVar.getNotificationsParameters().j;
        if (dkqlVar == null) {
            dkqlVar = dkql.k;
        }
        dkhd dkhdVar = dkqlVar.a;
        return dkhdVar == null ? dkhd.h : dkhdVar;
    }

    @Override // defpackage.auje
    public final auik z(dkpm dkpmVar) {
        ddos ddosVar = ddos.AREA_TRAFFIC;
        dkpi dkpiVar = dkpmVar.c;
        if (dkpiVar == null) {
            dkpiVar = dkpi.i;
        }
        return auik.c(ddosVar, dkpiVar);
    }
}
