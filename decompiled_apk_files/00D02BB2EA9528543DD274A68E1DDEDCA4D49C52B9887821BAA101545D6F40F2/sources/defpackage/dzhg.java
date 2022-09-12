package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzhg  reason: default package */
/* loaded from: classes6.dex */
public final class dzhg extends dzhe implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public transient double[] a;
    public int b;

    public dzhg() {
        double[] dArr = dzhh.a;
        throw null;
    }

    private final int g(double d) {
        int i = this.b;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (Double.doubleToLongBits(this.a[i2]) == Double.doubleToLongBits(d)) {
                    return i2;
                }
                i = i2;
            } else {
                return -1;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = new double[this.b];
        for (int i = 0; i < this.b; i++) {
            this.a[i] = objectInputStream.readDouble();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeDouble(this.a[i]);
        }
    }

    @Override // defpackage.dzhe, defpackage.dzhb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzhl iterator() {
        return new dzhf(this);
    }

    @Override // defpackage.dzhb
    public final boolean b(double d) {
        if (g(d) != -1) {
            return false;
        }
        int i = this.b;
        if (i == this.a.length) {
            double[] dArr = new double[i == 0 ? 2 : i + i];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                dArr[i2] = this.a[i2];
                i = i2;
            }
            this.a = dArr;
        }
        double[] dArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        dArr2[i3] = d;
        return true;
    }

    @Override // defpackage.dzhb
    public final boolean c(double d) {
        return g(d) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.dzhe
    public final boolean e(double d) {
        int g = g(d);
        if (g == -1) {
            return false;
        }
        int i = (this.b - g) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            double[] dArr = this.a;
            int i3 = g + i2;
            dArr[i3] = dArr[i3 + 1];
        }
        this.b--;
        return true;
    }

    /* renamed from: f */
    public final dzhg clone() {
        try {
            dzhg dzhgVar = (dzhg) super.clone();
            dzhgVar.a = (double[]) this.a.clone();
            return dzhgVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    public dzhg(double[] dArr, int i) {
        this.a = dArr;
        this.b = i;
        int length = dArr.length;
        if (i <= length) {
            return;
        }
        throw new IllegalArgumentException("The provided size (" + i + ") is larger than or equal to the array size (" + length + ")");
    }
}
