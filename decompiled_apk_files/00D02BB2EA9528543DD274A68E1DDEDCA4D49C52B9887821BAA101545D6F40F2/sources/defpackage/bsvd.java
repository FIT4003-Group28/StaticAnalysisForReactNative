package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.gmm.settings.preference.TimePreference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsvd  reason: default package */
/* loaded from: classes4.dex */
public final class bsvd extends bszv {
    private static final dcqe ah = dcqe.c("bsvd");
    private static final dcdc<String> ai = dcdc.i(bvjk.hA.toString(), bvjk.hz.toString(), bvjk.hx.toString(), bvjk.hy.toString());
    public Context ad;
    public auhi ae;
    public btlc af;
    public auf ag;

    @Override // defpackage.bszv
    protected final String aQ() {
        return Rp(R.string.UGC_TASKS_NEARBY_NEED_SETTINGS_TITLE);
    }

    public final void aS() {
        if (!this.aX) {
            return;
        }
        boolean z = this.ae.t(dpyv.UGC_TASKS_NEARBY_NEED.dm) == aufs.ENABLED;
        dcdc<String> dcdcVar = ai;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            String str = dcdcVar.get(i);
            Preference Ri = Ri(str);
            if (Ri == null) {
                bvoo.h("Preference %s not found: ", str);
            } else {
                Ri.y(z);
            }
        }
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        avb avbVar = this.b;
        avbVar.b = this.ag;
        PreferenceScreen b = avbVar.b(this.ad);
        e(b);
        aujb h = this.ae.h(dpyv.UGC_TASKS_NEARBY_NEED.dm);
        dbsk.s(h);
        Preference a = this.af.a(this.ad, h);
        a.t(R.string.UGC_TASKS_NEARBY_NEED_NOTIFICATION_OPTIN_PREFERENCE_TITLE);
        a.k("");
        a.n = new aub(this) { // from class: bsvc
            private final bsvd a;

            {
                this.a = this;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, Object obj) {
                bsvd bsvdVar = this.a;
                bsvdVar.ae.d(dpyv.UGC_TASKS_NEARBY_NEED.dm, ((Boolean) obj).booleanValue() ? aufs.ENABLED : aufs.DISABLED);
                bsvdVar.aS();
                return true;
            }
        };
        b.aj(a);
        b.aj(bvjo.b(this.ad, bvjk.hx, H().getString(R.string.UGC_TASKS_NEARBY_NEED_NOTIFICATION_RINGTONE_TOGGLE_PREFERENCE_TITLE)));
        b.aj(bvjo.b(this.ad, bvjk.hy, H().getString(R.string.UGC_TASKS_NEARBY_NEED_NOTIFICATION_VIBRATION_TOGGLE_PREFERENCE_TITLE)));
        PreferenceCategory preferenceCategory = new PreferenceCategory(this.ad);
        preferenceCategory.t(R.string.UGC_TASKS_NEARBY_NEED_NOTIFICATION_ACTIVE_HOURS_PREFERENCE_CATEGORY_TITLE);
        b.aj(preferenceCategory);
        TimePreference timePreference = new TimePreference(this.ad, bvjk.hz, btld.c(8, 0));
        timePreference.t(R.string.UGC_TASKS_NEARBY_NEED_NOTIFICATION_ACTIVE_HOURS_START_PREFERENCE_TITLE);
        preferenceCategory.aj(timePreference);
        TimePreference timePreference2 = new TimePreference(this.ad, bvjk.hA, btld.c(20, 0));
        timePreference2.t(R.string.UGC_TASKS_NEARBY_NEED_NOTIFICATION_ACTIVE_HOURS_END_PREFERENCE_TITLE);
        preferenceCategory.aj(timePreference2);
        aS();
    }

    @Override // defpackage.bszv
    public final void w() {
        ((bsve) btsx.b(bsve.class, this)).dh(this);
    }
}
