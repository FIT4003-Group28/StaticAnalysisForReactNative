package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g1 extends n2<com.google.firebase.auth.i, com.google.firebase.auth.internal.c> {
    public g1() {
        super(2);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        com.google.firebase.auth.internal.k0 a2 = i.a(this.f8487c, this.k);
        ((com.google.firebase.auth.internal.c) this.f8489e).a(this.j, a2);
        b((g1) new com.google.firebase.auth.internal.e0(a2));
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "unlinkEmailCredential";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, com.google.firebase.auth.i> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.f1

            /* renamed from: a  reason: collision with root package name */
            private final g1 f8463a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8463a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                g1 g1Var = this.f8463a;
                g1Var.f8491g = new w2(g1Var, (c.e.a.b.g.i) obj2);
                boolean z = g1Var.t;
                f2 f2 = ((z1) obj).f();
                if (z) {
                    f2.g(g1Var.f8488d.z(), g1Var.f8486b);
                } else {
                    f2.a(new c.e.a.b.d.e.f2(g1Var.f8488d.z()), g1Var.f8486b);
                }
            }
        });
        return c2.a();
    }
}
