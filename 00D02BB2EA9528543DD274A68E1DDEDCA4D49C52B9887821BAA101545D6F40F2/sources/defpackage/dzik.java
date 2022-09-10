package defpackage;
/* compiled from: PG */
/* renamed from: dzik  reason: default package */
/* loaded from: classes6.dex */
final class dzik extends dzia {
    final /* synthetic */ dzis a;

    public dzik(dzis dzisVar) {
        this.a = dzisVar;
    }

    @Override // defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzkd iterator() {
        return new dzir(this.a);
    }

    @Override // defpackage.dzia
    public final boolean c(int i) {
        return this.a.d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.h;
    }
}
