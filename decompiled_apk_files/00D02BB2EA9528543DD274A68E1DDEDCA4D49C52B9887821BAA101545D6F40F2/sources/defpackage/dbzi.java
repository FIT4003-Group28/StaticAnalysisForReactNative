package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbzi  reason: default package */
/* loaded from: classes.dex */
final class dbzi extends AbstractSet<Map.Entry> {
    final /* synthetic */ dbzn a;

    public dbzi(dbzn dbznVar) {
        this.a = dbznVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map f = this.a.f();
        if (f != null) {
            return f.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int m = this.a.m(entry.getKey());
            if (m != -1 && dbsd.a(this.a.e[m], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.a.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        dbzn dbznVar;
        Map f = this.a.f();
        if (f != null) {
            return f.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.a.d()) {
            return false;
        }
        int i = this.a.i();
        Object key = entry.getKey();
        Object value = entry.getValue();
        dbzn dbznVar2 = this.a;
        int i2 = dbzq.i(key, value, i, dbznVar2.b, dbznVar2.c, dbznVar2.d, dbznVar2.e);
        if (i2 == -1) {
            return false;
        }
        this.a.o(i2, i);
        dbznVar.g--;
        this.a.j();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
