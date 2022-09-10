package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atly  reason: default package */
/* loaded from: classes2.dex */
public class atly extends astm implements atcv {
    public final dxio<arlw> a;
    public boolean b;
    @dzsi
    private atlq c;
    private final btrm d;
    private final Activity e;
    private final dehq f;
    private final btpc g;
    private final crow h;
    private final dbsg<arkb> i;
    private final dxio<dbsg<arkd>> j;
    private final atlt k;

    public atly(final asmp asmpVar, Activity activity, Context context, btrm btrmVar, cqhn cqhnVar, @dzsi asuh asuhVar, @dzsi audn audnVar, dehq dehqVar, btvo btvoVar, btpc btpcVar, dbsg<arkb> dbsgVar, dxio<dbsg<arkd>> dxioVar, crow crowVar, dxio<arlw> dxioVar2, atlt atltVar) {
        super(asmpVar, context.getResources(), btvoVar, asuhVar, audnVar, new asud(context.getResources(), new Runnable(asmpVar) { // from class: atlv
            private final asmp a;

            {
                this.a = asmpVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.E();
            }
        }, dtxw.bi, false, true));
        this.b = false;
        this.d = btrmVar;
        this.f = dehqVar;
        this.e = activity;
        this.g = btpcVar;
        this.h = crowVar;
        this.a = dxioVar2;
        this.i = dbsgVar;
        this.j = dxioVar;
        this.k = atltVar;
        D();
        super.w().f(super.i().booleanValue());
        cqkx.p(super.w());
    }

    private final void D() {
        atlq atlqVar;
        crqf crqfVar;
        if (this.i.a() && (atlqVar = this.c) != null && (crqfVar = atlqVar.m) != null && crqfVar.g().a.h == dqvj.WALK) {
            amub amubVar = crqfVar.g().a;
            deha.q(this.i.b().c(), new atlx(this), this.f);
        }
    }

    private final boolean E() {
        atlq atlqVar = this.c;
        return this.b && atlqVar != null && atlqVar.e() == dqvj.WALK;
    }

    private final void F() {
        View findViewById = this.e.findViewById(16908290);
        if (findViewById == null) {
            return;
        }
        ckos.b(findViewById, R.string.ARWN_GUIDED_NAV_SNACKBAR_NO_NETWORK_CONNECTIVITY, 0).c();
    }

    public void C(alhw alhwVar) {
    }

    @Override // defpackage.asmo
    public void NZ(@dzsi Bundle bundle) {
        btrm btrmVar = this.d;
        dceq a = dcet.a();
        a.b(alhw.class, new atlz(alhw.class, this));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.atcv
    public void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        if (!atlqVar.b()) {
            return;
        }
        this.c = atlqVar;
        D();
        super.w().f(super.i().booleanValue());
        cqkx.p(super.w());
    }

    @Override // defpackage.asmo
    public void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public void Qp() {
        this.d.a(this);
    }

    @Override // defpackage.asmo
    public void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public void b() {
        if (!E() || t().booleanValue()) {
            return;
        }
        F();
    }

    @Override // defpackage.asmo
    public void c() {
    }

    @Override // defpackage.astm, defpackage.asuq
    public Boolean q() {
        return Boolean.valueOf(super.B());
    }

    @Override // defpackage.astm, defpackage.asuq
    public Boolean s() {
        boolean E = E();
        if (E) {
            ddnp ddnpVar = this.h.b;
            if (ddnpVar.c) {
                ddnpVar.bF();
                ddnpVar.c = false;
            }
            ddnq ddnqVar = (ddnq) ddnpVar.b;
            ddnq ddnqVar2 = ddnq.j;
            ddnqVar.a |= 2;
            ddnqVar.c = true;
        }
        return Boolean.valueOf(E);
    }

    @Override // defpackage.astm, defpackage.asuq
    public Boolean t() {
        boolean z = false;
        if (this.b && this.g.i()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.astm, defpackage.asuq
    public cqkl u() {
        if (!this.j.a().a()) {
            return cqkl.a;
        }
        atlq atlqVar = this.c;
        crqf crqfVar = atlqVar == null ? null : atlqVar.m;
        if (crqfVar == null) {
            return cqkl.a;
        }
        if (!this.g.i()) {
            F();
            return cqkl.a;
        } else if (!this.b) {
            ckos.b(this.e.findViewById(16908290), R.string.ARWN_UNAVAILABLE_AREA_NAVIGATION, 0).c();
            return cqkl.a;
        } else {
            arke c = arkf.c();
            ((arkg) c).a = crqfVar.g().a;
            this.j.a().b().a(c.a());
            return cqkl.a;
        }
    }

    @Override // defpackage.astm, defpackage.asuq
    @dzsi
    public View.OnLayoutChangeListener v() {
        return new View.OnLayoutChangeListener(this) { // from class: atlw
            private final atly a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                atly atlyVar = this.a;
                if (view.isShown()) {
                    arlw a = atlyVar.a.a();
                    a.c = view;
                    a.a.a().a(a);
                }
            }
        };
    }

    @Override // defpackage.astm
    @dzsi
    protected final astc x() {
        return this.c;
    }

    @Override // defpackage.astm, defpackage.asuq
    public Boolean y() {
        return true;
    }

    @Override // defpackage.astm, defpackage.asuq
    public Float z() {
        return Float.valueOf(this.k.a());
    }
}
