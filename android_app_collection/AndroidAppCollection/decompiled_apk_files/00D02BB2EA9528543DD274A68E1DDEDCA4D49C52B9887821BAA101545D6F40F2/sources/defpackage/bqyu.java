package defpackage;
/* compiled from: PG */
/* renamed from: bqyu  reason: default package */
/* loaded from: classes4.dex */
final class bqyu implements dbty<Void> {
    final /* synthetic */ byte[] a;
    final /* synthetic */ cqat b;
    final /* synthetic */ bqyv c;

    public bqyu(bqyv bqyvVar, byte[] bArr, cqat cqatVar) {
        this.c = bqyvVar;
        this.a = bArr;
        this.b = cqatVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Void a() {
        bqyv bqyvVar = this.c;
        awcb awcbVar = bqyvVar.e;
        byte[] bArr = this.a;
        int i = bqyvVar.b;
        long g = bqyvVar.g.g(akry.ROAD_GRAPH, this.b);
        awcbVar.a(bArr, i, g == -1 ? Long.MAX_VALUE : (g + 999) / 1000);
        this.c.f.c();
        return null;
    }
}
