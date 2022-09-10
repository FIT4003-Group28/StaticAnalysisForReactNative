package defpackage;
/* compiled from: PG */
/* renamed from: dcmi  reason: default package */
/* loaded from: classes.dex */
public final class dcmi<E> extends dcdc<E> {
    static final dcdc<Object> a = new dcmi(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public dcmi(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.dcdc, defpackage.dccr
    public final int A(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i) {
        dbsk.z(i, this.c);
        return (E) this.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
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
        return this.c;
    }
}
