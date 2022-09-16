package defpackage;
/* compiled from: PG */
/* renamed from: clxy  reason: default package */
/* loaded from: classes5.dex */
final class clxy implements clvg {
    final /* synthetic */ clxz a;

    public clxy(clxz clxzVar) {
        this.a = clxzVar;
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        long e = this.a.c.e(j);
        clxz clxzVar = this.a;
        long j2 = clxzVar.a;
        long j3 = clxzVar.b;
        clvh clvhVar = new clvh(j, cmny.C((((e * (j3 - j2)) / clxzVar.d) + j2) - 30000, j2, (-1) + j3));
        return new clve(clvhVar, clvhVar);
    }

    @Override // defpackage.clvg
    public final long c() {
        clxz clxzVar = this.a;
        return clxzVar.c.d(clxzVar.d);
    }
}
