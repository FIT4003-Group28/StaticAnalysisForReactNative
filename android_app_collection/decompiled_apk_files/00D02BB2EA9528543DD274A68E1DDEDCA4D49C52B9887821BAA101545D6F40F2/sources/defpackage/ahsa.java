package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahsa  reason: default package */
/* loaded from: classes2.dex */
final class ahsa extends BroadcastReceiver {
    final /* synthetic */ ahsb a;

    public ahsa(ahsb ahsbVar) {
        this.a = ahsbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            synchronized (this.a) {
                this.a.d();
            }
        }
    }
}
