package defpackage;
/* compiled from: PG */
/* renamed from: ccll  reason: default package */
/* loaded from: classes4.dex */
class ccll implements dbrn<djul, ccln> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ ccln a(djul djulVar) {
        djul djulVar2 = djulVar;
        cclm bZ = ccln.p.bZ();
        int i = 1;
        if ((djulVar2.a & 1) != 0) {
            String str = djulVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar = (ccln) bZ.b;
            str.getClass();
            cclnVar.a |= 1;
            cclnVar.d = str;
        }
        if ((djulVar2.a & 2) != 0) {
            dgfb b = dgfb.b(djulVar2.e);
            if (b == null) {
                b = dgfb.UNKNOWN_OFFERING_TYPE;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar2 = (ccln) bZ.b;
            cclnVar2.e = b.f;
            cclnVar2.a |= 2;
        }
        if (djulVar2.b == 20) {
            dgev dgevVar = (dgev) djulVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar3 = (ccln) bZ.b;
            dgevVar.getClass();
            cclnVar3.c = dgevVar;
            cclnVar3.b = 10;
        }
        if ((djulVar2.a & 8) != 0) {
            String str2 = djulVar2.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar4 = (ccln) bZ.b;
            str2.getClass();
            cclnVar4.a |= 8;
            cclnVar4.f = str2;
        }
        if ((djulVar2.a & 32) != 0) {
            int i2 = djulVar2.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar5 = (ccln) bZ.b;
            cclnVar5.a |= 16;
            cclnVar5.g = i2;
        }
        if ((djulVar2.a & 512) != 0) {
            int i3 = djulVar2.i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar6 = (ccln) bZ.b;
            cclnVar6.a |= 32;
            cclnVar6.h = i3;
        }
        bZ.a(djulVar2.j);
        if ((djulVar2.a & 1024) != 0) {
            String str3 = djulVar2.k;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar7 = (ccln) bZ.b;
            str3.getClass();
            cclnVar7.a |= 64;
            cclnVar7.j = str3;
        }
        if ((djulVar2.a & 256) != 0) {
            int a = draz.a(djulVar2.h);
            if (a != 0) {
                i = a;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar8 = (ccln) bZ.b;
            cclnVar8.k = i - 1;
            cclnVar8.a |= 128;
        }
        if ((djulVar2.a & 4096) != 0) {
            dgep dgepVar = djulVar2.m;
            if (dgepVar == null) {
                dgepVar = dgep.f;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar9 = (ccln) bZ.b;
            dgepVar.getClass();
            cclnVar9.l = dgepVar;
            cclnVar9.a |= 256;
        }
        if ((djulVar2.a & 2048) != 0) {
            String str4 = djulVar2.l;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar10 = (ccln) bZ.b;
            str4.getClass();
            cclnVar10.a |= 512;
            cclnVar10.m = str4;
        }
        dsrj<dgez> dsrjVar = djulVar2.n;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccln cclnVar11 = (ccln) bZ.b;
        dsrj<dgez> dsrjVar2 = cclnVar11.o;
        if (!dsrjVar2.a()) {
            cclnVar11.o = dsqw.cl(dsrjVar2);
        }
        dsod.bv(dsrjVar, cclnVar11.o);
        return bZ.bK();
    }
}
