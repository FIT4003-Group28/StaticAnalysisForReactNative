package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzkk  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzkk extends dzki implements Serializable, dzlf {
    private static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return d(((Double) obj).doubleValue());
    }

    public boolean d(double d) {
        throw null;
    }

    @Override // defpackage.dzlc
    public boolean e(long j) {
        throw null;
    }

    @Override // java.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Set<Map.Entry<Long, Double>> entrySet() {
        return k();
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
            return k().containsAll(map.entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f */
    public dznf keySet() {
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: g */
    public dzhi values() {
        throw null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int size = size();
        dzrn<dzkj> a = k().a();
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
    public final void putAll(Map<? extends Long, ? extends Double> map) {
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends Double>> it = map.entrySet().iterator();
        if (map instanceof dzlf) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzkj dzkjVar = (dzkj) it.next();
                a(dzkjVar.a, dzkjVar.b);
                size = i;
            }
        } else {
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return;
                }
                Map.Entry<? extends Long, ? extends Double> next = it.next();
                put(next.getKey(), next.getValue());
                size = i2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzrn<dzkj> a = k().a();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                dzkj next = a.next();
                sb.append(String.valueOf(next.a));
                sb.append("=>");
                sb.append(String.valueOf(next.b));
                z = false;
                size = i;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
