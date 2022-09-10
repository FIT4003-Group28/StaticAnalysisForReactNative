package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yas  reason: default package */
/* loaded from: classes7.dex */
public class yas implements xzc {
    private final Context a;
    private final byae b;
    private final dxio<afha> c;
    private final wtu d;
    private final cwy e;
    private final wuv f;
    @dzsi
    private final CharSequence g;
    @dzsi
    private final Runnable h;
    @dzsi
    private final yba i;
    @dzsi
    private final yal j;
    private final xzh k;
    private final boolean l;
    private final cjta m;
    private final boolean n;
    private final dbsg<String> o;
    private boolean p;
    private boolean q;

    @Override // defpackage.xyv
    public void a(Context context) {
    }

    @Override // defpackage.xyv
    public boolean b() {
        return false;
    }

    @Override // defpackage.xyz
    public Boolean c() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.xyz
    public void d(boolean z) {
        this.q = true;
        yal yalVar = this.j;
        if (yalVar != null) {
            yalVar.a = true;
        }
        yba ybaVar = this.i;
        if (ybaVar != null) {
            ybaVar.j(true);
        }
        cqkx.p(this);
    }

    @Override // defpackage.xyz
    @dzsi
    public xyy e() {
        return this.j;
    }

    @Override // defpackage.xzc
    public CharSequence f() {
        return this.a.getResources().getString(R.string.DIRECTIONS_DETAILS_RIDESHARE_LAUNCH_EXTERNAL_APP, this.f.b().a());
    }

    @Override // defpackage.xzc
    public cjtd h() {
        if (!this.o.a() || this.f.b().c().equals(this.o.b())) {
            return y(dtxn.ae);
        }
        return cjtd.a(dtxn.ae);
    }

    @Override // defpackage.xzc
    public cqss i() {
        return ibm.x();
    }

    @Override // defpackage.xzc
    public CharSequence k() {
        return this.f.a();
    }

