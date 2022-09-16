package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adpl  reason: default package */
/* loaded from: classes.dex */
public final class adpl extends adqy implements adsr, adng, ynl {
    public static final String a = zep.a("MDX.Cloud");
    public static final long b = TimeUnit.MINUTES.toMillis(15);
    static final IntentFilter c;
    public final azpm A;
    public final azpm B;
    public final azpm C;
    public final azpm D;
    public final adns E;
    public adnl F;
    public Set G;
    final Handler H;
    volatile Handler I;

    /* renamed from: J  reason: collision with root package name */
    final adpf f34J;
    public adnm K;
    public adnl L;
    public RemoteVideoAd M;
    public yix N;
    public String O;
    public String P;
    public boolean Q;
    public boolean R;
    public final boolean S;
    public long T;
    public long U;
    public long V;
    public long W;
    public long X;
    public final String Y;
    public boolean Z;
    private adnb aA;
    public int aa;
    public List ab;
    public aalv ac;
    adpk ad;
    public int ae;
    private final adrk ap;
    private final yzj aq;
    private final adkc ar;
    private final ampq as;
    private final ScheduledExecutorService at;
    private final String au;
    private boolean av;
    private volatile HandlerThread aw;
    private int ax;
    private long ay;
    private final boolean az;
    public final ankt d;
    public final Context e;
    final Handler f;
    public final yni g;
    public final zey h;
    public final snc i;
    public final adst j;
    public final xik k;
    public final yrj l;
    public final aiyx m;
    public final List n;
    public final acvg o;
    public final acvg p;
    public final adtt q;
    public final int r;
    public final adwc s;
    public final afvn t;
    public final boolean u;
    public final adnh v;
    public final adqy w;
    public final adib x;
    public adir y;
    public adir z;

