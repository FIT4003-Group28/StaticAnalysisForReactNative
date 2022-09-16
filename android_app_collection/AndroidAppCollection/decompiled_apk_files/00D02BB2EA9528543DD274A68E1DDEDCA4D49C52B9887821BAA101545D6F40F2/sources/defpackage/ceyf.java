package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ceyf  reason: default package */
/* loaded from: classes4.dex */
public class ceyf extends ceve<dwvz, dwwb> {
    public boolean a;
    private final Activity b;
    private final btrm c;
    private final cevb h;
    @dzsi
    private final ceuw<dwvy> i;

    public ceyf(Activity activity, btrm btrmVar, cqhn cqhnVar, btvo btvoVar, cefh cefhVar, ceuo ceuoVar, nvh nvhVar, isd isdVar, cese ceseVar, cebr cebrVar, cgrc cgrcVar, cevb cevbVar, String str, @dzsi String str2, @dzsi drfs drfsVar) {
        super(activity, cqhnVar, cefhVar.a(cgrcVar, cesf.a(str2, btvoVar, ceuoVar.f(), drfsVar, ceseVar, cebrVar)), nvhVar, ceuoVar, str);
        this.a = false;
        this.b = activity;
        this.c = btrmVar;
        this.h = cevbVar;
        this.i = btvoVar.getUgcParameters().U() ? new ceuw<>(activity, cqhnVar, isdVar, ceseVar, dcdc.i(new cerv(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_NEWEST), dwvy.NEWEST, cjtd.a(dtyd.cn)), new cerv(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_OLDEST), dwvy.OLDEST, cjtd.a(dtyd.co)), new cerv(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_MOST_LIKED), dwvy.MOST_LIKED, cjtd.a(dtyd.cl)), new cerv(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_MOST_VIEWED), dwvy.MOST_VIEWED, cjtd.a(dtyd.cm))), new ceye(this), true) : null;
    }

    @Override // defpackage.ceey
    public void c(btzy btzyVar) {
        this.f.g();
    }

    @Override // defpackage.cesp
    public void g(cqiv cqivVar) {
        ceuw<dwvy> ceuwVar = this.i;
        if (ceuwVar != null && !ceuwVar.e().isEmpty() && !q()) {
            cqivVar.a(new cehc(), this.i);
        }
        cqivVar.a(new cegl(), this);
    }

    @Override // defpackage.cesp
    public cjtd i() {
        return cjtd.a(dtxl.fz);
    }

    @Override // defpackage.ceve
    protected final nvg j() {
        return this.d.a(nxl.CONTRIBUTIONS_REVIEWS_PAGE, null);
    }

    @Override // defpackage.cevg
    public void k(Bundle bundle) {
        this.e.d(bundle);
        this.f.j(bundle);
        ceuw<dwvy> ceuwVar = this.i;
        if (ceuwVar != null) {
            ceuwVar.i(bundle);
        }
    }

    @Override // defpackage.cevg
    public void l(Bundle bundle) {
        this.e.e(bundle);
        this.f.k(bundle);
        ceuw<dwvy> ceuwVar = this.i;
        if (ceuwVar != null) {
            ceuwVar.j(bundle);
        }
    }

    @Override // defpackage.ceey
    /* renamed from: m */
    public void b(dwwb dwwbVar) {
        this.e.b(dwwbVar.c, dwwbVar.i);
        ceuw<dwvy> ceuwVar = this.i;
        if (ceuwVar != null) {
            if ((dwwbVar.a & 2) != 0) {
                ceuwVar.h(dwwbVar.f);
            }
            if (this.a) {
                this.h.i(this.b.getString(R.string.CONTRIBUTIONS_REVIEW_SORTED_ACCESSIBILITY_ANNOUNCEMENT, new Object[]{this.i.d().a}));
                this.a = false;
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.ceve, defpackage.cevg
    public void n() {
        super.n();
        btrm btrmVar = this.c;
        dceq a = dcet.a();
        a.b(bqje.class, new ceyh(bqje.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.cevg
    public void s() {
        this.c.a(this);
    }

    public void u(bqje bqjeVar) {
        if (bqjeVar.c == 1) {
            ceuw<dwvy> ceuwVar = this.i;
            if (ceuwVar != null) {
                ceuwVar.h("");
            }
            this.e.c();
            this.f.h();
            cqkx.p(this);
        }
    }
}
