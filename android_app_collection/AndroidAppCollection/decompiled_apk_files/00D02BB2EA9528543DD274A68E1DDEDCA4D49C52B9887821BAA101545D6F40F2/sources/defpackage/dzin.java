package defpackage;
/* compiled from: PG */
/* renamed from: dzin  reason: default package */
/* loaded from: classes6.dex */
final class dzin extends dzig {
    final /* synthetic */ dzis a;

    public dzin(dzis dzisVar) {
        this.a = dzisVar;
    }

    @Override // defpackage.dzig, defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzkd iterator() {
        return new dzim(this.a);
    }

    @Override // defpackage.dzia
    public final boolean c(int i) {
        return this.a.e(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.dzig
    public final boolean e(int i) {
        dzis dzisVar = this.a;
        int i2 = dzisVar.h;
        dzisVar.b(i);
        return this.a.h != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }
}
