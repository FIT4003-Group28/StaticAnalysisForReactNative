package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsqk  reason: default package */
/* loaded from: classes4.dex */
public final class bsqk {
    public final Resources a;
    @dzsi
    public Runnable b;
    @dzsi
    public Runnable c;
    public final dzsj<cqg> d;
    @dzsi
    public dqim e;
    private final dzsj<anhg> f;
    private final dxio<afha> g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k = false;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    @dzsi
    private dqdk p;
    private final brmb q;

    public bsqk(Application application, @dzsi Runnable runnable, @dzsi Runnable runnable2, brmb brmbVar, dxio<afha> dxioVar, dzsj<cqg> dzsjVar, dzsj<anhg> dzsjVar2) {
        this.a = application.getResources();
        this.q = brmbVar;
        this.g = dxioVar;
        this.d = dzsjVar;
        this.b = runnable;
        this.c = runnable2;
        this.f = dzsjVar2;
    }

    private final boolean p() {
        return k().booleanValue() && !l().booleanValue() && !m().booleanValue() && !this.m && !this.n;
    }

    public final void a(@dzsi brln brlnVar, @dzsi brlu brluVar) {
        dqim dqimVar = null;
        if (brlnVar == null || brluVar == null) {
            this.n = true;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = false;
            this.o = false;
            this.p = null;
            return;
        }
        this.n = false;
        this.o = brlnVar.a.g && !brlnVar.b().A;
        this.h = brluVar.d() > 0;
        boolean equals = dwix.h.equals(brluVar.X());
        bsjm bsjmVar = brluVar.o;
        this.i = (equals ^ true) || bsjmVar.b().c.size() > 0;
        this.j = bsjmVar.q();
        this.k = brluVar.ah();
        this.l = brluVar.an() != null;
        this.m = brluVar.d;
        bvrt<dqdk> bvrtVar = brluVar.m;
        dqdk e = bvrtVar != null ? bvrtVar.e((dssr) dqdk.e.cu(7), dqdk.e) : null;
        if (e != null) {
            dsqp dsqpVar = (dsqp) e.cu(5);
            dsqpVar.bC(e);
            dqdj dqdjVar = (dqdj) dsqpVar;
            dplx dplxVar = e.b;
            if (dplxVar == null) {
                dplxVar = dplx.g;
            }
            if ((dplxVar.a & 2) != 0) {
                debv a = debv.a(dplxVar.c);
                a.d("source", "and.gmm.nor");
                dplx dplxVar2 = ((dqdk) dqdjVar.b).b;
                if (dplxVar2 == null) {
                    dplxVar2 = dplx.g;
                }
                dsqp dsqpVar2 = (dsqp) dplxVar2.cu(5);
                dsqpVar2.bC(dplxVar2);
                dplu dpluVar = (dplu) dsqpVar2;
                String debvVar = a.toString();
                if (dpluVar.c) {
                    dpluVar.bF();
                    dpluVar.c = false;
                }
                dplx dplxVar3 = (dplx) dpluVar.b;
                debvVar.getClass();
                dplxVar3.a |= 2;
                dplxVar3.c = debvVar;
                if (dqdjVar.c) {
                    dqdjVar.bF();
                    dqdjVar.c = false;
                }
                dqdk dqdkVar = (dqdk) dqdjVar.b;
                dplx bK = dpluVar.bK();
                bK.getClass();
                dqdkVar.b = bK;
                dqdkVar.a = 1 | dqdkVar.a;
            }
            this.p = dqdjVar.bK();
        } else {
            this.p = null;
        }
        bvrt<dqim> bvrtVar2 = brluVar.n;
        if (bvrtVar2 != null) {
            dqimVar = bvrtVar2.e((dssr) dqim.g.cu(7), dqim.g);
        }
        this.e = dqimVar;
    }

    public final void b() {
        this.f.a().C();
    }

