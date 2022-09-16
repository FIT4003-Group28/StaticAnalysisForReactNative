package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = bqf.b("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        bqf.a().d(new Throwable[0]);
        try {
            brq.h(context).a(new bqg(DiagnosticsWorker.class).b());
        } catch (IllegalStateException e) {
            bqf.a();
            bqf.e(a, "WorkManager is not initialized", e);
        }
    }
}
