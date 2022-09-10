package defpackage;
/* compiled from: PG */
/* renamed from: dyir  reason: default package */
/* loaded from: classes6.dex */
abstract class dyir<RespT> extends dyew<RespT> {
    @Override // defpackage.dyew
    public void a(dyhw dyhwVar) {
        h().a(dyhwVar);
    }

    @Override // defpackage.dyew
    public void b(dyjb dyjbVar, dyhw dyhwVar) {
        h().b(dyjbVar, dyhwVar);
    }

    protected abstract dyew<?> h();

    @Override // defpackage.dyew
    public final void i() {
        h().i();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("delegate", h());
        return b.toString();
    }
}
