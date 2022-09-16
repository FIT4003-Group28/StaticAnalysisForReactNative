package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Process;
import android.os.health.HealthStats;
import java.util.Collections;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: uuo  reason: default package */
/* loaded from: classes4.dex */
public class uuo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static uve e(Long l, Long l2, HealthStats healthStats, azyz azyzVar, uup uupVar) {
        uvg uvgVar = uupVar.b;
        aopa createBuilder = azzj.a.createBuilder();
        long e = uut.e(healthStats, 10001);
        long j = 0;
        if (e != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar = (azzj) createBuilder.instance;
            azzjVar.b |= 1;
            azzjVar.d = e;
        }
        long e2 = uut.e(healthStats, 10002);
        if (e2 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar2 = (azzj) createBuilder.instance;
            azzjVar2.b |= 2;
            azzjVar2.e = e2;
        }
        long e3 = uut.e(healthStats, 10003);
        if (e3 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar3 = (azzj) createBuilder.instance;
            azzjVar3.b |= 4;
            azzjVar3.f = e3;
        }
        long e4 = uut.e(healthStats, 10004);
        if (e4 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar4 = (azzj) createBuilder.instance;
            azzjVar4.b |= 8;
            azzjVar4.g = e4;
        }
        createBuilder.bR(uut.f(healthStats, 10005));
        createBuilder.bS(uut.f(healthStats, 10006));
        createBuilder.bT(uut.f(healthStats, 10007));
        createBuilder.bQ(uut.f(healthStats, 10008));
        createBuilder.bP(uut.f(healthStats, 10009));
        createBuilder.bL(uut.f(healthStats, 10010));
        azzi i = uut.i(healthStats, 10011);
        if (i != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar5 = (azzj) createBuilder.instance;
            azzjVar5.n = i;
            azzjVar5.b |= 16;
        }
        createBuilder.bM(uut.f(healthStats, 10012));
        createBuilder.bO(uva.a.d(uut.g(healthStats, 10014)));
        createBuilder.bN(uuz.a.d(uut.g(healthStats, 10015)));
        long e5 = uut.e(healthStats, 10016);
        if (e5 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar6 = (azzj) createBuilder.instance;
            azzjVar6.b |= 32;
            azzjVar6.s = e5;
        }
        long e6 = uut.e(healthStats, 10017);
        if (e6 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar7 = (azzj) createBuilder.instance;
            azzjVar7.b |= 64;
            azzjVar7.t = e6;
        }
        long e7 = uut.e(healthStats, 10018);
        if (e7 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar8 = (azzj) createBuilder.instance;
            azzjVar8.b |= 128;
            azzjVar8.u = e7;
        }
        long e8 = uut.e(healthStats, 10019);
        if (e8 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar9 = (azzj) createBuilder.instance;
            azzjVar9.b |= 256;
            azzjVar9.v = e8;
        }
        long e9 = uut.e(healthStats, 10020);
        if (e9 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar10 = (azzj) createBuilder.instance;
            azzjVar10.b |= 512;
            azzjVar10.w = e9;
        }
        long e10 = uut.e(healthStats, 10021);
        if (e10 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar11 = (azzj) createBuilder.instance;
            azzjVar11.b |= 1024;
            azzjVar11.x = e10;
        }
        long e11 = uut.e(healthStats, 10022);
        if (e11 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar12 = (azzj) createBuilder.instance;
            azzjVar12.b |= 2048;
            azzjVar12.y = e11;
        }
        long e12 = uut.e(healthStats, 10023);
        if (e12 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar13 = (azzj) createBuilder.instance;
            azzjVar13.b |= 4096;
            azzjVar13.z = e12;
        }
        long e13 = uut.e(healthStats, 10024);
        if (e13 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar14 = (azzj) createBuilder.instance;
            azzjVar14.b |= 8192;
            azzjVar14.A = e13;
        }
        long e14 = uut.e(healthStats, 10025);
        if (e14 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar15 = (azzj) createBuilder.instance;
            azzjVar15.b |= 16384;
            azzjVar15.B = e14;
        }
        long e15 = uut.e(healthStats, 10026);
        if (e15 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar16 = (azzj) createBuilder.instance;
            azzjVar16.b |= 32768;
            azzjVar16.C = e15;
        }
        long e16 = uut.e(healthStats, 10027);
        if (e16 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar17 = (azzj) createBuilder.instance;
            azzjVar17.b |= 65536;
            azzjVar17.D = e16;
        }
        long e17 = uut.e(healthStats, 10028);
        if (e17 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar18 = (azzj) createBuilder.instance;
            azzjVar18.b |= 131072;
            azzjVar18.E = e17;
        }
        long e18 = uut.e(healthStats, 10029);
        if (e18 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar19 = (azzj) createBuilder.instance;
            azzjVar19.b |= 262144;
            azzjVar19.F = e18;
        }
        azzi i2 = uut.i(healthStats, 10030);
        if (i2 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar20 = (azzj) createBuilder.instance;
            azzjVar20.G = i2;
            azzjVar20.b |= 524288;
        }
        long e19 = uut.e(healthStats, 10031);
        if (e19 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar21 = (azzj) createBuilder.instance;
            azzjVar21.b |= 1048576;
            azzjVar21.H = e19;
        }
        azzi i3 = uut.i(healthStats, 10032);
        if (i3 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar22 = (azzj) createBuilder.instance;
            azzjVar22.I = i3;
            azzjVar22.b |= 2097152;
        }
        azzi i4 = uut.i(healthStats, 10033);
        if (i4 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar23 = (azzj) createBuilder.instance;
            azzjVar23.f135J = i4;
            azzjVar23.b |= 4194304;
        }
        azzi i5 = uut.i(healthStats, 10034);
        if (i5 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar24 = (azzj) createBuilder.instance;
            azzjVar24.K = i5;
            azzjVar24.b |= 8388608;
        }
        azzi i6 = uut.i(healthStats, 10035);
        if (i6 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar25 = (azzj) createBuilder.instance;
            azzjVar25.L = i6;
            azzjVar25.b |= 16777216;
        }
        azzi i7 = uut.i(healthStats, 10036);
        if (i7 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar26 = (azzj) createBuilder.instance;
            azzjVar26.M = i7;
            azzjVar26.b |= 33554432;
        }
        azzi i8 = uut.i(healthStats, 10037);
        if (i8 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar27 = (azzj) createBuilder.instance;
            azzjVar27.N = i8;
            azzjVar27.b |= 67108864;
        }
        azzi i9 = uut.i(healthStats, 10038);
        if (i9 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar28 = (azzj) createBuilder.instance;
            azzjVar28.O = i9;
            azzjVar28.b |= 134217728;
        }
        azzi i10 = uut.i(healthStats, 10039);
        if (i10 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar29 = (azzj) createBuilder.instance;
            azzjVar29.P = i10;
            azzjVar29.b |= 268435456;
        }
        azzi i11 = uut.i(healthStats, 10040);
        if (i11 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar30 = (azzj) createBuilder.instance;
            azzjVar30.Q = i11;
            azzjVar30.b |= 536870912;
        }
        azzi i12 = uut.i(healthStats, 10041);
        if (i12 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar31 = (azzj) createBuilder.instance;
            azzjVar31.R = i12;
            azzjVar31.b |= 1073741824;
        }
        azzi i13 = uut.i(healthStats, 10042);
        if (i13 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar32 = (azzj) createBuilder.instance;
            azzjVar32.S = i13;
            azzjVar32.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        azzi i14 = uut.i(healthStats, 10043);
        if (i14 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar33 = (azzj) createBuilder.instance;
            azzjVar33.T = i14;
            azzjVar33.c |= 1;
        }
        azzi i15 = uut.i(healthStats, 10044);
        if (i15 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar34 = (azzj) createBuilder.instance;
            azzjVar34.U = i15;
            azzjVar34.c |= 2;
        }
        long e20 = uut.e(healthStats, 10045);
        if (e20 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar35 = (azzj) createBuilder.instance;
            azzjVar35.c |= 4;
            azzjVar35.V = e20;
        }
        long e21 = uut.e(healthStats, 10046);
        if (e21 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar36 = (azzj) createBuilder.instance;
            azzjVar36.c |= 8;
            azzjVar36.W = e21;
        }
        long e22 = uut.e(healthStats, 10047);
        if (e22 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar37 = (azzj) createBuilder.instance;
            azzjVar37.c |= 16;
            azzjVar37.X = e22;
        }
        long e23 = uut.e(healthStats, 10048);
        if (e23 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar38 = (azzj) createBuilder.instance;
            azzjVar38.c |= 32;
            azzjVar38.Y = e23;
        }
        long e24 = uut.e(healthStats, 10049);
        if (e24 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar39 = (azzj) createBuilder.instance;
            azzjVar39.c |= 64;
            azzjVar39.Z = e24;
        }
        long e25 = uut.e(healthStats, 10050);
        if (e25 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar40 = (azzj) createBuilder.instance;
            azzjVar40.c |= 128;
            azzjVar40.aa = e25;
        }
        long e26 = uut.e(healthStats, 10051);
        if (e26 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar41 = (azzj) createBuilder.instance;
            azzjVar41.c |= 256;
            azzjVar41.ab = e26;
        }
        long e27 = uut.e(healthStats, 10052);
        if (e27 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar42 = (azzj) createBuilder.instance;
            azzjVar42.c |= 512;
            azzjVar42.ac = e27;
        }
        long e28 = uut.e(healthStats, 10053);
        if (e28 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar43 = (azzj) createBuilder.instance;
            azzjVar43.c |= 1024;
            azzjVar43.ad = e28;
        }
        long e29 = uut.e(healthStats, 10054);
        if (e29 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar44 = (azzj) createBuilder.instance;
            azzjVar44.c |= 2048;
            azzjVar44.ae = e29;
        }
        long e30 = uut.e(healthStats, 10055);
        if (e30 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar45 = (azzj) createBuilder.instance;
            azzjVar45.c |= 4096;
            azzjVar45.af = e30;
        }
        long e31 = uut.e(healthStats, 10056);
        if (e31 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar46 = (azzj) createBuilder.instance;
            azzjVar46.c |= 8192;
            azzjVar46.ag = e31;
        }
        long e32 = uut.e(healthStats, 10057);
        if (e32 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar47 = (azzj) createBuilder.instance;
            azzjVar47.c |= 16384;
            azzjVar47.ah = e32;
        }
        long e33 = uut.e(healthStats, 10058);
        if (e33 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar48 = (azzj) createBuilder.instance;
            azzjVar48.c = 32768 | azzjVar48.c;
            azzjVar48.ai = e33;
        }
        long e34 = uut.e(healthStats, 10059);
        if (e34 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar49 = (azzj) createBuilder.instance;
            azzjVar49.c |= 65536;
            azzjVar49.aj = e34;
        }
        azzi i16 = uut.i(healthStats, 10061);
        if (i16 != null) {
            createBuilder.copyOnWrite();
            azzj azzjVar50 = (azzj) createBuilder.instance;
            azzjVar50.ak = i16;
            azzjVar50.c |= 131072;
        }
        long e35 = uut.e(healthStats, 10062);
        if (e35 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar51 = (azzj) createBuilder.instance;
            azzjVar51.c |= 262144;
            azzjVar51.al = e35;
        }
        long e36 = uut.e(healthStats, 10063);
        if (e36 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar52 = (azzj) createBuilder.instance;
            azzjVar52.c = 524288 | azzjVar52.c;
            azzjVar52.am = e36;
        }
        long e37 = uut.e(healthStats, 10064);
        if (e37 != 0) {
            createBuilder.copyOnWrite();
            azzj azzjVar53 = (azzj) createBuilder.instance;
            azzjVar53.c |= 1048576;
            azzjVar53.an = e37;
        }
        aopa mo52toBuilder = ((azzj) createBuilder.mo39build()).mo52toBuilder();
        uux uuxVar = uvgVar.b;
        Collections.unmodifiableList(((azzj) mo52toBuilder.instance).h);
        for (int i17 = 0; i17 < ((azzj) mo52toBuilder.instance).h.size(); i17++) {
            mo52toBuilder.bY(i17, uuxVar.b(uuw.WAKELOCK, mo52toBuilder.bI(i17)));
        }
        Collections.unmodifiableList(((azzj) mo52toBuilder.instance).i);
        for (int i18 = 0; i18 < ((azzj) mo52toBuilder.instance).i.size(); i18++) {
            mo52toBuilder.bZ(i18, uuxVar.b(uuw.WAKELOCK, mo52toBuilder.bJ(i18)));
        }
        Collections.unmodifiableList(((azzj) mo52toBuilder.instance).j);
        for (int i19 = 0; i19 < ((azzj) mo52toBuilder.instance).j.size(); i19++) {
            mo52toBuilder.ca(i19, uuxVar.b(uuw.WAKELOCK, mo52toBuilder.bK(i19)));
        }
        Collections.unmodifiableList(((azzj) mo52toBuilder.instance).k);
        for (int i20 = 0; i20 < ((azzj) mo52toBuilder.instance).k.size(); i20++) {
            mo52toBuilder.bX(i20, uuxVar.b(uuw.WAKELOCK, mo52toBuilder.bH(i20)));
        }
        Collections.unmodifiableList(((azzj) mo52toBuilder.instance).l);
        for (int i21 = 0; i21 < ((azzj) mo52toBuilder.instance).l.size(); i21++) {
            mo52toBuilder.bW(i21, uuxVar.b(uuw.SYNC, mo52toBuilder.bG(i21)));
        }
        Collections.unmodifiableList(((azzj) mo52toBuilder.instance).m);
        for (int i22 = 0; i22 < ((azzj) mo52toBuilder.instance).m.size(); i22++) {
            mo52toBuilder.bU(i22, uuxVar.b(uuw.JOB, mo52toBuilder.bE(i22)));
        }
        Collections.unmodifiableList(((azzj) mo52toBuilder.instance).o);
        for (int i23 = 0; i23 < ((azzj) mo52toBuilder.instance).o.size(); i23++) {
            mo52toBuilder.bV(i23, uuxVar.b(uuw.SENSOR, mo52toBuilder.bF(i23)));
        }
        azzj azzjVar54 = (azzj) mo52toBuilder.mo39build();
        String str = uupVar.d;
        if (str != null) {
            j = str.hashCode();
        }
        return new uve(azzjVar54, l, l2, 391164026L, Long.valueOf(j), azyzVar, null, null);
    }

