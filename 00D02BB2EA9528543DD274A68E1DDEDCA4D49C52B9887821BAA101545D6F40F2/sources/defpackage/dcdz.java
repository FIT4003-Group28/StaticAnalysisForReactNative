package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdz  reason: default package */
/* loaded from: classes.dex */
public class dcdz<K, V> {
    final Map<K, Collection<V>> a = dbzn.a();

    public Collection<V> e() {
        return new ArrayList();
    }

    public final dced<K, V> f() {
        return dcde.i(this.a.entrySet());
    }

    public void g(K k, Iterable<? extends V> iterable) {
        if (k == null) {
            String valueOf = String.valueOf(dcft.b(iterable));
            throw new NullPointerException(valueOf.length() != 0 ? "null key in entry: null=".concat(valueOf) : new String("null key in entry: null="));
        }
        Collection<V> collection = this.a.get(k);
        if (collection != null) {
            for (V v : iterable) {
                dbzb.a(k, v);
                collection.add(v);
            }
            return;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return;
        }
        Collection<V> e = e();
        while (it.hasNext()) {
            V next = it.next();
            dbzb.a(k, next);
            e.add(next);
        }
        this.a.put(k, e);
    }

    public void h(K k, V v) {
        dbzb.a(k, v);
        Collection<V> collection = this.a.get(k);
        if (collection == null) {
            Map<K, Collection<V>> map = this.a;
            Collection<V> e = e();
            map.put(k, e);
            collection = e;
        }
        collection.add(v);
    }
}
