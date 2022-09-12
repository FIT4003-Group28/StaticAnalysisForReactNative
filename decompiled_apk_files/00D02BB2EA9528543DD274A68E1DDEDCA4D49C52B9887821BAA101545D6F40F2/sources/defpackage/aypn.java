package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aypn  reason: default package */
/* loaded from: classes3.dex */
public final class aypn implements degu<baad> {
    final /* synthetic */ baad a;
    final /* synthetic */ aypo b;
    final /* synthetic */ ayon c;

    public aypn(aypo aypoVar, ayon ayonVar, baad baadVar) {
        this.b = aypoVar;
        this.c = ayonVar;
        this.a = baadVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.a(this.a.z() ? ayoo.ALTERNATE : ayoo.INITIAL);
        this.b.f.f();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        baad baadVar2 = baadVar;
        this.b.i.d(baadVar2);
        this.c.a(baadVar2.z() ? ayoo.ALTERNATE : ayoo.INITIAL);
        if (baadVar2.z()) {
            this.b.f.a();
        } else {
            this.b.f.b(baadVar2, new aypm(this));
        }
    }
}
