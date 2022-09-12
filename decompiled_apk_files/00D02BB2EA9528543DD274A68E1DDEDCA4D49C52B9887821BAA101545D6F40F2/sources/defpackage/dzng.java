package defpackage;

import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzng  reason: default package */
/* loaded from: classes6.dex */
public final class dzng extends dzmz implements Serializable, Cloneable, dznf {
    private static final long serialVersionUID = -7046029254386353129L;

    private Object readResolve() {
        return dznh.a;
    }

    public final Object clone() {
        return dznh.a;
    }

    @Override // defpackage.dzmz, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }
}
