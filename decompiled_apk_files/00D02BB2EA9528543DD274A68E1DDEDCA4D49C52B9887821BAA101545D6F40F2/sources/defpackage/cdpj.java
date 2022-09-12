package defpackage;
/* compiled from: PG */
/* renamed from: cdpj  reason: default package */
/* loaded from: classes4.dex */
class cdpj extends dbrh<dnmx, dhzb> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dnmx b(dhzb dhzbVar) {
        dhzb dhzbVar2 = dhzbVar;
        dnmw bZ = dnmx.e.bZ();
        if ((dhzbVar2.a & 1) != 0) {
            int i = dhzbVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnmx dnmxVar = (dnmx) bZ.b;
            dnmxVar.a |= 1;
            dnmxVar.b = i;
        }
        if ((dhzbVar2.a & 2) != 0) {
            String str = dhzbVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnmx dnmxVar2 = (dnmx) bZ.b;
            str.getClass();
            dnmxVar2.a |= 2;
            dnmxVar2.c = str;
        }
        if ((dhzbVar2.a & 4) != 0) {
            boolean z = dhzbVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnmx dnmxVar3 = (dnmx) bZ.b;
            dnmxVar3.a |= 4;
            dnmxVar3.d = z;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhzb c(dnmx dnmxVar) {
        dnmx dnmxVar2 = dnmxVar;
        dhza bZ = dhzb.e.bZ();
        if ((dnmxVar2.a & 1) != 0) {
            int i = dnmxVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhzb dhzbVar = (dhzb) bZ.b;
            dhzbVar.a |= 1;
            dhzbVar.b = i;
        }
        if ((dnmxVar2.a & 2) != 0) {
            String str = dnmxVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhzb dhzbVar2 = (dhzb) bZ.b;
            str.getClass();
            dhzbVar2.a |= 2;
            dhzbVar2.c = str;
        }
        if ((dnmxVar2.a & 4) != 0) {
            boolean z = dnmxVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhzb dhzbVar3 = (dhzb) bZ.b;
            dhzbVar3.a |= 4;
            dhzbVar3.d = z;
        }
        return bZ.bK();
    }
}
