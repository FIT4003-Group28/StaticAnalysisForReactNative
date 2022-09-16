package defpackage;

import android.app.backup.RestoreObserver;
import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: efh  reason: default package */
/* loaded from: classes3.dex */
public final class efh extends RestoreObserver {
    final /* synthetic */ SharedPreferences a;

    public efh(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // android.app.backup.RestoreObserver
    public final void onUpdate(int i, String str) {
    }

    @Override // android.app.backup.RestoreObserver
    public final void restoreFinished(int i) {
        if (i == 0) {
            this.a.edit().putBoolean("got_future_restore", false).apply();
            zep.g("Manual restore succeeded.");
            return;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Manual restore failed with error: ");
        sb.append(i);
        zep.l(sb.toString());
    }

    @Override // android.app.backup.RestoreObserver
    public final void restoreStarting(int i) {
    }
}
