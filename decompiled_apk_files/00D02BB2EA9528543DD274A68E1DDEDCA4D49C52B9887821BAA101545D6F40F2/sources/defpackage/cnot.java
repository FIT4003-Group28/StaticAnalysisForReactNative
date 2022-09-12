package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnot  reason: default package */
/* loaded from: classes.dex */
public abstract class cnot<T> extends cnos {
    protected final cpct<T> a;

    public cnot(int i, cpct<T> cpctVar) {
        super(i);
        this.a = cpctVar;
    }

    @Override // defpackage.cnoy
    public final void c(Status status) {
        this.a.d(new cnob(status));
    }

    @Override // defpackage.cnoy
    public final void d(Exception exc) {
        this.a.d(exc);
    }

    @Override // defpackage.cnoy
    public void e(cnpy cnpyVar, boolean z) {
    }

    @Override // defpackage.cnoy
    public final void f(cnrj<?> cnrjVar) {
        try {
            g(cnrjVar);
        } catch (DeadObjectException e) {
            c(cnoy.h(e));
            throw e;
        } catch (RemoteException e2) {
            c(cnoy.h(e2));
        } catch (RuntimeException e3) {
            d(e3);
        }
    }

    protected abstract void g(cnrj<?> cnrjVar);
}
