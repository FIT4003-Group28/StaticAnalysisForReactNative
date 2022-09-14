package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends n2<Void, com.google.firebase.auth.internal.g> {
    public s() {
        super(5);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        ((com.google.firebase.auth.internal.g) this.f8489e).f();
        b((s) null);
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "delete";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, Void> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a((this.t || this.u) ? null : new com.google.android.gms.common.d[]{c.e.a.b.d.e.g2.f3911b});
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.r

            /* renamed from: a  reason: collision with root package name */
            private final s f8499a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8499a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                s sVar = this.f8499a;
                sVar.f8491g = new w2(sVar, (c.e.a.b.g.i) obj2);
                boolean z = sVar.t;
                f2 f2 = ((z1) obj).f();
                if (z) {
                    f2.b(sVar.f8488d.z(), sVar.f8486b);
                } else {
                    f2.a(new c.e.a.b.d.e.x0(sVar.f8488d.z()), sVar.f8486b);
                }
            }
        });
        return c2.a();
    }
}
