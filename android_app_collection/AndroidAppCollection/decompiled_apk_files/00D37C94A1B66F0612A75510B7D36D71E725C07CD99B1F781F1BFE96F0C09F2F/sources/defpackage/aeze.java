package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeze  reason: default package */
/* loaded from: classes.dex */
public final class aeze implements pry, afjp, aeyu {
    static final long a = TimeUnit.HOURS.toMicros(4);
    private final long B;
    private final aqwt E;
    private int F;
    private final yrj I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f38J;
    private final aexg[] K;
    private final afjz L;
    private final String b;
    private final pjc c;
    private final asv d;
    private final pvf e;
    private final afhh f;
    private final aezq g;
    private final int h;
    private final aezd k;
    private final aezk l;
    private final boolean n;
    private final long o;
    private final PlayerConfigModel p;
    private final aeun q;
    private aezg r;
    private aezp s;
    private Exception t;
    private boolean u;
    private final long w;
    private long x;
    private final long y;
    private long z;
    private final Map i = new HashMap();
    private final Map j = new HashMap();
    private long v = -9223372036854775807L;
    private long A = -9223372036854775807L;
    private long C = -9223372036854775807L;
    private long D = -1;
    private int G = 0;
    private long H = -9223372036854775807L;

    public aeze(PlayerConfigModel playerConfigModel, FormatStreamModel[] formatStreamModelArr, afjm afjmVar, aeun aeunVar, atk atkVar, aezk aezkVar, pvf pvfVar, afhh afhhVar, aezq aezqVar, String str, int i, boolean z, boolean z2, pjc pjcVar, aexg[] aexgVarArr, yrj yrjVar, afjz afjzVar) {
        aqwt aqwtVar;
        Long l;
        long j = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        long j2 = -1;
        int i2 = 1;
        afms.b(formatStreamModelArr.length > 0);
        this.b = str;
        asv c = afjmVar.c(this, str, ampq.i(formatStreamModelArr[0].b));
        this.d = c;
        if (atkVar != null) {
            c.b(atkVar);
        }
        this.q = aeunVar;
        this.l = aezkVar;
        this.e = pvfVar;
        this.f = afhhVar;
        this.g = aezqVar;
        this.h = i;
        this.p = playerConfigModel;
        this.k = new aezd(this);
        for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
            Format m = formatStreamModel.m();
            this.i.put(m, formatStreamModel);
            this.j.put(m, new prt(agel.q(formatStreamModel.v(), amyg.a, this), i, m));
        }
        this.u = true;
        this.n = z;
        this.F = true == z2 ? 3 : i2;
        this.c = pjcVar;
        aqwu aqwuVar = playerConfigModel.c.e;
        if (((aqwuVar == null ? aqwu.b : aqwuVar).e & 64) == 0) {
            aqwtVar = aqwt.MANIFESTLESS_SEQUENCE_METHOD_LIVE_HEAD;
        } else {
            aqwu aqwuVar2 = playerConfigModel.c.e;
            aqwtVar = aqwt.b((aqwuVar2 == null ? aqwu.b : aqwuVar2).bf);
            if (aqwtVar == null) {
                aqwtVar = aqwt.MANIFESTLESS_SEQUENCE_METHOD_UNKNOWN;
            }
        }
        this.E = aqwtVar;
        this.K = aexgVarArr;
        this.I = yrjVar;
        this.L = afjzVar;
        Long S = playerConfigModel.S();
        if (S != null) {
            this.w = S.longValue();
            aszz aszzVar = playerConfigModel.c.f114J;
            Long l2 = null;
            if (((aszzVar == null ? aszz.a : aszzVar).b & 4) != 0) {
                aszz aszzVar2 = playerConfigModel.c.f114J;
                l = Long.valueOf((aszzVar2 == null ? aszz.a : aszzVar2).e);
            } else {
                l = null;
            }
            if (l != null) {
                this.x = TimeUnit.MILLISECONDS.toMicros(l.longValue());
            }
            Long R = playerConfigModel.R();
            aszz aszzVar3 = playerConfigModel.c.f114J;
            if (((aszzVar3 == null ? aszz.a : aszzVar3).b & 8) != 0) {
                aszz aszzVar4 = playerConfigModel.c.f114J;
                l2 = Long.valueOf((aszzVar4 == null ? aszz.a : aszzVar4).f);
            }
            this.y = R != null ? R.longValue() : j2;
            this.z = l2 != null ? TimeUnit.MILLISECONDS.toMicros(l2.longValue()) : j;
        } else {
            this.w = formatStreamModelArr[0].T();
            this.y = formatStreamModelArr[0].S();
        }
        FormatStreamModel formatStreamModel2 = formatStreamModelArr[0];
        this.o = (long) (formatStreamModel2.a.y * 1000000.0d);
        double a2 = formatStreamModel2.a();
        this.B = a2 > 0.0d ? (long) (a2 * 1000000.0d) : a;
    }

    private final synchronized void A() {
        try {
            aezp aezpVar = this.s;
            aezp r = r();
            this.s = r;
            this.l.b(r);
            if (aezpVar != null || this.w == -1) {
                return;
            }
            aezk aezkVar = this.l;
            aezp aezpVar2 = this.s;
            String k = aezp.k(aezpVar2.f);
            long j = aezpVar2.g;
            long j2 = aezpVar2.h;
            long j3 = aezpVar2.i;
            long d = phk.d(aezpVar2.j);
            long d2 = phk.d(aezpVar2.k);
            String k2 = aezp.k(aezpVar2.p);
            StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 159 + String.valueOf(k2).length());
            sb.append("maxtime.");
            sb.append(k);
            sb.append(";maxsq.");
            sb.append(j);
            sb.append(";mindvrsq.");
            sb.append(j2);
            sb.append(";maxdvrsq.");
            sb.append(j3);
            sb.append(";winmin.");
            sb.append(d);
            sb.append(";winmax.");
            sb.append(d2);
            sb.append(";winutc.");
            sb.append(k2);
            String sb2 = sb.toString();
            long F = this.p.F();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 27);
            sb3.append(sb2);
            sb3.append(";start.");
            sb3.append(F);
            aezkVar.a("tmln", new aest(sb3.toString()));
        } catch (aezo e) {
            v("manifest.unparseable", e.a);
        }
    }

    private final synchronized boolean C(long j, long j2, long j3) {
        if (j == -9223372036854775807L) {
            return false;
        }
        if (j != 0) {
            if (j >= aezp.d) {
                if (j2 == 0 && j == aezp.d) {
                    return true;
                }
                aezp aezpVar = this.s;
                if (aezpVar != null && (j < aezpVar.j || j > aezpVar.k)) {
                    return true;
                }
                long j4 = this.w;
                if (j4 != -1 && j2 == j4 && j <= p(j4)) {
                    return true;
                }
                long j5 = this.y;
                if (j5 != -1 && j2 > j5 - 2) {
                    return true;
                }
                if (j3 != -1) {
                    int i = this.F;
                    if ((i == 2 || i == 3) && j2 > j3 - 2) {
                        return true;
                    }
                }
                if (this.F == 3 && this.w == -1) {
                    if (j > this.B) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private final synchronized long o(long j) {
        long j2 = this.w;
        if (j2 == -1 || this.y == -1) {
            if (this.F == 3) {
                return 0L;
            }
            if (j != -9223372036854775807L && j2 != -1) {
                long j3 = this.x;
                if (j3 == -9223372036854775807L) {
                    aezp aezpVar = this.s;
                    j3 = aezpVar != null ? aezpVar.j : -9223372036854775807L;
                }
                if (j3 != -9223372036854775807L && j <= j3) {
                    return j2;
                }
            }
            return -1L;
        }
        return j2;
    }

    private final synchronized long p(long j) {
        aezp aezpVar = this.s;
        long j2 = -9223372036854775807L;
        if (aezpVar == null) {
            long j3 = this.w;
            if (j3 != -1 && j == j3) {
                return this.x;
            }
            if (this.F != 3) {
                return -9223372036854775807L;
            }
            return j * this.o;
        }
        if (j != -1 && j >= 0) {
            long j4 = aezpVar.g;
            if (j <= j4) {
                long j5 = aezpVar.h;
                if (j >= j5 || j5 == -1) {
                    long j6 = aezpVar.i;
                    if (j <= j6 || j6 == -1) {
                        if (j5 == -1 || j != j5) {
                            long j7 = aezpVar.f;
                            long j8 = j4 - j;
                            long j9 = aezpVar.m;
                            Long.signum(j8);
                            j2 = j7 - (j8 * j9);
                        } else {
                            j2 = aezpVar.j;
                        }
                    }
                }
            }
        }
        return j2;
    }

    private final synchronized Pair q(Long l, Long l2) {
        if (l2 != null && l != null) {
            long j = -1;
            if (l2.longValue() != -1) {
                long j2 = -9223372036854775807L;
                if (l.longValue() != -9223372036854775807L && this.F != 2) {
                    if (this.D != -1 && this.v != -9223372036854775807L && l2.longValue() <= this.D) {
                        if (l.longValue() <= this.v + 40000) {
                            return null;
                        }
                    }
                    if (this.D != -1) {
                        j = l2.longValue() - this.D;
                    }
                    if (this.v != -9223372036854775807L) {
                        j2 = l.longValue() - this.v;
                    }
                    this.v = l.longValue();
                    this.D = l2.longValue();
                    this.f.j(this.v);
                    A();
                    return Pair.create(Long.valueOf(j), Long.valueOf(j2));
                }
            }
        }
        return null;
    }

    private final synchronized aezp r() {
        return new aezp(this.v, this.D, this.w, this.y, this.x, this.z, this.A, this.B, this.o, this.f.d(), this.C, this.n, this.F, this.c, this.E);
    }

    private final synchronized String s(aflw aflwVar) {
        StringBuilder sb;
        String e = aflwVar.e("x-head-seqnum");
        String e2 = aflwVar.e("x-head-time-millis");
        aezg aezgVar = this.r;
        String valueOf = String.valueOf(aezgVar != null ? Long.valueOf(aezgVar.i()) : "null");
        sb = new StringBuilder(String.valueOf(e).length() + 19 + String.valueOf(e2).length() + String.valueOf(valueOf).length());
        sb.append("headsq.");
        sb.append(e);
        sb.append(";headms.");
        sb.append(e2);
        sb.append(";sq.");
        sb.append(valueOf);
        return sb.toString();
    }

    private final synchronized void t(Long l, Long l2) {
        afms.a(this.r);
        long j = this.w;
        long j2 = this.y;
        long j3 = this.x;
        long j4 = this.z;
        String valueOf = String.valueOf(l != null ? Long.valueOf(phk.d(l.longValue())) : "null");
        String valueOf2 = String.valueOf(l2 != null ? l2 : "null");
        String valueOf3 = String.valueOf(j != -1 ? Long.valueOf(j) : "UNSET");
        String valueOf4 = String.valueOf(j2 != -1 ? Long.valueOf(j2) : "UNSET");
        String valueOf5 = String.valueOf(j3 != -9223372036854775807L ? Long.valueOf(phk.d(j3)) : "UNSET");
        String valueOf6 = String.valueOf(j4 != -9223372036854775807L ? Long.valueOf(phk.d(j4)) : "UNSET");
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 59 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("maxtime.");
        sb.append(valueOf);
        sb.append(";maxsq.");
        sb.append(valueOf2);
        sb.append(";mindvrsq.");
        sb.append(valueOf3);
        sb.append(";maxdvrsq.");
        sb.append(valueOf4);
        sb.append(";mindvrtime.");
        sb.append(valueOf5);
        sb.append(";maxdvrtime.");
        sb.append(valueOf6);
        String sb2 = sb.toString();
        aeyt aeytVar = null;
        if (l != null) {
            if (this.x != -9223372036854775807L && l.longValue() < this.x) {
                aeytVar = new aeyt(this.r.k(), "x-head-time-millis", sb2);
            } else if (this.z != -9223372036854775807L && l.longValue() < this.z) {
                aeytVar = new aeyt(this.r.k(), "x-head-time-millis", sb2);
            }
        }
        if (aeytVar == null && l2 != null) {
            if (this.w != -1 && l2.longValue() < this.w) {
                aeytVar = new aeyt(this.r.k(), "x-head-seqnum", sb2);
            } else if (this.y != -1 && l2.longValue() < this.y) {
                aeytVar = new aeyt(this.r.k(), "x-head-seqnum", sb2);
            }
        }
        if (aeytVar != null) {
            afkj.e(afki.MFL, "Track %d Stale WindowedLiveConfig: %s", Integer.valueOf(this.h), sb2);
            throw aeytVar;
        }
    }

    private final synchronized void u() {
        if (this.D == -1 || this.v == -9223372036854775807L) {
            return;
        }
        A();
    }

    private final synchronized void v(String str, String str2) {
        aezg aezgVar = this.r;
        long j = -1;
        if (aezgVar != null && aezgVar.j() != -9223372036854775807L) {
            j = phk.d(this.r.j());
        }
        final aezk aezkVar = this.l;
        final afkn afknVar = new afkn(str, j, str2);
        aezkVar.a.post(new Runnable() { // from class: aeyx
            @Override // java.lang.Runnable
            public final void run() {
                aeyz aeyzVar = aeyz.this;
                afkn afknVar2 = afknVar;
                aexh aexhVar = (aexh) aeyzVar.b;
                aexhVar.a.u(aexhVar.b, afknVar2);
            }
        });
    }

    private final synchronized void w(aeui aeuiVar) {
        afms.a(this.r);
        afms.b(aeuiVar.a.equals("http://youtube.com/streaming/metadata/segment/102015"));
        Integer b = aeuiVar.b("Sequence-Number");
        if (b == null) {
            throw pjq.a("Sequence-Number not found in EmbeddedMetadata", null);
        }
        if (this.r.i() == -1) {
            this.r.s(b.intValue());
            if (this.r.a == -9223372036854775807L) {
                long a2 = this.g.a(this, b.intValue());
                if (a2 != b.intValue()) {
                    afkj.e(afki.MFL, "Track %d Live head race, got sequence %d, coordinatedSequence %d", Integer.valueOf(this.h), b, Long.valueOf(a2));
                    throw new aezn(b.intValue(), a2);
                }
            }
        } else if (this.r.i() != b.intValue()) {
            long i = this.r.i();
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Expected sequence ");
            sb.append(i);
            sb.append(" got sequence ");
            sb.append(valueOf);
            throw pjq.a(sb.toString(), null);
        }
        Long c = aeuiVar.c("Ingestion-Walltime-Us");
        if (c != null) {
            this.r.q(c.longValue());
        }
        if (!"T".equals(aeuiVar.d("Stream-Finished"))) {
            return;
        }
        this.r.t = true;
    }

    private final synchronized void x() {
        this.G = 0;
        this.H = -9223372036854775807L;
    }

    private final synchronized void y(long j) {
        long j2;
        long j3;
        afms.a(this.r);
        long j4 = this.r.a - j;
        double d = j4;
        double d2 = this.o;
        Double.isNaN(d);
        Double.isNaN(d2);
        long floor = (long) Math.floor(d / d2);
        aezg aezgVar = this.r;
        String str = aezgVar.h.a;
        long j5 = this.D;
        long j6 = this.v;
        long j7 = aezgVar.a;
        long i = aezgVar.i();
        int i2 = this.G;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 202);
        sb.append("fmt.");
        sb.append(str);
        sb.append(";liveSeq.");
        sb.append(j5);
        sb.append(";liveMs.");
        sb.append(j6 / 1000);
        sb.append(";seekMs.");
        sb.append(j7 / 1000);
        sb.append(";loadedMs.");
        sb.append(j / 1000);
        sb.append(";loadedSeq.");
        sb.append(i);
        sb.append(";errorChunks.");
        sb.append(floor);
        sb.append(";misses.");
        sb.append(i2);
        this.l.a("skms", new aest(sb.toString()));
        afki afkiVar = afki.MFL;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(this.h);
        objArr[1] = Long.valueOf(this.r.i());
        double d3 = j;
        Double.isNaN(d3);
        objArr[2] = Double.valueOf(d3 / 1000000.0d);
        objArr[3] = Long.valueOf(floor);
        afkj.e(afkiVar, "Track %d Seek miss, loaded sequence %d starts at time %.1f sec, errorChunks %d", objArr);
        long i3 = this.r.i();
        long j8 = this.o;
        long max = Math.max(i3 + floor, 0L);
        Long.signum(floor);
        long max2 = Math.max(j + (j8 * floor), aezp.d);
        long j9 = this.w;
        if (j9 != -1) {
            max = Math.max(max, j9);
        }
        long j10 = this.y;
        if (j10 != -1) {
            max = Math.min(max, j10);
        }
        aezp aezpVar = this.s;
        if (aezpVar != null) {
            max = Math.min(max, aezpVar.A(aezpVar.k));
        }
        long j11 = this.x;
        if (j11 != -9223372036854775807L) {
            max2 = Math.max(max2, j11);
        }
        long j12 = this.z;
        if (j12 != -9223372036854775807L) {
            max2 = Math.min(max2, j12);
        }
        long j13 = this.v;
        if (j13 != -9223372036854775807L) {
            max2 = Math.min(max2, j13);
        }
        long abs = Math.abs(j4);
        if (max != this.r.i()) {
            long j14 = this.H;
            if ((j14 == -9223372036854775807L || abs < j14) && this.G < 8) {
                j2 = max2;
                j3 = max;
                this.G++;
                this.H = abs;
                throw new aeyr(this.r.a, floor, j3, j2);
            }
        }
        j2 = -9223372036854775807L;
        j3 = -1;
        this.G++;
        this.H = abs;
        throw new aeyr(this.r.a, floor, j3, j2);
    }

    private final synchronized void z(long j) {
        long p = p(j);
        long j2 = this.o;
        aalz b = aalz.b(this.r.k().a);
        b.a.j("headm");
        b.f(j);
        this.r.t(j, p, afbz.b(p, j2), b.a());
    }

    @Override // defpackage.afjp
    public final synchronized void D(int i, Map map) {
        afms.a(this.r);
        aflw aflwVar = new aflw(map);
        Long b = aflwVar.b();
        Long a2 = aflwVar.a();
        try {
            if (a2 != null && a2.longValue() >= 0 && b != null && b.longValue() >= 0) {
                if (this.p.aA(aqws.EXO_PLAYER_CONFIG_FEATURES_LOG_HTTP_HEADER_DECREASED) && this.D != -1 && this.v != -9223372036854775807L && (a2.longValue() < this.D || b.longValue() + this.o < this.v)) {
                    aezk aezkVar = this.l;
                    int i2 = this.h;
                    long j = this.D;
                    long d = phk.d(this.v);
                    String s = s(aflwVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 70);
                    sb.append("trk.");
                    sb.append(i2);
                    sb.append(";maxsq.");
                    sb.append(j);
                    sb.append(";maxms.");
                    sb.append(d);
                    sb.append(";");
                    sb.append(s);
                    aezkVar.a("lvhead", new aest(sb.toString()));
                }
                t(b, a2);
                q(b, a2);
                this.r.o(i, aflwVar);
            }
            this.r.o(i, aflwVar);
        } catch (afkb e) {
            throw new aeyp(e, TimeUnit.MICROSECONDS.toMillis(this.o));
        }
        this.l.a("lvhead", new aest(s(aflwVar)));
        t(b, a2);
        q(b, a2);
    }

    @Override // defpackage.pry
    public final int a(long j, List list) {
        return this.e.a(j, list);
    }

    @Override // defpackage.pry
    public final long b(long j, pkh pkhVar) {
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7 A[Catch: all -> 0x0308, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0014, B:8:0x0026, B:39:0x0081, B:41:0x0089, B:43:0x008f, B:45:0x00c9, B:49:0x00d0, B:51:0x00e0, B:106:0x01dd, B:107:0x01e2, B:109:0x01f2, B:111:0x0202, B:113:0x020c, B:114:0x020f, B:112:0x0207, B:115:0x0210, B:121:0x021f, B:123:0x0228, B:125:0x0232, B:126:0x0234, B:128:0x0265, B:130:0x0275, B:132:0x027f, B:133:0x0282, B:131:0x027a, B:136:0x0287, B:142:0x029e, B:145:0x02a7, B:147:0x02ac, B:146:0x02aa, B:137:0x028b, B:53:0x00fd, B:56:0x0118, B:58:0x011c, B:60:0x0120, B:63:0x012f, B:69:0x014f, B:72:0x015c, B:74:0x0162, B:76:0x016a, B:78:0x0172, B:82:0x0189, B:87:0x0193, B:91:0x019d, B:94:0x01a7, B:99:0x01ba, B:80:0x0182, B:11:0x002f, B:21:0x004d, B:24:0x0053, B:26:0x0057, B:34:0x0076, B:28:0x0063, B:31:0x006b, B:14:0x0037, B:17:0x003f, B:19:0x0043), top: B:155:0x0009 }] */
    @Override // defpackage.pry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(long r40, long r42, java.util.List r44, defpackage.prw r45) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeze.c(long, long, java.util.List, prw):void");
    }

    @Override // defpackage.pry
    public final void d() {
    }

    @Override // defpackage.pry
    public final synchronized void e(pru pruVar) {
        if ((pruVar instanceof aezg) && pruVar == this.r) {
            aezg aezgVar = (aezg) pruVar;
            if (this.F == 1 && aezgVar.t) {
                this.F = 2;
                this.D = aezgVar.i();
                this.v = aezgVar.j();
                this.A = aezgVar.g();
                afki afkiVar = afki.ABR;
                aezgVar.i();
                aezgVar.j();
                aezgVar.g();
                this.f.i(aezgVar.j());
                u();
            }
        }
    }

    @Override // defpackage.pry
    public final void f() {
        for (prt prtVar : this.j.values()) {
            prtVar.f();
        }
    }

    @Override // defpackage.pry
    public final synchronized boolean g(pru pruVar, boolean z, axr axrVar, axs axsVar) {
        IOException iOException = axrVar.b;
        if ((pruVar instanceof aezg) && pruVar == this.r) {
            this.g.d();
            if ((iOException instanceof aezn) && z) {
                this.t = iOException;
                return true;
            }
            if ((iOException instanceof aeyr) && z) {
                this.t = iOException;
                return true;
            }
            if ((iOException instanceof aeug) && z) {
                this.t = iOException;
                return true;
            }
            if (iOException instanceof aeyo) {
                this.r.p();
                return false;
            }
            if (iOException instanceof atg) {
                afkj.e(afki.MFL, "Track %d Http status %d blocked load", Integer.valueOf(this.h), Integer.valueOf(((atg) iOException).d));
            }
            if (this.r.k().a.getQueryParameter("headm") != null) {
                if (this.r.i() != -1) {
                    z(this.r.i());
                } else {
                    aezg aezgVar = this.r;
                    aezgVar.u(aezgVar.k().a);
                }
            }
        }
        if (!z) {
            return false;
        }
        axq b = axsVar.b(afbx.d(this.e), axrVar);
        if (this.L.Q() && b != null) {
            pvf pvfVar = this.e;
            if (pvfVar.q(pvfVar.l(pruVar.h), b.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pry
    public final void h() {
        this.e.s();
    }

    @Override // defpackage.aeyu
    public final synchronized void i(aeui aeuiVar) {
        afms.a(this.r);
        this.r.n(aeuiVar);
        if (aeuiVar.a.equals("http://youtube.com/streaming/metadata/segment/102015")) {
            if (aeuiVar.b("Sequence-Number") != null) {
                w(aeuiVar);
                return;
            }
            throw pjq.a("Sequence-Number not found in EmbeddedMetadata", null);
        }
    }

    @Override // defpackage.aeyu
    public final synchronized void j(IOException iOException) {
        n(iOException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long k(long j) {
        aezp aezpVar = this.s;
        if (aezpVar != null) {
            return aezpVar.A(j);
        }
        long j2 = this.x;
        if (j2 != -9223372036854775807L && j == j2) {
            return this.w;
        }
        if (this.F != 3 || j == 0 || j == 0 || j < aezp.d || this.w != -1 || j >= this.B) {
            return -1L;
        }
        return j / this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized aeug l() {
        Exception exc = this.t;
        if (exc instanceof aeug) {
            return (aeug) exc;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0225, code lost:
        if (r0 != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m(long r20) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeze.m(long):void");
    }

    public final synchronized void n(IOException iOException) {
        this.k.c = iOException;
    }

    private final synchronized boolean B(long j) {
        aezg aezgVar = this.r;
        if (aezgVar != null) {
            long j2 = aezgVar.a;
            if (j2 != -9223372036854775807L) {
                long j3 = this.o;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    long j4 = j2 - j;
                    if (j4 >= 0) {
                        if (j4 <= 0) {
                            return false;
                        }
                        aezp aezpVar = this.s;
                        if (aezpVar != null && j2 > aezpVar.h() && this.y == -1) {
                            afki afkiVar = afki.MFL;
                            Object[] objArr = new Object[3];
                            objArr[0] = Integer.valueOf(this.h);
                            double d = this.r.a;
                            Double.isNaN(d);
                            objArr[1] = Double.valueOf(d / 1000000.0d);
                            double d2 = this.s.k;
                            Double.isNaN(d2);
                            objArr[2] = Double.valueOf(d2 / 1000000.0d);
                            afkj.e(afkiVar, "Track %d seekTime %.1f sec is after windowMaxMediaTimeUs = %.1f sec.", objArr);
                            return true;
                        }
                        long j5 = this.o;
                        return j4 >= j5 + j5;
                    } else if (j4 >= -40000) {
                        return false;
                    } else {
                        if (this.w != -1 && aezgVar.i() == this.w) {
                            return false;
                        }
                        aezp aezpVar2 = this.s;
                        if (aezpVar2 == null || this.r.a >= aezpVar2.j || this.w != -1) {
                            return true;
                        }
                        afki afkiVar2 = afki.MFL;
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = Integer.valueOf(this.h);
                        double d3 = this.r.a;
                        Double.isNaN(d3);
                        objArr2[1] = Double.valueOf(d3 / 1000000.0d);
                        double d4 = this.s.j;
                        Double.isNaN(d4);
                        objArr2[2] = Double.valueOf(d4 / 1000000.0d);
                        afkj.e(afkiVar2, "Track %d seekTime %.1f sec is before windowMinMediaTime = %.1f sec. Ignoring seek.", objArr2);
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
