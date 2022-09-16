package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.PrivacyPrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
/* compiled from: PG */
/* renamed from: lfm  reason: default package */
/* loaded from: classes3.dex */
public abstract class lfm extends lin implements axoo {
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
            PrivacyPrefsFragment privacyPrefsFragment = (PrivacyPrefsFragment) this;
            eao eaoVar = (eao) lI();
            afvn afvnVar = (afvn) eaoVar.b.au.get();
            privacyPrefsFragment.c = (aadd) eaoVar.b.K.get();
            privacyPrefsFragment.d = (akjl) eaoVar.c.mw.get();
            privacyPrefsFragment.e = (SettingsDataAccess) eaoVar.c.jt.get();
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
