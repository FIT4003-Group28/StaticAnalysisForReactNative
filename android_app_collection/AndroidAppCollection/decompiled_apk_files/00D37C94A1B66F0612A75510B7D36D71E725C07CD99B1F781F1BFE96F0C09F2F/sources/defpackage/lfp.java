package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
/* compiled from: PG */
/* renamed from: lfp  reason: default package */
/* loaded from: classes3.dex */
class lfp extends lhp implements axoo {
    private ContextWrapper ar;
    private volatile axoe as;
    private final Object at = new Object();
    private boolean au = false;

    private final void aR() {
        if (this.ar == null) {
            this.ar = axoe.b(super.rb(), this);
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
    public final axoe lH() {
        if (this.as == null) {
            synchronized (this.at) {
                if (this.as == null) {
                    this.as = new axoe(this);
                }
            }
        }
        return this.as;
    }

    protected final void aJ() {
        if (!this.au) {
            this.au = true;
            lhj lhjVar = (lhj) this;
            eao eaoVar = (eao) lI();
            ((lhp) lhjVar).c = (afvn) eaoVar.b.au.get();
            ((lhp) lhjVar).d = (aadd) eaoVar.b.K.get();
            lhjVar.ap = (aacz) eaoVar.b.D.get();
            ((lhp) lhjVar).e = (acti) eaoVar.c.K.get();
            ((lhp) lhjVar).ae = (SettingsDataAccess) eaoVar.c.jt.get();
            ((lhp) lhjVar).af = (yrj) eaoVar.b.as.get();
            ((lhp) lhjVar).ag = (aafo) eaoVar.c.H.get();
            lhjVar.ah = (lgm) eaoVar.c.jM.get();
            lhjVar.ai = (gfu) eaoVar.b.eA.get();
            lhjVar.aq = (vzc) eaoVar.b.hY.get();
            lhjVar.aj = (acwn) eaoVar.b.mz.get();
            lhjVar.ak = gad.n(eaoVar.c.a(), (aafo) eaoVar.c.H.get(), (SettingsDataAccess) eaoVar.c.jt.get(), (acti) eaoVar.c.K.get(), eaoVar.b.ap());
            lhjVar.al = (ayor) eaoVar.b.iz.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
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
        return LayoutInflater.from(axoe.c(ax(), this));
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
