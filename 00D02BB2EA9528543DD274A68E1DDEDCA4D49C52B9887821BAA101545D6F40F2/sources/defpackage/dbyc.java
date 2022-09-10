package defpackage;

import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbyc  reason: default package */
/* loaded from: classes.dex */
final class dbyc extends dbxy implements Set {
    final /* synthetic */ dbye f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbyc(dbye dbyeVar, Object obj, Set set) {
        super(dbyeVar, obj, set, null);
        this.f = dbyeVar;
    }

    @Override // defpackage.dbxy, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean v = dcnm.v((Set) this.b, collection);
        if (v) {
            dbye.B(this.f, this.b.size() - size);
            b();
        }
        return v;
    }
}
