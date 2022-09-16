package defpackage;
/* compiled from: PG */
/* renamed from: oxm  reason: default package */
/* loaded from: classes4.dex */
public final class oxm implements oye {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;

    public oxm(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = iArr.length;
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
    }

    public final int a(long j) {
        return pcx.s(this.e, j, true);
    }

    @Override // defpackage.oye
    public final long b(long j) {
        return this.c[a(j)];
    }

    @Override // defpackage.oye
    public final boolean c() {
        return true;
    }
}
