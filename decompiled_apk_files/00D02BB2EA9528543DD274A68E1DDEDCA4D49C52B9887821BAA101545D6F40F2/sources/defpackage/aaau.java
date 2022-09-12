package defpackage;
/* compiled from: PG */
/* renamed from: aaau  reason: default package */
/* loaded from: classes2.dex */
final class aaau implements degu<aaco> {
    final /* synthetic */ aacn a;
    final /* synthetic */ aaaw b;

    public aaau(aaaw aaawVar, aacn aacnVar) {
        this.b = aaawVar;
        this.a = aacnVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.i(new RuntimeException(th));
        this.b.b.a(this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(aaco aacoVar) {
        this.b.c.a(aacoVar);
    }
}
