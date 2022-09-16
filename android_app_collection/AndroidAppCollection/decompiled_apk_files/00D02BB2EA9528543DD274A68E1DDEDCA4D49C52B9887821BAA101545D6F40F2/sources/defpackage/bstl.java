package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bstl  reason: default package */
/* loaded from: classes4.dex */
public final class bstl extends bszv {
    public Context ad;
    public cjqy ae;

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(R.string.ABOUT);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.ava
    public final boolean g(Preference preference) {
        if (!this.aX || !"DEBUG_COOKIE".equals(preference.q)) {
            return false;
        }
        preference.l().toString();
        return true;
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        PreferenceScreen b = this.b.b(this.ad);
        e(b);
        Preference preference = new Preference(this.ad);
        preference.s(this.ad.getString(R.string.APP_FULL_NAME));
        preference.k(this.ad.getString(R.string.COPYRIGHT));
        b.aj(preference);
        Preference preference2 = new Preference(this.ad);
        preference2.s(this.ad.getString(R.string.VERSION));
        Context context = this.ad;
        preference2.k(context.getString(R.string.ABOUT_VERSION_SUMMARY, bvoc.a(context), Long.toString(bvoc.c(context))));
        b.aj(preference2);
        Preference preference3 = new Preference(this.ad);
        preference3.s(this.ad.getString(R.string.TERMS_AND_PRIVACY));
        preference3.o = new bstk(this);
        b.aj(preference3);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void s() {
        super.s();
        bc(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_SETTING_ABOUT);
    }
}
