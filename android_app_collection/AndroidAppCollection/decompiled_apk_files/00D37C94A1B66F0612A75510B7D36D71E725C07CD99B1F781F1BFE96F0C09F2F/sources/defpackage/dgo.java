package defpackage;
/* compiled from: PG */
/* renamed from: dgo  reason: default package */
/* loaded from: classes3.dex */
public final class dgo extends dgp implements dgm {
    private final long e;
    private long f = Long.MIN_VALUE;
    private long g = Long.MIN_VALUE;
    private long h = Long.MIN_VALUE;

    public dgo(int i) {
        this.e = i;
    }

    @Override // defpackage.dgp
    public final float a(long j) {
        if (this.h == Long.MIN_VALUE) {
            this.f = j;
            this.h = j;
            this.g = j + (this.e * 1000000);
            return 0.0f;
        }
        long j2 = this.g;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        this.h = j;
        if (i >= 0) {
            return 1.0f;
        }
        long j3 = this.f;
        return ((float) (j - j3)) / ((float) (j2 - j3));
    }

    @Override // defpackage.dgm
    public final boolean b() {
        return this.h >= this.g;
    }
}
