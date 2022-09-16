package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: albn  reason: default package */
/* loaded from: classes.dex */
final class albn implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ albo a;

    public albn(albo alboVar) {
        this.a = alboVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (ymf.UPLOAD_NETWORK_POLICY.equals(str)) {
            this.a.c();
        }
    }
}
