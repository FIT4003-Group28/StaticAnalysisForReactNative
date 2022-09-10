package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: brzt  reason: default package */
/* loaded from: classes4.dex */
public class brzt implements brzq {
    @dzsi
    public bsig a;
    private final btvo c;
    private final bsih d;
    @dzsi
    private final bsid e;
    private final dzsj<bsjd> f;
    private final dzsj<bshj> g;
    private final dzsj<bshy> h;
    private final dzsj<bsim> i;
    private final dzsj<bsiq> j;
    private final dzsj<bsjf> k;
    private final dzsj<bsif> l;
    private final dzsj<bsjg> m;
    private final dzsj<bshe> n;
    private final dzsj<bsip> o;
    private final dzsj<bsiy> p;
    private final dzsj<bshp> q;
    private final dzsj<bshc> r;
    private final brzj s;
    private final brzs t;
    private final cjmt u;
    private final eff v;
    private final List<bsgt> b = new ArrayList();
    private bsjm w = new bsjm();

    public brzt(brzk brzkVar, bsih bsihVar, dzsj<bsjd> dzsjVar, dzsj<bshj> dzsjVar2, dzsj<bshy> dzsjVar3, @dzsi bsid bsidVar, dzsj<bsim> dzsjVar4, dzsj<bsiq> dzsjVar5, dzsj<bsjf> dzsjVar6, dzsj<bsif> dzsjVar7, dzsj<bsjg> dzsjVar8, dzsj<bshe> dzsjVar9, dzsj<bsip> dzsjVar10, dzsj<bsiy> dzsjVar11, dzsj<bshp> dzsjVar12, dzsj<bshc> dzsjVar13, btvo btvoVar, gga ggaVar, cjmt cjmtVar, eff effVar, brzs brzsVar) {
        this.c = btvoVar;
        this.t = brzsVar;
        this.d = bsihVar;
        this.f = dzsjVar;
        this.g = dzsjVar2;
        this.h = dzsjVar3;
        this.e = bsidVar;
        this.i = dzsjVar4;
        this.j = dzsjVar5;
        this.k = dzsjVar6;
        this.l = dzsjVar7;
        this.m = dzsjVar8;
        this.n = dzsjVar9;
        this.o = dzsjVar10;
        this.p = dzsjVar11;
        this.q = dzsjVar12;
        this.r = dzsjVar13;
        this.v = effVar;
        this.u = cjmtVar;
        brzr brzrVar = new brzr(brzsVar);
        String string = ggaVar.getString(R.string.RESTRICTION_FILTER_RESULTS);
        cqhn a = brzkVar.a.a();
        brzk.a(a, 1);
        brzk.a(brzrVar, 2);
        brzk.a(string, 3);
        this.s = new brzj(a, brzrVar, string);
    }

    private final void h() {
        for (bsgt bsgtVar : this.b) {
            bsgtVar.m(this.w);
        }
    }

    @Override // defpackage.brzq
    public cqkl a(cjqm cjqmVar) {
        for (bsgt bsgtVar : this.b) {
            bsgtVar.n(this.w);
        }
        brzs brzsVar = this.t;
        bsjm bsjmVar = this.w;
        brzg brzgVar = (brzg) brzsVar;
        brzgVar.d.a(ckls.REFINEMENT_ITEM_CLICKED);
        ((ckhe) brzgVar.b.a(ckjw.E)).a();
        ((gen) brzsVar).Ra(bsjn.e(bsjmVar, dtxp.f, cjqmVar));
        return cqkl.a;
    }

    @Override // defpackage.brzq
    public cqkl b() {
        bsjm bsjmVar = this.w;
        for (Map.Entry<Integer, Set<dspd>> entry : bsjmVar.b.entrySet()) {
            if (entry.getKey().intValue() != 18) {
                entry.getValue().clear();
            }
        }
        bsjmVar.t();
        h();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.brzq
    public List<bsgt> c() {
        return this.b;
    }

    @Override // defpackage.brzq
    public jbk d() {
        return this.s;
    }

    @Override // defpackage.brzq
    public Integer e() {
        return Integer.valueOf(this.v.a ? this.u.e() : 0);
    }

    public void f(bsjm bsjmVar) {
        this.w = new bsjm(bsjmVar);
        this.b.clear();
        dnnn n = this.w.n();
        if (aehr.c(n)) {
            if (this.a == null) {
                bsih bsihVar = this.d;
                ddho ddhoVar = dtya.u;
                ddho ddhoVar2 = dtya.x;
                dbsk.s(n);
                aehu d = aehr.d(n);
                Activity activity = (Activity) ((dxjd) bsihVar.a).a;
                bsih.a(activity, 1);
                aenp a = bsihVar.b.a();
                bsih.a(a, 2);
                aehr a2 = bsihVar.c.a();
                bsih.a(a2, 3);
                aeol a3 = bsihVar.d.a();
                bsih.a(a3, 4);
                cqat a4 = bsihVar.e.a();
                bsih.a(a4, 5);
                cqkj a5 = bsihVar.f.a();
                bsih.a(a5, 6);
                btvo a6 = bsihVar.g.a();
                bsih.a(a6, 7);
                cqhu a7 = bsihVar.h.a();
                bsih.a(a7, 8);
                aeqi a8 = bsihVar.i.a();
                bsih.a(a8, 9);
                bsih.a(ddhoVar, 10);
                bsih.a(ddhoVar2, 11);
                bsih.a(d, 12);
                this.a = new bsig(activity, a, a2, a3, a4, a5, a6, a7, a8, ddhoVar, ddhoVar2, d, true);
            }
            List<bsgt> list = this.b;
            bsig bsigVar = this.a;
            dbsk.s(bsigVar);
            list.add(bsigVar);
        }
        if (this.w.w(18)) {
            this.b.add(this.f.a().a());
        }
        if (this.w.w(8)) {
            this.b.add(this.i.a());
        }
        if (this.w.w(2)) {
            this.b.add(this.j.a());
        }
        if (this.w.w(3)) {
            this.b.add(this.k.a());
        }
        if (this.w.w(5)) {
            this.b.add(this.l.a());
        }
        if (this.w.w(11)) {
            this.b.add(this.h.a());
        }
        if (this.w.w(32) && this.e != null && this.c.getCategoricalSearchParameters().g()) {
            this.b.add(this.e);
        }
        if (this.w.w(4)) {
            this.b.add(this.o.a());
        }
        if (this.w.w(17)) {
            this.b.add(this.m.a());
        }
        if (this.w.w(6)) {
            this.b.add(this.n.a().a());
        }
        if (this.w.w(16)) {
            this.b.add(this.p.a());
        }
        if (this.w.w(24)) {
            this.b.add(this.q.a().a());
        }
        if (this.w.w(26)) {
            this.b.add(this.g.a().a());
        }
        if (this.w.w(43)) {
            this.b.add(this.r.a().a());
        }
        h();
    }

    public void g(boolean z) {
        this.s.b(true);
    }
}
