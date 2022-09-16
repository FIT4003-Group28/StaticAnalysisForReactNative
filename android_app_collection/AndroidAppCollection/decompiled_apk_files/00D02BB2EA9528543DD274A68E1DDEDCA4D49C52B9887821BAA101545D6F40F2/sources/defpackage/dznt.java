package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dznt  reason: default package */
/* loaded from: classes.dex */
public abstract class dznt<K, V> extends dznr<K, V> implements Serializable, dzqq {
    private static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map
    /* renamed from: a */
    public dzrv<K> keySet() {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: b */
    public dzrj<V> values() {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: c */
    public dzrv<Map.Entry<K, V>> entrySet() {
        return g();
    }

    @Override // defpackage.dzgu
    public boolean containsKey(Object obj) {
        dzrn<dzqo<K, V>> a = g().a();
        while (a.hasNext()) {
            if (a.next().getKey() == obj) {
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
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() == size()) {
            return entrySet().containsAll(map.entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        dzrn<Map.Entry<K, V>> a = entrySet().a();
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
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (map instanceof dzqq) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzqo dzqoVar = (dzqo) it.next();
                put(dzqoVar.getKey(), dzqoVar.getValue());
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
        dzrn<Map.Entry<K, V>> a = entrySet().a();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                dzqo dzqoVar = (dzqo) a.next();
                if (this == dzqoVar.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(dzqoVar.getKey()));
                }
                sb.append("=>");
                if (this == dzqoVar.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(dzqoVar.getValue()));
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