    static {
        IntentFilter intentFilter = new IntentFilter();
        c = intentFilter;
        intentFilter.addAction(adhx.LOUNGE_SERVER_CONNECTION_ERROR.toString());
        intentFilter.addAction(adhx.CLOUD_SERVICE_NO_NETWORK.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0126, code lost:
        if (defpackage.adwc.e(r2) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public adpl(android.content.Context r13, defpackage.adrk r14, defpackage.adnu r15, defpackage.yni r16, defpackage.zey r17, defpackage.snc r18, defpackage.yzj r19, defpackage.yrj r20, defpackage.aiyx r21, android.os.Handler r22, defpackage.adkc r23, defpackage.adib r24, defpackage.adqy r25, defpackage.adst r26, defpackage.xik r27, defpackage.ankt r28, defpackage.acvg r29, defpackage.acvg r30, defpackage.adtt r31, int r32, defpackage.adwc r33, defpackage.afvn r34, defpackage.adnh r35, boolean r36, defpackage.acwu r37, defpackage.ampq r38, java.util.concurrent.ScheduledExecutorService r39, java.lang.String r40, defpackage.atcw r41) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpl.<init>(android.content.Context, adrk, adnu, yni, zey, snc, yzj, yrj, aiyx, android.os.Handler, adkc, adib, adqy, adst, xik, ankt, acvg, acvg, adtt, int, adwc, afvn, adnh, boolean, acwu, ampq, java.util.concurrent.ScheduledExecutorService, java.lang.String, atcw):void");
    }

    static final adnl aJ(adnl adnlVar) {
        if (adnlVar.g()) {
            long j = adnlVar.c;
            if (j != -1 && j < 5000) {
                j = 0;
            }
            adnk j2 = adnlVar.j();
            j2.b(j);
            return j2.a();
        }
        return adnl.a;
    }

    private final adip aP(adnl adnlVar) {
        adip adipVar = new adip();
        adipVar.a("videoId", adnlVar.b);
        adipVar.a("listId", adnlVar.e);
        adipVar.a("currentIndex", Integer.toString(adnl.b(adnlVar.f)));
        long j = adnlVar.c;
        if (j != -1) {
            adipVar.a("currentTime", Long.toString(j / 1000));
        }
        String str = adnlVar.g;
        if (str != null) {
            adipVar.a("params", str);
        }
        String str2 = adnlVar.h;
        if (str2 != null) {
            adipVar.a("playerParams", str2);
        }
        if (adnlVar.i) {
            adipVar.a("forceReloadPlayback", String.valueOf(true));
        }
        byte[] bArr = adnlVar.j;
        if (bArr != null) {
            adipVar.a("clickTrackingParams", Base64.encodeToString(bArr, 10));
        }
        adipVar.a("audioOnly", "false");
        if (this.az) {
            adipVar.a("prioritizeMobileSenderPlaybackStateOnConnection", "true");
        }
        return adipVar;
    }

    private final void aQ() {
        if (this.u) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final void aR() {
        adip adipVar = new adip();
        adipVar.a("loopEnabled", String.valueOf(this.Q));
        adipVar.a("shuffleEnabled", String.valueOf(this.R));
        ay(adil.SET_PLAYLIST_MODE, adipVar);
    }

    private final synchronized void aS() {
        if (this.aw == null) {
            this.aw = new HandlerThread(getClass().getName(), 10);
            this.aw.start();
            this.I = new Handler(this.aw.getLooper());
        }
    }

    private final boolean aT(adib adibVar) {
        if (adibVar.b.h() && this.as.h()) {
            adqy adqyVar = this.w;
            int i = adqyVar.am.i;
            if (i == 4) {
                return false;
            }
            if (i == 3) {
                return this.aj.H && ((adid) adqyVar.k()).b != null;
            } else if (i == 2 && this.aj.I) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void A(String str) {
        aQ();
        adip adipVar = new adip();
        adipVar.a("videoId", str);
        adipVar.a("videoSources", "XX");
        ay(adil.ADD_VIDEO, adipVar);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void B() {
        aQ();
        if (aH() && !TextUtils.isEmpty(x())) {
            X();
        }
        ay(adil.CLEAR_PLAYLIST, adip.a);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void E() {
        ay(adil.DISMISS_AUTONAV, adip.a);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void F(String str) {
        aQ();
        adip adipVar = new adip();
        adipVar.a("listId", str);
        ay(adil.INSERT_VIDEOS, adipVar);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void G(String str) {
        aQ();
        adip adipVar = new adip();
        adipVar.a("videoId", str);
        ay(adil.INSERT_VIDEO, adipVar);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void H() {
        if (aH()) {
            ay(adil.NEXT, adip.a);
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void I() {
        ay(adil.ON_USER_ACTIVITY, adip.a);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void J() {
        if (aH()) {
            ay(adil.PAUSE, adip.a);
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void K() {
        if (aH()) {
            ay(adil.PLAY, adip.a);
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void L(adnl adnlVar) {
        aqxo.p(adnlVar.g());
        adnl aJ = aJ(adnlVar);
        if (ab()) {
            this.F = adnlVar;
            return;
        }
        adnl adnlVar2 = this.L;
        if (!adnlVar2.i(aJ.b) || !adnlVar2.h(aJ.e) || aJ.i) {
            ay(adil.SET_PLAYLIST, aP(aJ));
        } else if (this.K == adnm.PLAYING) {
        } else {
            K();
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void M() {
        if (aH()) {
            ay(adil.PREVIOUS, adip.a);
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void N(adnx adnxVar) {
        this.n.remove(adnxVar);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void O(String str) {
        aQ();
        adip adipVar = new adip();
        adipVar.a("videoId", str);
        ay(adil.REMOVE_VIDEO, adipVar);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void P(long j) {
        if (aH()) {
            this.ay += j - c();
            adip adipVar = new adip();
            adipVar.a("newTime", String.valueOf(j / 1000));
            ay(adil.SEEK_TO, adipVar);
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void Q(int i, String str, String str2) {
        adip adipVar = new adip();
        if (i == 0) {
            adipVar.a("status", "INITIATED");
        } else if (i == 1) {
            str.getClass();
            str2.getClass();
            adipVar.a("status", "UPDATED");
            adipVar.a("text", str);
            adipVar.a("unstable speech", str2);
        } else if (i != 2) {
            adipVar.a("status", "CANCELED");
        } else {
            str.getClass();
            adipVar.a("status", "COMPLETED");
            adipVar.a("text", str);
        }
        ay(adil.VOICE_COMMAND, adipVar);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void R(String str) {
        if (!this.L.f()) {
            zep.c(a, "Cannot send audio track, no confirmed video.");
            return;
        }
        adip adipVar = new adip();
        adipVar.a("audioTrackId", str);
        adipVar.a("videoId", this.L.b);
        ay(adil.SET_AUDIO_TRACK, adipVar);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void S(boolean z) {
        this.Q = z;
        aR();
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void T(boolean z) {
        this.R = z;
        aR();
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void U(SubtitleTrack subtitleTrack) {
        adpk adpkVar = this.ad;
        if (adpkVar != null) {
            this.f.removeCallbacks(adpkVar);
        }
        adpk adpkVar2 = new adpk(this, subtitleTrack);
        this.ad = adpkVar2;
        this.f.postDelayed(adpkVar2, 300L);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void V(int i) {
        if (aH()) {
            adip adipVar = new adip();
            adipVar.a("volume", String.valueOf(i));
            ay(adil.SET_VOLUME, adipVar);
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    @Deprecated
    public final void W() {
        ay(adil.SKIP_AD, adip.a);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void X() {
        ay(adil.STOP, adip.a);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void Y(int i, int i2) {
        if (aH()) {
            adip adipVar = new adip();
            adipVar.a("delta", String.valueOf(i2));
            adipVar.a("volume", String.valueOf(i));
            ay(adil.SET_VOLUME, adipVar);
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean Z() {
        return !TextUtils.isEmpty(this.P);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final int a() {
        int i = this.ax;
        if (i == -1 || i == 0) {
            return 0;
        }
        return i != 2 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aA(adnm adnmVar) {
        if (this.K == adnmVar) {
            return;
        }
        this.K = adnmVar;
        String str = a;
        String valueOf = String.valueOf(adnmVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("MDx player state moved to ");
        sb.append(valueOf);
        zep.h(str, sb.toString());
        if (!adnmVar.b()) {
            this.M = null;
            this.N = null;
        }
        this.g.d(new adnn(this.K));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aB(int i) {
        int i2 = this.ax;
        boolean z = true;
        if (i < i2 && i2 != 3) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Retrograde MDX session status change (");
        sb.append(i2);
        sb.append(" => ");
        sb.append(i);
        sb.append(")");
        aqxo.z(z, sb.toString());
        if (this.ax == i) {
            return;
        }
        this.ax = i;
        String str = a;
        String valueOf = String.valueOf(this.x);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("MDX cloud session status moved to ");
        sb2.append(i);
        sb2.append(" on ");
        sb2.append(valueOf);
        zep.h(str, sb2.toString());
        if (i == 3) {
            return;
        }
        this.ap.a(this);
    }

    public final void aC(adne adneVar, atcv atcvVar, int i) {
        this.aq.d(this.e.getString(adneVar.i, this.x.e));
        aM(atcvVar, i);
    }

    public final synchronized void aD() {
        if (this.aw != null) {
            this.aw.quit();
            this.aw = null;
            this.I = null;
        }
    }

    public final boolean aE() {
        return this.ax == 2;
    }

    public final boolean aF() {
        return this.ax == 3;
    }

    @Override // defpackage.adqy
    public final boolean aG() {
        return this.w.ai();
    }

    public final boolean aH() {
        return !ab() && !aE() && !aF();
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean aa() {
        return false;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean ab() {
        int i = this.ax;
        return i == -1 || i == 0;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean ac() {
        return this.Q;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean ad() {
        return this.G.size() == 0;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean ae() {
        return this.R;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean af(String str) {
        adir adirVar = this.y;
        return adirVar != null && adirVar.a.d.contains(str);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean ag(adnr adnrVar) {
        if (!aH()) {
            return false;
        }
        adip adipVar = new adip();
        adipVar.a("key", adnrVar.g);
        ay(adil.DPAD_COMMAND, adipVar);
        return true;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean ah(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = this.O;
        }
        if (TextUtils.isEmpty(x()) || !x().equals(str) || !t().equals(str2)) {
            return !TextUtils.isEmpty(x()) || !Z() || !this.P.equals(str);
        }
        return false;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final boolean ai() {
        return this.w.ai();
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final int aj() {
        return this.ae;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void ak(int i) {
        adil adilVar = adil.SET_AUTONAV_MODE;
        adip adipVar = new adip();
        adipVar.a("autoplayMode", adih.c(i));
        ay(adilVar, adipVar);
        this.ae = i;
        for (adnx adnxVar : this.n) {
            adnxVar.g(this.ae);
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void al() {
        adip adipVar = new adip();
        adipVar.a("debugCommand", "stats4nerds ");
        ay(adil.SEND_DEBUG_COMMAND, adipVar);
    }

    public final adib an(adib adibVar) {
        if ((!aT(adibVar) || !adibVar.b.h()) && adibVar.a == null) {
            ScreenId screenId = adibVar.f;
            adhy adhyVar = (adhy) this.ar.b(Arrays.asList(screenId), 1).get(screenId);
            if (adhyVar == null) {
                String str = a;
                String valueOf = String.valueOf(adibVar.f);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                sb.append("Unable to retrieve lounge token for screenId ");
                sb.append(valueOf);
                zep.c(str, sb.toString());
                return null;
            }
            adia f = adibVar.f();
            f.a = adhyVar;
            return f.a();
        }
        return adibVar;
    }

    public final void ar(Context context, boolean z) {
        if (this.j.a() != 0) {
            this.j.j(z);
        }
        if (this.av) {
            context.unregisterReceiver(this.f34J);
            this.av = false;
        }
        this.g.m(this);
    }

    @Override // defpackage.adqy
    public final void as() {
        throw new RuntimeException("Execution reach unexpected point.");
    }

    public final void at(adib adibVar, adnl adnlVar) {
        if (!this.av) {
            this.e.registerReceiver(this.f34J, c);
            this.av = true;
        }
        String c2 = this.w.k().c();
        adhy adhyVar = adibVar.a;
        if (adhyVar != null) {
            this.aA = new adnb(adhyVar);
        }
        if (aT(adibVar)) {
            adol adolVar = new adol((adis) adibVar.b.c(), (adon) this.as.c(), this.at, this.w.am.i, this.w.am.i == 3 ? this.aj.L : this.aj.M);
            this.aA = adolVar;
            adolVar.c();
        }
        adsv adsvVar = new adsv();
        adsvVar.b(false);
        adsvVar.c = adibVar.d;
        adnb adnbVar = this.aA;
        if (adnbVar != null) {
            adsvVar.d = adnbVar;
            if (c2 != null) {
                adsvVar.e = c2;
                if (!ai() && adnlVar.g()) {
                    adsvVar.a = adil.SET_PLAYLIST;
                    adsvVar.b = aP(adnlVar);
                }
                adsvVar.b(true);
                adsw a2 = adsvVar.a();
                StringBuilder sb = new StringBuilder(String.format("Connecting to %s with ", adibVar.f));
                if (a2.a()) {
                    Object[] objArr = new Object[2];
                    objArr[0] = a2.a;
                    objArr[1] = a2.b() ? a2.b : "{}";
                    sb.append(String.format("%s : %s", objArr));
                } else {
                    sb.append("no message.");
                }
                zep.h(a, sb.toString());
                this.j.n(a2);
                this.j.m(this);
                this.j.b(new adpe(this));
                return;
            }
            throw new NullPointerException("Null magmaKey");
        }
        throw new NullPointerException("Null loungeTokenProvider");
    }

    @Override // defpackage.adqy
    public final boolean au() {
        throw new RuntimeException("Execution reach unexpected point.");
    }

    @Override // defpackage.adqy
    public final void av(boolean z) {
        throw new RuntimeException("Execution reach unexpected point.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adqy
    public final void aw() {
        if (aE()) {
            return;
        }
        atcv r = r();
        String str = a;
        String valueOf = String.valueOf(r);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("disconnect() with reason: ");
        sb.append(valueOf);
        zep.j(str, sb.toString(), new Throwable());
        adnh adnhVar = this.v;
        ankt anktVar = adnhVar.h;
        boolean z = false;
        if (anktVar != null) {
            anktVar.cancel(false);
            adnhVar.h = null;
        }
        adnhVar.g = null;
        adnb adnbVar = this.aA;
        if (adnbVar != null) {
            adnbVar.d();
        }
        Handler handler = this.H;
        if (r == atcv.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER) {
            z = true;
        }
        Message obtain = Message.obtain(handler, 4, new adph(z));
        this.H.removeMessages(3);
        this.H.sendMessage(obtain);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adqy
    public final void ax(adnl adnlVar) {
        boolean z = true;
        aqxo.y(this.F == adnl.a);
        if (this.ax != -1) {
            z = false;
        }
        aqxo.y(z);
        this.F = aJ(adnlVar);
        aB(0);
        this.o.c("c_c");
        Handler handler = this.H;
        handler.sendMessage(Message.obtain(handler, 3));
    }

    public final void ay(adil adilVar, adip adipVar) {
        String str = a;
        String valueOf = String.valueOf(adilVar);
        String adipVar2 = adipVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10 + String.valueOf(adipVar2).length());
        sb.append("Sending ");
        sb.append(valueOf);
        sb.append(": ");
        sb.append(adipVar2);
        zep.h(str, sb.toString());
        this.j.e(adilVar, adipVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void az(adnl adnlVar, boolean z) {
        boolean z2 = !akzj.f(adnlVar.b, this.L.b);
        if (!z) {
            this.g.d(new adnj(adnlVar, 2));
        } else if (!z2) {
        } else {
            this.L = adnlVar;
            this.g.d(new adnj(adnlVar, 1));
        }
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final int b() {
        return this.aa;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final long c() {
        return this.K.a() ? ((this.U + this.ay) + this.i.d()) - this.T : this.U + this.ay;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final long d() {
        long j = this.X;
        return j != -1 ? ((j + this.ay) + this.i.d()) - this.T : j;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final long e() {
        return (!this.Z || "up".equals(this.au)) ? this.V : (this.V + this.i.d()) - this.T;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final long g() {
        return (this.W <= 0 || "up".equals(this.au)) ? this.W : (this.W + this.i.d()) - this.T;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final RemoteVideoAd h() {
        return this.M;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final yix i() {
        return this.N;
    }

    @Override // defpackage.adnt
    public final adig k() {
        return this.x;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                advs advsVar = (advs) obj;
                if (this.j.a() != 2 || this.t.c().g()) {
                    return null;
                }
                this.H.post(new adpc(this, 2));
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{advs.class};
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final adnm m() {
        return this.K;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final adns n() {
        return this.E;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final aifh p() {
        return this.w.p();
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final ankt q(final String str) {
        if (!aH()) {
            return anlz.p(new Throwable("MDx session was not ready to send messages yet."));
        }
        return anii.h(this.d, new ampg() { // from class: adpb
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                adpl adplVar = adpl.this;
                String str2 = str;
                adip adipVar = new adip();
                adipVar.a("signInSessionId", str2);
                adipVar.a("deviceId", (String) obj);
                adplVar.ay(adil.START_SIGN_IN, adipVar);
                return true;
            }
        }, anjk.a);
    }

    @Override // defpackage.adqy
    public final /* bridge */ /* synthetic */ int ro() {
        return 0;
    }

    @Override // defpackage.adqy
    public final String rp() {
        adir adirVar = this.y;
        if (adirVar != null) {
            return adirVar.b;
        }
        return null;
    }

    @Override // defpackage.adqy
    public final String rq() {
        adir adirVar = this.y;
        if (adirVar != null) {
            return adirVar.c;
        }
        return null;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final String s() {
        adit aditVar = this.x.i;
        if (aditVar == null) {
            return null;
        }
        return aditVar.c;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final String t() {
        return this.L.e;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final String u() {
        adir adirVar = this.z;
        return adirVar != null ? adirVar.a.c : super.u();
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final String v() {
        return this.P;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final String w() {
        return this.O;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final String x() {
        return this.L.b;
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void y(String str) {
        aQ();
        adip adipVar = new adip();
        adipVar.a("listId", str);
        ay(adil.ADD_VIDEOS, adipVar);
    }

    @Override // defpackage.adqy, defpackage.adnt
    public final void z(adnx adnxVar) {
        this.n.add(adnxVar);
    }
}
