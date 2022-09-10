package defpackage;
/* compiled from: PG */
/* renamed from: dyol  reason: default package */
/* loaded from: classes6.dex */
abstract class dyol implements dylu {
    protected abstract dylu a();

    @Override // defpackage.dylu
    public final void b(dyhw dyhwVar) {
        a().b(dyhwVar);
    }

    @Override // defpackage.dyvl
    public final void c(dyvk dyvkVar) {
        a().c(dyvkVar);
    }

    @Override // defpackage.dylu
    public void d(dyjb dyjbVar, dyhw dyhwVar) {
        throw null;
    }

    @Override // defpackage.dylu
    public void e(dyjb dyjbVar, dylt dyltVar, dyhw dyhwVar) {
        throw null;
    }

    @Override // defpackage.dyvl
    public final void f() {
        a().f();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("delegate", a());
        return b.toString();
    }
}
