package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
/* compiled from: PG */
/* renamed from: cnzd  reason: default package */
/* loaded from: classes5.dex */
public final class cnzd extends cnzg {
    private cnph<Status> a;
    private cnph<cnyk> b;
    private cnph<cnzc> c;
    private final cnyy d;

    protected cnzd() {
        this.d = null;
    }

    public static cnzd d(cnph<Status> cnphVar, cnyy cnyyVar) {
        return new cnzd(cnphVar, null, null, cnyyVar);
    }

    private final void f(Status status) {
        cnyt cnytVar;
        cnyy cnyyVar = this.d;
        if (cnyyVar == null || !status.d() || (cnytVar = cnyyVar.a) == null) {
            return;
        }
        synchronized (cnytVar.c) {
            cnytVar.a = null;
            cnytVar.b = null;
        }
    }

    @Override // defpackage.cnzh
    public final void b(Status status) {
        cnph<Status> cnphVar = this.a;
        if (cnphVar == null) {
            return;
        }
        cnphVar.c(status);
        this.a = null;
        f(status);
    }

    @Override // defpackage.cnzh
    public final void c(Status status, WriteBatchImpl writeBatchImpl) {
        cnph<cnzc> cnphVar = this.c;
        if (cnphVar == null) {
            return;
        }
        cnphVar.c(new cnzc(status, writeBatchImpl));
        this.c = null;
        f(status);
    }

    @Override // defpackage.cnzh
    public final void e(Status status, DataHolder dataHolder) {
        cnph<cnyk> cnphVar = this.b;
        if (cnphVar == null) {
            return;
        }
        cnphVar.c(new cnzb(dataHolder, status));
        this.b = null;
        f(status);
    }

    public cnzd(cnph cnphVar, cnph cnphVar2, cnph cnphVar3, cnyy cnyyVar) {
        this.a = cnphVar;
        this.b = cnphVar2;
        this.c = cnphVar3;
        this.d = cnyyVar;
    }
}