    public static baaf f(Context context) {
        return g(null, context);
    }

    public static baaf g(String str, Context context) {
        aopa createBuilder = baaf.a.createBuilder();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        createBuilder.copyOnWrite();
        baaf baafVar = (baaf) createBuilder.instance;
        baafVar.b |= 1;
        baafVar.c = elapsedCpuTime;
        boolean c = uul.c(context);
        createBuilder.copyOnWrite();
        baaf baafVar2 = (baaf) createBuilder.instance;
        baafVar2.b |= 2;
        baafVar2.d = c;
        int activeCount = Thread.activeCount();
        createBuilder.copyOnWrite();
        baaf baafVar3 = (baaf) createBuilder.instance;
        baafVar3.b |= 4;
        baafVar3.e = activeCount;
        if (str != null) {
            createBuilder.copyOnWrite();
            baaf baafVar4 = (baaf) createBuilder.instance;
            baafVar4.b |= 8;
            baafVar4.f = str;
        }
        return (baaf) createBuilder.mo39build();
    }

    public static Activity h(Context context) {
        context.getClass();
        if (!(context instanceof Service) && !(context instanceof Application)) {
            for (int i = 0; i < 1000; i++) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return (Activity) context;
                }
            }
        }
        return null;
    }

    public void a(amuk amukVar) {
    }

    public void b(Object obj) {
    }

    public void c() {
    }

    @Deprecated
    public void d(amuk amukVar) {
    }
}
