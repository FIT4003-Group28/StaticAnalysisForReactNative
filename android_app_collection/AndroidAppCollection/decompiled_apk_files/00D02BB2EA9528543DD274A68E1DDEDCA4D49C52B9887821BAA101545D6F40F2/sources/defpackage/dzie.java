package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dzie  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzie extends dzia implements dzke {
    public boolean addAll(int i, Collection<? extends Integer> collection) {
        l(i);
        Iterator<? extends Integer> it = collection.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, it.next());
            i++;
        }
        return hasNext;
    }

    @Override // defpackage.dzia, defpackage.dzke
    public boolean b(int i) {
        throw null;
    }

    @Override // defpackage.dzia
    public final boolean c(int i) {
        return o(i) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        i(0, size());
    }

    public void e(int i, int i2) {
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
        if (list instanceof dzke) {
            dzkf listIterator = listIterator();
            dzkf n = ((dzke) list).n();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (listIterator.a() != n.a()) {
                    return false;
                }
                size = i;
            }
        } else {
            dzkf listIterator2 = listIterator();
            ListIterator listIterator3 = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                Integer next = listIterator2.next();
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

    public int g(int i) {
        throw null;
    }

    public int h(int i, int i2) {
        throw null;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        dzkf listIterator = listIterator();
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size != 0) {
                i = (i * 31) + listIterator.a();
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
        return o(((Integer) obj).intValue());
    }

    @Override // java.util.List
    /* renamed from: j */
    public dzkf listIterator(int i) {
        throw null;
    }

    @Override // java.util.List
    /* renamed from: k */
    public dzke subList(int i, int i2) {
        l(i);
        l(i2);
        if (i > i2) {
            throw new IndexOutOfBoundsException("Start index (" + i + ") is greater than end index (" + i2 + ")");
        }
        return new dzid(this, i, i2);
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
        return p(((Integer) obj).intValue());
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
    public final dzkf listIterator() {
        return listIterator(0);
    }

    public int o(int i) {
        dzkf listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (i == listIterator.a()) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int p(int i) {
        dzkf listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (i == listIterator.b()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.lang.Comparable
    /* renamed from: q */
    public final int compareTo(List<? extends Integer> list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof dzke) {
            dzkf listIterator = listIterator();
            dzkf n = ((dzke) list).n();
            while (listIterator.hasNext() && n.hasNext()) {
                int compare = Integer.compare(listIterator.a(), n.a());
                if (compare != 0) {
                    return compare;
                }
            }
            if (n.hasNext()) {
                return -1;
            }
            return !listIterator.hasNext() ? 0 : 1;
        }
        dzkf listIterator2 = listIterator();
        ListIterator<? extends Integer> listIterator3 = list.listIterator();
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
    public final void add(int i, Integer num) {
        e(i, num.intValue());
    }

    @Override // java.util.List
    @Deprecated
    /* renamed from: s */
    public final Integer set(int i, Integer num) {
        return Integer.valueOf(h(i, num.intValue()));
    }

    @Override // java.util.List
    @Deprecated
    /* renamed from: t */
    public final Integer get(int i) {
        return Integer.valueOf(f(i));
    }

    @Override // defpackage.dzia, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzkf listIterator = listIterator();
        int size = size();
        sb.append("[");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(listIterator.a()));
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
    public final Integer remove(int i) {
        return Integer.valueOf(g(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        return addAll(size(), collection);
    }
}
