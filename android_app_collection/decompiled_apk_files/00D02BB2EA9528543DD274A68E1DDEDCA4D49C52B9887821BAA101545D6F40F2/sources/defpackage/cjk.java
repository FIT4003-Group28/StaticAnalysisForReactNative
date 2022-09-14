package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cjk  reason: default package */
/* loaded from: classes.dex */
public class cjk<T, Y> {
    private final Map<T, cjj<Y>> a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public cjk(long j) {
        this.b = j;
    }

    protected void a(T t, Y y) {
    }

    protected int b(Y y) {
        return 1;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized Y f(T t) {
        cjj<Y> cjjVar = this.a.get(t);
        if (cjjVar != null) {
            return cjjVar.a;
        }
        return null;
    }

    public final synchronized Y g(T t, Y y) {
        int b = b(y);
        long j = b;
        if (j >= this.b) {
            a(t, y);
            return null;
        }
        if (y != null) {
            this.c += j;
        }
        cjj<Y> put = this.a.put(t, y == null ? null : new cjj<>(y, b));
        if (put != null) {
            this.c -= put.b;
            if (!put.a.equals(y)) {
                a(t, put.a);
            }
        }
        j(this.b);
        if (put == null) {
            return null;
        }
        return put.a;
    }

    public final synchronized Y h(T t) {
        cjj<Y> remove = this.a.remove(t);
        if (remove == null) {
            return null;
        }
        this.c -= remove.b;
        return remove.a;
    }

    public final void i() {
        j(0L);
    }

    public final synchronized void j(long j) {
        while (this.c > j) {
            Iterator<Map.Entry<T, cjj<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, cjj<Y>> next = it.next();
            cjj<Y> value = next.getValue();
            this.c -= value.b;
            T key = next.getKey();
            it.remove();
            a(key, value.a);
        }
    }
}
