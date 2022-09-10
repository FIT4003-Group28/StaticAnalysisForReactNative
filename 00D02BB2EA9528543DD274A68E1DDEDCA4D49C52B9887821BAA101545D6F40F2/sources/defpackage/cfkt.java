package defpackage;
/* compiled from: PG */
/* renamed from: cfkt  reason: default package */
/* loaded from: classes4.dex */
public class cfkt implements cfhl {
    private final dlng a;
    private final dddi b;
    private final cfjm c;
    private final cezu d;
    private boolean e;

    public cfkt(dddi dddiVar, dlng dlngVar, cfjm cfjmVar, cezu cezuVar) {
        this.a = dlngVar;
        this.b = dddiVar;
        this.c = cfjmVar;
        this.d = cezuVar;
    }

    @Override // defpackage.cfhl
    public String a() {
        return this.a.c;
    }

    @Override // defpackage.cfhl
    public String b() {
        return this.a.d;
    }

    @Override // defpackage.cfhl
    public cqkl c() {
        g(true);
        cfjm cfjmVar = this.c;
        cfga bZ = cfgd.h.bZ();
        dspd dspdVar = this.a.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cfgd cfgdVar = (cfgd) bZ.b;
        dspdVar.getClass();
        cfgdVar.a = 1 | cfgdVar.a;
        cfgdVar.b = dspdVar;
        cfjmVar.a(bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.cfhl
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxy.oj;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.b;
        dsqp dsqpVar = (dsqp) dddiVar.cu(5);
        dsqpVar.bC(dddiVar);
        dddh dddhVar = (dddh) dsqpVar;
        dspd dspdVar = this.a.b;
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

    @Override // defpackage.cfhl
    @dzsi
    public cqtd e() {
        dlng dlngVar = this.a;
        if ((dlngVar.a & 8) != 0) {
            return this.d.f(dlngVar.e);
        }
        return null;
    }

    @Override // defpackage.cfhl
    public Boolean f() {
        return Boolean.valueOf(this.e);
    }

    public void g(boolean z) {
        boolean z2 = this.e;
        this.e = z;
        if (z2 != z) {
            cqkx.p(this);
        }
    }

    public dspd h() {
        return this.a.b;
    }
}
