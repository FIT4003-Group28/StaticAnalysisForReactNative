package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qcp  reason: default package */
/* loaded from: classes4.dex */
final class qcp implements Runnable {
    final /* synthetic */ qbl a;

    public qcp(qbl qblVar) {
        this.a = qblVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qaz qazVar = this.a.a;
        if (qazVar != null) {
            try {
                qazVar.a();
            } catch (RemoteException e) {
                qfl.f("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
