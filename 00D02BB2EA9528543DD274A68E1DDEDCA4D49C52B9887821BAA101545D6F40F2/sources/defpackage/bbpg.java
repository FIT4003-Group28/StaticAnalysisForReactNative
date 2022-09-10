package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbpg  reason: default package */
/* loaded from: classes3.dex */
public class bbpg implements abmh {
    public bwrs<ilo> a;
    private final Resources b;
    private final List<brye> c = dchl.a();
    private final bbek d;

    public bbpg(gga ggaVar, bbek bbekVar) {
        this.b = ggaVar.getResources();
        this.d = bbekVar;
        bbekVar.a();
    }

    @Override // defpackage.abmh
    public void a(ilo iloVar) {
        bwrs<ilo> bwrsVar = this.a;
        if (bwrsVar == null) {
            this.a = bwrs.a(iloVar);
        } else {
            bwrsVar.d(iloVar);
        }
    }

    @Override // defpackage.bryf
    public cqkl b() {
        for (brye bryeVar : this.c) {
            bryeVar.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.bryf
    public cqkl c() {
        bwrs<ilo> bwrsVar = this.a;
        if (bwrsVar != null) {
            this.d.b(bwrsVar, new bbpf(this));
        }
        return b();
    }

    @Override // defpackage.bryf
    public String d() {
        return this.b.getString(R.string.PERSONAL_SCORE_CAT_SEARCH_PROMO_TITLE);
    }

    @Override // defpackage.bryf
    public String e() {
        return this.b.getString(R.string.PERSONAL_SCORE_CAT_SEARCH_PROMO_BODY);
    }

    @Override // defpackage.bryf
    public String f() {
        return this.b.getString(R.string.PERSONAL_SCORE_CAT_SEARCH_PROMO_GET_STARTED_BUTTON);
    }

    @Override // defpackage.bryf
    public cqtd g() {
        return cqrt.g(2131232509, ibm.b());
    }

    @Override // defpackage.bryf
    public cqtd h() {
        return iup.e(R.raw.personal_score_cat_search_promo);
    }

    @Override // defpackage.bryf
    public void i(brye bryeVar) {
        this.c.add(bryeVar);
    }

    @Override // defpackage.bryf
    public cjtd j() {
        return cjtd.a(dtxl.s);
    }

    @Override // defpackage.bryf
    public cjtd k() {
        return cjtd.a(dtxl.t);
    }

    @Override // defpackage.bryf
    public cjtd l() {
        return cjtd.a(dtxl.u);
    }
}
