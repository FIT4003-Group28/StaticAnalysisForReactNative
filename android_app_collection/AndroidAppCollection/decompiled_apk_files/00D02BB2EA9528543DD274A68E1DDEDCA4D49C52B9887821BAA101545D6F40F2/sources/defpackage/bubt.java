package defpackage;

import com.google.ar.core.ImageMetadata;
import defpackage.dssj;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bubt  reason: default package */
/* loaded from: classes4.dex */
final class bubt<S extends dssj> implements buir<S> {
    private final dssj a;
    private final dxio<btto> b;
    private final btus c;
    private final buid d;
    private final dxio<bubp> e;
    private final bvjj f;
    private final bucb g;
    private final bufa<S> h;
    private final dzsj<dixz> i;
    private final dzsj<djzi> j;
    private final buxc k;
    private final btyy l;
    private final dxio<bszw> m;
    private final dzsj<dkiy> n;
    private final dzsj<duul> o;
    private final gcg p;
    private final dxio<gce> q;
    private final dzsj<dbsg<dhmr>> r;

    public bubt(dssj dssjVar, buid buidVar, dxio<btto> dxioVar, btus btusVar, dxio<bubp> dxioVar2, bvjj bvjjVar, bucb bucbVar, bufa<S> bufaVar, dzsj<dixz> dzsjVar, dzsj<djzi> dzsjVar2, buxc buxcVar, btyy btyyVar, dxio<bszw> dxioVar3, dzsj<dkiy> dzsjVar3, dzsj<duul> dzsjVar4, gcg gcgVar, dxio<gce> dxioVar4, dzsj<dbsg<dhmr>> dzsjVar5) {
        this.a = dssjVar;
        this.d = buidVar;
        this.b = dxioVar;
        this.c = btusVar;
        this.e = dxioVar2;
        this.f = bvjjVar;
        this.g = bucbVar;
        this.h = bufaVar;
        this.i = dzsjVar;
        this.j = dzsjVar2;
        this.k = buxcVar;
        this.l = btyyVar;
        this.m = dxioVar3;
        this.n = dzsjVar3;
        this.o = dzsjVar4;
        this.p = gcgVar;
        this.q = dxioVar4;
        this.r = dzsjVar5;
    }

    private static dtas b(List<ahnc> list) {
        dtar bZ = dtas.b.bZ();
        for (ahnc ahncVar : list) {
            dtaq a = ahncVar.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtas dtasVar = (dtas) bZ.b;
            a.getClass();
            dsrj<dtaq> dsrjVar = dtasVar.a;
            if (!dsrjVar.a()) {
                dtasVar.a = dsqw.cl(dsrjVar);
            }
            dtasVar.a.add(a);
        }
        return bZ.bK();
    }

