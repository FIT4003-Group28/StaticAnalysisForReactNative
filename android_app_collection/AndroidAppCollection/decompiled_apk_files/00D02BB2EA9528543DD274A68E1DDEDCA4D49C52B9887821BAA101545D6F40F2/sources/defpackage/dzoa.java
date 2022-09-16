package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dzoa  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzoa<K> extends dznw<K> implements dzrr<K> {
    public void add(int i, K k) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int i, Collection<? extends K> collection) {
        e(i);
        Iterator<? extends K> it = collection.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, it.next());
            i++;
        }
        return hasNext;
    }

    public void b(int i, int i2) {
        throw null;
    }

    @Override // java.util.List
    /* renamed from: c */
    public dzrs<K> listIterator(int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b(0, size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: d */
    public dzrr<K> subList(int i, int i2) {
        e(i);
        e(i2);
        if (i > i2) {
            throw new IndexOutOfBoundsException("Start index (" + i + ") is greater than end index (" + i2 + ")");
        }
        return new dznz(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i) {
        if (i >= 0) {
            if (i <= size()) {
                return;
            }
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than list size (" + size() + ")");
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is negative");
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
        dzrs<K> listIterator = listIterator();
        ListIterator listIterator2 = list.listIterator();
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return true;
            }
            K next = listIterator.next();
            Object next2 = listIterator2.next();
            if (next != null) {
                if (!next.equals(next2)) {
                    break;
                }
                size = i;
            } else if (next2 != null) {
                break;
            } else {
                size = i;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(int i) {
        if (i >= 0) {
            if (i < size()) {
                return;
            }
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + size() + ")");
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is negative");
    }

    @Override // java.util.List
    /* renamed from: g */
    public final dzrs<K> listIterator() {
        return listIterator(0);
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public final int compareTo(List<? extends K> list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof dzrr) {
            dzrs<K> listIterator = listIterator();
            dzrs<K> g = ((dzrr) list).g();
            while (listIterator.hasNext() && g.hasNext()) {
                int compareTo = ((Comparable) listIterator.next()).compareTo(g.next());
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            if (g.hasNext()) {
                return -1;
            }
            return !listIterator.hasNext() ? 0 : 1;
        }
        dzrs<K> listIterator2 = listIterator();
        ListIterator<? extends K> listIterator3 = list.listIterator();
        while (listIterator2.hasNext() && listIterator3.hasNext()) {
            int compareTo2 = ((Comparable) listIterator2.next()).compareTo(listIterator3.next());
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        if (listIterator3.hasNext()) {
            return -1;
        }
        return !listIterator2.hasNext() ? 0 : 1;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        dzrs<K> listIterator = listIterator();
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size != 0) {
                K next = listIterator.next();
                i = (i * 31) + (next == null ? 0 : next.hashCode());
                size = i2;
            } else {
                return i;
            }
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        dzrs<K> listIterator = listIterator();
        while (listIterator.hasNext()) {
            K next = listIterator.next();
            if (obj == null) {
                if (next == null) {
                    return listIterator.previousIndex();
                }
            } else if (obj.equals(next)) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        dzrs<K> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            K previous = listIterator.previous();
            if (obj == null) {
                if (previous == null) {
                    return listIterator.nextIndex();
                }
            } else if (obj.equals(previous)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public K remove(int i) {
        throw new UnsupportedOperationException();
    }

    public K set(int i, K k) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dznw, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzrs<K> listIterator = listIterator();
        int size = size();
        sb.append("[");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                K next = listIterator.next();
                if (this == next) {
                    sb.append("(this list)");
                } else {
                    sb.append(String.valueOf(next));
                }
                size = i;
                z = false;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(K k) {
        add(size(), k);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends K> collection) {
        return addAll(size(), collection);
    }
}
