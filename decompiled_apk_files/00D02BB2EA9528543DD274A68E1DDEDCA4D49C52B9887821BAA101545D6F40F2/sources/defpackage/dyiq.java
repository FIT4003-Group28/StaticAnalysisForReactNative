package defpackage;
/* compiled from: PG */
/* renamed from: dyiq  reason: default package */
/* loaded from: classes6.dex */
abstract class dyiq<ReqT, RespT> extends dyex<ReqT, RespT> {
    protected abstract dyex<?, ?> b();

    @Override // defpackage.dyex
    public void c(int i) {
        b().c(i);
    }

    @Override // defpackage.dyex
    public void d(@dzsi String str, @dzsi Throwable th) {
        b().d(str, th);
    }

    @Override // defpackage.dyex
    public void e() {
        b().e();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("delegate", b());
        return b.toString();
    }
}
