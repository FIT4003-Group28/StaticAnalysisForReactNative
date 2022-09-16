package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bizu  reason: default package */
/* loaded from: classes3.dex */
public class bizu implements bizn {
    public final bjhs a;
    public final bjau b;
    public final bjgh c;
    public final bwrs<ilo> d;
    @dzsi
    dqcq e;
    public Boolean f;
    private final Map<dbsg<dqcq>, bizt> g;
    private final jbk h;
    private final bjcj i;
    @dzsi
    private final bjbg j;
    private final bjbn k;
    private bjcg l;

    public bizu(final gga ggaVar, bjcj bjcjVar, bjau bjauVar, bjbh bjbhVar, bjbr bjbrVar, bjhs bjhsVar, bjgi bjgiVar, bjgu bjguVar, bwrs<ilo> bwrsVar) {
        HashMap hashMap = new HashMap();
        this.g = hashMap;
        this.f = false;
        new bizr(this);
        this.i = bjcjVar;
        this.b = bjauVar;
        this.a = bjhsVar;
        this.d = bwrsVar;
        ggaVar.getClass();
        new Runnable(ggaVar) { // from class: bizo
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.onBackPressed();
            }
        };
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.l = bjcjVar.a(bwrsVar, dtxy.fJ);
        gga a = bjbrVar.a.a();
        bjbr.a(a, 1);
        bjbu a2 = bjbrVar.b.a();
        bjbr.a(a2, 2);
        bjhc a3 = bjbrVar.c.a();
        bjbr.a(a3, 3);
        bjbr.a(c, 4);
        this.k = new bjbq(a, a2, a3, c);
        this.c = bjgiVar.b(c);
        bjgr.d(c);
        hashMap.put(dbpy.a, new bizt(this, null));
        djai djaiVar = c.h().bd;
        dsrj<dqcq> dsrjVar = (djaiVar == null ? djai.g : djaiVar).e;
        if (bjgb.a(c) && !dsrjVar.isEmpty()) {
            for (dqcq dqcqVar : dsrjVar) {
                this.g.put(dbsg.i(dqcqVar), new bizt(this, dqcqVar));
            }
            cjtd bZ = c.bZ();
            bizp bizpVar = new bizp(this);
            cqhn a4 = bjbhVar.a.a();
            bjbh.a(a4, 1);
            gga a5 = bjbhVar.b.a();
            bjbh.a(a5, 2);
            bkan a6 = bjbhVar.c.a();
            bjbh.a(a6, 3);
            bjbh.a(dsrjVar, 4);
            bjbh.a(bZ, 5);
            bjbh.a(bizpVar, 6);
            this.j = new bjbg(a4, a5, a6, dsrjVar, bZ, bizpVar);
        } else {
            this.j = null;
        }
        final String string = ggaVar.getString(R.string.PLACE_QA_ALL_QUESTIONS_PAGE_TITLE, new Object[]{c.n()});
        this.h = new jbk(ggaVar, string) { // from class: bizq
            private final gga a;
            private final String b;

            {
                this.a = ggaVar;
                this.b = string;
            }

            @Override // defpackage.jbk
            public jib NC() {
                return jib.g(this.a, this.b);
            }
        };
    }

    private final bizt l() {
        bizt biztVar = this.g.get(dbsg.j(this.e));
        dbsk.s(biztVar);
        return biztVar;
    }

    @Override // defpackage.bjgv
    public void QW() {
        for (bizt biztVar : this.g.values()) {
            for (bjap bjapVar : biztVar.d()) {
                bjapVar.QW();
            }
            for (bjwq bjwqVar : dcdc.r(biztVar.b)) {
                bjwqVar.QW();
            }
        }
    }

    @Override // defpackage.bizn
    public bjcg a() {
        return this.l;
    }

    @Override // defpackage.bizn
    public bjbn b() {
        return this.k;
    }

    @Override // defpackage.bizn
    public List<bjap> c() {
        return l().d();
    }

    @Override // defpackage.bizn
    @dzsi
    public bjbd d() {
        return this.j;
    }

    @Override // defpackage.bizn
    public cqrh e() {
        return l().c.b;
    }

    @Override // defpackage.bizn
    @dzsi
    public cqkp f() {
        return l().c.d;
    }

    @Override // defpackage.bjfj
    public jbk h() {
        return this.h;
    }

    @Override // defpackage.bjfj
    public void i(Bundle bundle) {
        bjbg bjbgVar;
        dqcq dqcqVar = (dqcq) bvrs.e(bundle, dqcq.class, (dssr) dqcq.c.cu(7));
        this.e = dqcqVar;
        if (dqcqVar == null || (bjbgVar = this.j) == null) {
            return;
        }
        bjbgVar.c(dqcqVar);
    }

    @Override // defpackage.bjfj
    public void j(Bundle bundle) {
        dqcq dqcqVar = this.e;
        if (dqcqVar != null) {
            bvrs.l(bundle, dqcqVar);
        }
    }

    @Override // defpackage.bjfc
    public void k(bjfb bjfbVar) {
        if (bjfbVar instanceof bjff) {
            this.l = this.i.a(this.d, dtxy.fJ);
        }
        for (bizt biztVar : this.g.values()) {
            biztVar.a.clear();
            biztVar.b.clear();
            biztVar.c.c();
        }
        cqkx.p(this);
    }
}
