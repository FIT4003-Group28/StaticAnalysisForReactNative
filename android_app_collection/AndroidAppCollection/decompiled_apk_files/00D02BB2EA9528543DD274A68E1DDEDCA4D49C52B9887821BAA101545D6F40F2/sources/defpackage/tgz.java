package defpackage;
/* compiled from: PG */
/* renamed from: tgz  reason: default package */
/* loaded from: classes7.dex */
public final class tgz implements tgf {
    private final dxio<bvjj> a;
    private final dxio<akpm> b;
    private final dxio<vxa> c;
    private final dxio<toh> d;
    private final dxio<tnv> e;
    private final dxio<tia> f;
    private final dxio<akfa> g;
    private final crzb h;

    public tgz(dxio<bvjj> dxioVar, dxio<akpm> dxioVar2, dxio<vxa> dxioVar3, dxio<toh> dxioVar4, dxio<tnv> dxioVar5, dxio<tia> dxioVar6, dxio<akfa> dxioVar7, crzb crzbVar) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.f = dxioVar6;
        this.g = dxioVar7;
        this.h = crzbVar;
    }

    private final void c(vum vumVar, dbsg<dhjx> dbsgVar) {
        vumVar.g = bvsl.a(this.a.a());
        vumVar.p = false;
        if (dbsgVar.a()) {
            vumVar.e = dbsgVar.b();
        }
    }

    @Override // defpackage.tgf
    public final vun a(dcdc<amvh> dcdcVar, dbsg<dnqh> dbsgVar, dbsg<dpaz> dbsgVar2, dbsg<dhjx> dbsgVar3) {
        dwao bK;
        vum vumVar = new vum();
        c(vumVar, dbsgVar3);
        vumVar.c(dcdcVar);
        btlu j = this.g.a().j();
        if (j == null) {
            j = btlu.b;
        }
        dwao b = this.c.a().b(dqvj.MIXED, 1, vul.DIRECTIONS_UI);
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        dwal dwalVar = (dwal) dsqpVar;
        this.f.a().a(dwalVar, (tog) deha.s(this.d.a().a(j).j()));
        dbsg<dqvj> c = this.e.a().c(j);
        if (c.a()) {
            bK = tia.b(dwalVar.bK(), c.b());
        } else {
            bK = dwalVar.bK();
        }
        vumVar.a = bK;
        if (dbsgVar.a()) {
            vumVar.o = dbsgVar.b();
        }
        if (dbsgVar2.a()) {
            vumVar.s = dbsgVar2.b();
        }
        return vumVar.a();
    }

    @Override // defpackage.tgf
    public final void b(vum vumVar) {
        this.h.a();
        c(vumVar, dbsg.j(this.b.a().aa()));
    }
}
