package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: albr  reason: default package */
/* loaded from: classes.dex */
final class albr extends BroadcastReceiver {
    final /* synthetic */ albs a;

    public albr(albs albsVar) {
        this.a = albsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c();
    }
}
