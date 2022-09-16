package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: asw  reason: default package */
/* loaded from: classes2.dex */
final class asw extends BroadcastReceiver {
    final /* synthetic */ asz a;

    public asw(asz aszVar) {
        this.a = aszVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a();
    }
}
