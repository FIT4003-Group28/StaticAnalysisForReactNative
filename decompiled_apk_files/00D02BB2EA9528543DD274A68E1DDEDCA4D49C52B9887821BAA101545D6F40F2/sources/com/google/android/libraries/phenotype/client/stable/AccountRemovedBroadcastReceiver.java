package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    private static volatile dehq a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (!"android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            return;
        }
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        final dehq d = dehx.d(Executors.newSingleThreadScheduledExecutor(cxkl.a));
        d.execute(new Runnable(context, intent, goAsync, d) { // from class: cxkk
            private final Context a;
            private final Intent b;
            private final BroadcastReceiver.PendingResult c;
            private final dehq d;

            {
                this.a = context;
                this.b = intent;
                this.c = goAsync;
                this.d = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = this.a;
                Intent intent2 = this.b;
                BroadcastReceiver.PendingResult pendingResult = this.c;
                dehq dehqVar = this.d;
                try {
                    String stringExtra = intent2.getStringExtra("accountType");
                    if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra)) {
                        String string = intent2.getExtras().getString("authAccount");
                        SharedPreferences a2 = cxlk.a(context2);
                        SharedPreferences.Editor editor = null;
                        for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
                            if ((entry.getValue() instanceof String) && entry.getValue().equals(string)) {
                                if (editor == null) {
                                    editor = a2.edit();
                                }
                                editor.remove(entry.getKey());
                            }
                        }
                        if (editor != null) {
                            editor.commit();
                        }
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    pendingResult.finish();
                    dehqVar.shutdown();
                    throw th;
                }
                pendingResult.finish();
                dehqVar.shutdown();
            }
        });
    }
}
