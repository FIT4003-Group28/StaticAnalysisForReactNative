package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: albp  reason: default package */
/* loaded from: classes.dex */
final class albp extends BroadcastReceiver {
    final /* synthetic */ albq a;

    public albp(albq albqVar) {
        this.a = albqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c();
    }
}
