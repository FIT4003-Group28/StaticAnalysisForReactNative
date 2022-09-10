package defpackage;
/* compiled from: PG */
/* renamed from: dzps  reason: default package */
/* loaded from: classes6.dex */
final class dzps extends dzkr {
    final /* synthetic */ dzqa a;

    public dzps(dzqa dzqaVar) {
        this.a = dzqaVar;
    }

    @Override // defpackage.dzkr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzna iterator() {
        return new dzpz(this.a);
    }

    @Override // defpackage.dzkr, defpackage.dzmy
    public final boolean c(long j) {
        return this.a.d(j);
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
