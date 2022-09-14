package defpackage;
/* compiled from: PG */
/* renamed from: dzqg  reason: default package */
/* loaded from: classes6.dex */
public final class dzqg extends dzql implements dzrs<dzqo> {
    final dzqj a;
    final /* synthetic */ dzqn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzqg(dzqn dzqnVar) {
        super(dzqnVar);
        this.b = dzqnVar;
        this.a = new dzqj(dzqnVar);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        dzqo dzqoVar = (dzqo) obj;
        dzql.c();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.a.a = a();
        return this.a;
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    public final /* bridge */ /* synthetic */ Object previous() {
        this.a.a = b();
        return this.a;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        dzqo dzqoVar = (dzqo) obj;
        dzql.d();
    }
}
