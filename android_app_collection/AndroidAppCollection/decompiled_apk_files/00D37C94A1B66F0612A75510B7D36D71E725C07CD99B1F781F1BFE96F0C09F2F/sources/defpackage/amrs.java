package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amrs  reason: default package */
/* loaded from: classes.dex */
public abstract class amrs extends amrw implements Serializable {
    private static final long serialVersionUID = 0;
    transient amxq a = g();
    transient long b;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        this.a = g();
        for (int i = 0; i < readInt; i++) {
            f(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(j().size());
        for (amxk amxkVar : j()) {
            objectOutputStream.writeObject(amxkVar.a);
            objectOutputStream.writeInt(amxkVar.a());
        }
    }

    @Override // defpackage.amxj
    public final int a(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.amrw
    public final int b() {
        return this.a.c;
    }

    @Override // defpackage.amrw, defpackage.amxj
    public final int c(Object obj, int i) {
        aqxo.s(true, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        if (d == -1) {
            return 0;
        }
        int c = this.a.c(d);
        if (c > i) {
            this.a.j(d, c - i);
        } else {
            this.a.f(d);
            i = c;
        }
        this.b -= i;
        return c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        amxq amxqVar = this.a;
        amxqVar.d++;
        Arrays.fill(amxqVar.a, 0, amxqVar.c, (Object) null);
        Arrays.fill(amxqVar.b, 0, amxqVar.c, 0);
        Arrays.fill(amxqVar.e, -1);
        Arrays.fill(amxqVar.f, -1L);
        amxqVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.amrw
    public final Iterator d() {
        return new amrp(this);
    }

    @Override // defpackage.amrw
    public final Iterator e() {
        return new amrq(this);
    }

    @Override // defpackage.amrw, defpackage.amxj
    public final void f(Object obj, int i) {
        if (i == 0) {
            a(obj);
            return;
        }
        boolean z = true;
        aqxo.s(i > 0, "occurrences cannot be negative: %s", i);
        int d = this.a.d(obj);
        if (d == -1) {
            this.a.l(obj, i);
            this.b += i;
            return;
        }
        long j = i;
        long c = this.a.c(d) + j;
        if (c > 2147483647L) {
            z = false;
        }
        aqxo.t(z, "too many occurrences: %s", c);
        this.a.j(d, (int) c);
        this.b += j;
    }

    public abstract amxq g();

    @Override // defpackage.amrw, defpackage.amxj
    public final boolean h(Object obj, int i) {
        araa.v(i, "oldCount");
        araa.v(0, "newCount");
        int d = this.a.d(obj);
        if (d == -1) {
            return i == 0;
        } else if (this.a.c(d) != i) {
            return false;
        } else {
            this.a.f(d);
            this.b -= i;
            return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new amxn(this, j().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.amxj
    public final int size() {
        return almu.v(this.b);
    }
}
