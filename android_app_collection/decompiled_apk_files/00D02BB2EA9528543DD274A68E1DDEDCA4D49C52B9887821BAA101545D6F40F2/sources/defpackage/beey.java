package defpackage;

import android.app.Activity;
import android.app.Application;
import android.text.Html;
import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beey  reason: default package */
/* loaded from: classes3.dex */
public class beey implements cwz {
    private static final jic a = new jic(null, ckqc.FULLY_QUALIFIED, null, 250, null);
    private final Application b;
    private final acmv c;
    private final jkf d;
    private final Activity e;
    private final cys f;
    private final btrm g;
    private final cwy h;
    private final boolean i;
    private final btvo j;
    private final dxio<afha> k;
    private final beex l;
    private akqi o;
    @dzsi
    private String q;
    private dbsg<ikz> m = dbpy.a;
    private jic n = a;
    private cjtd p = cjtd.b;

    public beey(beex beexVar, Application application, btrm btrmVar, jkf jkfVar, Activity activity, btvo btvoVar, cyt cytVar, cwy cwyVar, dxio<afha> dxioVar) {
        acmw b;
        this.l = beexVar;
        this.b = application;
        this.g = btrmVar;
        if (btvoVar.getAdsParameters().l) {
            String string = activity.getString(R.string.AD);
            activity.getResources();
            b = acpd.a(string);
        } else {
            String string2 = activity.getString(R.string.AD);
            int a2 = dujv.a(btvoVar.getAdsParameters().b);
            b = acpd.b(string2, a2 == 0 ? 1 : a2, activity.getResources());
        }
        this.c = b;
        this.d = jkfVar;
        this.e = activity;
        this.f = cytVar.a();
        this.h = cwyVar;
        this.i = btvoVar.getAdsParameters().d;
        this.o = akqi.a;
        this.j = btvoVar;
        this.k = dxioVar;
    }

    private final boolean B(int i, beex beexVar) {
        return beexVar != beex.TRAVERSAL_VIEW || (((float) (i + 150)) * this.b.getResources().getConfiguration().fontScale) / ((float) this.b.getResources().getConfiguration().screenHeightDp) < this.j.getSearchParameters().j();
    }

    @dzsi
    private final cjtd C(ddho ddhoVar) {
        String str = null;
        if (!this.m.a()) {
            return null;
        }
        jjn L = this.d.l().L();
        jjn E = this.d.l().E(L);
        if (this.l == beex.PLACESHEET_HEADER && !A()) {
            return null;
        }
        cjta c = cjtd.c(this.p);
        c.d = ddhoVar;
        ddqc bZ = ddqk.h.bZ();
        int s = cjqg.s(E);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddqk ddqkVar = (ddqk) bZ.b;
        ddqkVar.e = s - 1;
        ddqkVar.a |= 8;
        int s2 = cjqg.s(L);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddqk ddqkVar2 = (ddqk) bZ.b;
        ddqkVar2.d = s2 - 1;
        ddqkVar2.a |= 4;
        c.n(bZ.bK());
        if (!dbsd.a(this.o, akqi.a)) {
            c.g = decs.a(this.o.c);
        }
        if (this.i) {
            c.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        } else {
            dvuy dvuyVar = this.m.b().k;
            if (dvuyVar != null) {
                str = dvuyVar.o;
            }
            if (!dbsj.d(str)) {
                this.g.b(new becx(str, 2));
            }
        }
        return c.a();
    }

    @dzsi
    private final String D() {
        if (!dbsj.d(this.m.b().b)) {
            return this.m.b().b;
        }
        return this.m.b().c;
    }

    public boolean A() {
        return w().booleanValue() && this.j.getAdsParameters().e;
    }

    @Override // defpackage.beer
    public Integer a() {
        return Integer.valueOf(this.l.e);
    }

    @Override // defpackage.beer
    public cqtv b() {
        return cqrp.d(80.0d);
    }

    @Override // defpackage.beer
    public cqtv c() {
        return cqrp.d(80.0d);
    }

    @Override // defpackage.beer
    public Boolean d() {
        if (!this.m.a()) {
            return false;
        }
        return Boolean.valueOf(!dbsj.d(this.m.b().b));
    }

