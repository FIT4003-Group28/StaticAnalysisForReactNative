package defpackage;
/* compiled from: PG */
/* renamed from: dzjn  reason: default package */
/* loaded from: classes6.dex */
final class dzjn extends dzig {
    final /* synthetic */ dzjs a;

    public dzjn(dzjs dzjsVar) {
        this.a = dzjsVar;
    }

    @Override // defpackage.dzig, defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzkd iterator() {
        return new dzjm(this.a);
    }

    @Override // defpackage.dzia
    public final boolean c(int i) {
        return this.a.d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.dzig
    public final boolean e(int i) {
        dzjs dzjsVar = this.a;
        int i2 = dzjsVar.g;
        dzjsVar.b(i);
        return this.a.g != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.g;
    }
}
