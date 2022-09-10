package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dzid  reason: default package */
/* loaded from: classes6.dex */
public final class dzid extends dzie implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final dzke a;
    protected final int b;
    protected int c;

    public dzid(dzke dzkeVar, int i, int i2) {
        this.a = dzkeVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.dzie, defpackage.dzia
    public final /* bridge */ /* synthetic */ dzkd a() {
        return listIterator();
    }

    @Override // defpackage.dzie, java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        super.add(i, (Integer) obj);
    }

    @Override // defpackage.dzie, java.util.List
    public final boolean addAll(int i, Collection<? extends Integer> collection) {
        l(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    @Override // defpackage.dzie, defpackage.dzia, defpackage.dzke
    public final boolean b(int i) {
        this.a.e(this.c, i);
        this.c++;
        return true;
    }

    @Override // defpackage.dzie, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    @Override // defpackage.dzia
    public final boolean d(int i) {
        int o = o(i);
        if (o == -1) {
            return false;
        }
        this.c--;
        this.a.g(this.b + o);
        return true;
    }

    @Override // defpackage.dzie, defpackage.dzke
    public final void e(int i, int i2) {
        l(i);
        this.a.e(this.b + i, i2);
        this.c++;
    }

    @Override // defpackage.dzke
    public final int f(int i) {
        m(i);
        return this.a.f(this.b + i);
    }

    @Override // defpackage.dzie, defpackage.dzke
    public final int g(int i) {
        m(i);
        this.c--;
        return this.a.g(this.b + i);
    }

    @Override // defpackage.dzie, java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return super.get(i);
    }

    @Override // defpackage.dzie, defpackage.dzke
    public final int h(int i, int i2) {
        m(i);
        return this.a.h(this.b + i, i2);
    }

    @Override // defpackage.dzie, defpackage.dzke
    public final void i(int i, int i2) {
        l(i);
        l(i2);
        dzke dzkeVar = this.a;
        int i3 = this.b;
        dzkeVar.i(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    @Override // defpackage.dzie, defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator();
    }

    @Override // defpackage.dzie
    public final dzkf j(int i) {
        l(i);
        return new dzic(this, i);
    }

    @Override // defpackage.dzie, defpackage.dzke
    public final dzke k(int i, int i2) {
        l(i);
        l(i2);
        if (i > i2) {
            throw new IllegalArgumentException("Start index (" + i + ") is greater than end index (" + i2 + ")");
        }
        return new dzid(this, i, i2);
    }

    @Override // defpackage.dzie, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // defpackage.dzie, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.dzie, java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return super.remove(i);
    }

    @Override // defpackage.dzie, java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return super.set(i, (Integer) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // defpackage.dzie, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
