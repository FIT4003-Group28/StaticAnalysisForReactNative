package com.google.firebase.auth.v0.a;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w extends n2<com.google.firebase.auth.b0, com.google.firebase.auth.internal.c> {
    private final c.e.a.b.d.e.a1 x;

    public w(String str) {
        super(1);
        com.google.android.gms.common.internal.s.a(str, (Object) "refresh token cannot be null");
        this.x = new c.e.a.b.d.e.a1(str);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        if (TextUtils.isEmpty(this.j.q())) {
            this.j.a(this.x.f());
        }
        ((com.google.firebase.auth.internal.c) this.f8489e).a(this.j, this.f8488d);
        b((w) com.google.firebase.auth.internal.n.a(this.j.k()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z1 z1Var, c.e.a.b.g.i iVar) {
        this.f8491g = new w2(this, iVar);
        boolean z = this.t;
        f2 f2 = z1Var.f();
        if (z) {
            f2.f(this.x.f(), this.f8486b);
        } else {
            f2.a(this.x, this.f8486b);
        }
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "getAccessToken";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, com.google.firebase.auth.b0> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.v

            /* renamed from: a  reason: collision with root package name */
            private final w f8508a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8508a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8508a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
