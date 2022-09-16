package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: jtb  reason: default package */
/* loaded from: classes3.dex */
class jtb extends gbd implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void q() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        q();
        p();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        q();
        p();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    @Override // defpackage.axoo
    /* renamed from: n */
    public final axoe lH() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axoe(this);
                }
            }
        }
        return this.b;
    }

    protected final void p() {
        if (!this.d) {
            this.d = true;
            jsi jsiVar = (jsi) this;
            eao eaoVar = (eao) lI();
            jsiVar.ar = axot.a(eaoVar.b.rN);
            jsiVar.av = (aacz) eaoVar.b.D.get();
            jsiVar.as = (fsx) eaoVar.c.iA.get();
            jsiVar.at = (gbh) eaoVar.c.aa.get();
            jsiVar.au = (gbq) eaoVar.c.l.get();
            azqb azqbVar = eaoVar.as;
            dyo dyoVar = eaoVar.b;
            azqb azqbVar2 = dyoVar.y;
            azqb azqbVar3 = dyoVar.xP;
            dxs dxsVar = dyoVar.a;
            jsiVar.a = new jry(azqbVar, azqbVar2, azqbVar3, dxsVar.as, dyoVar.od, dxsVar.at, dyoVar.dD, dyoVar.h, dyoVar.x, dxsVar.aU, dxsVar.aT, eaoVar.m, dyoVar.D, dyoVar.gY, dyoVar.le, dyoVar.v);
            jsiVar.b = (fsx) eaoVar.c.iB.get();
            jsiVar.c = new jta((aafo) eaoVar.c.H.get());
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        q();
        return this.a;
    }
}
