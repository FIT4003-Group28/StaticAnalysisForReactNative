package defpackage;
/* compiled from: PG */
/* renamed from: clvf  reason: default package */
/* loaded from: classes5.dex */
public class clvf implements clvg {
    private final long a;
    private final clve b;

    public clvf(long j) {
        this(j, 0L);
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return false;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        return this.b;
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.a;
    }

    public clvf(long j, long j2) {
        this.a = j;
        clvh clvhVar = j2 == 0 ? clvh.a : new clvh(0L, j2);
        this.b = new clve(clvhVar, clvhVar);
    }
}
