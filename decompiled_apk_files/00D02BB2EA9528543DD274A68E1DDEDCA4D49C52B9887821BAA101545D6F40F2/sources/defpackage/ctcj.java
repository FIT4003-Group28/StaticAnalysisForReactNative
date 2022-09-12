package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctcj  reason: default package */
/* loaded from: classes5.dex */
public final class ctcj extends BroadcastReceiver {
    final /* synthetic */ ctct a;

    public ctcj(ctct ctctVar) {
        this.a = ctctVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean a = csvw.a(this.a.a);
        if (a) {
            this.a.I();
        }
        ctdt ctdtVar = this.a.l;
        int i = true != a ? 3 : 2;
        if (ctdtVar.d == i) {
            return;
        }
        ctdtVar.d = i;
        ctdtVar.a();
    }
}
