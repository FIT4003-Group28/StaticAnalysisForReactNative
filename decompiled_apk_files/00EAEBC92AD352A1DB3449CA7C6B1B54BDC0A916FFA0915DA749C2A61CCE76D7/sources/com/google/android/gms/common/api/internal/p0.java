package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class p0<T> extends t {

    /* renamed from: a  reason: collision with root package name */
    protected final c.e.a.b.g.i<T> f6910a;

    public p0(int i, c.e.a.b.g.i<T> iVar) {
        super(i);
        this.f6910a = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void a(Status status) {
        this.f6910a.b(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void a(e.a<?> aVar) {
        Status a2;
        Status a3;
        try {
            d(aVar);
        } catch (DeadObjectException e2) {
            a3 = g0.a(e2);
            a(a3);
            throw e2;
        } catch (RemoteException e3) {
            a2 = g0.a(e3);
            a(a2);
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public void a(RuntimeException runtimeException) {
        this.f6910a.b(runtimeException);
    }

    protected abstract void d(e.a<?> aVar);
}
