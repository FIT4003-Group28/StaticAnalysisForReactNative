package defpackage;

import android.util.SparseIntArray;
/* compiled from: PG */
/* renamed from: zx  reason: default package */
/* loaded from: classes.dex */
public abstract class zx {
    final SparseIntArray a = new SparseIntArray();
    final SparseIntArray b = new SparseIntArray();

    public abstract int a(int i);

    public int b(int i, int i2) {
        int a = a(i);
        if (a != i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int a2 = a(i4);
                i3 += a2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = a2;
                }
            }
            if (a + i3 <= i2) {
                return i3;
            }
        }
        return 0;
    }

    public final void c() {
        this.a.clear();
    }

    public final void d() {
        this.b.clear();
    }

    public final int e(int i, int i2) {
        int a = a(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int a2 = a(i5);
            i3 += a2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = a2;
            }
        }
        return i3 + a > i2 ? i4 + 1 : i4;
    }
}
