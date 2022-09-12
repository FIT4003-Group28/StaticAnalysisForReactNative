package defpackage;

import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dzih  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzih extends dzig implements dzkh {
    @Override // defpackage.dzig, defpackage.dzia
    public /* bridge */ /* synthetic */ dzkd a() {
        throw null;
    }

    @Override // defpackage.dzig, defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: f */
    public abstract dzkb iterator();

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer first() {
        return Integer.valueOf(h());
    }

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedSet<Integer> headSet(Integer num) {
        return j();
    }

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer last() {
        return Integer.valueOf(i());
    }

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedSet<Integer> subSet(Integer num, Integer num2) {
        return k();
    }

    @Override // java.util.SortedSet
    @Deprecated
    public final /* bridge */ /* synthetic */ SortedSet<Integer> tailSet(Integer num) {
        return l();
    }
}
