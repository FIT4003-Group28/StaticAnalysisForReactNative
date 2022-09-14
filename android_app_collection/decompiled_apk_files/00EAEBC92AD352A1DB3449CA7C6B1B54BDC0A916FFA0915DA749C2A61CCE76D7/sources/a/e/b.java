package a.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f122f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private static final Object[] f123g = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    private static Object[] f124h;
    private static int i;
    private static Object[] j;
    private static int k;

    /* renamed from: b  reason: collision with root package name */
    private int[] f125b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f126c;

    /* renamed from: d  reason: collision with root package name */
    int f127d;

    /* renamed from: e  reason: collision with root package name */
    private f<E, E> f128e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f<E, E> {
        a() {
        }

        @Override // a.e.f
        protected int a(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // a.e.f
        protected Object a(int i, int i2) {
            return b.this.f126c[i];
        }

        @Override // a.e.f
        protected E a(int i, E e2) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // a.e.f
        protected void a() {
            b.this.clear();
        }

        @Override // a.e.f
        protected void a(int i) {
            b.this.e(i);
        }

        @Override // a.e.f
        protected void a(E e2, E e3) {
            b.this.add(e2);
        }

        @Override // a.e.f
        protected int b(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // a.e.f
        protected Map<E, E> b() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // a.e.f
        protected int c() {
            return b.this.f127d;
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f125b = f122f;
            this.f126c = f123g;
        } else {
            g(i2);
        }
        this.f127d = 0;
    }

    private int a(Object obj, int i2) {
        int i3 = this.f127d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f125b, i3, i2);
        if (a2 < 0 || obj.equals(this.f126c[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f125b[i4] == i2) {
            if (obj.equals(this.f126c[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f125b[i5] == i2; i5--) {
            if (obj.equals(this.f126c[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private f<E, E> a() {
        if (this.f128e == null) {
            this.f128e = new a();
        }
        return this.f128e;
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (k < 10) {
                    objArr[0] = j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    j = objArr;
                    k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (i < 10) {
                    objArr[0] = f124h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f124h = objArr;
                    i++;
                }
            }
        }
    }

    private int b() {
        int i2 = this.f127d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f125b, i2, 0);
        if (a2 < 0 || this.f126c[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f125b[i3] == 0) {
            if (this.f126c[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f125b[i4] == 0; i4--) {
            if (this.f126c[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    private void g(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                if (j != null) {
                    Object[] objArr = j;
                    this.f126c = objArr;
                    j = (Object[]) objArr[0];
                    this.f125b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                if (f124h != null) {
                    Object[] objArr2 = f124h;
                    this.f126c = objArr2;
                    f124h = (Object[]) objArr2[0];
                    this.f125b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    i--;
                    return;
                }
            }
        }
        this.f125b = new int[i2];
        this.f126c = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int a2;
        if (e2 == null) {
            a2 = b();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            a2 = a(e2, hashCode);
        }
        if (a2 >= 0) {
            return false;
        }
        int i3 = ~a2;
        int i4 = this.f127d;
        if (i4 >= this.f125b.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f125b;
            Object[] objArr = this.f126c;
            g(i5);
            int[] iArr2 = this.f125b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f126c, 0, objArr.length);
            }
            a(iArr, objArr, this.f127d);
        }
        int i6 = this.f127d;
        if (i3 < i6) {
            int[] iArr3 = this.f125b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f126c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f127d - i3);
        }
        this.f125b[i3] = i2;
        this.f126c[i3] = e2;
        this.f127d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        d(this.f127d + collection.size());
        boolean z = false;
        for (E e2 : collection) {
            z |= add(e2);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f127d;
        if (i2 != 0) {
            a(this.f125b, this.f126c, i2);
            this.f125b = f122f;
            this.f126c = f123g;
            this.f127d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(int i2) {
        int[] iArr = this.f125b;
        if (iArr.length < i2) {
            Object[] objArr = this.f126c;
            g(i2);
            int i3 = this.f127d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f125b, 0, i3);
                System.arraycopy(objArr, 0, this.f126c, 0, this.f127d);
            }
            a(iArr, objArr, this.f127d);
        }
    }

    public E e(int i2) {
        Object[] objArr = this.f126c;
        E e2 = (E) objArr[i2];
        int i3 = this.f127d;
        if (i3 <= 1) {
            a(this.f125b, objArr, i3);
            this.f125b = f122f;
            this.f126c = f123g;
            this.f127d = 0;
        } else {
            int[] iArr = this.f125b;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                this.f127d--;
                int i5 = this.f127d;
                if (i2 < i5) {
                    int[] iArr2 = this.f125b;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr2 = this.f126c;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f127d - i2);
                }
                this.f126c[this.f127d] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f125b;
                Object[] objArr3 = this.f126c;
                g(i4);
                this.f127d--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.f125b, 0, i2);
                    System.arraycopy(objArr3, 0, this.f126c, 0, i2);
                }
                int i7 = this.f127d;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.f125b, i2, i7 - i2);
                    System.arraycopy(objArr3, i8, this.f126c, i2, this.f127d - i2);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f127d; i2++) {
                try {
                    if (!set.contains(f(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E f(int i2) {
        return (E) this.f126c[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f125b;
        int i2 = this.f127d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? b() : a(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f127d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return a().e().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f127d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f126c[i2])) {
                e(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f127d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f127d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f126c, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f127d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f127d));
        }
        System.arraycopy(this.f126c, 0, tArr, 0, this.f127d);
        int length = tArr.length;
        int i2 = this.f127d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f127d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f127d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E f2 = f(i2);
            if (f2 != this) {
                sb.append(f2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
