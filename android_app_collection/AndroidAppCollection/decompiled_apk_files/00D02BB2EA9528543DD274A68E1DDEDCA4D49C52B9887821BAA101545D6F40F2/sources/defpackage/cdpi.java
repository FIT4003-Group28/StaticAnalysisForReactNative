package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdpi  reason: default package */
/* loaded from: classes4.dex */
public class cdpi extends dbrh<dnna, dhze> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dnna b(dhze dhzeVar) {
        dhze dhzeVar2 = dhzeVar;
        dnmv bZ = dnna.m.bZ();
        if ((dhzeVar2.a & 1) != 0) {
            dbrh<dhzb, dnmx> k = cdpq.d().k();
            dhzb dhzbVar = dhzeVar2.b;
            if (dhzbVar == null) {
                dhzbVar = dhzb.e;
            }
            dnmx NV = k.NV(dhzbVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar = (dnna) bZ.b;
            NV.getClass();
            dnnaVar.h = NV;
            dnnaVar.a |= 64;
        }
        if ((dhzeVar2.a & 2) != 0) {
            int i = dhzeVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar2 = (dnna) bZ.b;
            dnnaVar2.a |= 128;
            dnnaVar2.i = i;
        }
        if ((dhzeVar2.a & 4) != 0) {
            int i2 = dhzeVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar3 = (dnna) bZ.b;
            dnnaVar3.a |= 512;
            dnnaVar3.j = i2;
        }
        if ((dhzeVar2.a & 8) != 0) {
            String str = dhzeVar2.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar4 = (dnna) bZ.b;
            str.getClass();
            dnnaVar4.a |= 8;
            dnnaVar4.e = str;
        }
        if ((dhzeVar2.a & 16) != 0) {
            String str2 = dhzeVar2.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar5 = (dnna) bZ.b;
            str2.getClass();
            dnnaVar5.a |= 1;
            dnnaVar5.b = str2;
        }
        if ((dhzeVar2.a & 32) != 0) {
            String str3 = dhzeVar2.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar6 = (dnna) bZ.b;
            str3.getClass();
            dnnaVar6.a |= 2;
            dnnaVar6.c = str3;
        }
        if ((dhzeVar2.a & 64) != 0) {
            dreg dregVar = dhzeVar2.h;
            if (dregVar == null) {
                dregVar = dreg.c;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar7 = (dnna) bZ.b;
            dregVar.getClass();
            dnnaVar7.d = dregVar;
            dnnaVar7.a |= 4;
        }
        if ((dhzeVar2.a & 128) != 0) {
            String str4 = dhzeVar2.i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar8 = (dnna) bZ.b;
            str4.getClass();
            dnnaVar8.a |= 16;
            dnnaVar8.f = str4;
        }
        if ((dhzeVar2.a & 256) != 0) {
            String str5 = dhzeVar2.j;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar9 = (dnna) bZ.b;
            str5.getClass();
            dnnaVar9.a |= 32;
            dnnaVar9.g = str5;
        }
        if ((dhzeVar2.a & 512) != 0) {
            dbrh<dhzd, dnmz> k2 = cdpq.e().k();
            dhzd dhzdVar = dhzeVar2.k;
            if (dhzdVar == null) {
                dhzdVar = dhzd.c;
            }
            dnmz NV2 = k2.NV(dhzdVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnna dnnaVar10 = (dnna) bZ.b;
            NV2.getClass();
            dnnaVar10.k = NV2;
            dnnaVar10.a |= 1024;
        }
        dsrj<drek> dsrjVar = dhzeVar2.l;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnna dnnaVar11 = (dnna) bZ.b;
        dsrj<drek> dsrjVar2 = dnnaVar11.l;
        if (!dsrjVar2.a()) {
            dnnaVar11.l = dsqw.cl(dsrjVar2);
        }
        dsod.bv(dsrjVar, dnnaVar11.l);
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhze c(dnna dnnaVar) {
        dnna dnnaVar2 = dnnaVar;
        dhyz bZ = dhze.m.bZ();
        if ((dnnaVar2.a & 1) != 0) {
            String str = dnnaVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar = (dhze) bZ.b;
            str.getClass();
            dhzeVar.a |= 16;
            dhzeVar.f = str;
        }
        if ((dnnaVar2.a & 2) != 0) {
            String str2 = dnnaVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar2 = (dhze) bZ.b;
            str2.getClass();
            dhzeVar2.a |= 32;
            dhzeVar2.g = str2;
        }
        if ((dnnaVar2.a & 4) != 0) {
            dreg dregVar = dnnaVar2.d;
            if (dregVar == null) {
                dregVar = dreg.c;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar3 = (dhze) bZ.b;
            dregVar.getClass();
            dhzeVar3.h = dregVar;
            dhzeVar3.a |= 64;
        }
        if ((dnnaVar2.a & 8) != 0) {
            String str3 = dnnaVar2.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar4 = (dhze) bZ.b;
            str3.getClass();
            dhzeVar4.a |= 8;
            dhzeVar4.e = str3;
        }
        if ((dnnaVar2.a & 16) != 0) {
            String str4 = dnnaVar2.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar5 = (dhze) bZ.b;
            str4.getClass();
            dhzeVar5.a |= 128;
            dhzeVar5.i = str4;
        }
        if ((dnnaVar2.a & 32) != 0) {
            String str5 = dnnaVar2.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar6 = (dhze) bZ.b;
            str5.getClass();
            dhzeVar6.a |= 256;
            dhzeVar6.j = str5;
        }
        if ((dnnaVar2.a & 64) != 0) {
            dbrh<dnmx, dhzb> d = cdpq.d();
            dnmx dnmxVar = dnnaVar2.h;
            if (dnmxVar == null) {
                dnmxVar = dnmx.e;
            }
            dhzb NV = d.NV(dnmxVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar7 = (dhze) bZ.b;
            NV.getClass();
            dhzeVar7.b = NV;
            dhzeVar7.a |= 1;
        }
        if ((dnnaVar2.a & 128) != 0) {
            int i = dnnaVar2.i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar8 = (dhze) bZ.b;
            dhzeVar8.a |= 2;
            dhzeVar8.c = i;
        }
        if ((dnnaVar2.a & 512) != 0) {
            int i2 = dnnaVar2.j;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar9 = (dhze) bZ.b;
            dhzeVar9.a |= 4;
            dhzeVar9.d = i2;
        }
        if ((dnnaVar2.a & 1024) != 0) {
            dbrh<dnmz, dhzd> e = cdpq.e();
            dnmz dnmzVar = dnnaVar2.k;
            if (dnmzVar == null) {
                dnmzVar = dnmz.c;
            }
            dhzd NV2 = e.NV(dnmzVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhze dhzeVar10 = (dhze) bZ.b;
            NV2.getClass();
            dhzeVar10.k = NV2;
            dhzeVar10.a |= 512;
        }
        dsrj<drek> dsrjVar = dnnaVar2.l;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhze dhzeVar11 = (dhze) bZ.b;
        dsrj<drek> dsrjVar2 = dhzeVar11.l;
        if (!dsrjVar2.a()) {
            dhzeVar11.l = dsqw.cl(dsrjVar2);
        }
        dsod.bv(dsrjVar, dhzeVar11.l);
        return bZ.bK();
    }
}
