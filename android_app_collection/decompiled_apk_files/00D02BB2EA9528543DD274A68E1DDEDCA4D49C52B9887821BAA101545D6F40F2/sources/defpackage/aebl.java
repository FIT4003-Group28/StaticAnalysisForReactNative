package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aebl  reason: default package */
/* loaded from: classes.dex */
public class aebl implements aebb {
    private final dxio<abhx> a;
    private final dxio<abfa> b;
    private final aeax c;
    private final acyr d;
    private final aeaz e;
    private final dxio<aebc> f;
    private final List<dxio<? extends aczy<? extends aczr>>> g = new ArrayList();
    private dcep<awvv<?>> h = dcmr.a;
    private dcep<awvv<?>> i = dcmr.a;
    private awwb j;
    private dbty<Boolean> k;

    public aebl(dxio<abhx> dxioVar, dxio<aebc> dxioVar2, dxio<abfa> dxioVar3, aeba aebaVar, aeay aeayVar, final acyr acyrVar, cqhn cqhnVar) {
        this.k = dbud.b(false);
        this.a = dxioVar;
        this.b = dxioVar3;
        this.d = acyrVar;
        this.e = aebaVar.a(ckfh.k);
        ckgz ckgzVar = ckfh.aI;
        ckcw a = aeayVar.a.a();
        aeay.a(a, 1);
        aeay.a(ckgzVar, 2);
        this.c = new aeax(a, ckgzVar);
        this.f = dxioVar2;
        this.k = dbud.a(new dbty(acyrVar) { // from class: aebh
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(!this.a.a().X);
            }
        });
    }

    private final synchronized List<aczy<? extends aczr>> p() {
        int i;
        Map<dkss, dxio<? extends aczy<? extends aczr>>> a;
        if (this.g.isEmpty()) {
            this.a.a().o.a().b.n(new aebk(this));
            List<dxio<? extends aczy<? extends aczr>>> list = this.g;
            final abhx a2 = this.a.a();
            if (a2.x.isEmpty()) {
                if (a2.d.v()) {
                    a = new aif<>();
                    a2.c.b(a);
                    if (a2.d.o()) {
                        a.put(dkss.EXPLORE_CELEBRATION_CONTENT, a2.m);
                    }
                    if (a2.d.p()) {
                        a.put(dkss.CRISIS, a2.n);
                    }
                    a.put(dkss.EXPLORE_AREA_SUMMARY, a2.h);
                    dktp dktpVar = a2.d.a.getPassiveAssistParameters().a().r;
                    if (dktpVar == null) {
                        dktpVar = dktp.e;
                    }
                    int a3 = dkto.a(dktpVar.b);
                    if (a3 != 0 && a3 == 4) {
                        a.put(dkss.NEARBY_PLACE_SETS, btsp.b(new dbty(a2) { // from class: abhn
                            private final abhx a;

                            {
                                this.a = a2;
                            }

                            @Override // defpackage.dbty
                            public final Object a() {
                                return this.a.k.a(abhx.b);
                            }
                        }));
                    }
                    abfa abfaVar = a2.d;
                    a.put(dkss.NEARBY_HOTELS, a2.j);
                    abfa abfaVar2 = a2.d;
                    a.put(dkss.TOURIST_PLACES, a2.w);
                    a.put(dkss.YOUR_EXPLORE_FEED, a2.v);
                    if (a2.d.w()) {
                        a.put(dkss.PERSONAL_ACTION_CONTENT, a2.o);
                    }
                } else {
                    a = a2.c.a();
                    if (a2.d.o()) {
                        a.put(dkss.EXPLORE_CELEBRATION_CONTENT, a2.m);
                    }
                    if (awpl.a(a2.d.a)) {
                        a.put(dkss.PARKING_PAYMENT, a2.p);
                    }
                    if (a2.d.u()) {
                        a.put(dkss.MERCHANT_POSTS, a2.q);
                    }
                    if (a2.d.q()) {
                        a.put(dkss.NEWLY_OPENED_PLACE_SETS, a2.r);
                    }
                    if (a2.d.r()) {
                        a.put(dkss.PLACE_IN_THE_NEWS_SETS, a2.s);
                    }
                    if (a2.d.s()) {
                        a.put(dkss.PLACES_FROM_THE_NEWS, a2.t);
                    }
                    if (a2.d.t()) {
                        a.put(dkss.UGC_REVIEWS, a2.u);
                    }
                    a.put(dkss.EXPLORE_AREA_SUMMARY, a2.h);
                    a.put(dkss.NEARBY_PLACE_SETS, btsp.b(new dbty(a2) { // from class: abhv
                        private final abhx a;

                        {
                            this.a = a2;
                        }

                        @Override // defpackage.dbty
                        public final Object a() {
                            return this.a.k.a(abhx.b);
                        }
                    }));
                    if (!a2.e.d()) {
                        a.put(dkss.GEO_VERTICALS, btsp.b(new dbty(a2) { // from class: abhw
                            private final abhx a;

                            {
                                this.a = a2;
                            }

                            @Override // defpackage.dbty
                            public final Object a() {
                                return this.a.i.a(abhx.b);
                            }
                        }));
                    }
                    if (!a2.e.d()) {
                        a.put(dkss.EXPLORE_CATEGORIES, a2.f);
                    }
                    abfa abfaVar3 = a2.d;
                    a.put(dkss.NEARBY_HOTELS, a2.j);
                    if (a2.d.i()) {
                        a.put(dkss.AREA_QUESTIONS_AND_ANSWERS, a2.l);
                    }
                    abfa abfaVar4 = a2.d;
                    a.put(dkss.EXPLORE_EXPERIMENTAL_CONTENT, a2.g);
                    if (a2.d.w()) {
                        a.put(dkss.PERSONAL_ACTION_CONTENT, a2.o);
                    }
                    if (a2.d.p()) {
                        a.put(dkss.CRISIS, a2.n);
                    }
                }
                List<dxio<? extends aczy<? extends aczr>>> list2 = a2.x;
                abil abilVar = a2.c;
                list2.addAll(abil.c(a, ((adza) a2.e).b.a().c.a()));
            }
            list.addAll(a2.x);
        }
        if (this.k.a().booleanValue() || (i = this.d.a().Y) <= 0 || i >= this.g.size()) {
            return dchl.k(this.g, aebj.a);
        }
        return dchl.k(this.g.subList(0, i), aebi.a);
    }

    private final synchronized void q() {
        dcen N = dcep.N();
        for (adab<?> adabVar : adaa.a(p())) {
            N.i(adabVar.g());
        }
        this.h = N.f();
    }

    private final synchronized void r() {
        dcen N = dcep.N();
        for (adab<?> adabVar : adaa.a(p())) {
            N.i(adabVar.h());
        }
        this.i = N.f();
    }

    @Override // defpackage.aebb
    public dktk a() {
        return dktk.EXPLORE;
    }

    @Override // defpackage.aebb
    public cjtd b() {
        return cjtd.a(dtxr.au);
    }

    @Override // defpackage.aebb
    public ddho c() {
        return dtxr.av;
    }

    @Override // defpackage.aebb
    public ddho d() {
        return dtxr.au;
    }

    @Override // defpackage.aebb
    public dvum e() {
        return dvum.PLACES_TAB;
    }

    @Override // defpackage.aebb
    public List<cqix<?>> f() {
        this.f.a().c();
        return this.f.a().a(p(), this.j, ckfh.m);
    }

    @Override // defpackage.aebb
    public synchronized Set<awvv<?>> g() {
        if (this.h.isEmpty()) {
            q();
        }
        return this.h;
    }

    @Override // defpackage.aebb
    public synchronized Set<awvv<?>> h() {
        dcen dcenVar;
        if (this.h.isEmpty()) {
            q();
        }
        if (this.i.isEmpty()) {
            r();
        }
        dcenVar = new dcen();
        dcenVar.i(this.h);
        dcenVar.i(this.i);
        return dcenVar.f();
    }

    @Override // defpackage.aebb
    public void i(awwb awwbVar, awwp awwpVar) {
        this.j = awwbVar;
        this.e.a(awwbVar, h());
        boolean z = true;
        if (!awwpVar.a() && !awwpVar.b()) {
            z = false;
        }
        this.f.a().b(awwbVar, adaa.a(p()), z);
        cqkx.p(this);
    }

    @Override // defpackage.aebb
    public synchronized boolean j() {
        return this.k.a().booleanValue();
    }

    @Override // defpackage.aebb
    public Float k() {
        return Float.valueOf(this.d.a().h);
    }

    @Override // defpackage.aebb
    public synchronized void l(boolean z, @dzsi ckfe ckfeVar) {
        if (z == this.k.a().booleanValue()) {
            return;
        }
        this.k = dbud.b(Boolean.valueOf(z));
        if (z && ckfeVar != null) {
            aeax aeaxVar = this.c;
            ((ckco) aeaxVar.a.a(aeaxVar.b)).a(ckfeVar.e);
        }
        this.h = dcmr.a;
        this.i = dcmr.a;
    }

    @Override // defpackage.aebb
    public void m(Bundle bundle) {
        if (this.b.a().v()) {
            adyv a = this.a.a().a().b.a();
            if (bundle.containsKey("explore_local_stream_bundle")) {
                advh advhVar = (advh) bvrs.g(bundle, "explore_local_stream_bundle", (dssr) advh.h.cu(7), advh.h);
                dsqp dsqpVar = (dsqp) advhVar.cu(5);
                dsqpVar.bC(advhVar);
                a.g = (advg) dsqpVar;
                a.d.clear();
                advf advfVar = advhVar.e;
                if (advfVar == null) {
                    advfVar = advf.b;
                }
                a.c(advfVar.a, advhVar.d, advhVar.f);
                dqac dqacVar = advhVar.g;
                if (dqacVar == null) {
                    dqacVar = dqac.d;
                }
                dsqp dsqpVar2 = (dsqp) dqacVar.cu(5);
                dsqpVar2.bC(dqacVar);
                a.f = (dqab) dsqpVar2;
                if (a.b.e() && a.b.j()) {
                    axjh axjhVar = a.b;
                    dqac dqacVar2 = advhVar.g;
                    if (dqacVar2 == null) {
                        dqacVar2 = dqac.d;
                    }
                    axjhVar.C(dqacVar2);
                }
            }
            if (!bundle.containsKey("ExploreWillLoadAllCardProvidersState")) {
                return;
            }
            this.k = dbud.b(Boolean.valueOf(bundle.getBoolean("ExploreWillLoadAllCardProvidersState", this.k.a().booleanValue())));
        }
    }

    @Override // defpackage.aebb
    public void n(Bundle bundle) {
        if (this.b.a().v()) {
            adyv a = this.a.a().a().b.a();
            advg advgVar = a.g;
            adve bZ = advf.b.bZ();
            List<dlcv> list = a.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            advf advfVar = (advf) bZ.b;
            dsrj<dlcv> dsrjVar = advfVar.a;
            if (!dsrjVar.a()) {
                advfVar.a = dsqw.cl(dsrjVar);
            }
            dsod.bv(list, advfVar.a);
            advf bK = bZ.bK();
            if (advgVar.c) {
                advgVar.bF();
                advgVar.c = false;
            }
            advh advhVar = (advh) advgVar.b;
            advh advhVar2 = advh.h;
            bK.getClass();
            advhVar.e = bK;
            advhVar.a |= 8;
            advg advgVar2 = a.g;
            dqac bK2 = a.f.bK();
            if (advgVar2.c) {
                advgVar2.bF();
                advgVar2.c = false;
            }
            advh advhVar3 = (advh) advgVar2.b;
            bK2.getClass();
            advhVar3.g = bK2;
            advhVar3.a |= 32;
            bvrs.k(bundle, "explore_local_stream_bundle", a.g.bK());
            bundle.putBoolean("ExploreWillLoadAllCardProvidersState", this.k.a().booleanValue());
        }
    }

    public void o(bbua bbuaVar) {
        for (adyu adyuVar : this.a.a().a().b.a().e) {
            adyuVar.S(bbuaVar);
        }
    }
}
