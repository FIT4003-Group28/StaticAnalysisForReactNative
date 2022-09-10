package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: arqx  reason: default package */
/* loaded from: classes2.dex */
final class arqx extends BroadcastReceiver {
    final /* synthetic */ arqy a;

    public arqx(arqy arqyVar) {
        this.a = arqyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.k();
    }
}
