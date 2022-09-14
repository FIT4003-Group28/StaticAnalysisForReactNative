package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bhsl  reason: default package */
/* loaded from: classes3.dex */
public class bhsl implements bhry {
    private final btvo a;
    private final ccln b;
    private final bvqg<ccln> c;
    private final jic d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Boolean i;
    private final Boolean j;
    private final bwrs<ilo> k;

    public bhsl(btvo btvoVar, ccln cclnVar, bvqg<ccln> bvqgVar, Resources resources, int i, boolean z, bwrs<ilo> bwrsVar) {
        jic jicVar;
        this.a = btvoVar;
        this.b = cclnVar;
        this.c = bvqgVar;
        this.j = Boolean.valueOf(z);
        this.k = bwrsVar;
        boolean z2 = false;
        if (cclnVar.i.size() > 0) {
            jicVar = new jic(cclnVar.i.get(0).h, jfv.b(cclnVar.i.get(0)), ibm.h(), 250);
        } else {
            jicVar = new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.carousel_placeholder_dish), 0);
        }
        this.d = jicVar;
        this.e = n(cclnVar.g);
        this.f = n(cclnVar.h);
        this.g = cclnVar.m;
        if (cclnVar.f.isEmpty()) {
            this.h = resources.getString(R.string.OFFERING_CARD_UNNAMED_DISH_ACCESSIBILITY_DESCRIPTION, Integer.valueOf(i + 1));
        } else if (cclnVar.m.isEmpty() || btvoVar.getPlaceMenuParameters().d()) {
            this.h = resources.getString(R.string.OFFERING_CARD_NAMED_DISH_ACCESSIBILITY_DESCRIPTION, Integer.valueOf(i + 1), cclnVar.f);
        } else {
            this.h = resources.getString(R.string.OFFERING_CARD_NAMED_DISH_WITH_PRICE_ACCESSIBILITY_DESCRIPTION, Integer.valueOf(i + 1), cclnVar.f, cclnVar.m);
        }
        if (z) {
            if (!cclnVar.f.isEmpty() && i < 8 && cclnVar.g + cclnVar.h >= 6) {
                z2 = true;
            }
        } else {
            z2 = dcbg.b(cclnVar.o).r(bhsi.a).a();
        }
        this.i = Boolean.valueOf(z2);
    }

    private static String n(int i) {
        return i > 0 ? String.format(Locale.getDefault(), "%d", Integer.valueOf(i)) : "";
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.bhry
    public String b() {
        return this.b.f;
    }

    @Override // defpackage.bhry
    public jic c() {
        return this.d;
    }

    @Override // defpackage.bhry
    public String d() {
        return this.e;
    }

    @Override // defpackage.bhry
    public String e() {
        return this.f;
    }

    @Override // defpackage.bhry
    public Boolean f() {
        return Boolean.valueOf(!this.a.getUgcOfferingsParameters().a());
    }

    @Override // defpackage.bhry
    public String g() {
        return this.g;
    }

    @Override // defpackage.bhry
    public Boolean h() {
        return Boolean.valueOf(this.a.getPlaceMenuParameters().d());
    }

    @Override // defpackage.bhry
    public cjtd i() {
        cjta b = cjtd.b();
        b.d = dtxv.ax;
        if (h().booleanValue()) {
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        return b.a();
    }

    @Override // defpackage.bhry
    public String j() {
        return this.h;
    }

    @Override // defpackage.bhry
    public Boolean k() {
        boolean z = true;
        if (!this.i.booleanValue() || (!this.j.booleanValue() && !this.a.getPlaceOfferingsParameters().i())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhry
    public cjtd l(ddho ddhoVar) {
        ilo c = this.k.c();
        if (c != null) {
            cjta c2 = cjtd.c(c.ca());
            c2.d = ddhoVar;
            return c2.a();
        }
        return cjtd.b;
    }

    @Override // defpackage.bhry
    public cqkl m() {
        this.c.NU(this.b);
        return cqkl.a;
    }
}
