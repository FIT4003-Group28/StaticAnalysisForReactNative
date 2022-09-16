package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
/* compiled from: PG */
/* renamed from: eff  reason: default package */
/* loaded from: classes3.dex */
public final class eff implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ Context a;

    public eff(Context context) {
        this.a = context;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (efi.a.a(str)) {
            YouTubeBackupAgent.e(this.a);
        }
    }
}
