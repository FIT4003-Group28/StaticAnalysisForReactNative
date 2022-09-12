package defpackage;
/* compiled from: PG */
/* renamed from: dcle  reason: default package */
/* loaded from: classes5.dex */
abstract class dcle<E> extends dcnj<dcla<E>> {
    public abstract dclb<E> a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof dcla) {
            dcla dclaVar = (dcla) obj;
            if (dclaVar.b() > 0 && a().a(dclaVar.a()) == dclaVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof dcla) {
            dcla dclaVar = (dcla) obj;
            E e = (E) dclaVar.a();
            int b = dclaVar.b();
            if (b == 0) {
                return false;
            }
            return a().i(e, b);
        }
        return false;
    }
}
