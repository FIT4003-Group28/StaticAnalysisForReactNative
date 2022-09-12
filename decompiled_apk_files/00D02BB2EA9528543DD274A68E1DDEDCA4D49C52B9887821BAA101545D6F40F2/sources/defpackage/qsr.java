package defpackage;
/* compiled from: PG */
/* renamed from: qsr  reason: default package */
/* loaded from: classes7.dex */
final class qsr implements degu<Runnable> {
    final /* synthetic */ qst a;

    public qsr(qst qstVar) {
        this.a = qstVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.d();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Runnable runnable) {
        this.a.d();
        runnable.run();
    }
}