    @dzsi
    private final duje c() {
        dujd bZ = duje.d.bZ();
        List<bviu> list = bviv.a;
        boolean z = false;
        for (Integer num : bviv.a()) {
            int intValue = num.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duje dujeVar = (duje) bZ.b;
            dsrf dsrfVar = dujeVar.a;
            if (!dsrfVar.a()) {
                dujeVar.a = dsqw.cg(dsrfVar);
            }
            dujeVar.a.h(intValue);
            bZ.a(num.intValue());
            z = true;
        }
        for (Integer num2 : this.j.a().a) {
            bZ.a(num2.intValue());
            z = true;
        }
        dcdc<Integer> b = this.l.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            bZ.a(b.get(i).intValue());
            i++;
            z = true;
        }
        String z2 = this.f.z(bvjk.kc, "");
        if (!z2.isEmpty()) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duje dujeVar2 = (duje) bZ.b;
            z2.getClass();
            dsrj<String> dsrjVar = dujeVar2.c;
            if (!dsrjVar.a()) {
                dujeVar2.c = dsqw.cl(dsrjVar);
            }
            dujeVar2.c.add(z2);
        } else if (!z) {
            return null;
        }
        return bZ.bK();
    }

    private final dumx d() {
        dumj bZ = dumx.P.bZ();
        String str = this.c.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumx dumxVar = (dumx) bZ.b;
        str.getClass();
        int i = dumxVar.a | 64;
        dumxVar.a = i;
        dumxVar.i = str;
        btus btusVar = this.c;
        String str2 = btusVar.a;
        str2.getClass();
        dumxVar.a = i | 512;
        dumxVar.l = str2;
        String a = btusVar.c.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumx dumxVar2 = (dumx) bZ.b;
        a.getClass();
        dumxVar2.a |= 2048;
        dumxVar2.n = a;
        if (this.n.a().bs || this.o.a().i()) {
            String a2 = this.m.a().a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar3 = (dumx) bZ.b;
            a2.getClass();
            dumxVar3.a |= 8;
            dumxVar3.f = a2;
        }
        if (this.p.a()) {
            boolean h = this.q.a().h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar4 = (dumx) bZ.b;
            dumxVar4.a |= 16;
            dumxVar4.g = h;
        }
        dbsg<dhmr> a3 = this.r.a();
        if (a3.a()) {
            dhmr b = a3.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar5 = (dumx) bZ.b;
            b.getClass();
            dumxVar5.O = b;
            dumxVar5.b |= 128;
        }
        dung c = this.b.a().c(false);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumx dumxVar6 = (dumx) bZ.b;
        dumxVar6.u = 1;
        dumxVar6.a |= 262144;
        if ((c.b & 8388608) != 0) {
            int a4 = duml.a(c.N);
            if (a4 == 0) {
                a4 = 1;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar7 = (dumx) bZ.b;
            dumxVar7.v = a4 - 1;
            dumxVar7.a |= ImageMetadata.LENS_APERTURE;
        }
        if ((c.a & 2) != 0) {
            String str3 = c.d;
            dumx dumxVar8 = (dumx) bZ.b;
            str3.getClass();
            dumxVar8.a |= 8;
            dumxVar8.f = str3;
        }
        if ((c.a & 4) != 0) {
            String str4 = c.e;
            dumx dumxVar9 = (dumx) bZ.b;
            str4.getClass();
            dumxVar9.a |= 1;
            dumxVar9.c = str4;
        }
        if ((c.a & 16) != 0) {
            String str5 = c.f;
            dumx dumxVar10 = (dumx) bZ.b;
            str5.getClass();
            dumxVar10.a |= 2;
            dumxVar10.d = str5;
        }
        if ((c.a & 128) != 0) {
            dkgr dkgrVar = c.g;
            if (dkgrVar == null) {
                dkgrVar = dkgr.c;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar11 = (dumx) bZ.b;
            dkgrVar.getClass();
            dumxVar11.e = dkgrVar;
            dumxVar11.a |= 4;
        }
        int i2 = c.a;
        if ((i2 & 1) != 0) {
            String str6 = c.c;
            dumx dumxVar12 = (dumx) bZ.b;
            str6.getClass();
            dumxVar12.b |= 8;
            dumxVar12.L = str6;
        }
        if ((i2 & 1024) != 0) {
            String str7 = c.i;
            dumx dumxVar13 = (dumx) bZ.b;
            str7.getClass();
            dumxVar13.a |= 32;
            dumxVar13.h = str7;
        }
        if ((c.a & 16777216) != 0) {
            String str8 = c.r;
            dumx dumxVar14 = (dumx) bZ.b;
            str8.getClass();
            dumxVar14.a |= 1024;
            dumxVar14.m = str8;
        }
        int i3 = c.b;
        if ((i3 & 131072) != 0) {
            int i4 = c.H;
            dumx dumxVar15 = (dumx) bZ.b;
            dumxVar15.a |= 134217728;
            dumxVar15.D = i4;
        }
        if ((262144 & i3) != 0) {
            long j = c.I;
            dumx dumxVar16 = (dumx) bZ.b;
            dumxVar16.a |= 268435456;
            dumxVar16.E = j;
        }
        if ((i3 & ImageMetadata.LENS_APERTURE) != 0) {
            long j2 = c.J;
            dumx dumxVar17 = (dumx) bZ.b;
            dumxVar17.a |= 536870912;
            dumxVar17.F = j2;
        }
        if ((i3 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            boolean z = c.G;
            dumx dumxVar18 = (dumx) bZ.b;
            dumxVar18.a |= ImageMetadata.SHADING_MODE;
            dumxVar18.w = z;
        }
        if ((i3 & 512) != 0) {
            int i5 = c.C;
            dumx dumxVar19 = (dumx) bZ.b;
            dumxVar19.a |= 2097152;
            dumxVar19.x = i5;
        }
        if ((i3 & 1024) != 0) {
            int i6 = c.D;
            dumx dumxVar20 = (dumx) bZ.b;
            dumxVar20.a |= 4194304;
            dumxVar20.y = i6;
        }
        if ((i3 & 32) != 0) {
            String str9 = c.y;
            dumx dumxVar21 = (dumx) bZ.b;
            str9.getClass();
            dumxVar21.a |= 67108864;
            dumxVar21.C = str9;
        }
        if ((i3 & 128) != 0) {
            long j3 = c.A;
            dumx dumxVar22 = (dumx) bZ.b;
            dumxVar22.a |= 256;
            dumxVar22.k = j3;
        }
        if ((i3 & 64) != 0) {
            String str10 = c.z;
            dumx dumxVar23 = (dumx) bZ.b;
            str10.getClass();
            dumxVar23.a |= 128;
            dumxVar23.j = str10;
        }
        if ((i3 & 256) != 0) {
            dvoz b2 = dvoz.b(c.B);
            if (b2 == null) {
                b2 = dvoz.UNKNOWN_RELEASE_LEVEL;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar24 = (dumx) bZ.b;
            dumxVar24.o = b2.g;
            dumxVar24.a |= 4096;
        }
        int i7 = c.b;
        if ((i7 & 16) != 0) {
            String str11 = c.x;
            dumx dumxVar25 = (dumx) bZ.b;
            str11.getClass();
            dumxVar25.a = 8388608 | dumxVar25.a;
            dumxVar25.z = str11;
        }
        if ((i7 & 4) != 0) {
            String str12 = c.v;
            dumx dumxVar26 = (dumx) bZ.b;
            str12.getClass();
            dumxVar26.a |= 16777216;
            dumxVar26.A = str12;
        }
        if ((c.a & 2097152) != 0) {
            dumv dumvVar = c.p;
            if (dumvVar == null) {
                dumvVar = dumv.c;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar27 = (dumx) bZ.b;
            dumvVar.getClass();
            dumxVar27.B = dumvVar;
            dumxVar27.a |= 33554432;
        }
        if ((c.b & 4096) != 0) {
            boolean z2 = c.E;
            dumx dumxVar28 = (dumx) bZ.b;
            dumxVar28.a |= 1073741824;
            dumxVar28.G = z2;
            dump dumpVar = dumxVar28.I;
            if (dumpVar == null) {
                dumpVar = dump.e;
            }
            dsqp dsqpVar = (dsqp) dumpVar.cu(5);
            dsqpVar.bC(dumpVar);
            dumm dummVar = (dumm) dsqpVar;
            boolean z3 = c.E;
            if (dummVar.c) {
                dummVar.bF();
                dummVar.c = false;
            }
            dump dumpVar2 = (dump) dummVar.b;
            dumpVar2.a |= 1;
            dumpVar2.b = z3;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar29 = (dumx) bZ.b;
            dump bK = dummVar.bK();
            bK.getClass();
            dumxVar29.I = bK;
            dumxVar29.b |= 1;
        }
        if ((c.b & 16384) != 0) {
            dump dumpVar3 = ((dumx) bZ.b).I;
            if (dumpVar3 == null) {
                dumpVar3 = dump.e;
            }
            dsqp dsqpVar2 = (dsqp) dumpVar3.cu(5);
            dsqpVar2.bC(dumpVar3);
            dumm dummVar2 = (dumm) dsqpVar2;
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
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar30 = (dumx) bZ.b;
            dump bK2 = dummVar2.bK();
            bK2.getClass();
            dumxVar30.I = bK2;
            dumxVar30.b |= 1;
        }
        if ((c.a & 67108864) != 0) {
            int i8 = c.s ? 2 : 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar31 = (dumx) bZ.b;
            dumxVar31.p = i8 - 1;
            dumxVar31.a |= 8192;
        }
        if ((c.b & ImageMetadata.SHADING_MODE) != 0) {
            dump dumpVar5 = ((dumx) bZ.b).I;
            if (dumpVar5 == null) {
                dumpVar5 = dump.e;
            }
            dsqp dsqpVar3 = (dsqp) dumpVar5.cu(5);
            dsqpVar3.bC(dumpVar5);
            dumm dummVar3 = (dumm) dsqpVar3;
            long j4 = c.K;
            if (dummVar3.c) {
                dummVar3.bF();
                dummVar3.c = false;
            }
            dump dumpVar6 = (dump) dummVar3.b;
            dumpVar6.a |= 2;
            dumpVar6.c = j4;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar32 = (dumx) bZ.b;
            dump bK3 = dummVar3.bK();
            bK3.getClass();
            dumxVar32.I = bK3;
            dumxVar32.b = 1 | dumxVar32.b;
        }
        if ((c.a & 4096) != 0) {
            String str13 = c.k;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar33 = (dumx) bZ.b;
            str13.getClass();
            dumxVar33.b |= 2;
            dumxVar33.J = str13;
        }
        if ((c.b & 2097152) != 0) {
            String str14 = c.L;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar34 = (dumx) bZ.b;
            str14.getClass();
            dumxVar34.b |= 4;
            dumxVar34.K = str14;
        }
        if ((c.b & 4194304) != 0) {
            dumt b3 = dumt.b(c.M);
            if (b3 == null) {
                b3 = dumt.UNKNOWN_LOCATION_SHARING_STATE;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar35 = (dumx) bZ.b;
            dumxVar35.M = b3.e;
            dumxVar35.b |= 16;
        }
        if ((c.b & 16777216) != 0) {
            dumr dumrVar = c.O;
            if (dumrVar == null) {
                dumrVar = dumr.c;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar36 = (dumx) bZ.b;
            dumrVar.getClass();
            dumxVar36.N = dumrVar;
            dumxVar36.b |= 32;
        }
        if ((c.b & 67108864) != 0) {
            dhmr dhmrVar = c.Q;
            if (dhmrVar == null) {
                dhmrVar = dhmr.i;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar37 = (dumx) bZ.b;
            dhmrVar.getClass();
            dumxVar37.O = dhmrVar;
            dumxVar37.b |= 128;
        }
        dssj dssjVar = this.a;
        if (dssjVar instanceof dunb) {
            dumz dumzVar = ((dunb) dssjVar).c;
            if (dumzVar == null) {
                dumzVar = dumz.i;
            }
            boolean z4 = dumzVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumx dumxVar38 = (dumx) bZ.b;
            int i9 = dumxVar38.a | 16384;
            dumxVar38.a = i9;
            dumxVar38.q = z4;
            boolean z5 = dumzVar.c;
            int i10 = i9 | 32768;
            dumxVar38.a = i10;
            dumxVar38.r = z5;
            boolean z6 = dumzVar.d;
            int i11 = i10 | ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            dumxVar38.a = i11;
            dumxVar38.s = z6;
            boolean z7 = dumzVar.e;
            int i12 = i11 | 131072;
            dumxVar38.a = i12;
            dumxVar38.t = z7;
            if ((dumzVar.a & 32) != 0) {
                String str15 = dumzVar.g;
                str15.getClass();
                dumxVar38.a = Integer.MIN_VALUE | i12;
                dumxVar38.H = str15;
            }
        }
        return bZ.bK();
    }

    private static String e() {
        return bvom.a(Locale.getDefault());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc A[Catch: all -> 0x0337, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0021, B:7:0x0032, B:8:0x0043, B:14:0x008e, B:15:0x00a8, B:18:0x00bc, B:20:0x00d7, B:22:0x00e5, B:23:0x00ea, B:24:0x00f5, B:26:0x00fd, B:27:0x0102, B:29:0x011a, B:30:0x011f, B:32:0x0133, B:34:0x0137, B:35:0x013c, B:36:0x014b, B:38:0x0153, B:39:0x0158, B:41:0x0174, B:43:0x0183, B:44:0x0188, B:45:0x0193, B:47:0x0199, B:49:0x01a7, B:50:0x01ac, B:51:0x01b8, B:53:0x01c2, B:54:0x01c7, B:56:0x01e2, B:58:0x01f4, B:59:0x01f9, B:84:0x02e3, B:86:0x031b, B:88:0x032c, B:60:0x0214, B:62:0x0218, B:64:0x022a, B:65:0x022f, B:66:0x024a, B:68:0x024e, B:70:0x0260, B:71:0x0265, B:72:0x0280, B:74:0x0289, B:75:0x029c, B:77:0x02ab, B:78:0x02b4, B:80:0x02c7, B:81:0x02d2, B:83:0x02d8, B:11:0x007d, B:13:0x0088), top: B:92:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0280 A[Catch: all -> 0x0337, TryCatch #0 {, blocks: (B:5:0x0021, B:7:0x0032, B:8:0x0043, B:14:0x008e, B:15:0x00a8, B:18:0x00bc, B:20:0x00d7, B:22:0x00e5, B:23:0x00ea, B:24:0x00f5, B:26:0x00fd, B:27:0x0102, B:29:0x011a, B:30:0x011f, B:32:0x0133, B:34:0x0137, B:35:0x013c, B:36:0x014b, B:38:0x0153, B:39:0x0158, B:41:0x0174, B:43:0x0183, B:44:0x0188, B:45:0x0193, B:47:0x0199, B:49:0x01a7, B:50:0x01ac, B:51:0x01b8, B:53:0x01c2, B:54:0x01c7, B:56:0x01e2, B:58:0x01f4, B:59:0x01f9, B:84:0x02e3, B:86:0x031b, B:88:0x032c, B:60:0x0214, B:62:0x0218, B:64:0x022a, B:65:0x022f, B:66:0x024a, B:68:0x024e, B:70:0x0260, B:71:0x0265, B:72:0x0280, B:74:0x0289, B:75:0x029c, B:77:0x02ab, B:78:0x02b4, B:80:0x02c7, B:81:0x02d2, B:83:0x02d8, B:11:0x007d, B:13:0x0088), top: B:92:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031b A[Catch: all -> 0x0337, TryCatch #0 {, blocks: (B:5:0x0021, B:7:0x0032, B:8:0x0043, B:14:0x008e, B:15:0x00a8, B:18:0x00bc, B:20:0x00d7, B:22:0x00e5, B:23:0x00ea, B:24:0x00f5, B:26:0x00fd, B:27:0x0102, B:29:0x011a, B:30:0x011f, B:32:0x0133, B:34:0x0137, B:35:0x013c, B:36:0x014b, B:38:0x0153, B:39:0x0158, B:41:0x0174, B:43:0x0183, B:44:0x0188, B:45:0x0193, B:47:0x0199, B:49:0x01a7, B:50:0x01ac, B:51:0x01b8, B:53:0x01c2, B:54:0x01c7, B:56:0x01e2, B:58:0x01f4, B:59:0x01f9, B:84:0x02e3, B:86:0x031b, B:88:0x032c, B:60:0x0214, B:62:0x0218, B:64:0x022a, B:65:0x022f, B:66:0x024a, B:68:0x024e, B:70:0x0260, B:71:0x0265, B:72:0x0280, B:74:0x0289, B:75:0x029c, B:77:0x02ab, B:78:0x02b4, B:80:0x02c7, B:81:0x02d2, B:83:0x02d8, B:11:0x007d, B:13:0x0088), top: B:92:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032c A[Catch: all -> 0x0337, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0021, B:7:0x0032, B:8:0x0043, B:14:0x008e, B:15:0x00a8, B:18:0x00bc, B:20:0x00d7, B:22:0x00e5, B:23:0x00ea, B:24:0x00f5, B:26:0x00fd, B:27:0x0102, B:29:0x011a, B:30:0x011f, B:32:0x0133, B:34:0x0137, B:35:0x013c, B:36:0x014b, B:38:0x0153, B:39:0x0158, B:41:0x0174, B:43:0x0183, B:44:0x0188, B:45:0x0193, B:47:0x0199, B:49:0x01a7, B:50:0x01ac, B:51:0x01b8, B:53:0x01c2, B:54:0x01c7, B:56:0x01e2, B:58:0x01f4, B:59:0x01f9, B:84:0x02e3, B:86:0x031b, B:88:0x032c, B:60:0x0214, B:62:0x0218, B:64:0x022a, B:65:0x022f, B:66:0x024a, B:68:0x024e, B:70:0x0260, B:71:0x0265, B:72:0x0280, B:74:0x0289, B:75:0x029c, B:77:0x02ab, B:78:0x02b4, B:80:0x02c7, B:81:0x02d2, B:83:0x02d8, B:11:0x007d, B:13:0x0088), top: B:92:0x0021 }] */
    @Override // defpackage.buir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dehn<S> a(defpackage.buic r18, defpackage.btzu r19) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bubt.a(buic, btzu):dehn");
    }
}
