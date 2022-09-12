package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: crol  reason: default package */
/* loaded from: classes5.dex */
final class crol extends BroadcastReceiver {
    final /* synthetic */ croo a;

    public crol(croo crooVar) {
        this.a = crooVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
            int i = croo.c;
            this.a.c();
        }
    }
}
