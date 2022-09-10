package com.google.android.apps.gmm.backup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GmmBackupBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getPackageName();
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            dyx.b(context.getSharedPreferences(bvjj.a, 0));
        }
    }
}
