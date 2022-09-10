package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pun  reason: default package */
/* loaded from: classes7.dex */
public final class pun extends BroadcastReceiver {
    final /* synthetic */ puy a;

    public pun(puy puyVar) {
        this.a = puyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context != null) {
            this.a.bC();
        }
    }
}
