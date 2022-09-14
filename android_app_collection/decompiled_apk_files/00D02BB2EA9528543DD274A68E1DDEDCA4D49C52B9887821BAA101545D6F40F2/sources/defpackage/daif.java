package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: daif  reason: default package */
/* loaded from: classes5.dex */
final class daif extends BroadcastReceiver {
    final /* synthetic */ daig a;

    public daif(daig daigVar) {
        this.a = daigVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
