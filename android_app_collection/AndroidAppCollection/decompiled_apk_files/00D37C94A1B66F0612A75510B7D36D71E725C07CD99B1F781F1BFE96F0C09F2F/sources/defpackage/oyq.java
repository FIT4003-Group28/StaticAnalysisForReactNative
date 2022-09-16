package defpackage;
/* compiled from: PG */
/* renamed from: oyq  reason: default package */
/* loaded from: classes4.dex */
final class oyq implements oyo {
    private final long[] a;
    private final long[] b;
    private final long c;

    public oyq(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
    }

    @Override // defpackage.oyo
    public final long a() {
        return this.c;
    }

    @Override // defpackage.oye
    public final long b(long j) {
        return this.b[pcx.s(this.a, j, true)];
    }

    @Override // defpackage.oye
    public final boolean c() {
        return true;
    }

    @Override // defpackage.oyo
    public final long d(long j) {
        return this.a[pcx.s(this.b, j, true)];
    }
}
