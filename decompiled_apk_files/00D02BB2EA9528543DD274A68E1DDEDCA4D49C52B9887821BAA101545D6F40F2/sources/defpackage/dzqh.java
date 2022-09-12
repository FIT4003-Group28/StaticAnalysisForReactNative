package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzqh  reason: default package */
/* loaded from: classes6.dex */
public final class dzqh extends dzql implements dzrs {
    final /* synthetic */ dzqn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzqh(dzqn dzqnVar) {
        super(dzqnVar);
        this.a = dzqnVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.a.b[a()];
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    public final Object previous() {
        return this.a.b[b()];
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
