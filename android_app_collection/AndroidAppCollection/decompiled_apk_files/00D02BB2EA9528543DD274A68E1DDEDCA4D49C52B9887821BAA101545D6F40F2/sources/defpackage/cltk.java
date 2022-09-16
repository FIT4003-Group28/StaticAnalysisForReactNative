package defpackage;

import defpackage.cltf;
import defpackage.cltg;
import defpackage.clti;
import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: cltk  reason: default package */
/* loaded from: classes5.dex */
public abstract class cltk<I extends cltg, O extends clti, E extends cltf> implements cltd<I, O, E> {
    public final I[] b;
    public final O[] c;
    public int e;
    private final Thread f;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;
    public final Object a = new Object();
    private final ArrayDeque<I> g = new ArrayDeque<>();
    private final ArrayDeque<O> h = new ArrayDeque<>();
    public int d = 2;

    /* JADX INFO: Access modifiers changed from: protected */
    public cltk(I[] iArr, O[] oArr) {
        this.b = iArr;
        for (int i = 0; i < this.d; i++) {
            this.b[i] = (cmgd) h();
        }
        this.c = oArr;
        this.e = 2;
        for (int i2 = 0; i2 < this.e; i2++) {
            this.c[i2] = (cmge) i();
        }
        cltj cltjVar = new cltj(this);
        this.f = cltjVar;
        cltjVar.start();
    }

    private final boolean m() {
        return !this.g.isEmpty() && this.e > 0;
    }

    private final void n(I i) {
        i.clear();
        I[] iArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = (cmgd) i;
    }

    private final void r() {
        E e = this.j;
        if (e == null) {
            return;
        }
        throw e;
    }

    @Override // defpackage.cltd
    public final /* bridge */ /* synthetic */ Object a() {
        I i;
        synchronized (this.a) {
            r();
            cmmn.c(this.i == null);
            int i2 = this.d;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.b;
                int i3 = i2 - 1;
                this.d = i3;
                i = iArr[i3];
            }
            this.i = i;
        }
        return i;
    }

    @Override // defpackage.cltd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (this.a) {
            r();
            cmmn.a(obj == this.i);
            this.g.addLast(obj);
            f();
            this.i = null;
        }
    }

    @Override // defpackage.cltd
    public final /* bridge */ /* synthetic */ Object c() {
        synchronized (this.a) {
            r();
            if (this.h.isEmpty()) {
                return null;
            }
            return this.h.removeFirst();
        }
    }

    @Override // defpackage.cltd
    public final void d() {
        synchronized (this.a) {
            this.k = true;
            this.m = 0;
            I i = this.i;
            if (i != null) {
                n(i);
                this.i = null;
            }
            while (!this.g.isEmpty()) {
                n(this.g.removeFirst());
            }
            while (!this.h.isEmpty()) {
                this.h.removeFirst().release();
            }
        }
    }

    @Override // defpackage.cltd
    public final void e() {
        synchronized (this.a) {
            this.l = true;
            this.a.notify();
        }
        try {
            this.f.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void f() {
        if (m()) {
            this.a.notify();
        }
    }

    public final boolean g() {
        E j;
        synchronized (this.a) {
            while (!this.l && !m()) {
                this.a.wait();
            }
            if (this.l) {
                return false;
            }
            I removeFirst = this.g.removeFirst();
            O[] oArr = this.c;
            int i = this.e - 1;
            this.e = i;
            O o = oArr[i];
            boolean z = this.k;
            this.k = false;
            if (removeFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                if (removeFirst.isDecodeOnly()) {
                    o.addFlag(Integer.MIN_VALUE);
                }
                try {
                    j = k(removeFirst, o, z);
                } catch (OutOfMemoryError e) {
                    j = j(e);
                } catch (RuntimeException e2) {
                    j = j(e2);
                }
                if (j != null) {
                    synchronized (this.a) {
                        this.j = j;
                    }
                    return false;
                }
            }
            synchronized (this.a) {
                if (this.k) {
                    o.release();
                } else if (o.isDecodeOnly()) {
                    this.m++;
                    o.release();
                } else {
                    o.skippedOutputBufferCount = this.m;
                    this.m = 0;
                    this.h.addLast(o);
                }
                n(removeFirst);
            }
            return true;
        }
    }

    protected abstract I h();

    protected abstract O i();

    protected abstract E j(Throwable th);

    protected abstract E k(I i, O o, boolean z);
}
