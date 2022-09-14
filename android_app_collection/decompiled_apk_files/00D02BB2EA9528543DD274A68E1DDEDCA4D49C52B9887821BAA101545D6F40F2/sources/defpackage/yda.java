package defpackage;
/* compiled from: PG */
/* renamed from: yda  reason: default package */
/* loaded from: classes7.dex */
final class yda {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    private final boolean f;

    public yda(boolean z, int i, int i2, int i3, int i4, int i5) {
        this.f = z;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final Object[] a(@dzsi String str, Object... objArr) {
        if (this.f) {
            int length = objArr.length;
            Object[] objArr2 = new Object[length + 1];
            objArr2[0] = dbsj.e(str);
            System.arraycopy(objArr, 0, objArr2, 1, length);
            return objArr2;
        }
        return objArr;
    }
}
