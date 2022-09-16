package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.List;
/* compiled from: PG */
/* renamed from: afex  reason: default package */
/* loaded from: classes.dex */
public final class afex {
    public final afgt a;
    private final yrj d;
    private final afmq e;
    private final snc f;
    private final afmw g;
    private final adzt h;
    private final aepf i;
    private final afme j;
    private final Context k;
    private final afhf l;
    private final zah m;
    private PowerManager n;
    private PlayerConfigModel p;
    private final afjz r;
    private final agpr s;
    public aeub b = aeub.a;
    public int c = -1;
    private long o = -9223372036854775807L;
    private aoob q = null;

    public afex(yrj yrjVar, snc sncVar, afmw afmwVar, afjz afjzVar, afmq afmqVar, adzt adztVar, aepf aepfVar, agpr agprVar, Context context, afhf afhfVar, zah zahVar, byte[] bArr, byte[] bArr2) {
        this.d = yrjVar;
        this.r = afjzVar;
        this.e = afmqVar;
        this.f = sncVar;
        this.g = afmwVar;
        this.h = adztVar;
        this.i = aepfVar;
        this.s = agprVar;
        this.j = afjzVar.j;
        this.k = context;
        this.l = afhfVar;
        this.m = zahVar;
        this.a = new afgt(sncVar);
    }

    public static int h(int i) {
        if (i != 1) {
            if (i == 2) {
                return 21;
            }
            return i != 3 ? 1 : 31;
        }
        return 11;
    }

