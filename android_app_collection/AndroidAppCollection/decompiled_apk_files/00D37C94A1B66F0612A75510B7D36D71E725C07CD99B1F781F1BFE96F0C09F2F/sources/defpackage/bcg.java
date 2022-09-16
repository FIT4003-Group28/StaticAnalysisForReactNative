package defpackage;
/* compiled from: PG */
/* renamed from: bcg  reason: default package */
/* loaded from: classes2.dex */
final class bcg implements azy {
    final /* synthetic */ bch a;

    public bcg(bch bchVar) {
        this.a = bchVar;
    }

    @Override // defpackage.azy
    public final long a() {
        bch bchVar = this.a;
        return bchVar.c.d(bchVar.d);
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        long e = this.a.c.e(j);
        bch bchVar = this.a;
        long j2 = bchVar.a;
        long j3 = bchVar.b;
        azz azzVar = new azz(j, pxi.j((((e * (j3 - j2)) / bchVar.d) + j2) - 30000, j2, (-1) + j3));
        return new azw(azzVar, azzVar);
    }

    @Override // defpackage.azy
    public final boolean c() {
        return true;
    }
}
