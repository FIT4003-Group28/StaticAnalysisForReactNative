package com.google.firebase.auth.v0.a;

import c.e.a.b.d.e.i3;
import com.google.android.gms.common.api.internal.n;
import com.google.firebase.auth.n0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w1 extends n2<Void, n0.b> {
    private final c.e.a.b.d.e.q1 x;

    public w1(i3 i3Var) {
        super(8);
        com.google.android.gms.common.internal.s.a(i3Var);
        this.x = new c.e.a.b.d.e.q1(i3Var);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
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
        return "verifyPhoneNumber";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, Void> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.v1

            /* renamed from: a  reason: collision with root package name */
            private final w1 f8510a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8510a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8510a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
