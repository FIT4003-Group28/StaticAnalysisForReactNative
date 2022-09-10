package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxot  reason: default package */
/* loaded from: classes4.dex */
public class bxot implements bxoi {
    private final Activity a;
    private final dxio<aaap> b;
    private final btvo c;
    private String d = "";
    private CharSequence e = "";
    private boolean f = false;
    private bxod g = bxod.PARTIAL;
    private boolean h = false;

    public bxot(Activity activity, dxio<aaap> dxioVar, btvo btvoVar) {
        this.a = activity;
        this.b = dxioVar;
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

    public void F(String str, bxod bxodVar, boolean z) {
        this.d = str;
        bvsx bvsxVar = new bvsx(this.a.getResources());
        bvsu c = bvsxVar.c(R.string.SEARCH_FOR_SUGGESTION);
        bvsu c2 = bvsxVar.c(R.string.QUOTED_TEXT);
        c2.a(str);
        c2.l(iva.b(ibl.w(), ibl.o()).b(this.a));
        c2.i();
        c.a(c2);
        c.l(iva.b(ibl.d(), ibl.b()).b(this.a));
        this.e = c.c();
        this.f = !dbtw.a(str);
        this.g = bxodVar;
        this.h = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G() {
        return this.h && this.c.getEnableFeatureParameters().bc && this.g != bxod.PARTIAL && this.f;
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
        return cqrt.g(2131232317, bxnv.i(3));
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.valueOf(G());
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        aaap a = this.b.a();
        String str = this.d;
        dprs bZ = dprx.h.bZ();
        String str2 = this.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dprx dprxVar = (dprx) bZ.b;
        str2.getClass();
        dprxVar.a |= 1;
        dprxVar.b = str2;
        dpsg bZ2 = dpsh.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpsh.b((dpsh) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dprx dprxVar2 = (dprx) bZ.b;
        dpsh bK = bZ2.bK();
        bK.getClass();
        dprxVar2.f = bK;
        dprxVar2.a |= 16;
        a.m(str, bZ.bK(), cjqmVar);
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
        return cjtd.a(dtxo.aC);
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
        return this.a.getString(R.string.EVENT_SEARCH_FOR_SUGGESTION_SUBTITLE);
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.e;
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
