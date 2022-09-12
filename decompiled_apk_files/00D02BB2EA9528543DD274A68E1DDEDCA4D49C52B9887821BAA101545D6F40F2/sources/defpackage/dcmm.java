package defpackage;
/* compiled from: PG */
/* renamed from: dcmm  reason: default package */
/* loaded from: classes.dex */
final class dcmm extends dcdc<Object> {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public dcmm(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dbsk.z(i, this.c);
        return this.a[i + i + this.b];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
