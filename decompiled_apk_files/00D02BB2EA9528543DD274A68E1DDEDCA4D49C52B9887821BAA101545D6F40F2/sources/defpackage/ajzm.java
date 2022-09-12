package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ajzm  reason: default package */
/* loaded from: classes2.dex */
public final class ajzm extends BroadcastReceiver {
    public dxio<ajzn> a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
            return;
        }
        dxiq.c(this, context);
        this.a.a().a();
    }
}
