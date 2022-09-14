package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s0 extends n2<Void, com.google.firebase.auth.internal.c> {
    private final c.e.a.b.d.e.o1 x;
    private final String y;

    public s0(String str, com.google.firebase.auth.e eVar, String str2, String str3) {
        super(4);
        com.google.android.gms.common.internal.s.a(str, (Object) "email cannot be null or empty");
        this.x = new c.e.a.b.d.e.o1(str, eVar, str2);
        this.y = str3;
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        b((s0) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z1 z1Var, c.e.a.b.g.i iVar) {
        this.f8491g = new w2(this, iVar);
        boolean z = this.t;
        f2 f2 = z1Var.f();
        if (z) {
            f2.a(this.x.f(), this.x.j(), this.f8486b);
        } else {
            f2.a(this.x, this.f8486b);
        }
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return this.y;
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, Void> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.r0

            /* renamed from: a  reason: collision with root package name */
            private final s0 f8500a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8500a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8500a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
