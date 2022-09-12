package defpackage;
/* compiled from: PG */
/* renamed from: dzol  reason: default package */
/* loaded from: classes6.dex */
final class dzol extends dzgw {
    final /* synthetic */ dzot a;

    public dzol(dzot dzotVar) {
        this.a = dzotVar;
    }

    @Override // defpackage.dzgw
    public final boolean a(boolean z) {
        return this.a.d(z);
    }

    @Override // defpackage.dzgw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: b */
    public final dzos iterator() {
        return new dzos(this.a);
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
