package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: fia  reason: default package */
/* loaded from: classes3.dex */
final class fia extends BroadcastReceiver {
    final /* synthetic */ fib a;
    private final fib b;

    public fia(fib fibVar, fib fibVar2) {
        this.a = fibVar;
        this.b = fibVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            this.a.l = true;
            fib fibVar = this.b;
            if (fibVar != null && fibVar.getParent() != null) {
                this.b.getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.a.c(this.b);
        }
    }
}
