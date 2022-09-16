package defpackage;
/* compiled from: PG */
/* renamed from: amyb  reason: default package */
/* loaded from: classes.dex */
final class amyb extends amuk {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public amyb(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aqxo.G(i, this.c);
        Object obj = this.a[i + i + this.b];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.amub
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
