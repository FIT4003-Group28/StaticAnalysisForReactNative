package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcgc  reason: default package */
/* loaded from: classes5.dex */
public final class dcgc<T> implements Iterator<T> {
    private Iterator<? extends T> a;
    private Iterator<? extends T> b = dcgb.a;
    private Iterator<? extends Iterator<? extends T>> c;
    private Deque<Iterator<? extends Iterator<? extends T>>> d;

    public dcgc(Iterator<? extends Iterator<? extends T>> it) {
        dbsk.s(it);
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator<? extends Iterator<? extends T>> it;
        while (true) {
            Iterator<? extends T> it2 = this.b;
            dbsk.s(it2);
            if (!it2.hasNext()) {
                while (true) {
                    Iterator<? extends Iterator<? extends T>> it3 = this.c;
                    it = null;
                    if (it3 == null || !it3.hasNext()) {
                        Deque<Iterator<? extends Iterator<? extends T>>> deque = this.d;
                        if (deque == null || deque.isEmpty()) {
                            break;
                        }
                        this.c = this.d.removeFirst();
                    } else {
                        it = this.c;
                        break;
                    }
                }
                this.c = it;
                if (it == null) {
                    return false;
                }
                Iterator<? extends T> next = it.next();
                this.b = next;
                if (next instanceof dcgc) {
                    dcgc dcgcVar = (dcgc) next;
                    this.b = dcgcVar.b;
                    if (this.d == null) {
                        this.d = new ArrayDeque();
                    }
                    this.d.addFirst(this.c);
                    if (dcgcVar.d != null) {
                        while (!dcgcVar.d.isEmpty()) {
                            this.d.addFirst(dcgcVar.d.removeLast());
                        }
                    }
                    this.c = dcgcVar.c;
                }
            } else {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            Iterator<? extends T> it = this.b;
            this.a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbzb.c(this.a != null);
        this.a.remove();
        this.a = null;
    }
}
