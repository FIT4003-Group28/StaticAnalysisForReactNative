package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: PG */
/* renamed from: dzhy  reason: default package */
/* loaded from: classes.dex */
public abstract class dzhy<V> extends dzhx<V> implements dzju<V> {
    private static final long serialVersionUID = -1773560792952436569L;

    @Override // defpackage.dzhx, java.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return u();
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer firstKey() {
        return Integer.valueOf(p());
    }

    @Override // defpackage.dzhx
    @Deprecated
    public final /* bridge */ /* synthetic */ dzrv g() {
        return u();
    }

    @Override // defpackage.dzhx, java.util.Map
    /* renamed from: h */
    public dzkh keySet() {
        throw null;
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedMap headMap(Integer num) {
        return v();
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer lastKey() {
        return Integer.valueOf(q());
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedMap subMap(Integer num, Integer num2) {
        return w();
    }

    @Override // java.util.SortedMap
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Integer num) {
        return x();
    }

    @Override // defpackage.dzhx, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
