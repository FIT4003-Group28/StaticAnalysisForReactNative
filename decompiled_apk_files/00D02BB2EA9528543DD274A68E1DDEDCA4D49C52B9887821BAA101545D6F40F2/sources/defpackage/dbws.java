package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbws  reason: default package */
/* loaded from: classes5.dex */
public final class dbws<K, V> extends AbstractQueue<dbwv<K, V>> {
    final dbwv<K, V> a = new dbwq();

    @Override // java.util.Queue
    /* renamed from: a */
    public final dbwv<K, V> peek() {
        dbwv<K, V> dbwvVar = this.a;
        dbwv<K, V> dbwvVar2 = ((dbwq) dbwvVar).a;
        if (dbwvVar2 == dbwvVar) {
            return null;
        }
        return dbwvVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        dbwv<K, V> dbwvVar = ((dbwq) this.a).a;
        while (true) {
            dbwv<K, V> dbwvVar2 = this.a;
            if (dbwvVar == dbwvVar2) {
                dbwq dbwqVar = (dbwq) dbwvVar2;
                dbwqVar.a = dbwvVar2;
                dbwqVar.b = dbwvVar2;
                return;
            }
            dbwv<K, V> n = dbwvVar.n();
            dbwu.p(dbwvVar);
            dbwvVar = n;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((dbwv) obj).n() != dbvw.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        dbwv<K, V> dbwvVar = this.a;
        return ((dbwq) dbwvVar).a == dbwvVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<dbwv<K, V>> iterator() {
        return new dbwr(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        dbwv dbwvVar = (dbwv) obj;
        dbwu.o(dbwvVar.p(), dbwvVar.n());
        dbwu.o(((dbwq) this.a).b, dbwvVar);
        dbwu.o(dbwvVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        dbwv<K, V> dbwvVar = this.a;
        dbwv<K, V> dbwvVar2 = ((dbwq) dbwvVar).a;
        if (dbwvVar2 == dbwvVar) {
            return null;
        }
        remove(dbwvVar2);
        return dbwvVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        dbwv dbwvVar = (dbwv) obj;
        dbwv<K, V> p = dbwvVar.p();
        dbwv<K, V> n = dbwvVar.n();
        dbwu.o(p, n);
        dbwu.p(dbwvVar);
        return n != dbvw.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (dbwv<K, V> dbwvVar = ((dbwq) this.a).a; dbwvVar != this.a; dbwvVar = dbwvVar.n()) {
            i++;
        }
        return i;
    }
}
