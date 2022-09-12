package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: aho  reason: default package */
/* loaded from: classes.dex */
public class aho<K, V> implements Iterable<Map.Entry<K, V>> {
    public ahk<K, V> b;
    public ahk<K, V> c;
    public final WeakHashMap<ahn<K, V>, Boolean> d = new WeakHashMap<>();
    public int e = 0;

    protected ahk<K, V> a(K k) {
        ahk<K, V> ahkVar = this.b;
        while (ahkVar != null && !ahkVar.a.equals(k)) {
            ahkVar = ahkVar.c;
        }
        return ahkVar;
    }

    public V b(K k) {
        ahk<K, V> a = a(k);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (ahn<K, V> ahnVar : this.d.keySet()) {
                ahnVar.Na(a);
            }
        }
        ahk<K, V> ahkVar = a.d;
        ahk<K, V> ahkVar2 = a.c;
        if (ahkVar != null) {
            ahkVar.c = ahkVar2;
        } else {
            this.b = ahkVar2;
        }
        ahk<K, V> ahkVar3 = a.c;
        if (ahkVar3 != null) {
            ahkVar3.d = ahkVar;
        } else {
            this.c = ahkVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public final V d(K k, V v) {
        ahk<K, V> a = a(k);
        if (a != null) {
            return a.b;
        }
        e(k, v);
        return null;
    }

    public final ahk<K, V> e(K k, V v) {
        ahk<K, V> ahkVar = new ahk<>(k, v);
        this.e++;
        ahk<K, V> ahkVar2 = this.c;
        if (ahkVar2 == null) {
            this.b = ahkVar;
        } else {
            ahkVar2.c = ahkVar;
            ahkVar.d = ahkVar2;
        }
        this.c = ahkVar;
        return ahkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aho)) {
            return false;
        }
        aho ahoVar = (aho) obj;
        if (this.e != ahoVar.e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = ahoVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
                next2 = null;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public final ahl f() {
        ahl ahlVar = new ahl(this);
        this.d.put(ahlVar, false);
        return ahlVar;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        ahi ahiVar = new ahi(this.b, this.c);
        this.d.put(ahiVar, false);
        return ahiVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
