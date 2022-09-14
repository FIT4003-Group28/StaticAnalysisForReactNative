package defpackage;
/* compiled from: PG */
/* renamed from: dcal  reason: default package */
/* loaded from: classes5.dex */
final class dcal extends dcao {
    final /* synthetic */ dcar a;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcal(dcar dcarVar, int i) {
        super(dcarVar.e[i]);
        this.a = dcarVar;
        this.d = i;
    }

    @Override // defpackage.dcao
    public final dcdn a() {
        return this.a.b;
    }

    @Override // defpackage.dcao
    public final Object b(int i) {
        return this.a.f[i][this.d];
    }

    @Override // defpackage.dcdn
    public final boolean c() {
        return true;
    }
}
