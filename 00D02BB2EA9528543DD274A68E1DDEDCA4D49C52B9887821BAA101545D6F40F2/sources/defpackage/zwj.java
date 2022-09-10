package defpackage;
/* compiled from: PG */
/* renamed from: zwj  reason: default package */
/* loaded from: classes7.dex */
final class zwj implements cpve<zwg, Double> {
    @Override // defpackage.cpve
    public final /* bridge */ /* synthetic */ Double a(zwg zwgVar, int i, cpvi<zwg, ?> cpviVar) {
        dpfn dpfnVar;
        zwf zwfVar = ((zwn) cpviVar.g(zwn.c)).d;
        int a = dpfl.a(zwgVar.b.c);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        return Double.valueOf(((i2 == 2 || i2 == 3 || i2 == 4) && !zwfVar.c) ? dcyn.a : dpfnVar.b);
    }
}
