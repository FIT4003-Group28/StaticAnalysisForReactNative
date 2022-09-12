package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: PG */
/* renamed from: dzkp  reason: default package */
/* loaded from: classes.dex */
public abstract class dzkp<V> extends dzko<V> implements dzmr<V> {
    private static final long serialVersionUID = -1773560792952436569L;

    @Override // defpackage.dzko, defpackage.dzmg
    public /* bridge */ /* synthetic */ dznf e() {
        throw null;
    }

    @Override // defpackage.dzko, java.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return u();
    }

    @Override // defpackage.dzko, defpackage.dzmg
    public dzrj<V> f() {
        throw null;
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ Long firstKey() {
        return Long.valueOf(p());
    }

    @Override // defpackage.dzko
    @Deprecated
    public final /* bridge */ /* synthetic */ dzrv g() {
        return u();
    }

    @Override // defpackage.dzko, java.util.Map
    /* renamed from: h */
    public dzni keySet() {
        throw null;
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedMap headMap(Long l) {
        return w();
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ Long lastKey() {
        return Long.valueOf(q());
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedMap subMap(Long l, Long l2) {
        return x();
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Long l) {
        return y();
    }

    @Override // defpackage.dzko, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
