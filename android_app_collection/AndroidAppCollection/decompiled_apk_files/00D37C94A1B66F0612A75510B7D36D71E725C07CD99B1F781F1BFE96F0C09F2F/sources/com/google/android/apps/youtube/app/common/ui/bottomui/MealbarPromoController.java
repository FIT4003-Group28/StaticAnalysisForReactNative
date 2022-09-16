package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MealbarPromoController implements f {
    public final fvc a;
    public final fvd b;
    public final acti c;
    public atds d;
    public akff e;
    public atds f;
    public ezx g;
    public final fuq h;
    public final mdu i;
    private final Context j;
    private final akfd k;
    private final fuw l;
    private final fup m;
    private aypg n;
    private final yni o;
    private final airw p;
    private final aypf q;
    private final ezh r;
    private final akcn s;
    private final fvb t = new fvb(this);
    private final fuz u = new fuz(this);
    private final aacz v;

    public MealbarPromoController(Context context, acti actiVar, akfd akfdVar, fuw fuwVar, fup fupVar, yni yniVar, airw airwVar, aacz aaczVar, akbn akbnVar, ezh ezhVar, akcn akcnVar, mdu mduVar, fuq fuqVar) {
        this.j = context;
        actiVar.getClass();
        this.c = actiVar;
        akfdVar.getClass();
        this.k = akfdVar;
        if (akfdVar instanceof fun) {
            ((fun) akfdVar).b = akbnVar;
        }
        this.l = fuwVar;
        this.m = fupVar;
        this.o = yniVar;
        this.p = airwVar;
        this.v = aaczVar;
        this.q = new aypf();
        this.r = ezhVar;
        this.s = akcnVar;
        this.i = mduVar;
        this.h = fuqVar;
        this.a = new fvc();
        this.b = new fvd();
    }

    public final void g(atds atdsVar) {
        if (atdsVar == null || this.e == null || !atdsVar.equals(this.d)) {
            return;
        }
        this.k.m(this.e);
    }

    public final void h(atds atdsVar, acti actiVar) {
        this.b.b(null);
        this.f = null;
        if (atdsVar == null) {
            if (this.e == null) {
                return;
            }
            g(this.d);
            return;
        }
        int N = almu.N(atdsVar.h);
        if (N == 0 || N != 2) {
            int N2 = almu.N(atdsVar.h);
            if (N2 != 0 && N2 == 6) {
                this.f = atdsVar;
                return;
            } else {
                this.b.b(atdsVar);
                return;
            }
        }
        i(atdsVar, actiVar);
    }

    public final void i(atds atdsVar, acti actiVar) {
        if (atdsVar == null || atdsVar.equals(this.d)) {
            return;
        }
        fuy fuyVar = new fuy(this, atdsVar);
        akfe b = this.m.b(atdsVar, null);
        if (atdsVar.p.size() == 0) {
            b.m = this.l.a(atdsVar, actiVar, fuyVar);
            this.k.n(j(b));
        } else if (!this.s.c(atdsVar.p)) {
        } else {
            b.m = this.l.a(atdsVar, actiVar, fuyVar);
            this.k.n(j(b));
            this.s.a(atdsVar.p);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.v)) {
            this.q.c();
        } else {
            this.o.m(this.t);
        }
        this.o.m(this.u);
        aypg aypgVar = this.n;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.n = null;
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.v)) {
            this.q.c();
            this.q.g(this.t.g(this.p));
        } else {
            this.o.g(this.t);
        }
        this.o.g(this.u);
        this.g = this.r.g();
        this.n = this.r.h().B().as(new ayqb() { // from class: fux
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                MealbarPromoController mealbarPromoController = MealbarPromoController.this;
                ezx ezxVar = (ezx) obj;
                if (mealbarPromoController.g == ezx.WATCH_WHILE_PICTURE_IN_PICTURE) {
                    atds atdsVar = mealbarPromoController.f;
                    mealbarPromoController.f = null;
                    mealbarPromoController.i(atdsVar, mealbarPromoController.c);
                }
                mealbarPromoController.g = ezxVar;
            }
        });
    }

    private final akff j(akfe akfeVar) {
        Boolean bool = akfeVar.b;
        if (bool == null) {
            throw new IllegalStateException("Property \"counterfactual\" has not been set");
        }
        if (bool.booleanValue()) {
            if (TextUtils.isEmpty(akfeVar.c)) {
                akfeVar.c = this.j.getString(R.string.common_error_generic);
            }
            if (TextUtils.isEmpty(akfeVar.e)) {
                akfeVar.b(this.j.getString(R.string.dismiss), null, null);
            }
        }
        return akfeVar.e();
    }
}
