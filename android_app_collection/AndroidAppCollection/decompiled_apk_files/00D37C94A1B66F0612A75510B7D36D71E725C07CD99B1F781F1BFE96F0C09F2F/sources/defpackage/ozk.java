package defpackage;
/* compiled from: PG */
/* renamed from: ozk  reason: default package */
/* loaded from: classes4.dex */
final class ozk {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public ozk(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        boolean z = true;
        pce.b(iArr.length == length);
        int length2 = jArr.length;
        pce.b(length2 == length);
        pce.b(iArr2.length != length ? false : z);
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.a = length2;
    }
}
