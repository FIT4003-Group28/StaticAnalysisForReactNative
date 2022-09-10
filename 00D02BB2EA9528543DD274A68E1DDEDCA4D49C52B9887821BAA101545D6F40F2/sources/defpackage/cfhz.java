package defpackage;
/* compiled from: PG */
/* renamed from: cfhz  reason: default package */
/* loaded from: classes4.dex */
public class cfhz implements cfha {
    private final dlmh a;
    private final dddi b;
    private final cfjm c;
    private boolean d = false;

    public cfhz(dddi dddiVar, dlmh dlmhVar, cfjm cfjmVar) {
        this.a = dlmhVar;
        this.b = dddiVar;
        this.c = cfjmVar;
    }

    @Override // defpackage.cfha
    public String a() {
        return this.a.b;
    }

    @Override // defpackage.cfha
    public cqkl b() {
        f(true);
        cfjm cfjmVar = this.c;
        cfga bZ = cfgd.h.bZ();
        dspd dspdVar = this.a.a;
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

    @Override // defpackage.cfha
    @dzsi
    public cqtd c() {
        int i;
        cqss cqssVar = cezw.h;
        int a = dlmg.a(this.a.c);
        if (a == 0) {
            a = 1;
        }
        switch (a - 1) {
            case 1:
                i = 2131231586;
                break;
            case 2:
                i = 2131231584;
                break;
            case 3:
                i = 2131231585;
                break;
            case 4:
                cqssVar = ibl.V();
                i = 2131231640;
                break;
            case 5:
                cqssVar = ibl.V();
                i = 2131231638;
                break;
            case 6:
                i = 2131231639;
                break;
            default:
                return null;
        }
        if (e().booleanValue()) {
            cqssVar = cezw.i;
        }
        return cqrt.g(i, cqssVar);
    }

    @Override // defpackage.cfha
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxy.nU;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.b;
        dsqp dsqpVar = (dsqp) dddiVar.cu(5);
        dsqpVar.bC(dddiVar);
        dddh dddhVar = (dddh) dsqpVar;
        dspd dspdVar = this.a.a;
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

    @Override // defpackage.cfha
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    public void f(boolean z) {
        boolean z2 = this.d;
        this.d = z;
        if (z2 != z) {
            cqkx.p(this);
        }
    }

    public dspd g() {
        return this.a.a;
    }
}
