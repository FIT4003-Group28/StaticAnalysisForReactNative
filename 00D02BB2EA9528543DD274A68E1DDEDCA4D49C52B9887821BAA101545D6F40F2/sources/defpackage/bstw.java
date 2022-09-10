package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bstw  reason: default package */
/* loaded from: classes4.dex */
public final class bstw extends bszv {
    public dxio<bbdv> ad;
    public dxio<bsvm> ae;
    public Context af;
    public btvo ag;

    @Override // defpackage.bszv
    protected final String aQ() {
        return this.af.getString(R.string.EXPLORE_SETTINGS_TITLE);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.ava
    public final boolean g(Preference preference) {
        String str = preference.q;
        if ("plp".equals(str)) {
            this.ae.a().t();
            return true;
        } else if ("epk".equals(str)) {
            this.ae.a().B();
            return true;
        } else if (!"plk".equals(str)) {
            return false;
        } else {
            this.ad.a().l();
            return true;
        }
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        PreferenceScreen b = this.b.b(J());
        e(b);
        if (this.ag.getLocalPreferencesParameters().a) {
            Preference preference = new Preference(this.af);
            preference.C("epk");
            preference.s(this.af.getString(R.string.EXPLORE_PREFERENCES_EAT_AND_DRINK_SIDEMENU_ENTRY_POINT_TEXT));
            b.aj(preference);
        }
        if (!this.ag.getLocalPreferencesParameters().d.isEmpty()) {
            Preference preference2 = new Preference(this.af);
            preference2.C("plp");
            preference2.s(this.af.getString(R.string.EXPLORE_PREFERENCES_SETTINGS_LANDING_PAGE_ENTRY_POINT_TEXT));
            b.aj(preference2);
        }
        Preference preference3 = new Preference(this.af);
        preference3.C("plk");
        preference3.t(R.string.EXPLORE_PREFERENCES_YOUR_FEEDBACK_ENTRY_POINT_TEXT);
        b.aj(preference3);
    }

    @Override // defpackage.bszv
    public final void w() {
        ((bstx) btsx.b(bstx.class, this)).dg(this);
    }
}
