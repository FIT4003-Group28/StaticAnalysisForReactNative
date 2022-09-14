package defpackage;

import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: altj  reason: default package */
/* loaded from: classes.dex */
public final class altj<K, V> {
    public final altr<K, V> a;
    private final Map<K, Collection<alti<K, V>>> b = dcjz.d();

    public altj(altr<K, V> altrVar) {
        this.a = altrVar;
    }

    public final void a(K k, alti<K, V> altiVar) {
        V a = this.a.a(k);
        if (a != null) {
            altiVar.a(a);
            return;
        }
        synchronized (this.b) {
            Collection<alti<K, V>> collection = this.b.get(k);
            if (collection == null) {
                collection = dchl.a();
                this.b.put(k, collection);
            }
            collection.add(altiVar);
        }
    }

    public final void b(K k, V v) {
        this.a.Pz(k, v);
        synchronized (this.b) {
            if (this.b.containsKey(k)) {
                for (alti<K, V> altiVar : this.b.get(k)) {
                    altiVar.a(v);
                }
                this.b.remove(k);
            }
        }
    }
}
