package com.google.android.apps.gmm.locationsharing.reporting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RestartDetectionBroadcastReceiver extends BroadcastReceiver {
    public ajku a;
    public Executor b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            dxiq.c(this, context);
            this.a.a().Pk(new Runnable(goAsync) { // from class: ajnn
                private final BroadcastReceiver.PendingResult a;

                {
                    this.a = goAsync;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.finish();
                }
            }, this.b);
        }
    }
}
