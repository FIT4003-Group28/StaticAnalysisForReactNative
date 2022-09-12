package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aypj  reason: default package */
/* loaded from: classes3.dex */
public final class aypj implements degu<baad> {
    final /* synthetic */ baad a;
    final /* synthetic */ aypo b;
    final /* synthetic */ ayon c;

    public aypj(aypo aypoVar, ayon ayonVar, baad baadVar) {
        this.b = aypoVar;
        this.c = ayonVar;
        this.a = baadVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.a(this.a.A() ? ayoo.ALTERNATE : ayoo.INITIAL);
        cqkx.p(this.b);
        this.b.f.f();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        baad baadVar2 = baadVar;
        this.b.i.d(baadVar2);
        this.c.a(baadVar2.A() ? ayoo.ALTERNATE : ayoo.INITIAL);
        cqkx.p(this.b);
    }
}
