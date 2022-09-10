package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: dyu  reason: default package */
/* loaded from: classes6.dex */
final class dyu implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ Context a;
    final /* synthetic */ ckcw b;

    public dyu(Context context, ckcw ckcwVar) {
        this.a = context;
        this.b = ckcwVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.endsWith("@OLD_PREFERENCE_VALUE")) {
            str = str.substring(0, str.length() - 21);
        }
        bvjk bvjkVar = dyx.a().get(bvjj.d(str));
        if (bvjkVar == null || !bvjkVar.kA.a()) {
            return;
        }
        new BackupManager(this.a).dataChanged();
        ((ckcn) this.b.a(ckdo.a)).a();
    }
}
