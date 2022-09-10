package defpackage;
/* compiled from: PG */
/* renamed from: bmrs  reason: default package */
/* loaded from: classes3.dex */
final class bmrs extends cqmr<bmtv> {
    final /* synthetic */ bmxd a;

    public bmrs(bmxd bmxdVar) {
        this.a = bmxdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(bmtv bmtvVar, boolean z) {
        bmtv bmtvVar2 = bmtvVar;
        if (bmtvVar2.H().booleanValue()) {
            this.a.setLogsReporter(bmtvVar2);
            this.a.setRectilinearPathData(bmtvVar2.R());
            this.a.requestLayout();
            if (!bmtvVar2.I().booleanValue()) {
                return;
            }
            bmxd bmxdVar = this.a;
            if (bmxdVar.getWidth() != 0) {
                bmxdVar.a();
            } else {
                bmxdVar.p = true;
            }
            bmtvVar2.P(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final void b(boolean z) {
        this.a.setLogsReporter(null);
    }
}
