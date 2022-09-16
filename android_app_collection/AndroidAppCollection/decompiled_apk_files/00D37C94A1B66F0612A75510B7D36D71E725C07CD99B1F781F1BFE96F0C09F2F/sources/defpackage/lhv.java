package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: lhv  reason: default package */
/* loaded from: classes3.dex */
class lhv extends lhp implements axoo {
    private ContextWrapper ar;
    private volatile amhs as;
    private final Object at = new Object();
    private boolean au = false;

    private final void aR() {
        if (this.ar == null) {
            this.ar = new amht(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.ar;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aR();
        aJ();
    }

    @Override // defpackage.axoo
    /* renamed from: aI */
    public final amhs lH() {
        if (this.as == null) {
            synchronized (this.at) {
                if (this.as == null) {
                    this.as = new amhs(this);
                }
            }
        }
        return this.as;
    }

    protected final void aJ() {
        if (!this.au) {
            this.au = true;
            lhk lhkVar = (lhk) this;
            ean eanVar = (ean) lI();
            ((lhp) lhkVar).c = (afvn) eanVar.a.au.get();
            ((lhp) lhkVar).d = (aadd) eanVar.a.K.get();
            lhkVar.ap = (aacz) eanVar.a.D.get();
            ((lhp) lhkVar).e = eanVar.b.g();
            ((lhp) lhkVar).ae = eanVar.b.d();
            ((lhp) lhkVar).af = (yrj) eanVar.a.as.get();
            ((lhp) lhkVar).ag = (aafo) eanVar.b.k.get();
            lgm dK = ((lgp) ((axon) ((amhu) eanVar.b.c.get()).a()).lI()).dK();
            axzl.o(dK);
            lhkVar.ah = dK;
            lhkVar.ai = (gfu) eanVar.a.eA.get();
            lhkVar.aq = (vzc) eanVar.a.hY.get();
            lhkVar.aj = (acwn) eanVar.a.mz.get();
            lhkVar.ak = gad.n(eanVar.b.a(), (aafo) eanVar.b.k.get(), eanVar.b.d(), eanVar.b.g(), eanVar.a.ap());
            lhkVar.al = (ayor) eanVar.a.iz.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        ae defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        amhg amhgVar = (amhg) awwc.u(this, amhg.class);
        amhh a = amhgVar.a();
        return new amhf(this, ((axno) awwc.u(amhgVar.b().a(), axno.class)).jv().a(this, defaultViewModelProviderFactory), a.a, a.b);
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aR();
        aJ();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(new amht(ax(), this));
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.ar == null) {
            return null;
        }
        aR();
        return this.ar;
    }
}
