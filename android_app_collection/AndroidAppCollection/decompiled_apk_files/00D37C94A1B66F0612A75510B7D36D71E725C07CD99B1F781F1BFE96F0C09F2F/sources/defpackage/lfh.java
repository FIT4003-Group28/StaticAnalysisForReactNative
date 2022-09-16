package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
/* compiled from: PG */
/* renamed from: lfh  reason: default package */
/* loaded from: classes3.dex */
public abstract class lfh extends lio implements axoo {
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
            AutoplayPrefsFragment autoplayPrefsFragment = (AutoplayPrefsFragment) this;
            eao eaoVar = (eao) lI();
            autoplayPrefsFragment.aE = eaoVar.aS();
            autoplayPrefsFragment.aF = (yzj) eaoVar.b.je.get();
            autoplayPrefsFragment.c = (SharedPreferences) eaoVar.b.t.get();
            autoplayPrefsFragment.d = (acth) eaoVar.c.L.get();
            autoplayPrefsFragment.e = (akjl) eaoVar.c.mw.get();
            autoplayPrefsFragment.ae = (aadd) eaoVar.b.K.get();
            autoplayPrefsFragment.af = (SettingsDataAccess) eaoVar.c.jt.get();
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
