package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amsp  reason: default package */
/* loaded from: classes.dex */
final class amsp extends AbstractCollection {
    final /* synthetic */ amsq a;

    public amsp(amsq amsqVar) {
        this.a = amsqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        amsq amsqVar = this.a;
        Map l = amsqVar.l();
        if (l != null) {
            return l.values().iterator();
        }
        return new amsk(amsqVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
