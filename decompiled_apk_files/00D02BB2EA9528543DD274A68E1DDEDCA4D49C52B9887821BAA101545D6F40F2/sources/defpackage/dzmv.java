package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzmv  reason: default package */
/* loaded from: classes6.dex */
public final class dzmv extends dzkx implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public transient long[] a;
    public int b;

    public dzmv() {
        this.a = dzmw.a;
    }

    private final int g(long j) {
        int i = this.b;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (this.a[i2] == j) {
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
        this.a = new long[this.b];
        for (int i = 0; i < this.b; i++) {
            this.a[i] = objectInputStream.readLong();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeLong(this.a[i]);
        }
    }

    @Override // defpackage.dzkx, defpackage.dzkr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzna iterator() {
        return new dzmu(this);
    }

    @Override // defpackage.dzkr, defpackage.dzmy
    public final boolean b(long j) {
        if (g(j) != -1) {
            return false;
        }
        int i = this.b;
        if (i == this.a.length) {
            long[] jArr = new long[i == 0 ? 2 : i + i];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.a[i2];
                i = i2;
            }
            this.a = jArr;
        }
        long[] jArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        jArr2[i3] = j;
        return true;
    }

    @Override // defpackage.dzkr, defpackage.dzmy
    public final boolean c(long j) {
        return g(j) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.dzkx
    public final boolean e(long j) {
        int g = g(j);
        if (g == -1) {
            return false;
        }
        int i = (this.b - g) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            long[] jArr = this.a;
            int i3 = g + i2;
            jArr[i3] = jArr[i3 + 1];
        }
        this.b--;
        return true;
    }

    /* renamed from: f */
    public final dzmv clone() {
        try {
            dzmv dzmvVar = (dzmv) super.clone();
            dzmvVar.a = (long[]) this.a.clone();
            return dzmvVar;
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

    public dzmv(long[] jArr, int i) {
        this.a = jArr;
        this.b = i;
        int length = jArr.length;
        if (i <= length) {
            return;
        }
        throw new IllegalArgumentException("The provided size (" + i + ") is larger than or equal to the array size (" + length + ")");
    }
}
