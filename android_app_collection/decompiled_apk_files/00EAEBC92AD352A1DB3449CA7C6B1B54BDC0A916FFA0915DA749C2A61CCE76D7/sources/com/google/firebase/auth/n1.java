package com.google.firebase.auth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n1 implements c.e.a.b.g.a<b0, c.e.a.b.g.h<Void>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f8426a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ z f8427b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(z zVar, e eVar) {
        this.f8427b = zVar;
        this.f8426a = eVar;
    }

    @Override // c.e.a.b.g.a
    public final /* synthetic */ c.e.a.b.g.h<Void> a(c.e.a.b.g.h<b0> hVar) {
        return FirebaseAuth.getInstance(this.f8427b.y()).a(this.f8426a, hVar.b().f());
    }
}
