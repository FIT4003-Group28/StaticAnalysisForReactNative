package defpackage;

import android.app.Activity;
import android.app.Application;
import android.text.Html;
import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwt  reason: default package */
/* loaded from: classes5.dex */
public class cwt implements cwz {
    private static final jic a = new jic(null, ckqc.FULLY_QUALIFIED, null, 250, null);
    private final Application b;
    private final acmv c;
    private final Activity d;
    private final cys e;
    private final cwy f;
    private final btvo g;
    private final cws h;
    private final dxio<afha> i;
    private dbsg<ikz> j = dbpy.a;
    private jic k = a;
    private akqi l;
    @dzsi
    private cjtd m;

    public cwt(cws cwsVar, Application application, Activity activity, btvo btvoVar, cyt cytVar, cwy cwyVar, dxio<afha> dxioVar) {
        this.h = cwsVar;
        String string = activity.getString(R.string.AD);
        activity.getResources();
        this.c = acpd.a(string);
        this.b = application;
        this.d = activity;
        this.e = cytVar.a();
        this.f = cwyVar;
        this.l = akqi.a;
        this.g = btvoVar;
        this.i = dxioVar;
    }

    private final boolean A(int i) {
        return (((float) (i + 150)) * this.b.getResources().getConfiguration().fontScale) / ((float) this.b.getResources().getConfiguration().screenHeightDp) < this.g.getSearchParameters().j();
    }

    private final boolean B() {
        return this.j.a() && this.j.b().d() == 2;
    }

    @dzsi
    private final cjtd z(ddho ddhoVar) {
        if (!w().booleanValue()) {
            return null;
        }
        cjta c = cjtd.c(this.m);
        c.d = ddhoVar;
        if (!dbsd.a(this.l, akqi.a)) {
            c.g = decs.a(this.l.c);
        }
        return c.a();
    }

    @Override // defpackage.beer
    public Integer a() {
        return Integer.valueOf(jmj.a(this.d, this.h.d));
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
        boolean z = false;
        if (this.j.a() && !dbsj.d(this.j.b().b)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.beer
    public String e() {
        return this.j.a() ? dbsj.e(this.j.b().b) : "";
    }

    @Override // defpackage.beer
    public CharSequence f() {
        if (!this.j.a()) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        cwy.c(spannableStringBuilder, this.d.getResources());
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) alp.a().b(Html.fromHtml(dbsj.e(this.j.b().b)).toString()));
        return spannableStringBuilder;
    }

    @Override // defpackage.beer
    public String g() {
        return !this.j.a() ? "" : (this.h != cws.TRAVERSAL_VIEW || A(104)) ? dbsj.e(this.j.b().c) : "";
    }

    @Override // defpackage.beer
    public Boolean h() {
        return false;
    }

    @Override // defpackage.beer
    public Boolean i() {
        return false;
    }

    @Override // defpackage.beer
    public String j() {
        return this.j.a() ? dbsj.e(this.j.b().e) : "";
    }

    @Override // defpackage.beer
    public String k() {
        return this.j.a() ? dbsj.e(this.j.b().f) : "";
    }

    @Override // defpackage.beer
    public acmv l() {
        return this.c;
    }

    @Override // defpackage.beer
    public jic m() {
        return this.k;
    }

    @Override // defpackage.beer
    @dzsi
    public cjtd n() {
        return z(this.h.e);
    }

    @Override // defpackage.beer
    @dzsi
    public cjtd o() {
        if (this.h == cws.PLACESHEET) {
            return z(dtxy.mh);
        }
        return null;
    }

    @Override // defpackage.beer
    public Boolean p() {
        return false;
    }

    @Override // defpackage.beer
    public cqkl q() {
        if (this.j.a()) {
            String str = this.j.b().o;
            if (!dbsj.d(str)) {
                this.i.a().k(this.d, str, 1);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.beer
    public Boolean r() {
        boolean z = true;
        if (!this.j.a() || this.j.b().l == null || (this.h != cws.PLACESHEET && !B())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.beer
    public cyg s() {
        return this.e;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null || !c.aM()) {
            u();
            return;
        }
        ikz ikzVar = c.d;
        this.j = dbsg.i(ikzVar);
        this.e.f(ikzVar.l);
        String n = c.n();
        String str = ikzVar.f;
        if (!dbsj.d(str) && !dbsj.d(n)) {
            this.e.h(this.d.getString(R.string.WHY_THIS_AD_SPEAKABLE_TEXT, new Object[]{str, n}));
        }
        this.k = new jic(ikzVar.a(), ckqc.FULLY_QUALIFIED, null, 250, null);
        this.l = c.ai();
        this.m = c.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.j = dbpy.a;
        this.l = akqi.a;
        this.k = a;
        this.e.f(null);
        this.m = null;
    }

    @Override // defpackage.beer
    public Boolean v() {
        boolean z = true;
        if (!w().booleanValue() || (this.h == cws.TRAVERSAL_VIEW && !A(64))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = false;
        if (this.g.getAdsParameters().o && B()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cwz
    public Boolean x() {
        boolean z = true;
        if (this.h != cws.PLACESHEET && !B()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cwz
    public Boolean y() {
        return Boolean.valueOf(B());
    }
}
