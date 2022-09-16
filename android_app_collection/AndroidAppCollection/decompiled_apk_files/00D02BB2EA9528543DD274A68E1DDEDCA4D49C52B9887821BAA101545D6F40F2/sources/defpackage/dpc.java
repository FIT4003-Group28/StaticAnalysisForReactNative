package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dpc  reason: default package */
/* loaded from: classes6.dex */
public final class dpc implements del<dbsg<dpf>> {
    final /* synthetic */ dpg a;
    private final int b;

    public dpc(dpg dpgVar, int i) {
        this.a = dpgVar;
        this.b = i;
    }

    @Override // defpackage.del
    public final /* bridge */ /* synthetic */ dbsg<dpf> a(dbsg dbsgVar, boolean z) {
        boolean z2;
        dhlb dhlbVar;
        if (dbsgVar.a()) {
            dpg dpgVar = this.a;
            dxp dxpVar = null;
            if (!dph.e(dpgVar.b, dpgVar.f) || (!this.a.a() && ((dfmo) dbsgVar.b()).c.size() <= 0)) {
                z2 = false;
            } else {
                dsrj<dfnb> dsrjVar = ((dfmo) dbsgVar.b()).c;
                if (dsrjVar == null) {
                    StringBuilder sb = new StringBuilder(93);
                    sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
                    sb.append(1);
                    throw new NullPointerException(sb.toString());
                }
                dxpVar = new dxp(dsrjVar);
                z2 = this.a.b(dxpVar);
            }
            dpg dpgVar2 = this.a;
            dem demVar = dpgVar2.g;
            int i = this.b;
            dknv dknvVar = dpgVar2.b.getAugmentedRealityParameters().a;
            if (dknvVar == null) {
                dknvVar = dknv.v;
            }
            if (i - 1 == 0 ? (dhlbVar = dknvVar.m) == null : (dhlbVar = dknvVar.n) == null) {
                dhlbVar = dhlb.e;
            }
            if (z2) {
                dsqp dsqpVar = (dsqp) dhlbVar.cu(5);
                dsqpVar.bC(dhlbVar);
                dhky dhkyVar = (dhky) dsqpVar;
                if (dhkyVar.c) {
                    dhkyVar.bF();
                    dhkyVar.c = false;
                }
                dhlb dhlbVar2 = (dhlb) dhkyVar.b;
                dhlbVar2.b = 1;
                dhlbVar2.a |= 1;
                dhlb dhlbVar3 = (dhlb) dhkyVar.b;
                dhlbVar3.c = 1;
                dhlbVar3.a |= 2;
                dhlbVar = dhkyVar.bK();
            }
            if (demVar.b(dhlbVar, z)) {
                return dbsg.i(new dqv(new dpe(this.a, dbsg.j(dxpVar)), this.b + (-1) != 0 ? dtxj.bI : (!z2 || !this.a.h.a()) ? dtxj.by : dtxj.bQ));
            }
        }
        return dbpy.a;
    }
}
