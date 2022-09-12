package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: dcbk  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcbk<E> extends dcbh<E> implements List<E> {
    protected abstract List<E> a();

    @Override // java.util.List
    public void add(int i, E e) {
        a().add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return a().addAll(i, collection);
    }

    @Override // defpackage.dcbh
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || a().equals(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        return a().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return a().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return a().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return a().listIterator();
    }

    @Override // java.util.List
    public final E remove(int i) {
        return a().remove(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return a().set(i, e);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return a().subList(i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return a().listIterator(i);
    }
}
