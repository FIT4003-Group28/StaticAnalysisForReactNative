package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: debz  reason: default package */
/* loaded from: classes6.dex */
public final class debz extends AbstractList<Byte> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;
    final int b;
    final int c;

    public debz(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Byte) && deca.a(this.a, ((Byte) obj).byteValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof debz) {
            debz debzVar = (debz) obj;
            int size = size();
            if (debzVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] != debzVar.a[debzVar.b + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        dbsk.z(i, size());
        return Byte.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Byte) || (a = deca.a(this.a, ((Byte) obj).byteValue(), this.b, this.c)) < 0) {
            return -1;
        }
        return a - this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Byte) {
            byte[] bArr = this.a;
            byte byteValue = ((Byte) obj).byteValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                } else if (bArr[i2] == byteValue) {
                    break;
                } else {
                    i2--;
                }
            }
            if (i2 >= 0) {
                return i2 - this.b;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Byte b = (Byte) obj;
        dbsk.z(i, size());
        byte[] bArr = this.a;
        int i2 = this.b + i;
        byte b2 = bArr[i2];
        dbsk.s(b);
        bArr[i2] = b.byteValue();
        return Byte.valueOf(b2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<Byte> subList(int i, int i2) {
        dbsk.u(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        return new debz(bArr, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        sb.append((int) this.a[this.b]);
        int i = this.b;
        while (true) {
            i++;
            if (i < this.c) {
                sb.append(", ");
                sb.append((int) this.a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
