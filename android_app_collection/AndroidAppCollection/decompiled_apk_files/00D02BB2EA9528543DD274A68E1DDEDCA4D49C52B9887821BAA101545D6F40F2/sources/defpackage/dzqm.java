package defpackage;
/* compiled from: PG */
/* renamed from: dzqm  reason: default package */
/* loaded from: classes6.dex */
public final class dzqm extends dzql implements dzrs {
    final /* synthetic */ dzqn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzqm(dzqn dzqnVar) {
        super(dzqnVar);
        this.a = dzqnVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.a.c[a()];
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    public final Object previous() {
        return this.a.c[b()];
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
