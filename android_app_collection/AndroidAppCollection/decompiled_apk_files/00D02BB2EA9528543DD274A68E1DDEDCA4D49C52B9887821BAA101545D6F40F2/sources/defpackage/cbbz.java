package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbbz  reason: default package */
/* loaded from: classes4.dex */
public class cbbz implements cbra {
    public final cbqs a;
    public final cbqs b;
    public final Activity c;
    public final Runnable d;
    public String e = "";
    public final cbau f;
    private final ges g;
    private final cbat h;
    private final cbqg i;
    private final boolean j;

    public cbbz(@dzsi dpvi dpviVar, @dzsi dpvi dpviVar2, @dzsi dpvi dpviVar3, @dzsi dpvi dpviVar4, @dzsi dpsd dpsdVar, @dzsi dpsd dpsdVar2, Runnable runnable, ges gesVar, boolean z, final cbat cbatVar, Activity activity, cayn caynVar, cbqg cbqgVar) {
        cbau cbauVar = new cbau(dpsdVar, dpsdVar2, dpviVar == null ? cbatVar.b() : dpviVar, dpviVar2 == null ? cbatVar.b() : dpviVar2, dpviVar3, dpviVar4);
        this.f = cbauVar;
        this.a = cbatVar.a(dpviVar, dpviVar2, true, new cbbs(cbatVar) { // from class: cbbv
            private final cbat a;

            {
                this.a = cbatVar;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a.b();
            }
        }, new Runnable(this) { // from class: cbbw
            private final cbbz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbbz cbbzVar = this.a;
                cbbzVar.b.n(cbbzVar.a.a());
                if (cbbzVar.m()) {
                    cbbzVar.b.m();
                }
                cqkx.p(cbbzVar);
                cbbzVar.d.run();
            }
        }, null, cbauVar, caynVar, gesVar, z);
        this.b = cbatVar.a(dpviVar3, dpviVar4, false, new cbbs(this, cbatVar) { // from class: cbbx
            private final cbbz a;
            private final cbat b;

            {
                this.a = this;
                this.b = cbatVar;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                cbbz cbbzVar = this.a;
                cbat cbatVar2 = this.b;
                dpvi a = cbbzVar.a.a();
                if (a == null) {
                    return cbatVar2.b();
                }
                dsqp dsqpVar = (dsqp) a.cu(5);
                dsqpVar.bC(a);
                dpvh dpvhVar = (dpvh) dsqpVar;
                int min = Math.min(a.e + 3, 23);
                if (dpvhVar.c) {
                    dpvhVar.bF();
                    dpvhVar.c = false;
                }
                dpvi dpviVar5 = (dpvi) dpvhVar.b;
                dpviVar5.a |= 8;
                dpviVar5.e = min;
                return dpvhVar.bK();
            }
        }, new Runnable(this) { // from class: cbby
            private final cbbz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbbz cbbzVar = this.a;
                if (cbbzVar.m()) {
                    cbbzVar.b.q(true);
                    cbbzVar.e = cbbzVar.c.getString(R.string.UGC_EVENTS_ERROR_END_TIME_BEFORE_START_TIME);
                } else {
                    cbbzVar.b.q(false);
                    cbbzVar.e = "";
                }
                if (cbbzVar.d() == null) {
                    cbbzVar.f.l(null);
                }
                cqkx.p(cbbzVar);
                cbbzVar.d.run();
            }
        }, dpviVar, cbauVar, caynVar, gesVar, z);
        this.c = activity;
        this.d = runnable;
        this.g = gesVar;
        this.h = cbatVar;
        this.i = cbqgVar;
        this.j = z;
    }

    private final boolean n(boolean z) {
        dpvi c = c();
        if (c == null) {
            if (z) {
                this.c.getString(R.string.UGC_EVENTS_ERROR_MISSING_START_DATE_TIME);
                cqkx.p(this);
            }
            return false;
        }
        dpvi d = d();
        if (d == null || !p(d).C(p(c))) {
            return true;
        }
        if (z) {
            this.e = this.c.getString(R.string.UGC_EVENTS_ERROR_END_TIME_BEFORE_START_TIME);
            cqkx.p(this);
        }
        return false;
    }

    private static boolean o(dpvi dpviVar) {
        int i = dpviVar.a;
        return ((i & 8) == 0 || (i & 16) == 0) ? false : true;
    }

    private static eaph p(dpvi dpviVar) {
        return new eaph(dpviVar.b, dpviVar.c, dpviVar.d, dpviVar.e, dpviVar.f);
    }

    @Override // defpackage.cbra
    public cbqs a() {
        return this.a;
    }

    @Override // defpackage.cbra
    public cbqs b() {
        return this.b;
    }

    @Override // defpackage.cbra
    @dzsi
    public dpvi c() {
        return this.a.a();
    }

    @Override // defpackage.cbra
    @dzsi
    public dpvi d() {
        return this.b.a();
    }

    @Override // defpackage.cbra
    public String e() {
        return this.e;
    }

    @Override // defpackage.cbra
    public Boolean f() {
        return Boolean.valueOf(c() != null);
    }

    @Override // defpackage.cbrs
    public Boolean g() {
        return Boolean.valueOf(n(true));
    }

    @Override // defpackage.cbrs
    public Boolean h() {
        return Boolean.valueOf(n(false));
    }

    @Override // defpackage.cbra
    public String i() {
        return this.c.getResources().getString(R.string.DOES_NOT_REPEAT_TEXT);
    }

    @Override // defpackage.cbrp
    public Boolean j() {
        boolean z = true;
        if (!this.a.j().booleanValue() && !this.b.j().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cbra
    public cqkl k() {
        dpvi c = c();
        if (c == null) {
            c = this.h.b();
        }
        dpvi d = d();
        this.f.f(c);
        this.f.l(d);
        this.g.aZ(cbbt.g(this.f));
        return cqkl.a;
    }

    @Override // defpackage.cbra
    public Boolean l() {
        boolean z = false;
        if (!this.j && c() != null && this.i.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final boolean m() {
        dpvi c = c();
        dpvi d = d();
        return c != null && d != null && o(c) && o(d) && !p(c).C(p(d));
    }
}
