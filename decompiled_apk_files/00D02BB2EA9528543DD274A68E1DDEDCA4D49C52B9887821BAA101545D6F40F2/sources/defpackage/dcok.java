package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dcok  reason: default package */
/* loaded from: classes5.dex */
public class dcok<E> extends dcoj<E> implements List<E> {
    private static final long serialVersionUID = 0;

    public dcok(List<E> list, Object obj) {
        super(list, obj);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        synchronized (this.g) {
            a().add(i, e);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        boolean addAll;
        synchronized (this.g) {
            addAll = a().addAll(i, collection);
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.dcoj
    /* renamed from: b */
    public final List<E> a() {
        return (List) super.a();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    @Override // java.util.List
    public final E get(int i) {
        E e;
        synchronized (this.g) {
            e = a().get(i);
        }
        return e;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.g) {
            indexOf = a().indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.g) {
            lastIndexOf = a().lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return a().listIterator();
    }

    @Override // java.util.List
    public final E remove(int i) {
        E remove;
        synchronized (this.g) {
            remove = a().remove(i);
        }
        return remove;
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        E e2;
        synchronized (this.g) {
            e2 = a().set(i, e);
        }
        return e2;
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        List<E> d;
        synchronized (this.g) {
            d = dcos.d(a().subList(i, i2), this.g);
        }
        return d;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return a().listIterator(i);
    }
}
