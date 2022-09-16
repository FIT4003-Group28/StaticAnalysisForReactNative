package defpackage;
/* compiled from: PG */
/* renamed from: dzow  reason: default package */
/* loaded from: classes6.dex */
final class dzow extends dzhr {
    final /* synthetic */ dzpe a;

    public dzow(dzpe dzpeVar) {
        this.a = dzpeVar;
    }

    @Override // defpackage.dzhr
    public final boolean a(float f) {
        return this.a.d(f);
    }

    @Override // defpackage.dzhr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: b */
    public final dzpd iterator() {
        return new dzpd(this.a);
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
