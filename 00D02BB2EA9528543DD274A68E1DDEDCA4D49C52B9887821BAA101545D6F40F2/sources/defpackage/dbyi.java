package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbyi  reason: default package */
/* loaded from: classes.dex */
abstract class dbyi<E> extends dbyq<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient dcls<E> a;
    transient long b;

    public dbyi() {
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        g();
        for (int i = 0; i < readInt; i++) {
            f(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(l().size());
        for (dcla<E> dclaVar : l()) {
            objectOutputStream.writeObject(dclaVar.a());
            objectOutputStream.writeInt(dclaVar.b());
        }
    }

    @Override // defpackage.dclb
    public final int a(Object obj) {
        return this.a.j(obj);
    }

    @Override // defpackage.dbyq, defpackage.dclb
    public final int b(Object obj, int i) {
        dbsk.e(true, "occurrences cannot be negative: %s", i);
        int i2 = this.a.i(obj);
        if (i2 == -1) {
            return 0;
        }
        int d = this.a.d(i2);
        if (d > i) {
            this.a.e(i2, d - i);
        } else {
            this.a.l(i2);
            i = d;
        }
        this.b -= i;
        return d;
    }

    @Override // defpackage.dbyq
    public final Iterator<E> c() {
        return new dbyf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        dcls<E> dclsVar = this.a;
        dclsVar.d++;
        Arrays.fill(dclsVar.a, 0, dclsVar.c, (Object) null);
        Arrays.fill(dclsVar.b, 0, dclsVar.c, 0);
        Arrays.fill(dclsVar.e, -1);
        Arrays.fill(dclsVar.f, -1L);
        dclsVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.dbyq
    public final Iterator<dcla<E>> d() {
        return new dbyg(this);
    }

    @Override // defpackage.dbyq
    public final int e() {
        return this.a.c;
    }

    @Override // defpackage.dbyq, defpackage.dclb
    public final void f(E e, int i) {
        if (i == 0) {
            a(e);
            return;
        }
        boolean z = true;
        dbsk.e(i > 0, "occurrences cannot be negative: %s", i);
        int i2 = this.a.i(e);
        if (i2 == -1) {
            this.a.n(e, i);
            this.b += i;
            return;
        }
        long j = i;
        long d = this.a.d(i2) + j;
        if (d > 2147483647L) {
            z = false;
        }
        dbsk.f(z, "too many occurrences: %s", d);
        this.a.e(i2, (int) d);
        this.b += j;
    }

    public abstract void g();

    @Override // defpackage.dbyq, defpackage.dclb
    public final void h(E e) {
        dbzb.d(0, "count");
        this.b += -this.a.k(e, dccj.b(e));
    }

    @Override // defpackage.dbyq, defpackage.dclb
    public final boolean i(E e, int i) {
        dbzb.d(i, "oldCount");
        dbzb.d(0, "newCount");
        int i2 = this.a.i(e);
        if (i2 == -1) {
            return i == 0;
        } else if (this.a.d(i2) != i) {
            return false;
        } else {
            this.a.l(i2);
            this.b -= i;
            return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return dclh.b(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.dclb
    public final int size() {
        return decl.b(this.b);
    }
}
