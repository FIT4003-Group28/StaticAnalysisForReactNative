package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zci  reason: default package */
/* loaded from: classes4.dex */
public abstract class zci extends bjr {
    public Map aE;
    public yzj aF;

    private final void aI(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || preferenceGroup.k() <= 0) {
            return;
        }
        int k = preferenceGroup.k();
        while (true) {
            k--;
            if (k < 0) {
                return;
            }
            Preference o = preferenceGroup.o(k);
            if (o instanceof PreferenceGroup) {
                aI((PreferenceGroup) o);
            } else if (o instanceof zcj) {
                zcj zcjVar = (zcj) o;
                zcjVar.ag(this);
                zcjVar.af(this.aF);
                zcjVar.ah(this.aE);
            }
        }
    }

    @Override // defpackage.bjr
    public final void aE(PreferenceScreen preferenceScreen) {
        aI(preferenceScreen);
        super.aE(preferenceScreen);
    }
}