    @Override // defpackage.xzc
    @dzsi
    public CharSequence l() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f.p()) {
            cwy.c(spannableStringBuilder, this.a.getResources());
        }
        String y = this.f.y(this.a.getResources());
        if (!TextUtils.isEmpty(y)) {
            spannableStringBuilder.append((CharSequence) y);
        }
        String A = this.f.A(this.a.getResources());
        if (!TextUtils.isEmpty(A)) {
            if (!TextUtils.isEmpty(y)) {
                spannableStringBuilder.append((CharSequence) " · ");
            }
            spannableStringBuilder.append((CharSequence) A);
        }
        return spannableStringBuilder;
    }

    @Override // defpackage.xzc
    @dzsi
    public CharSequence m() {
        bvsi bvsiVar = new bvsi(this.a);
        if (this.f.p()) {
            bvsiVar.c(this.a.getResources().getString(R.string.AD));
        }
        CharSequence z = this.f.z(this.a.getResources());
        if (!TextUtils.isEmpty(z)) {
            bvsiVar.c(z);
        }
        String A = this.f.A(this.a.getResources());
        if (!TextUtils.isEmpty(A)) {
            bvsiVar.c(A);
        }
        return bvsiVar.toString();
    }

    @Override // defpackage.xzc
    public jhk n() {
        return this.f.b().b();
    }

    @Override // defpackage.xzc
    @dzsi
    public CharSequence o() {
        return this.g;
    }

    @Override // defpackage.xzc
    public cqkl p() {
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.xzc
    public Boolean q() {
        return Boolean.valueOf(this.i != null);
    }

    @Override // defpackage.xzc
    public cqkl r() {
        this.p = !this.p;
        yba ybaVar = this.i;
        if (ybaVar != null) {
            ybaVar.h().o(this.p, this.l);
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.xzc
    public String s() {
        return this.a.getResources().getString(R.string.DIRECTIONS_DETAILS_RIDESHARE_OTHER_OPTIONS_TEXT);
    }

    @Override // defpackage.xzc
    public String t() {
        bvsi bvsiVar = new bvsi(this.a);
        bvsiVar.c(s());
        for (xzg xzgVar : x().a()) {
            bvsiVar.c(xzgVar.b());
        }
        bvsiVar.e();
        if (this.p) {
            bvsiVar.d(this.a.getString(R.string.ACCESSIBILITY_DIRECTIONS_DETAILS_RIDESHARE_OTHER_OPTIONS_EXPANDED));
        } else {
            bvsiVar.d(this.a.getString(R.string.ACCESSIBILITY_DIRECTIONS_DETAILS_RIDESHARE_OTHER_OPTIONS_COLLAPSED));
        }
        return bvsiVar.toString();
    }

    @Override // defpackage.xzc
    public Boolean u() {
        return false;
    }

    @Override // defpackage.xzc
    public Boolean v() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.xzc
    @dzsi
    public xzf w() {
        if (!this.p) {
            return null;
        }
        return this.i;
    }

    @Override // defpackage.xzc
    public xzh x() {
        return this.k;
    }

    @Override // defpackage.xzc
    public cjtd y(ddho ddhoVar) {
        return this.m.b(ddhoVar);
    }

    public yas(Activity activity, cqhn cqhnVar, vwv vwvVar, byae byaeVar, dxio<afha> dxioVar, wtu wtuVar, cwy cwyVar, wuv wuvVar, @dzsi yba ybaVar, @dzsi yal yalVar, xzh xzhVar, @dzsi CharSequence charSequence, @dzsi Runnable runnable, boolean z, vwh vwhVar, cjta cjtaVar, long j, boolean z2) {
        dbsg<String> dbsgVar;
        this.a = activity;
        this.b = byaeVar;
        this.c = dxioVar;
        this.e = cwyVar;
        this.d = wtuVar;
        this.f = wuvVar;
        this.i = ybaVar;
        this.j = yalVar;
        this.k = xzhVar;
        this.g = charSequence;
        this.h = runnable;
        this.l = z;
        this.m = cjtaVar;
        dgas g = wuvVar.g();
        boolean z3 = true;
        this.n = (!z || vwvVar.n || g == null || (g.a & 1) == 0 || ((long) g.b) <= j) ? false : z3;
        if (z) {
            this.p = vwhVar.c;
            if ((vwhVar.a & 128) != 0) {
                dbsgVar = dbsg.i(vwhVar.j);
            } else {
                dbsgVar = dbpy.a;
            }
            this.o = dbsgVar;
        } else {
            this.p = vwhVar.d;
            this.o = (vwhVar.a & 256) != 0 ? dbsg.i(vwhVar.k) : dbpy.a;
        }
        this.q = z2;
        if (yalVar != null) {
            yalVar.g(this);
            yalVar.a = this.q;
        }
        if (ybaVar != null) {
            ybaVar.i(this);
            ybaVar.j(this.q);
        }
    }

    @Override // defpackage.xzc
    public cqtd j() {
        wur j = this.f.j();
        String b = (j == null || j.b() == null) ? "//maps.gstatic.com/mapfiles/transit/iw2/svg/limo/economy.svg" : j.b();
        int intrinsicWidth = this.a.getResources().getDrawable(2131231116).getIntrinsicWidth();
        byae byaeVar = this.b;
        bvlv f = bvlw.f();
        Integer valueOf = Integer.valueOf(intrinsicWidth);
        bvld bvldVar = (bvld) f;
        bvldVar.a = valueOf;
        bvldVar.b = valueOf;
        cqtd a = byaeVar.a(b, f.c(), this);
        return a != null ? a : cqrt.f(2131231116);
    }

    @Override // defpackage.xzc
    public cqkl g() {
        yba ybaVar = this.i;
        if (ybaVar != null && ybaVar.d.size() > 1) {
            this.d.a(this.f.b().c());
        }
        Intent c = this.f.c();
        if (c != null) {
            this.c.a().f(this.a, c, 4);
        }
        return cqkl.a;
    }
}
