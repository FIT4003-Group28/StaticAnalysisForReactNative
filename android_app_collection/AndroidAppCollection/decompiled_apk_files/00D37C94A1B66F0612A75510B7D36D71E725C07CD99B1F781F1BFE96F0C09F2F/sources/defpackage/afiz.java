package defpackage;

import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afiz  reason: default package */
/* loaded from: classes.dex */
public final class afiz implements Observer {
    private final awef A;
    private ScheduledFuture B;
    private volatile ScheduledFuture C;
    private String E;
    private int F;
    private int G;
    private String H;
    private String I;
    private boolean K;
    private boolean N;
    private long O;
    private boolean P;
    private long Q;
    private zgp R;
    private float S;
    private final boolean U;
    private long V;
    private boolean W;
    private final boolean X;
    private awan Y;
    private final afjf Z;
    private int aa;
    private final zdp ab;
    private long ac;
    private long ad;
    private aypg ae;
    public final afjd b;
    public final afil c;
    public final afin d;
    public final afiw e;
    public final CountDownLatch f;
    public final afim g;
    public final aujv h;
    public afit i;
    public int j;
    public long l;
    public boolean m;
    public int n;
    public boolean o;
    public VideoStreamingData p;
    public final boolean q;
    public Integer r;
    private final long t;
    private final snc u;
    private final afiq v;
    private final String y;
    private PlayerConfigModel z;
    private static final long s = TimeUnit.MINUTES.toMillis(10);
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    private final Runnable w = new afij(this, 1);
    private final Runnable x = new afij(this, 2);
    private int D = -1;
    public int k = -1;

    /* renamed from: J  reason: collision with root package name */
    private int f42J = -1;
    private int L = -1;
    private int M = -1;
    private boolean T = true;

    public afiz(final afjd afjdVar, snc sncVar, TrackingUrlModel trackingUrlModel, zgp zgpVar, boolean z, String str, awef awefVar, aujv aujvVar, PlayerConfigModel playerConfigModel, int i, boolean z2, zdp zdpVar, afjf afjfVar) {
        CountDownLatch countDownLatch;
        afiv[] afivVarArr;
        long j = s;
        this.V = j;
        this.Z = afjfVar;
        this.q = z2;
        this.z = playerConfigModel;
        this.y = str;
        this.A = awefVar;
        this.u = sncVar;
        this.b = afjdVar;
        this.c = new afil(this);
        afiq afiqVar = new afiq(this);
        this.v = afiqVar;
        this.d = new afin(this);
        this.R = zgpVar;
        afim afimVar = new afim(this);
        this.g = afimVar;
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        this.f = countDownLatch2;
        boolean z3 = aujvVar.A;
        this.U = z3;
        this.X = !aujvVar.E;
        this.h = aujvVar;
        if (!z2) {
            countDownLatch = countDownLatch2;
            afivVarArr = new afiv[]{new afir(this, afjdVar.i, z3), afimVar, afiqVar};
        } else {
            countDownLatch = countDownLatch2;
            afivVarArr = new afiv[]{new afir(this, afjdVar.i, false), afimVar};
        }
        afiw afiwVar = new afiw(afjdVar.k, afjdVar.l, afjdVar.j, afjdVar.m, countDownLatch, aujvVar, afivVarArr);
        this.e = afiwVar;
        afiwVar.f(aujvVar.B);
        afiwVar.d(playerConfigModel.ac());
        this.t = sncVar.d();
        afiwVar.e(trackingUrlModel);
        afiwVar.a("vc", String.valueOf(i));
        this.Q = a;
        this.ab = zdpVar;
        if (z2) {
            return;
        }
        this.n = 1;
        this.Y = afjdVar.p.i.b(str);
        this.V = ((aujvVar.c & 64) == 0 || aujvVar.h <= 0) ? j : TimeUnit.SECONDS.toMillis(aujvVar.h);
        String valueOf = String.valueOf(afit.NOT_STARTED);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
        sb.append("0.000:");
        sb.append(valueOf);
        afiwVar.a("vps", sb.toString());
        this.i = afit.NOT_STARTED;
        if (z) {
            afiwVar.a("ctmp", "ttr");
        }
        this.P = false;
        this.j = -1;
        this.G = -1;
        this.aa = -1;
        afjdVar.j.execute(new Runnable() { // from class: afik
            @Override // java.lang.Runnable
            public final void run() {
                aeaa aeaaVar;
                afiz afizVar = afiz.this;
                afjd afjdVar2 = afjdVar;
                afin afinVar = afizVar.d;
                aeab aeabVar = afjdVar2.o;
                pdi pdiVar = aeabVar.b;
                long d = pdiVar != null ? pdiVar.d() : -1L;
                pdi pdiVar2 = aeabVar.b;
                long e = pdiVar2 != null ? pdiVar2.e() : -1L;
                azqb azqbVar = aeabVar.a;
                File file = azqbVar != null ? (File) azqbVar.get() : null;
                if (file == null) {
                    aeaaVar = new aeaa(d, e, -1L, -1L);
                } else {
                    aeaaVar = new aeaa(d, e, file.getFreeSpace(), file.getTotalSpace());
                }
                long j2 = aeaaVar.a;
                if (j2 != -1) {
                    long j3 = aeaaVar.b;
                    if (j3 == -1) {
                        return;
                    }
                    long j4 = aeaaVar.c;
                    if (j4 == -1) {
                        return;
                    }
                    long j5 = aeaaVar.d;
                    if (j5 == -1) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder(97);
                    sb2.append("du:used.");
                    sb2.append(j2);
                    sb2.append(".");
                    sb2.append(j3);
                    sb2.append(";avail.");
                    sb2.append(j4);
                    sb2.append(".");
                    sb2.append(j5);
                    afinVar.b.e.a("ctmp", sb2.toString());
                }
            }
        });
    }

