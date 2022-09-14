package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dznm  reason: default package */
/* loaded from: classes.dex */
public abstract class dznm<K> extends dznl<K> implements Serializable, dzov {
    private static final long serialVersionUID = -4940583368468432370L;

    @Override // defpackage.dzgu
    public boolean containsKey(Object obj) {
        dzrn<dzpa> a = Ta().a();
        while (a.hasNext()) {
            if (a.next().getKey() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return d(((Float) obj).floatValue());
    }

    public boolean d(float f) {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: e */
    public dzrv<K> keySet() {
        throw null;
    }

    @Override // java.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return Ta();
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
            return Ta().containsAll(map.entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f */
    public dzhs values() {
        throw null;
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        dzrn<dzpa> a = Ta().a();
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends Float> map) {
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends Float>> it = map.entrySet().iterator();
        if (map instanceof dzov) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzpa dzpaVar = (dzpa) it.next();
                a(dzpaVar.getKey(), dzpaVar.a());
                size = i;
            }
        } else {
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return;
                }
                Map.Entry<? extends K, ? extends Float> next = it.next();
                put(next.getKey(), next.getValue());
                size = i2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzrn<dzpa> a = Ta().a();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                dzpa next = a.next();
                if (this == next.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(next.getKey()));
                }
                sb.append("=>");
                sb.append(String.valueOf(next.a()));
                z = false;
                size = i;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
