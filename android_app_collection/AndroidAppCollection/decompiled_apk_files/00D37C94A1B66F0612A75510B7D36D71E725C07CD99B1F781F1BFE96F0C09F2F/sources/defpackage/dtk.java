package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: dtk  reason: default package */
/* loaded from: classes3.dex */
public final class dtk extends BroadcastReceiver {
    public boolean a = true;

    public dtk(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.a = true;
        } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
        } else {
            this.a = false;
        }
    }
}
