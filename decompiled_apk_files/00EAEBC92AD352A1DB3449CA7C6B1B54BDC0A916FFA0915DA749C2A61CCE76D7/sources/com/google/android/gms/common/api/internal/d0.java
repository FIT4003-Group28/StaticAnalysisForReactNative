package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public class d0 extends t0 {

    /* renamed from: g  reason: collision with root package name */
    private c.e.a.b.g.i<Void> f6852g;

    private d0(h hVar) {
        super(hVar);
        this.f6852g = new c.e.a.b.g.i<>();
        this.f6828b.a("GmsAvailabilityHelper", this);
    }

    public static d0 b(Activity activity) {
        h a2 = LifecycleCallback.a(activity);
        d0 d0Var = (d0) a2.a("GmsAvailabilityHelper", d0.class);
        if (d0Var != null) {
            if (d0Var.f6852g.a().d()) {
                d0Var.f6852g = new c.e.a.b.g.i<>();
            }
            return d0Var;
        }
        return new d0(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.t0
    public final void a(com.google.android.gms.common.b bVar, int i) {
        this.f6852g.a(com.google.android.gms.common.internal.b.a(new Status(bVar.q(), bVar.r(), bVar.s())));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void b() {
        super.b();
        this.f6852g.b(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.t0
    protected final void f() {
        Activity e2 = this.f6828b.e();
        if (e2 == null) {
            this.f6852g.b(new com.google.android.gms.common.api.b(new Status(8)));
            return;
        }
        int b2 = this.f6925f.b(e2);
        if (b2 == 0) {
            this.f6852g.b((c.e.a.b.g.i<Void>) null);
        } else if (this.f6852g.a().d()) {
        } else {
            b(new com.google.android.gms.common.b(b2, null), 0);
        }
    }

    public final c.e.a.b.g.h<Void> h() {
        return this.f6852g.a();
    }
}
