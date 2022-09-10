package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dzhx  reason: default package */
/* loaded from: classes.dex */
public abstract class dzhx<V> extends dzhv<V> implements Serializable, dzjj {
    private static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // defpackage.dziw
    public boolean d(int i) {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: e */
    public dzkg keySet() {
        throw null;
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
    /* renamed from: f */
    public dzrj<V> values() {
        throw null;
    }

    @Override // java.util.Map
    @Deprecated
    /* renamed from: g */
    public dzrv<Map.Entry<Integer, V>> entrySet() {
        return k();
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        dzrn<Map.Entry<Integer, V>> a = entrySet().a();
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
    public void putAll(Map<? extends Integer, ? extends V> map) {
        int size = map.size();
        Iterator<Map.Entry<? extends Integer, ? extends V>> it = map.entrySet().iterator();
        if (map instanceof dzjj) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzjh dzjhVar = (dzjh) it.next();
                a(dzjhVar.a(), dzjhVar.getValue());
                size = i;
            }
        } else {
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return;
                }
                Map.Entry<? extends Integer, ? extends V> next = it.next();
                put(next.getKey(), next.getValue());
                size = i2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzrn<Map.Entry<Integer, V>> a = entrySet().a();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                dzjh dzjhVar = (dzjh) a.next();
                sb.append(String.valueOf(dzjhVar.a()));
                sb.append("=>");
                if (this == dzjhVar.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(dzjhVar.getValue()));
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
