package defpackage;
/* compiled from: PG */
/* renamed from: dzjf  reason: default package */
/* loaded from: classes.dex */
public final class dzjf extends dzje implements dzrs {
    final /* synthetic */ dzjg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzjf(dzjg dzjgVar) {
        super(dzjgVar);
        this.a = dzjgVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.a.b[c()];
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    public final Object previous() {
        return this.a.b[d()];
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
