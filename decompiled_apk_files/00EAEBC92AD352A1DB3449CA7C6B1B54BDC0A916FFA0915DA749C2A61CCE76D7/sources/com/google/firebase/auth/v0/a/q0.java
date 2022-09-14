package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q0 extends n2<Void, com.google.firebase.auth.internal.c> {
    private final c.e.a.b.d.e.l1 x;

    public q0(String str, com.google.firebase.auth.e eVar) {
        super(6);
        com.google.android.gms.common.internal.s.a(str, (Object) "token cannot be null or empty");
        this.x = new c.e.a.b.d.e.l1(str, eVar);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        b((q0) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z1 z1Var, c.e.a.b.g.i iVar) {
        this.f8491g = new w2(this, iVar);
        boolean z = this.t;
        f2 f2 = z1Var.f();
        if (z) {
            f2.b(this.x.f(), this.x.j(), this.f8486b);
        } else {
            f2.a(this.x, this.f8486b);
        }
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "sendEmailVerification";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, Void> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.p0

            /* renamed from: a  reason: collision with root package name */
            private final q0 f8495a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8495a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8495a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
