package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: czkd  reason: default package */
/* loaded from: classes5.dex */
final class czkd extends BroadcastReceiver {
    private final Runnable a;

    public czkd(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.run();
    }
}
