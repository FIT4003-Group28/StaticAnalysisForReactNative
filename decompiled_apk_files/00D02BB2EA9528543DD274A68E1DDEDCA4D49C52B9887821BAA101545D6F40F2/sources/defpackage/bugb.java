package defpackage;
/* compiled from: PG */
/* renamed from: bugb  reason: default package */
/* loaded from: classes4.dex */
final class bugb implements degu {
    final /* synthetic */ dssj a;
    final /* synthetic */ buad b;
    final /* synthetic */ btzi c;
    final /* synthetic */ btzw d;
    final /* synthetic */ bugg e;

    public bugb(bugg buggVar, dssj dssjVar, buad buadVar, btzi btziVar, btzw btzwVar) {
        this.e = buggVar;
        this.a = dssjVar;
        this.b = buadVar;
        this.c = btziVar;
        this.d = btzwVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (this.e.e.isDone() || this.e.c(this.a)) {
            return;
        }
        bugg buggVar = this.e;
        buggVar.e(th, this.a, buggVar.b.a().a(this.b), 1, this.c, this.d);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dssj dssjVar = (dssj) obj;
    }
}
