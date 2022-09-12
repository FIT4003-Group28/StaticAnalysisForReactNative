package defpackage;

import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dclb  reason: default package */
/* loaded from: classes.dex */
public interface dclb<E> extends Collection<E> {
    int a(Object obj);

    @Override // java.util.Collection, defpackage.dclb
    boolean add(E e);

    int b(Object obj, int i);

    @Override // java.util.Collection, defpackage.dclb
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    void f(E e, int i);

    void h(E e);

    boolean i(E e, int i);

    Set<E> j();

    Set<dcla<E>> l();

    @Override // java.util.Collection, defpackage.dclb
    boolean remove(Object obj);

    @Override // java.util.Collection, defpackage.dclb
    int size();
}
