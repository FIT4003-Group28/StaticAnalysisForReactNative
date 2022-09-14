package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcbh  reason: default package */
/* loaded from: classes.dex */
public abstract class dcbh<E> extends dcbq implements Collection<E> {
    @Override // defpackage.dcbq
    protected /* bridge */ /* synthetic */ Object SC() {
        throw null;
    }

    public boolean add(E e) {
        return b().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return b().addAll(collection);
    }

    protected abstract Collection<E> b();

    public void clear() {
        b().clear();
    }

    public boolean contains(Object obj) {
        return b().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return b().containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d(Collection<?> collection) {
        return dcgh.e(iterator(), collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object[] e() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    public Iterator<E> iterator() {
        return b().iterator();
    }

    public boolean remove(Object obj) {
        return b().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return b().removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return b().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return b().size();
    }

    public Object[] toArray() {
        return b().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return (T[]) b().toArray(tArr);
    }
}
