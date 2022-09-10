package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        bbz.f("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        bbz.e().a(new Throwable[0]);
        try {
            bdn.g(context).a(new bca(DiagnosticsWorker.class).f());
        } catch (IllegalStateException e) {
            bbz.e().b(e);
        }
    }
}
