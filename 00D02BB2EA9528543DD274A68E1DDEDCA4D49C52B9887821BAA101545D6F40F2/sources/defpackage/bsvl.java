package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsvl  reason: default package */
/* loaded from: classes4.dex */
public final class bsvl extends bszv {
    public Context ad;
    public bvjj ae;
    public akfa af;
    public cjqy ag;

    @Override // defpackage.bszv
    protected final String aQ() {
        return this.ad.getString(R.string.ACCESSIBILITY_SETTINGS_TITLE);
    }

    @Override // defpackage.aup
    public final void p(Bundle bundle) {
        PreferenceScreen b = this.b.b(J());
        e(b);
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(this.ad);
        switchPreferenceCompat.t(R.string.SETTINGS_ITEM_WHEELCHAIR_ACCESSIBILITY_TITLE);
        switchPreferenceCompat.x(R.string.SETTINGS_ITEM_WHEELCHAIR_ACCESSIBILITY_DESCRIPTION);
        switchPreferenceCompat.u = Boolean.valueOf(this.ae.o(bvjk.hO, this.af.j(), false));
        switchPreferenceCompat.n = new aub(this) { // from class: bsvk
            private final bsvl a;

            {
                this.a = this;
            }

            @Override // defpackage.aub
            public final boolean a(Preference preference, Object obj) {
                bsvl bsvlVar = this.a;
                cjqp f = bsvlVar.bd().f();
                if (f != null) {
                    cjqy cjqyVar = bsvlVar.ag;
                    cjta b2 = cjtd.b();
                    b2.d = dtxj.d;
                    cjqyVar.n(f.d(b2.a()), new cjte(deaf.TAP), cjqg.a(((Boolean) obj).booleanValue(), cjtd.a(dtxj.d)));
                }
                bsvlVar.ae.T(bvjk.hO, bsvlVar.af.j(), ((Boolean) obj).booleanValue());
                return true;
            }
        };
        b.aj(switchPreferenceCompat);
    }
}
