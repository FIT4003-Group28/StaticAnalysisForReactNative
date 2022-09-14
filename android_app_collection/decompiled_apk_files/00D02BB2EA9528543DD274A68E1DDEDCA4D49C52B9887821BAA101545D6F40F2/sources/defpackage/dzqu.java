package defpackage;
/* compiled from: PG */
/* renamed from: dzqu  reason: default package */
/* loaded from: classes6.dex */
final class dzqu extends dzoc {
    final /* synthetic */ dzqz a;

    public dzqu(dzqz dzqzVar) {
        this.a = dzqzVar;
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn iterator() {
        return new dzqt(this.a);
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
        dzqz dzqzVar = this.a;
        int i = dzqzVar.h;
        dzqzVar.remove(obj);
        return this.a.h != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }
}
