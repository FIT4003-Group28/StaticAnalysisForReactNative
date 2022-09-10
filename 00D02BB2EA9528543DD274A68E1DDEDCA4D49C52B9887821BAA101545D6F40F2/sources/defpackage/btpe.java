package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: btpe  reason: default package */
/* loaded from: classes.dex */
public final class btpe extends BroadcastReceiver {
    private static final dcqe a = dcqe.c("btpe");
    private final btpa b;

    public btpe(btpa btpaVar) {
        this.b = btpaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
            this.b.a(true);
        } else if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            this.b.a(false);
        } else {
            bvoo.h("PowerConnectionReceiver should be only registered to ACTION_POWER_CONNECTED and ACTION_POWER_DISCONNECTED!", new Object[0]);
        }
    }
}
