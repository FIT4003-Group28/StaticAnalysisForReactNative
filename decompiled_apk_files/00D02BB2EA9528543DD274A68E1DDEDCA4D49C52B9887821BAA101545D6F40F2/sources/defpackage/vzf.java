package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: vzf  reason: default package */
/* loaded from: classes7.dex */
public final class vzf extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        in.a(context).c(vzg.b, dpyv.RESUME_NAVIGATION.dm);
        context.unregisterReceiver(this);
    }
}
