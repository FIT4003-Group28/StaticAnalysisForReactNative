package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcoi  reason: default package */
/* loaded from: classes5.dex */
final class dcoi<V> extends dcoj<Collection<V>> {
    private static final long serialVersionUID = 0;

    public dcoi(Collection<Collection<V>> collection, Object obj) {
        super(collection, obj);
    }

    @Override // defpackage.dcoj, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Collection<V>> iterator() {
        return new dcoh(this, super.iterator());
    }
}
