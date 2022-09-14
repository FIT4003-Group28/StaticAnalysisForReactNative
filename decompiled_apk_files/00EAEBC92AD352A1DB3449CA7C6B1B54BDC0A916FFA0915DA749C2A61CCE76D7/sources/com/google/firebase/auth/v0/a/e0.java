package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e0 extends n2<com.google.firebase.auth.i, com.google.firebase.auth.internal.c> {
    private final com.google.firebase.auth.j x;

    public e0(com.google.firebase.auth.j jVar) {
        super(2);
        com.google.android.gms.common.internal.s.a(jVar, "credential cannot be null");
        this.x = jVar;
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        com.google.firebase.auth.internal.k0 a2 = i.a(this.f8487c, this.k);
        ((com.google.firebase.auth.internal.c) this.f8489e).a(this.j, a2);
        b((e0) new com.google.firebase.auth.internal.e0(a2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z1 z1Var, c.e.a.b.g.i iVar) {
        this.f8491g = new w2(this, iVar);
        com.google.firebase.auth.j jVar = this.x;
        jVar.a(this.f8488d);
        c.e.a.b.d.e.a2 a2Var = new c.e.a.b.d.e.a2(jVar);
        boolean z = this.t;
        f2 f2 = z1Var.f();
        if (z) {
            f2.a(a2Var.f(), this.f8486b);
        } else {
            f2.a(a2Var, this.f8486b);
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
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.d0

            /* renamed from: a  reason: collision with root package name */
            private final e0 f8460a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8460a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8460a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
