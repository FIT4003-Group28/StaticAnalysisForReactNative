package defpackage;

import android.os.health.HealthStats;
import com.google.ar.core.ImageMetadata;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: cwva  reason: default package */
/* loaded from: classes5.dex */
public final class cwva {
    final Long a;
    final Long b;
    @dzsi
    final HealthStats c;
    @dzsi
    final dzyb d;
    @dzsi
    final String e;
    final Boolean f;
    final /* synthetic */ cwvb g;

    public cwva(cwvb cwvbVar, Long l, Long l2, HealthStats healthStats, dzyb dzybVar, String str, Boolean bool) {
        this.g = cwvbVar;
        this.a = l;
        this.b = l2;
        this.c = healthStats;
        this.d = dzybVar;
        this.e = str;
        this.f = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cwwa a() {
        cwwd cwwdVar = this.g.a;
        HealthStats healthStats = this.c;
        dzyt bZ = dzyu.an.bZ();
        long i = cwvu.i(healthStats, 10001);
        long j = 0;
        if (i != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar = (dzyu) bZ.b;
            dzyuVar.a |= 1;
            dzyuVar.c = i;
        }
        long i2 = cwvu.i(healthStats, 10002);
        if (i2 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar2 = (dzyu) bZ.b;
            dzyuVar2.a |= 2;
            dzyuVar2.d = i2;
        }
        long i3 = cwvu.i(healthStats, 10003);
        if (i3 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar3 = (dzyu) bZ.b;
            dzyuVar3.a |= 4;
            dzyuVar3.e = i3;
        }
        long i4 = cwvu.i(healthStats, 10004);
        if (i4 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar4 = (dzyu) bZ.b;
            dzyuVar4.a |= 8;
            dzyuVar4.f = i4;
        }
        bZ.n(cwvu.k(healthStats, 10005));
        bZ.o(cwvu.k(healthStats, 10006));
        bZ.p(cwvu.k(healthStats, 10007));
        bZ.m(cwvu.k(healthStats, 10008));
        bZ.l(cwvu.k(healthStats, 10009));
        bZ.h(cwvu.k(healthStats, 10010));
        dzys j2 = cwvu.j(healthStats, 10011);
        if (j2 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar5 = (dzyu) bZ.b;
            j2.getClass();
            dzyuVar5.m = j2;
            dzyuVar5.a |= 16;
        }
        bZ.i(cwvu.k(healthStats, 10012));
        bZ.k(cwvq.a.e(cwvu.l(healthStats, 10014)));
        bZ.j(cwvp.a.e(cwvu.l(healthStats, 10015)));
        long i5 = cwvu.i(healthStats, 10016);
        if (i5 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar6 = (dzyu) bZ.b;
            dzyuVar6.a |= 32;
            dzyuVar6.r = i5;
        }
        long i6 = cwvu.i(healthStats, 10017);
        if (i6 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar7 = (dzyu) bZ.b;
            dzyuVar7.a |= 64;
            dzyuVar7.s = i6;
        }
        long i7 = cwvu.i(healthStats, 10018);
        if (i7 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar8 = (dzyu) bZ.b;
            dzyuVar8.a |= 128;
            dzyuVar8.t = i7;
        }
        long i8 = cwvu.i(healthStats, 10019);
        if (i8 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar9 = (dzyu) bZ.b;
            dzyuVar9.a |= 256;
            dzyuVar9.u = i8;
        }
        long i9 = cwvu.i(healthStats, 10020);
        if (i9 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar10 = (dzyu) bZ.b;
            dzyuVar10.a |= 512;
            dzyuVar10.v = i9;
        }
        long i10 = cwvu.i(healthStats, 10021);
        if (i10 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar11 = (dzyu) bZ.b;
            dzyuVar11.a |= 1024;
            dzyuVar11.w = i10;
        }
        long i11 = cwvu.i(healthStats, 10022);
        if (i11 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar12 = (dzyu) bZ.b;
            dzyuVar12.a |= 2048;
            dzyuVar12.x = i11;
        }
        long i12 = cwvu.i(healthStats, 10023);
        if (i12 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar13 = (dzyu) bZ.b;
            dzyuVar13.a |= 4096;
            dzyuVar13.y = i12;
        }
        long i13 = cwvu.i(healthStats, 10024);
        if (i13 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar14 = (dzyu) bZ.b;
            dzyuVar14.a |= 8192;
            dzyuVar14.z = i13;
        }
        long i14 = cwvu.i(healthStats, 10025);
        if (i14 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar15 = (dzyu) bZ.b;
            dzyuVar15.a |= 16384;
            dzyuVar15.A = i14;
        }
        long i15 = cwvu.i(healthStats, 10026);
        if (i15 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar16 = (dzyu) bZ.b;
            dzyuVar16.a |= 32768;
            dzyuVar16.B = i15;
        }
        long i16 = cwvu.i(healthStats, 10027);
        if (i16 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar17 = (dzyu) bZ.b;
            dzyuVar17.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            dzyuVar17.C = i16;
        }
        long i17 = cwvu.i(healthStats, 10028);
        if (i17 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar18 = (dzyu) bZ.b;
            dzyuVar18.a |= 131072;
            dzyuVar18.D = i17;
        }
        long i18 = cwvu.i(healthStats, 10029);
        if (i18 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar19 = (dzyu) bZ.b;
            dzyuVar19.a |= 262144;
            dzyuVar19.E = i18;
        }
        dzys j3 = cwvu.j(healthStats, 10030);
        if (j3 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar20 = (dzyu) bZ.b;
            j3.getClass();
            dzyuVar20.F = j3;
            dzyuVar20.a |= ImageMetadata.LENS_APERTURE;
        }
        long i19 = cwvu.i(healthStats, 10031);
        if (i19 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar21 = (dzyu) bZ.b;
            dzyuVar21.a |= ImageMetadata.SHADING_MODE;
            dzyuVar21.G = i19;
        }
        dzys j4 = cwvu.j(healthStats, 10032);
        if (j4 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar22 = (dzyu) bZ.b;
            j4.getClass();
            dzyuVar22.H = j4;
            dzyuVar22.a |= 2097152;
        }
        dzys j5 = cwvu.j(healthStats, 10033);
        if (j5 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar23 = (dzyu) bZ.b;
            j5.getClass();
            dzyuVar23.I = j5;
            dzyuVar23.a |= 4194304;
        }
        dzys j6 = cwvu.j(healthStats, 10034);
        if (j6 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar24 = (dzyu) bZ.b;
            j6.getClass();
            dzyuVar24.J = j6;
            dzyuVar24.a |= 8388608;
        }
        dzys j7 = cwvu.j(healthStats, 10035);
        if (j7 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar25 = (dzyu) bZ.b;
            j7.getClass();
            dzyuVar25.K = j7;
            dzyuVar25.a |= 16777216;
        }
        dzys j8 = cwvu.j(healthStats, 10036);
        if (j8 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar26 = (dzyu) bZ.b;
            j8.getClass();
            dzyuVar26.L = j8;
            dzyuVar26.a |= 33554432;
        }
        dzys j9 = cwvu.j(healthStats, 10037);
        if (j9 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar27 = (dzyu) bZ.b;
            j9.getClass();
            dzyuVar27.M = j9;
            dzyuVar27.a |= 67108864;
        }
        dzys j10 = cwvu.j(healthStats, 10038);
        if (j10 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar28 = (dzyu) bZ.b;
            j10.getClass();
            dzyuVar28.N = j10;
            dzyuVar28.a |= 134217728;
        }
        dzys j11 = cwvu.j(healthStats, 10039);
        if (j11 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar29 = (dzyu) bZ.b;
            j11.getClass();
            dzyuVar29.O = j11;
            dzyuVar29.a |= 268435456;
        }
        dzys j12 = cwvu.j(healthStats, 10040);
        if (j12 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar30 = (dzyu) bZ.b;
            j12.getClass();
            dzyuVar30.P = j12;
            dzyuVar30.a |= 536870912;
        }
        dzys j13 = cwvu.j(healthStats, 10041);
        if (j13 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar31 = (dzyu) bZ.b;
            j13.getClass();
            dzyuVar31.Q = j13;
            dzyuVar31.a |= 1073741824;
        }
        dzys j14 = cwvu.j(healthStats, 10042);
        if (j14 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar32 = (dzyu) bZ.b;
            j14.getClass();
            dzyuVar32.R = j14;
            dzyuVar32.a |= Integer.MIN_VALUE;
        }
        dzys j15 = cwvu.j(healthStats, 10043);
        if (j15 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar33 = (dzyu) bZ.b;
            j15.getClass();
            dzyuVar33.S = j15;
            dzyuVar33.b |= 1;
        }
        dzys j16 = cwvu.j(healthStats, 10044);
        if (j16 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar34 = (dzyu) bZ.b;
            j16.getClass();
            dzyuVar34.T = j16;
            dzyuVar34.b |= 2;
        }
        long i20 = cwvu.i(healthStats, 10045);
        if (i20 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar35 = (dzyu) bZ.b;
            dzyuVar35.b |= 4;
            dzyuVar35.U = i20;
        }
        long i21 = cwvu.i(healthStats, 10046);
        if (i21 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar36 = (dzyu) bZ.b;
            dzyuVar36.b |= 8;
            dzyuVar36.V = i21;
        }
        long i22 = cwvu.i(healthStats, 10047);
        if (i22 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar37 = (dzyu) bZ.b;
            dzyuVar37.b |= 16;
            dzyuVar37.W = i22;
        }
        long i23 = cwvu.i(healthStats, 10048);
        if (i23 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar38 = (dzyu) bZ.b;
            dzyuVar38.b |= 32;
            dzyuVar38.X = i23;
        }
        long i24 = cwvu.i(healthStats, 10049);
        if (i24 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar39 = (dzyu) bZ.b;
            dzyuVar39.b |= 64;
            dzyuVar39.Y = i24;
        }
        long i25 = cwvu.i(healthStats, 10050);
        if (i25 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar40 = (dzyu) bZ.b;
            dzyuVar40.b |= 128;
            dzyuVar40.Z = i25;
        }
        long i26 = cwvu.i(healthStats, 10051);
        if (i26 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar41 = (dzyu) bZ.b;
            dzyuVar41.b |= 256;
            dzyuVar41.aa = i26;
        }
        long i27 = cwvu.i(healthStats, 10052);
        if (i27 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar42 = (dzyu) bZ.b;
            dzyuVar42.b |= 512;
            dzyuVar42.ab = i27;
        }
        long i28 = cwvu.i(healthStats, 10053);
        if (i28 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar43 = (dzyu) bZ.b;
            dzyuVar43.b |= 1024;
            dzyuVar43.ac = i28;
        }
        long i29 = cwvu.i(healthStats, 10054);
        if (i29 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar44 = (dzyu) bZ.b;
            dzyuVar44.b |= 2048;
            dzyuVar44.ad = i29;
        }
        long i30 = cwvu.i(healthStats, 10055);
        if (i30 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar45 = (dzyu) bZ.b;
            dzyuVar45.b |= 4096;
            dzyuVar45.ae = i30;
        }
        long i31 = cwvu.i(healthStats, 10056);
        if (i31 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar46 = (dzyu) bZ.b;
            dzyuVar46.b |= 8192;
            dzyuVar46.af = i31;
        }
        long i32 = cwvu.i(healthStats, 10057);
        if (i32 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar47 = (dzyu) bZ.b;
            dzyuVar47.b |= 16384;
            dzyuVar47.ag = i32;
        }
        long i33 = cwvu.i(healthStats, 10058);
        if (i33 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar48 = (dzyu) bZ.b;
            dzyuVar48.b = 32768 | dzyuVar48.b;
            dzyuVar48.ah = i33;
        }
        long i34 = cwvu.i(healthStats, 10059);
        if (i34 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar49 = (dzyu) bZ.b;
            dzyuVar49.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            dzyuVar49.ai = i34;
        }
        dzys j17 = cwvu.j(healthStats, 10061);
        if (j17 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar50 = (dzyu) bZ.b;
            j17.getClass();
            dzyuVar50.aj = j17;
            dzyuVar50.b |= 131072;
        }
        long i35 = cwvu.i(healthStats, 10062);
        if (i35 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar51 = (dzyu) bZ.b;
            dzyuVar51.b = 262144 | dzyuVar51.b;
            dzyuVar51.ak = i35;
        }
        long i36 = cwvu.i(healthStats, 10063);
        if (i36 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar52 = (dzyu) bZ.b;
            dzyuVar52.b |= ImageMetadata.LENS_APERTURE;
            dzyuVar52.al = i36;
        }
        long i37 = cwvu.i(healthStats, 10064);
        if (i37 != 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzyu dzyuVar53 = (dzyu) bZ.b;
            dzyuVar53.b |= ImageMetadata.SHADING_MODE;
            dzyuVar53.am = i37;
        }
        dzyu bK = bZ.bK();
        dsqp dsqpVar = (dsqp) bK.cu(5);
        dsqpVar.bC(bK);
        dzyt dzytVar = (dzyt) dsqpVar;
        cwvn cwvnVar = cwwdVar.b;
        Collections.unmodifiableList(((dzyu) dzytVar.b).g);
        for (int i38 = 0; i38 < ((dzyu) dzytVar.b).g.size(); i38++) {
            dzytVar.z(i38, cwvnVar.c(1, dzytVar.a(i38)));
        }
        Collections.unmodifiableList(((dzyu) dzytVar.b).h);
        for (int i39 = 0; i39 < ((dzyu) dzytVar.b).h.size(); i39++) {
            dzytVar.A(i39, cwvnVar.c(1, dzytVar.b(i39)));
        }
        Collections.unmodifiableList(((dzyu) dzytVar.b).i);
        for (int i40 = 0; i40 < ((dzyu) dzytVar.b).i.size(); i40++) {
            dzytVar.B(i40, cwvnVar.c(1, dzytVar.c(i40)));
        }
        Collections.unmodifiableList(((dzyu) dzytVar.b).j);
        for (int i41 = 0; i41 < ((dzyu) dzytVar.b).j.size(); i41++) {
            dzytVar.y(i41, cwvnVar.c(1, dzytVar.d(i41)));
        }
        Collections.unmodifiableList(((dzyu) dzytVar.b).k);
        for (int i42 = 0; i42 < ((dzyu) dzytVar.b).k.size(); i42++) {
            dzytVar.v(i42, cwvnVar.c(2, dzytVar.e(i42)));
        }
        Collections.unmodifiableList(((dzyu) dzytVar.b).l);
        for (int i43 = 0; i43 < ((dzyu) dzytVar.b).l.size(); i43++) {
            dzytVar.s(i43, cwvnVar.c(3, dzytVar.f(i43)));
        }
        Collections.unmodifiableList(((dzyu) dzytVar.b).n);
        for (int i44 = 0; i44 < ((dzyu) dzytVar.b).n.size(); i44++) {
            dzytVar.u(i44, cwvnVar.c(5, dzytVar.g(i44)));
        }
        dzyu bK2 = dzytVar.bK();
        Long l = this.a;
        Long l2 = this.b;
        String str = this.g.c;
        if (str != null) {
            j = str.hashCode();
        }
        return new cwwa(bK2, l, l2, 341489692L, Long.valueOf(j), this.d, this.e, this.f, null);
    }
}
