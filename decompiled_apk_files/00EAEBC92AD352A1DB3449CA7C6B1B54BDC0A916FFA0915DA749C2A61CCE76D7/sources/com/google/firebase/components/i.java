package com.google.firebase.components;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements c.e.b.n.a {

    /* renamed from: a  reason: collision with root package name */
    private final l f8540a;

    /* renamed from: b  reason: collision with root package name */
    private final d f8541b;

    private i(l lVar, d dVar) {
        this.f8540a = lVar;
        this.f8541b = dVar;
    }

    public static c.e.b.n.a a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    @Override // c.e.b.n.a
    public Object get() {
        Object a2;
        a2 = r1.b().a(new v(this.f8541b, this.f8540a));
        return a2;
    }
}
