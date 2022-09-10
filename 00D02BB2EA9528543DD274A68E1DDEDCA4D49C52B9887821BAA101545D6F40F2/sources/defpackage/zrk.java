package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zrk  reason: default package */
/* loaded from: classes7.dex */
public class zrk implements zcd {
    private final Resources a;
    private final amuo b;
    @dzsi
    private final String c;
    @dzsi
    private final String d;
    private final CharSequence e;
    @dzsi
    private final CharSequence f;
    @dzsi
    private final CharSequence g;
    private final cqtd h;
    private final cqtd i;
    private final List<zcv> j;
    @dzsi
    private final Runnable k;
    @dzsi
    private final atee l;
    @dzsi
    private final ated m;
    @dzsi
    private jic n;
    private boolean o;
    private final cjtd p;
    private final dxio<bwsh> q;
    @dzsi
    private final amub r;
    @dzsi
    private final dpec s;
    private Boolean t;
    @dzsi
    private dwfl u;
    private final btvo v;

    public zrk(Resources resources, dxio<bwsh> dxioVar, amuo amuoVar, @dzsi amub amubVar, @dzsi String str, @dzsi String str2, CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi CharSequence charSequence3, cqtd cqtdVar, cqtd cqtdVar2, List<zcv> list, boolean z, @dzsi Runnable runnable, @dzsi atee ateeVar, @dzsi ated atedVar, btvo btvoVar) {
        this.a = resources;
        this.b = amuoVar;
        this.r = amubVar;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = charSequence3;
        this.h = cqtdVar;
        this.i = cqtdVar2;
        this.j = list;
        this.t = Boolean.valueOf(z);
        this.k = runnable;
        this.l = ateeVar;
        this.m = atedVar;
        this.q = dxioVar;
        this.v = btvoVar;
        cjta b = cjtd.b();
        b.b = str;
        b.g(str2);
        b.d = A(amuoVar).booleanValue() ? dtyb.dR : dtyb.dS;
        this.p = b.a();
        this.s = amuoVar.a;
        this.o = false;
        this.n = null;
        this.u = null;
    }

    private static Boolean A(amuo amuoVar) {
        return Boolean.valueOf(amuoVar.d == dgau.DESTINATION);
    }

    public static zrk t(zrl zrlVar, zrt zrtVar, amuo amuoVar, @dzsi amub amubVar, @dzsi String str, bvsl bvslVar, dowa dowaVar, vtn vtnVar, boolean z, @dzsi Runnable runnable, boolean z2) {
        return u(zrlVar, zrtVar, amuoVar, amubVar, str, bvslVar, dowaVar, vtnVar, z, runnable, false, null, null);
    }

    public static zrk v(zrl zrlVar, amvh amvhVar, amuo amuoVar, @dzsi amub amubVar, @dzsi String str, boolean z, boolean z2, @dzsi Runnable runnable) {
        return zrlVar.a(amuoVar, amubVar, str, amuoVar.J, amvhVar.p(), null, null, y(amvhVar, false), y(amvhVar, true), dcdc.e(), z, runnable, null, null);
    }

    private static cqtd x(amuo amuoVar, vtn vtnVar, boolean z) {
        dbsk.s(vtnVar);
        String str = amuoVar.K;
        if (str != null) {
            cqtd d = vtnVar.d(str, vtj.TRANSIT_AUTO, bvlw.a);
            return d == null ? cqtt.c() : d;
        }
        return z(vrt.a(vrv.d(amuoVar)), z);
    }

    private static cqtd y(amvh amvhVar, boolean z) {
        if (amvhVar.k()) {
            return iup.e(R.raw.ic_route_bluedot);
        }
        return z(vyt.u, z);
    }

    private static cqtd z(cqtd cqtdVar, boolean z) {
        return cqrt.j(cqtdVar, cqrt.c(true != z ? R.color.qu_grey_800 : R.color.gmm_white));
    }

    @Override // defpackage.zcd
    @dzsi
    public CharSequence a() {
        return this.g;
    }

    @Override // defpackage.zcd
    @dzsi
    public CharSequence b() {
        CharSequence charSequence = this.g;
        if (charSequence == null) {
            return null;
        }
        return this.a.getString(R.string.DIRECTIONS_PROCEED_TO_METERS, charSequence);
    }

    @Override // defpackage.zcd
    public CharSequence c() {
        return this.e;
    }

    @Override // defpackage.zcd
    @dzsi
    public CharSequence d() {
        return this.f;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.valueOf(this.k != null);
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        Runnable runnable = this.k;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.zcd
    public cqtd g() {
        return iva.a().booleanValue() ? this.i : this.h;
    }

    @Override // defpackage.zcd
    public List<zcv> h() {
        return this.j;
    }

    @Override // defpackage.zcd
    public cjtd i(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.b = this.c;
        b.g(this.d);
        return b.a();
    }

    @Override // defpackage.zcd
    public Boolean j() {
        return Boolean.valueOf(amux.e(this.b));
    }

    @Override // defpackage.zcd
    @dzsi
    public atnn k() {
        ated atedVar;
        atee ateeVar = this.l;
        if (ateeVar == null || (atedVar = this.m) == null) {
            return null;
        }
        return new atnn(this.b.F, ateeVar, atedVar.a(this.t.booleanValue(), false));
    }

    @Override // defpackage.zcd
    public Boolean l() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.zcd
    public void m(dwfl dwflVar) {
        if (this.v.getImageryViewerParameters() == null || !this.v.getImageryViewerParameters().d) {
            return;
        }
        this.o = true;
        this.u = dwflVar;
        this.n = new jic(this.u.h, ckqc.FULLY_QUALIFIED, (cqtd) null, (int) cpnx.a);
    }

    @Override // defpackage.zcd
    public Boolean n() {
        return A(this.b);
    }

    @Override // defpackage.zcd
    @dzsi
    public jic o() {
        return this.n;
    }

    @Override // defpackage.zcd
    public cjtd p() {
        return this.p;
    }

    @Override // defpackage.zcd
    public cqkl q() {
        dwfl dwflVar = this.u;
        if (dwflVar != null) {
            this.q.a().f(this.b, this.r, dwflVar, c(), d(), a());
        }
        return cqkl.a;
    }

    @Override // defpackage.zcd
    @dzsi
    public dpec r() {
        return this.s;
    }

    @Override // defpackage.zcd
    public dqvj s() {
        return zcc.a(this);
    }

    public void w(boolean z) {
        this.t = Boolean.valueOf(z);
    }

    public static zrk u(zrl zrlVar, zrt zrtVar, amuo amuoVar, @dzsi amub amubVar, @dzsi String str, bvsl bvslVar, dowa dowaVar, vtn vtnVar, boolean z, @dzsi Runnable runnable, boolean z2, @dzsi atee ateeVar, @dzsi ated atedVar) {
        String str2 = amuoVar.L;
        if (str2 == null) {
            int i = amuoVar.k;
            str2 = i > 0 ? bvslVar.c(i, dowaVar, true, true) : null;
        }
        return zrlVar.a(amuoVar, amubVar, str, amuoVar.J, amuoVar.p, amuoVar.s, str2, x(amuoVar, vtnVar, false), x(amuoVar, vtnVar, true), zrs.s(zrtVar, GmmNotice.g(amuoVar.C), new xdn()), z, runnable, ateeVar, atedVar);
    }
}
