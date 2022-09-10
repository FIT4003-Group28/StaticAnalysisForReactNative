package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: prq  reason: default package */
/* loaded from: classes7.dex */
public final class prq implements qbj {
    private static final dcqe c = dcqe.c("prq");
    public final bvjj a;
    public final vxa b;
    private final Application d;
    private final dzsj<srv> e;
    private final ahjq f;
    private final axru g;
    private final bvrb h;
    private final qeg i;
    private final qef j;
    private final tgf k;
    private final qif l;

    public prq(Application application, ahjq ahjqVar, axru axruVar, bvrb bvrbVar, bvjj bvjjVar, ckcw ckcwVar, dzsj<srv> dzsjVar, vxa vxaVar, qeg qegVar, qef qefVar, ckmp ckmpVar, tgf tgfVar) {
        this.d = application;
        this.e = dzsjVar;
        this.a = bvjjVar;
        this.f = ahjqVar;
        this.g = axruVar;
        this.h = bvrbVar;
        this.b = vxaVar;
        this.l = new qif(ckcwVar, ckmpVar);
        this.i = qegVar;
        this.j = qefVar;
        this.k = tgfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final dnqh m(@dzsi dnqh dnqhVar) {
        dnqg dnqgVar;
        if (dnqhVar == null) {
            dnqgVar = dnqh.p.bZ();
        } else {
            dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
            dsqpVar.bC(dnqhVar);
            dnqgVar = (dnqg) dsqpVar;
        }
        if (dnqgVar.c) {
            dnqgVar.bF();
            dnqgVar.c = false;
        }
        dnqh dnqhVar2 = (dnqh) dnqgVar.b;
        dnqhVar2.a |= 2048;
        dnqhVar2.j = true;
        return dnqgVar.bK();
    }

    @dzsi
    private final dcdc<amvh> o(@dzsi amvh amvhVar, List<amvh> list) {
        if (list.isEmpty()) {
            return null;
        }
        int i = 0;
        if (amvhVar == null || amvhVar.k()) {
            amvhVar = f(list.get(0));
            if (!amvhVar.c()) {
                return null;
            }
        }
        while (i < list.size()) {
            amvh amvhVar2 = i == 0 ? amvhVar : list.get(i - 1);
            amvh amvhVar3 = list.get(i);
            if (akqq.v(amvhVar2 == null ? null : amvhVar2.e, amvhVar3 == null ? null : amvhVar3.e, 1.0d) || amvhVar2.d(amvhVar3)) {
                return null;
            }
            i++;
        }
        dccx F = dcdc.F();
        F.g(amvhVar);
        F.i(list);
        return F.f();
    }

    @Override // defpackage.qbj
    public final dqvj a() {
        dqvj a = vxx.a(this.a);
        return (a != dqvj.TWO_WHEELER || this.i.b()) ? a : dqvj.DRIVE;
    }

    @Override // defpackage.qbj
    public final void b(dqvj dqvjVar) {
        vxx.b(this.a, dqvjVar);
    }

    @Override // defpackage.qbj
    public final void c(boolean z) {
        this.a.S(bvjk.bQ, z);
    }

    @Override // defpackage.qbj
    public final boolean d() {
        return this.a.m(bvjk.bQ, false);
    }

    @Override // defpackage.qbj
    @dzsi
    public final GmmLocation e() {
        ahjq ahjqVar = this.f;
        if (ahjqVar == null) {
            return null;
        }
        return ahjqVar.a();
    }

    @Override // defpackage.qbj
    public final boolean g() {
        return this.j.a();
    }

    @Override // defpackage.qbj
    public final vun h(dcdc<amvh> dcdcVar, dbsg<dnqh> dbsgVar, dbsg<dpaz> dbsgVar2, dbsg<dhjx> dbsgVar3) {
        return this.k.a(dcdcVar, dbsgVar, dbsgVar2, dbsgVar3);
    }

    @Override // defpackage.qbj
    @dzsi
    public final qbn i(dbsg<amvh> dbsgVar, dcdc<amvh> dcdcVar, final dbsg<dnqh> dbsgVar2, final dbsg<dpaz> dbsgVar3, final dbsg<dhjx> dbsgVar4) {
        final dcdc<amvh> o = o(dbsgVar.f(), dcdcVar);
        if (o == null) {
            return null;
        }
        final srv a = this.e.a();
        this.h.b(new Runnable(this, dbsgVar2, o, dbsgVar3, dbsgVar4, a) { // from class: pro
            private final prq a;
            private final dbsg b;
            private final dcdc c;
            private final dbsg d;
            private final dbsg e;
            private final srv f;

            {
                this.a = this;
                this.b = dbsgVar2;
                this.c = o;
                this.d = dbsgVar3;
                this.e = dbsgVar4;
                this.f = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                prq prqVar = this.a;
                dbsg dbsgVar5 = this.b;
                this.f.o(prqVar.h(this.c, dbsg.i(prq.m((dnqh) ((dbsu) dbsgVar5).a)), this.d, this.e), false, Long.valueOf(eaow.d(4L).b), dcdc.e(), null);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        return a;
    }

    @Override // defpackage.qbj
    public final qbn j(vun vunVar, amte amteVar, boolean z, int i) {
        srv a = this.e.a();
        a.i(vunVar, amteVar, z, i);
        return a;
    }

    @Override // defpackage.qbj
    public final qif k() {
        return this.l;
    }

    @Override // defpackage.qbj
    public final qbn l(vun vunVar, amsy amsyVar) {
        srf h;
        srv a = this.e.a();
        synchronized (a) {
            dbsk.l(a.k.x() == 1);
            srx w = a.k.w();
            w.f(2);
            w.j(true);
            w.c(vunVar);
            a.k = w.a();
            h = a.h(null, amsyVar, true);
        }
        if (h != null) {
            a.f.b(h);
        }
        return a;
    }

    @Override // defpackage.qbj
    @dzsi
    public final qbn n(@dzsi amvh amvhVar, List<amvh> list, @dzsi final dnqh dnqhVar, @dzsi final dqvj dqvjVar, @dzsi final dwao dwaoVar, final int i, @dzsi final dhjx dhjxVar, final vul vulVar) {
        final dcdc<amvh> o = o(amvhVar, list);
        if (o == null) {
            return null;
        }
        final srv a = this.e.a();
        this.h.b(new Runnable(this, dnqhVar, dqvjVar, dwaoVar, i, vulVar, o, dhjxVar, a) { // from class: prp
            private final prq a;
            private final dnqh b;
            private final dqvj c;
            private final dwao d;
            private final vul e;
            private final dcdc f;
            private final dhjx g;
            private final srv h;
            private final int i;

            {
                this.a = this;
                this.b = dnqhVar;
                this.c = dqvjVar;
                this.d = dwaoVar;
                this.i = i;
                this.e = vulVar;
                this.f = o;
                this.g = dhjxVar;
                this.h = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                prq prqVar = this.a;
                dnqh dnqhVar2 = this.b;
                dqvj dqvjVar2 = this.c;
                dwao dwaoVar2 = this.d;
                int i2 = this.i;
                vul vulVar2 = this.e;
                dcdc dcdcVar = this.f;
                dhjx dhjxVar2 = this.g;
                srv srvVar = this.h;
                dnqh m = prq.m(dnqhVar2);
                GmmLocation e = prqVar.e();
                dtaq a2 = e != null ? e.a() : null;
                dowa a3 = bvsl.a(prqVar.a);
                if (dqvjVar2 == null) {
                    dqvjVar2 = prqVar.a();
                }
                dwao d = prqVar.b.d(dwaoVar2, dqvjVar2, i2, vulVar2);
                vum vumVar = new vum();
                vumVar.c(dcdcVar);
                vumVar.e = dhjxVar2;
                vumVar.f = a2;
                vumVar.a = d;
                vumVar.o = m;
                vumVar.g = a3;
                vumVar.p = false;
                srvVar.j(vumVar.a(), null);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        return a;
    }

    @Override // defpackage.qbj
    public final amvh f(@dzsi amvh amvhVar) {
        akqq akqqVar;
        if (amvhVar == null || !amvhVar.k()) {
            if (!this.g.a("android.permission.ACCESS_FINE_LOCATION")) {
                return amvh.a;
            }
            GmmLocation e = e();
            if (e == null) {
                ahjq ahjqVar = this.f;
                if (ahjqVar == null || ahjqVar.h() == null || !this.f.h().a()) {
                    return amvh.a;
                }
                return amvh.i(this.d);
            }
            if (amvhVar != null && (akqqVar = amvhVar.e) != null) {
                GmmLocation e2 = e();
                if (e2 == null) {
                    bvoo.h("Caller should handle unavailable location", new Object[0]);
                } else {
                    akra a = akqg.a(akqqVar);
                    double y = a.y(e2.h);
                    double r = a.r();
                    Double.isNaN(y);
                    if (y / r > 620000.0d) {
                        return amvh.a;
                    }
                }
            }
            return amvh.g(this.d, e.B());
        }
        return amvh.a;
    }
}
