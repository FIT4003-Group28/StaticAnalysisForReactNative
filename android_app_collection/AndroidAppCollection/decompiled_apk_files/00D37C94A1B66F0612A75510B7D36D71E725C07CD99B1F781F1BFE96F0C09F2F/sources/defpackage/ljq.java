package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment;
/* compiled from: PG */
/* renamed from: ljq  reason: default package */
/* loaded from: classes3.dex */
public abstract class ljq extends lio implements axoo {
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
            DataSavingPrefsFragment dataSavingPrefsFragment = (DataSavingPrefsFragment) this;
            eao eaoVar = (eao) lI();
            dataSavingPrefsFragment.aE = eaoVar.aS();
            dataSavingPrefsFragment.aF = (yzj) eaoVar.b.je.get();
            dataSavingPrefsFragment.ah = (yrj) eaoVar.b.as.get();
            dataSavingPrefsFragment.ai = (aadd) eaoVar.b.K.get();
            dataSavingPrefsFragment.aj = (lgm) eaoVar.c.jM.get();
            dataSavingPrefsFragment.ak = (SettingsDataAccess) eaoVar.c.jt.get();
            dataSavingPrefsFragment.al = (yve) eaoVar.b.a.al.get();
            dataSavingPrefsFragment.am = (ayor) eaoVar.b.iz.get();
            dataSavingPrefsFragment.an = eaoVar.b.cI();
            dataSavingPrefsFragment.ao = (axxg) eaoVar.b.a.bg.get();
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
