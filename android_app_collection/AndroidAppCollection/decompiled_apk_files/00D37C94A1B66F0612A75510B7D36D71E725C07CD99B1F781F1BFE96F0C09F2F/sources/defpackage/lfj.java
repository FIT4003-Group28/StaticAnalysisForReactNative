package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
/* compiled from: PG */
/* renamed from: lfj  reason: default package */
/* loaded from: classes3.dex */
public abstract class lfj extends lio implements axoo {
    private ContextWrapper c;
    private volatile axoe d;
    private final Object e = new Object();
    private boolean ae = false;

    private final void aI() {
        if (this.c == null) {
            this.c = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.c;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aI();
        aK();
    }

    @Override // defpackage.axoo
    /* renamed from: aJ */
    public final axoe lH() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = new axoe(this);
                }
            }
        }
        return this.d;
    }

    protected final void aK() {
        if (!this.ae) {
            this.ae = true;
            GeneralPrefsFragment generalPrefsFragment = (GeneralPrefsFragment) this;
            eao eaoVar = (eao) lI();
            generalPrefsFragment.aE = eaoVar.aS();
            generalPrefsFragment.aF = (yzj) eaoVar.b.je.get();
            generalPrefsFragment.c = (yrj) eaoVar.b.as.get();
            generalPrefsFragment.d = (SharedPreferences) eaoVar.b.t.get();
            generalPrefsFragment.e = (agcp) eaoVar.b.et.get();
            aafo aafoVar = (aafo) eaoVar.c.H.get();
            generalPrefsFragment.ar = (aacz) eaoVar.b.D.get();
            generalPrefsFragment.ae = (aadd) eaoVar.b.K.get();
            generalPrefsFragment.af = (ces) eaoVar.b.fC.get();
            generalPrefsFragment.ag = (lgm) eaoVar.c.jM.get();
            generalPrefsFragment.ah = eaoVar.c.aR();
            generalPrefsFragment.ai = (acth) eaoVar.c.L.get();
            generalPrefsFragment.aj = (gfu) eaoVar.b.eA.get();
            generalPrefsFragment.ak = new lht((aacz) eaoVar.b.D.get());
            generalPrefsFragment.al = (yve) eaoVar.b.ez.get();
            generalPrefsFragment.am = (akjl) eaoVar.c.mw.get();
            generalPrefsFragment.as = (acgf) eaoVar.b.a.T.get();
            generalPrefsFragment.an = (SettingsDataAccess) eaoVar.c.jt.get();
            generalPrefsFragment.ao = (ehh) eaoVar.b.iu.get();
            dyo dyoVar = eaoVar.b;
            generalPrefsFragment.ap = dyoVar.a.am;
            generalPrefsFragment.aq = (Handler) dyoVar.an.get();
            fnp fnpVar = (fnp) eaoVar.b.a.U.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aI();
        aK();
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
        if (super.rb() == null && this.c == null) {
            return null;
        }
        aI();
        return this.c;
    }
}
