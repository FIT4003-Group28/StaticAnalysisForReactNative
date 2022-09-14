package defpackage;
/* compiled from: PG */
/* renamed from: qwz  reason: default package */
/* loaded from: classes7.dex */
final class qwz extends akvn<aktd> {
    final /* synthetic */ dndr a;
    final /* synthetic */ qxa b;

    public qwz(qxa qxaVar, dndr dndrVar) {
        this.b = qxaVar;
        this.a = dndrVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        ros rosVar;
        ror rorVar;
        aktd aktdVar = (aktd) obj;
        if (this.a == dndr.INFERRED_HOME) {
            rosVar = this.b.b;
            rorVar = ror.INFERRED_HOME;
        } else {
            rosVar = this.b.b;
            rorVar = ror.INFERRED_WORK;
        }
        rosVar.s(dcdc.f(rorVar), false, false);
    }
}
