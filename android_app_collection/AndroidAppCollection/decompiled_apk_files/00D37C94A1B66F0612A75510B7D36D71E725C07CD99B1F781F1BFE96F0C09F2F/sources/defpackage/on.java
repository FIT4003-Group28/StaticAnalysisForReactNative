package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: on  reason: default package */
/* loaded from: classes3.dex */
final class on extends BroadcastReceiver {
    final /* synthetic */ oo a;

    public on(oo ooVar) {
        this.a = ooVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.b();
    }
}
