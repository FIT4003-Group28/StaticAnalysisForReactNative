package defpackage;
/* compiled from: PG */
/* renamed from: dzdk  reason: default package */
/* loaded from: classes6.dex */
public final class dzdk<T> extends dzcw<T, T> {
    final dyzz b;
    final int c;

    public dzdk(dyzv<T> dyzvVar, dyzz dyzzVar, int i) {
        super(dyzvVar);
        this.b = dyzzVar;
        this.c = i;
    }

    @Override // defpackage.dyzu
    protected final void g(dyzw<? super T> dyzwVar) {
        dyzz dyzzVar = this.b;
        if (dyzzVar instanceof dzfg) {
            this.a.f(dyzwVar);
            return;
        }
        this.a.f(new dzdj(dyzwVar, dyzzVar.a(), this.c));
    }
}
