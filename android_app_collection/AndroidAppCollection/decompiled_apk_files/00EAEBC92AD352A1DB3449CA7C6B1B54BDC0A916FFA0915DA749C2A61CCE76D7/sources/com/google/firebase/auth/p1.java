package com.google.firebase.auth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p1 implements c.e.a.b.g.a<b0, c.e.a.b.g.h<Void>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f8434a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e f8435b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ z f8436c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(z zVar, String str, e eVar) {
        this.f8436c = zVar;
        this.f8434a = str;
        this.f8435b = eVar;
    }

    @Override // c.e.a.b.g.a
    public final /* synthetic */ c.e.a.b.g.h<Void> a(c.e.a.b.g.h<b0> hVar) {
        return FirebaseAuth.getInstance(this.f8436c.y()).a(hVar.b().f(), this.f8434a, this.f8435b);
    }
}
