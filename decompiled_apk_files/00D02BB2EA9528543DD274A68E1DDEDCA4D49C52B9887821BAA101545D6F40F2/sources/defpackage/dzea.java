package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: PG */
/* renamed from: dzea  reason: default package */
/* loaded from: classes6.dex */
public final class dzea<T> implements dzbp<T> {
    static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    final int c;
    long d;
    final int e;
    AtomicReferenceArray<Object> f;
    final int g;
    AtomicReferenceArray<Object> h;
    final AtomicLong b = new AtomicLong();
    final AtomicLong i = new AtomicLong();

    public dzea(int i) {
        int a2 = dzfu.a(Math.max(8, i));
        int i2 = a2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a2 + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        this.c = Math.min(a2 / 4, a);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = i2 - 1;
        a(0L);
    }

    private final void a(long j2) {
        this.b.lazySet(j2);
    }

    private final void b(long j2) {
        this.i.lazySet(j2);
    }

    private final void c(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i) {
        atomicReferenceArray.lazySet(i, t);
        a(j2 + 1);
    }

    @Override // defpackage.dzbq
    public final boolean SO() {
        return this.b.get() == this.i.get();
    }

    @Override // defpackage.dzbp, defpackage.dzbq
    public final T SP() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long j2 = this.i.get();
        int i = this.g;
        int i2 = ((int) j2) & i;
        T t = (T) atomicReferenceArray.get(i2);
        Object obj = j;
        if (t != null) {
            if (t != obj) {
                atomicReferenceArray.lazySet(i2, null);
                b(j2 + 1);
                return t;
            }
        } else if (obj != null) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.h = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            b(j2 + 1);
        }
        return t2;
    }

    @Override // defpackage.dzbq
    public final void f() {
        while (true) {
            if (SP() == null && SO()) {
                return;
            }
        }
    }

    @Override // defpackage.dzbq
    public final void g(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f;
            long j2 = this.b.get();
            int i = this.e;
            int i2 = ((int) j2) & i;
            if (j2 < this.d) {
                c(atomicReferenceArray, t, j2, i2);
                return;
            }
            long j3 = this.c + j2;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                this.d = j3 - 1;
                c(atomicReferenceArray, t, j2, i2);
                return;
            }
            long j4 = 1 + j2;
            if (atomicReferenceArray.get(((int) j4) & i) == null) {
                c(atomicReferenceArray, t, j2, i2);
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.f = atomicReferenceArray2;
            this.d = (j2 + i) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, j);
            a(j4);
            return;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
