package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.e;
/* loaded from: classes.dex */
public final class q0<ResultT> extends t {

    /* renamed from: a  reason: collision with root package name */
    private final n<a.b, ResultT> f6911a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.b.g.i<ResultT> f6912b;

    /* renamed from: c  reason: collision with root package name */
    private final m f6913c;

    public q0(int i, n<a.b, ResultT> nVar, c.e.a.b.g.i<ResultT> iVar, m mVar) {
        super(i);
        this.f6912b = iVar;
        this.f6911a = nVar;
        this.f6913c = mVar;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void a(Status status) {
        this.f6912b.b(this.f6913c.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void a(e.a<?> aVar) {
        Status a2;
        try {
            this.f6911a.a(aVar.f(), this.f6912b);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a2 = g0.a(e3);
            a(a2);
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void a(z0 z0Var, boolean z) {
        z0Var.a(this.f6912b, z);
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void a(RuntimeException runtimeException) {
        this.f6912b.b(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final com.google.android.gms.common.d[] b(e.a<?> aVar) {
        return this.f6911a.b();
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final boolean c(e.a<?> aVar) {
        return this.f6911a.a();
    }
}
