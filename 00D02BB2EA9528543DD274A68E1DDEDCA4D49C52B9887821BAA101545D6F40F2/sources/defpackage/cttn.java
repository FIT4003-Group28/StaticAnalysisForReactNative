package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cttn  reason: default package */
/* loaded from: classes5.dex */
final class cttn extends BroadcastReceiver {
    final /* synthetic */ ctto a;

    public cttn(ctto cttoVar) {
        this.a = cttoVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (csvw.a(context)) {
            dyeu dyeuVar = this.a.c;
            if (!(dyeuVar instanceof dyhi)) {
                return;
            }
            ((dyhi) dyeuVar).d();
        }
    }
}
