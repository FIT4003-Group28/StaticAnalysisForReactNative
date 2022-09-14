package c.e.a.b.d.g;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class x4 extends p3<Float> implements k5<Float>, v6, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private float[] f4514c;

    /* renamed from: d  reason: collision with root package name */
    private int f4515d;

    static {
        new x4(new float[0], 0).j();
    }

    x4() {
        this(new float[10], 0);
    }

    private x4(float[] fArr, int i) {
        this.f4514c = fArr;
        this.f4515d = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.f4515d) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.f4515d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // c.e.a.b.d.g.k5
    public final /* synthetic */ k5<Float> a(int i) {
        if (i >= this.f4515d) {
            return new x4(Arrays.copyOf(this.f4514c, i), this.f4515d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(float f2) {
        a();
        int i = this.f4515d;
        float[] fArr = this.f4514c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f4514c = fArr2;
        }
        float[] fArr3 = this.f4514c;
        int i2 = this.f4515d;
        this.f4515d = i2 + 1;
        fArr3[i2] = f2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.f4515d)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        float[] fArr = this.f4514c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f4514c, i, fArr2, i + 1, this.f4515d - i);
            this.f4514c = fArr2;
        }
        this.f4514c[i] = floatValue;
        this.f4515d++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        e5.a(collection);
        if (!(collection instanceof x4)) {
            return super.addAll(collection);
        }
        x4 x4Var = (x4) collection;
        int i = x4Var.f4515d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4515d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f4514c;
        if (i3 > fArr.length) {
            this.f4514c = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(x4Var.f4514c, 0, this.f4514c, this.f4515d, x4Var.f4515d);
        this.f4515d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return super.equals(obj);
        }
        x4 x4Var = (x4) obj;
        if (this.f4515d != x4Var.f4515d) {
            return false;
        }
        float[] fArr = x4Var.f4514c;
        for (int i = 0; i < this.f4515d; i++) {
            if (Float.floatToIntBits(this.f4514c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Float.valueOf(this.f4514c[i]);
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4515d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f4514c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4514c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        a();
        b(i);
        float[] fArr = this.f4514c;
        float f2 = fArr[i];
        if (i < this.f4515d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f4515d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f4515d; i++) {
            if (obj.equals(Float.valueOf(this.f4514c[i]))) {
                float[] fArr = this.f4514c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f4515d - i) - 1);
                this.f4515d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            float[] fArr = this.f4514c;
            System.arraycopy(fArr, i2, fArr, i, this.f4515d - i2);
            this.f4515d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        b(i);
        float[] fArr = this.f4514c;
        float f2 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4515d;
    }
}
