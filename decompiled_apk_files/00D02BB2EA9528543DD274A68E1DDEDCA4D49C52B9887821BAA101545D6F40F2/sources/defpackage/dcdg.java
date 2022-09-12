package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdg  reason: default package */
/* loaded from: classes.dex */
public class dcdg<K, V> {
    Object[] a;
    int b;

    public dcdg() {
        this(4);
    }

    private final void a(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, dccq.e(length, i2));
        }
    }

    public dcdn<K, V> b() {
        return dcmn.e(this.b, this.a);
    }

    public dcdg<K, V> c(Map<? extends K, ? extends V> map) {
        e(map.entrySet());
        return this;
    }

    public void e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            a(this.b + ((Collection) iterable).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            g(entry);
        }
    }

    public void f(K k, V v) {
        a(this.b + 1);
        dbzb.a(k, v);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = k;
        objArr[i2 + 1] = v;
        this.b = i + 1;
    }

    public void g(Map.Entry<? extends K, ? extends V> entry) {
        f(entry.getKey(), entry.getValue());
    }

    public dcdg(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
