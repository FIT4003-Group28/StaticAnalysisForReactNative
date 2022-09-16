package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxpj  reason: default package */
/* loaded from: classes4.dex */
public class bxpj implements bxoi {
    private final Activity a;
    private final bxpy b;
    private final btvo c;
    private CharSequence d;
    private String e;

    public bxpj(Activity activity, CharSequence charSequence, String str, bxpy bxpyVar, btvo btvoVar) {
        this.a = activity;
        this.d = charSequence;
        this.e = str;
        this.b = bxpyVar;
        this.c = btvoVar;
    }

    @Override // defpackage.bxoi
    public cyg A() {
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean B() {
        return bxoh.a();
    }

    @Override // defpackage.bxoi
    public jic C() {
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean D() {
        return bxoh.b();
    }

    @Override // defpackage.bxoi
    public CharSequence E() {
        return "";
    }

    public void F(CharSequence charSequence, String str) {
        this.d = charSequence;
        this.e = str;
    }

    @Override // defpackage.bxoi
    public Boolean a() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean b() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean c() {
        return false;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return cqrt.g(2131231736, bxnv.i(3));
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        bxpy bxpyVar = this.b;
        String str = this.e;
        bxel bxelVar = ((bxeh) bxpyVar).a;
        if (bxelVar.aD && bxelVar.bb.r() && bxelVar.bc != null) {
            String bx = bxel.bx(str);
            if (bxelVar.bb.p() || !bx.isEmpty()) {
                bxelVar.bb.e(bx);
                bxelVar.bc.d(bxkq.SEARCH_FOR_QUERY_SUGGESTION, cjqmVar);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return cjtd.a(dtyb.aD);
    }

    @Override // defpackage.bxoi
    public Boolean i() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean j() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean k() {
        return false;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        if (this.c.getEnableFeatureParameters().bc) {
            return this.a.getString(R.string.PLACE_SEARCH_FOR_SUGGESTION_SUBTITLE);
        }
        return null;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.d;
    }

    @Override // defpackage.bxoi
    @dzsi
    public CharSequence n() {
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean o() {
        return false;
    }

    @Override // defpackage.bxoi
    public cqkl p() {
        return cqkl.a;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cjtd q() {
        return null;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cqss r() {
        return bxnv.h(3);
    }

    @Override // defpackage.bxoi
    public cqkl s() {
        return cqkl.a;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cjtd t() {
        return null;
    }

    @Override // defpackage.bxoi
    @dzsi
    public CharSequence u() {
        return null;
    }

    @Override // defpackage.bxoi
    public bxok v() {
        return null;
    }

    @Override // defpackage.bxoi
    public bxok w() {
        return null;
    }

    @Override // defpackage.bxoi
    public String x() {
        return " ";
    }

    @Override // defpackage.bxoi
    public bxoj y() {
        return null;
    }

    @Override // defpackage.bxoi
    public acmv z() {
        return null;
    }
}
