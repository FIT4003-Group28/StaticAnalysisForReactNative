package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: atbl  reason: default package */
/* loaded from: classes2.dex */
final class atbl extends BroadcastReceiver {
    final /* synthetic */ atbq a;

    public atbl(atbq atbqVar) {
        this.a = atbqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        this.a.ax.K(atbq.br(context));
    }
}
