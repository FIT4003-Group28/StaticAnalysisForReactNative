package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m extends n2<com.google.firebase.auth.d, com.google.firebase.auth.internal.c> {
    private final c.e.a.b.d.e.r0 x;

    public m(String str, String str2) {
        super(4);
        com.google.android.gms.common.internal.s.a(str, (Object) "code cannot be null or empty");
        this.x = new c.e.a.b.d.e.r0(str, str2);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        b((m) new com.google.firebase.auth.internal.d0(this.m));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z1 z1Var, c.e.a.b.g.i iVar) {
        this.f8491g = new w2(this, iVar);
        boolean z = this.t;
        f2 f2 = z1Var.f();
        if (z) {
            f2.h(this.x.f(), this.f8486b);
        } else {
            f2.a(this.x, this.f8486b);
        }
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "checkActionCode";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, com.google.firebase.auth.d> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.l

            /* renamed from: a  reason: collision with root package name */
            private final m f8478a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8478a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8478a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
