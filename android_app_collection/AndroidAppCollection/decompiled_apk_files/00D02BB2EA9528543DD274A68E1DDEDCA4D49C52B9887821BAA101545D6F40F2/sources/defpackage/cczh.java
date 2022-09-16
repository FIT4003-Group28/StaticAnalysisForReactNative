package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cczh  reason: default package */
/* loaded from: classes4.dex */
public class cczh implements ccxg {
    private final cczg a;
    private final ccln b;
    private final Resources c;
    private String d = "";
    private dgfg e = dgfg.d;

    public cczh(gga ggaVar, cczg cczgVar, ccln cclnVar) {
        this.a = cczgVar;
        this.b = cclnVar;
        this.c = ggaVar.getResources();
    }

    private final cqkl k() {
        cczg cczgVar = this.a;
        if (((ges) cczgVar).aD) {
            ((cclh) cczgVar).b.g().f();
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxg
    @dzsi
    public jic a() {
        if (this.b.i.size() <= 0) {
            return null;
        }
        dwfl dwflVar = this.b.i.get(0);
        return new jic(dwflVar.h, jfv.b(dwflVar), iup.e(R.raw.offering_details_placeholder_dish), 0);
    }

    @Override // defpackage.ccxg
    public cqkl b() {
        cczg cczgVar = this.a;
        cclh cclhVar = (cclh) cczgVar;
        cclhVar.f.a(cclhVar.g, cclhVar.ad.b, d(), i());
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [cczg, gfw] */
    @Override // defpackage.ccxg
    public cqkl c() {
        String str = this.b.i.isEmpty() ? null : this.b.i.get(0).h;
        ?? r7 = this.a;
        String str2 = dbsj.d(this.d) ? this.b.f : this.d;
        cclh cclhVar = (cclh) r7;
        cclq a = cclhVar.d.a();
        dgfb b = dgfb.b(cclhVar.g.e);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        a.i(b, str2, str, cclhVar.ad, ccme.f, r7);
        return cqkl.a;
    }

    @Override // defpackage.ccxg
    public String d() {
        return this.d;
    }

    @Override // defpackage.ccxg
    public jib e() {
        jhz a = jhz.a();
        a.x = false;
        a.i = cqrt.g(2131231591, ibm.o());
        a.f(new View.OnClickListener(this) { // from class: cczf
            private final cczh a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h();
            }
        });
        a.o = cjtd.a(dtxx.ae);
        a.a = this.c.getString(R.string.OFFERING_DETAILS_DISH_SUGGEST_EDIT_TITLE);
        a.C = 2;
        return a.b();
    }

    @Override // defpackage.ccxg
    public String f() {
        return this.b.f;
    }

    public void g(String str, dgfg dgfgVar) {
        this.d = dbsj.e(str);
        this.e = dgfgVar;
    }

    public cqkl h() {
        return k();
    }

    public dgfg i() {
        return this.e;
    }

    public void j(String str, dgfg dgfgVar) {
        this.d = dbsj.e(str);
        this.e = dgfgVar;
        cqkx.p(this);
    }
}
