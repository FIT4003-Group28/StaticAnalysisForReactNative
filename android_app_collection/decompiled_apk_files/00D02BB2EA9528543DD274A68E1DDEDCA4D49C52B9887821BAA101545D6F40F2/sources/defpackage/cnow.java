package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cnow  reason: default package */
/* loaded from: classes.dex */
public final class cnow<ResultT> extends cnos {
    private final cntd<cnnq, ResultT> a;
    private final cpct<ResultT> b;
    private final cnsw d;

    public cnow(int i, cntd<cnnq, ResultT> cntdVar, cpct<ResultT> cpctVar, cnsw cnswVar) {
        super(i);
        this.b = cpctVar;
        this.a = cntdVar;
        this.d = cnswVar;
        if (i != 2 || !cntdVar.c) {
            return;
        }
        throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    }

    @Override // defpackage.cnos
    public final Feature[] a(cnrj<?> cnrjVar) {
        return this.a.b;
    }

    @Override // defpackage.cnos
    public final boolean b(cnrj<?> cnrjVar) {
        return this.a.c;
    }

    @Override // defpackage.cnoy
    public final void c(Status status) {
        this.b.d(this.d.a(status));
    }

    @Override // defpackage.cnoy
    public final void d(Exception exc) {
        this.b.d(exc);
    }

    @Override // defpackage.cnoy
    public final void e(cnpy cnpyVar, boolean z) {
        cpct<ResultT> cpctVar = this.b;
        cnpyVar.b.put(cpctVar, Boolean.valueOf(z));
        cpctVar.a.m(new cnpx(cnpyVar, cpctVar));
    }

    @Override // defpackage.cnoy
    public final void f(cnrj<?> cnrjVar) {
        try {
            this.a.a(cnrjVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(cnoy.h(e2));
        } catch (RuntimeException e3) {
            d(e3);
        }
    }
}
