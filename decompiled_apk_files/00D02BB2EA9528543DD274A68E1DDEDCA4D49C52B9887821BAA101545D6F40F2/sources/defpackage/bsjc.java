package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsjc  reason: default package */
/* loaded from: classes4.dex */
public class bsjc implements bsgz, bsgt, bsha {
    private static final dspd b;
    private static final dspd c;
    private static final dcdn<dspd, ddho> d;
    List<djkt> a;
    private final djkt e;
    private final Resources f;
    @dzsi
    private dspd g;
    private djkt h;
    private djkt i;
    @dzsi
    private final bsjb j;

    static {
        djmu bZ = djmv.c.bZ();
        djnp bZ2 = djnr.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djnr djnrVar = (djnr) bZ2.b;
        djnrVar.b = 1;
        djnrVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        djnr bK = bZ2.bK();
        bK.getClass();
        djmvVar.b = bK;
        djmvVar.a = 10;
        dspd bR = bZ.bK().bR();
        b = bR;
        djmu bZ3 = djmv.c.bZ();
        djnp bZ4 = djnr.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djnr djnrVar2 = (djnr) bZ4.b;
        djnrVar2.b = 3;
        djnrVar2.a |= 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djmv djmvVar2 = (djmv) bZ3.b;
        djnr bK2 = bZ4.bK();
        bK2.getClass();
        djmvVar2.b = bK2;
        djmvVar2.a = 10;
        dspd bR2 = bZ3.bK().bR();
        c = bR2;
        ddho ddhoVar = dtxp.aa;
        djmu bZ5 = djmv.c.bZ();
        djnp bZ6 = djnr.c.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        djnr djnrVar3 = (djnr) bZ6.b;
        djnrVar3.b = 2;
        djnrVar3.a |= 1;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        djmv djmvVar3 = (djmv) bZ5.b;
        djnr bK3 = bZ6.bK();
        bK3.getClass();
        djmvVar3.b = bK3;
        djmvVar3.a = 10;
        dspd bR3 = bZ5.bK().bR();
        ddho ddhoVar2 = dtxp.W;
        djmu bZ7 = djmv.c.bZ();
        djnp bZ8 = djnr.c.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        djnr djnrVar4 = (djnr) bZ8.b;
        djnrVar4.b = 11;
        djnrVar4.a = 1 | djnrVar4.a;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        djmv djmvVar4 = (djmv) bZ7.b;
        djnr bK4 = bZ8.bK();
        bK4.getClass();
        djmvVar4.b = bK4;
        djmvVar4.a = 10;
        d = dcdn.n(bR, ddhoVar, bR3, ddhoVar2, bZ7.bK().bR(), dtxp.Z, bR2, dtxp.X);
    }

    public bsjc(Resources resources, cqhn cqhnVar) {
        this(resources, cqhnVar, null);
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        return Boolean.valueOf(i < c().intValue());
    }

    @Override // defpackage.bsgz
    /* renamed from: a */
    public String h() {
        return this.f.getString(R.string.SEARCH_SORT_BY);
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(this.a.size());
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        if (i >= c().intValue()) {
            return false;
        }
        return Boolean.valueOf(dbsd.a(this.a.get(i).c, this.g));
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        djkt djktVar = this.a.get(i);
        this.h = djktVar;
        this.g = djktVar.c;
        cqkx.p(this);
        bsjb bsjbVar = this.j;
        if (bsjbVar != null) {
            ((bsac) bsjbVar).a.a(cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        if (i >= c().intValue()) {
            return null;
        }
        dspd dspdVar = this.a.get(i).c;
        dcdn<dspd, ddho> dcdnVar = d;
        if (dcdnVar.containsKey(dspdVar)) {
            ddho ddhoVar = dcdnVar.get(dspdVar);
            dbsk.s(ddhoVar);
            return cjtd.a(ddhoVar);
        }
        return cjtd.a(dtxp.Y);
    }

    @Override // defpackage.bsgz
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        return false;
    }

    @Override // defpackage.jab
    /* renamed from: l */
    public String e(int i) {
        return i < c().intValue() ? this.a.get(i).b : "";
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        this.a = dchl.b(this.e);
        for (djkt djktVar : bsjmVar.v(18)) {
            if (!djktVar.c.equals(b)) {
                this.a.add(djktVar);
            }
            if (this.a.size() >= 3) {
                break;
            }
        }
        this.g = null;
        Set<dspd> c2 = bsjmVar.c(17);
        if (c2.isEmpty()) {
            djkt djktVar2 = this.e;
            this.h = djktVar2;
            this.i = djktVar2;
            this.g = b;
        }
        if (c2.size() == 1) {
            dspd next = c2.iterator().next();
            for (djkt djktVar3 : this.a) {
                if (djktVar3.c.equals(next)) {
                    this.h = djktVar3;
                    this.i = djktVar3;
                    this.g = next;
                }
            }
        }
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        dspd dspdVar = this.g;
        if (dspdVar == null) {
            return;
        }
        if (dspdVar.equals(b)) {
            this.i = this.e;
            bsjmVar.e(17);
            return;
        }
        this.i = this.h;
        bsjmVar.u(17, dspdVar, 2);
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        cqivVar.a(new bsfy(), this);
    }

    @Override // defpackage.bsgz
    /* renamed from: p */
    public String j(int i) {
        String string;
        if (i >= c().intValue()) {
            return "";
        }
        if (this.h.equals(this.a.get(i))) {
            string = this.f.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.f.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return this.f.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, e(i), string);
    }

    @Override // defpackage.bsha
    public String q() {
        return t() ? this.i.b : this.f.getString(R.string.SEARCH_SORT_BY);
    }

    @Override // defpackage.bsha
    public String r() {
        return this.f.getString(R.string.SEARCH_SORT_BY);
    }

    @Override // defpackage.bsha
    @dzsi
    public cqtd s() {
        return null;
    }

    @Override // defpackage.bsha
    public boolean t() {
        return this.g != null;
    }

    @Override // defpackage.bsha
    public void u(cqiv cqivVar) {
        cqivVar.a(new bsfm(), this);
    }

    public bsjc(Resources resources, cqhn cqhnVar, @dzsi bsjb bsjbVar) {
        this.a = dcdc.e();
        this.f = resources;
        this.j = bsjbVar;
        djks bZ = djkt.e.bZ();
        String string = resources.getString(R.string.SEARCH_SORT_RELEVANCE);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djkt djktVar = (djkt) bZ.b;
        string.getClass();
        djktVar.a |= 1;
        djktVar.b = string;
        dspd dspdVar = b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djkt djktVar2 = (djkt) bZ.b;
        dspdVar.getClass();
        djktVar2.a |= 2;
        djktVar2.c = dspdVar;
        djkt bK = bZ.bK();
        this.e = bK;
        this.h = bK;
        this.i = bK;
    }
}
