package defpackage;
/* compiled from: PG */
/* renamed from: amxx  reason: default package */
/* loaded from: classes.dex */
public final class amxx extends amuk {
    static final amuk a = new amxx(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public amxx(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.amuk, defpackage.amub
    public final int b(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // defpackage.amub
    public final int d() {
        return this.c;
    }

    @Override // defpackage.amub
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aqxo.G(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.amub
    public final boolean l() {
        return false;
    }

    @Override // defpackage.amub
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
