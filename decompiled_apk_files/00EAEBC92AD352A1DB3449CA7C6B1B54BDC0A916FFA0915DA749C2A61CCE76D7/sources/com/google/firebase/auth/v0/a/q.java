package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends n2<com.google.firebase.auth.i, com.google.firebase.auth.internal.c> {
    final c.e.a.b.d.e.v0 x;

    public q(String str, String str2, String str3) {
        super(2);
        com.google.android.gms.common.internal.s.a(str, (Object) "email cannot be null or empty");
        com.google.android.gms.common.internal.s.a(str2, (Object) "password cannot be null or empty");
        this.x = new c.e.a.b.d.e.v0(str, str2, str3);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        com.google.firebase.auth.internal.k0 a2 = i.a(this.f8487c, this.k);
        ((com.google.firebase.auth.internal.c) this.f8489e).a(this.j, a2);
        b((q) new com.google.firebase.auth.internal.e0(a2));
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "createUserWithEmailAndPassword";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, com.google.firebase.auth.i> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.p

            /* renamed from: a  reason: collision with root package name */
            private final q f8494a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8494a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                q qVar = this.f8494a;
                qVar.f8491g = new w2(qVar, (c.e.a.b.g.i) obj2);
                boolean z = qVar.t;
                f2 f2 = ((z1) obj).f();
                if (z) {
                    f2.f(qVar.x.f(), qVar.x.j(), qVar.f8486b);
                } else {
                    f2.a(qVar.x, qVar.f8486b);
                }
            }
        });
        return c2.a();
    }
}
