package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u extends n2<com.google.firebase.auth.q0, com.google.firebase.auth.internal.c> {
    private final c.e.a.b.d.e.b1 x;

    public u(String str, String str2) {
        super(3);
        com.google.android.gms.common.internal.s.a(str, (Object) "email cannot be null or empty");
        this.x = new c.e.a.b.d.e.b1(str, str2);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        b((u) new com.google.firebase.auth.internal.u0(this.l.j()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z1 z1Var, c.e.a.b.g.i iVar) {
        this.f8491g = new w2(this, iVar);
        boolean z = this.t;
        f2 f2 = z1Var.f();
        if (z) {
            f2.a(this.x.f(), this.f8486b);
        } else {
            f2.a(this.x, this.f8486b);
        }
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, com.google.firebase.auth.q0> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.t

            /* renamed from: a  reason: collision with root package name */
            private final u f8504a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8504a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8504a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
