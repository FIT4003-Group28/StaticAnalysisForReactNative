package defpackage;
/* compiled from: PG */
/* renamed from: cfog  reason: default package */
/* loaded from: classes4.dex */
public class cfog implements cfnv {
    public final dieh a;
    private final dddi b;
    private final mw<dspd> c;
    private boolean d = false;

    public cfog(dddi dddiVar, dieh diehVar, mw<dspd> mwVar) {
        this.a = diehVar;
        this.b = dddiVar;
        this.c = mwVar;
    }

    @Override // defpackage.cfnv
    public String a() {
        return this.a.b;
    }

    @Override // defpackage.cfnv
    public cqkl b() {
        f(true);
        this.c.a(this.a.a);
        return cqkl.a;
    }

    @Override // defpackage.cfnv
    @dzsi
    public cqtd c() {
        int i;
        cqss cqssVar = cezw.h;
        int a = dieg.a(this.a.c);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            i = 2131231586;
        } else if (i2 == 2) {
            i = 2131231584;
        } else if (i2 != 3) {
            return null;
        } else {
            i = 2131231585;
        }
        if (e().booleanValue()) {
            cqssVar = cezw.i;
        }
        return cqrt.g(i, cqssVar);
    }

    @Override // defpackage.cfnv
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

    @Override // defpackage.cfnv
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z) {
        boolean z2 = this.d;
        this.d = z;
        if (z2 != z) {
            cqkx.p(this);
        }
    }
}
