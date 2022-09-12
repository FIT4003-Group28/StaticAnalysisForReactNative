package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbvc  reason: default package */
/* loaded from: classes.dex */
public final class dbvc<K, V> extends AbstractQueue<dbwv<K, V>> {
    final dbwv<K, V> a = new dbva();

    @Override // java.util.Queue
    /* renamed from: a */
    public final dbwv<K, V> peek() {
        dbwv<K, V> dbwvVar = this.a;
        dbwv<K, V> dbwvVar2 = ((dbva) dbwvVar).a;
        if (dbwvVar2 == dbwvVar) {
            return null;
        }
        return dbwvVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        dbwv<K, V> dbwvVar = ((dbva) this.a).a;
        while (true) {
            dbwv<K, V> dbwvVar2 = this.a;
            if (dbwvVar == dbwvVar2) {
                dbva dbvaVar = (dbva) dbwvVar2;
                dbvaVar.a = dbwvVar2;
                dbvaVar.b = dbwvVar2;
                return;
            }
            dbwv<K, V> h = dbwvVar.h();
            dbwu.n(dbwvVar);
            dbwvVar = h;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((dbwv) obj).h() != dbvw.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        dbwv<K, V> dbwvVar = this.a;
        return ((dbva) dbwvVar).a == dbwvVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<dbwv<K, V>> iterator() {
        return new dbvb(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        dbwv dbwvVar = (dbwv) obj;
        dbwu.m(dbwvVar.j(), dbwvVar.h());
        dbwu.m(((dbva) this.a).b, dbwvVar);
        dbwu.m(dbwvVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        dbwv<K, V> dbwvVar = this.a;
        dbwv<K, V> dbwvVar2 = ((dbva) dbwvVar).a;
        if (dbwvVar2 == dbwvVar) {
            return null;
        }
        remove(dbwvVar2);
        return dbwvVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        dbwv dbwvVar = (dbwv) obj;
        dbwv<K, V> j = dbwvVar.j();
        dbwv<K, V> h = dbwvVar.h();
        dbwu.m(j, h);
        dbwu.n(dbwvVar);
        return h != dbvw.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (dbwv<K, V> dbwvVar = ((dbva) this.a).a; dbwvVar != this.a; dbwvVar = dbwvVar.h()) {
            i++;
        }
        return i;
    }
}
