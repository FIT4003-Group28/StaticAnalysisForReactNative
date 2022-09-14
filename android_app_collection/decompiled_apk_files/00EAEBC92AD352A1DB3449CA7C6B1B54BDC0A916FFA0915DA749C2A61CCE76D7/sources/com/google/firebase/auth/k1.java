package com.google.firebase.auth;

import com.google.firebase.auth.n0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k1 extends n0.b {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n0.b f8411b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8412c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(FirebaseAuth firebaseAuth, n0.b bVar) {
        this.f8412c = firebaseAuth;
        this.f8411b = bVar;
    }

    @Override // com.google.firebase.auth.n0.b
    public final void a(c.e.b.f fVar) {
        this.f8411b.a(fVar);
    }

    @Override // com.google.firebase.auth.n0.b
    public final void a(m0 m0Var) {
        this.f8411b.a(m0Var);
    }

    @Override // com.google.firebase.auth.n0.b
    public final void a(String str) {
    }

    @Override // com.google.firebase.auth.n0.b
    public final void a(String str, n0.a aVar) {
        com.google.firebase.auth.internal.l0 l0Var;
        n0.b bVar = this.f8411b;
        l0Var = this.f8412c.f8294g;
        bVar.a(n0.a(str, l0Var.b()));
    }
}
