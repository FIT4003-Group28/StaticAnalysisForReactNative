package com.google.firebase.installations;
/* loaded from: classes.dex */
class l implements o {

    /* renamed from: a  reason: collision with root package name */
    final c.e.a.b.g.i<String> f9364a;

    public l(c.e.a.b.g.i<String> iVar) {
        this.f9364a = iVar;
    }

    @Override // com.google.firebase.installations.o
    public boolean a(com.google.firebase.installations.q.d dVar) {
        if (dVar.k() || dVar.j() || dVar.h()) {
            this.f9364a.b((c.e.a.b.g.i<String>) dVar.c());
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.o
    public boolean a(com.google.firebase.installations.q.d dVar, Exception exc) {
        return false;
    }
}
