package defpackage;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
/* renamed from: bsun  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsun implements aub {
    static final aub a = new bsun();

    private bsun() {
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        ((TwoStatePreference) preference).m(Boolean.TRUE.equals(obj));
        return true;
    }
}
