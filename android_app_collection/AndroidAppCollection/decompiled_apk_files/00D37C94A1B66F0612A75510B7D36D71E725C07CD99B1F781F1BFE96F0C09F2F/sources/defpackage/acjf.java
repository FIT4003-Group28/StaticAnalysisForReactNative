package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acjf  reason: default package */
/* loaded from: classes.dex */
public abstract class acjf extends actq implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void a() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        aF();
    }

    @Override // defpackage.axoo
    /* renamed from: aE */
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

    protected final void aF() {
        if (!this.d) {
            this.d = true;
            acke ackeVar = (acke) this;
            eao eaoVar = (eao) lI();
            ackeVar.b = (aafo) eaoVar.c.H.get();
            ackeVar.c = (acti) eaoVar.c.je.get();
            ackeVar.d = (Handler) eaoVar.b.an.get();
            ackeVar.e = (ackg) eaoVar.c.nh.get();
            ackeVar.ae = eaoVar.b.gz();
            ackeVar.af = eaoVar.c.hz();
            ackeVar.ag = (ache) eaoVar.b.a.bn.get();
            ackeVar.ah = eaoVar.c.gv();
            ackeVar.ai = (akvm) eaoVar.b.hl.get();
            dwq dwqVar = eaoVar.c;
            azqb azqbVar = dwqVar.f;
            dyo dyoVar = eaoVar.b;
            ackeVar.aj = new abyl(azqbVar, dyoVar.an, dwqVar.ni, dwqVar.nj, dwqVar.nk, dwqVar.nl, dwqVar.nm, eaoVar.aL, eaoVar.aM, dyoVar.v, dwqVar.nn, dwqVar.ht, dwqVar.no, dwqVar.jg, dyoVar.Ai);
            ackeVar.ak = (akfo) eaoVar.c.af.get();
            ackeVar.al = (snc) eaoVar.b.v.get();
            eaoVar.c.iA();
            ackeVar.am = eaoVar.c.iz();
            ackeVar.an = (afvn) eaoVar.b.au.get();
            ackeVar.ao = (aagi) eaoVar.b.dD.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public void kt(Context context) {
        super.kt(context);
        a();
        aF();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}
