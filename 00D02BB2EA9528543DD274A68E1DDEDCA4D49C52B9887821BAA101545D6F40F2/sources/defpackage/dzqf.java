package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzqf  reason: default package */
/* loaded from: classes6.dex */
public final class dzqf extends dzql implements dzrs<dzqo> {
    final /* synthetic */ dzqn a;
    private dzqj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzqf(dzqn dzqnVar) {
        super(dzqnVar);
        this.a = dzqnVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        dzqo dzqoVar = (dzqo) obj;
        dzql.c();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzqj dzqjVar = new dzqj(this.a, a());
        this.b = dzqjVar;
        return dzqjVar;
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    public final /* bridge */ /* synthetic */ Object previous() {
        dzqj dzqjVar = new dzqj(this.a, b());
        this.b = dzqjVar;
        return dzqjVar;
    }

    @Override // defpackage.dzql, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        super.remove();
        this.b.a = -1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        dzqo dzqoVar = (dzqo) obj;
        dzql.d();
    }
}
