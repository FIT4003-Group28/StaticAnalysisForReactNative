package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ayud  reason: default package */
/* loaded from: classes2.dex */
public final class ayud extends AtomicLong implements ayoa, bamf, aypz {
    private static final long serialVersionUID = -7370244972039324525L;
    final bame a;
    final Callable b;
    final int c;
    bamf g;
    boolean h;
    int i;
    public volatile boolean j;
    long k;
    final int d = 1;
    final AtomicBoolean f = new AtomicBoolean();
    final ArrayDeque e = new ArrayDeque();

    public ayud(bame bameVar, int i, Callable callable) {
        this.a = bameVar;
        this.c = i;
        this.b = callable;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.h) {
            azqc.d(th);
            return;
        }
        this.h = true;
        this.e.clear();
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        ArrayDeque arrayDeque = this.e;
        int i = this.i;
        int i2 = i + 1;
        if (i == 0) {
            try {
                arrayDeque.offer(((azoi) this.b).call());
            } catch (Throwable th) {
                bapv.j(th);
                si();
                b(th);
                return;
            }
        }
        Collection collection = (Collection) arrayDeque.peek();
        if (collection != null && collection.size() + 1 == this.c) {
            arrayDeque.poll();
            collection.add(obj);
            this.k++;
            this.a.c(collection);
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).add(obj);
        }
        if (i2 == this.d) {
            i2 = 0;
        }
        this.i = i2;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.g, bamfVar)) {
            this.g = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.j = true;
        this.g.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        long j;
        long j2;
        if (this.h) {
            return;
        }
        this.h = true;
        long j3 = this.k;
        if (j3 != 0) {
            ayno.e(this, j3);
        }
        bame bameVar = this.a;
        ArrayDeque arrayDeque = this.e;
        if (arrayDeque.isEmpty()) {
            bameVar.sm();
        } else if (azos.b(get(), bameVar, arrayDeque, this, this)) {
        } else {
            do {
                j = get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
                j2 = Long.MIN_VALUE | j;
            } while (!compareAndSet(j, j2));
            if (j == 0) {
                return;
            }
            azos.b(j2, bameVar, arrayDeque, this, this);
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        long j2;
        if (azof.h(j)) {
            bame bameVar = this.a;
            ArrayDeque arrayDeque = this.e;
            do {
                j2 = get();
            } while (!compareAndSet(j2, (j2 & Long.MIN_VALUE) | ayno.c(Long.MAX_VALUE & j2, j)));
            if (j2 == Long.MIN_VALUE) {
                azos.b(j | Long.MIN_VALUE, bameVar, arrayDeque, this, this);
            } else if (this.f.get() || !this.f.compareAndSet(false, true)) {
                this.g.sp(ayno.d(this.d, j));
            } else {
                this.g.sp(ayno.c(this.c, ayno.d(this.d, j - 1)));
            }
        }
    }
}
