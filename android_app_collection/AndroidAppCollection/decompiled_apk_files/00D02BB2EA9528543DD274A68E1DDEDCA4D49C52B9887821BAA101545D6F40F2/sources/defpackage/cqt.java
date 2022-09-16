package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqt  reason: default package */
/* loaded from: classes5.dex */
public class cqt extends ges implements cqk, bnyf, bxeq {
    public static final dcqe a = dcqe.c("cqt");
    @dzsi
    public cqz aA;
    @dzsi
    public cqf aB;
    @dzsi
    public cqkf<ctj> aC;
    @dzsi
    private dpum aO;
    @dzsi
    private bomu aP;
    private final Handler aQ = new Handler();
    public cqkj ad;
    public efg ae;
    public dxio<akfa> af;
    public awnm ag;
    public cjxd ah;
    public dxio<boxa> ai;
    public dxio<ache> aj;
    public dxio<axwy> ak;
    public dxio<begg> al;
    public bnyj am;
    public bzpr an;
    public dxio<bzpz> ao;
    public cra ap;
    public cqm aq;
    public bnyh ar;
    public bwqv as;
    public bomt at;
    public cqhu au;
    public bpsq av;
    public cpv aw;
    public dxio<btvo> ax;
    @dzsi
    public cql ay;
    @dzsi
    public bnyg az;
    public gga b;
    public cjqy c;
    public bvrb d;
    public ania e;
    public hwe f;
    public gfq g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        View a2;
        cqz cqzVar;
        cqkf<ctj> cqkfVar = this.aC;
        if (cqkfVar == null || (a2 = cqhu.a(cqkfVar.c(), ctj.q)) == null || (cqzVar = this.aA) == null) {
            return;
        }
        this.aw.f(a2, cqzVar.d());
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<ctj> cqkfVar = this.aC;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.aC = null;
        }
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        cqz cqzVar = this.aA;
        if (cqzVar == null) {
            if (!(obj instanceof Serializable)) {
                return;
            }
            this.o.putSerializable("fragment result", (Serializable) obj);
        } else if (obj instanceof bomv) {
            bomv bomvVar = (bomv) obj;
            bomn b = bomvVar.b();
            akqq a2 = bomvVar.a();
            if (b != null) {
                cqzVar.n(b.a, b.b, b.c, false, dory.REVERSE_GEOCODED);
            }
            cqzVar.C(a2);
        } else if (obj instanceof bbuf) {
            bbuf bbufVar = (bbuf) obj;
            if (bbufVar.b().isEmpty()) {
                cqzVar.p(bbufVar.a());
            } else if (!bbufVar.b().startsWith("business_hours_photo")) {
            } else {
                cqzVar.q(bbufVar.a());
            }
        } else if (obj instanceof bosj) {
            bosr L = cqzVar.L();
            if (L == null) {
                return;
            }
            L.h((bosj) obj);
        } else if (!(obj instanceof cre)) {
        } else {
            if (((cre) obj) == cre.SUBMIT_REQUEST) {
                cql cqlVar = this.ay;
                dbsk.s(cqlVar);
                cqlVar.b();
                return;
            }
            cqf cqfVar = this.aB;
            dbsk.s(cqfVar);
            cqfVar.c(dwhd.h);
        }
    }

    @Override // defpackage.cqk
    public final void a(@dzsi dwhd dwhdVar) {
        if (!this.aD) {
            return;
        }
        cqz cqzVar = this.aA;
        dbsk.s(cqzVar);
        cqzVar.s(dwhdVar);
        if (dwhdVar == null) {
            q();
            return;
        }
        int a2 = dwhc.a(dwhdVar.b);
        if (a2 == 0 || a2 != 2) {
            int a3 = dwhc.a(dwhdVar.b);
            if (a3 == 0 || a3 != 5) {
                return;
            }
            cqf cqfVar = this.aB;
            dbsk.s(cqfVar);
            cqfVar.c(dwhdVar);
            crf.g(dwhdVar.g, this);
            return;
        }
        this.ai.a().M(this.ai.a().R(dwhdVar));
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<ctj> c = this.ad.c(new csw(), null);
        this.aC = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.f.h();
        boms.a(this.d, this.aj.a());
        cqz cqzVar = this.aA;
        if (cqzVar != null) {
            cqzVar.b();
        }
        super.am();
    }

    @Override // defpackage.cqk
    public final void b(@dzsi dwby dwbyVar) {
        if (this.aD) {
            cqz cqzVar = this.aA;
            dbsk.s(cqzVar);
            cqzVar.o(dwbyVar);
        }
    }

    @Override // defpackage.cqk
    public final void c(List<bxmh> list) {
        if (this.aD) {
            cqz cqzVar = this.aA;
            dbsk.s(cqzVar);
            cqzVar.u(list);
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        cqz cqzVar = this.aA;
        if (cqzVar != null) {
            return cqzVar.a();
        }
        return false;
    }

    @Override // defpackage.bnyf
    public final void g(@dzsi dwhj dwhjVar, boolean z) {
        dvyw dvywVar;
        if (!this.aD) {
            return;
        }
        if (dwhjVar != null) {
            dvywVar = dwhjVar.d;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
        } else {
            dvywVar = null;
        }
        cqz cqzVar = this.aA;
        dbsk.s(cqzVar);
        cqzVar.t(dvywVar, z);
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        if (J() != null) {
            gfq.k(this);
        }
        this.aQ.post(new cqo(this, bxmhVar));
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        cqz cqzVar = this.aA;
        dbsk.s(cqzVar);
        cqzVar.n(str, "", "", true, dory.USER_PROVIDED);
        if (J() != null) {
            gfq.k(this);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2;
        super.l(bundle);
        Bundle bundle3 = this.o;
        if (bundle != null) {
            dbsk.s(bundle);
            bundle2 = bundle;
        } else {
            bundle2 = bundle3;
        }
        this.aB = (cqf) bundle2.getSerializable("MODEL_KEY");
        this.aO = (dpum) bvrs.b(bundle2.getByteArray("MAP_CENTER_KEY"), (dssr) dpum.d.cu(7));
        this.aP = (bomu) bundle2.getSerializable("FOCUSED_FIELD_KEY");
        if (bundle == null && !this.aw.e(this.b)) {
            this.aP = bomu.NAME;
        }
        cqm cqmVar = this.aq;
        cqf cqfVar = this.aB;
        dbsk.s(cqfVar);
        cqm.a(cqfVar, 1);
        cqm.a(this, 2);
        akpm a2 = cqmVar.a.a();
        cqm.a(a2, 3);
        dzsj<afwr> dzsjVar = cqmVar.b;
        cqat a3 = cqmVar.c.a();
        cqm.a(a3, 5);
        btrm a4 = cqmVar.d.a();
        cqm.a(a4, 6);
        bxer a5 = cqmVar.e.a();
        cqm.a(a5, 7);
        bnyo a6 = cqmVar.f.a();
        cqm.a(a6, 8);
        btpc a7 = cqmVar.g.a();
        cqm.a(a7, 9);
        cqm.a(cqmVar.h.a(), 10);
        this.ay = new cql(cqfVar, this, a2, dzsjVar, a3, a4, a5, a6, a7);
        bnyh bnyhVar = this.ar;
        bnyh.a(this, 1);
        akpm a8 = bnyhVar.a.a();
        bnyh.a(a8, 2);
        bnyo a9 = bnyhVar.b.a();
        bnyh.a(a9, 3);
        bnyh.a(bnyhVar.c.a(), 4);
        this.az = new bnyg(this, a8, a9);
        this.aj.a().t(true);
        cra craVar = this.ap;
        cqf cqfVar2 = this.aB;
        dbsk.s(cqfVar2);
        dpum dpumVar = this.aO;
        dbsk.s(dpumVar);
        bomt bomtVar = this.at;
        cra.a(cqfVar2, 1);
        cra.a(dpumVar, 2);
        cra.a(this, 3);
        cra.a(bomtVar, 4);
        jmx a10 = craVar.a.a();
        cra.a(a10, 5);
        gga a11 = craVar.b.a();
        cra.a(a11, 6);
        btvo a12 = craVar.c.a();
        cra.a(a12, 7);
        cqkj a13 = craVar.d.a();
        cra.a(a13, 8);
        bvrb a14 = craVar.e.a();
        cra.a(a14, 9);
        akpm a15 = craVar.f.a();
        cra.a(a15, 10);
        dxio a16 = ((dxjh) craVar.g).a();
        cra.a(a16, 11);
        ahjq a17 = craVar.h.a();
        cra.a(a17, 12);
        bnxt a18 = craVar.i.a();
        cra.a(a18, 13);
        bnxx a19 = craVar.j.a();
        cra.a(a19, 14);
        bbtk a20 = craVar.k.a();
        cra.a(a20, 15);
        cjqy a21 = craVar.l.a();
        cra.a(a21, 16);
        bwqv a22 = craVar.m.a();
        cra.a(a22, 17);
        dzsj<boxa> dzsjVar2 = craVar.n;
        dzsj<bbut> dzsjVar3 = craVar.o;
        dzsj<bbul> dzsjVar4 = craVar.p;
        dzsj<begg> dzsjVar5 = craVar.q;
        dzsj<axwy> dzsjVar6 = craVar.r;
        bnyd a23 = craVar.s.a();
        cra.a(a23, 23);
        boss a24 = craVar.t.a();
        cra.a(a24, 24);
        bopp a25 = craVar.u.a();
        cra.a(a25, 25);
        cra.a(craVar.v.a(), 26);
        cra.a(craVar.w.a(), 27);
        this.aA = new cqz(cqfVar2, this, bomtVar, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, dzsjVar6, a23, a24, a25);
        Serializable serializable = bundle3.getSerializable("fragment result");
        if (serializable != null) {
            bundle3.putSerializable("fragment result", null);
            Qn(serializable);
        }
        this.av.d(bundle);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 0) {
            cqz cqzVar = this.aA;
            dbsk.s(cqzVar);
            cqzVar.r();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.z;
    }

    public final void q() {
        ppw.b(J(), new cqp(this), new cqq());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.av.f();
        cql cqlVar = this.ay;
        dbsk.s(cqlVar);
        btrm btrmVar = cqlVar.c;
        cqj cqjVar = cqlVar.g;
        dceq a2 = dcet.a();
        a2.b(bxev.class, new cqn(bxev.class, cqjVar, bvrj.UI_THREAD));
        btrmVar.g(cqjVar, a2.a());
        this.am.a(this);
        cqz cqzVar = this.aA;
        dbsk.s(cqzVar);
        bnxs g = cqzVar.g();
        if (g != null) {
            g.a();
        }
        cqkf<ctj> cqkfVar = this.aC;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.aA);
        efg efgVar = this.ae;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        efgVar.a(egjVar.a());
        if (this.aP == bomu.NAME) {
            this.at.b(ctj.n);
        } else if (this.aP == bomu.WEBSITE) {
            this.at.b(ctj.o);
        } else if (this.aP == bomu.PHONE) {
            this.at.b(ctj.p);
        } else {
            this.at.a();
        }
        this.aP = null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bomu bomuVar;
        super.t(bundle);
        cqf cqfVar = this.aB;
        dbsk.s(cqfVar);
        bundle.putSerializable("MODEL_KEY", cqfVar);
        dpum dpumVar = this.aO;
        dbsk.s(dpumVar);
        bundle.putByteArray("MAP_CENTER_KEY", dpumVar.bS());
        cqjg cqjgVar = this.at.b;
        if (cqjgVar == ctj.n) {
            bomuVar = bomu.NAME;
        } else if (cqjgVar == ctj.o) {
            bomuVar = bomu.WEBSITE;
        } else {
            bomuVar = cqjgVar == ctj.p ? bomu.PHONE : null;
        }
        bundle.putSerializable("FOCUSED_FIELD_KEY", bomuVar);
        this.av.c(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cql cqlVar = this.ay;
        dbsk.s(cqlVar);
        cqlVar.c.a(cqlVar.g);
        cqz cqzVar = this.aA;
        dbsk.s(cqzVar);
        bnxs g = cqzVar.g();
        if (g != null) {
            g.b();
        }
        cqkf<ctj> cqkfVar = this.aC;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        jmw.d(this.b, null);
        this.av.b();
        super.u();
    }

    public final void w(dnfw dnfwVar) {
        cqz cqzVar = this.aA;
        dbsk.s(cqzVar);
        cqzVar.D();
        cqz cqzVar2 = this.aA;
        dbsk.s(cqzVar2);
        cqzVar2.h().b(dnfwVar);
    }
}
