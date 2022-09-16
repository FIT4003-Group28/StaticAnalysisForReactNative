package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: alrv  reason: default package */
/* loaded from: classes.dex */
final class alrv extends BroadcastReceiver {
    final /* synthetic */ alrw a;

    public alrv(alrw alrwVar) {
        this.a = alrwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
