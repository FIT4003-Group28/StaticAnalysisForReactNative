package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: crkj  reason: default package */
/* loaded from: classes5.dex */
final class crkj extends BroadcastReceiver {
    final /* synthetic */ crkm a;

    public crkj(crkm crkmVar) {
        this.a = crkmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dcqe dcqeVar = crkm.a;
        if (this.a.i.a().j()) {
            this.a.J.b(new Runnable(this) { // from class: crki
                private final crkj a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    crkj crkjVar = this.a;
                    crkm crkmVar = crkjVar.a;
                    crkmVar.C = crkm.d(crkmVar.n, crkmVar.h);
                    crkm crkmVar2 = crkjVar.a;
                    if (crkmVar2.r == null || crkmVar2.F == null) {
                        return;
                    }
                    crkmVar2.o();
                }
            }, bvrj.NAVIGATION_INTERNAL);
        }
    }
}
