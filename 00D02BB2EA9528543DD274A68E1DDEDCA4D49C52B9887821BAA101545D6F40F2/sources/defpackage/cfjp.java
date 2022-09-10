package defpackage;
/* compiled from: PG */
/* renamed from: cfjp  reason: default package */
/* loaded from: classes4.dex */
class cfjp extends cfhz {
    public final cqhn a;
    public boolean b;
    private final dxio<akzh> c;
    private final dlmh d;
    private final dddi e;
    private final cfjm f;

    public cfjp(cqhn cqhnVar, dxio<akzh> dxioVar, dddi dddiVar, dlmh dlmhVar, cfjm cfjmVar, boolean z) {
        super(dddiVar, dlmhVar, cfjmVar);
        this.d = dlmhVar;
        this.c = dxioVar;
        this.e = dddiVar;
        this.a = cqhnVar;
        this.f = cfjmVar;
        this.b = z;
    }

    @Override // defpackage.cfhz, defpackage.cfha
    public cqkl b() {
        if (this.b) {
            f(true);
            cfjm cfjmVar = this.f;
            cfga bZ = cfgd.h.bZ();
            dspd dspdVar = this.d.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cfgd cfgdVar = (cfgd) bZ.b;
            dspdVar.getClass();
            cfgdVar.a = 1 | cfgdVar.a;
            cfgdVar.b = dspdVar;
            dpum h = this.c.a().p().i.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cfgd cfgdVar2 = (cfgd) bZ.b;
            h.getClass();
            cfgdVar2.e = h;
            cfgdVar2.a |= 4;
            cfjmVar.a(bZ.bK());
        }
        return cqkl.a;
    }

    @Override // defpackage.cfhz, defpackage.cfha
    @dzsi
    public cqtd c() {
        cqtd c = super.c();
        if (c == null) {
            return null;
        }
        return cqrt.i(c, this.b ? cezw.g : cezw.j);
    }

    @Override // defpackage.cfhz, defpackage.cfha
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxy.oa;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.e;
        dsqp dsqpVar = (dsqp) dddiVar.cu(5);
        dsqpVar.bC(dddiVar);
        dddh dddhVar = (dddh) dsqpVar;
        dspd dspdVar = this.d.a;
        if (dddhVar.c) {
            dddhVar.bF();
            dddhVar.c = false;
        }
        dddi dddiVar2 = (dddi) dddhVar.b;
        dspdVar.getClass();
        dddiVar2.a |= 2;
        dddiVar2.c = dspdVar;
        dddi bK = dddhVar.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        bK.getClass();
        dddgVar.d = bK;
        dddgVar.a |= 32;
        b.j(bZ.bK());
        return b.a();
    }
}
