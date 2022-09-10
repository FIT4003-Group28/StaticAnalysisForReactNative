package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zob  reason: default package */
/* loaded from: classes7.dex */
public class zob implements zdw {
    private static final dbrz b = dbrz.e("\n").j();
    public final zod a;
    private final byae c;
    private final wtu d;
    private final voh e;
    private final Resources f;
    private final vou g;
    private final zom h;
    private wuv i;

    public zob(Activity activity, byae byaeVar, wtu wtuVar, voh vohVar, vou vouVar, zom zomVar, zod zodVar, wuv wuvVar) {
        this.c = byaeVar;
        this.d = wtuVar;
        this.e = vohVar;
        this.f = activity.getResources();
        this.g = vouVar;
        this.h = zomVar;
        this.a = zodVar;
        this.i = wuvVar;
    }

    @Override // defpackage.zdw
    public Boolean a() {
        return Boolean.valueOf(this.a.i() == this);
    }

    @Override // defpackage.zdw
    public Boolean b() {
        return Boolean.valueOf(t().i());
    }

    @Override // defpackage.zdw
    public CharSequence c() {
        String a;
        wur j = t().j();
        return (j == null || (a = j.a()) == null) ? "" : a;
    }

    @Override // defpackage.zdw
    public CharSequence d() {
        return t().a();
    }

    @Override // defpackage.zdw
    public cqtd e() {
        wur j = t().j();
        String b2 = (j == null || j.b() == null) ? "//maps.gstatic.com/mapfiles/transit/iw2/svg/limo/economy.svg" : j.b();
        int intrinsicWidth = this.f.getDrawable(2131231116).getIntrinsicWidth();
        byae byaeVar = this.c;
        bvlv f = bvlw.f();
        Integer valueOf = Integer.valueOf(intrinsicWidth);
        bvld bvldVar = (bvld) f;
        bvldVar.a = valueOf;
        bvldVar.b = valueOf;
        cqtd a = byaeVar.a(b2, f.c(), this);
        return a != null ? a : cqrt.f(2131231116);
    }

    @Override // defpackage.zdw
    public CharSequence f() {
        return t().A(this.f);
    }

    @Override // defpackage.zdw
    public CharSequence g() {
        return t().B(this.f);
    }

    @Override // defpackage.zdw
    public CharSequence h() {
        return dbsj.e(t().y(this.f));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.a.h().indexOf(this))});
    }

    @Override // defpackage.zdw
    public CharSequence i() {
        return t().z(this.f);
    }

    @Override // defpackage.zdw
    @dzsi
    public jhk j() {
        String b2;
        wus k = t().k();
        if (k == null || (b2 = k.b()) == null) {
            return null;
        }
        return new jhk(b2);
    }

    @Override // defpackage.zdw
    public CharSequence k() {
        String charSequence;
        if (r().booleanValue()) {
            return this.f.getString(pxo.DIRECTIONS_TAXI_ACCURATE_PRICE_PRODUCT_LOADING_CONTENT_DESCRIPTION);
        }
        String f = dbsj.f(c().toString());
        String string = a().booleanValue() ? this.f.getString(R.string.DIRECTIONS_TAXI_SELECTED_PRODUCT, d()) : d().toString();
        if (j() != null) {
            charSequence = this.f.getString(R.string.DIRECTIONS_TAXI_FARE_MULTIPLIER_ACTIVE, h().toString());
        } else {
            charSequence = i().toString();
        }
        return b.i(f, string, charSequence);
    }

    @Override // defpackage.zdw
    public View.OnClickListener l() {
        return new View.OnClickListener(this) { // from class: zoa
            private final zob a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zob zobVar = this.a;
                zobVar.m();
                for (View view2 : cqkx.n(zobVar.a)) {
                    RecyclerView recyclerView = (RecyclerView) cqkx.e(view2, jkn.n, zvp.class);
                    if (recyclerView != null) {
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredWidth2 = recyclerView.getMeasuredWidth();
                        int i = iArr[0];
                        if (i < 0) {
                            recyclerView.t(i, 0);
                        } else {
                            int i2 = i + measuredWidth;
                            if (i2 > measuredWidth2) {
                                recyclerView.t(-(measuredWidth2 - i2), 0);
                            }
                        }
                    }
                }
            }
        };
    }

    @Override // defpackage.zdw
    public cqkl m() {
        zod zodVar = this.a;
        dbsk.a(zodVar.a.contains(this));
        zodVar.b = zodVar.a.indexOf(this);
        voh vohVar = this.e;
        wut x = t().x();
        vok vokVar = (vok) vohVar;
        if (!dbsd.a(vokVar.m, x)) {
            if (vokVar.m != null) {
                vokVar.e.a().c();
            }
            vokVar.m = x;
            vokVar.g(vokVar.k, vokVar.m);
            wuv b2 = vokVar.b(x);
            if (b2 != null) {
                vokVar.j(b2.s());
            }
        }
        cqkx.p(this.h);
        cqkx.p(this.a);
        return cqkl.a;
    }

    @Override // defpackage.zdw
    public CharSequence n() {
        String f = t().f();
        return f == null ? this.f.getString(R.string.DIRECTIONS_TAXI_LAUNCH_EXTERNAL_APP) : f;
    }

    @Override // defpackage.zdw
    public cqtd o() {
        return cqrt.f(2131232660);
    }

    @Override // defpackage.zdw
    public cqkl p() {
        if (this.h.a.size() > 1) {
            this.d.a(t().b().c());
        }
        this.g.c(t().s(), false);
        return cqkl.a;
    }

    @Override // defpackage.zdw
    public cjtd q(ddho ddhoVar) {
        wuv t = t();
        cjta d = t.d();
        if (d == null) {
            d = cjtd.b();
        }
        d.d = zaf.a(t, ddhoVar);
        return d.a();
    }

    @Override // defpackage.zdw
    public Boolean r() {
        return Boolean.valueOf(t().v() == 3);
    }

    @Override // defpackage.zdw
    public Boolean s() {
        return Boolean.valueOf(t().v() == 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final wuv t() {
        wuv b2 = this.e.b(this.i.x());
        if (b2 != null) {
            this.i = b2;
        }
        return this.i;
    }

    @dzsi
    public CharSequence u() {
        return t().q();
    }
}
