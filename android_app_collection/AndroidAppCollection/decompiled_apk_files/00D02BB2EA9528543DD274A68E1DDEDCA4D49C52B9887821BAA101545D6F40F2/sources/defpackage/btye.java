package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: btye  reason: default package */
/* loaded from: classes4.dex */
final class btye extends BroadcastReceiver {
    final /* synthetic */ btyf a;

    public btye(btyf btyfVar) {
        this.a = btyfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.d();
    }
}
