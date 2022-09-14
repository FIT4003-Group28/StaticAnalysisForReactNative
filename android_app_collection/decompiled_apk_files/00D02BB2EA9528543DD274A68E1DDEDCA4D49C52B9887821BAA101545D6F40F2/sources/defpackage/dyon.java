package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyon  reason: default package */
/* loaded from: classes6.dex */
class dyon extends dyhi {
    public final dyhi a;

    public dyon(dyhi dyhiVar) {
        this.a = dyhiVar;
    }

    @Override // defpackage.dyeu
    public final <RequestT, ResponseT> dyex<RequestT, ResponseT> a(dyib<RequestT, ResponseT> dyibVar, dyet dyetVar) {
        return this.a.a(dyibVar, dyetVar);
    }

    @Override // defpackage.dyeu
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.dyhi
    public final dyfk c(boolean z) {
        return this.a.c(z);
    }

    @Override // defpackage.dyhi
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.dyhi
    public final boolean e(TimeUnit timeUnit) {
        return this.a.e(timeUnit);
    }

    @Override // defpackage.dyhi
    public void f() {
        throw null;
    }

    @Override // defpackage.dyhi
    public void g() {
        throw null;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("delegate", this.a);
        return b.toString();
    }
}
