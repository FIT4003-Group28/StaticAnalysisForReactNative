package defpackage;
/* compiled from: PG */
/* renamed from: dzln  reason: default package */
/* loaded from: classes6.dex */
final class dzln extends dzkx {
    final /* synthetic */ dzls a;

    public dzln(dzls dzlsVar) {
        this.a = dzlsVar;
    }

    @Override // defpackage.dzkx, defpackage.dzkr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzna iterator() {
        return new dzlm(this.a);
    }

    @Override // defpackage.dzkr, defpackage.dzmy
    public final boolean c(long j) {
        return this.a.f(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.dzkx
    public final boolean e(long j) {
        dzls dzlsVar = this.a;
        int i = dzlsVar.h;
        dzlsVar.b(j);
        return this.a.h != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }
}
