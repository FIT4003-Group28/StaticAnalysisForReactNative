package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deck  reason: default package */
/* loaded from: classes.dex */
public final class deck extends AbstractList<Integer> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final int[] a;
    final int b;
    final int c;

    public deck(int[] iArr, int i, int i2) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && decl.e(this.a, ((Integer) obj).intValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof deck) {
            deck deckVar = (deck) obj;
            int size = size();
            if (deckVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] != deckVar.a[deckVar.b + i]) {
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
        return Integer.valueOf(this.a[this.b + i]);
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
        int e;
        if (!(obj instanceof Integer) || (e = decl.e(this.a, ((Integer) obj).intValue(), this.b, this.c)) < 0) {
            return -1;
        }
        return e - this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.a;
            int intValue = ((Integer) obj).intValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == intValue) {
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
        Integer num = (Integer) obj;
        dbsk.z(i, size());
        int[] iArr = this.a;
        int i2 = this.b + i;
        int i3 = iArr[i2];
        dbsk.s(num);
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<Integer> subList(int i, int i2) {
        dbsk.u(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.a;
        int i3 = this.b;
        return new deck(iArr, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        sb.append(this.a[this.b]);
        int i = this.b;
        while (true) {
            i++;
            if (i < this.c) {
                sb.append(", ");
                sb.append(this.a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
