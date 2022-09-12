package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: asbe  reason: default package */
/* loaded from: classes2.dex */
final class asbe implements degu<List<dcdc<pns>>> {
    final /* synthetic */ asbf a;

    public asbe(asbf asbfVar) {
        this.a = asbfVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.f();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<dcdc<pns>> list) {
        dccx F = dcdc.F();
        for (dcdc<pns> dcdcVar : list) {
            F.i(dcdcVar);
        }
        this.a.a.a = F.f();
        this.a.e();
    }
}
