package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbnc  reason: default package */
/* loaded from: classes3.dex */
public class bbnc {
    public final btrg a;
    public final dzsj<gga> b;
    public final Executor c;
    public final akfa d;
    public final crzp<btlu> h;
    public int i = 1;
    public deig<bbmn> e = deig.d();
    public bbmn f = bbmn.b;
    @dzsi
    public String g = null;

    public bbnc(btrg btrgVar, akfa akfaVar, dzsj<gga> dzsjVar, Executor executor) {
        crzp<btlu> crzpVar = new crzp(this) { // from class: bbmq
            private final bbnc a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                bbnc bbncVar = this.a;
                btlu q = btlu.q((btlu) crzmVar.l());
                String str = q.l() ? q.d : null;
                if (!dbsd.a(str, bbncVar.g)) {
                    bbncVar.i = 1;
                    bbncVar.f = bbmn.b;
                    bbncVar.e.cancel(true);
                    bbncVar.e = deig.d();
                    bbncVar.g = str;
                }
            }
        };
        this.h = crzpVar;
        this.a = btrgVar;
        this.b = dzsjVar;
        this.c = executor;
        this.d = akfaVar;
        akfaVar.C().a(crzpVar, executor);
    }

    public static bbmo c(bbmo bbmoVar, bbmt bbmtVar) {
        dppl a = bbmoVar.a();
        dsqp dsqpVar = (dsqp) a.cu(5);
        dsqpVar.bC(a);
        dpoy dpoyVar = (dpoy) dsqpVar;
        dppa dppaVar = bbmoVar.a().k;
        if (dppaVar == null) {
            dppaVar = dppa.d;
        }
        dsqp dsqpVar2 = (dsqp) dppaVar.cu(5);
        dsqpVar2.bC(dppaVar);
        dpoz dpozVar = (dpoz) dsqpVar2;
        dppa dppaVar2 = bbmoVar.a().k;
        if (dppaVar2 == null) {
            dppaVar2 = dppa.d;
        }
        dpqh dpqhVar = dppaVar2.b;
        if (dpqhVar == null) {
            dpqhVar = dpqh.c;
        }
        dsqp dsqpVar3 = (dsqp) dpqhVar.cu(5);
        dsqpVar3.bC(dpqhVar);
        Object a2 = bbmtVar.a((dpqe) dsqpVar3);
        if (dpozVar.c) {
            dpozVar.bF();
            dpozVar.c = false;
        }
        dppa dppaVar3 = (dppa) dpozVar.b;
        dpqh dpqhVar2 = (dpqh) ((dsqp) a2).bK();
        dpqhVar2.getClass();
        dppaVar3.b = dpqhVar2;
        dppaVar3.a |= 2;
        if (dpoyVar.c) {
            dpoyVar.bF();
            dpoyVar.c = false;
        }
        dppl dpplVar = (dppl) dpoyVar.b;
        dppa bK = dpozVar.bK();
        bK.getClass();
        dpplVar.k = bK;
        dpplVar.a |= 2048;
        return new bbmp(dpoyVar.bK());
    }

    public final void b(dpov dpovVar, @dzsi dspd dspdVar, deig<dpot> deigVar, List<dppl> list) {
        dibn bZ = dibo.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dibo diboVar = (dibo) bZ.b;
        dpovVar.getClass();
        diboVar.c = dpovVar;
        diboVar.b = 1;
        diboVar.a |= 32;
        diboVar.e = 100;
        dibo diboVar2 = (dibo) bZ.b;
        diboVar2.d = 2;
        int i = diboVar2.a | 16;
        diboVar2.a = i;
        if (dspdVar != null) {
            dspdVar.getClass();
            diboVar2.a = i | 64;
            diboVar2.f = dspdVar;
        }
        deha.q(this.a.a(bZ.bK()), new bbnb(this, list, deigVar), this.c);
    }

    public final dehn<bbmn> a() {
        int i = this.i;
        if (i != 0) {
            if (i != 1) {
                return i == 2 ? this.e : deha.a(this.f);
            }
            this.i = 2;
            btrg btrgVar = this.a;
            dpqj dpqjVar = dpqj.LOCAL_PERSONALIZATION;
            dild bZ = dile.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dile dileVar = (dile) bZ.b;
            dileVar.b = dpqjVar.j;
            dileVar.a |= 1;
            dnqh h = btrg.h(ddda.aw);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dile dileVar2 = (dile) bZ.b;
            h.getClass();
            dileVar2.c = h;
            dileVar2.a |= 32;
            return deew.h(deee.h(deew.g(degp.q(deew.h(degp.q(deew.h(degp.q(btrgVar.f(btrgVar.f, bZ.bK(), btqp.a, new bvqg() { // from class: btqq
                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    btzy btzyVar = (btzy) obj;
                }
            })), btrg.g(new bvqg() { // from class: btqr
                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    ((dilg) obj).a.size();
                }
            }), dege.a)), btqo.a, dege.a)), new defg(this) { // from class: bbmr
                private final bbnc a;

                {
                    this.a = this;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    bbnc bbncVar = this.a;
                    List list = (List) obj;
                    if (list.isEmpty()) {
                        btrg btrgVar2 = bbncVar.a;
                        String string = bbncVar.b.a().getString(R.string.PERSONAL_SCORE_FEEDBACK_LIST_NAME);
                        dpqj dpqjVar2 = dpqj.LOCAL_PERSONALIZATION;
                        dpqn dpqnVar = dpqn.PRIVATE_ENTITY_LIST;
                        dcdc f = dcdc.f(dppy.PLACE_ENTITY_LIST_ITEM);
                        dhql bZ2 = dhqm.g.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dhqm dhqmVar = (dhqm) bZ2.b;
                        dhqmVar.b = dpqjVar2.j;
                        dhqmVar.a |= 1;
                        dprh bZ3 = dpri.f.bZ();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dpri dpriVar = (dpri) bZ3.b;
                        dpriVar.b = dpqnVar.e;
                        dpriVar.a |= 1;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dhqm dhqmVar2 = (dhqm) bZ2.b;
                        dpri bK = bZ3.bK();
                        bK.getClass();
                        dhqmVar2.c = bK;
                        dhqmVar2.a |= 2;
                        Iterable o = dcft.o(f, btre.a);
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dhqm dhqmVar3 = (dhqm) bZ2.b;
                        dsrj<dppz> dsrjVar = dhqmVar3.d;
                        if (!dsrjVar.a()) {
                            dhqmVar3.d = dsqw.cl(dsrjVar);
                        }
                        dsod.bv(o, dhqmVar3.d);
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dhqm dhqmVar4 = (dhqm) bZ2.b;
                        string.getClass();
                        dhqmVar4.a |= 4;
                        dhqmVar4.e = string;
                        dnqh h2 = btrg.h(ddda.aj);
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dhqm dhqmVar5 = (dhqm) bZ2.b;
                        h2.getClass();
                        dhqmVar5.f = h2;
                        dhqmVar5.a |= 32;
                        return degp.q(deew.h(deew.h(degp.q(btrgVar2.f(btrgVar2.c, bZ2.bK(), btpm.a, btpn.a)), btpo.a, dege.a), btrg.g(btpp.a), dege.a));
                    }
                    deig<dpot> d = deig.d();
                    ArrayList arrayList = new ArrayList();
                    dpov dpovVar = ((dpot) list.get(0)).b;
                    if (dpovVar == null) {
                        dpovVar = dpov.f;
                    }
                    bbncVar.b(dpovVar, null, d, arrayList);
                    return degp.q(d);
                }
            }, this.c), Exception.class, new defg(this) { // from class: bbmz
                private final bbnc a;

                {
                    this.a = this;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    bbnc bbncVar = this.a;
                    Exception exc = (Exception) obj;
                    bbncVar.i = 1;
                    bbncVar.e.k(exc);
                    throw exc;
                }
            }, this.c), new dbrn(this) { // from class: bbna
                private final bbnc a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    bbnc bbncVar = this.a;
                    bbmn c = bbmn.c((dpot) obj);
                    bbncVar.f = c;
                    bbncVar.i = 3;
                    bbncVar.e.j(c);
                    return c;
                }
            }, this.c);
        }
        throw null;
    }
}
