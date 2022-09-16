package defpackage;

import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbzz  reason: default package */
/* loaded from: classes5.dex */
final class dbzz extends dcbs {
    final /* synthetic */ Set a;

    public dbzz(Set set) {
        this.a = set;
    }

    @Override // defpackage.dcbh, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.a;
    }

    @Override // defpackage.dcbs
    protected final Set a() {
        return this.a;
    }

    @Override // defpackage.dcbs, defpackage.dcbh
    protected final /* bridge */ /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return obj != null && dbze.b(this.a, obj);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return dbze.e(this, collection);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return obj != null && dbze.c(this.a, obj);
    }

    @Override // defpackage.dcbh, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        return c(collection);
    }
}
