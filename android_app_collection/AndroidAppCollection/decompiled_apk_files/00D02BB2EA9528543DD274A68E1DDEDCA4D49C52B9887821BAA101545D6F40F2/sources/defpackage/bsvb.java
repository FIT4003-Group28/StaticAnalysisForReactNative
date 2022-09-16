package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsvb  reason: default package */
/* loaded from: classes4.dex */
public final class bsvb extends bszv {
    public cjqy ad;
    public dxio<afha> ae;

    @Override // defpackage.bszv
    protected final String aQ() {
        return J().getString(R.string.TUTORIALS_AND_HELP);
    }

    @Override // defpackage.bszv, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        ag.setContentDescription(Rp(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_TUTORIALS));
        return ag;
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.ava
    public final boolean g(Preference preference) {
        String str;
        if (this.aX) {
            String str2 = preference.q;
            if ("how_to_get_started".equals(str2)) {
                this.ad.i(cjtd.a(dtyb.dg));
                str = "https://support.google.com/gmm/?p=maps_android_getstarted";
            } else if ("how_to_search_and_manage_contacts".equals(str2)) {
                this.ad.i(cjtd.a(dtyb.dh));
                str = "https://support.google.com/gmm/?p=maps_android_contacts";
            } else if ("gestures".equals(str2)) {
                this.ad.i(cjtd.a(dtyb.de));
                str = "https://support.google.com/gmm/?p=maps_android_gestures";
            } else if ("tips_and_tricks".equals(str2)) {
                this.ad.i(cjtd.a(dtyb.di));
                str = "https://support.google.com/gmm/?p=maps_android_tips_tricks";
            } else {
                this.ad.i(cjtd.a(dtyb.df));
                str = "https://support.google.com/gmm/?p=maps_android";
            }
            this.ae.a().k(J(), cjxr.w(str), 1);
            return true;
        }
        return false;
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        f(R.xml.settings_tutorials_prefs);
    }
}
