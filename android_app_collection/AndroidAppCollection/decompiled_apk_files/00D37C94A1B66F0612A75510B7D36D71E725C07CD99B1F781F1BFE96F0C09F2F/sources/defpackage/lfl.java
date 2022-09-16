package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
/* compiled from: PG */
/* renamed from: lfl  reason: default package */
/* loaded from: classes3.dex */
public abstract class lfl extends lio implements axoo {
    private ContextWrapper c;
    private volatile axoe d;
    private final Object e = new Object();
    private boolean ae = false;

    private final void aK() {
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
        aK();
        aJ();
    }

    @Override // defpackage.axoo
    /* renamed from: aI */
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

    protected final void aJ() {
        if (!this.ae) {
            this.ae = true;
            OfflinePrefsFragment offlinePrefsFragment = (OfflinePrefsFragment) this;
            eao eaoVar = (eao) lI();
            offlinePrefsFragment.aE = eaoVar.aS();
            offlinePrefsFragment.aF = (yzj) eaoVar.b.je.get();
            offlinePrefsFragment.aC = (agrf) eaoVar.b.gS.get();
            offlinePrefsFragment.e = (agvq) eaoVar.b.hf.get();
            offlinePrefsFragment.aD = (eyj) eaoVar.b.wX.get();
            offlinePrefsFragment.ae = (ywa) eaoVar.b.gQ.get();
            offlinePrefsFragment.af = (lgm) eaoVar.c.jM.get();
            offlinePrefsFragment.ag = (Handler) eaoVar.b.an.get();
            offlinePrefsFragment.ah = eaoVar.c.hf();
            offlinePrefsFragment.ai = (fcu) eaoVar.b.gY.get();
            offlinePrefsFragment.aj = (agcp) eaoVar.b.et.get();
            dwq dwqVar = eaoVar.c;
            offlinePrefsFragment.ak = new ahbp(dwqVar.f, dwqVar.s, eaoVar.b.hf);
            offlinePrefsFragment.al = (fcj) eaoVar.b.mL.get();
            offlinePrefsFragment.am = (aghg) eaoVar.b.lx.get();
            offlinePrefsFragment.an = (ahdf) eaoVar.b.ha.get();
            offlinePrefsFragment.ao = (fby) eaoVar.b.a.bf.get();
            offlinePrefsFragment.ap = axot.a(eaoVar.b.zH);
            offlinePrefsFragment.aq = (SettingsDataAccess) eaoVar.c.jt.get();
            offlinePrefsFragment.ar = (axxh) eaoVar.b.kG.get();
            offlinePrefsFragment.as = (axxa) eaoVar.b.nM.get();
            offlinePrefsFragment.at = eaoVar.b.cI();
            offlinePrefsFragment.au = (fvf) eaoVar.c.bf.get();
            offlinePrefsFragment.av = (jsf) eaoVar.b.pj.get();
            offlinePrefsFragment.aw = (agsd) eaoVar.b.lo.get();
            offlinePrefsFragment.ax = (ayor) eaoVar.b.aq.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aK();
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
        if (super.rb() == null && this.c == null) {
            return null;
        }
        aK();
        return this.c;
    }
}
