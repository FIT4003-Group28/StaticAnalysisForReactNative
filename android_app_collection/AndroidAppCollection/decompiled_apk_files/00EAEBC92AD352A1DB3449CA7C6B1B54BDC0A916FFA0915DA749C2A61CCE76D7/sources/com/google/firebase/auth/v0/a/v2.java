package com.google.firebase.auth.v0.a;
/* loaded from: classes.dex */
final class v2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ u2 f8511b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p2 f8512c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v2(p2 p2Var, u2 u2Var) {
        this.f8512c = p2Var;
        this.f8511b = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8512c.f8497a.f8492h) {
            if (!this.f8512c.f8497a.f8492h.isEmpty()) {
                this.f8511b.a(this.f8512c.f8497a.f8492h.get(0), new Object[0]);
            }
        }
    }
}
