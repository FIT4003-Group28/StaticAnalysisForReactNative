package defpackage;

import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzrw  reason: default package */
/* loaded from: classes6.dex */
public final class dzrw<K> extends dzrk<K> implements Serializable, Cloneable, dzrv {
    private static final long serialVersionUID = -7046029254386353129L;

    private Object readResolve() {
        return dzrx.a;
    }

    public final Object clone() {
        return dzrx.a;
    }

    @Override // defpackage.dzrk, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }
}
