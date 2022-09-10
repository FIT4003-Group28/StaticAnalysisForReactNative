package defpackage;
/* compiled from: PG */
/* renamed from: cqx  reason: default package */
/* loaded from: classes5.dex */
final class cqx implements degu<Boolean> {
    final /* synthetic */ cqy a;

    public cqx(cqy cqyVar) {
        this.a = cqyVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.f(new RuntimeException(th));
        this.a.c(false);
        this.a.a.e.q();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        this.a.c(bool.booleanValue());
    }
}
