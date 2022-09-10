package defpackage;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yan  reason: default package */
/* loaded from: classes7.dex */
public class yan implements xza {
    private final Context a;
    private final ascb b;
    private final btth c;
    private final vwv d;
    private final vxa e;
    private final vzi f;
    private final xzb g;
    private final vxd h;
    private final amub i;
    private final cjta j;
    @dzsi
    private final yal k;
    @dzsi
    private final Integer l;
    @dzsi
    private final amvh m;
    @dzsi
    private final amvh n;
    @dzsi
    private final CharSequence o;
    @dzsi
    private final CharSequence p;
    @dzsi
    private final CharSequence q;
    @dzsi
    private final dqvj r;
    private boolean s;

    public yan(Activity activity, cqhn cqhnVar, ascb ascbVar, btvo btvoVar, ahjq ahjqVar, vwv vwvVar, vxa vxaVar, vzi vziVar, xzb xzbVar, vxd vxdVar, amub amubVar, cjta cjtaVar, @dzsi yal yalVar, @dzsi Integer num, @dzsi amvh amvhVar, @dzsi amvh amvhVar2, @dzsi CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi CharSequence charSequence3, boolean z) {
        this.g = xzbVar;
        this.h = vxdVar;
        this.i = amubVar;
        this.c = ahjqVar;
        this.d = vwvVar;
        this.e = vxaVar;
        this.a = activity;
        this.f = vziVar;
        this.b = ascbVar;
        this.j = cjtaVar;
        this.k = yalVar;
        this.l = num;
        this.m = amvhVar;
        this.n = amvhVar2;
        this.o = charSequence;
        this.p = charSequence2;
        this.q = charSequence3;
        this.r = vxdVar.b();
        this.s = z;
        if (yalVar != null) {
            yalVar.g(this);
        }
    }

    private static amvh u(amvh amvhVar) {
        if (!amvhVar.k()) {
            return amvhVar;
        }
        amvg amvgVar = new amvg(amvhVar);
        amvgVar.a = dpjs.ENTITY_TYPE_DEFAULT;
        return amvgVar.a();
    }

    @Override // defpackage.xyv
    public void a(Context context) {
    }

    @Override // defpackage.xyv
    public boolean b() {
        return false;
    }

    @Override // defpackage.xyz
    public Boolean c() {
        return Boolean.valueOf(this.s);
    }

    @Override // defpackage.xyz
    public void d(boolean z) {
        this.s = true;
        yal yalVar = this.k;
        if (yalVar != null) {
            yalVar.a = true;
        }
        cqkx.p(this);
    }

    @Override // defpackage.xyz
    @dzsi
    public xyy e() {
        return this.k;
    }

    @Override // defpackage.xza
    public xzb f() {
        return this.g;
    }

    @Override // defpackage.xza
    public Boolean g() {
        boolean z = false;
        if (this.r != null && this.n != null && t()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xza
    public cqkl h() {
        Location y = this.c.y();
        if (y == null || this.n == null || this.r == null) {
            return cqkl.a;
        }
        akqq akqqVar = new akqq(y.getLatitude(), y.getLongitude());
        ascb ascbVar = this.b;
        qcw x = qcx.x();
        x.k(qbs.NAVIGATION);
        x.s(this.r);
        x.j(true);
        x.d(true);
        x.r(amvh.g(this.a, akqqVar));
        x.u(u(this.n));
        ascbVar.d(x.a(), asca.MULTIMODAL);
        return cqkl.a;
    }

    @Override // defpackage.xza
    public CharSequence i() {
        vxd vxdVar = vxd.UNKNOWN;
        if (this.h.ordinal() == 2) {
            return this.a.getString(R.string.DIRECTIONS_TAXI_NAVIGATION);
        }
        return this.a.getString(R.string.PERSISTENT_FOOTER_START_BUTTON);
    }

    @Override // defpackage.xza
    public CharSequence j() {
        Integer num = this.l;
        if (num == null || num.intValue() == 0) {
            return this.a.getString(R.string.NAVIGATION_START_FIRST_LEG);
        }
        return this.a.getString(R.string.NAVIGATION_START_LAST_LEG);
    }

    @Override // defpackage.xza
    public cjtd k() {
        vxd vxdVar = vxd.UNKNOWN;
        int ordinal = this.h.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.j.b(dtxn.at);
            }
            if (ordinal == 2) {
                return this.j.b(dtxn.aD);
            }
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return this.j.b(dtxn.aU);
                }
                if (ordinal == 5) {
                    return this.j.b(dtxn.ap);
                }
                throw new AssertionError();
            }
        }
        return cjtd.b;
    }

    @Override // defpackage.xza
    public Boolean l() {
        boolean z = false;
        if (this.r != null && this.m != null && this.n != null && !t()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xza
    public cqkl m() {
        if (this.m == null || this.n == null || this.r == null) {
            return cqkl.a;
        }
        vzi vziVar = this.f;
        vum vumVar = new vum();
        vumVar.c(dcdc.g(u(this.m), u(this.n)));
        vumVar.a = this.e.b(this.r, 3, vul.NAVIGATION_ONLY);
        vziVar.b(vumVar.a());
        return cqkl.a;
    }

    @Override // defpackage.xza
    public CharSequence n() {
        Integer num = this.l;
        if (num == null || num.intValue() == 0) {
            return this.a.getString(R.string.NAVIGATION_PREVIEW_FIRST_LEG);
        }
        return this.a.getString(R.string.NAVIGATION_PREVIEW_LAST_LEG);
    }

    @Override // defpackage.xza
    public cjtd o() {
        vxd vxdVar = vxd.UNKNOWN;
        int ordinal = this.h.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.j.b(dtxn.as);
            }
            if (ordinal == 2) {
                return this.j.b(dtxn.aC);
            }
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return this.j.b(dtxn.aT);
                }
                if (ordinal == 5) {
                    return this.j.b(dtxn.ao);
                }
                throw new AssertionError();
            }
        }
        return cjtd.b;
    }

    @Override // defpackage.xza
    @dzsi
    public CharSequence p() {
        return this.o;
    }

    @Override // defpackage.xza
    @dzsi
    public CharSequence q() {
        return this.p;
    }

    @Override // defpackage.xza
    @dzsi
    public CharSequence r() {
        return this.q;
    }

    @Override // defpackage.xza
    public Boolean s() {
        return Boolean.valueOf(this.d.n);
    }

    final boolean t() {
        return zba.g(this.i, this.l, this.c, this.d);
    }
}
