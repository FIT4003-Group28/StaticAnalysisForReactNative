package c.e.a.b.d.e;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class a0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f3855a;

    /* renamed from: b  reason: collision with root package name */
    private int f3856b;

    public a0() {
        this(4);
    }

    private a0(int i) {
        this.f3855a = new Object[8];
        this.f3856b = 0;
    }

    public final a0<K, V> a(K k, V v) {
        int i = (this.f3856b + 1) << 1;
        Object[] objArr = this.f3855a;
        if (i > objArr.length) {
            int length = objArr.length;
            if (i < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                i2 = Integer.highestOneBit(i - 1) << 1;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f3855a = Arrays.copyOf(objArr, i2);
        }
        v.a(k, v);
        Object[] objArr2 = this.f3855a;
        int i3 = this.f3856b;
        objArr2[i3 * 2] = k;
        objArr2[(i3 * 2) + 1] = v;
        this.f3856b = i3 + 1;
        return this;
    }

    public final b0<K, V> a() {
        return f0.a(this.f3856b, this.f3855a);
    }
}
