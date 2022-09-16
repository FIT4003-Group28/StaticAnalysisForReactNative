package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: bada  reason: default package */
/* loaded from: classes2.dex */
final class bada extends BroadcastReceiver {
    final /* synthetic */ Context a;
    final /* synthetic */ badb b;

    public bada(badb badbVar, Context context) {
        this.b = badbVar;
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.unregisterReceiver(this);
        badb badbVar = this.b;
        badc badcVar = badbVar.a;
        badcVar.b.getAuthToken(badcVar.e, badcVar.d, badcVar.c, true, (AccountManagerCallback<Bundle>) new badb(badbVar.b, badcVar), (Handler) null);
    }
}
