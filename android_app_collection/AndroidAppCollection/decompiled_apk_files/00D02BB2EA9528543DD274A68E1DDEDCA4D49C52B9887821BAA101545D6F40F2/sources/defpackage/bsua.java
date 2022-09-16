package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bsua  reason: default package */
/* loaded from: classes4.dex */
public final class bsua extends bszv {
    public Context ad;
    public bttf ae;
    public cjqy af;
    public btvo ag;
    public dxio<ache> ah;
    public dxio<cjxl> ai;
    public dxio<afha> aj;

    private static gfk aS(String str) {
        return gfk.aT(str, bvuj.a);
    }

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(R.string.TERMS_AND_PRIVACY);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.ava
    public final boolean g(Preference preference) {
        if (this.aX) {
            String str = preference.q;
            if ("terms".equals(str)) {
                this.af.i(cjtd.a(dtyb.dd));
                bb().C(aS(cjxr.a(bycr.b(this.ae))), gfu.ACTIVITY_FRAGMENT, new gfs[0]);
                return true;
            } else if ("krterm".equals(str)) {
                bb().C(aS(cjxr.l()), gfu.ACTIVITY_FRAGMENT, new gfs[0]);
                return true;
            } else if ("privacy".equals(str)) {
                this.af.i(cjtd.a(dtyb.cZ));
                this.ai.a().a(bb());
                return true;
            } else if ("notices".equals(str)) {
                this.af.i(cjtd.a(dtyb.cS));
                bb().C(aS(cjxr.h(this.ag)), gfu.ACTIVITY_FRAGMENT, new gfs[0]);
                return true;
            } else if ("open_source".equals(str)) {
                this.af.i(cjtd.a(dtyb.cW));
                this.aj.a().i(this, new Intent(J(), LicenseMenuActivity.class), 2);
                return true;
            } else if ("web_history".equals(str)) {
                this.af.i(cjtd.a(dtyb.dj));
                this.aj.a().k(J(), cjxr.b(Locale.getDefault()), 1);
                return true;
            } else if ("suggested_destinations".equals(str)) {
                this.ah.a().q("suggested_places");
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        PreferenceScreen b = this.b.b(J());
        e(b);
        Preference preference = new Preference(this.ad);
        preference.C("terms");
        preference.s(this.ad.getString(R.string.TERMS_OF_SERVICE));
        b.aj(preference);
        if (bycr.a(this.ae)) {
            Preference preference2 = new Preference(this.ad);
            preference2.C("krterm");
            preference2.s(this.ad.getString(R.string.KOREAN_LOCATION_TERMS_OF_SERVICE));
            b.aj(preference2);
        }
        Preference preference3 = new Preference(this.ad);
        preference3.C("privacy");
        preference3.s(this.ad.getString(R.string.PRIVACY_POLICY));
        b.aj(preference3);
        Preference preference4 = new Preference(this.ad);
        preference4.C("notices");
        preference4.s(this.ad.getString(R.string.LEGAL_NOTICES));
        b.aj(preference4);
        Preference preference5 = new Preference(this.ad);
        preference5.C("open_source");
        preference5.s(this.ad.getString(R.string.OPEN_SOURCE_LICENSES));
        b.aj(preference5);
        Preference preference6 = new Preference(this.ad);
        preference6.C("web_history");
        preference6.s(this.ad.getString(R.string.WEB_HISTORY));
        b.aj(preference6);
        Preference preference7 = new Preference(this.ad);
        preference7.C("suggested_destinations");
        preference7.s(this.ad.getString(R.string.HOW_MAPS_SUGGESTS_DESTINATIONS));
        b.aj(preference7);
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void s() {
        super.s();
        bc(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_SETTING_TERMS_AND_PRIVACY);
    }
}
