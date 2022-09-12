package defpackage;

import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcbs  reason: default package */
/* loaded from: classes.dex */
public abstract class dcbs<E> extends dcbh<E> implements Set<E> {
    protected abstract Set<E> a();

    @Override // defpackage.dcbh
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c(Collection<?> collection) {
        dbsk.s(collection);
        return dcnm.v(this, collection);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || a().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return a().hashCode();
    }
}
