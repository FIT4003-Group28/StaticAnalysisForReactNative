package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bey  reason: default package */
/* loaded from: classes3.dex */
final class bey extends BroadcastReceiver {
    final /* synthetic */ bez a;

    public bey(bez bezVar) {
        this.a = bezVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            this.a.c(intent);
        }
    }
}
