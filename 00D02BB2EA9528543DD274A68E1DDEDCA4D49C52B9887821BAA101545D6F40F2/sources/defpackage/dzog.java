package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzog  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzog<K, V> extends dzoe<K, V> implements Serializable, dzsc {
    private static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map
    /* renamed from: a */
    public dzsh<K> keySet() {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: b */
    public dzsf<V> values() {
        throw null;
    }

    @Override // defpackage.dzgu
    public boolean containsKey(Object obj) {
        dzrn<dzof> a = e().a();
        while (a.hasNext()) {
            if (a.next().a == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return e();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() == size()) {
            return e().containsAll(map.entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int size = size();
        dzrn<dzof> a = e().a();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size != 0) {
                i += a.next().hashCode();
                size = i2;
            } else {
                return i;
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (map instanceof dzsc) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzof dzofVar = (dzof) it.next();
                put(dzofVar.a, dzofVar.b);
                size = i;
            }
        } else {
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return;
                }
                Map.Entry<? extends K, ? extends V> next = it.next();
                put(next.getKey(), next.getValue());
                size = i2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzrn<dzof> a = e().a();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                dzof next = a.next();
                K k = next.a;
                if (this != k) {
                    sb.append(String.valueOf(k));
                } else {
                    sb.append("(this map)");
                }
                sb.append("=>");
                V v = next.b;
                if (this != v) {
                    sb.append(String.valueOf(v));
                } else {
                    sb.append("(this map)");
                }
                size = i;
                z = false;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
