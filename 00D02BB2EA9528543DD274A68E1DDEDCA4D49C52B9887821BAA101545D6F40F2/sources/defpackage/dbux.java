package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbux  reason: default package */
/* loaded from: classes.dex */
final class dbux extends AbstractQueue<Object> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return dcmr.a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return null;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }
}
