package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: cnis  reason: default package */
/* loaded from: classes5.dex */
public final class cnis extends cncb {
    public final cnac g;
    private final cnir h;
    private cniq i;
    private cmxn j;

    public cnis(cnir cnirVar, final Looper looper, cnac cnacVar) {
        super(looper);
        this.h = cnirVar;
        this.g = cnacVar;
        this.f = new cnix(new dbsz(this, looper) { // from class: cnio
            private final cnis a;
            private final Looper b;

            {
                this.a = this;
                this.b = looper;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                cnis cnisVar = this.a;
                Looper looper2 = this.b;
                RemoteException remoteException = (RemoteException) obj;
                if (cmwk.a("CAR.CLIENT", 4)) {
                    int i = cnjc.a;
                }
                cnisVar.n();
                cmyz.b(looper2, new Runnable() { // from class: cnip
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        });
    }

    private final synchronized void t() {
        cmxn cmxnVar;
        if (this.i == null || (cmxnVar = this.j) == null) {
            return;
        }
        try {
            cmxnVar.asBinder().unlinkToDeath(this.i, 0);
        } catch (NoSuchElementException unused) {
        }
        this.i = null;
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cncb
    public final cmxn h() {
        cmxn cmxnVar = (cmxn) ((cnui) this.h).L();
        dbsk.s(cmxnVar);
        return cmxnVar;
    }

    @Override // defpackage.cncb
    public final void n() {
        super.n();
        t();
    }

    public final synchronized void s(cmxn cmxnVar) {
        if (this.i == null) {
            this.i = new cniq(this);
            try {
                this.j = cmxnVar;
                cmxnVar.asBinder().linkToDeath(this.i, 0);
            } catch (RemoteException unused) {
                int i = cnjc.a;
                this.i = null;
                this.j = null;
            }
        }
    }
}
