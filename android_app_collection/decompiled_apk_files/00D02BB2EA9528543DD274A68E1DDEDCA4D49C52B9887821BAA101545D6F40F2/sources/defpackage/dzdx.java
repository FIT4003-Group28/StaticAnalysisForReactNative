package defpackage;
/* compiled from: PG */
/* renamed from: dzdx  reason: default package */
/* loaded from: classes6.dex */
public final class dzdx<T> extends dzaa<T> {
    final dzac<? extends T> a;
    final dyzz b;

    public dzdx(dzac<? extends T> dzacVar, dyzz dyzzVar) {
        this.a = dzacVar;
        this.b = dyzzVar;
    }

    @Override // defpackage.dzaa
    protected final void g(dzab<? super T> dzabVar) {
        dzdw dzdwVar = new dzdw(dzabVar, this.a);
        dzabVar.a(dzdwVar);
        dzbd.f(dzdwVar.b, this.b.b(dzdwVar));
    }
}
