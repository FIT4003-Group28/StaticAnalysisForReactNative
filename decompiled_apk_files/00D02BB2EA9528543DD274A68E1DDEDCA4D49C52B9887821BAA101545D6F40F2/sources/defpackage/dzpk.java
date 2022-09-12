package defpackage;
/* compiled from: PG */
/* renamed from: dzpk  reason: default package */
/* loaded from: classes6.dex */
final class dzpk extends dzoc {
    final /* synthetic */ dzpp a;

    public dzpk(dzpp dzppVar) {
        this.a = dzppVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn iterator() {
        return new dzpj(this.a);
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
        dzpp dzppVar = this.a;
        int i = dzppVar.g;
        dzppVar.b(obj);
        return this.a.g != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.g;
    }
}
