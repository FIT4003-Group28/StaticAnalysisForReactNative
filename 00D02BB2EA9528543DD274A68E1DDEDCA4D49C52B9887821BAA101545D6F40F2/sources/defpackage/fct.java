package defpackage;
/* compiled from: PG */
/* renamed from: fct  reason: default package */
/* loaded from: classes6.dex */
final class fct<T> implements dzsj<T> {
    final /* synthetic */ fcu a;
    private final int b;

    public fct(fcu fcuVar, int i) {
        this.a = fcuVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fcu fcuVar = this.a;
            return (T) new yos(fcuVar.a.eW.il(), fcuVar.a.eS(), fcuVar.a.eW.lH());
        }
        fcu fcuVar2 = this.a;
        ftt fttVar = fcuVar2.a;
        return (T) new yon(fttVar.eV, fttVar.eW.il(), fcuVar2.a.eS());
    }
}