    private final aopa i(PlayerConfigModel playerConfigModel) {
        aopa createBuilder = oqu.a.createBuilder();
        aqlv f = this.d.f();
        createBuilder.copyOnWrite();
        oqu oquVar = (oqu) createBuilder.instance;
        oquVar.f = f.B;
        oquVar.b |= 8;
        afmp g = this.e.g(2);
        long c = this.f.c();
        long j = g.e;
        if (j != -1) {
            int i = g.d;
            createBuilder.copyOnWrite();
            oqu oquVar2 = (oqu) createBuilder.instance;
            oquVar2.b = 2 | oquVar2.b;
            oquVar2.d = i;
            int i2 = g.b;
            createBuilder.copyOnWrite();
            oqu oquVar3 = (oqu) createBuilder.instance;
            oquVar3.b |= 4;
            oquVar3.e = i2;
            createBuilder.copyOnWrite();
            oqu oquVar4 = (oqu) createBuilder.instance;
            oquVar4.b |= 1;
            oquVar4.c = c - j;
        }
        afmv afmvVar = (afmv) this.g.get();
        int i3 = afmvVar.c;
        if (i3 > 0 && afmvVar.d > 0) {
            createBuilder.copyOnWrite();
            oqu oquVar5 = (oqu) createBuilder.instance;
            oquVar5.b |= 16;
            oquVar5.g = i3;
            int i4 = afmvVar.d;
            createBuilder.copyOnWrite();
            oqu oquVar6 = (oqu) createBuilder.instance;
            oquVar6.b |= 32;
            oquVar6.h = i4;
            boolean z = afmvVar.b;
            createBuilder.copyOnWrite();
            oqu oquVar7 = (oqu) createBuilder.instance;
            oquVar7.b |= 256;
            oquVar7.k = z;
        }
        List U = playerConfigModel.U();
        if (!U.isEmpty() && U.contains(Integer.valueOf(this.d.a()))) {
            long K = playerConfigModel.K() / 8;
            if (K != -1) {
                createBuilder.copyOnWrite();
                oqu oquVar8 = (oqu) createBuilder.instance;
                oquVar8.b |= 64;
                oquVar8.i = K;
                if (playerConfigModel.af()) {
                    createBuilder.copyOnWrite();
                    oqu oquVar9 = (oqu) createBuilder.instance;
                    oquVar9.b |= 268435456;
                    oquVar9.z = (int) K;
                }
            }
        }
        atyc a = this.h.a();
        if (a != atyc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN) {
            createBuilder.copyOnWrite();
            oqu oquVar10 = (oqu) createBuilder.instance;
            oquVar10.p = a.n;
            oquVar10.b |= 8192;
        }
        aepk j2 = this.i.j();
        if (j2.c == 1) {
            long j3 = j2.b;
            createBuilder.copyOnWrite();
            oqu oquVar11 = (oqu) createBuilder.instance;
            oquVar11.b |= 512;
            oquVar11.l = j3 / 8;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = (PowerManager) this.k.getSystemService("power");
            }
            PowerManager powerManager = this.n;
            if (powerManager != null) {
                boolean isPowerSaveMode = powerManager.isPowerSaveMode();
                createBuilder.copyOnWrite();
                oqu oquVar12 = (oqu) createBuilder.instance;
                oquVar12.b |= 65536;
                oquVar12.s = isPowerSaveMode;
            }
            if (this.o != -9223372036854775807L) {
                long d = this.f.d() - this.o;
                createBuilder.copyOnWrite();
                oqu oquVar13 = (oqu) createBuilder.instance;
                oquVar13.b |= 32768;
                oquVar13.r = d;
            }
        }
        if (this.r.q().s) {
            orb orbVar = (orb) this.l.b().get();
            createBuilder.copyOnWrite();
            oqu oquVar14 = (oqu) createBuilder.instance;
            orbVar.getClass();
            oquVar14.x = orbVar;
            oquVar14.b |= 8388608;
        }
        long a2 = this.m.a();
        if (a2 != -1) {
            createBuilder.copyOnWrite();
            oqu oquVar15 = (oqu) createBuilder.instance;
            oquVar15.b |= 16777216;
            oquVar15.y = a2;
        }
        int i5 = this.c;
        createBuilder.copyOnWrite();
        oqu oquVar16 = (oqu) createBuilder.instance;
        oquVar16.b |= 524288;
        oquVar16.u = i5;
        return createBuilder;
    }

    public final oqu a(PlayerConfigModel playerConfigModel, boolean z, long j, String str) {
        aopa i = i(playerConfigModel);
        Long l = str == null ? null : (Long) this.a.b.c(str);
        if (l != null) {
            long d = this.f.d();
            long longValue = l.longValue();
            i.copyOnWrite();
            oqu oquVar = (oqu) i.instance;
            oqu oquVar2 = oqu.a;
            oquVar.b |= 2097152;
            oquVar.v = d - longValue;
        }
        if (j != -9223372036854775807L) {
            i.copyOnWrite();
            oqu oquVar3 = (oqu) i.instance;
            oqu oquVar4 = oqu.a;
            oquVar3.b |= 16384;
            oquVar3.q = j;
        }
        if (z) {
            int i2 = this.e.g(2).b;
            i.copyOnWrite();
            oqu oquVar5 = (oqu) i.instance;
            oqu oquVar6 = oqu.a;
            oquVar5.b |= 128;
            oquVar5.j = i2;
        }
        if (this.e.f()) {
            awan b = this.e.b(str);
            i.copyOnWrite();
            oqu oquVar7 = (oqu) i.instance;
            oqu oquVar8 = oqu.a;
            oquVar7.o = b.e;
            oquVar7.b |= 4096;
        }
        return (oqu) i.mo39build();
    }

    public final oqu b(PlayerConfigModel playerConfigModel, int i, int i2, boolean z, int i3, String str, ampq ampqVar) {
        aopa i4 = i(playerConfigModel);
        if (ampqVar.h()) {
            afmv afmvVar = (afmv) ampqVar.c();
            int i5 = afmvVar.d;
            i4.copyOnWrite();
            oqu oquVar = (oqu) i4.instance;
            oqu oquVar2 = oqu.a;
            oquVar.b |= 32;
            oquVar.h = i5;
            int i6 = afmvVar.c;
            i4.copyOnWrite();
            oqu oquVar3 = (oqu) i4.instance;
            oquVar3.b |= 16;
            oquVar3.g = i6;
            boolean z2 = afmvVar.b;
            i4.copyOnWrite();
            oqu oquVar4 = (oqu) i4.instance;
            oquVar4.b |= 256;
            oquVar4.k = z2;
        }
        if (this.r.p().t) {
            i4.copyOnWrite();
            oqu oquVar5 = (oqu) i4.instance;
            oqu oquVar6 = oqu.a;
            oquVar5.m = h(i) - 1;
            oquVar5.b |= 1024;
            i4.copyOnWrite();
            oqu oquVar7 = (oqu) i4.instance;
            oquVar7.n = h(i2) - 1;
            oquVar7.b |= 2048;
        }
        if (z) {
            i4.copyOnWrite();
            oqu oquVar8 = (oqu) i4.instance;
            oqu oquVar9 = oqu.a;
            oquVar8.b |= 128;
            oquVar8.j = i3;
        }
        if (this.e.f()) {
            awan b = this.e.b(str);
            i4.copyOnWrite();
            oqu oquVar10 = (oqu) i4.instance;
            oqu oquVar11 = oqu.a;
            oquVar10.o = b.e;
            oquVar10.b |= 4096;
        }
        if (this.r.n().I) {
            this.s.j();
            i4.copyOnWrite();
            oqu oquVar12 = (oqu) i4.instance;
            oqu oquVar13 = oqu.a;
            oquVar12.b |= 4194304;
            oquVar12.w = false;
        }
        if (this.r.n().L || this.r.n().H) {
            boolean i7 = this.j.a.i();
            boolean q = this.j.a.q();
            aqlv f = this.d.f();
            int i8 = 2;
            if (i7 && !q) {
                i8 = 3;
            }
            i4.copyOnWrite();
            oqu oquVar14 = (oqu) i4.instance;
            int i9 = i8 - 1;
            oqu oquVar15 = oqu.a;
            oquVar14.t = i9;
            oquVar14.b |= 131072;
            String name = f.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 40);
            sb.append("ncn.");
            sb.append(i7);
            sb.append(";ntu.");
            sb.append(q);
            sb.append(";nms.");
            sb.append(i9);
            sb.append(";dnt.");
            sb.append(name);
            this.b.e("nms", sb.toString());
        }
        return (oqu) i4.mo39build();
    }

    public final synchronized PlayerConfigModel c() {
        return this.p;
    }

    public final synchronized aoob d() {
        return this.q;
    }

    public final synchronized void e() {
        this.o = this.f.d();
    }

    public final synchronized void f(aoob aoobVar) {
        this.q = aoobVar;
    }

    public final synchronized void g(PlayerConfigModel playerConfigModel) {
        this.p = playerConfigModel;
    }
}
