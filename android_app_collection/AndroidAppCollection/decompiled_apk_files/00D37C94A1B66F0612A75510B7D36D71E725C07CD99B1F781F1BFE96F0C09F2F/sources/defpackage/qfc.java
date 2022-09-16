package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qfc  reason: default package */
/* loaded from: classes4.dex */
public final class qfc implements Runnable {
    final /* synthetic */ dnj a;
    final /* synthetic */ qfd b;
    private final /* synthetic */ int c;

    public qfc(qfd qfdVar, dnj dnjVar) {
        this.b = qfdVar;
        this.a = dnjVar;
    }

    public qfc(qfd qfdVar, dnj dnjVar, int i) {
        this.c = i;
        this.b = qfdVar;
        this.a = dnjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            try {
                this.b.a.g(ptx.i(this.a));
                return;
            } catch (RemoteException e) {
                qfl.h("#007 Could not call remote method.", e);
                return;
            }
        }
        try {
            this.b.a.g(ptx.i(this.a));
        } catch (RemoteException e2) {
            qfl.h("#007 Could not call remote method.", e2);
        }
    }
}
