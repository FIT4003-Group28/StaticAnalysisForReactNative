package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.player.stats.VideoStats2Client$VideoStats2ClientState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aiuf  reason: default package */
/* loaded from: classes.dex */
public final class aiuf {
    public int A;
    public String B;
    public float C;
    public long D;
    public int E;
    public long F;
    public final String G;
    public final boolean H;
    public final afvm I;

    /* renamed from: J  reason: collision with root package name */
    public final String f53J;
    public final boolean K;
    public final boolean L;
    private final snc M;
    private final zgp N;
    private final zgp O;
    private final zgp P;
    private final aweg Q;
    private final afst R;
    private final zah S;
    private final yrj T;
    private final zdl U;
    private final aiuj V;
    private final afzo W;
    private final boolean X;
    private final ScheduledExecutorService Y;
    private final aadd Z;
    public final TrackingUrlModel a;
    private ahgn aa;
    private aijz ab;
    private boolean ac;
    private boolean ad;
    private final ampq ae;
    private final Runnable af;
    private long ag;
    private long ah;
    private ScheduledFuture ai;
    private List aj;
    private final aiuo ak;
    public final TrackingUrlModel b;
    public final TrackingUrlModel c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final afwu m;
    public final afsw n;
    public final int o;
    public final int[] p;
    public int q;
    public long r;
    public long s;
    public long t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public volatile boolean y;
    public int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aiuf(java.util.concurrent.ScheduledExecutorService r54, defpackage.afwu r55, defpackage.afsw r56, defpackage.snc r57, defpackage.yrj r58, defpackage.zdl r59, defpackage.afst r60, defpackage.afzo r61, defpackage.zah r62, defpackage.ahfm r63, defpackage.afvn r64, defpackage.aadd r65, defpackage.aijf r66, defpackage.aikh r67, java.lang.String r68, defpackage.aweg r69, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r70, java.lang.String r71, int r72, boolean r73, boolean r74, boolean r75, defpackage.aiuo r76, defpackage.ampq r77) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiuf.<init>(java.util.concurrent.ScheduledExecutorService, afwu, afsw, snc, yrj, zdl, afst, afzo, zah, ahfm, afvn, aadd, aijf, aikh, java.lang.String, aweg, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel, java.lang.String, int, boolean, boolean, boolean, aiuo, ampq):void");
    }

    private final void A(zgp zgpVar, String str) {
        for (Map.Entry entry : this.R.a().entrySet()) {
            zgpVar.h((String) entry.getKey(), (String) entry.getValue());
        }
        zgpVar.h("rt", str);
        zgpVar.h("len", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.D)));
        zah zahVar = this.S;
        if (zahVar != null) {
            zgpVar.h("lact", String.valueOf(zahVar.a()));
        }
        if (this.A == 0 && this.z == 0) {
            zep.l("Warning: Sending VSS ping without a format parameter.");
        }
        int i = this.z;
        if (i > 0) {
            zgpVar.k("fmt", i);
        }
        int i2 = this.A;
        if (i2 > 0 && i2 != this.z) {
            zgpVar.k("afmt", i2);
        }
        aweg awegVar = this.Q;
        if (awegVar == null || (awegVar.b & 1) == 0) {
            return;
        }
        zgpVar.e(awegVar.c);
    }

    private final void B(zgp zgpVar) {
        if (zgpVar != null) {
            zgpVar.h("cpn", this.h);
            zgpVar.h("ns", "yt");
            zgpVar.h("docid", this.f);
            zgpVar.h("ver", "2");
            this.R.c(zgpVar);
            if (zgpVar.d("adformat") != null) {
                zgpVar.h("el", "adunit");
            } else {
                zgpVar.h("el", "detailpage");
                if (this.k && !TextUtils.isEmpty(this.i)) {
                    zgpVar.h(ahfn.AUTONAV, "1");
                }
            }
            if (!TextUtils.isEmpty(this.g)) {
                zgpVar.h("host_cpn", this.g);
            }
            if (!TextUtils.isEmpty(this.i)) {
                zgpVar.h("list", this.i);
            }
            if (this.k) {
                zgpVar.h("autoplay", "1");
            }
            if (this.l) {
                zgpVar.h("splay", "1");
            }
            if (!this.X) {
                zgpVar.h("dnc", "1");
            }
            if (TextUtils.isEmpty(this.G)) {
                return;
            }
            zgpVar.h("referring_app", this.G);
        }
    }

    private final synchronized void C() {
        if (!this.ad || this.aj.isEmpty()) {
            return;
        }
        List list = this.aj;
        ((aiue) list.get(list.size() - 1)).b = y(w());
        this.ad = false;
    }

    private final void D() {
        TrackingUrlModel trackingUrlModel;
        int i;
        zgp zgpVar = this.O;
        if (zgpVar == null || (trackingUrlModel = this.b) == null || this.u || (i = this.j) == 0 || this.t < i * 1000) {
            return;
        }
        this.u = true;
        F(zgpVar, trackingUrlModel, false);
    }

    private final void E(final zgp zgpVar, final afxt afxtVar) {
        if (!this.v) {
            if (!this.y) {
                this.Y.execute(new Runnable() { // from class: aiud
                    @Override // java.lang.Runnable
                    public final void run() {
                        final aiuf aiufVar = aiuf.this;
                        zgp zgpVar2 = zgpVar;
                        afxt afxtVar2 = afxtVar;
                        Uri a = zgpVar2.a();
                        afwt d = afwu.d("vss");
                        d.b(a);
                        d.d = true;
                        d.a(afxtVar2);
                        d.g = aiufVar.I;
                        d.h = aiufVar.f53J;
                        aiufVar.m.b(aiufVar.n, d, new cez() { // from class: aiub
                            @Override // defpackage.cez
                            public final void kV(cff cffVar) {
                                aiuf.this.y = true;
                            }
                        });
                    }
                });
                return;
            } else {
                String.valueOf(this.h).length();
                return;
            }
        }
        String str = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("Final ping for playback ");
        sb.append(str);
        sb.append(" has already been sent - Ignoring request");
        zep.l(sb.toString());
    }

    private final void F(zgp zgpVar, TrackingUrlModel trackingUrlModel, boolean z) {
        long x = x();
        String y = y(x);
        zgp c = zgp.c(zgpVar);
        A(c, y);
        c.h("cmt", y(w()));
        c.k("conn", this.T.a());
        c.h("vis", this.aa.d().a());
        c.h("uao", this.ab.a());
        c.h("muted", true != this.x ? "0" : "1");
        c.h("volume", String.valueOf(v()));
        int i = this.j;
        if (i > 0) {
            c.k("delay", i);
        }
        if (!TextUtils.equals(this.B, "-")) {
            c.h("cc", this.B);
        }
        float f = this.C;
        if (f != 1.0f) {
            c.h("rate", String.valueOf(f));
        }
        if (this.d) {
            c.k("reuse", 1);
        }
        if (!TextUtils.equals("-", this.ak.a)) {
            c.h("clipid", this.ak.a);
        }
        if (z) {
            M(c, 1, x);
        }
        E(c, new acwk(trackingUrlModel, 1));
    }

    private final void G(boolean z) {
        this.ac = z;
        this.V.c = z;
    }

    private final synchronized void H() {
        this.ad = true;
        aiue aiueVar = new aiue();
        aiueVar.a = y(w());
        aiueVar.c = String.valueOf(this.T.a());
        aiueVar.e = this.B;
        aiueVar.i = this.C;
        aiueVar.d = this.aa.d().a();
        aiueVar.f = this.ab.a();
        aiueVar.g = true != this.aa.e() ? "0" : "1";
        aiueVar.j = v();
        aiueVar.h = true != this.x ? "0" : "1";
        aiuo aiuoVar = this.ak;
        aiueVar.k = aiuoVar.a;
        aiueVar.l = aiuoVar.b;
        this.aj.add(aiueVar);
    }

    private final synchronized void I() {
        if (!this.ac || this.ad) {
            return;
        }
        H();
    }

    private static boolean J(int i) {
        return i == 0;
    }

    private final boolean K() {
        int[] iArr;
        return this.o > 0 || ((iArr = this.p) != null && this.q < iArr.length);
    }

    private final boolean L() {
        return this.F != -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r9.ac != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void M(defpackage.zgp r10, int r11, long r12) {
        /*
            r9 = this;
            long r0 = r9.ah
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L14
            if (r11 == r4) goto L14
            java.lang.String r0 = y(r0)
            java.lang.String r1 = "rti"
            r10.h(r1, r0)
        L14:
            int[] r0 = r9.p
            if (r0 == 0) goto L35
        L18:
            int r0 = r9.q
            int[] r1 = r9.p
            int r1 = r1.length
            if (r0 >= r1) goto L35
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            int[] r1 = r9.p
            int r5 = r9.q
            int r6 = r5 + 1
            r9.q = r6
            r1 = r1[r5]
            long r5 = (long) r1
            long r0 = r0.toMillis(r5)
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L18
            goto L45
        L35:
            int r0 = r9.o
            if (r0 <= 0) goto L44
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            int r1 = r9.o
            long r5 = (long) r1
            long r0 = r0.toMillis(r5)
            long r0 = r0 + r12
            goto L45
        L44:
            r0 = r2
        L45:
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L92
            if (r11 == r4) goto L73
            r5 = 2
            if (r11 != r5) goto L63
            boolean r11 = r9.ac
            if (r11 != 0) goto L73
            snc r11 = r9.M
            long r5 = r11.d()
            long r7 = r9.ag
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L6d
            boolean r11 = r9.ac
            if (r11 != 0) goto L6d
            goto L73
        L63:
            r10 = 4
            if (r11 != r10) goto L6d
            java.util.concurrent.ScheduledFuture r10 = r9.ai
            if (r10 == 0) goto L6d
            r10.cancel(r4)
        L6d:
            r10 = 0
            r9.ai = r10
            r9.ah = r2
            return
        L73:
            java.lang.String r11 = y(r0)
            java.lang.String r2 = "rtn"
            r10.h(r2, r11)
            r9.ah = r0
            java.util.concurrent.ScheduledFuture r10 = r9.ai
            if (r10 == 0) goto L85
            r10.cancel(r4)
        L85:
            java.util.concurrent.ScheduledExecutorService r10 = r9.Y
            java.lang.Runnable r11 = r9.af
            long r0 = r0 - r12
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r10 = r10.schedule(r11, r0, r12)
            r9.ai = r10
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiuf.M(zgp, int, long):void");
    }

    private final synchronized void N(int i) {
        if (this.L) {
            return;
        }
        long x = x();
        String y = y(x);
        zgp c = zgp.c(this.P);
        A(c, y);
        List<aiue> z = z();
        int i2 = 1;
        c.h("state", true != this.ac ? "paused" : "playing");
        if (this.H) {
            long j = this.s;
            if (j > 0) {
                c.g("lio", y(j));
            }
        }
        if (this.K) {
            c.h("dl", "1");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("st", new StringBuilder());
        hashMap.put("et", new StringBuilder());
        hashMap.put("conn", new StringBuilder());
        hashMap.put("vis", new StringBuilder());
        hashMap.put("uao", new StringBuilder());
        hashMap.put("cc", new StringBuilder());
        hashMap.put("rate", new StringBuilder());
        hashMap.put("blo", new StringBuilder());
        hashMap.put("muted", new StringBuilder());
        hashMap.put("volume", new StringBuilder());
        hashMap.put("clipid", new StringBuilder());
        hashMap.put("als", new StringBuilder());
        String str = "";
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (aiue aiueVar : z) {
            if (z.size() == i2 || !aiueVar.a.equals(aiueVar.b)) {
                StringBuilder sb = (StringBuilder) hashMap.get("st");
                sb.append(str);
                sb.append(aiueVar.a);
                StringBuilder sb2 = (StringBuilder) hashMap.get("et");
                sb2.append(str);
                sb2.append(aiueVar.b);
                StringBuilder sb3 = (StringBuilder) hashMap.get("conn");
                sb3.append(str);
                sb3.append(aiueVar.c);
                StringBuilder sb4 = (StringBuilder) hashMap.get("vis");
                sb4.append(str);
                sb4.append(aiueVar.d);
                StringBuilder sb5 = (StringBuilder) hashMap.get("uao");
                sb5.append(str);
                sb5.append(aiueVar.f);
                StringBuilder sb6 = (StringBuilder) hashMap.get("cc");
                sb6.append(str);
                sb6.append(aiueVar.e);
                StringBuilder sb7 = (StringBuilder) hashMap.get("rate");
                sb7.append(str);
                sb7.append(aiueVar.i);
                StringBuilder sb8 = (StringBuilder) hashMap.get("blo");
                sb8.append(str);
                sb8.append(aiueVar.g);
                StringBuilder sb9 = (StringBuilder) hashMap.get("muted");
                sb9.append(str);
                sb9.append(aiueVar.h);
                StringBuilder sb10 = (StringBuilder) hashMap.get("volume");
                sb10.append(str);
                sb10.append(aiueVar.j);
                StringBuilder sb11 = (StringBuilder) hashMap.get("clipid");
                sb11.append(str);
                sb11.append(aiueVar.k);
                StringBuilder sb12 = (StringBuilder) hashMap.get("als");
                sb12.append(str);
                sb12.append(aiueVar.l);
                z2 |= !aiueVar.e.equals("-");
                z3 |= !(aiueVar.i == 1.0f);
                z4 |= !TextUtils.equals("0", aiueVar.g);
                z5 |= !TextUtils.equals("-", aiueVar.k);
                str = ",";
            }
            i2 = 1;
        }
        if (!z2) {
            hashMap.remove("cc");
        }
        if (!z3) {
            hashMap.remove("rate");
        }
        if (!z4) {
            hashMap.remove("blo");
        }
        if (!z5) {
            hashMap.remove("clipid");
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((StringBuilder) entry.getValue()).toString().length() > 0) {
                c.i((String) entry.getKey(), ((StringBuilder) entry.getValue()).toString(), ",:");
            }
        }
        boolean z6 = i != 3;
        if (i == 3) {
            c.h("final", "1");
        }
        if (K()) {
            M(c, i, x);
        }
        E(c, new acwk(this.c, 1));
        this.v |= !z6;
    }

    public static boolean u(PlayerConfigModel playerConfigModel, aijf aijfVar) {
        if (aijfVar.u != 2) {
            if (playerConfigModel == null) {
                return false;
            }
            if (!playerConfigModel.aN() && (!playerConfigModel.aP() || aijfVar.u != 1)) {
                return false;
            }
        }
        return true;
    }

    private final int v() {
        Integer num;
        ankt anktVar;
        int i = -1000;
        if (this.ae.h()) {
            try {
                zgx zgxVar = (zgx) this.ae.c();
                synchronized (zgxVar) {
                    num = zgxVar.e;
                    anktVar = zgxVar.f;
                }
                if (zgxVar.d.get() != 0 && anktVar != null) {
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = ((Integer) anktVar.get()).intValue();
                    }
                }
                return i;
            } catch (InterruptedException | ExecutionException unused) {
                return i;
            }
        }
        return this.U.a();
    }

    private final long w() {
        if (!this.H || !aiix.e(this.Z).g) {
            long j = this.r;
            long j2 = this.D;
            if (j > j2 && j2 != 0) {
                StringBuilder sb = new StringBuilder(110);
                sb.append("Reported playback position ");
                sb.append(j);
                sb.append(" is greater than the duration of the video ");
                sb.append(j2);
                zep.l(sb.toString());
                return this.D;
            }
        }
        return this.r;
    }

    private final long x() {
        return this.M.d() - this.e;
    }

    private static String y(long j) {
        long j2 = j + 50;
        String valueOf = String.valueOf(j2 / 1000);
        String valueOf2 = String.valueOf((j2 % 1000) / 100);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".");
        sb.append(valueOf2);
        return sb.toString();
    }

    private final synchronized List z() {
        List list;
        if (this.aj.isEmpty()) {
            H();
            C();
        }
        list = this.aj;
        this.aj = new ArrayList();
        return list;
    }

    public final aitu a() {
        return new aitu(this.w, this.u, this.v);
    }

    public final void b() {
        C();
        I();
    }

    public final void c(ahgh ahghVar) {
        if (this.C != ahghVar.a()) {
            this.C = ahghVar.a();
            C();
            I();
        }
    }

    public final void d(ahgn ahgnVar) {
        this.V.a = ahgnVar.d();
        ahgn ahgnVar2 = this.aa;
        if (ahgnVar2 != null && ahgnVar2.d() == ahgnVar.d() && this.aa.e() == ahgnVar.e()) {
            return;
        }
        C();
        this.aa = ahgnVar;
        I();
    }

    public final void e(ahhp ahhpVar) {
        if (!TextUtils.equals(this.B, ahhpVar.b())) {
            this.B = ahhpVar.b();
            C();
            I();
        }
    }

    public final void f(ahhu ahhuVar) {
        if (this.ab != ahhuVar.a()) {
            C();
            this.ab = ahhuVar.a();
            I();
        }
    }

    public final void g(aesr aesrVar) {
        FormatStreamModel e = aesrVar.e();
        FormatStreamModel f = aesrVar.f();
        int i = 0;
        this.z = f == null ? 0 : f.e();
        if (e != null) {
            i = e.e();
        }
        this.A = i;
    }

    public final void h() {
        C();
        if (this.w) {
            N(3);
        }
    }

    public final void i() {
        ScheduledFuture scheduledFuture;
        G(false);
        D();
        C();
        if (this.t > 0) {
            if (K() && (scheduledFuture = this.ai) != null) {
                scheduledFuture.cancel(true);
                this.ai = null;
            }
            N(2);
        }
    }

    public final void j() {
        if (!this.ac) {
            return;
        }
        C();
        this.x = true;
        I();
    }

    public final void k() {
        G(false);
    }

    public final void l(long j) {
        C();
        this.r = j;
        I();
    }

    public final void m(long j) {
        if (this.ac) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Warning: unexpected playback play ");
            sb.append(j);
            sb.append(" surpressed");
            zep.l(sb.toString());
            return;
        }
        G(true);
        this.r = j;
    }

    public final void n() {
        G(false);
    }

    public final void o() {
        C();
        if (this.w) {
            N(4);
        }
    }

    public final void p() {
        if (!this.ac) {
            return;
        }
        C();
        this.x = false;
        I();
    }

    public final void r() {
        if (this.ad) {
            zep.n("VSS2 client released unexpectedly", new Exception());
            o();
        }
        this.W.g(this.V);
        if (this.ae.h()) {
            zgx zgxVar = (zgx) this.ae.c();
            if (zgxVar.d.decrementAndGet() != 0) {
                return;
            }
            zgxVar.b.unregisterContentObserver(zgxVar);
        }
    }

    public final synchronized void s() {
        if (!this.v) {
            C();
            N(2);
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        C();
        I();
    }

    public final void q(ahhx ahhxVar) {
        if (ahhxVar.f() > 0) {
            this.D = ahhxVar.f();
        }
        if (ahhxVar.j()) {
            long e = ahhxVar.e();
            long j = this.r;
            if (e < (-5000) + j || e > 5000 + j) {
                StringBuilder sb = new StringBuilder(109);
                sb.append("Warning: unexpected playback progress ");
                sb.append(e);
                sb.append(" for current playback position ");
                sb.append(j);
                zep.l(sb.toString());
                l(e);
            } else if (e < j) {
            } else {
                this.t += e - j;
                this.r = e;
                this.s = ahhxVar.b() - ahhxVar.e();
                this.ag = ahhxVar.c() + 30000;
                this.V.b = this.r;
                long j2 = this.t;
                int v = v();
                if (v != -1000) {
                    if (v != this.E && !L()) {
                        this.E = v;
                        this.F = j2;
                    }
                    long j3 = j2 - this.F;
                    if (L() && j3 > 2000) {
                        this.F = -1L;
                        this.E = v;
                        C();
                        I();
                    }
                }
                if (!this.w) {
                    this.w = true;
                    F(this.N, this.a, K());
                } else if (K() && this.ai == null) {
                    s();
                }
                I();
                D();
            }
        }
    }

    public aiuf(ScheduledExecutorService scheduledExecutorService, afwu afwuVar, afsw afswVar, snc sncVar, yrj yrjVar, zdl zdlVar, afst afstVar, afzo afzoVar, zah zahVar, ahfm ahfmVar, afvn afvnVar, aadd aaddVar, aijf aijfVar, aweg awegVar, VideoStats2Client$VideoStats2ClientState videoStats2Client$VideoStats2ClientState, aiuo aiuoVar, ampq ampqVar) {
        this(scheduledExecutorService, afwuVar, afswVar, sncVar, videoStats2Client$VideoStats2ClientState.a, videoStats2Client$VideoStats2ClientState.b, videoStats2Client$VideoStats2ClientState.c, videoStats2Client$VideoStats2ClientState.d, videoStats2Client$VideoStats2ClientState.h, videoStats2Client$VideoStats2ClientState.g, videoStats2Client$VideoStats2ClientState.l, videoStats2Client$VideoStats2ClientState.o, videoStats2Client$VideoStats2ClientState.p, videoStats2Client$VideoStats2ClientState.u, videoStats2Client$VideoStats2ClientState.v, videoStats2Client$VideoStats2ClientState.i, videoStats2Client$VideoStats2ClientState.j, videoStats2Client$VideoStats2ClientState.k, videoStats2Client$VideoStats2ClientState.e, videoStats2Client$VideoStats2ClientState.A, videoStats2Client$VideoStats2ClientState.B, aijfVar.c(), aijfVar.t, yrjVar, zdlVar, afstVar, zahVar, afzoVar, videoStats2Client$VideoStats2ClientState.C, videoStats2Client$VideoStats2ClientState.D, videoStats2Client$VideoStats2ClientState.E, ahfmVar.b, videoStats2Client$VideoStats2ClientState.F, afvnVar, aaddVar, videoStats2Client$VideoStats2ClientState.y, videoStats2Client$VideoStats2ClientState.z, aiuoVar, videoStats2Client$VideoStats2ClientState.G, videoStats2Client$VideoStats2ClientState.r, videoStats2Client$VideoStats2ClientState.q, videoStats2Client$VideoStats2ClientState.s, ampqVar, videoStats2Client$VideoStats2ClientState.H, awegVar);
        this.r = videoStats2Client$VideoStats2ClientState.f;
        this.t = videoStats2Client$VideoStats2ClientState.m;
        this.y = videoStats2Client$VideoStats2ClientState.t;
        this.z = videoStats2Client$VideoStats2ClientState.w;
        this.A = videoStats2Client$VideoStats2ClientState.x;
    }

    @Deprecated
    public aiuf(ScheduledExecutorService scheduledExecutorService, afwu afwuVar, afsw afswVar, snc sncVar, TrackingUrlModel trackingUrlModel, TrackingUrlModel trackingUrlModel2, TrackingUrlModel trackingUrlModel3, boolean z, String str, long j, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, long j2, String str5, float f, ahgn ahgnVar, aijz aijzVar, yrj yrjVar, zdl zdlVar, afst afstVar, zah zahVar, afzo afzoVar, int i2, int[] iArr, int i3, boolean z6, String str6, afvn afvnVar, aadd aaddVar, int i4, long j3, aiuo aiuoVar, boolean z7, boolean z8, boolean z9, boolean z10, ampq ampqVar, boolean z11, aweg awegVar) {
        this.af = new Runnable() { // from class: aiuc
            @Override // java.lang.Runnable
            public final void run() {
                aiuf.this.s();
            }
        };
        this.Y = scheduledExecutorService;
        this.m = afwuVar;
        this.n = afswVar;
        this.M = sncVar;
        trackingUrlModel.getClass();
        this.a = trackingUrlModel;
        zgp b = zgp.b(trackingUrlModel.c());
        this.N = b;
        this.b = trackingUrlModel2;
        zgp b2 = trackingUrlModel2 != null ? zgp.b(trackingUrlModel2.c()) : null;
        this.O = b2;
        trackingUrlModel3.getClass();
        this.c = trackingUrlModel3;
        zgp b3 = zgp.b(trackingUrlModel3.c());
        this.P = b3;
        this.d = z;
        this.Z = aaddVar;
        this.f = str;
        this.D = j;
        this.j = i;
        this.k = z2;
        this.l = z3;
        this.H = z4;
        this.x = z5;
        this.g = str2;
        this.h = str3;
        this.e = j2;
        this.B = str5;
        this.C = f;
        this.aa = ahgnVar;
        this.ab = aijzVar;
        this.T = yrjVar;
        this.U = zdlVar;
        this.R = afstVar;
        this.i = str4;
        this.t = 0L;
        this.S = zahVar;
        this.W = afzoVar;
        this.X = z6;
        aiuj aiujVar = new aiuj(yrjVar, ahgnVar.d(), aijzVar, sncVar, j2, str3);
        this.V = aiujVar;
        afzoVar.e(aiujVar);
        this.o = i2;
        this.p = iArr;
        this.q = i3;
        this.aj = new ArrayList();
        this.G = str6 != null ? str6 : "";
        this.E = i4;
        this.F = j3;
        this.ak = aiuoVar;
        this.K = z7;
        this.L = z11;
        this.w = z8;
        this.u = z9;
        this.v = z10;
        this.ae = ampqVar;
        this.I = afvnVar.c();
        this.f53J = afvnVar.g();
        this.Q = awegVar;
        if (ampqVar.h()) {
            final zgx zgxVar = (zgx) ampqVar.c();
            if (zgxVar.d.incrementAndGet() == 1) {
                zgxVar.f = aed.c(new agr() { // from class: zgv
                    @Override // defpackage.agr
                    public final Object a(final agp agpVar) {
                        final zgx zgxVar2 = zgx.this;
                        zgxVar2.c.post(new Runnable() { // from class: zgw
                            @Override // java.lang.Runnable
                            public final void run() {
                                zgx zgxVar3 = zgx.this;
                                agp agpVar2 = agpVar;
                                zgxVar3.a();
                                agpVar2.c(zgxVar3.e);
                            }
                        });
                        return "updateVolume";
                    }
                });
            }
            zgxVar.b.registerContentObserver(zgx.a, true, zgxVar);
        }
        B(b);
        B(b3);
        B(b2);
    }
}
