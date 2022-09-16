package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dcep  reason: default package */
/* loaded from: classes.dex */
public abstract class dcep<E> extends dccr<E> implements Set<E> {
    private transient dcdc<E> a;

    public static <E> dcep<E> B(E e) {
        return new dcnn(e);
    }

    public static <E> dcep<E> C(E e, E e2) {
        return H(2, e, e2);
    }

    public static <E> dcep<E> D(E e, E e2, E e3) {
        return H(3, e, e2, e3);
    }

    public static <E> dcep<E> E(E e, E e2, E e3, E e4) {
        return H(4, e, e2, e3, e4);
    }

    public static <E> dcep<E> F(E e, E e2, E e3, E e4, E e5) {
        return H(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> dcep<E> G(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        dbsk.b(true, "the total number of elements must fit in an int");
        int length = eArr.length;
        int i = length + 6;
        Object[] objArr = new Object[i];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, length);
        return H(i, objArr);
    }

    public static boolean I(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            dbsk.b(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
            d = highestOneBit;
            Double.isNaN(d);
        } while (d * 0.7d < max);
        return highestOneBit;
    }

    public static <E> dcep<E> K(Collection<? extends E> collection) {
        if ((collection instanceof dcep) && !(collection instanceof SortedSet)) {
            dcep<E> dcepVar = (dcep) collection;
            if (!dcepVar.SI()) {
                return dcepVar;
            }
        }
        Object[] array = collection.toArray();
        return H(array.length, array);
    }

    public static <E> dcep<E> L(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return K((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return dcmr.a;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return B(next);
        }
        dcen dcenVar = new dcen();
        dcenVar.b(next);
        dbsk.s(it);
        while (it.hasNext()) {
            dcenVar.b(it.next());
        }
        return dcenVar.f();
    }

    public static <E> dcep<E> M(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length == 1) {
                return B(eArr[0]);
            }
            return H(length, (Object[]) eArr.clone());
        }
        return dcmr.a;
    }

    public static <E> dcen<E> N() {
        return new dcen<>();
    }

    public static <E> dcen<E> O(int i) {
        dbzb.d(i, "expectedSize");
        return new dcen<>(i);
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public abstract dcpd<E> iterator();

    public dcdc<E> SH() {
        return dcdc.B(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof dcep) && w() && ((dcep) obj).w() && hashCode() != obj.hashCode()) {
            return false;
        }
        return dcnm.s(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return dcnm.r(this);
    }

    @Override // defpackage.dccr
    public dcdc<E> v() {
        dcdc<E> dcdcVar = this.a;
        if (dcdcVar == null) {
            dcdc<E> SH = SH();
            this.a = SH;
            return SH;
        }
        return dcdcVar;
    }

    public boolean w() {
        return false;
    }

    @Override // defpackage.dccr
    Object writeReplace() {
        return new dceo(toArray());
    }

    public static <E> dcep<E> H(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                return B(objArr[0]);
            }
            int J = J(i);
            Object[] objArr2 = new Object[J];
            int i2 = J - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                dclq.g(obj, i5);
                int hashCode = obj.hashCode();
                int a = dccj.a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a++;
                    } else {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new dcnn(objArr[0], i3);
            }
            if (J(i4) < J / 2) {
                return H(i4, objArr);
            }
            if (I(i4, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new dcmr(objArr, i3, objArr2, i2, i4);
        }
        return dcmr.a;
    }
}
