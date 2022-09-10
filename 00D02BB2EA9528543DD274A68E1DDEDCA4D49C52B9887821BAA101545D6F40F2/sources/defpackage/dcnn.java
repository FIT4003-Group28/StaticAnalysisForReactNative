package defpackage;
/* compiled from: PG */
/* renamed from: dcnn  reason: default package */
/* loaded from: classes.dex */
public final class dcnn<E> extends dcep<E> {
    final transient E a;
    private transient int b;

    public dcnn(E e) {
        dbsk.s(e);
        this.a = e;
    }

    @Override // defpackage.dccr
    public final int A(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<E> iterator() {
        return new dcga(this.a);
    }

    @Override // defpackage.dcep
    public final dcdc<E> SH() {
        return dcdc.f(this.a);
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return false;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int hashCode = this.a.hashCode();
            this.b = hashCode;
            return hashCode;
        }
        return i;
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

    @Override // defpackage.dcep
    public final boolean w() {
        return this.b != 0;
    }

    public dcnn(E e, int i) {
        this.a = e;
        this.b = i;
    }
}
