package defpackage;
/* compiled from: PG */
/* renamed from: dcmr  reason: default package */
/* loaded from: classes.dex */
public final class dcmr<E> extends dcep<E> {
    public static final dcmr<Object> a = new dcmr<>(new Object[0], 0, null, 0, 0);
    final transient Object[] b;
    final transient Object[] c;
    public final transient int d;
    private final transient int e;
    private final transient int f;

    public dcmr(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
        this.e = i2;
        this.d = i;
        this.f = i3;
    }

    @Override // defpackage.dccr
    public final int A(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.f);
        return i + this.f;
    }

    @Override // defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<E> iterator() {
        return v().listIterator();
    }

    @Override // defpackage.dcep
    public final dcdc<E> SH() {
        return dcdc.C(this.b, this.f);
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return false;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.c;
        if (obj == null || objArr == null) {
            return false;
        }
        int b = dccj.b(obj);
        while (true) {
            int i = b & this.e;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // defpackage.dcep
    public final boolean w() {
        return true;
    }

    @Override // defpackage.dccr
    public final Object[] x() {
        return this.b;
    }

    @Override // defpackage.dccr
    public final int y() {
        return 0;
    }

    @Override // defpackage.dccr
    public final int z() {
        return this.f;
    }
}
