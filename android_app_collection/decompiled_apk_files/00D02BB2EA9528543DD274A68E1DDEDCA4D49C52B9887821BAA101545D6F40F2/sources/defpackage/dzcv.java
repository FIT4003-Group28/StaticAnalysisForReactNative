package defpackage;
/* compiled from: PG */
/* renamed from: dzcv  reason: default package */
/* loaded from: classes6.dex */
public final class dzcv<T> extends dzcp<T, T> {
    final dyzz c;

    public dzcv(dyzs<T> dyzsVar, dyzz dyzzVar) {
        super(dyzsVar);
        this.c = dyzzVar;
    }

    @Override // defpackage.dyzs
    public final void b(eavl<? super T> eavlVar) {
        dyzy a = this.c.a();
        dzcu dzcuVar = new dzcu(eavlVar, a, this.b);
        eavlVar.b(dzcuVar);
        a.b(dzcuVar);
    }
}
