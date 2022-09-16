package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amwz  reason: default package */
/* loaded from: classes.dex */
public final class amwz extends amwx {
    final Map a;
    final amwu b;

    public amwz(Map map, amwu amwuVar) {
        map.getClass();
        this.a = map;
        this.b = amwuVar;
    }

    @Override // defpackage.amwx
    public final Iterator a() {
        Iterator it = this.a.entrySet().iterator();
        amwu amwuVar = this.b;
        amwuVar.getClass();
        return arey.l(it, new amwp(amwuVar));
    }

    @Override // defpackage.amwx, java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null || this.a.containsKey(obj)) {
            return this.b.a(obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a.containsKey(obj)) {
            return this.b.a(this.a.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new amxa(this);
    }
}
