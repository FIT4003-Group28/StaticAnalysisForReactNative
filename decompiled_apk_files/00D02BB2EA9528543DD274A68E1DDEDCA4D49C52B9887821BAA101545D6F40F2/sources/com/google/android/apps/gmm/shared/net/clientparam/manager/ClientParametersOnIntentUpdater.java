package com.google.android.apps.gmm.shared.net.clientparam.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ClientParametersOnIntentUpdater extends BroadcastReceiver {
    private static final long c = TimeUnit.MINUTES.toMillis(10);
    private static final dcqe d = dcqe.c("com.google.android.apps.gmm.shared.net.clientparam.manager.ClientParametersOnIntentUpdater");
    private static final dcdc<String> e = dcdc.f("android.intent.action.MY_PACKAGE_REPLACED");
    public Runnable a;
    public bvju b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getAction();
        if (!e.contains(intent.getAction())) {
            bvoo.h("%s called with unexpected intent: %s", getClass(), intent.getAction());
        }
        dxiq.c(this, context);
        SharedPreferences a = this.b.a("client_parameters_details");
        long j = a.getLong("LastTimeAppUpdated", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j < c) {
            return;
        }
        a.edit().putLong("LastTimeAppUpdated", currentTimeMillis).apply();
        this.a.run();
    }
}
