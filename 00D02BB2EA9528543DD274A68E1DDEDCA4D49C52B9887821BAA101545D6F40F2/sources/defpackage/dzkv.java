package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dzkv  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzkv extends dzkr implements dznd {
    public boolean addAll(int i, Collection<? extends Long> collection) {
        l(i);
        Iterator<? extends Long> it = collection.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, it.next());
            i++;
        }
        return hasNext;
    }

    @Override // defpackage.dzkr, defpackage.dzmy
    public boolean b(long j) {
        throw null;
    }

    @Override // defpackage.dzkr, defpackage.dzmy
    public final boolean c(long j) {
        return o(j) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        i(0, size());
    }

    public void e(int i, long j) {
        throw null;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof dznd) {
            dzne listIterator = listIterator();
            dzne n = ((dznd) list).n();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (listIterator.b() != n.b()) {
                    return false;
                }
                size = i;
            }
        } else {
            dzne listIterator2 = listIterator();
            ListIterator listIterator3 = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                Long next = listIterator2.next();
                Object next2 = listIterator3.next();
                if (next != null) {
                    if (!next.equals(next2)) {
                        break;
                    }
                    size = i2;
                } else if (next2 != null) {
                    break;
                } else {
                    size = i2;
                }
            }
            return false;
        }
    }

    public long g(int i) {
        throw null;
    }

    public long h(int i, long j) {
        throw null;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        dzne listIterator = listIterator();
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size != 0) {
                i = (i * 31) + dzgv.d(listIterator.b());
                size = i2;
            } else {
                return i;
            }
        }
    }

    public void i(int i, int i2) {
        throw null;
    }

    @Override // java.util.List
    @Deprecated
    public final int indexOf(Object obj) {
        return o(((Long) obj).longValue());
    }

    @Override // java.util.List
    /* renamed from: j */
    public dzne listIterator(int i) {
        throw null;
    }

    @Override // java.util.List
    /* renamed from: k */
    public dznd subList(int i, int i2) {
        l(i);
        l(i2);
        if (i > i2) {
            throw new IndexOutOfBoundsException("Start index (" + i + ") is greater than end index (" + i2 + ")");
        }
        return new dzku(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(int i) {
        if (i >= 0) {
            if (i <= size()) {
                return;
            }
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than list size (" + size() + ")");
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is negative");
    }

    @Override // java.util.List
    @Deprecated
    public final int lastIndexOf(Object obj) {
        return p(((Long) obj).longValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(int i) {
        if (i >= 0) {
            if (i < size()) {
                return;
            }
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + size() + ")");
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is negative");
    }

    @Override // java.util.List
    /* renamed from: n */
    public final dzne listIterator() {
        return listIterator(0);
    }

    public int o(long j) {
        dzne listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (j == listIterator.b()) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int p(long j) {
        dzne listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (j == listIterator.a()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.lang.Comparable
    /* renamed from: q */
    public final int compareTo(List<? extends Long> list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof dznd) {
            dzne listIterator = listIterator();
            dzne n = ((dznd) list).n();
            while (listIterator.hasNext() && n.hasNext()) {
                long b = listIterator.b();
                long b2 = n.b();
                int i = (b > b2 ? 1 : (b == b2 ? 0 : -1));
                if (b != b2) {
                    return i;
                }
            }
            if (n.hasNext()) {
                return -1;
            }
            return !listIterator.hasNext() ? 0 : 1;
        }
        dzne listIterator2 = listIterator();
        ListIterator<? extends Long> listIterator3 = list.listIterator();
        while (listIterator2.hasNext() && listIterator3.hasNext()) {
            int compareTo = listIterator2.next().compareTo(listIterator3.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (listIterator3.hasNext()) {
            return -1;
        }
        return !listIterator2.hasNext() ? 0 : 1;
    }

    @Override // java.util.List
    @Deprecated
    /* renamed from: r */
    public final void add(int i, Long l) {
        e(i, l.longValue());
    }

    @Override // java.util.List
    @Deprecated
    /* renamed from: s */
    public final Long set(int i, Long l) {
        return Long.valueOf(h(i, l.longValue()));
    }

    @Override // java.util.List
    @Deprecated
    /* renamed from: t */
    public final Long get(int i) {
        return Long.valueOf(f(i));
    }

    @Override // defpackage.dzkr, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzne listIterator = listIterator();
        int size = size();
        sb.append("[");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(listIterator.b()));
                z = false;
                size = i;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    @Override // java.util.List
    @Deprecated
    /* renamed from: u */
    public final Long remove(int i) {
        return Long.valueOf(g(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        return addAll(size(), collection);
    }
}
