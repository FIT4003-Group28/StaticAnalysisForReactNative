package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aoqp  reason: default package */
/* loaded from: classes.dex */
public final class aoqp extends LinkedHashMap {
    public static final aoqp a;
    public boolean b;

    static {
        aoqp aoqpVar = new aoqp();
        a = aoqpVar;
        aoqpVar.c();
    }

    private aoqp() {
        this.b = true;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return aopv.b((byte[]) obj);
        }
        if (obj instanceof aopm) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final aoqp a() {
        return isEmpty() ? new aoqp() : new aoqp(this);
    }

    public final void b() {
        if (this.b) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void c() {
        this.b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                    equals = value.equals(obj2);
                    continue;
                } else {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += d(entry.getValue()) ^ d(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        aopv.h(obj);
        aopv.h(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            aopv.h(obj);
            aopv.h(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }

    private aoqp(Map map) {
        super(map);
        this.b = true;
    }
}
