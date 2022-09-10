package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zmy  reason: default package */
/* loaded from: classes7.dex */
public class zmy implements zdg {
    private final Context a;
    private zde b;
    private zdd c;
    private cqvf d;
    @dzsi
    private cqvf e;
    private amvh f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private cjtd o;
    @dzsi
    private cjtd p;
    private boolean q;

    public zmy(Context context, zde zdeVar, zdd zddVar, cqvf cqvfVar, @dzsi cqvf cqvfVar2, amvh amvhVar, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = context;
        this.b = zdeVar;
        this.c = zddVar;
        this.d = cqvfVar;
        this.e = cqvfVar2;
        this.f = amvhVar;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        cjta b = cjtd.b();
        b.d = B(i, z);
        b.i(i);
        this.o = b.a();
        this.p = C(z, amvhVar.b);
    }

    private static ddho B(int i, boolean z) {
        return i == 0 ? dtxn.cC : !z ? dtxn.cN : dtxn.co;
    }

    @dzsi
    private static cjtd C(boolean z, dpjs dpjsVar) {
        ddho ddhoVar;
        if (z) {
            int ordinal = dpjsVar.ordinal();
            if (ordinal == 1) {
                ddhoVar = dtxn.V;
            } else if (ordinal != 2) {
                ddhoVar = ordinal != 5 ? null : dtxn.W;
            } else {
                ddhoVar = dtxn.X;
            }
            if (ddhoVar == null) {
                return null;
            }
            cjta b = cjtd.b();
            b.d = ddhoVar;
            return b.a();
        }
        return null;
    }

    public void A(boolean z) {
        this.q = z;
    }

    @Override // defpackage.zdg
    public Integer a() {
        return Integer.valueOf(this.g);
    }

    @Override // defpackage.zdg
    public Integer b() {
        return Integer.valueOf(this.h);
    }

    @Override // defpackage.zdg
    public Boolean c() {
        return Boolean.valueOf(this.g == 0);
    }

    @Override // defpackage.zdg
    public Boolean d() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.zdg
    public Boolean e() {
        return Boolean.valueOf(this.f.k());
    }

    @Override // defpackage.zdg
    public cqsn f() {
        return this.d;
    }

    @Override // defpackage.zdg
    @dzsi
    public cqvf g() {
        return this.e;
    }

    @Override // defpackage.zdg
    public Boolean h() {
        return Boolean.valueOf(this.f.a());
    }

    @Override // defpackage.zdg
    public Boolean i() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.zdg
    public Boolean j() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.zdg
    public Boolean k() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.zdg
    public cqkl l() {
        this.b.a(this.g);
        return cqkl.a;
    }

    @Override // defpackage.zdg
    public cjtd m() {
        return this.o;
    }

    @Override // defpackage.zdg
    @dzsi
    public cjtd n() {
        return this.p;
    }

    @Override // defpackage.zdg
    public cqkl o(cjqm cjqmVar) {
        this.c.a(this.g, cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.zdg
    public zvb p() {
        dcdc<dpce> A;
        amvh amvhVar = this.f;
        if (!amvhVar.q.isEmpty()) {
            A = amvhVar.A();
        } else {
            A = dcdc.f(alcf.v(amvhVar.p()));
        }
        return new zvb(A, vtj.TRANSIT_AUTO);
    }

    @Override // defpackage.zdg
    public CharSequence q() {
        return this.a.getString(R.string.ACCESSIBILITY_REMOVE_WAYPOINT, this.f.p());
    }

    @Override // defpackage.zdg
    public CharSequence r() {
        return this.a.getString(R.string.ACCESSIBILITY_WAYPOINT_GRABBER, this.f.p());
    }

    @Override // defpackage.zdg
    public Boolean s() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.zdg
    public Boolean t() {
        boolean z = true;
        if (!cqhl.b(this.a) && !cqhl.c(this.a)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zdg
    public Boolean u() {
        boolean z = true;
        if (1 != ((this.g & 1) ^ 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zdg
    public Boolean v() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.zdg
    public Boolean w() {
        return Boolean.valueOf(this.f.y);
    }

    @Override // defpackage.zdg
    public Boolean x() {
        return Boolean.valueOf(this.j);
    }

    public CharSequence y() {
        if (TextUtils.isEmpty(this.f.p())) {
            return f().a(this.a).toString();
        }
        return this.f.p();
    }

    public void z(cqvf cqvfVar, @dzsi cqvf cqvfVar2, amvh amvhVar, zde zdeVar, zdd zddVar, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.d = cqvfVar;
        this.e = cqvfVar2;
        this.f = amvhVar;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        cjta b = cjtd.b();
        b.d = B(i, z);
        b.i(i);
        this.o = b.a();
        this.p = C(z, amvhVar.b);
        cqkx.p(this);
        this.q = false;
        this.c = zddVar;
        this.b = zdeVar;
    }
}
