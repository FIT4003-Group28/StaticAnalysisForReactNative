package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: aigc  reason: default package */
/* loaded from: classes2.dex */
final class aigc extends BroadcastReceiver {
    final /* synthetic */ aigf a;

    public aigc(aigf aigfVar) {
        this.a = aigfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bvrj.UI_THREAD.c();
        final aigf aigfVar = this.a;
        aigfVar.a.execute(new Runnable(aigfVar) { // from class: aiga
            private final aigf a;

            {
                this.a = aigfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aigf aigfVar2 = this.a;
                synchronized (aigfVar2) {
                    for (aigd aigdVar : aigfVar2.b) {
                        aigdVar.a();
                    }
                }
            }
        });
    }
}
