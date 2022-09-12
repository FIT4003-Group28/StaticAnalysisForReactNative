package defpackage;
/* compiled from: PG */
/* renamed from: bmru  reason: default package */
/* loaded from: classes3.dex */
final class bmru extends cqmr<bmtv> {
    final /* synthetic */ bmxd a;
    final /* synthetic */ bmrv b;

    public bmru(bmrv bmrvVar, bmxd bmxdVar) {
        this.b = bmrvVar;
        this.a = bmxdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(bmtv bmtvVar, boolean z) {
        this.a.setListener((bmxb) this.b.a.a(bmtvVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        this.a.setListener(null);
    }
}
