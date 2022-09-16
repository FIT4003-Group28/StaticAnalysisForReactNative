package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: jjb  reason: default package */
/* loaded from: classes3.dex */
class jjb extends gbd implements axoo {
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
            jjg jjgVar = (jjg) this;
            eao eaoVar = (eao) lI();
            jjgVar.ar = axot.a(eaoVar.b.rN);
            jjgVar.av = (aacz) eaoVar.b.D.get();
            jjgVar.as = (fsx) eaoVar.c.iA.get();
            jjgVar.at = (gbh) eaoVar.c.aa.get();
            jjgVar.au = (gbq) eaoVar.c.l.get();
            jjgVar.a = (yni) eaoVar.b.y.get();
            jjgVar.b = (yrj) eaoVar.b.as.get();
            jjgVar.c = eaoVar.c.in();
            jjgVar.am = (agrf) eaoVar.b.gS.get();
            dyo dyoVar = eaoVar.b;
            azqb azqbVar = dyoVar.it;
            dwq dwqVar = eaoVar.c;
            jjgVar.d = new jew(azqbVar, dwqVar.f, dyoVar.y, dyoVar.K, eaoVar.ao, eaoVar.ap, dyoVar.yr, eaoVar.aq, dwqVar.mz, dwqVar.ai, eaoVar.ar, dyoVar.gS);
            jjgVar.e = (jln) eaoVar.b.xP.get();
            jjgVar.ae = (fcd) eaoVar.b.od.get();
            jjgVar.af = axot.a(eaoVar.c.iR);
            jjgVar.ag = (jnw) eaoVar.b.zR.get();
            jjgVar.ah = (fsx) eaoVar.c.iB.get();
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
