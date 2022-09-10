package defpackage;
/* compiled from: PG */
/* renamed from: pce  reason: default package */
/* loaded from: classes7.dex */
final class pce implements degu<duto> {
    final /* synthetic */ deig a;
    final /* synthetic */ btzc b;

    public pce(deig deigVar, btzc btzcVar) {
        this.a = deigVar;
        this.b = btzcVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            this.b.a();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi duto dutoVar) {
    }
}
