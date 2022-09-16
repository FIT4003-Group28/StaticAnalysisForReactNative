package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: albm  reason: default package */
/* loaded from: classes.dex */
final class albm extends BroadcastReceiver {
    final /* synthetic */ albo a;

    public albm(albo alboVar) {
        this.a = alboVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c();
    }
}
