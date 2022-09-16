package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: adqh  reason: default package */
/* loaded from: classes.dex */
public final class adqh extends adqy {
    public static final String a = zep.a("MDX.Dial");
    private final int A;
    private final acvg B;
    private final long C;
    private final adnd D;
    public final SharedPreferences b;
    public final adbu c;
    public final adas d;
    public final adkc e;
    public final adbe f;
    public final adtt g;
    public final acwu h;
    public final String i;
    volatile Handler j;
    volatile Handler k;
    public Uri l;
    public volatile adid m;
    public volatile adbs n;
    public final acvg o;
    public final AtomicBoolean p;
    public final long q;
    public long r;
    public int s;
    private final adkm t;
    private final adbt u;
    private volatile HandlerThread v;
    private volatile HandlerThread w;
    private boolean x;
    private boolean y;
    private final MdxSessionFactory z;

    public adqh(adid adidVar, MdxSessionFactory mdxSessionFactory, Context context, adrk adrkVar, adnu adnuVar, yzj yzjVar, SharedPreferences sharedPreferences, adbu adbuVar, adas adasVar, adkc adkcVar, adkm adkmVar, adbe adbeVar, String str, acvg acvgVar, acvg acvgVar2, adbt adbtVar, int i, adtt adttVar, int i2, ampq ampqVar, adnd adndVar, acwu acwuVar, atcw atcwVar) {
        super(context, adrkVar, adnuVar, yzjVar, acwuVar, atcwVar);
        this.p = new AtomicBoolean(false);
        this.m = adidVar;
        this.z = mdxSessionFactory;
        this.b = sharedPreferences;
        this.c = adbuVar;
        this.d = adasVar;
        this.e = adkcVar;
        this.t = adkmVar;
        this.f = adbeVar;
        this.i = str;
        this.o = acvgVar;
        this.B = acvgVar2;
        this.u = adbtVar;
        this.g = adttVar;
        this.A = i;
        this.h = acwuVar;
        this.D = adndVar;
        int i3 = acwuVar.Y;
        this.q = i3 > 0 ? i3 : 5000L;
        int i4 = acwuVar.Z;
        this.C = i4 > 0 ? i4 : 30000L;
        adnv a2 = adnw.a();
        a2.i(3);
        a2.e(adidVar.d);
        a2.d(adew.f(adidVar));
        a2.f(i2);
        admz a3 = adna.a();
        a3.b(adidVar.n);
        a2.a = a3.a();
        if (ampqVar.h()) {
            a2.g((String) ampqVar.c());
        }
        this.am = a2.a();
    }

