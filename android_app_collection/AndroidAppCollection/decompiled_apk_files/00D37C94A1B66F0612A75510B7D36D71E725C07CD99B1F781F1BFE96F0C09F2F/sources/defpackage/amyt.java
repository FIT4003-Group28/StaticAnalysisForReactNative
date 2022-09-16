package defpackage;
/* compiled from: PG */
/* renamed from: amyt  reason: default package */
/* loaded from: classes.dex */
public final class amyt extends amvn {
    final transient Object a;
    private transient int b;

    public amyt(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.amvn
    public final boolean a() {
        return this.b != 0;
    }

    @Override // defpackage.amub
    public final int b(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.amvn
    public final amuk h() {
        return amuk.r(this.a);
    }

    @Override // defpackage.amvn, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int hashCode = this.a.hashCode();
            this.b = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.amvn, defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amzs iterator() {
        return new amwb(this.a);
    }

    @Override // defpackage.amub
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public amyt(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }
}
