package com.google.android.gms.common.api.internal;
/* loaded from: classes.dex */
final class k0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ c.e.a.b.e.b.l f6899b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i0 f6900c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(i0 i0Var, c.e.a.b.e.b.l lVar) {
        this.f6900c = i0Var;
        this.f6899b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6900c.b(this.f6899b);
    }
}
