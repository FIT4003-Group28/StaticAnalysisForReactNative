package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: aooy  reason: default package */
/* loaded from: classes.dex */
public final class aooy extends aonn implements RandomAccess, aopp, aorc {
    public static final aooy b;
    private float[] c;
    private int d;

    static {
        aooy aooyVar = new aooy(new float[0], 0);
        b = aooyVar;
        aooyVar.b();
    }

    public aooy() {
        this(new float[10], 0);
    }

    private final String i(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void j(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        sg();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        float[] fArr = this.c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.c, i, fArr2, i + 1, this.d - i);
            this.c = fArr2;
        }
        this.c[i] = floatValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.aonn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        sg();
        aopv.h(collection);
        if (!(collection instanceof aooy)) {
            return super.addAll(collection);
        }
        aooy aooyVar = (aooy) collection;
        int i = aooyVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.c;
            if (i3 > fArr.length) {
                this.c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(aooyVar.c, 0, this.c, this.d, aooyVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.aopp
    public final float d(int i) {
        j(i);
        return this.c[i];
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aooy)) {
            return super.equals(obj);
        }
        aooy aooyVar = (aooy) obj;
        if (this.d != aooyVar.d) {
            return false;
        }
        float[] fArr = aooyVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aopp
    public final float f(int i, float f) {
        sg();
        j(i);
        float[] fArr = this.c;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // defpackage.aopu
    /* renamed from: g */
    public final aopp e(int i) {
        if (i >= this.d) {
            return new aooy(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(d(i));
    }

    @Override // defpackage.aopp
    public final void h(float f) {
        sg();
        int i = this.d;
        float[] fArr = this.c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.c = fArr2;
        }
        float[] fArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        sg();
        j(i);
        float[] fArr = this.c;
        float f = fArr[i];
        if (i < this.d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        sg();
        if (i2 >= i) {
            float[] fArr = this.c;
            System.arraycopy(fArr, i2, fArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return Float.valueOf(f(i, ((Float) obj).floatValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public aooy(float[] fArr, int i) {
        this.c = fArr;
        this.d = i;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}