    private final void aH() {
        adbs adbsVar = this.n;
        if (adbsVar != null) {
            adbsVar.b();
            this.n = null;
        }
        this.c.a();
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private final void aI() {
        if (this.A == 1 && this.k != null) {
            this.k.post(new adqb(this));
        }
    }

    private final synchronized void aJ() {
        if (this.v == null) {
            this.v = new HandlerThread(getClass().getName(), 10);
            this.v.start();
            this.j = new Handler(this.v.getLooper());
        }
    }

    private final synchronized void aP() {
        if (this.w == null) {
            this.w = new HandlerThread(getClass().getName(), 10);
            this.w.start();
            this.k = new Handler(this.w.getLooper());
        }
    }

    private final boolean aQ(atcv atcvVar) {
        return !this.aj.au.contains(Integer.valueOf(atcvVar.C)) && this.ah < this.ai;
    }

    public final void aA(final long j) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.j == null) {
            return;
        }
        this.j.postDelayed(new Runnable() { // from class: adqd
            @Override // java.lang.Runnable
            public final void run() {
                final adqh adqhVar = adqh.this;
                long j2 = elapsedRealtime;
                long j3 = j;
                final adid adidVar = adqhVar.m;
                if (adqhVar.p.get() || adqhVar.r <= 0) {
                    if (adqhVar.p.get() || adqhVar.r > 0) {
                        return;
                    }
                    adne adneVar = adne.LAUNCH_FAIL_TIMEOUT;
                    String str = adqh.a;
                    String valueOf = String.valueOf(adidVar);
                    String valueOf2 = String.valueOf(adneVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
                    sb.append("Could not wake up DIAL device  ");
                    sb.append(valueOf);
                    sb.append(" ");
                    sb.append(valueOf2);
                    zep.c(str, sb.toString());
                    adqhVar.o.c("d_lwf");
                    adqhVar.an(adneVar, atcv.MDX_SESSION_DISCONNECT_REASON_DIAL_WAKE_ON_LAN_FAILED);
                    return;
                }
                adqhVar.f.c(new adbb() { // from class: adqa
                    @Override // defpackage.adbb
                    public final void a(adid adidVar2) {
                        adqh adqhVar2 = adqh.this;
                        adid adidVar3 = adidVar;
                        if (!adidVar2.n.equals(adidVar3.n) || adqhVar2.p.getAndSet(true)) {
                            return;
                        }
                        String valueOf3 = String.valueOf(adidVar2.d);
                        if (valueOf3.length() != 0) {
                            "Successful wake-up of ".concat(valueOf3);
                        }
                        adbs adbsVar = adqhVar2.n;
                        if (adbsVar != null) {
                            adbsVar.b();
                            adqhVar2.n = null;
                        }
                        adic j4 = adidVar2.j();
                        j4.e(adidVar3.l);
                        adqhVar2.m = j4.a();
                        adqhVar2.o.c("d_lws");
                        adqhVar2.ak.c(16);
                        adqhVar2.az();
                    }

                    @Override // defpackage.adbb
                    public final /* synthetic */ void b() {
                    }
                }, false);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
                long j4 = adqhVar.r;
                if (elapsedRealtime2 > 0) {
                    j3 = elapsedRealtime2;
                }
                adqhVar.r = j4 - j3;
                adqhVar.aA(adqhVar.q);
            }
        }, j);
    }

    public final synchronized void aB() {
        if (this.v != null) {
            this.v.quit();
            this.v = null;
            this.j = null;
        }
    }

    public final synchronized void aC() {
        if (this.w != null) {
            this.w.quit();
            this.w = null;
            this.k = null;
        }
    }

    public final boolean aD() {
        return this.m.a.a() == 1;
    }

