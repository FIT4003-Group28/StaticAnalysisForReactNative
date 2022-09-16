package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amqz  reason: default package */
/* loaded from: classes.dex */
final class amqz extends amwv {
    final /* synthetic */ amrb a;

    public amqz(amrb amrbVar) {
        this.a = amrbVar;
    }

    @Override // defpackage.amwv
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.amwv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return araa.s(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new amra(this.a);
    }

    @Override // defpackage.amwv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        amro amroVar = this.a.b;
        Object key = entry.getKey();
        Map map = amroVar.a;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        amroVar.b -= size;
        return true;
    }
}
