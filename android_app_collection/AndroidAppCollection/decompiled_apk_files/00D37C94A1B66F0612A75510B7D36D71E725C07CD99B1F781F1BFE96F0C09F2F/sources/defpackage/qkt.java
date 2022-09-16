package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qkt  reason: default package */
/* loaded from: classes4.dex */
public final class qkt extends tgo {
    final /* synthetic */ qku a;

    public qkt(qku qkuVar) {
        this.a = qkuVar;
    }

    @Override // defpackage.tgo
    public final void a() {
        qku qkuVar = this.a;
        if (qkuVar.b != null) {
            try {
                qoh qohVar = qkuVar.d;
                if (qohVar != null) {
                    qohVar.i();
                }
                this.a.b.k();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.tgo
    public final void b(int i) {
        qlb qlbVar = this.a.b;
        if (qlbVar != null) {
            try {
                qlbVar.g(new ConnectionResult(i));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.tgo
    public final void c(int i) {
        qlb qlbVar = this.a.b;
        if (qlbVar != null) {
            try {
                qlbVar.h(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.tgo
    public final void d(int i) {
        qlb qlbVar = this.a.b;
        if (qlbVar != null) {
            try {
                qlbVar.g(new ConnectionResult(i));
            } catch (RemoteException unused) {
            }
        }
    }
}