    @Override // defpackage.beer
    public String e() {
        return !this.m.a() ? "" : dbsj.e(D());
    }

    @Override // defpackage.beer
    public CharSequence f() {
        if (!this.m.a()) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.j.getAdsParameters().l) {
            cwy.c(spannableStringBuilder, this.e.getResources());
        } else {
            this.h.b(spannableStringBuilder, this.e.getResources());
            spannableStringBuilder.append((CharSequence) " ");
        }
        spannableStringBuilder.append((CharSequence) alp.a().b(Html.fromHtml(dbsj.e(D())).toString()));
        return spannableStringBuilder;
    }

    @Override // defpackage.beer
    public String g() {
        String str;
        if (this.m.a() && B(104, this.l)) {
            if (dbsj.d(this.m.b().b) || dbsj.d(this.m.b().c)) {
                str = this.m.b().d;
            } else {
                str = this.m.b().c;
            }
            return dbsj.e(str);
        }
        return "";
    }

    @Override // defpackage.beer
    public Boolean h() {
        return false;
    }

    @Override // defpackage.beer
    public Boolean i() {
        if (!this.m.a()) {
            return false;
        }
        return Boolean.valueOf(dbsj.d(this.m.b().b));
    }

    @Override // defpackage.beer
    public String j() {
        return !this.m.a() ? "" : dbsj.e(this.m.b().e);
    }

    @Override // defpackage.beer
    public String k() {
        return !this.m.a() ? "" : dbsj.e(this.m.b().f);
    }

    @Override // defpackage.beer
    public acmv l() {
        return this.c;
    }

    @Override // defpackage.beer
    public jic m() {
        return this.n;
    }

    @Override // defpackage.beer
    @dzsi
    public cjtd n() {
        return C(this.l.f);
    }

    @Override // defpackage.beer
    @dzsi
    public cjtd o() {
        if (this.l == beex.PLACESHEET || this.l == beex.PLACESHEET_HEADER) {
            if (this.l == beex.PLACESHEET_HEADER) {
                return C(dtxy.iL);
            }
            return C(dtxy.gX);
        }
        return null;
    }

    @Override // defpackage.beer
    public Boolean p() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.beer
    public cqkl q() {
        if (this.m.a()) {
            String str = this.m.b().g;
            if (!dbsj.d(str)) {
                this.k.a().k(this.e, str, 1);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.beer
    public Boolean r() {
        boolean z = false;
        if (this.m.a() && this.m.b().l != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.beer
    public cyg s() {
        return this.f;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        z((ilo) bwrs.b(bwrsVar));
    }

    @Override // defpackage.bega
    public void u() {
        this.m = dbpy.a;
        this.o = akqi.a;
        this.q = null;
        this.n = a;
        this.p = cjtd.b;
    }

    @Override // defpackage.beer
    public Boolean v() {
        boolean z = false;
        if (this.l != beex.PLACESHEET_HEADER || A()) {
            if (w().booleanValue() && !p().booleanValue() && B(64, this.l)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.m.a());
    }

    @Override // defpackage.cwz
    public Boolean x() {
        return true;
    }

    @Override // defpackage.cwz
    public Boolean y() {
        return false;
    }

    public void z(@dzsi ilo iloVar) {
        if (iloVar == null) {
            u();
        } else if (!iloVar.aO() || iloVar.cE()) {
            u();
        } else {
            this.q = iloVar.n();
            ikz ikzVar = iloVar.d;
            dbsk.s(ikzVar);
            this.m = dbsg.i(ikzVar);
            this.f.f(ikzVar.l);
            String str = ikzVar.f;
            if (!dbsj.d(str) && !dbsj.d(this.q)) {
                this.f.h(this.e.getString(R.string.WHY_THIS_AD_SPEAKABLE_TEXT, new Object[]{str, this.q}));
            }
            this.n = new jic(ikzVar.a(), ckqc.FULLY_QUALIFIED, null, 250, null);
            this.o = iloVar.ai();
            this.p = iloVar.a();
        }
    }
}
