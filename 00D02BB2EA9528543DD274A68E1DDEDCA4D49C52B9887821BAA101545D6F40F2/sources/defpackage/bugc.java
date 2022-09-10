package defpackage;
/* compiled from: PG */
/* renamed from: bugc  reason: default package */
/* loaded from: classes4.dex */
final class bugc implements degu<Boolean> {
    final /* synthetic */ String a;
    final /* synthetic */ dssj b;
    final /* synthetic */ buid c;
    final /* synthetic */ btzi d;
    final /* synthetic */ btzw e;
    final /* synthetic */ bugg f;

    public bugc(bugg buggVar, String str, dssj dssjVar, buid buidVar, btzi btziVar, btzw btzwVar) {
        this.f = buggVar;
        this.a = str;
        this.b = dssjVar;
        this.c = buidVar;
        this.d = btziVar;
        this.e = btzwVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.f.c.b(this.a);
        this.f.e(th, this.b, this.c, 1, this.d, this.e);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
    }
}
