package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y extends n2<com.google.firebase.auth.i, com.google.firebase.auth.internal.c> {
    private final com.google.firebase.auth.j x;

    public y(com.google.firebase.auth.j jVar) {
        super(2);
        com.google.android.gms.common.internal.s.a(jVar, "credential cannot be null");
        this.x = jVar;
        com.google.android.gms.common.internal.s.a(jVar.j(), (Object) "email cannot be null");
        com.google.android.gms.common.internal.s.a(jVar.s(), (Object) "password cannot be null");
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        com.google.firebase.auth.internal.k0 a2 = i.a(this.f8487c, this.k);
        ((com.google.firebase.auth.internal.c) this.f8489e).a(this.j, a2);
        b((y) new com.google.firebase.auth.internal.e0(a2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z1 z1Var, c.e.a.b.g.i iVar) {
        this.f8491g = new w2(this, iVar);
        boolean z = this.t;
        f2 f2 = z1Var.f();
        if (z) {
            f2.a(this.x.j(), this.x.s(), this.f8488d.z(), this.f8486b);
        } else {
            f2.a(new c.e.a.b.d.e.d1(this.x.j(), this.x.s(), this.f8488d.z()), this.f8486b);
        }
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, com.google.firebase.auth.i> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.x

            /* renamed from: a  reason: collision with root package name */
            private final y f8515a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8515a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8515a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
