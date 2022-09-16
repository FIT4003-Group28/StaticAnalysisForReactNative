package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qco  reason: default package */
/* loaded from: classes4.dex */
final class qco implements Runnable {
    final /* synthetic */ qbe a;

    public qco(qbe qbeVar) {
        this.a = qbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qaz qazVar = this.a.a.a;
        if (qazVar != null) {
            try {
                qazVar.a();
            } catch (RemoteException e) {
                qfl.f("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
