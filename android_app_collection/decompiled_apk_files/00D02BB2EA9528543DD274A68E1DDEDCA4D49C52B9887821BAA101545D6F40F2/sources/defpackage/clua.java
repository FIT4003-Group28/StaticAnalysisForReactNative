package defpackage;
/* compiled from: PG */
/* renamed from: clua  reason: default package */
/* loaded from: classes5.dex */
public final class clua implements clvg {
    public final clud a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    private final long f;

    public clua(clud cludVar, long j, long j2, long j3, long j4, long j5) {
        this.a = cludVar;
        this.f = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        clvh clvhVar = new clvh(j, cluc.a(this.a.a(j), 0L, this.b, this.c, this.d, this.e));
        return new clve(clvhVar, clvhVar);
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.f;
    }
}
