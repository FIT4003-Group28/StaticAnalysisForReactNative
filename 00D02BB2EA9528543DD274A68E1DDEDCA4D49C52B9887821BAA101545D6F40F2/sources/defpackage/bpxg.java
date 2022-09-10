package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bpxg  reason: default package */
/* loaded from: classes4.dex */
public final class bpxg extends bvxb<dgnr, dgnu> {
    private final gga a;
    private final bwqv b;
    private final boyd c;
    private final bpvf d;

    public bpxg(gga ggaVar, bwqv bwqvVar, boyd boydVar, bpvf bpvfVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = boydVar;
        this.d = bpvfVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rmi.fp";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    @dzsi
    public final /* bridge */ /* synthetic */ dgnu e(dgnr dgnrVar) {
        boolean z;
        ilo iloVar;
        dpsn dpsnVar;
        dhjz dhjzVar;
        bpuh bpuhVar;
        boys boysVar;
        dgnr dgnrVar2 = dgnrVar;
        fd K = this.a.K();
        dbsk.s(K);
        ges gesVar = (ges) K;
        dnqe dnqeVar = dgnrVar2.d;
        if (dnqeVar == null) {
            dnqeVar = dnqe.i;
        }
        int a = dgnp.a(dgnrVar2.b);
        if (a != 0 && a == 2) {
            boyd boydVar = this.c;
            boolean z2 = boydVar.a;
            if (z2 || boydVar.b) {
                dnqeVar = bpun.a(dnqeVar, dnpv.EXPERIMENT_ARM_FEATURE_ROAD_EXTENT_SELECTION, true != z2 ? "Control" : "Launch");
            }
            z = this.c.a;
        } else {
            z = false;
        }
        if (z) {
            if ((dgnrVar2.a & 2) != 0) {
                dgnn dgnnVar = dgnrVar2.c;
                if (dgnnVar == null) {
                    dgnnVar = dgnn.o;
                }
                akqi f = akqi.f(dgnnVar.b);
                dpsnVar = f == null ? null : f.i();
                dgnn dgnnVar2 = dgnrVar2.c;
                if (dgnnVar2 == null) {
                    dgnnVar2 = dgnn.o;
                }
                if ((dgnnVar2.a & 2) != 0) {
                    dgnn dgnnVar3 = dgnrVar2.c;
                    if (dgnnVar3 == null) {
                        dgnnVar3 = dgnn.o;
                    }
                    dhjzVar = dgnnVar3.c;
                    if (dhjzVar == null) {
                        dhjzVar = dhjz.e;
                    }
                } else {
                    dhjzVar = null;
                }
            } else {
                dpsnVar = null;
                dhjzVar = null;
            }
            if (dpsnVar != null && dhjzVar != null) {
                dgnn dgnnVar4 = dgnrVar2.c;
                if (dgnnVar4 == null) {
                    dgnnVar4 = dgnn.o;
                }
                if (dgnnVar4.j.size() > 0) {
                    dgnn dgnnVar5 = dgnrVar2.c;
                    if (dgnnVar5 == null) {
                        dgnnVar5 = dgnn.o;
                    }
                    if ((dgnnVar5.a & 256) != 0) {
                        dgnn dgnnVar6 = dgnrVar2.c;
                        if (dgnnVar6 == null) {
                            dgnnVar6 = dgnn.o;
                        }
                        bpub bZ = bpue.m.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bpue bpueVar = (bpue) bZ.b;
                        dnqeVar.getClass();
                        bpueVar.c = dnqeVar;
                        int i = bpueVar.a | 2;
                        bpueVar.a = i;
                        dpsnVar.getClass();
                        bpueVar.d = dpsnVar;
                        int i2 = i | 4;
                        bpueVar.a = i2;
                        dhjzVar.getClass();
                        bpueVar.e = dhjzVar;
                        bpueVar.a = i2 | 8;
                        dsrj<dpsn> dsrjVar = dgnnVar6.j;
                        bpue bpueVar2 = (bpue) bZ.b;
                        bpueVar2.b();
                        dsod.bv(dsrjVar, bpueVar2.h);
                        dpuq dpuqVar = dgnnVar6.k;
                        if (dpuqVar == null) {
                            dpuqVar = dpuq.d;
                        }
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bpue bpueVar3 = (bpue) bZ.b;
                        dpuqVar.getClass();
                        bpueVar3.i = dpuqVar;
                        bpueVar3.a |= 64;
                        dpsn dpsnVar2 = dgnnVar6.l;
                        if (dpsnVar2 == null) {
                            dpsnVar2 = dpsn.d;
                        }
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bpue bpueVar4 = (bpue) bZ.b;
                        dpsnVar2.getClass();
                        bpueVar4.j = dpsnVar2;
                        int i3 = bpueVar4.a | 128;
                        bpueVar4.a = i3;
                        String str = dgnnVar6.m;
                        str.getClass();
                        bpueVar4.a = i3 | 256;
                        bpueVar4.k = str;
                        dsrj<dpsn> dsrjVar2 = dgnnVar6.n;
                        bpue bpueVar5 = (bpue) bZ.b;
                        bpueVar5.c();
                        dsod.bv(dsrjVar2, bpueVar5.l);
                        bpue bK = bZ.bK();
                        Bundle bundle = new Bundle();
                        dpsn dpsnVar3 = bK.d;
                        if (dpsnVar3 == null) {
                            dpsnVar3 = dpsn.d;
                        }
                        bvrs.k(bundle, "INITIAL_FEATURE_ID_KEY", dpsnVar3);
                        dhjz dhjzVar2 = bK.e;
                        if (dhjzVar2 == null) {
                            dhjzVar2 = dhjz.e;
                        }
                        bvrs.k(bundle, "INITIAL_LOCATION_KEY", dhjzVar2);
                        dcdc q = dcdc.q(dcft.o(bK.h, boye.a));
                        dcep L = dcep.L(dcft.o(bK.l, boyf.a));
                        bpuh bpuhVar2 = bpuh.EXTENT_PICKING;
                        dpsn dpsnVar4 = bK.d;
                        if (dpsnVar4 == null) {
                            dpsnVar4 = dpsn.d;
                        }
                        dpsn dpsnVar5 = dpsnVar4;
                        dhjz dhjzVar3 = bK.e;
                        if (dhjzVar3 == null) {
                            dhjzVar3 = dhjz.e;
                        }
                        dhjz dhjzVar4 = dhjzVar3;
                        String str2 = bK.k;
                        dpuq dpuqVar2 = bK.i;
                        if (dpuqVar2 == null) {
                            dpuqVar2 = dpuq.d;
                        }
                        akqs akqsVar = new akqs(dpuqVar2);
                        dpsn dpsnVar6 = bK.j;
                        if (dpsnVar6 == null) {
                            dpsnVar6 = dpsn.d;
                        }
                        bvrs.k(bundle, "PROTO_MODEL_KEY", new boyt(bpuhVar2, dpsnVar5, dhjzVar4, str2, q, akqsVar, dpsnVar6.c, L).a().bK());
                        dnqe dnqeVar2 = bK.c;
                        if (dnqeVar2 == null) {
                            dnqeVar2 = dnqe.i;
                        }
                        bvrs.k(bundle, "CLIENT_STATE_PROTO_MODEL_KEY", dnqeVar2);
                        boysVar = new boys();
                        boysVar.B(bundle);
                        gesVar.aZ(boysVar);
                    }
                }
            }
            Bundle bundle2 = new Bundle();
            if (dpsnVar == null || dhjzVar == null) {
                bpuhVar = bpuh.INITIAL;
            } else {
                bpuhVar = bpuh.CAROUSEL;
                bvrs.k(bundle2, "INITIAL_FEATURE_ID_KEY", dpsnVar);
                bvrs.k(bundle2, "INITIAL_LOCATION_KEY", dhjzVar);
            }
            bvrs.k(bundle2, "PROTO_MODEL_KEY", new boyt(bpuhVar).a().bK());
            bvrs.k(bundle2, "CLIENT_STATE_PROTO_MODEL_KEY", dnqeVar);
            boys boysVar2 = new boys();
            boysVar2.B(bundle2);
            boysVar = boysVar2;
            gesVar.aZ(boysVar);
        } else {
            if ((dgnrVar2.a & 2) != 0) {
                ily ilyVar = new ily();
                dgnn dgnnVar7 = dgnrVar2.c;
                if (dgnnVar7 == null) {
                    dgnnVar7 = dgnn.o;
                }
                ilyVar.k(dgnnVar7.b);
                dgnn dgnnVar8 = dgnrVar2.c;
                if (dgnnVar8 == null) {
                    dgnnVar8 = dgnn.o;
                }
                dhjz dhjzVar5 = dgnnVar8.c;
                if (dhjzVar5 == null) {
                    dhjzVar5 = dhjz.e;
                }
                ilyVar.r(dhjzVar5);
                iloVar = ilyVar.d();
            } else {
                iloVar = null;
            }
            bwqv bwqvVar = this.b;
            int a2 = dgnp.a(dgnrVar2.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i4 = a2 - 1;
            bowu bowuVar = i4 != 1 ? i4 != 2 ? bowu.EDIT_THE_MAP : bowu.WRONG_PLACE_INFO : bowu.ROAD_CLOSURE;
            boolean z3 = dgnrVar2.e;
            bpap bpapVar = new bpap();
            Bundle bundle3 = new Bundle();
            bundle3.putString("RAP_FLOW_KEY", bowuVar.name());
            bundle3.putBoolean("HIDE_AAP_CARD", z3);
            if (iloVar != null) {
                bwqvVar.c(bundle3, "placemark", iloVar);
            }
            if ((dnqeVar.a & 1) != 0) {
                dnqb b = dnqb.b(dnqeVar.b);
                if (b == null) {
                    b = dnqb.UNKNOWN_ENTRY_POINT;
                }
                bundle3.putInt("rdp_entry point_type", b.ah);
            }
            bvrs.l(bundle3, dnqeVar);
            bpapVar.B(bundle3);
            gesVar.aZ(bpapVar);
        }
        return null;
    }

    @Override // defpackage.bvxb
    @dzsi
    protected final /* bridge */ /* synthetic */ dgnu f(Object obj) {
        if (!(obj instanceof bpue)) {
            return null;
        }
        bpue bpueVar = (bpue) obj;
        if (bpue.m.equals(bpueVar)) {
            return dgnu.f;
        }
        dpsn dpsnVar = bpueVar.d;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        akqi j = akqi.j(dpsnVar);
        int a = bpud.a(bpueVar.b);
        if (a != 0 && a == 2) {
            dpsn dpsnVar2 = bpueVar.d;
            if (dpsnVar2 == null) {
                dpsnVar2 = dpsn.d;
            }
            dsrj<dpsn> dsrjVar = bpueVar.h;
            dpsn dpsnVar3 = bpueVar.j;
            if (dpsnVar3 == null) {
                dpsnVar3 = dpsn.d;
            }
            akqi akqiVar = bpxb.g(dpsnVar2, dsrjVar, dpsnVar3).b;
            if (akqiVar.c != 0) {
                bpvf bpvfVar = this.d;
                bpvfVar.a = bpvfVar.b(akqiVar);
                bput bputVar = bpvfVar.a;
                dbsk.s(bputVar);
                bputVar.b();
            }
        }
        dgns bZ = dgnu.f.bZ();
        int a2 = bpud.a(bpueVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        int i2 = 3;
        if (i == 1) {
            i2 = 2;
        } else if (i != 2) {
            i2 = i != 3 ? 1 : 4;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgnu dgnuVar = (dgnu) bZ.b;
        dgnuVar.b = i2 - 1;
        dgnuVar.a |= 1;
        dgnm bZ2 = dgnn.o.bZ();
        String o = j.o();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgnn dgnnVar = (dgnn) bZ2.b;
        o.getClass();
        dgnnVar.a = 1 | dgnnVar.a;
        dgnnVar.b = o;
        dhjz dhjzVar = bpueVar.e;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgnn dgnnVar2 = (dgnn) bZ2.b;
        dhjzVar.getClass();
        dgnnVar2.c = dhjzVar;
        dgnnVar2.a |= 2;
        dpuq dpuqVar = bpueVar.i;
        if (dpuqVar == null) {
            dpuqVar = dpuq.d;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgnn dgnnVar3 = (dgnn) bZ2.b;
        dpuqVar.getClass();
        dgnnVar3.k = dpuqVar;
        dgnnVar3.a |= 256;
        dsrj<dpsn> dsrjVar2 = bpueVar.h;
        dgnn dgnnVar4 = (dgnn) bZ2.b;
        dsrj<dpsn> dsrjVar3 = dgnnVar4.j;
        if (!dsrjVar3.a()) {
            dgnnVar4.j = dsqw.cl(dsrjVar3);
        }
        dsod.bv(dsrjVar2, dgnnVar4.j);
        dpsn dpsnVar4 = bpueVar.j;
        if (dpsnVar4 == null) {
            dpsnVar4 = dpsn.d;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgnn dgnnVar5 = (dgnn) bZ2.b;
        dpsnVar4.getClass();
        dgnnVar5.l = dpsnVar4;
        int i3 = dgnnVar5.a | 512;
        dgnnVar5.a = i3;
        String str = bpueVar.k;
        str.getClass();
        dgnnVar5.a = i3 | 1024;
        dgnnVar5.m = str;
        dsrj<dpsn> dsrjVar4 = bpueVar.l;
        dgnn dgnnVar6 = (dgnn) bZ2.b;
        dsrj<dpsn> dsrjVar5 = dgnnVar6.n;
        if (!dsrjVar5.a()) {
            dgnnVar6.n = dsqw.cl(dsrjVar5);
        }
        dsod.bv(dsrjVar4, dgnnVar6.n);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgnu dgnuVar2 = (dgnu) bZ.b;
        dgnn bK = bZ2.bK();
        bK.getClass();
        dgnuVar2.c = bK;
        dgnuVar2.a = 2 | dgnuVar2.a;
        dhjz dhjzVar2 = bpueVar.f;
        if (dhjzVar2 == null) {
            dhjzVar2 = dhjz.e;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgnu dgnuVar3 = (dgnu) bZ.b;
        dhjzVar2.getClass();
        dgnuVar3.e = dhjzVar2;
        dgnuVar3.a |= 8;
        dnqe dnqeVar = bpueVar.c;
        if (dnqeVar == null) {
            dnqeVar = dnqe.i;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgnu dgnuVar4 = (dgnu) bZ.b;
        dnqeVar.getClass();
        dgnuVar4.d = dnqeVar;
        dgnuVar4.a |= 4;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgnr j(byte[] bArr) {
        return ((dgnq) dgnr.f.bZ().bx(bArr, dsqa.c())).bK();
    }
}
