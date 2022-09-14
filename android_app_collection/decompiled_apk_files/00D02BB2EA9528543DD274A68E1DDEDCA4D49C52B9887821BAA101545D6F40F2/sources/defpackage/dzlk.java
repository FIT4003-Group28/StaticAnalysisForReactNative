package defpackage;
/* compiled from: PG */
/* renamed from: dzlk  reason: default package */
/* loaded from: classes6.dex */
final class dzlk extends dzia {
    final /* synthetic */ dzls a;

    public dzlk(dzls dzlsVar) {
        this.a = dzlsVar;
    }

    @Override // defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzkd iterator() {
        return new dzlr(this.a);
    }

    @Override // defpackage.dzia
    public final boolean c(int i) {
        return this.a.e(i);
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
