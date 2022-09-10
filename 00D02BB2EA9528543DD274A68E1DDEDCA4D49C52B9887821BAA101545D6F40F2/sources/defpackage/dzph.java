package defpackage;
/* compiled from: PG */
/* renamed from: dzph  reason: default package */
/* loaded from: classes6.dex */
final class dzph extends dzia {
    final /* synthetic */ dzpp a;

    public dzph(dzpp dzppVar) {
        this.a = dzppVar;
    }

    @Override // defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzkd iterator() {
        return new dzpo(this.a);
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
        return this.a.g;
    }
}
