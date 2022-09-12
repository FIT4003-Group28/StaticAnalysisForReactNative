package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: swo  reason: default package */
/* loaded from: classes7.dex */
public class swo implements zdw {
    private static final dbrz c = dbrz.e("\n").j();
    public final swn a;
    public final wuv b;
    private final Activity d;
    private final byae e;
    private final tmh f;

    public swo(Activity activity, byae byaeVar, swn swnVar, tmh tmhVar, wuv wuvVar) {
        this.d = activity;
        this.e = byaeVar;
        this.a = swnVar;
        this.f = tmhVar;
        this.b = wuvVar;
    }

    @Override // defpackage.zdw
    public Boolean a() {
        return Boolean.valueOf(this.f.b.equals(dbsg.i(this.b)));
    }

    @Override // defpackage.zdw
    public Boolean b() {
        return Boolean.valueOf(this.b.i());
    }

    @Override // defpackage.zdw
    public CharSequence c() {
        wur j = this.b.j();
        return j == null ? "" : dbsj.e(j.a());
    }

    @Override // defpackage.zdw
    public CharSequence d() {
        return this.b.a();
    }

    @Override // defpackage.zdw
    public CharSequence f() {
        return this.b.A(this.d.getResources());
    }

    @Override // defpackage.zdw
    public CharSequence g() {
        return this.b.B(this.d.getResources());
    }

    @Override // defpackage.zdw
    public CharSequence h() {
        return dbsj.e(this.b.y(this.d.getResources()));
    }

    @Override // defpackage.zdw
    public CharSequence i() {
        return this.b.z(this.d.getResources());
    }

    @Override // defpackage.zdw
    @dzsi
    public jhk j() {
        String b;
        wus k = this.b.k();
        if (k == null || (b = k.b()) == null) {
            return null;
        }
        return new jhk(b);
    }

    @Override // defpackage.zdw
    public CharSequence k() {
        String charSequence;
        String charSequence2;
        if (r().booleanValue()) {
            return this.d.getResources().getString(pxo.DIRECTIONS_TAXI_ACCURATE_PRICE_PRODUCT_LOADING_CONTENT_DESCRIPTION);
        }
        String f = dbsj.f(c().toString());
        if (a().booleanValue()) {
            charSequence = this.d.getResources().getString(R.string.DIRECTIONS_TAXI_SELECTED_PRODUCT, d());
        } else {
            charSequence = d().toString();
        }
        if (j() != null) {
            charSequence2 = this.d.getResources().getString(R.string.DIRECTIONS_TAXI_FARE_MULTIPLIER_ACTIVE, h().toString());
        } else {
            charSequence2 = i().toString();
        }
        return c.i(f, charSequence, charSequence2);
    }

    @Override // defpackage.zdw
    public View.OnClickListener l() {
        return new swm(this);
    }

    @Override // defpackage.zdw
    public cqkl m() {
        this.a.c(this.b);
        return cqkl.a;
    }

    @Override // defpackage.zdw
    public CharSequence n() {
        String f = this.b.f();
        return f == null ? this.d.getResources().getString(R.string.DIRECTIONS_TAXI_LAUNCH_EXTERNAL_APP) : f;
    }

    @Override // defpackage.zdw
    public cqtd o() {
        return cqrt.f(2131232660);
    }

    @Override // defpackage.zdw
    public cqkl p() {
        return cqkl.a;
    }

    @Override // defpackage.zdw
    public cjtd q(ddho ddhoVar) {
        cjta d = this.b.d();
        if (d == null) {
            d = cjtd.b();
        }
        d.d = zaf.a(this.b, ddhoVar);
        return d.a();
    }

    @Override // defpackage.zdw
    public Boolean r() {
        return Boolean.valueOf(this.b.v() == 3);
    }

    @Override // defpackage.zdw
    public Boolean s() {
        return Boolean.valueOf(this.b.v() == 4);
    }

    @Override // defpackage.zdw
    public cqtd e() {
        wur j = this.b.j();
        String b = (j == null || j.b() == null) ? "//maps.gstatic.com/mapfiles/transit/iw2/svg/limo/economy.svg" : j.b();
        int intrinsicWidth = this.d.getResources().getDrawable(2131231116).getIntrinsicWidth();
        byae byaeVar = this.e;
        bvlv f = bvlw.f();
        Integer valueOf = Integer.valueOf(intrinsicWidth);
        bvld bvldVar = (bvld) f;
        bvldVar.a = valueOf;
        bvldVar.b = valueOf;
        cqtd a = byaeVar.a(b, f.c(), this);
        return a != null ? a : cqrt.f(2131231116);
    }
}