    public final boolean aE(adib adibVar) {
        Map a2 = this.t.a(Collections.singletonList(adibVar));
        return a2.containsKey(adibVar) && !((Set) a2.get(adibVar)).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void an(adne adneVar, atcv atcvVar) {
        ar(adneVar, atcvVar, -1);
    }

    public final void ar(adne adneVar, atcv atcvVar, Integer num) {
        aH();
        this.o.c("d_laf");
        if (aQ(atcvVar)) {
            String str = a;
            String valueOf = String.valueOf(adneVar);
            String valueOf2 = String.valueOf(atcvVar);
            String valueOf3 = String.valueOf(num);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append("Initial connection failed with error: ");
            sb.append(valueOf);
            sb.append(", reason: ");
            sb.append(valueOf2);
            sb.append(", status code: ");
            sb.append(valueOf3);
            sb.append(". attempting retry.");
            zep.m(str, sb.toString());
            Uri uri = this.m.b;
            if (uri != null) {
                adas adasVar = this.d;
                adpz adpzVar = new adpz(this);
                yqu b = yqv.b(uri.toString());
                b.c("Origin", "package:com.google.android.youtube");
                new afxu(adasVar.b, new aftj(new adar(adasVar, b.a().a))).a(uri, new adaq(adpzVar));
                return;
            }
            ay();
        } else if (num.intValue() == -1) {
            super.aN(adneVar);
            super.D(atcvVar);
        } else if (this.h.m) {
            adnd adndVar = this.D;
            int intValue = num.intValue();
            String str2 = this.m.d;
            dt dtVar = adndVar.c;
            if (dtVar == null) {
                adndVar.b.d(adndVar.a.getString(adneVar.i, str2));
            } else {
                adnc.aE(intValue, str2).qv(dtVar.getSupportFragmentManager(), adnc.class.getCanonicalName());
            }
            super.aM(atcvVar, num.intValue());
        } else {
            super.aN(adneVar);
            super.aM(atcvVar, num.intValue());
        }
    }

    @Override // defpackage.adqy
    public final void as() {
        if (this.x) {
            zep.c(a, "Cannot call launchApp() more than once.");
            return;
        }
        this.ak.c(3);
        this.x = true;
        aJ();
        if (this.A == 1) {
            aP();
            if (this.k != null) {
                this.k.post(new adqb(this, 1));
            }
        }
        this.s = 0;
        if (this.m.n()) {
            if (ai()) {
                D(atcv.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED);
                return;
            }
            this.ak.c(4);
            this.o.c("d_lw");
            adid adidVar = this.m;
            long j = this.C;
            long j2 = adidVar.k;
            this.r = Math.max(j, (j2 + j2) * 1000);
            adbt adbtVar = this.u;
            adbs adbsVar = new adbs(adbtVar.a, this.m.j, adbtVar.b);
            adbsVar.a();
            this.n = adbsVar;
            aA(0L);
            return;
        }
        this.o.c("d_l");
        if (this.j == null) {
            return;
        }
        this.j.post(new Runnable() { // from class: adqc
            @Override // java.lang.Runnable
            public final void run() {
                adqg adqgVar;
                ScreenId screenId;
                adit aditVar;
                String string;
                adit aditVar2;
                adqh adqhVar = adqh.this;
                Uri uri = adqhVar.m.b;
                if (uri != null) {
                    adqhVar.m = adqhVar.m.k(adqhVar.d.a(uri));
                }
                boolean ai = adqhVar.ai();
                if (adqhVar.aD()) {
                    adqhVar.o.c("d_lar");
                    adib adibVar = null;
                    if (adqhVar.aD()) {
                        adid adidVar2 = adqhVar.m;
                        boolean z = (adidVar2.a.e() == null || adidVar2.p() == null) ? false : true;
                        if (adih.b(adqhVar.i) || adqhVar.h.ac || (string = adqhVar.b.getString(adidVar2.n.c, null)) == null || !string.contains(",")) {
                            adqgVar = null;
                        } else {
                            List h = amqf.b(',').h(string);
                            adqf adqfVar = new adqf();
                            adqfVar.a = new ScreenId((String) h.get(0));
                            adqfVar.b = new adit((String) h.get(1));
                            ScreenId screenId2 = adqfVar.a;
                            if (screenId2 == null || (aditVar2 = adqfVar.b) == null) {
                                StringBuilder sb = new StringBuilder();
                                if (adqfVar.a == null) {
                                    sb.append(" screenId");
                                }
                                if (adqfVar.b == null) {
                                    sb.append(" loungeDeviceId");
                                }
                                String valueOf = String.valueOf(sb);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                                sb2.append("Missing required properties:");
                                sb2.append(valueOf);
                                throw new IllegalStateException(sb2.toString());
                            }
                            adqgVar = new adqg(screenId2, aditVar2);
                        }
                        if (z || adqgVar != null) {
                            if (z) {
                                screenId = adidVar2.a.e();
                                aditVar = adidVar2.p();
                            } else {
                                screenId = adqgVar.a;
                                aditVar = adqgVar.b;
                            }
                            adqhVar.ak.c(9);
                            adim adimVar = adidVar2.a.j() ? adim.IN_APP_DIAL : adim.DIAL;
                            String str = adidVar2.g;
                            String str2 = adidVar2.f;
                            String str3 = adidVar2.i;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(str2).length() + String.valueOf(str3).length());
                            sb3.append("modelName: ");
                            sb3.append(str);
                            sb3.append(" | manufacturer: ");
                            sb3.append(str2);
                            sb3.append(" | deviceVersion: ");
                            sb3.append(str3);
                            String sb4 = sb3.toString();
                            ampq f = adidVar2.a.f();
                            if (f.h() && adqhVar.h.H) {
                                adqhVar.ak.c(11);
                                adia e = adib.e();
                                e.b(screenId);
                                e.d(aditVar);
                                e.e(adidVar2.d);
                                e.f(adimVar);
                                e.b = sb4;
                                e.c((adis) f.c());
                                adib a2 = e.a();
                                if (adqhVar.aE(a2)) {
                                    adibVar = a2;
                                }
                            }
                            adhy adhyVar = (adhy) adqhVar.e.b(Arrays.asList(screenId), true != z ? 5 : 6).get(screenId);
                            if (adhyVar == null) {
                                String str4 = adqh.a;
                                String valueOf2 = String.valueOf(screenId);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                                sb5.append("Unable to retrieve lounge token for screenId ");
                                sb5.append(valueOf2);
                                zep.c(str4, sb5.toString());
                            } else {
                                adqhVar.ak.c(11);
                                adia e2 = adib.e();
                                e2.b(screenId);
                                e2.e(adidVar2.d);
                                e2.d(aditVar);
                                e2.b = sb4;
                                e2.a = adhyVar;
                                e2.f(adimVar);
                                adib a3 = e2.a();
                                if (adqhVar.aE(a3)) {
                                    adibVar = a3;
                                }
                            }
                            adibVar = null;
                        }
                    }
                    if (adibVar != null) {
                        adqhVar.ak.c(17);
                        adqhVar.at(adibVar);
                        return;
                    } else if (ai) {
                        adqhVar.D(atcv.MDX_SESSION_DISCONNECT_REASON_CLOUD_SCREEN_NOT_FOUND);
                        return;
                    }
                } else if (ai) {
                    adqhVar.D(atcv.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED);
                    return;
                }
                adqhVar.az();
            }
        });
    }

