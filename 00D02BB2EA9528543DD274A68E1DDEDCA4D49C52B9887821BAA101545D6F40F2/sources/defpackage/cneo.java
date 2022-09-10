package defpackage;

import android.os.Looper;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cneo  reason: default package */
/* loaded from: classes.dex */
public final class cneo extends cncb {
    private cmxn g;

    public cneo(Looper looper, final Runnable runnable) {
        super(looper);
        this.f = new cnix(new dbsz(this, runnable) { // from class: cnen
            private final cneo a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                cneo cneoVar = this.a;
                Runnable runnable2 = this.b;
                RemoteException remoteException = (RemoteException) obj;
                if (cmwk.a("CAR.CLIENT", 3)) {
                    int i = cnjc.a;
                }
                cneoVar.n();
                runnable2.run();
            }
        });
    }

    @Override // defpackage.cncb
    public final synchronized cmxn h() {
        cmxn cmxnVar;
        cmxnVar = this.g;
        if (cmxnVar == null) {
            throw new IllegalStateException("WrapperCarClient not connected.");
        }
        return cmxnVar;
    }

    @Override // defpackage.cncb
    public final synchronized void n() {
        super.n();
        this.g = null;
    }

    public final boolean s() {
        return this.g != null;
    }

    public final synchronized void t(cmxn cmxnVar) {
        this.g = cmxnVar;
        if (cmxnVar != null) {
            i();
        }
    }
}
