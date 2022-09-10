package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iwv  reason: default package */
/* loaded from: classes.dex */
public class iwv extends ivw {
    amwd c;
    final dbty<cqss> d;
    final cqss e;
    cqtd f;
    cqtd g;
    private final Activity h;
    private final btrm i;
    private final ahjq j;
    private final axru k;
    private final arai l;
    private final Executor m;
    private final btvo n;
    private final crzp<arah> o;

    public iwv(Activity activity, final btvo btvoVar, btrm btrmVar, ahjq ahjqVar, axru axruVar, cqhn cqhnVar, arai araiVar, Executor executor, bsvm bsvmVar) {
        super(activity, ivu.FIXED, jaq.NO_TINT_ON_TRANSPARENT, cqrt.f(2131231603), "", null, true, R.id.mylocation_button, ivv.FULL);
        this.c = amwd.TRACKING;
        this.o = new iwt(this);
        this.h = activity;
        this.i = btrmVar;
        this.c = amwd.TRACKING;
        this.j = ahjqVar;
        this.k = axruVar;
        this.l = araiVar;
        this.m = executor;
        this.n = btvoVar;
        this.d = dbud.a(new dbty(btvoVar) { // from class: iws
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                if (!this.a.getLocationParameters().p) {
                    return ibm.p();
                }
                return ibm.C();
            }
        });
        this.e = ibm.p();
    }

    private final boolean N() {
        return this.j.h().b() || (k() && !this.k.a("android.permission.ACCESS_FINE_LOCATION"));
    }

    private static cqtd l(int i, cqss cqssVar, cqss cqssVar2) {
        return new iwu(new Object[]{Integer.valueOf(i), cqssVar, cqssVar2}, i, cqssVar2, cqssVar);
    }

    @Override // defpackage.ivw, defpackage.jar
    public Integer I() {
        return 8388693;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        this.i.b(new ardp());
        return cqkl.a;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean b() {
        return false;
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqkl c() {
        return cqkl.a;
    }

    public synchronized void g(amwe amweVar) {
        this.c = amweVar.a;
        cqkx.p(this);
    }

    public void h(ahjx ahjxVar) {
        cqkx.p(this);
    }

    public void i() {
        this.l.a().a(this.o, this.m);
    }

    public void j() {
        this.l.a().c(this.o);
    }

    public final boolean k() {
        return this.n.getLocationParameters().q;
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqtd r() {
        if (N()) {
            return cqrt.h(2131231561, this.d.a());
        }
        amwd amwdVar = amwd.OFF;
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            return l(2131231603, this.e, iva.b(ibl.s(), ibl.g()));
        }
        if (ordinal == 1) {
            return l(2131231603, iva.b(ibl.H(), ibl.E()), iva.b(ibl.H(), ibl.D()));
        }
        if (ordinal == 2) {
            return l(2131231602, iva.b(ibl.H(), ibl.E()), iva.b(ibl.H(), ibl.D()));
        }
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("unknown mode: ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqtd u() {
        amwd amwdVar = amwd.OFF;
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            if (this.g == null) {
                this.g = v(irm.w);
            }
            return this.g;
        } else if (ordinal == 1 || ordinal == 2) {
            if (this.f == null) {
                this.f = v(irm.x);
            }
            return this.f;
        } else {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("unknown mode: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        }
    }

    @Override // defpackage.ivw, defpackage.jar
    public String y() {
        if (N()) {
            return this.h.getString(R.string.ACCESSIBILITY_MOVE_TO_MY_LOCATION_DISABLED);
        }
        amwd amwdVar = amwd.OFF;
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            return this.h.getString(R.string.ACCESSIBILITY_MOVE_TO_MY_LOCATION);
        }
        if (ordinal == 1) {
            return this.h.getString(R.string.ACCESSIBILITY_ENTER_COMPASS_MODE);
        }
        if (ordinal == 2) {
            return this.h.getString(R.string.ACCESSIBILITY_EXIT_COMPASS_MODE);
        }
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("unknown mode: ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    @Override // defpackage.ivw, defpackage.jar
    public cjtd z() {
        if (N()) {
            return cjtd.a(dtxv.ec);
        }
        amwd amwdVar = amwd.OFF;
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            return cjtd.a(dtxv.em);
        }
        if (ordinal == 1) {
            return cjtd.a(dtxv.ea);
        }
        if (ordinal == 2) {
            return cjtd.a(dtxv.eb);
        }
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("unknown mode: ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }
}
