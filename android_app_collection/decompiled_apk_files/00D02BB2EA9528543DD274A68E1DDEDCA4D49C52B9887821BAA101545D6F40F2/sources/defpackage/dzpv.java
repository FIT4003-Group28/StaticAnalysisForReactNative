package defpackage;
/* compiled from: PG */
/* renamed from: dzpv  reason: default package */
/* loaded from: classes6.dex */
final class dzpv extends dzoc {
    final /* synthetic */ dzqa a;

    public dzpv(dzqa dzqaVar) {
        this.a = dzqaVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn iterator() {
        return new dzpu(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        dzqa dzqaVar = this.a;
        int i = dzqaVar.g;
        dzqaVar.b(obj);
        return this.a.g != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.g;
    }
}
