package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: avbo  reason: default package */
/* loaded from: classes2.dex */
public final class avbo extends BroadcastReceiver {
    public final btpc a;
    public final awfh b;
    @dzsi
    public crzv<avkc> c;

    public avbo(btpc btpcVar, awfh awfhVar) {
        this.a = btpcVar;
        this.b = awfhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        crzv<avkc> crzvVar = this.c;
        dbsk.s(crzvVar);
        crzvVar.b();
    }
}
