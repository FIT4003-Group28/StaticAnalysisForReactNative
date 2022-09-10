package defpackage;
/* compiled from: PG */
/* renamed from: bjly  reason: default package */
/* loaded from: classes3.dex */
final class bjly implements degu<btzx<djcg, djci>> {
    final /* synthetic */ Runnable a;

    public bjly(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.run();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(btzx<djcg, djci> btzxVar) {
        if (btzxVar.b().a.isEmpty()) {
            this.a.run();
        }
    }
}
