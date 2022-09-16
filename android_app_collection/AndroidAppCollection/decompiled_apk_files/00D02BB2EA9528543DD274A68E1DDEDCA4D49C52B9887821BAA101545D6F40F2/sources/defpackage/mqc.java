package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mqc  reason: default package */
/* loaded from: classes7.dex */
public class mqc implements mpc {
    public final mor a;
    private final Context b;
    private final mpt c;
    private final ldm d;

    public mqc(Context context, ldm ldmVar, mpt mptVar, mor morVar) {
        knz.d(koa.NO_BATTERY_INFORMATION, "", null, "");
        this.b = context;
        this.d = ldmVar;
        this.c = mptVar;
        this.a = morVar;
    }

    @Override // defpackage.mpc
    public CharSequence a() {
        return this.a.j();
    }

    @Override // defpackage.mpc
    public CharSequence b() {
        return this.a.g();
    }

    @Override // defpackage.mpc
    public CharSequence c() {
        return this.a.r.r();
    }

    @Override // defpackage.mpc
    public cqss d() {
        return this.a.i();
    }

    @Override // defpackage.mpc
    public Boolean e() {
        return Boolean.valueOf(this.a.h());
    }

    @Override // defpackage.mpc
    public Boolean f() {
        qbm qbmVar = this.d.f;
        boolean z = false;
        if (qbmVar != null && qbmVar.o() && !this.a.k() && !this.a.r.s()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mpc
    public Boolean g() {
        return Boolean.valueOf(this.a.a());
    }

    @Override // defpackage.mpc
    @dzsi
    public cqtd h() {
        return this.a.b();
    }

    @Override // defpackage.mpc
    public CharSequence i() {
        int d = this.a.d();
        return d == 0 ? "" : this.b.getResources().getString(d);
    }

    @Override // defpackage.mpc
    public Boolean j() {
        return Boolean.valueOf(!this.a.n.b());
    }

    @Override // defpackage.mpc
    public Boolean k() {
        return Boolean.valueOf(this.a.e() != 0);
    }

    @Override // defpackage.mpc
    public Integer l() {
        int e = this.a.e();
        return e == 0 ? Integer.valueOf((int) R.string.CAR_LOADING_ROUTE) : Integer.valueOf(e);
    }

    @Override // defpackage.mpc
    public Integer m() {
        int t = this.a.r.t();
        return t == 0 ? l() : Integer.valueOf(t);
    }

    @Override // defpackage.mpc
    public Boolean n() {
        return Boolean.valueOf(this.a.r.d());
    }

    @Override // defpackage.mpc
    public Boolean o() {
        return Boolean.valueOf(this.a.r.e());
    }

    @Override // defpackage.mpc
    @dzsi
    public cjtd p() {
        ddho c = this.a.r.c();
        if (c != null) {
            return cjtd.a(c);
        }
        return null;
    }

    @Override // defpackage.mpc
    public cqkl q() {
        this.a.m();
        ((mik) this.c).a.l();
        return cqkl.a;
    }

    @Override // defpackage.mpc
    public cqkl r() {
        mio mioVar = ((mik) this.c).a;
        if (mioVar.q.a() != 0) {
            mioVar.c.a();
            mioVar.m.k(mioVar.l.e(mioVar.s, mioVar.r, mioVar.q, mioVar.e, mioVar.i));
            mioVar.c.b();
        }
        return cqkl.a;
    }

    @Override // defpackage.mpc
    public Boolean s() {
        return false;
    }

    @Override // defpackage.mpc
    public Boolean t() {
        return false;
    }
}
