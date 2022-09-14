package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.internal.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s1 extends n2<Void, Void> {
    private final c.e.a.b.d.e.l2 x;

    public s1(String str, String str2, com.google.firebase.auth.e eVar) {
        super(6);
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        com.google.android.gms.common.internal.s.a(eVar);
        this.x = new c.e.a.b.d.e.l2(str, str2, eVar);
    }

    @Override // com.google.firebase.auth.v0.a.n2
    public final void a() {
        b((s1) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z1 z1Var, c.e.a.b.g.i iVar) {
        this.f8491g = new w2(this, iVar);
        z1Var.f().a(this.x, this.f8486b);
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final String f() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.firebase.auth.v0.a.e
    public final com.google.android.gms.common.api.internal.n<z1, Void> j() {
        n.a c2 = com.google.android.gms.common.api.internal.n.c();
        c2.a(false);
        c2.a(c.e.a.b.d.e.g2.f3912c);
        c2.a(new com.google.android.gms.common.api.internal.l(this) { // from class: com.google.firebase.auth.v0.a.r1

            /* renamed from: a  reason: collision with root package name */
            private final s1 f8501a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8501a = this;
            }

            @Override // com.google.android.gms.common.api.internal.l
            public final void a(Object obj, Object obj2) {
                this.f8501a.a((z1) obj, (c.e.a.b.g.i) obj2);
            }
        });
        return c2.a();
    }
}
