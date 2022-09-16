package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: abuw  reason: default package */
/* loaded from: classes.dex */
final class abuw extends BroadcastReceiver {
    final /* synthetic */ abux a;

    public abuw(abux abuxVar) {
        this.a = abuxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        abux abuxVar = this.a;
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            abuxVar.c.postDelayed(abuxVar.l, 5000L);
        } else if (!"android.intent.action.SCREEN_ON".equals(action)) {
        } else {
            abuxVar.c.removeCallbacks(abuxVar.l);
        }
    }
}
