package defpackage;
/* compiled from: PG */
/* renamed from: bat  reason: default package */
/* loaded from: classes2.dex */
final class bat implements azy {
    final /* synthetic */ azy a;
    final /* synthetic */ bau b;

    public bat(bau bauVar, azy azyVar) {
        this.b = bauVar;
        this.a = azyVar;
    }

    @Override // defpackage.azy
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        azw b = this.a.b(j);
        azz azzVar = b.a;
        azz azzVar2 = new azz(azzVar.b, azzVar.c + this.b.b);
        azz azzVar3 = b.b;
        return new azw(azzVar2, new azz(azzVar3.b, azzVar3.c + this.b.b));
    }

    @Override // defpackage.azy
    public final boolean c() {
        return this.a.c();
    }
}
