package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcoj  reason: default package */
/* loaded from: classes5.dex */
public class dcoj<E> extends dcoo implements Collection<E> {
    private static final long serialVersionUID = 0;

    public dcoj(Collection<E> collection, Object obj) {
        super(collection, obj);
    }

    public Collection<E> a() {
        return (Collection) this.f;
    }

    @Override // java.util.Collection
    public final boolean add(E e) {
        boolean add;
        synchronized (this.g) {
            add = a().add(e);
        }
        return add;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        boolean addAll;
        synchronized (this.g) {
            addAll = a().addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.g) {
            a().clear();
        }
    }

    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.g) {
            contains = a().contains(obj);
        }
        return contains;
    }

    public boolean containsAll(Collection<?> collection) {
        boolean containsAll;
        synchronized (this.g) {
            containsAll = a().containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.g) {
            isEmpty = a().isEmpty();
        }
        return isEmpty;
    }

    public Iterator<E> iterator() {
        return a().iterator();
    }

    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.g) {
            remove = a().remove(obj);
        }
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean removeAll;
        synchronized (this.g) {
            removeAll = a().removeAll(collection);
        }
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean retainAll;
        synchronized (this.g) {
            retainAll = a().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.g) {
            size = a().size();
        }
        return size;
    }

    public Object[] toArray() {
        Object[] array;
        synchronized (this.g) {
            array = a().toArray();
        }
        return array;
    }

    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.g) {
            tArr2 = (T[]) a().toArray(tArr);
        }
        return tArr2;
    }
}
