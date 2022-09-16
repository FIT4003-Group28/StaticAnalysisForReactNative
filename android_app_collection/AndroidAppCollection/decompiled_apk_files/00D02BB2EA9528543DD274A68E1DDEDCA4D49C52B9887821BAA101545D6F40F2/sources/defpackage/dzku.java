package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dzku  reason: default package */
/* loaded from: classes6.dex */
public final class dzku extends dzkv implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final dznd a;
    protected final int b;
    protected int c;

    public dzku(dznd dzndVar, int i, int i2) {
        this.a = dzndVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.dzkv, defpackage.dzkr, defpackage.dzmy
    public final /* bridge */ /* synthetic */ dzna a() {
        return listIterator();
    }

    @Override // defpackage.dzkv, java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        super.add(i, (Long) obj);
    }

    @Override // defpackage.dzkv, java.util.List
    public final boolean addAll(int i, Collection<? extends Long> collection) {
        l(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.dzkv, defpackage.dzkr, defpackage.dzmy
    public final boolean b(long j) {
        this.a.e(this.c, j);
        this.c++;
        return true;
    }

    @Override // defpackage.dzkv, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    @Override // defpackage.dzkr
    public final boolean d(long j) {
        int o = o(j);
        if (o == -1) {
            return false;
        }
        this.c--;
        this.a.g(this.b + o);
        return true;
    }

    @Override // defpackage.dzkv, defpackage.dznd
    public final void e(int i, long j) {
        l(i);
        this.a.e(this.b + i, j);
        this.c++;
    }

    @Override // defpackage.dznd
    public final long f(int i) {
        m(i);
        return this.a.f(this.b + i);
    }

    @Override // defpackage.dzkv, defpackage.dznd
    public final long g(int i) {
        m(i);
        this.c--;
        return this.a.g(this.b + i);
    }

    @Override // defpackage.dzkv, java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return super.get(i);
    }

    @Override // defpackage.dzkv, defpackage.dznd
    public final long h(int i, long j) {
        m(i);
        return this.a.h(this.b + i, j);
    }

    @Override // defpackage.dzkv, defpackage.dznd
    public final void i(int i, int i2) {
        l(i);
        l(i2);
        dznd dzndVar = this.a;
        int i3 = this.b;
        dzndVar.i(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // defpackage.dzkv, defpackage.dzkr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator();
    }

    @Override // defpackage.dzkv
    public final dzne j(int i) {
        l(i);
        return new dzkt(this, i);
    }

    @Override // defpackage.dzkv
    public final dznd k(int i, int i2) {
        l(i);
        l(i2);
        if (i > i2) {
            throw new IllegalArgumentException("Start index (" + i + ") is greater than end index (" + i2 + ")");
        }
        return new dzku(this, i, i2);
    }

    @Override // defpackage.dzkv, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // defpackage.dzkv, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.dzkv, java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return super.remove(i);
    }

    @Override // defpackage.dzkv, java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return super.set(i, (Long) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.dzkv, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
