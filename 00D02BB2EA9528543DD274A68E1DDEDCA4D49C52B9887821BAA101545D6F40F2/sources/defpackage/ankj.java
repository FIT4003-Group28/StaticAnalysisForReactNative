package defpackage;
/* compiled from: PG */
/* renamed from: ankj  reason: default package */
/* loaded from: classes.dex */
public final class ankj implements anhk {
    private final btrm b;
    private dnwb a = dnwb.i;
    @dzsi
    private btlu c = btlu.a;

    public ankj(btrm btrmVar) {
        this.b = btrmVar;
    }

    @Override // defpackage.anhk
    public final synchronized dnwb a() {
        return this.a;
    }

    @Override // defpackage.anhk
    public final synchronized void b(dnwb dnwbVar, dnwb dnwbVar2) {
        dcep K = dcep.K(this.a.h);
        dcep K2 = dcep.K(dnwbVar.h);
        dcen dcenVar = new dcen();
        dcenVar.i(dcnm.p(K, K2));
        dcenVar.i(dnwbVar2.h);
        dcep f = dcenVar.f();
        dnwb dnwbVar3 = this.a;
        dsqp dsqpVar = (dsqp) dnwbVar3.cu(5);
        dsqpVar.bC(dnwbVar3);
        dnvy dnvyVar = (dnvy) dsqpVar;
        if (dnvyVar.c) {
            dnvyVar.bF();
            dnvyVar.c = false;
        }
        ((dnwb) dnvyVar.b).h = dnwb.ck();
        dnwb bK = dnvyVar.bK();
        dnwb dnwbVar4 = this.a;
        dsqp dsqpVar2 = (dsqp) dnwbVar4.cu(5);
        dsqpVar2.bC(dnwbVar4);
        dnvy dnvyVar2 = (dnvy) dsqpVar2;
        dnvyVar2.bC(dnwbVar2);
        if (dnvyVar2.c) {
            dnvyVar2.bF();
            dnvyVar2.c = false;
        }
        ((dnwb) dnvyVar2.b).h = dnwb.ck();
        if (dnvyVar2.c) {
            dnvyVar2.bF();
            dnvyVar2.c = false;
        }
        dnwb dnwbVar5 = (dnwb) dnvyVar2.b;
        dsrj<dnwa> dsrjVar = dnwbVar5.h;
        if (!dsrjVar.a()) {
            dnwbVar5.h = dsqw.cl(dsrjVar);
        }
        dsod.bv(f, dnwbVar5.h);
        this.a = dnvyVar2.bK();
        if (f.equals(K)) {
            dnwb dnwbVar6 = this.a;
            dsqp dsqpVar3 = (dsqp) dnwbVar6.cu(5);
            dsqpVar3.bC(dnwbVar6);
            dnvy dnvyVar3 = (dnvy) dsqpVar3;
            if (dnvyVar3.c) {
                dnvyVar3.bF();
                dnvyVar3.c = false;
            }
            ((dnwb) dnvyVar3.b).h = dnwb.ck();
            if (bK.equals(dnvyVar3.bK())) {
                return;
            }
        }
        this.b.b(new anhj());
    }

    @Override // defpackage.anhk
    public final synchronized void c(dnwb dnwbVar) {
        d(dnwbVar);
    }

    @Override // defpackage.anhk
    public final synchronized boolean d(dnwb dnwbVar) {
        dnwb dnwbVar2;
        dnwbVar2 = this.a;
        b(dnwb.i, dnwbVar);
        return !dnwbVar2.equals(this.a);
    }

    @Override // defpackage.anhk
    public final synchronized void e(String str) {
        dnwb dnwbVar = this.a;
        dsqp dsqpVar = (dsqp) dnwbVar.cu(5);
        dsqpVar.bC(dnwbVar);
        dnvy dnvyVar = (dnvy) dsqpVar;
        if (dnvyVar.c) {
            dnvyVar.bF();
            dnvyVar.c = false;
        }
        dnwb dnwbVar2 = (dnwb) dnvyVar.b;
        dnwb dnwbVar3 = dnwb.i;
        str.getClass();
        dnwbVar2.a |= 2;
        dnwbVar2.c = str;
        this.a = dnvyVar.bK();
    }

    @Override // defpackage.anhk
    public final synchronized void f(String str) {
        dnwb dnwbVar = this.a;
        dsqp dsqpVar = (dsqp) dnwbVar.cu(5);
        dsqpVar.bC(dnwbVar);
        dnvy dnvyVar = (dnvy) dsqpVar;
        if (dnvyVar.c) {
            dnvyVar.bF();
            dnvyVar.c = false;
        }
        dnwb dnwbVar2 = (dnwb) dnvyVar.b;
        dnwb dnwbVar3 = dnwb.i;
        str.getClass();
        dnwbVar2.a |= 8;
        dnwbVar2.d = str;
        this.a = dnvyVar.bK();
    }

    @Override // defpackage.anhk
    public final synchronized void g(dspd dspdVar) {
        dnwb dnwbVar = this.a;
        dsqp dsqpVar = (dsqp) dnwbVar.cu(5);
        dsqpVar.bC(dnwbVar);
        dnvy dnvyVar = (dnvy) dsqpVar;
        if (dnvyVar.c) {
            dnvyVar.bF();
            dnvyVar.c = false;
        }
        dnwb dnwbVar2 = (dnwb) dnvyVar.b;
        dnwb dnwbVar3 = dnwb.i;
        dspdVar.getClass();
        dnwbVar2.a |= 4096;
        dnwbVar2.e = dspdVar;
        this.a = dnvyVar.bK();
    }

    @Override // defpackage.anhk
    public final synchronized void h(String str) {
        dnwb dnwbVar = this.a;
        dsqp dsqpVar = (dsqp) dnwbVar.cu(5);
        dsqpVar.bC(dnwbVar);
        dnvy dnvyVar = (dnvy) dsqpVar;
        if (dnvyVar.c) {
            dnvyVar.bF();
            dnvyVar.c = false;
        }
        dnwb dnwbVar2 = (dnwb) dnvyVar.b;
        dnwb dnwbVar3 = dnwb.i;
        str.getClass();
        dnwbVar2.a |= 8192;
        dnwbVar2.f = str;
        this.a = dnvyVar.bK();
    }

    @Override // defpackage.anhk
    public final synchronized void i(String str) {
        dnwb dnwbVar = this.a;
        dsqp dsqpVar = (dsqp) dnwbVar.cu(5);
        dsqpVar.bC(dnwbVar);
        dnvy dnvyVar = (dnvy) dsqpVar;
        if (dnvyVar.c) {
            dnvyVar.bF();
            dnvyVar.c = false;
        }
        dnwb dnwbVar2 = (dnwb) dnvyVar.b;
        dnwb dnwbVar3 = dnwb.i;
        str.getClass();
        dnwbVar2.a |= 16384;
        dnwbVar2.g = str;
        this.a = dnvyVar.bK();
    }

    public final synchronized void j(gds gdsVar) {
        btlu btluVar = this.c;
        btlu btluVar2 = gdsVar.a;
        if (!btlu.g(btluVar, btluVar2)) {
            this.a = dnwb.i;
        }
        this.c = btluVar2;
    }
}