    private final void K(String str) {
        String d = d();
        if (d != null) {
            afiw afiwVar = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + d.length());
            sb.append(str);
            sb.append(":");
            sb.append(d);
            afiwVar.a("cmt", sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0102 A[Catch: all -> 0x019a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0052, B:8:0x0058, B:9:0x005a, B:11:0x005f, B:13:0x0065, B:14:0x0067, B:16:0x006b, B:18:0x0071, B:19:0x0073, B:49:0x00fe, B:51:0x0102, B:53:0x010a, B:54:0x0131, B:58:0x013b, B:60:0x013f, B:62:0x0149, B:64:0x0152, B:66:0x016a, B:63:0x014e, B:68:0x017d, B:71:0x0182, B:73:0x0186, B:75:0x018c, B:22:0x0079, B:24:0x008c, B:25:0x008e, B:27:0x0092, B:28:0x00aa, B:30:0x00b0, B:31:0x00b2, B:33:0x00b6, B:37:0x00cb, B:36:0x00c3, B:38:0x00ce, B:40:0x00d4, B:41:0x00d6, B:43:0x00da, B:47:0x00f0, B:46:0x00e7, B:48:0x00f3), top: B:83:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017d A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0052, B:8:0x0058, B:9:0x005a, B:11:0x005f, B:13:0x0065, B:14:0x0067, B:16:0x006b, B:18:0x0071, B:19:0x0073, B:49:0x00fe, B:51:0x0102, B:53:0x010a, B:54:0x0131, B:58:0x013b, B:60:0x013f, B:62:0x0149, B:64:0x0152, B:66:0x016a, B:63:0x014e, B:68:0x017d, B:71:0x0182, B:73:0x0186, B:75:0x018c, B:22:0x0079, B:24:0x008c, B:25:0x008e, B:27:0x0092, B:28:0x00aa, B:30:0x00b0, B:31:0x00b2, B:33:0x00b6, B:37:0x00cb, B:36:0x00c3, B:38:0x00ce, B:40:0x00d4, B:41:0x00d6, B:43:0x00da, B:47:0x00f0, B:46:0x00e7, B:48:0x00f3), top: B:83:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182 A[Catch: all -> 0x019a, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0052, B:8:0x0058, B:9:0x005a, B:11:0x005f, B:13:0x0065, B:14:0x0067, B:16:0x006b, B:18:0x0071, B:19:0x0073, B:49:0x00fe, B:51:0x0102, B:53:0x010a, B:54:0x0131, B:58:0x013b, B:60:0x013f, B:62:0x0149, B:64:0x0152, B:66:0x016a, B:63:0x014e, B:68:0x017d, B:71:0x0182, B:73:0x0186, B:75:0x018c, B:22:0x0079, B:24:0x008c, B:25:0x008e, B:27:0x0092, B:28:0x00aa, B:30:0x00b0, B:31:0x00b2, B:33:0x00b6, B:37:0x00cb, B:36:0x00c3, B:38:0x00ce, B:40:0x00d4, B:41:0x00d6, B:43:0x00da, B:47:0x00f0, B:46:0x00e7, B:48:0x00f3), top: B:83:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void L(java.lang.String r12, defpackage.aehr r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afiz.L(java.lang.String, aehr, boolean):void");
    }

    private final synchronized void M(afit afitVar) {
        N(afitVar, true);
    }

    private final synchronized void N(afit afitVar, boolean z) {
        if (this.i.equals(afitVar)) {
            return;
        }
        ScheduledFuture scheduledFuture = this.B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.B = null;
        }
        String e = e();
        L(e, (aehr) ((amqo) this.b.f.get()).get(), z);
        afiw afiwVar = this.e;
        String valueOf = String.valueOf(afitVar);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + String.valueOf(valueOf).length());
        sb.append(e);
        sb.append(":");
        sb.append(valueOf);
        afiwVar.a("vps", sb.toString());
        this.i = afitVar;
        if (afitVar != afit.PLAYING) {
            return;
        }
        if (this.n == 1 && (this.U || this.z.ac())) {
            this.e.h();
        }
        P();
    }

    private final synchronized void O() {
        BatteryManager batteryManager;
        int intProperty;
        this.C = this.b.e.schedule(this.x, this.Q, TimeUnit.MILLISECONDS);
        apgr apgrVar = this.h.C;
        if (apgrVar == null) {
            apgrVar = apgr.a;
        }
        if (apgrVar.d && this.ae == null && (batteryManager = this.ab.a) != null && (intProperty = batteryManager.getIntProperty(2)) != Integer.MIN_VALUE && (Build.VERSION.SDK_INT >= 28 || intProperty != 0)) {
            this.ae = this.ab.c.as(new ayqb() { // from class: afii
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    afiz.this.n((zdm) obj);
                }
            });
        }
    }

    private final synchronized void P() {
        this.B = this.b.e.schedule(this.w, this.V, TimeUnit.MILLISECONDS);
    }

    private static boolean Q(aujv aujvVar, auju aujuVar) {
        return new aops(aujvVar.D, aujv.a).contains(aujuVar);
    }

    public final void A() {
        this.P = false;
        M(afit.PLAYING);
        if (Build.VERSION.SDK_INT >= 23) {
            apgr apgrVar = this.h.C;
            if (apgrVar == null) {
                apgrVar = apgr.a;
            }
            if (!apgrVar.b) {
                return;
            }
            H(((adzt) this.b.n.get()).a().n);
        }
    }

    public final void B() {
        M(afit.SEEKING);
    }

    public final void C(String str, String str2) {
        if (TextUtils.equals("cat", str)) {
            this.e.a("cat", amps.d(str2));
        } else if (str2 == null || str2.isEmpty()) {
            this.e.a("ctmp", str);
        } else {
            afiw afiwVar = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            afiwVar.a("ctmp", sb.toString());
        }
    }

    public final void D(int i) {
        if (i != this.D) {
            afiw afiwVar = this.e;
            String e = e();
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
            sb.append(e);
            sb.append(":");
            sb.append(i);
            afiwVar.a("sur", sb.toString());
            this.D = i;
        }
    }

    public final void E(awan awanVar) {
        String str;
        this.Y = awanVar;
        awan awanVar2 = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
        int ordinal = awanVar.ordinal();
        if (ordinal == 1) {
            str = "Q";
        } else if (ordinal == 2) {
            str = "Z";
        } else if (ordinal != 3) {
            return;
        } else {
            str = "M";
        }
        this.e.a("vfs", e() + ":" + this.j + "::" + this.j + ":" + str);
    }

    public final void F(boolean z, long j, long j2) {
        boolean z2 = true;
        if (!z && !this.N) {
            z2 = false;
        }
        this.N = z2;
        if (z2) {
            this.l = j;
            this.O = j2;
        }
        long j3 = ((aehr) ((amqo) this.b.f.get()).get()).f;
        if (j3 == -1 || this.v.b() <= 6283) {
            return;
        }
        this.v.d(j3);
    }

    public final synchronized void G() {
        if (this.C == null) {
            return;
        }
        try {
            L(e(), (aehr) ((amqo) this.b.g.get()).get(), true);
        } catch (Exception e) {
            v(new afkn(afkl.DEFAULT, "qoe.client", this.l, e));
        }
        VideoStreamingData videoStreamingData = this.p;
        if (videoStreamingData == null || !videoStreamingData.B()) {
            return;
        }
        this.e.h();
    }

    public final void H(int i) {
        apgr apgrVar = this.h.C;
        if (apgrVar == null) {
            apgrVar = apgr.a;
        }
        if (!apgrVar.b) {
            return;
        }
        int i2 = this.aa;
        if (i2 != -1 && i2 == i) {
            return;
        }
        this.aa = i;
        String e = e();
        afiw afiwVar = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
        sb.append(e);
        sb.append(":");
        sb.append(i);
        afiwVar.a("aur", sb.toString());
    }

    public final synchronized void I() {
        if (this.i == afit.PLAYING) {
            afit afitVar = afit.PLAYING;
            String e = e();
            afiw afiwVar = this.e;
            String valueOf = String.valueOf(afitVar);
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + String.valueOf(valueOf).length());
            sb.append(e);
            sb.append(":");
            sb.append(valueOf);
            afiwVar.a("vps", sb.toString());
            K(e);
            if (this.U) {
                this.e.h();
            }
            P();
        }
    }

    public final void J(long j) {
        afiw afiwVar = this.e;
        String e = e();
        String c = c(j);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 10 + String.valueOf(c).length());
        sb.append(e);
        sb.append(":feedback:");
        sb.append(c);
        afiwVar.a("error", sb.toString());
        this.e.h();
    }

    public final long a() {
        if (this.t >= 0) {
            return this.u.d() - this.t;
        }
        return 0L;
    }

    public final String b(double d, int i) {
        if (!Q(this.h, auju.QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME)) {
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(14);
            sb.append("%.");
            sb.append(i);
            sb.append("f");
            return String.format(locale, sb.toString(), Double.valueOf(d));
        }
        double d2 = i != 2 ? 1000.0d : 100.0d;
        double round = Math.round(d * d2);
        Double.isNaN(round);
        double d3 = round / d2;
        long j = (long) d3;
        if (d3 == j) {
            return Long.toString(j);
        }
        return Double.toString(d3);
    }

    public final String c(long j) {
        double d = j;
        Double.isNaN(d);
        double d2 = d / 1000.0d;
        if (Q(this.h, auju.QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME)) {
            return b(d2, 3);
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        if (!(numberInstance instanceof DecimalFormat)) {
            return String.format(Locale.US, "%.3f", Double.valueOf(d2));
        }
        ((DecimalFormat) numberInstance).applyLocalizedPattern("0.000");
        return numberInstance.format(d2);
    }

    public final String d() {
        if (this.N) {
            return c(this.l);
        }
        return null;
    }

    public final String e() {
        return c(a());
    }

    final synchronized void f() {
        if (this.C != null) {
            this.C.cancel(false);
            this.C = null;
        }
    }

    public final void g() {
        afjf afjfVar = this.Z;
        ((afja) afjfVar).a.remove(this.y);
        if (!this.q) {
            if (!this.m) {
                h(this.e.i, this.y, null, null, "", this.p, this.z);
                v(new afkn(afkl.DEFAULT, "qoe.client", this.l, "ForcedFinishCreate"));
            }
            N(afit.NOT_STARTED, false);
            this.b.d.e(this.d);
        } else {
            L(e(), null, false);
        }
        this.b.d.e(this.c);
        this.e.h();
        this.e.b();
        if (!this.q) {
            for (afis afisVar : this.b.h) {
                afisVar.a.remove(this);
            }
        }
    }

    public final void i(int i) {
        afiw afiwVar = this.e;
        String e = e();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
        sb.append(e);
        sb.append(":");
        sb.append(i);
        afiwVar.a("conn", sb.toString());
    }

    public final void j(float f) {
        if (Float.compare(this.S, f) == 0) {
            return;
        }
        this.S = f;
        String e = e();
        afiw afiwVar = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 16);
        sb.append(e);
        sb.append(":");
        sb.append(f);
        afiwVar.a("rate", sb.toString());
        L(e, (aehr) ((amqo) this.b.f.get()).get(), true);
    }

    public final void k(int i, boolean z, int i2, int i3) {
        if (i >= 0 && this.f42J != i) {
            this.f42J = i;
            afiw afiwVar = this.e;
            String e = e();
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
            sb.append(e);
            sb.append(":");
            sb.append(i);
            afiwVar.a("vis", sb.toString());
        }
        this.K = z;
        this.M = i2;
        this.L = i3;
    }

    public final void l(String str, int i) {
        int i2 = i - this.k;
        if (this.z.aA(aqws.EXO_PLAYER_CONFIG_FEATURES_DROPPED_FRAMES_CTMP_LOGGING) && i2 != 0) {
            String valueOf = String.valueOf(this.i);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(";");
            sb.append(valueOf);
            sb.append(";");
            sb.append(i2);
            C("drop", sb.toString());
        }
        if (i == -1 || this.k == -1) {
            return;
        }
        if (this.i != afit.PLAYING) {
            this.k = i;
        } else if (this.k > i) {
            if (this.X) {
                afus.e(2, 6, "QoeStatsClient: Unexpected drop in dropped frames count.", 0.01d);
            }
            afkj.a(afki.QOE, "QoeStatsClient: Unexpected drop in dropped frames count.");
        } else {
            afiw afiwVar = this.e;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
            sb2.append(str);
            sb2.append(":");
            sb2.append(i2);
            afiwVar.a("df", sb2.toString());
            afki afkiVar = afki.ABR;
            this.k = i;
        }
    }

    public final void m(String str) {
        afiw afiwVar = this.e;
        String e = e();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 3 + String.valueOf(str).length());
        sb.append(e);
        sb.append(":");
        sb.append(str);
        sb.append("::");
        afiwVar.a("ad_playback", sb.toString());
        this.e.h();
    }

    public final synchronized void n(zdm zdmVar) {
        int i = zdmVar.a;
        if (i != 0 && i != Integer.MIN_VALUE) {
            long j = this.ad;
            long j2 = zdmVar.b;
            this.ad = j + j2;
            this.ac -= j2 * i;
        }
    }

    public final void o() {
        M(afit.BUFFERING);
    }

    public final void q() {
        M(afit.ENDED);
        this.e.h();
        this.P = true;
    }

    public final void r(aesr aesrVar) {
        String p;
        Integer num;
        int i;
        int i2;
        FormatStreamModel f = aesrVar.f();
        int e = f != null ? f.e() : 0;
        String w = f != null ? f.w() : "";
        FormatStreamModel e2 = aesrVar.e();
        int e3 = e2 != null ? e2.e() : 0;
        String w2 = e2 != null ? e2.w() : "";
        FormatStreamModel d = aesrVar.d();
        int e4 = d != null ? d.e() : 0;
        int b = aesrVar.b();
        aegx g = aesrVar.g();
        if (this.Y == awan.VIDEO_QUALITY_SETTING_DATA_SAVER) {
            p = "z";
        } else if (this.Y == awan.VIDEO_QUALITY_SETTING_HIGHER_QUALITY) {
            p = "q";
        } else {
            if (g != null) {
                if (g.c() || (this.T && g.e())) {
                    p = "s";
                } else if (this.T) {
                    p = "i";
                } else if (g.d()) {
                    p = "m";
                }
            }
            p = (this.T || !(b == 1 || b == 10000)) ? agpr.p(b) : "a";
        }
        String e5 = e();
        if (!TextUtils.isEmpty(p)) {
            if (f == null && e2 == null) {
                return;
            }
            if ((e < 0 || e == this.j) && ((e4 <= 0 || e4 == this.F) && (w == null || w.equals(this.E)))) {
                num = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(e5);
                sb.append(":");
                sb.append(e);
                if (!TextUtils.isEmpty(w)) {
                    sb.append(";");
                    sb.append(w);
                }
                sb.append(":");
                sb.append(e4 != 0 ? Integer.valueOf(e4) : "");
                sb.append(":");
                int i3 = this.j;
                sb.append(i3 < 0 ? "" : Integer.valueOf(i3));
                sb.append(":");
                sb.append(p);
                this.e.a("vfs", sb.toString());
                this.F = e4;
                this.j = e;
                this.E = w;
                aesq h = aesrVar.h();
                if (h != null) {
                    long j = h.a;
                    if (this.N) {
                        afiw afiwVar = this.e;
                        Locale locale = Locale.US;
                        num = "";
                        double d2 = j;
                        Double.isNaN(d2);
                        afiwVar.a("bh", String.format(locale, "%s:%s", e5, b(d2 / 1000.0d, 2)));
                    } else {
                        num = "";
                    }
                    l(e5, h.b);
                } else {
                    num = "";
                }
                long c = aesrVar.c();
                if (c > 0) {
                    afiw afiwVar2 = this.e;
                    Locale locale2 = Locale.US;
                    double d3 = c;
                    Double.isNaN(d3);
                    afiwVar2.a("bwe", String.format(locale2, "%s:%s", e5, b(d3 / 8.0d, 2)));
                    if (this.T) {
                        afiw afiwVar3 = this.e;
                        int a2 = aesrVar.a();
                        StringBuilder sb2 = new StringBuilder(16);
                        sb2.append("ibws:");
                        sb2.append(a2);
                        afiwVar3.a("ctmp", sb2.toString());
                    }
                }
                if (this.f42J != -1 && this.K && (i = this.M) != -1 && (i2 = this.L) != -1) {
                    afiw afiwVar4 = this.e;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(e5).length() + 24);
                    sb3.append(e5);
                    sb3.append(":");
                    sb3.append(i);
                    sb3.append(":");
                    sb3.append(i2);
                    afiwVar4.a("view", sb3.toString());
                }
            }
            if ((e3 < 0 || e3 == this.G) && (w2 == null || w2.equals(this.H))) {
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(e5);
            sb4.append(":");
            sb4.append(e3);
            if (!TextUtils.isEmpty(w2)) {
                sb4.append(";");
                sb4.append(w2);
            }
            sb4.append(":");
            int i4 = this.G;
            sb4.append(i4 < 0 ? num : Integer.valueOf(i4));
            sb4.append(":");
            sb4.append(p);
            this.e.a("afs", sb4.toString());
            this.G = e3;
            this.H = w2;
            this.T = false;
        }
    }

    public final void s(String str, afip afipVar) {
        C(str, afipVar.a(this.t));
    }

    public final void t(awan awanVar) {
        if (!this.b.p.i.f()) {
            return;
        }
        this.Y = awanVar;
    }

    public final void u() {
        if (!this.W) {
            this.e.a("user_intent", e());
            this.W = true;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        this.e.a("qoealert", "1");
    }

    public final void v(afkn afknVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(e());
        sb.append(":");
        sb.append(afknVar.i());
        sb.append(":");
        if (afknVar.n()) {
            sb.append("fatal");
        }
        sb.append(":");
        sb.append(c(afknVar.a()));
        if (afknVar.k() != null) {
            sb.append(":");
            sb.append(afknVar.k());
        }
        this.e.a("error", sb.toString());
        if (afknVar.n()) {
            M(afit.ERROR);
            this.e.h();
        }
    }

    public final void w() {
        M(afit.PAUSED);
    }

    public final void x() {
        M(afit.PAUSED_BUFFERING);
    }

    public final void y() {
        N(afit.SUSPENDED, false);
        if (!this.P) {
            this.e.h();
        }
    }

    public final void z(String str, Throwable th) {
        zgp zgpVar;
        String str2 = str;
        if (!TextUtils.isEmpty(str) && (zgpVar = this.R) != null) {
            zgpVar.h("docid", str2);
        }
        if (!this.m) {
            if (str2 == null) {
                str2 = "";
            }
            h(this.e.i, this.y, null, null, str2, this.p, this.z);
        }
        v(new afkn(afkl.METADATA, "net.retryexhausted", 0L, th));
    }

    public final void p(long j, boolean z, boolean z2, String str, String str2, String str3, String str4) {
        int aW;
        if (z2) {
            aW = z ? afmg.aW(4) : afmg.aW(3);
        } else {
            aW = z ? afmg.aW(2) : afmg.aW(1);
        }
        String e = e();
        this.e.a("xvt", String.format(Locale.US, "t.%s;m.%s;g.%d;tt.%d;np.%d;c.%s;d.%s", e, c(j), 2, Integer.valueOf(aW), 0, str3, str4));
        if (!str.equals(this.y)) {
            this.e.a("adcpn", str);
            this.e.a("addocid", str2);
        }
        if (aW == afmg.aW(2) || aW == afmg.aW(4)) {
            afiw afiwVar = this.e;
            String valueOf = String.valueOf(this.i);
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + String.valueOf(valueOf).length());
            sb.append(e);
            sb.append(":");
            sb.append(valueOf);
            afiwVar.a("vps", sb.toString());
            afiw afiwVar2 = this.e;
            int i = this.f42J;
            StringBuilder sb2 = new StringBuilder(String.valueOf(e).length() + 12);
            sb2.append(e);
            sb2.append(":");
            sb2.append(i);
            afiwVar2.a("vis", sb2.toString());
            String str5 = this.I;
            if (str5 != null) {
                this.e.a("fexp", str5);
            }
        }
        this.e.h();
    }

    public final void h(TrackingUrlModel trackingUrlModel, String str, String str2, Integer num, String str3, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        if (this.m) {
            return;
        }
        boolean z = true;
        this.m = true;
        this.z = playerConfigModel;
        if (trackingUrlModel == null) {
            trackingUrlModel = this.e.i;
        } else {
            this.e.e(trackingUrlModel);
            z = false;
        }
        if (this.q) {
            this.r = num;
        }
        Uri c = trackingUrlModel.c();
        zgh.m(str);
        zgp p = agel.p(c, str, str2, str3, this.b.i, this.A);
        this.R = p;
        this.e.c(p);
        this.I = this.R.d("fexp");
        this.p = videoStreamingData;
        long j = a;
        aujw aujwVar = playerConfigModel.c.y;
        if (aujwVar == null) {
            aujwVar = aujw.a;
        }
        long j2 = aujwVar.b;
        if (j2 != 0) {
            j = j2;
        }
        this.Q = j;
        this.e.i();
        if (!this.q) {
            aqke aqkeVar = playerConfigModel.c.z;
            if (aqkeVar == null) {
                aqkeVar = aqke.b;
            }
            if (aqkeVar.h && this.b.a.m()) {
                afiw afiwVar = this.e;
                String e = e();
                aqke aqkeVar2 = playerConfigModel.c.z;
                if (aqkeVar2 == null) {
                    aqkeVar2 = aqke.b;
                }
                long j3 = aqkeVar2.d;
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 21);
                sb.append(e);
                sb.append(":");
                sb.append(j3 / 1000);
                afiwVar.a("dp", sb.toString());
            }
        }
        if (z) {
            v(new afkn(afkl.DEFAULT, "qoe.client", 0L, "NoTrackingUrl"));
        }
        this.e.d(playerConfigModel.ac());
        O();
    }
}
