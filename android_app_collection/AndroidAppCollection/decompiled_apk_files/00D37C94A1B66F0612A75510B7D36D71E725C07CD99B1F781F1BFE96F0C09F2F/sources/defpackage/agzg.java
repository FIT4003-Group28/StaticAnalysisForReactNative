package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: agzg  reason: default package */
/* loaded from: classes.dex */
final class agzg implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ agzh a;

    public agzg(agzh agzhVar) {
        this.a = agzhVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(agks.WIFI_POLICY_STRING) || str.equals(agks.DOWNLOAD_NETWORK_PREFERENCE)) {
            this.a.b();
        }
    }
}
