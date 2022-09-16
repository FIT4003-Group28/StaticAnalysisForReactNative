package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: amvn  reason: default package */
/* loaded from: classes.dex */
public abstract class amvn extends amub implements Set {
    private transient amuk a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < max);
            return highestOneBit;
        }
        aqxo.q(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static amvl i() {
        return new amvl();
    }

    public static amvl j(int i) {
        araa.v(i, "expectedSize");
        return new amvl(i);
    }

    public static amvn o(Iterable iterable) {
        if (iterable instanceof Collection) {
            return p((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return amyg.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        amvl amvlVar = new amvl();
        amvlVar.c(next);
        amvlVar.k(it);
        return amvlVar.g();
    }

    public static amvn p(Collection collection) {
        if ((collection instanceof amvn) && !(collection instanceof SortedSet)) {
            amvn amvnVar = (amvn) collection;
            if (!amvnVar.l()) {
                return amvnVar;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    public static amvn q(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length == 1) {
                return r(objArr[0]);
            }
            return n(length, (Object[]) objArr.clone());
        }
        return amyg.a;
    }

    public static amvn r(Object obj) {
        return new amyt(obj);
    }

    public static amvn s(Object obj, Object obj2) {
        return n(2, obj, obj2);
    }

    public static amvn t(Object obj, Object obj2, Object obj3) {
        return n(3, obj, obj2, obj3);
    }

    public static amvn u(Object obj, Object obj2, Object obj3, Object obj4) {
        return n(4, obj, obj2, obj3, obj4);
    }

    public static amvn v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return n(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static amvn w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        aqxo.q(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return n(i, objArr2);
    }

    public static boolean x(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean a() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof amvn) && a() && ((amvn) obj).a() && hashCode() != obj.hashCode()) {
            return false;
        }
        return amyv.j(this, obj);
    }

    @Override // defpackage.amub
    public amuk g() {
        amuk amukVar = this.a;
        if (amukVar == null) {
            amuk h = h();
            this.a = h;
            return h;
        }
        return amukVar;
    }

    public amuk h() {
        return amuk.i(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return amyv.b(this);
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public abstract amzs iterator();

    @Override // defpackage.amub
    Object writeReplace() {
        return new amvm(toArray());
    }

    public static amvn n(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return r(obj);
            }
            int f = f(i);
            Object[] objArr2 = new Object[f];
            int i2 = f - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj2 = objArr[i5];
                amxp.b(obj2, i5);
                int hashCode = obj2.hashCode();
                int F = arey.F(hashCode);
                while (true) {
                    int i6 = F & i2;
                    Object obj3 = objArr2[i6];
                    if (obj3 != null) {
                        if (obj3.equals(obj2)) {
                            break;
                        }
                        F++;
                    } else {
                        objArr[i4] = obj2;
                        objArr2[i6] = obj2;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new amyt(obj4, i3);
            } else if (f(i4) < f / 2) {
                return n(i4, objArr);
            } else {
                if (x(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new amyg(objArr, i3, objArr2, i2, i4);
            }
        }
        return amyg.a;
    }
}
