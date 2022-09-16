package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: qtm  reason: default package */
/* loaded from: classes4.dex */
public final class qtm extends qti {
    private final qvy a;
    private final rvh b;
    private final qvs d;

    public qtm(int i, qvy qvyVar, rvh rvhVar, qvs qvsVar) {
        super(i);
        this.b = rvhVar;
        this.a = qvyVar;
        this.d = qvsVar;
        if (i != 2 || !qvyVar.c) {
            return;
        }
        throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    }

    @Override // defpackage.qti
    public final boolean a(qum qumVar) {
        return this.a.c;
    }

    @Override // defpackage.qti
    public final Feature[] b(qum qumVar) {
        return this.a.b;
    }

    @Override // defpackage.qto
    public final void d(Status status) {
        this.b.c(this.d.a(status));
    }

    @Override // defpackage.qto
    public final void e(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.qto
    public final void f(qum qumVar) {
        try {
            this.a.a(qumVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(qto.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.qto
    public final void g(que queVar, boolean z) {
        rvh rvhVar = this.b;
        queVar.b.put(rvhVar, Boolean.valueOf(z));
        rvhVar.a.q(new qud(queVar, rvhVar));
    }
}
