package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dzjw  reason: default package */
/* loaded from: classes6.dex */
public final class dzjw extends dzie implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353130L;
    public transient int[] a;
    public int b;

    public dzjw() {
        this(16);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = new int[this.b];
        for (int i = 0; i < this.b; i++) {
            this.a[i] = objectInputStream.readInt();
        }
    }

    private final void v(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        int length = iArr.length;
        if (i > length) {
            long j = length;
            int[] iArr2 = new int[(int) Math.max(Math.min(j + j, 2147483639L), i)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            iArr = iArr2;
        }
        this.a = iArr;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeInt(this.a[i]);
        }
    }

    @Override // defpackage.dzie, defpackage.dzia, defpackage.dzke
    public final boolean b(int i) {
        v(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
        return true;
    }

    @Override // defpackage.dzie, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        dzjw dzjwVar = new dzjw(this.b);
        System.arraycopy(this.a, 0, dzjwVar.a, 0, this.b);
        dzjwVar.b = this.b;
        return dzjwVar;
    }

    @Override // defpackage.dzia
    public final boolean d(int i) {
        int o = o(i);
        if (o == -1) {
            return false;
        }
        g(o);
        return true;
    }

    @Override // defpackage.dzie, defpackage.dzke
    public final void e(int i, int i2) {
        l(i);
        v(this.b + 1);
        int i3 = this.b;
        if (i != i3) {
            int[] iArr = this.a;
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        }
        this.a[i] = i2;
        this.b++;
    }

    @Override // defpackage.dzke
    public final int f(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
        }
        return this.a[i];
    }

    @Override // defpackage.dzie, defpackage.dzke
    public final int g(int i) {
        int i2 = this.b;
        if (i < i2) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            int i4 = i2 - 1;
            this.b = i4;
            if (i != i4) {
                System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
    }

    @Override // defpackage.dzie, defpackage.dzke
    public final int h(int i, int i2) {
        if (i < this.b) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            iArr[i] = i2;
            return i3;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
    }

    @Override // defpackage.dzie, defpackage.dzke
    public final void i(int i, int i2) {
        dzgs.a(this.b, i, i2);
        int[] iArr = this.a;
        System.arraycopy(iArr, i2, iArr, i, this.b - i2);
        this.b -= i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.dzie
    public final dzkf j(int i) {
        l(i);
        return new dzjv(this, i);
    }

    @Override // defpackage.dzie, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.dzie
    public final int o(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i == this.a[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.dzie
    public final int p(int i) {
        int i2 = this.b;
        while (true) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i == this.a[i3]) {
                    return i3;
                }
                i2 = i3;
            } else {
                return -1;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int i;
        int[] iArr = this.a;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!collection.contains(Integer.valueOf(iArr[i2]))) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        if (i != i3) {
            z = true;
        }
        this.b = i3;
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    public dzjw(int i) {
        if (i >= 0) {
            this.a = new int[i];
            return;
        }
        throw new IllegalArgumentException("Initial capacity (" + i + ") is negative");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dzjw(defpackage.dzke r5) {
        /*
            r4 = this;
            dzjw r5 = (defpackage.dzjw) r5
            int r0 = r5.b
            r4.<init>(r0)
            int[] r0 = r4.a
            int r1 = r5.b
            r4.b = r1
            int r2 = r0.length
            if (r1 < 0) goto L3d
            if (r1 > r2) goto L19
            int[] r5 = r5.a
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r1)
            return
        L19:
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Last index ("
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ") is greater than array length ("
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Length ("
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ") is negative"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzjw.<init>(dzke):void");
    }
}
