package defpackage;

import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dzky  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzky extends dzkx implements dzni {
    @Override // defpackage.dzkx, defpackage.dzkr, defpackage.dzmy
    public /* bridge */ /* synthetic */ dzna a() {
        throw null;
    }

    @Override // defpackage.dzkx, defpackage.dzkr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: f */
    public abstract dzmx iterator();

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ Long first() {
        return Long.valueOf(h());
    }

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedSet<Long> headSet(Long l) {
        return j();
    }

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ Long last() {
        return Long.valueOf(i());
    }

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedSet<Long> subSet(Long l, Long l2) {
        return k();
    }

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedSet<Long> tailSet(Long l) {
        return l();
    }
}
