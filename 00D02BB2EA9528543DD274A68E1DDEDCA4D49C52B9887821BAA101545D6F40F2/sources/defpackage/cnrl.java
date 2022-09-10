package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: cnrl  reason: default package */
/* loaded from: classes.dex */
final class cnrl implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ cnrm b;

    public cnrl(cnrm cnrmVar, ConnectionResult connectionResult) {
        this.b = cnrmVar;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cnrm cnrmVar = this.b;
        cnrj<?> cnrjVar = cnrmVar.e.k.get(cnrmVar.b);
        if (cnrjVar == null) {
            return;
        }
        if (this.a.c()) {
            cnrm cnrmVar2 = this.b;
            cnrmVar2.d = true;
            if (cnrmVar2.a.j()) {
                this.b.c();
                return;
            }
            try {
                cnnz cnnzVar = this.b.a;
                cnnzVar.A(null, cnnzVar.v());
                return;
            } catch (SecurityException unused) {
                this.b.a.h("Failed to get service from broker.");
                cnrjVar.Pi(new ConnectionResult(10));
                return;
            }
        }
        cnrjVar.Pi(this.a);
    }
}
