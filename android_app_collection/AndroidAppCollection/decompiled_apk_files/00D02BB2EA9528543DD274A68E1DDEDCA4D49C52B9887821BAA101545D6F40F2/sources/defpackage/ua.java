package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ua  reason: default package */
/* loaded from: classes7.dex */
public final class ua<T> {
    public T[] a;
    public int b = 0;
    private final tz c;
    private final Class<T> d;

    public ua(Class<T> cls, tz<T> tzVar) {
        this.d = cls;
        this.a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, 10));
        this.c = tzVar;
    }

    public final T a(int i) {
        if (i >= this.b || i < 0) {
            throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.b);
        }
        return this.a[i];
    }

    public final void b() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.a, 0, i, (Object) null);
        this.b = 0;
        this.c.b(0, i);
    }

    public final void c(T t) {
        int d = d(t, this.a, this.b, 1);
        if (d == -1) {
            d = 0;
        } else if (d < this.b) {
            T t2 = this.a[d];
            if (this.c.d(t2, t)) {
                if (this.c.c(t2, t)) {
                    this.a[d] = t;
                    return;
                }
                this.a[d] = t;
                this.c.e(d);
                return;
            }
        }
        int i = this.b;
        if (d <= i) {
            T[] tArr = this.a;
            int length = tArr.length;
            if (i == length) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.d, length + 10));
                System.arraycopy(this.a, 0, tArr2, 0, d);
                tArr2[d] = t;
                System.arraycopy(this.a, d, tArr2, d + 1, this.b - d);
                this.a = tArr2;
            } else {
                System.arraycopy(tArr, d, tArr, d + 1, i - d);
                this.a[d] = t;
            }
            this.b++;
            this.c.a(d, 1);
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + d + " because size is " + this.b);
    }

    public final int d(T t, T[] tArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = (i3 + i) / 2;
            T t2 = tArr[i4];
            int compare = this.c.compare(t2, t);
            if (compare < 0) {
                i3 = i4 + 1;
            } else if (compare == 0) {
                if (this.c.d(t2, t)) {
                    return i4;
                }
                int i5 = i4 - 1;
                while (i5 >= i3) {
                    T t3 = this.a[i5];
                    if (this.c.compare(t3, t) != 0) {
                        break;
                    } else if (this.c.d(t3, t)) {
                        break;
                    } else {
                        i5--;
                    }
                }
                i5 = i4 + 1;
                while (i5 < i) {
                    T t4 = this.a[i5];
                    if (this.c.compare(t4, t) != 0) {
                        break;
                    } else if (this.c.d(t4, t)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                i5 = -1;
                return (i2 == 1 && i5 == -1) ? i4 : i5;
            } else {
                i = i4;
            }
        }
        if (i2 == 1) {
            return i3;
        }
        return -1;
    }

    public final void e(T t) {
        int d = d(t, this.a, this.b, 2);
        if (d == -1) {
            return;
        }
        T[] tArr = this.a;
        System.arraycopy(tArr, d + 1, tArr, d, (this.b - d) - 1);
        int i = this.b - 1;
        this.b = i;
        this.a[i] = null;
        this.c.b(d, 1);
    }
}
