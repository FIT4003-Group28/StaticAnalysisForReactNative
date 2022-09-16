package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: amuk  reason: default package */
/* loaded from: classes.dex */
public abstract class amuk extends amub implements List, RandomAccess {
    private static final amzt a = new amug(amxx.a, 0);

    @SafeVarargs
    public static amuk A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        aqxo.q(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return F(objArr2);
    }

    public static amuk B(Iterable iterable) {
        Comparable[] comparableArr = (Comparable[]) arey.y(iterable, new Comparable[0]);
        amxp.c(comparableArr);
        Arrays.sort(comparableArr);
        return i(comparableArr);
    }

    public static amuk C(Comparator comparator, Iterable iterable) {
        Object[] w = arey.w(iterable);
        amxp.c(w);
        Arrays.sort(w, comparator);
        return i(w);
    }

    private static amuk F(Object... objArr) {
        amxp.c(objArr);
        return i(objArr);
    }

    public static amuf f() {
        return new amuf();
    }

    public static amuf h(int i) {
        araa.v(i, "expectedSize");
        return new amuf(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amuk i(Object[] objArr) {
        return j(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amuk j(Object[] objArr, int i) {
        if (i == 0) {
            return amxx.a;
        }
        return new amxx(objArr, i);
    }

    public static amuk n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return amxx.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        amuf amufVar = new amuf();
        amufVar.h(next);
        amufVar.k(it);
        return amufVar.g();
    }

    public static amuk o(Collection collection) {
        if (collection instanceof amub) {
            amuk g = ((amub) collection).g();
            return g.l() ? i(g.toArray()) : g;
        }
        return F(collection.toArray());
    }

    public static amuk p(Object[] objArr) {
        if (objArr.length == 0) {
            return amxx.a;
        }
        return F((Object[]) objArr.clone());
    }

    public static amuk q() {
        return amxx.a;
    }

    public static amuk r(Object obj) {
        return F(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static amuk s(Object obj, Object obj2) {
        return F(obj, obj2);
    }

    public static amuk t(Object obj, Object obj2, Object obj3) {
        return F(obj, obj2, obj3);
    }

    public static amuk u(Object obj, Object obj2, Object obj3, Object obj4) {
        return F(obj, obj2, obj3, obj4);
    }

    public static amuk v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return F(obj, obj2, obj3, obj4, obj5);
    }

    public static amuk w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return F(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static amuk x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return F(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static amuk y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return F(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static amuk z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return F(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // java.util.List
    /* renamed from: D */
    public final amzt listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: E */
    public final amzt listIterator(int i) {
        aqxo.H(i, size());
        return isEmpty() ? a : new amug(this, i);
    }

    public amuk a() {
        return size() <= 1 ? this : new amuh(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amub
    public int b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: c */
    public amuk subList(int i, int i2) {
        aqxo.x(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new amuj(this, i, i3);
        }
        return amxx.a;
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return amxp.v(this, obj);
    }

    @Override // defpackage.amub
    @Deprecated
    public final amuk g() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.amub
    public final amzs k() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amub
    Object writeReplace() {
        return new amui(toArray());
    }
}
