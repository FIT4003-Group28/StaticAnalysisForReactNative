package defpackage;

import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzhp  reason: default package */
/* loaded from: classes6.dex */
public final class dzhp extends dzhj implements Set, Serializable, Cloneable, dzhi {
    private static final long serialVersionUID = -7046029254386353129L;

    private Object readResolve() {
        return dzhq.a;
    }

    public final Object clone() {
        return dzhq.a;
    }

    @Override // defpackage.dzhj, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }
}
