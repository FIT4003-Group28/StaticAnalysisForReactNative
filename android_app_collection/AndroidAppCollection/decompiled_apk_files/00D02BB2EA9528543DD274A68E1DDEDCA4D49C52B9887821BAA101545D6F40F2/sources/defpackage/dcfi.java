package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcfi  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcfi<E> extends dcep<E> {
    @Override // defpackage.dccr
    public final int A(Object[] objArr, int i) {
        return v().A(objArr, i);
    }

    @Override // defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public dcpd<E> iterator() {
        return v().listIterator();
    }

    @Override // defpackage.dcep
    public final dcdc<E> SH() {
        return new dcfh(this);
    }

    public abstract E b(int i);
}
