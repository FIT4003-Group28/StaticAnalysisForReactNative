package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: uhw  reason: default package */
/* loaded from: classes7.dex */
public class uhw implements uhb, uhe {
    public final ufc a;
    public final suy b;
    public uhv c;
    private final Activity f;
    private String i;
    public boolean d = false;
    private boolean g = false;
    private boolean h = false;
    public boolean e = false;

    public uhw(Activity activity, ufc ufcVar, suy suyVar, uhv uhvVar) {
        this.f = activity;
        this.a = ufcVar;
        this.b = suyVar;
        this.c = uhvVar;
        cjta b = cjtd.b();
        uhf uhfVar = (uhf) uhvVar;
        b.d = w(uhfVar.d, uhfVar.b);
        b.i(uhfVar.d);
        b.a();
        this.i = v(activity, uhfVar.a, uhfVar.b, uhfVar.c);
    }

    private static String v(Activity activity, boolean z, boolean z2, amvh amvhVar) {
        if (!amvhVar.a()) {
            return amvhVar.p();
        }
        if (z) {
            return activity.getString(R.string.DIRECTIONS_CHOOSE_START_POINT);
        }
        if (z2) {
            return activity.getString(R.string.DIRECTIONS_CHOOSE_END_POINT);
        }
        return activity.getString(R.string.DIRECTIONS_CHOOSE_VIA_POINT);
    }

    private static ddho w(int i, boolean z) {
        return i == 0 ? dtxn.cC : !z ? dtxn.cN : dtxn.co;
    }

    @Override // defpackage.uhb
    public uhe a() {
        return this;
    }

    @Override // defpackage.uhb
    public cqss b() {
        if (this.h) {
            return ibm.D();
        }
        if (i().booleanValue()) {
            return ibm.x();
        }
        return k().booleanValue() ? ibm.n() : ibm.p();
    }

    @Override // defpackage.uhb
    public String c() {
        return this.i;
    }

    @Override // defpackage.uhb
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.uhb
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.uhe
    public Integer f() {
        return Integer.valueOf(((uhf) this.c).e);
    }

    @Override // defpackage.uhe
    public Boolean g() {
        return Boolean.valueOf(((uhf) this.c).a);
    }

    @Override // defpackage.uhb, defpackage.uhe
    public Boolean h() {
        return Boolean.valueOf(((uhf) this.c).b);
    }

    @Override // defpackage.uhe
    public Boolean i() {
        return Boolean.valueOf(((uhf) this.c).c.k());
    }

    @Override // defpackage.uhe
    public Boolean j() {
        return true;
    }

    @Override // defpackage.uhe
    public Boolean k() {
        return Boolean.valueOf(((uhf) this.c).c.a());
    }

    @Override // defpackage.uhe
    public Boolean l() {
        return Boolean.valueOf(((uhf) this.c).c.y);
    }

    @Override // defpackage.uhb
    public Boolean m() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.uhb
    public CharSequence n() {
        return this.f.getString(R.string.ACCESSIBILITY_WAYPOINT_GRABBER, new Object[]{c()});
    }

    @Override // defpackage.uhb
    public CharSequence o() {
        return this.f.getString(R.string.ACCESSIBILITY_REMOVE_WAYPOINT, new Object[]{c()});
    }

    @Override // defpackage.uhb
    public View.OnClickListener p() {
        return new View.OnClickListener(this) { // from class: uht
            private final uhw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uhw uhwVar = this.a;
                if (uhwVar.e || uhwVar.d) {
                    return;
                }
                suy suyVar = uhwVar.b;
                dcdc<amvh> l = uhwVar.a.a().l();
                dbsk.s(l);
                suyVar.aJ(l, ((uhf) uhwVar.c).d);
            }
        };
    }

    @Override // defpackage.uhb
    public View.OnClickListener q() {
        return new View.OnClickListener(this) { // from class: uhu
            private final uhw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uhw uhwVar = this.a;
                if (uhwVar.e || uhwVar.d) {
                    return;
                }
                uhwVar.a.g(((uhf) uhwVar.c).d);
            }
        };
    }

    @Override // defpackage.uhb
    public Boolean r() {
        return true;
    }

    @Override // defpackage.uhb
    public Boolean s() {
        return Boolean.valueOf(!k().booleanValue());
    }

    public void t(boolean z, boolean z2, boolean z3, boolean z4) {
        this.g = z;
        this.d = z2;
        this.e = z3;
        this.h = z4;
        cqkx.p(this);
    }

    public void u(uhv uhvVar) {
        if (!this.c.equals(uhvVar)) {
            this.c = uhvVar;
            cjta b = cjtd.b();
            uhf uhfVar = (uhf) this.c;
            b.d = w(uhfVar.d, uhfVar.b);
            b.i(((uhf) this.c).d);
            b.a();
            Activity activity = this.f;
            uhf uhfVar2 = (uhf) this.c;
            this.i = v(activity, uhfVar2.a, uhfVar2.b, uhfVar2.c);
            cqkx.p(this);
        }
    }
}
