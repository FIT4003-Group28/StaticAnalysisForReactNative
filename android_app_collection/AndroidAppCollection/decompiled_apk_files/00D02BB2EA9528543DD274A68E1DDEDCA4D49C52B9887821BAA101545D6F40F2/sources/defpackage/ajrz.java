package defpackage;
/* compiled from: PG */
/* renamed from: ajrz  reason: default package */
/* loaded from: classes2.dex */
final class ajrz implements degu<Void> {
    final /* synthetic */ btlu a;
    final /* synthetic */ z b;
    final /* synthetic */ ajsa c;

    public ajrz(ajsa ajsaVar, btlu btluVar, z zVar) {
        this.c = ajsaVar;
        this.a = btluVar;
        this.b = zVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.c();
        this.b.f(ajpv.a(th));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r2) {
        this.c.c();
        this.c.g.d(this.a);
        this.b.f(ajps.a);
    }
}
