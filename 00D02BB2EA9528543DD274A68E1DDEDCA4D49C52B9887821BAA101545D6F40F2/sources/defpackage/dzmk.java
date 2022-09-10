package defpackage;
/* compiled from: PG */
/* renamed from: dzmk  reason: default package */
/* loaded from: classes6.dex */
final class dzmk extends dzkx {
    final /* synthetic */ dzmp a;

    public dzmk(dzmp dzmpVar) {
        this.a = dzmpVar;
    }

    @Override // defpackage.dzkx, defpackage.dzkr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final dzna iterator() {
        return new dzmj(this.a);
    }

    @Override // defpackage.dzkr, defpackage.dzmy
    public final boolean c(long j) {
        return this.a.d(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.dzkx
    public final boolean e(long j) {
        dzmp dzmpVar = this.a;
        int i = dzmpVar.g;
        dzmpVar.b(j);
        return this.a.g != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.g;
    }
}
