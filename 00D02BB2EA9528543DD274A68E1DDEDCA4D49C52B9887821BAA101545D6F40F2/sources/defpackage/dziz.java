package defpackage;
/* compiled from: PG */
/* renamed from: dziz  reason: default package */
/* loaded from: classes.dex */
public final class dziz extends dzje implements dzrs<dzjh> {
    final dzjc a;
    final /* synthetic */ dzjg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dziz(dzjg dzjgVar) {
        super(dzjgVar);
        this.b = dzjgVar;
        this.a = new dzjc(dzjgVar);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        dzjh dzjhVar = (dzjh) obj;
        dzje.e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.a.a = c();
        return this.a;
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    public final /* bridge */ /* synthetic */ Object previous() {
        this.a.a = d();
        return this.a;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        dzjh dzjhVar = (dzjh) obj;
        dzje.f();
    }
}
