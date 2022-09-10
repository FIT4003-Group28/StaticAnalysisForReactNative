package defpackage;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cngu  reason: default package */
/* loaded from: classes5.dex */
public final class cngu implements Runnable {
    final /* synthetic */ cnht a;

    public cngu(cnht cnhtVar) {
        this.a = cnhtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            cmxz cmxzVar = this.a.J;
            if (cmxzVar != null) {
                cmxzVar.q();
            }
        } catch (RemoteException unused) {
        }
        cnht cnhtVar = this.a;
        if (cnhtVar.i != null) {
            cnhtVar.o(0);
        }
        try {
            cmxz cmxzVar2 = this.a.J;
            if (cmxzVar2 != null) {
                cmxzVar2.l();
            }
        } catch (RemoteException unused2) {
        }
        this.a.b = null;
    }
}
