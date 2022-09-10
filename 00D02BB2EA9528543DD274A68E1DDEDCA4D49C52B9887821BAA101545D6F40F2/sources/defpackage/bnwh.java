package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: bnwh  reason: default package */
/* loaded from: classes.dex */
final class bnwh implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ bnwi a;

    public bnwh(bnwi bnwiVar) {
        this.a = bnwiVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (bvjk.aq.toString().equals(str)) {
            this.a.a(akqv.a(sharedPreferences.getString(str, "fake_my_location_disabled")));
        }
    }
}
