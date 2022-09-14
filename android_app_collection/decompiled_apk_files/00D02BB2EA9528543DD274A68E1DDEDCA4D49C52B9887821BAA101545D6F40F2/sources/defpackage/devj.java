package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: devj  reason: default package */
/* loaded from: classes6.dex */
final class devj extends BroadcastReceiver {
    final /* synthetic */ devk a;
    private devk b;

    public devj(devk devkVar, devk devkVar2) {
        this.a = devkVar;
        this.b = devkVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        devk devkVar = this.b;
        if (devkVar == null) {
            return;
        }
        if (!devkVar.a()) {
            return;
        }
        devk devkVar2 = this.b;
        devkVar2.b.c(devkVar2, 0L);
        context.unregisterReceiver(this);
        this.b = null;
    }
}
