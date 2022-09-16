package defpackage;
/* compiled from: PG */
/* renamed from: dzft  reason: default package */
/* loaded from: classes6.dex */
public final class dzft<T> {
    public int a;
    public int b;
    public int c;
    public T[] d;

    public dzft() {
        int a = dzfu.a(16);
        this.a = a - 1;
        this.c = (int) (a * 0.75f);
        this.d = (T[]) new Object[a];
    }

    public static int a(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public final void b(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t != null) {
                    int a = a(t.hashCode()) & i2;
                    if (i > i3) {
                        if (i >= a && a > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    } else if (i < a && a <= i3) {
                        i4 = i3 + 1;
                    }
                } else {
                    tArr[i] = null;
                    return;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }
}
