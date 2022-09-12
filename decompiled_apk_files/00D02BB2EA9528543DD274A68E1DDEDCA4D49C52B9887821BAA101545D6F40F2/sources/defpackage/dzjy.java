package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzjy  reason: default package */
/* loaded from: classes6.dex */
public final class dzjy extends dzig implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public transient int[] a;
    public int b;

    public dzjy() {
        int[] iArr = dzka.a;
        throw null;
    }

    private final int g(int i) {
        int i2 = this.b;
        while (true) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (this.a[i3] == i) {
                    return i3;
                }
                i2 = i3;
            } else {
                return -1;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = new int[this.b];
        for (int i = 0; i < this.b; i++) {
            this.a[i] = objectInputStream.readInt();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeInt(this.a[i]);
        }
    }

    @Override // defpackage.dzig, defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzkd iterator() {
        return new dzjx(this);
    }

    @Override // defpackage.dzia, defpackage.dzke
    public final boolean b(int i) {
        if (g(i) != -1) {
            return false;
        }
        int i2 = this.b;
        if (i2 == this.a.length) {
            int[] iArr = new int[i2 == 0 ? 2 : i2 + i2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.a[i3];
                i2 = i3;
            }
            this.a = iArr;
        }
        int[] iArr2 = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        iArr2[i4] = i;
        return true;
    }

    @Override // defpackage.dzia
    public final boolean c(int i) {
        return g(i) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.dzig
    public final boolean e(int i) {
        int g = g(i);
        if (g == -1) {
            return false;
        }
        int i2 = (this.b - g) - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr = this.a;
            int i4 = g + i3;
            iArr[i4] = iArr[i4 + 1];
        }
        this.b--;
        return true;
    }

    /* renamed from: f */
    public final dzjy clone() {
        try {
            dzjy dzjyVar = (dzjy) super.clone();
            dzjyVar.a = (int[]) this.a.clone();
            return dzjyVar;
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

    public dzjy(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
        int length = iArr.length;
        if (i <= length) {
            return;
        }
        throw new IllegalArgumentException("The provided size (" + i + ") is larger than or equal to the array size (" + length + ")");
    }
}
