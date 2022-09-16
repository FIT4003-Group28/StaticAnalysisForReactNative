package defpackage;
/* compiled from: PG */
/* renamed from: aybl  reason: default package */
/* loaded from: classes2.dex */
abstract class aybl extends axyg {
    @Override // defpackage.axyg
    public void b(String str, Throwable th) {
        f().b(str, th);
    }

    @Override // defpackage.axyg
    public final void c() {
        f().c();
    }

    @Override // defpackage.axyg
    public final void d(int i) {
        f().d(i);
    }

    protected abstract axyg f();

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("delegate", f());
        return c.toString();
    }
}
