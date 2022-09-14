package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u1 extends n2<String, com.google.firebase.auth.internal.c> {
    private final c.e.a.b.d.e.r0 x;

    public u1(String str, String str2) {
        super(4);
        com.google.android.gms.common.internal.s.a(str, (Object) "code cannot be null or empty");
        this.x = new c.e.a.b.d.e.r0(str, str2);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        if (new com.google.firebase.auth.internal.d0(this.m).a() != 0) {
            a(new Status(17499));
        } else {
            b((u1) this.m.j());
        }
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
        return "verifyPasswordResetCode";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, String> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.t1

            /* renamed from: a  reason: collision with root package name */
            private final u1 f8506a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8506a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8506a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
