package defpackage;
/* compiled from: PG */
/* renamed from: agz  reason: default package */
/* loaded from: classes.dex */
final class agz {
    public final Object[] a = new Object[256];
    public int b;

    public final Object a() {
        int i = this.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.a;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.b = i2;
            return obj;
        }
        return null;
    }

    public final void b(Object obj) {
        int i = this.b;
        if (i < 256) {
            this.a[i] = obj;
            this.b = i + 1;
        }
    }
}
