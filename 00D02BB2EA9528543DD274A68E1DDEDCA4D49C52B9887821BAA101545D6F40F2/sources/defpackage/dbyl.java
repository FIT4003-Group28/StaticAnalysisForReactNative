package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbyl  reason: default package */
/* loaded from: classes5.dex */
final class dbyl extends dbyk implements Set<Map.Entry> {
    public dbyl(dbyn dbynVar) {
        super(dbynVar);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return dcnm.s(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return dcnm.r(this);
    }
}
