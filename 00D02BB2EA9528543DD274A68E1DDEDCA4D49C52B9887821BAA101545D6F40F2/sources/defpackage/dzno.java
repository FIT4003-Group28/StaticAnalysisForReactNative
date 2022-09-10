package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzno  reason: default package */
/* loaded from: classes.dex */
public abstract class dzno<K> extends dznn<K> implements Serializable, dzpg {
    private static final long serialVersionUID = -4940583368468432370L;

    @Override // defpackage.dzgu
    public boolean containsKey(Object obj) {
        dzrn<dzpl> a = Tb().a();
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
        return d(((Integer) obj).intValue());
    }

    public boolean d(int i) {
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
        return Tb();
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
            return Tb().containsAll(map.entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f */
    public dzkc values() {
        throw null;
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        dzrn<dzpl> a = Tb().a();
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
    public void putAll(Map<? extends K, ? extends Integer> map) {
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends Integer>> it = map.entrySet().iterator();
        if (map instanceof dzpg) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzpl dzplVar = (dzpl) it.next();
                a(dzplVar.getKey(), dzplVar.a());
                size = i;
            }
        } else {
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return;
                }
                Map.Entry<? extends K, ? extends Integer> next = it.next();
                put(next.getKey(), next.getValue());
                size = i2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzrn<dzpl> a = Tb().a();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                dzpl next = a.next();
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
