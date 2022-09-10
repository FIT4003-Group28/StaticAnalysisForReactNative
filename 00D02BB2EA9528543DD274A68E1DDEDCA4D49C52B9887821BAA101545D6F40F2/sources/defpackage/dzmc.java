package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzmc  reason: default package */
/* loaded from: classes6.dex */
public final class dzmc extends dzmb implements dzrs {
    final /* synthetic */ dzmd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzmc(dzmd dzmdVar) {
        super(dzmdVar);
        this.a = dzmdVar;
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
