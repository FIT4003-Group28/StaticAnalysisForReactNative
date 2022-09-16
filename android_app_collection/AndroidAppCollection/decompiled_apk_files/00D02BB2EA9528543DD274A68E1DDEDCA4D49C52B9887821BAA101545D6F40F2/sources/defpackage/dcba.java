package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: dcba  reason: default package */
/* loaded from: classes.dex */
public final class dcba<E> extends dcbr<E> implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final Queue<E> b;

    private dcba(int i) {
        dbsk.e(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    public static <E> dcba<E> a(int i) {
        return new dcba<>(i);
    }

    @Override // defpackage.dcbh, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.b;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        dbsk.s(e);
        if (this.a == 0) {
            return true;
        }
        if (size() == this.a) {
            this.b.remove();
        }
        this.b.add(e);
        return true;
    }

    @Override // defpackage.dcbh, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.a) {
            return dcgh.g(this, collection.iterator());
        }
        clear();
        return dcft.h(this, dcft.u(collection, size - this.a));
    }

    @Override // defpackage.dcbr, defpackage.dcbh
    protected final /* bridge */ /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.dcbr
    protected final Queue<E> c() {
        return this.b;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Queue<E> queue = this.b;
        dbsk.s(obj);
        return queue.contains(obj);
    }

    @Override // defpackage.dcbr, java.util.Queue
    public final boolean offer(E e) {
        add(e);
        return true;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Queue<E> queue = this.b;
        dbsk.s(obj);
        return queue.remove(obj);
    }
}
