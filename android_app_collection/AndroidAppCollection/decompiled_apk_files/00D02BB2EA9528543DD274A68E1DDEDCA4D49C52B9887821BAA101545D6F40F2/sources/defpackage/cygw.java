package defpackage;
/* compiled from: PG */
/* renamed from: cygw  reason: default package */
/* loaded from: classes5.dex */
final class cygw implements degu {
    final /* synthetic */ int a;
    final /* synthetic */ cygy b;

    public cygw(cygy cygyVar, int i) {
        this.b = cygyVar;
        this.a = i;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.g(null, this.a);
        this.b.d.a(th);
    }

    @Override // defpackage.degu
    public final void b(Object obj) {
        this.b.g(obj, this.a);
        dbsg dbsgVar = (dbsg) obj;
    }
}
