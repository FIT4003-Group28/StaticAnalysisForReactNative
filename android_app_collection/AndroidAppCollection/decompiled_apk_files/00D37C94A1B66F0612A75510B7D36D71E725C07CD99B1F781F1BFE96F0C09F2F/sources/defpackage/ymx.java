package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ymx  reason: default package */
/* loaded from: classes4.dex */
public final class ymx implements Map {
    private final Map a = new HashMap();
    private final ReferenceQueue b = new ReferenceQueue();

    private final void a() {
        Reference poll = this.b.poll();
        while (poll != null) {
            if (poll instanceof ymw) {
                this.a.remove(poll);
            }
            poll = this.b.poll();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        a();
        return this.a.containsKey(new ymw(obj, this.b));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        a();
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("entrySet() not supported because keys may have the same equality/hash code.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        a();
        return this.a.get(new ymw(obj, this.b));
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        a();
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException("keySet() not supported because keys may have the same equality/hash code.");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        a();
        ymw ymwVar = new ymw(obj, this.b);
        Object obj3 = this.a.get(ymwVar);
        this.a.put(ymwVar, obj2);
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        a();
        for (Map.Entry entry : map.entrySet()) {
            this.a.put(new ymw(entry.getKey(), this.b), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.a.remove(new ymw(obj, this.b));
    }

    @Override // java.util.Map
    public final int size() {
        a();
        return this.a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        a();
        return this.a.values();
    }
}
