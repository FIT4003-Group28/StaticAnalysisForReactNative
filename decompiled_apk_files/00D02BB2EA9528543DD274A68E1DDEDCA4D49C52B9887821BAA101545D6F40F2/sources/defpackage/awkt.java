package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: awkt  reason: default package */
/* loaded from: classes3.dex */
public final class awkt extends BroadcastReceiver {
    public bvjj a;
    public avij b;
    public dxio<akfa> c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        intent.toUri(0);
        String action = intent.getAction();
        if ((action.equals("android.intent.action.BOOT_COMPLETED") || action.equals("android.intent.action.MY_PACKAGE_REPLACED")) && this.a.o(bvjk.ep, this.c.a().j(), false)) {
            this.b.g();
        }
    }
}
