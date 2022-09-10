package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ckbt  reason: default package */
/* loaded from: classes4.dex */
public final class ckbt implements cnjx {
    final cjtk a;
    final List<duty> b;
    final List<ahnc> c;
    final /* synthetic */ ckbz d;

    public ckbt(ckbz ckbzVar, cjtk cjtkVar, List<ahnc> list, List<duty> list2) {
        this.d = ckbzVar;
        this.a = cjtkVar;
        this.c = list;
        this.b = list2;
    }

    @Override // defpackage.cnjx
    public final byte[] a() {
        int[] u;
        cjtk cjtkVar = this.a;
        ckbz ckbzVar = this.d;
        List<Integer> m = (!(cjtkVar instanceof cjtp) || (u = ((cjtp) cjtkVar).u()) == null || u.length <= 0) ? null : decl.m(u);
        dumd bZ = dume.f.bZ();
        String a = bvom.a(Locale.getDefault());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dume dumeVar = (dume) bZ.b;
        a.getClass();
        dumeVar.a |= 2;
        dumeVar.c = a;
        dumx a2 = ckbzVar.u.a();
        dsqp dsqpVar = (dsqp) a2.cu(5);
        dsqpVar.bC(a2);
        dumj dumjVar = (dumj) dsqpVar;
        if (ckbzVar.m.a().bs || ckbzVar.n.a().i()) {
            String a3 = ckbzVar.l.a().a();
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar = (dumx) dumjVar.b;
            dumx dumxVar2 = dumx.P;
            a3.getClass();
            dumxVar.a |= 8;
            dumxVar.f = a3;
        }
        if (ckbzVar.j.a().a()) {
            boolean h = ckbzVar.k.a().h();
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar3 = (dumx) dumjVar.b;
            dumx dumxVar4 = dumx.P;
            dumxVar3.a |= 16;
            dumxVar3.g = h;
        }
        dbsg<dhmr> a4 = ckbzVar.i.a();
        if (a4.a()) {
            dhmr b = a4.b();
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar5 = (dumx) dumjVar.b;
            dumx dumxVar6 = dumx.P;
            b.getClass();
            dumxVar5.O = b;
            dumxVar5.b |= 128;
        }
        dung c = ckbzVar.o.a().c(false);
        if (dumjVar.c) {
            dumjVar.bF();
            dumjVar.c = false;
        }
        dumx dumxVar7 = (dumx) dumjVar.b;
        dumx dumxVar8 = dumx.P;
        dumxVar7.u = 1;
        dumxVar7.a |= 262144;
        if ((c.b & 8388608) != 0) {
            int a5 = duml.a(c.N);
            if (a5 == 0) {
                a5 = 1;
            }
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar9 = (dumx) dumjVar.b;
            dumxVar9.v = a5 - 1;
            dumxVar9.a |= ImageMetadata.LENS_APERTURE;
        }
        if ((c.a & 2) != 0) {
            String str = c.d;
            dumx dumxVar10 = (dumx) dumjVar.b;
            str.getClass();
            dumxVar10.a |= 8;
            dumxVar10.f = str;
        }
        if ((c.a & 4) != 0) {
            String str2 = c.e;
            dumx dumxVar11 = (dumx) dumjVar.b;
            str2.getClass();
            dumxVar11.a |= 1;
            dumxVar11.c = str2;
        }
        if ((c.a & 16) != 0) {
            String str3 = c.f;
            dumx dumxVar12 = (dumx) dumjVar.b;
            str3.getClass();
            dumxVar12.a |= 2;
            dumxVar12.d = str3;
        }
        if ((c.a & 128) != 0) {
            dkgr dkgrVar = c.g;
            if (dkgrVar == null) {
                dkgrVar = dkgr.c;
            }
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar13 = (dumx) dumjVar.b;
            dkgrVar.getClass();
            dumxVar13.e = dkgrVar;
            dumxVar13.a |= 4;
        }
        int i = c.a;
        if ((i & 1) != 0) {
            String str4 = c.c;
            dumx dumxVar14 = (dumx) dumjVar.b;
            str4.getClass();
            dumxVar14.b |= 8;
            dumxVar14.L = str4;
        }
        if ((i & 1024) != 0) {
            String str5 = c.i;
            dumx dumxVar15 = (dumx) dumjVar.b;
            str5.getClass();
            dumxVar15.a |= 32;
            dumxVar15.h = str5;
        }
        if ((c.a & 16777216) != 0) {
            String str6 = c.r;
            dumx dumxVar16 = (dumx) dumjVar.b;
            str6.getClass();
            dumxVar16.a |= 1024;
            dumxVar16.m = str6;
        }
        int i2 = c.b;
        if ((131072 & i2) != 0) {
            int i3 = c.H;
            dumx dumxVar17 = (dumx) dumjVar.b;
            dumxVar17.a |= 134217728;
            dumxVar17.D = i3;
        }
        if ((i2 & 262144) != 0) {
            long j = c.I;
            dumx dumxVar18 = (dumx) dumjVar.b;
            dumxVar18.a |= 268435456;
            dumxVar18.E = j;
        }
        if ((i2 & ImageMetadata.LENS_APERTURE) != 0) {
            long j2 = c.J;
            dumx dumxVar19 = (dumx) dumjVar.b;
            dumxVar19.a |= 536870912;
            dumxVar19.F = j2;
        }
        if ((65536 & i2) != 0) {
            boolean z = c.G;
            dumx dumxVar20 = (dumx) dumjVar.b;
            dumxVar20.a |= ImageMetadata.SHADING_MODE;
            dumxVar20.w = z;
        }
        if ((i2 & 512) != 0) {
            int i4 = c.C;
            dumx dumxVar21 = (dumx) dumjVar.b;
            dumxVar21.a |= 2097152;
            dumxVar21.x = i4;
        }
        if ((i2 & 1024) != 0) {
            int i5 = c.D;
            dumx dumxVar22 = (dumx) dumjVar.b;
            dumxVar22.a |= 4194304;
            dumxVar22.y = i5;
        }
        if ((i2 & 32) != 0) {
            String str7 = c.y;
            dumx dumxVar23 = (dumx) dumjVar.b;
            str7.getClass();
            dumxVar23.a |= 67108864;
            dumxVar23.C = str7;
        }
        if ((i2 & 128) != 0) {
            long j3 = c.A;
            dumx dumxVar24 = (dumx) dumjVar.b;
            dumxVar24.a |= 256;
            dumxVar24.k = j3;
        }
        if ((i2 & 64) != 0) {
            String str8 = c.z;
            dumx dumxVar25 = (dumx) dumjVar.b;
            str8.getClass();
            dumxVar25.a |= 128;
            dumxVar25.j = str8;
        }
        if ((i2 & 256) != 0) {
            dvoz b2 = dvoz.b(c.B);
            if (b2 == null) {
                b2 = dvoz.UNKNOWN_RELEASE_LEVEL;
            }
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar26 = (dumx) dumjVar.b;
            dumxVar26.o = b2.g;
            dumxVar26.a |= 4096;
        }
        int i6 = c.b;
        if ((i6 & 16) != 0) {
            String str9 = c.x;
            dumx dumxVar27 = (dumx) dumjVar.b;
            str9.getClass();
            dumxVar27.a = 8388608 | dumxVar27.a;
            dumxVar27.z = str9;
        }
        if ((i6 & 4) != 0) {
            String str10 = c.v;
            dumx dumxVar28 = (dumx) dumjVar.b;
            str10.getClass();
            dumxVar28.a |= 16777216;
            dumxVar28.A = str10;
        }
        if ((c.a & 2097152) != 0) {
            dumv dumvVar = c.p;
            if (dumvVar == null) {
                dumvVar = dumv.c;
            }
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar29 = (dumx) dumjVar.b;
            dumvVar.getClass();
            dumxVar29.B = dumvVar;
            dumxVar29.a |= 33554432;
        }
        if ((c.b & 4096) != 0) {
            boolean z2 = c.E;
            dumx dumxVar30 = (dumx) dumjVar.b;
            dumxVar30.a |= 1073741824;
            dumxVar30.G = z2;
            dump dumpVar = dumxVar30.I;
            if (dumpVar == null) {
                dumpVar = dump.e;
            }
            dsqp dsqpVar2 = (dsqp) dumpVar.cu(5);
            dsqpVar2.bC(dumpVar);
            dumm dummVar = (dumm) dsqpVar2;
            boolean z3 = c.E;
            if (dummVar.c) {
                dummVar.bF();
                dummVar.c = false;
            }
            dump dumpVar2 = (dump) dummVar.b;
            dumpVar2.a |= 1;
            dumpVar2.b = z3;
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar31 = (dumx) dumjVar.b;
            dump bK = dummVar.bK();
            bK.getClass();
            dumxVar31.I = bK;
            dumxVar31.b |= 1;
        }
        if ((c.b & 16384) != 0) {
            dump dumpVar3 = ((dumx) dumjVar.b).I;
            if (dumpVar3 == null) {
                dumpVar3 = dump.e;
            }
            dsqp dsqpVar3 = (dsqp) dumpVar3.cu(5);
            dsqpVar3.bC(dumpVar3);
            dumm dummVar2 = (dumm) dsqpVar3;
            dumo dumoVar = c.F;
            if (dumoVar == null) {
                dumoVar = dumo.a;
            }
            if (dummVar2.c) {
                dummVar2.bF();
                dummVar2.c = false;
            }
            dump dumpVar4 = (dump) dummVar2.b;
            dumoVar.getClass();
            dumpVar4.d = dumoVar;
            dumpVar4.a |= 4;
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar32 = (dumx) dumjVar.b;
            dump bK2 = dummVar2.bK();
            bK2.getClass();
            dumxVar32.I = bK2;
            dumxVar32.b |= 1;
        }
        if ((c.a & 67108864) != 0) {
            int i7 = c.s ? 2 : 1;
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar33 = (dumx) dumjVar.b;
            dumxVar33.p = i7 - 1;
            dumxVar33.a |= 8192;
        }
        if ((c.b & ImageMetadata.SHADING_MODE) != 0) {
            dump dumpVar5 = ((dumx) dumjVar.b).I;
            if (dumpVar5 == null) {
                dumpVar5 = dump.e;
            }
            dsqp dsqpVar4 = (dsqp) dumpVar5.cu(5);
            dsqpVar4.bC(dumpVar5);
            dumm dummVar3 = (dumm) dsqpVar4;
            long j4 = c.K;
            if (dummVar3.c) {
                dummVar3.bF();
                dummVar3.c = false;
            }
            dump dumpVar6 = (dump) dummVar3.b;
            dumpVar6.a |= 2;
            dumpVar6.c = j4;
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar34 = (dumx) dumjVar.b;
            dump bK3 = dummVar3.bK();
            bK3.getClass();
            dumxVar34.I = bK3;
            dumxVar34.b |= 1;
        }
        if ((c.a & 4096) != 0) {
            String str11 = c.k;
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar35 = (dumx) dumjVar.b;
            str11.getClass();
            dumxVar35.b |= 2;
            dumxVar35.J = str11;
        }
        if ((c.b & 2097152) != 0) {
            String str12 = c.L;
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar36 = (dumx) dumjVar.b;
            str12.getClass();
            dumxVar36.b |= 4;
            dumxVar36.K = str12;
        }
        if ((c.b & 4194304) != 0) {
            dumt b3 = dumt.b(c.M);
            if (b3 == null) {
                b3 = dumt.UNKNOWN_LOCATION_SHARING_STATE;
            }
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar37 = (dumx) dumjVar.b;
            dumxVar37.M = b3.e;
            dumxVar37.b |= 16;
        }
        if ((c.b & 16777216) != 0) {
            dumr dumrVar = c.O;
            if (dumrVar == null) {
                dumrVar = dumr.c;
            }
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar38 = (dumx) dumjVar.b;
            dumrVar.getClass();
            dumxVar38.N = dumrVar;
            dumxVar38.b |= 32;
        }
        if ((c.b & 67108864) != 0) {
            dhmr dhmrVar = c.Q;
            if (dhmrVar == null) {
                dhmrVar = dhmr.i;
            }
            if (dumjVar.c) {
                dumjVar.bF();
                dumjVar.c = false;
            }
            dumx dumxVar39 = (dumx) dumjVar.b;
            dhmrVar.getClass();
            dumxVar39.O = dhmrVar;
            dumxVar39.b |= 128;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dume dumeVar2 = (dume) bZ.b;
        dumx bK4 = dumjVar.bK();
        bK4.getClass();
        dumeVar2.b = bK4;
        dumeVar2.a |= 1;
        if (m == null) {
            m = ckbzVar.r();
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dume dumeVar3 = (dume) bZ.b;
        dsrf dsrfVar = dumeVar3.d;
        if (!dsrfVar.a()) {
            dumeVar3.d = dsqw.cg(dsrfVar);
        }
        dsod.bv(m, dumeVar3.d);
        String z4 = ckbzVar.e.a().z(bvjk.br, null);
        if (z4 != null && !"*".equals(z4)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dume dumeVar4 = (dume) bZ.b;
            z4.getClass();
            dumeVar4.a |= 4;
            dumeVar4.e = z4;
        }
        return cjtkVar.m(bZ.bK(), this.c, this.b, this.d.b.a().p).bS();
    }
}
