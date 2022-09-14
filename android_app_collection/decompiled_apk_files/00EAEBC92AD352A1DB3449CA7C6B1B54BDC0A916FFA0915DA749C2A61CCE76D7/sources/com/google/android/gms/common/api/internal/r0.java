package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.e;
/* loaded from: classes.dex */
public final class r0 extends p0<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private final i<?> f6916b;

    public r0(i<?> iVar, c.e.a.b.g.i<Boolean> iVar2) {
        super(4, iVar2);
        this.f6916b = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final /* bridge */ /* synthetic */ void a(z0 z0Var, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final com.google.android.gms.common.d[] b(e.a<?> aVar) {
        f0 f0Var = aVar.i().get(this.f6916b);
        if (f0Var == null) {
            return null;
        }
        return f0Var.f6885a.b();
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final boolean c(e.a<?> aVar) {
        f0 f0Var = aVar.i().get(this.f6916b);
        return f0Var != null && f0Var.f6885a.c();
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void d(e.a<?> aVar) {
        f0 remove = aVar.i().remove(this.f6916b);
        if (remove == null) {
            this.f6910a.b((c.e.a.b.g.i<T>) false);
            return;
        }
        remove.f6886b.a(aVar.f(), this.f6910a);
        remove.f6885a.a();
    }
}