    public final CharSequence c() {
        if (o().booleanValue()) {
            dqim dqimVar = this.e;
            dbsk.s(dqimVar);
            return dqimVar.c;
        } else if (this.m) {
            return this.a.getString(R.string.NO_RESULTS_OFFLINE);
        } else {
            if (this.n) {
                return this.a.getString(R.string.NO_RESULTS_SERVER_ERROR);
            }
            if (m().booleanValue()) {
                return this.a.getString(R.string.NO_RESULTS_VISIT_HISTORY_TITLE);
            }
            if (n().booleanValue()) {
                return this.a.getString(R.string.NO_RESULTS_ON_MAPS);
            }
            return this.a.getString(R.string.RESTRICTION_NO_RESULTS);
        }
    }

    @dzsi
    public final CharSequence d() {
        if (o().booleanValue()) {
            dqim dqimVar = this.e;
            dbsk.s(dqimVar);
            return dqimVar.d;
        } else if (m().booleanValue()) {
            return this.a.getString(R.string.RESTRICTION_ARE_WE_MISSING_RESULTS);
        } else {
            if (l().booleanValue()) {
                return this.a.getString(R.string.RESTRICTION_TRY_ADJUSTING_YOUR_FILTERS);
            }
            if (this.m) {
                return this.a.getString(R.string.NO_RESULTS_CONNECT_TO_INTERNET);
            }
            if (this.n) {
                return this.a.getString(R.string.NO_RESULTS_SOMETHING_HAPPENED);
            }
            if (!p()) {
                return null;
            }
            return this.a.getString(R.string.SEARCH_TRY_SOMETHING_ELSE);
        }
    }

    public final Boolean e() {
        dqim dqimVar = this.e;
        boolean z = false;
        if (dqimVar != null && (dqimVar.a & 64) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: bsqj
            private final bsqk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bsqk bsqkVar = this.a;
                Runnable runnable = bsqkVar.b;
                if (runnable != null) {
                    runnable.run();
                }
                bsqkVar.d.a().b(cqf.a(dnqb.ZERO_SEARCH_RESULTS), true);
            }
        };
    }

    public final Boolean g() {
        boolean z = false;
        if (p() && !o().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final CharSequence h() {
        if (e().booleanValue()) {
            dqim dqimVar = this.e;
            dbsk.s(dqimVar);
            return dqimVar.e;
        }
        return this.a.getString(R.string.SEARCH_WEB_INSTEAD_LINK);
    }

    public final void i() {
        if (e().booleanValue()) {
            afha a = this.g.a();
            dqim dqimVar = this.e;
            dbsk.s(dqimVar);
            dgbo dgboVar = dqimVar.f;
            if (dgboVar == null) {
                dgboVar = dgbo.e;
            }
            a.m(dgboVar.c, 1);
            return;
        }
        dqdk dqdkVar = this.p;
        if (dqdkVar == null) {
            return;
        }
        brmb brmbVar = this.q;
        dplx dplxVar = dqdkVar.b;
        if (dplxVar == null) {
            dplxVar = dplx.g;
        }
        Intent a2 = bvrq.a(dplxVar);
        if (a2.resolveActivity(brmbVar.c.getPackageManager()) == null) {
            return;
        }
        brmbVar.b.o(a2, 2);
    }

    public final cjtd j() {
        if (e().booleanValue()) {
            cjta b = cjtd.b();
            b.d = dtyb.eR;
            return b.a();
        } else if (n().booleanValue()) {
            cjta b2 = cjtd.b();
            b2.d = dtxw.dF;
            dqdk dqdkVar = this.p;
            if (dqdkVar != null && (dqdkVar.a & 8) != 0) {
                b2.g(dqdkVar.d);
            }
            return b2.a();
        } else {
            return cjtd.b;
        }
    }

    public final Boolean k() {
        boolean z = false;
        if (!this.l && !this.k && !this.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final Boolean l() {
        boolean z = false;
        if (k().booleanValue() && this.i && !m().booleanValue() && this.b == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final Boolean m() {
        boolean z = false;
        if (k().booleanValue() && this.j) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final Boolean n() {
        brmb brmbVar = this.q;
        dqdk dqdkVar = this.p;
        boolean z = false;
        if (dqdkVar != null) {
            dplx dplxVar = dqdkVar.b;
            if (dplxVar == null) {
                dplxVar = dplx.g;
            }
            if ((dplxVar.a & 2) != 0 && !btlu.n(brmbVar.a.j()) && this.o && p() && !o().booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public final Boolean o() {
        return Boolean.valueOf(this.e != null);
    }
}
