package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
/* loaded from: classes.dex */
class zzdn extends BroadcastReceiver {
    @VisibleForTesting
    private static final String zzaaw = "com.google.android.gms.tagmanager.zzdn";
    private final zzfm zzazr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdn(zzfm zzfmVar) {
        this.zzazr = zzfmVar;
    }

    public static void zzp(Context context) {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(zzaaw, true);
        context.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            if (!"com.google.analytics.RADIO_POWERED".equals(action) || intent.hasExtra(zzaaw)) {
                return;
            }
            this.zzazr.zzow();
            return;
        }
        Bundle extras = intent.getExtras();
        Boolean bool = Boolean.FALSE;
        if (extras != null) {
            bool = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
        }
        this.zzazr.zzp(!bool.booleanValue());
    }
}
