package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: btrg  reason: default package */
/* loaded from: classes4.dex */
public final class btrg {
    public final AtomicInteger a = new AtomicInteger();
    public final bukq b;
    public final buks c;
    public final bulu d;
    public final bupn e;
    public final buuh f;
    public final buzc g;
    public final buzi h;
    private final dehq i;
    private final bupl j;
    private final bupp k;
    private final burd l;
    private final buze m;

    public btrg(bukq bukqVar, buks buksVar, bulu buluVar, bupl buplVar, bupn bupnVar, bupp buppVar, burd burdVar, buuh buuhVar, buzc buzcVar, buze buzeVar, buzi buziVar, dehq dehqVar) {
        this.b = bukqVar;
        this.c = buksVar;
        this.d = buluVar;
        this.j = buplVar;
        this.e = bupnVar;
        this.k = buppVar;
        this.l = burdVar;
        this.f = buuhVar;
        this.g = buzcVar;
        this.m = buzeVar;
        this.h = buziVar;
        this.i = dehqVar;
    }

    public static <V> dbrn<V, V> g(final bvqg<V> bvqgVar) {
        return new dbrn(bvqgVar) { // from class: btra
            private final bvqg a;

            {
                this.a = bvqgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                this.a.NU(obj);
                return obj;
            }
        };
    }

    public static dnqh h(ddda dddaVar) {
        dnqg bZ = dnqh.p.bZ();
        int i = dddaVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        return bZ.bK();
    }

    public final dehn<dibq> a(dibo diboVar) {
        bupp buppVar = this.k;
        dsqp dsqpVar = (dsqp) diboVar.cu(5);
        dsqpVar.bC(diboVar);
        dibn dibnVar = (dibn) dsqpVar;
        dnqh h = h(ddda.ap);
        if (dibnVar.c) {
            dibnVar.bF();
            dibnVar.c = false;
        }
        dibo diboVar2 = (dibo) dibnVar.b;
        dibo diboVar3 = dibo.i;
        h.getClass();
        diboVar2.g = h;
        diboVar2.a |= 1024;
        return deew.h(degp.q(f(buppVar, dibnVar.bK(), btpl.a, btpw.a)), g(btqh.a), dege.a);
    }

    public final dehn<dibm> b(List<dppt> list) {
        burd burdVar = this.l;
        dibj bZ = dibk.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dibk dibkVar = (dibk) bZ.b;
        dsrj<dppt> dsrjVar = dibkVar.b;
        if (!dsrjVar.a()) {
            dibkVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, dibkVar.b);
        dnqh h = h(ddda.as);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dibk dibkVar2 = (dibk) bZ.b;
        h.getClass();
        dibkVar2.c = h;
        dibkVar2.a |= 1;
        return deew.h(degp.q(f(burdVar, bZ.bK(), btrb.a, btrc.a)), g(btrd.a), dege.a);
    }

    public final dehn<dpri> c(dpov dpovVar, dpqn dpqnVar) {
        dkat bZ = dkau.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkau dkauVar = (dkau) bZ.b;
        dpovVar.getClass();
        dkauVar.d = dpovVar;
        dkauVar.a |= 1;
        dkauVar.c = Integer.valueOf(dpqnVar.e);
        dkauVar.b = 2;
        dnqh h = h(ddda.aE);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkau dkauVar2 = (dkau) bZ.b;
        h.getClass();
        dkauVar2.e = h;
        dkauVar2.a |= 8;
        return deew.h(deew.h(degp.q(f(this.h, bZ.bK(), btpq.a, btpr.a)), g(btps.a), dege.a), btpt.a, dege.a);
    }

    public final dehn<dibd> d(diaw diawVar) {
        bupl buplVar = this.j;
        dsqp dsqpVar = (dsqp) diawVar.cu(5);
        dsqpVar.bC(diawVar);
        diar diarVar = (diar) dsqpVar;
        dnqh h = h(ddda.aq);
        if (diarVar.c) {
            diarVar.bF();
            diarVar.c = false;
        }
        diaw diawVar2 = (diaw) diarVar.b;
        diaw diawVar3 = diaw.g;
        h.getClass();
        diawVar2.f = h;
        diawVar2.a |= 8;
        return deew.h(degp.q(f(buplVar, diarVar.bK(), btqc.a, btqd.a)), g(btqe.a), dege.a);
    }

    public final dehn<dpqw> e(final dpot dpotVar, dpqw dpqwVar, dpqw dpqwVar2) {
        dkap bZ = dkaq.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkaq dkaqVar = (dkaq) bZ.b;
        dkaqVar.e = dpqwVar.f;
        int i = dkaqVar.a | 8;
        dkaqVar.a = i;
        dkaqVar.d = dpqwVar2.f;
        dkaqVar.a = i | 4;
        dnqh h = h(ddda.aD);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkaq dkaqVar2 = (dkaq) bZ.b;
        h.getClass();
        dkaqVar2.f = h;
        dkaqVar2.a |= 16;
        dpri dpriVar = dpotVar.d;
        if (dpriVar == null) {
            dpriVar = dpri.f;
        }
        if ((dpriVar.a & 8) != 0) {
            dpri dpriVar2 = dpotVar.d;
            if (dpriVar2 == null) {
                dpriVar2 = dpri.f;
            }
            String str = dpriVar2.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkaq dkaqVar3 = (dkaq) bZ.b;
            str.getClass();
            dkaqVar3.b = 6;
            dkaqVar3.c = str;
        } else {
            dpov dpovVar = dpotVar.b;
            if (dpovVar == null) {
                dpovVar = dpov.f;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkaq dkaqVar4 = (dkaq) bZ.b;
            dpovVar.getClass();
            dkaqVar4.c = dpovVar;
            dkaqVar4.b = 1;
        }
        return deew.h(deew.h(degp.q(f(this.m, bZ.bK(), btqw.a, new bvqg() { // from class: btqx
            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                btzy btzyVar = (btzy) obj;
            }
        })), g(new bvqg(dpotVar) { // from class: btqy
            private final dpot a;

            {
                this.a = dpotVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                dkas dkasVar = (dkas) obj;
                dpov dpovVar2 = this.a.b;
                if (dpovVar2 == null) {
                    dpovVar2 = dpov.f;
                }
                String str2 = dpovVar2.b;
            }
        }), dege.a), btqz.a, dege.a);
    }

    public final <I, O> dehn<O> f(btzp<I, O> btzpVar, I i, dbrn<O, dpql> dbrnVar, bvqg<btzy> bvqgVar) {
        deig d = deig.d();
        this.a.incrementAndGet();
        btzpVar.b(i, new btrf(this, dbrnVar, d, bvqgVar), this.i);
        return d;
    }
}
