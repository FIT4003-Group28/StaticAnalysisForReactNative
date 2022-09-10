package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzhu  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzhu extends dzht implements Serializable, dzij {
    private static final long serialVersionUID = -4940583368468432370L;

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

    @Override // defpackage.dzii
    public boolean e(int i) {
        throw null;
    }

    @Override // java.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Set<Map.Entry<Integer, Integer>> entrySet() {
        return SX();
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
            return SX().containsAll(map.entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f */
    public dzkg keySet() {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: g */
    public dzkc values() {
        throw null;
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        dzrn<dzio> a = SX().a();
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
    public void putAll(Map<? extends Integer, ? extends Integer> map) {
        int size = map.size();
        Iterator<Map.Entry<? extends Integer, ? extends Integer>> it = map.entrySet().iterator();
        if (map instanceof dzij) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzio dzioVar = (dzio) it.next();
                a(dzioVar.a(), dzioVar.b());
                size = i;
            }
        } else {
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return;
                }
                Map.Entry<? extends Integer, ? extends Integer> next = it.next();
                put(next.getKey(), next.getValue());
                size = i2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzrn<dzio> a = SX().a();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                dzio next = a.next();
                sb.append(String.valueOf(next.a()));
                sb.append("=>");
                sb.append(String.valueOf(next.b()));
                z = false;
                size = i;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
