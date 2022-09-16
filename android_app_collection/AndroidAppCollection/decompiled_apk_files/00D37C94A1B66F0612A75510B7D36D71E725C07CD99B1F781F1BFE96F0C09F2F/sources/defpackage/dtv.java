package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: dtv  reason: default package */
/* loaded from: classes3.dex */
final class dtv extends BroadcastReceiver {
    final /* synthetic */ dtw a;

    public dtv(dtw dtwVar) {
        this.a = dtwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c();
    }
}
