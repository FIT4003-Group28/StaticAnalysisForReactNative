package com.google.firebase.installations;

import com.google.firebase.installations.m;
/* loaded from: classes.dex */
class k implements o {

    /* renamed from: a  reason: collision with root package name */
    private final p f9362a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.b.g.i<m> f9363b;

    public k(p pVar, c.e.a.b.g.i<m> iVar) {
        this.f9362a = pVar;
        this.f9363b = iVar;
    }

    @Override // com.google.firebase.installations.o
    public boolean a(com.google.firebase.installations.q.d dVar) {
        if (!dVar.j() || this.f9362a.a(dVar)) {
            return false;
        }
        c.e.a.b.g.i<m> iVar = this.f9363b;
        m.a d2 = m.d();
        d2.a(dVar.a());
        d2.b(dVar.b());
        d2.a(dVar.g());
        iVar.a((c.e.a.b.g.i<m>) d2.a());
        return true;
    }

    @Override // com.google.firebase.installations.o
    public boolean a(com.google.firebase.installations.q.d dVar, Exception exc) {
        if (dVar.h() || dVar.i() || dVar.k()) {
            this.f9363b.b(exc);
            return true;
        }
        return false;
    }
}
