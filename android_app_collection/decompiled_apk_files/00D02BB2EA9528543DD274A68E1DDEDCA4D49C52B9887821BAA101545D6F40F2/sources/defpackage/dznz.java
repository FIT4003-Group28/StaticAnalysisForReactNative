package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dznz  reason: default package */
/* loaded from: classes6.dex */
public final class dznz<K> extends dzoa<K> implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final dzrr<K> a;
    protected final int b;
    protected int c;

    public dznz(dzrr<K> dzrrVar, int i, int i2) {
        this.a = dzrrVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.dzoa, defpackage.dznw, defpackage.dzrj, defpackage.dzrv
    public final /* bridge */ /* synthetic */ dzrn a() {
        return listIterator();
    }

    @Override // defpackage.dzoa, java.util.List
    public final void add(int i, K k) {
        e(i);
        this.a.add(this.b + i, k);
        this.c++;
    }

    @Override // defpackage.dzoa, java.util.List
    public final boolean addAll(int i, Collection<? extends K> collection) {
        e(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.dzoa, defpackage.dzrr
    public final void b(int i, int i2) {
        e(i);
        e(i2);
        dzrr<K> dzrrVar = this.a;
        int i3 = this.b;
        dzrrVar.b(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // defpackage.dzoa
    public final dzrs<K> c(int i) {
        e(i);
        return new dzny(this, i);
    }

    @Override // defpackage.dzoa, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    @Override // defpackage.dzoa
    public final dzrr<K> d(int i, int i2) {
        e(i);
        e(i2);
        if (i > i2) {
            throw new IllegalArgumentException("Start index (" + i + ") is greater than end index (" + i2 + ")");
        }
        return new dznz(this, i, i2);
    }

    @Override // java.util.List
    public final K get(int i) {
        f(i);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.dzoa, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator();
    }

    @Override // defpackage.dzoa, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // defpackage.dzoa, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.dzoa, java.util.List
    public final K remove(int i) {
        f(i);
        this.c--;
        return this.a.remove(this.b + i);
    }

    @Override // defpackage.dzoa, java.util.List
    public final K set(int i, K k) {
        f(i);
        return this.a.set(this.b + i, k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.dzoa, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.dzoa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(K k) {
        this.a.add(this.c, k);
        this.c++;
        return true;
    }
}
