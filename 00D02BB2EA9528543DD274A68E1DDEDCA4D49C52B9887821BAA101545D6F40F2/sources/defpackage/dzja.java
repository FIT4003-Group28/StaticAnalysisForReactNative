package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzja  reason: default package */
/* loaded from: classes6.dex */
public final class dzja extends dzje implements dzkf {
    final /* synthetic */ dzjg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzja(dzjg dzjgVar) {
        super(dzjgVar);
        this.a = dzjgVar;
    }

    @Override // defpackage.dzkd
    public final int a() {
        return this.a.a[c()];
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzkb
    public final int b() {
        return this.a.a[d()];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(this.a.a[c()]);
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    @Deprecated
    public final /* bridge */ /* synthetic */ Object previous() {
        return Integer.valueOf(this.a.a[d()]);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final /* bridge */ /* synthetic */ void set(Integer num) {
        throw new UnsupportedOperationException();
    }
}
