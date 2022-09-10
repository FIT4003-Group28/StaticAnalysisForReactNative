package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dckr  reason: default package */
/* loaded from: classes5.dex */
public final class dckr<K, V> extends dbys<K, V> {
    private static final long serialVersionUID = 0;
    transient dbty<? extends Set<V>> c;

    public dckr(Map<K, Collection<V>> map, dbty<? extends Set<V>> dbtyVar) {
        super(map);
        dbsk.s(dbtyVar);
        this.c = dbtyVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (dbty) objectInputStream.readObject();
        j((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(((dbye) this).a);
    }

    @Override // defpackage.dbys, defpackage.dbye
    public final <E> Collection<E> a(Collection<E> collection) {
        if (collection instanceof NavigableSet) {
            return dcnm.t((NavigableSet) collection);
        }
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // defpackage.dbys, defpackage.dbye
    public final Collection<V> b(K k, Collection<V> collection) {
        if (collection instanceof NavigableSet) {
            return new dbyb(this, k, (NavigableSet) collection, null);
        }
        if (collection instanceof SortedSet) {
            return new dbyd(this, k, (SortedSet) collection, null);
        }
        return new dbyc(this, k, (Set) collection);
    }

    @Override // defpackage.dbys, defpackage.dbye
    public final /* bridge */ /* synthetic */ Collection h() {
        return this.c.a();
    }

    @Override // defpackage.dbye, defpackage.dbyn
    public final Set<K> r() {
        return s();
    }

    @Override // defpackage.dbye, defpackage.dbyn
    public final Map<K, Collection<V>> x() {
        return y();
    }
}
