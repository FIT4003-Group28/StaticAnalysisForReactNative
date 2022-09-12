package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbzs  reason: default package */
/* loaded from: classes5.dex */
final class dbzs<E> extends dbzp<E> {
    private transient int[] c;
    private transient int[] d;
    private transient int e;
    private transient int f;

    public dbzs() {
    }

    public static <E> dbzs<E> n(int i) {
        return new dbzs<>(i);
    }

    private final int o(int i) {
        return this.c[i] - 1;
    }

    @Override // defpackage.dbzp
    public final void b(int i) {
        super.b(i);
        this.e = -2;
        this.f = -2;
    }

    @Override // defpackage.dbzp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (c()) {
            return;
        }
        this.e = -2;
        this.f = -2;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.d, 0, size(), 0);
        }
        super.clear();
    }

    @Override // defpackage.dbzp
    public final int d() {
        int d = super.d();
        this.c = new int[d];
        this.d = new int[d];
        return d;
    }

    @Override // defpackage.dbzp
    public final Set<E> f() {
        Set<E> f = super.f();
        this.c = null;
        this.d = null;
        return f;
    }

    @Override // defpackage.dbzp
    public final void h(int i, E e, int i2, int i3) {
        super.h(i, e, i2, i3);
        p(this.f, i);
        p(i, -2);
    }

    @Override // defpackage.dbzp
    public final void i(int i) {
        super.i(i);
        this.c = Arrays.copyOf(this.c, i);
        this.d = Arrays.copyOf(this.d, i);
    }

    @Override // defpackage.dbzp
    public final void j(int i, int i2) {
        int size = size() - 1;
        super.j(i, i2);
        p(o(i), l(i));
        if (i < size) {
            p(o(size), i);
            p(i, l(size));
        }
        this.c[size] = 0;
        this.d[size] = 0;
    }

    @Override // defpackage.dbzp
    public final int k() {
        return this.e;
    }

    @Override // defpackage.dbzp
    public final int l(int i) {
        return this.d[i] - 1;
    }

    @Override // defpackage.dbzp
    public final int m(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // defpackage.dbzp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return dclq.f(this);
    }

    public dbzs(int i) {
        super(i);
    }

    private final void p(int i, int i2) {
        if (i == -2) {
            this.e = i2;
            i = -2;
        } else {
            this.d[i] = i2 + 1;
        }
        if (i2 == -2) {
            this.f = i;
        } else {
            this.c[i2] = i + 1;
        }
    }

    @Override // defpackage.dbzp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) dclq.e(this, tArr);
    }
}
