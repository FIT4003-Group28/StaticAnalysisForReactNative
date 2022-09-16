package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ayws  reason: default package */
/* loaded from: classes2.dex */
abstract class ayws extends azoa {
    private static final long serialVersionUID = -2252972430506210021L;
    Iterator a;
    volatile boolean b;
    boolean c;

    public ayws(Iterator it) {
        this.a = it;
    }

    public abstract void b();

    @Override // defpackage.ayrn
    public final void d() {
        this.a = null;
    }

    public abstract void f(long j);

    @Override // defpackage.ayrn
    public final boolean j() {
        Iterator it = this.a;
        return it == null || !it.hasNext();
    }

    @Override // defpackage.bamf
    public final void si() {
        this.b = true;
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return i & 1;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.a.next();
        ayrd.b(next, "Iterator.next() returned a null value");
        return next;
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (!azof.h(j) || ayno.a(this, j) != 0) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            b();
        } else {
            f(j);
        }
    }
}
