package com.google.firebase.auth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o1 implements c.e.a.b.g.a<b0, c.e.a.b.g.h<Void>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ z f8432a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o1(z zVar) {
        this.f8432a = zVar;
    }

    @Override // c.e.a.b.g.a
    public final /* synthetic */ c.e.a.b.g.h<Void> a(c.e.a.b.g.h<b0> hVar) {
        return FirebaseAuth.getInstance(this.f8432a.y()).a((e) null, hVar.b().f());
    }
}
