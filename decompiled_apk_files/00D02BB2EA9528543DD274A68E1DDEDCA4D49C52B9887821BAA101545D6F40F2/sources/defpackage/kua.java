package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kua  reason: default package */
/* loaded from: classes7.dex */
public class kua extends dbrh<ddlj, dhmr> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ddlj b(dhmr dhmrVar) {
        dhmr dhmrVar2 = dhmrVar;
        ddky bZ = ddlj.i.bZ();
        if ((dhmrVar2.a & 1) != 0) {
            dbrh<dhmo, ddlg> k = kur.i().k();
            dhmo b = dhmo.b(dhmrVar2.b);
            if (b == null) {
                b = dhmo.UNKNOWN_PLATFORM;
            }
            ddlg NV = k.NV(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar = (ddlj) bZ.b;
            ddljVar.b = NV.f;
            ddljVar.a |= 1;
        }
        if ((dhmrVar2.a & 2) != 0) {
            dbrh<dhmm, ddle> k2 = kur.d().k();
            dhmm dhmmVar = dhmrVar2.c;
            if (dhmmVar == null) {
                dhmmVar = dhmm.f;
            }
            ddle NV2 = k2.NV(dhmmVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar2 = (ddlj) bZ.b;
            NV2.getClass();
            ddljVar2.c = NV2;
            ddljVar2.a |= 2;
        }
        if ((dhmrVar2.a & 4) != 0) {
            dbrh<dhmi, ddla> k3 = kur.e().k();
            dhmi dhmiVar = dhmrVar2.d;
            if (dhmiVar == null) {
                dhmiVar = dhmi.e;
            }
            ddla NV3 = k3.NV(dhmiVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar3 = (ddlj) bZ.b;
            NV3.getClass();
            ddljVar3.d = NV3;
            ddljVar3.a |= 4;
        }
        if ((dhmrVar2.a & 8) != 0) {
            dbrh<dhmk, ddlc> k4 = kur.f().k();
            dhmk dhmkVar = dhmrVar2.e;
            if (dhmkVar == null) {
                dhmkVar = dhmk.e;
            }
            ddlc NV4 = k4.NV(dhmkVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar4 = (ddlj) bZ.b;
            NV4.getClass();
            ddljVar4.e = NV4;
            ddljVar4.a |= 8;
        }
        if ((dhmrVar2.a & 16) != 0) {
            dbrh<dhmq, ddli> k5 = kur.g().k();
            dhmq dhmqVar = dhmrVar2.f;
            if (dhmqVar == null) {
                dhmqVar = dhmq.c;
            }
            ddli NV5 = k5.NV(dhmqVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar5 = (ddlj) bZ.b;
            NV5.getClass();
            ddljVar5.f = NV5;
            ddljVar5.a |= 16;
        }
        if ((dhmrVar2.a & 32) != 0) {
            dbrh<dhmf, ddkx> k6 = kur.h().k();
            dhmf dhmfVar = dhmrVar2.g;
            if (dhmfVar == null) {
                dhmfVar = dhmf.e;
            }
            ddkx NV6 = k6.NV(dhmfVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar6 = (ddlj) bZ.b;
            NV6.getClass();
            ddljVar6.g = NV6;
            ddljVar6.a |= 32;
        }
        for (dhmd dhmdVar : dhmrVar2.h) {
            ddkv NV7 = kur.j().k().NV(dhmdVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlj ddljVar7 = (ddlj) bZ.b;
            NV7.getClass();
            ddljVar7.b();
            ddljVar7.h.add(NV7);
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhmr c(ddlj ddljVar) {
        ddlj ddljVar2 = ddljVar;
        dhmg bZ = dhmr.i.bZ();
        if ((ddljVar2.a & 1) != 0) {
            dbrh<ddlg, dhmo> i = kur.i();
            ddlg b = ddlg.b(ddljVar2.b);
            if (b == null) {
                b = ddlg.UNKNOWN;
            }
            dhmo NV = i.NV(b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmr dhmrVar = (dhmr) bZ.b;
            dhmrVar.b = NV.f;
            dhmrVar.a |= 1;
        }
        if ((ddljVar2.a & 2) != 0) {
            dbrh<ddle, dhmm> d = kur.d();
            ddle ddleVar = ddljVar2.c;
            if (ddleVar == null) {
                ddleVar = ddle.f;
            }
            dhmm NV2 = d.NV(ddleVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmr dhmrVar2 = (dhmr) bZ.b;
            NV2.getClass();
            dhmrVar2.c = NV2;
            dhmrVar2.a |= 2;
        }
        if ((ddljVar2.a & 4) != 0) {
            dbrh<ddla, dhmi> e = kur.e();
            ddla ddlaVar = ddljVar2.d;
            if (ddlaVar == null) {
                ddlaVar = ddla.e;
            }
            dhmi NV3 = e.NV(ddlaVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmr dhmrVar3 = (dhmr) bZ.b;
            NV3.getClass();
            dhmrVar3.d = NV3;
            dhmrVar3.a |= 4;
        }
        if ((ddljVar2.a & 8) != 0) {
            dbrh<ddlc, dhmk> f = kur.f();
            ddlc ddlcVar = ddljVar2.e;
            if (ddlcVar == null) {
                ddlcVar = ddlc.e;
            }
            dhmk NV4 = f.NV(ddlcVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmr dhmrVar4 = (dhmr) bZ.b;
            NV4.getClass();
            dhmrVar4.e = NV4;
            dhmrVar4.a |= 8;
        }
        if ((ddljVar2.a & 16) != 0) {
            dbrh<ddli, dhmq> g = kur.g();
            ddli ddliVar = ddljVar2.f;
            if (ddliVar == null) {
                ddliVar = ddli.c;
            }
            dhmq NV5 = g.NV(ddliVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmr dhmrVar5 = (dhmr) bZ.b;
            NV5.getClass();
            dhmrVar5.f = NV5;
            dhmrVar5.a |= 16;
        }
        if ((ddljVar2.a & 32) != 0) {
            dbrh<ddkx, dhmf> h = kur.h();
            ddkx ddkxVar = ddljVar2.g;
            if (ddkxVar == null) {
                ddkxVar = ddkx.e;
            }
            dhmf NV6 = h.NV(ddkxVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmr dhmrVar6 = (dhmr) bZ.b;
            NV6.getClass();
            dhmrVar6.g = NV6;
            dhmrVar6.a |= 32;
        }
        for (ddkv ddkvVar : ddljVar2.h) {
            dhmd NV7 = kur.j().NV(ddkvVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmr dhmrVar7 = (dhmr) bZ.b;
            NV7.getClass();
            dsrj<dhmd> dsrjVar = dhmrVar7.h;
            if (!dsrjVar.a()) {
                dhmrVar7.h = dsqw.cl(dsrjVar);
            }
            dhmrVar7.h.add(NV7);
        }
        return bZ.bK();
    }
}
