package defpackage;

import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
/* compiled from: PG */
/* renamed from: bstz  reason: default package */
/* loaded from: classes4.dex */
public final class bstz extends bszv {
    public dxio<afok> ad;
    private final aub ae = new bsty(this);

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(cpi.LABS);
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        PreferenceGroup preferenceGroup;
        avb avbVar = this.b;
        PreferenceScreen preferenceScreen = avbVar.d;
        if (preferenceScreen == null) {
            preferenceScreen = avbVar.b(J());
            e(preferenceScreen);
        }
        for (afom afomVar : this.ad.a().a.values()) {
            Preference a = afomVar.a();
            if (a != null && (preferenceGroup = a.B) != preferenceScreen) {
                if (preferenceGroup != null) {
                    preferenceGroup.ak(a);
                }
                preferenceScreen.aj(a);
                a.J(this.ae);
            }
        }
    }

    @Override // defpackage.bszv, defpackage.aup, defpackage.fd
    public final void s() {
        super.s();
        bc(bsud.ACCESSIBILITY_FRAGMENT_TRANSITION_SETTING_LABS);
    }
}
