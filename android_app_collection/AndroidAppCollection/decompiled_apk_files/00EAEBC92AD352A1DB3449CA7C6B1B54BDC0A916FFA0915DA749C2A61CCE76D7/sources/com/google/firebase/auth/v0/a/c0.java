package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 extends n2<com.google.firebase.auth.i, com.google.firebase.auth.internal.c> {
    private final com.google.firebase.auth.m0 x;

    public c0(com.google.firebase.auth.m0 m0Var) {
        super(2);
        com.google.android.gms.common.internal.s.a(m0Var, "credential cannot be null");
        this.x = m0Var;
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        com.google.firebase.auth.internal.k0 a2 = i.a(this.f8487c, this.k);
        ((com.google.firebase.auth.internal.c) this.f8489e).a(this.j, a2);
        b((c0) new com.google.firebase.auth.internal.e0(a2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z1 z1Var, c.e.a.b.g.i iVar) {
        this.f8491g = new w2(this, iVar);
        boolean z = this.t;
        f2 f2 = z1Var.f();
        if (z) {
            f2.a(this.f8488d.z(), this.x, this.f8486b);
        } else {
            f2.a(new c.e.a.b.d.e.h1(this.f8488d.z(), this.x), this.f8486b);
        }
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "linkPhoneAuthCredential";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, com.google.firebase.auth.i> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.b0

            /* renamed from: a  reason: collision with root package name */
            private final c0 f8454a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8454a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8454a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
