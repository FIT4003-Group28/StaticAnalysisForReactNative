package defpackage;

import java.util.Collection;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: dcbr  reason: default package */
/* loaded from: classes.dex */
public abstract class dcbr<E> extends dcbh<E> implements Queue<E> {
    @Override // defpackage.dcbh
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Queue<E> c();

    @Override // java.util.Queue
    public final E element() {
        return c().element();
    }

    public boolean offer(E e) {
        return c().offer(e);
    }

    @Override // java.util.Queue
    public final E peek() {
        return c().peek();
    }

    @Override // java.util.Queue
    public final E poll() {
        return c().poll();
    }

    @Override // java.util.Queue
    public final E remove() {
        return c().remove();
    }
}
