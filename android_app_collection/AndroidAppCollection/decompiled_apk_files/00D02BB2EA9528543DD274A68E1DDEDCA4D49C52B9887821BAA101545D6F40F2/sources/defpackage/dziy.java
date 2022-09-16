package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dziy  reason: default package */
/* loaded from: classes6.dex */
public final class dziy extends dzje implements dzrs<dzjh> {
    final /* synthetic */ dzjg a;
    private dzjc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dziy(dzjg dzjgVar) {
        super(dzjgVar);
        this.a = dzjgVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        dzjh dzjhVar = (dzjh) obj;
        dzje.e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzjc dzjcVar = new dzjc(this.a, c());
        this.b = dzjcVar;
        return dzjcVar;
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    public final /* bridge */ /* synthetic */ Object previous() {
        dzjc dzjcVar = new dzjc(this.a, d());
        this.b = dzjcVar;
        return dzjcVar;
    }

    @Override // defpackage.dzje, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        super.remove();
        this.b.a = -1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        dzjh dzjhVar = (dzjh) obj;
        dzje.f();
    }
}
