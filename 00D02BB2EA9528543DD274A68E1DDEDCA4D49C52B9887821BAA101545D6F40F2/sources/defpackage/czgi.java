package defpackage;
/* compiled from: PG */
/* renamed from: czgi  reason: default package */
/* loaded from: classes5.dex */
final class czgi implements degu<Long> {
    final /* synthetic */ dbsg a;
    final /* synthetic */ czgk b;

    public czgi(czgk czgkVar, dbsg dbsgVar) {
        this.b = czgkVar;
        this.a = dbsgVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.c(this.b.h, 2, cyos.a(th), czgk.g(this.a));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Long l) {
        this.b.h.d(73, decl.b(l.longValue()), czgk.g(this.a));
    }
}