    public final void at(adib adibVar) {
        this.y = true;
        adid adidVar = this.m;
        if (!adih.b(this.i)) {
            String valueOf = String.valueOf(adibVar.f);
            String valueOf2 = String.valueOf(adibVar.h);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(",");
            sb.append(valueOf2);
            this.b.edit().putString(adidVar.n.c, sb.toString()).apply();
        }
        this.o.c("d_las");
        adit aditVar = adibVar.g;
        if (aditVar != null) {
            adnv b = this.am.b();
            b.b = aditVar;
            this.am = b.a();
        }
        MdxSessionFactory mdxSessionFactory = this.z;
        adrk aK = aK();
        adnu adnuVar = this.ak;
        acvg acvgVar = this.o;
        acvg acvgVar2 = this.B;
        int i = this.am.h;
        ampq.j(this.am.g);
        aO(mdxSessionFactory.h(adibVar, aK, adnuVar, this, acvgVar, acvgVar2, new adbf(this.m, this.d)));
    }

    @Override // defpackage.adqy
    public final boolean au() {
        return true;
    }

    @Override // defpackage.adqy
    public final void av(boolean z) {
        aH();
        if (this.v != null) {
            if (!z || !this.y) {
                aB();
            } else if (this.j != null) {
                this.j.post(new adqb(this, 2));
            }
        }
        aI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ay() {
        aB();
        aI();
        this.x = false;
        this.ah++;
        ax(this.ag);
    }

    public final void az() {
        if (this.j == null) {
            return;
        }
        this.j.post(new adqb(this, 3));
    }

    @Override // defpackage.adnt
    public final adig k() {
        return this.m;
    }

    @Override // defpackage.adqy
    public final int ro() {
        return this.s;
    }

    @Override // defpackage.adqy
    public final void rr(atcv atcvVar, aifh aifhVar) {
        if (a() != 0 || !this.aj.ar.contains(Integer.valueOf(atcvVar.C)) || !aQ(atcvVar)) {
            super.rr(atcvVar, aifhVar);
            return;
        }
        String str = a;
        String valueOf = String.valueOf(atcvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75);
        sb.append("Disconnected with reason ");
        sb.append(valueOf);
        sb.append("while still connecting. attempting forceful retry.");
        zep.m(str, sb.toString());
        ay();
    }

    public static final atcv aF(int i) {
        if (i != 0) {
            if (i == 2) {
                return atcv.MDX_SESSION_DISCONNECT_REASON_DIAL_CLIENT_ERROR;
            }
            if (i == 3) {
                return atcv.MDX_SESSION_DISCONNECT_REASON_CONNECTION_TIMEOUT;
            }
            if (i == 4) {
                return atcv.MDX_SESSION_DISCONNECT_REASON_NETWORK;
            }
            return atcv.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
        }
        return atcv.MDX_SESSION_DISCONNECT_REASON_DIAL_SERVER_ERROR;
    }
}
