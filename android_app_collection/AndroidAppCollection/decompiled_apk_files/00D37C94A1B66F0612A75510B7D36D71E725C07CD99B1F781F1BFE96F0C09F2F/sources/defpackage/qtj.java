package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qtj  reason: default package */
/* loaded from: classes4.dex */
public abstract class qtj extends qti {
    protected final rvh a;

    public qtj(int i, rvh rvhVar) {
        super(i);
        this.a = rvhVar;
    }

    protected abstract void c(qum qumVar);

    @Override // defpackage.qto
    public final void d(Status status) {
        this.a.c(new qsp(status));
    }

    @Override // defpackage.qto
    public final void e(Exception exc) {
        this.a.c(exc);
    }

    @Override // defpackage.qto
    public final void f(qum qumVar) {
        try {
            c(qumVar);
        } catch (DeadObjectException e) {
            d(qto.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(qto.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.qto
    public void g(que queVar, boolean z) {
    }
}
