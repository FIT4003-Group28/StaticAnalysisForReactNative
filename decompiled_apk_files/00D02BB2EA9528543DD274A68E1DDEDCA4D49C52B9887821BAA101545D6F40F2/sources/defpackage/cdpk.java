package defpackage;
/* compiled from: PG */
/* renamed from: cdpk  reason: default package */
/* loaded from: classes4.dex */
class cdpk extends dbrh<dnmz, dhzd> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dnmz b(dhzd dhzdVar) {
        dhzd dhzdVar2 = dhzdVar;
        dnmy bZ = dnmz.c.bZ();
        if ((dhzdVar2.a & 1) != 0) {
            int a = dpxm.a(dhzdVar2.b);
            if (a == 0) {
                a = 1;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnmz dnmzVar = (dnmz) bZ.b;
            dnmzVar.b = a - 1;
            dnmzVar.a |= 1;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhzd c(dnmz dnmzVar) {
        dnmz dnmzVar2 = dnmzVar;
        dhzc bZ = dhzd.c.bZ();
        if ((dnmzVar2.a & 1) != 0) {
            int a = dpxm.a(dnmzVar2.b);
            if (a == 0) {
                a = 1;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhzd dhzdVar = (dhzd) bZ.b;
            dhzdVar.b = a - 1;
            dhzdVar.a |= 1;
        }
        return bZ.bK();
    }
}
