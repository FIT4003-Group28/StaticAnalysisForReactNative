package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.PowerManager;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: agyb  reason: default package */
/* loaded from: classes.dex */
public final class agyb implements agxt, agyj {
    static final long a;
    private static final long m = TimeUnit.SECONDS.toMillis(10);
    private static final long n;
    private static final long o;
    private final ahdf A;
    private final aghg B;
    private final agyp C;
    private final afvn D;
    private final azpb E;
    private final agxu F;
    private final agyk G;
    private final agym H;
    private final agyz I;

    /* renamed from: J  reason: collision with root package name */
    private final String f45J;
    private final PowerManager.WakeLock K;
    private final WifiManager.WifiLock L;
    private volatile afvm N;
    private boolean P;
    private final yjs T;
    private final yjs U;
    final agxr b;
    public final agys c;
    public final agyq d;
    public final agxs e;
    public volatile String f;
    boolean h;
    boolean i;
    boolean j;
    private final Context p;
    private final ScheduledExecutorService q;
    private final yrj r;
    private final snc s;
    private final zfq t;
    private final agwa u;
    private final azqb v;
    private final agvw w;
    private final agpt x;
    private final aadd y;
    private final yni z;
    private awuy M = awuy.ANY;
    public final Object k = new Object();
    private final Queue Q = new ArrayDeque();
    public ankt l = null;
    private final Map R = new HashMap();
    private ScheduledFuture S = null;
    private volatile boolean O = false;
    public final Set g = new HashSet();

    static {
        long millis = TimeUnit.SECONDS.toMillis(30L);
        n = millis;
        o = TimeUnit.MINUTES.toMillis(1L);
        a = TimeUnit.MILLISECONDS.toSeconds(millis);
    }

    public agyb(Context context, ScheduledExecutorService scheduledExecutorService, yrj yrjVar, snc sncVar, zfq zfqVar, yjs yjsVar, agwa agwaVar, azqb azqbVar, agvw agvwVar, agpt agptVar, agxr agxrVar, aadd aaddVar, yni yniVar, ahdf ahdfVar, aghg aghgVar, agyp agypVar, agxu agxuVar, agyk agykVar, final agym agymVar, agys agysVar, agyq agyqVar, afvn afvnVar, azpb azpbVar, yjs yjsVar2, agxs agxsVar, String str, agyz agyzVar) {
        this.p = context;
        this.q = scheduledExecutorService;
        this.r = yrjVar;
        this.s = sncVar;
        this.t = zfqVar;
        this.T = yjsVar;
        this.u = agwaVar;
        this.v = azqbVar;
        this.w = agvwVar;
        this.x = agptVar;
        this.b = agxrVar;
        this.y = aaddVar;
        this.z = yniVar;
        this.A = ahdfVar;
        this.B = aghgVar;
        this.C = agypVar;
        this.F = agxuVar;
        this.G = agykVar;
        this.H = agymVar;
        this.c = agysVar;
        this.d = agyqVar;
        this.D = afvnVar;
        this.E = azpbVar;
        this.U = yjsVar2;
        this.e = agxsVar;
        this.f45J = str;
        this.I = agyzVar;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        powerManager.getClass();
        this.K = powerManager.newWakeLock(1, getClass().getName());
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        wifiManager.getClass();
        this.L = wifiManager.createWifiLock(3, getClass().getName());
        yjsVar.b("transfer_dm2");
        agykVar.a = this;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        context.registerReceiver(agykVar, intentFilter);
        agymVar.c = agymVar.a.Z(new agyl(agymVar, this, 1));
        agymVar.d = agymVar.b.Z(new agyl(agymVar, this));
        scheduledExecutorService.execute(new Runnable() { // from class: agxy
            @Override // java.lang.Runnable
            public final void run() {
                agym.this.b();
            }
        });
    }

    private final boolean A() {
        return this.B.a() && this.r.q();
    }

    private final Bundle t() {
        Bundle bundle = new Bundle();
        bundle.putString("servicePath", this.f45J);
        bundle.putString("intentAction", "com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup");
        return bundle;
    }

    private final void u() {
        synchronized (this.k) {
            ScheduledFuture scheduledFuture = this.S;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.S = null;
        }
    }

    private final void v() {
        synchronized (this.k) {
            u();
            if (e() <= 0 && !this.i) {
                if (!this.O && !this.h) {
                    long j = this.j ? n : m;
                    TimeUnit.MILLISECONDS.toSeconds(j);
                    this.S = this.q.schedule(new agxw(this, 2), j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x039a, code lost:
        if (r5 != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w() {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyb.w():void");
    }

    private final void x(agxe agxeVar, int i) {
        boolean z;
        agqe m2;
        boolean z2 = true;
        if (agxeVar.j != avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE) {
            agxeVar.j = avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE;
            z = true;
        } else {
            z = false;
        }
        String str = agxeVar.a;
        agxp b = this.d.b(str);
        if (b != null) {
            b.a(i);
        }
        agxeVar.i = 0;
        if (this.g.remove(str)) {
            agxg.v(agxeVar.e, this.s.c());
            z = true;
        }
        if (agxeVar.b != i) {
            agxeVar.b = i;
        } else {
            z2 = z;
        }
        this.b.g(agxeVar);
        if (z2) {
            agxs agxsVar = this.e;
            agqz a2 = agxeVar.a();
            atsg atsgVar = atsg.UNKNOWN_FAILURE_REASON;
            if ((agxeVar.b & 384) != 0) {
                m2 = agqe.PAUSED;
            } else {
                m2 = agxg.m(agxeVar.e);
            }
            agxsVar.l(a2, atsgVar, m2);
        }
    }

    private final boolean y() {
        return this.A.g() ? !this.r.p() : !this.r.o();
    }

    private final boolean z() {
        if (this.M == awuy.ANY) {
            return false;
        }
        return y() || !this.r.r() || this.r.i();
    }

    @Override // defpackage.agxo
    public final void a(String str, agpw agpwVar) {
        agxz a2 = agya.a(8);
        a2.f(str);
        a2.d = agpwVar;
        p(a2.a());
    }

    @Override // defpackage.agxo
    public final void b(String str, long j, double d, boolean z) {
        agxz a2 = agya.a(7);
        a2.f(str);
        a2.b(j);
        a2.h(d);
        a2.i(z);
        p(a2.a());
    }

    @Override // defpackage.agxo
    public final void c(String str, long j) {
        agxz a2 = agya.a(6);
        a2.f(str);
        a2.g(j);
        p(a2.a());
    }

    @Override // defpackage.agxo
    public final void d(String str, agxq agxqVar, agpw agpwVar) {
        agxe a2 = this.c.a(str);
        if (a2 == null) {
            return;
        }
        agpw agpwVar2 = a2.e;
        int i = a2.i + 1;
        atsg atsgVar = agxqVar.c;
        boolean z = agxqVar.a;
        if (atsgVar == atsg.STREAM_VERIFICATION_FAILED) {
            agpwVar.h("stream_verification_attempts", agxg.b(agpwVar) + 1);
        }
        if (!z) {
            if (agpr.b(agpwVar2)) {
                aopa c = agpr.c(a2.a());
                c.copyOnWrite();
                atsj atsjVar = (atsj) c.instance;
                atsj atsjVar2 = atsj.a;
                atsjVar.h = 13;
                atsjVar.b |= 16;
                c.copyOnWrite();
                atsj atsjVar3 = (atsj) c.instance;
                atsjVar3.i = atsgVar.H;
                atsjVar3.b |= 32;
                c.copyOnWrite();
                atsj atsjVar4 = (atsj) c.instance;
                atsjVar4.g = 3;
                atsjVar4.b |= 8;
                boolean z2 = ahdr.a;
                c.copyOnWrite();
                atsj atsjVar5 = (atsj) c.instance;
                atsjVar5.c |= 64;
                atsjVar5.A = z2;
                if (agxqVar.getCause() != null && atsgVar == atsg.OFFLINE_DISK_ERROR) {
                    String simpleName = agxqVar.getCause().getClass().getSimpleName();
                    c.copyOnWrite();
                    atsj atsjVar6 = (atsj) c.instance;
                    simpleName.getClass();
                    atsjVar6.b |= 128;
                    atsjVar6.j = simpleName;
                }
                this.x.c((atsj) c.mo39build());
            }
            long g = agxg.g(agpwVar2);
            atqv atqvVar = this.A.a.a().g;
            if (atqvVar == null) {
                atqvVar = atqv.a;
            }
            long millis = TimeUnit.HOURS.toMillis(atqvVar.B);
            if (agxg.e(agpwVar2) == 0) {
                atsgVar = atsg.RETRY_NOT_ALLOWED;
            } else if (i > agxg.a(agpwVar2) || (millis > 0 && g >= millis)) {
                atsgVar = atsg.TOO_MANY_RETRIES;
            } else if (agxg.b(agpwVar) > 2) {
                atsgVar = atsg.TOO_MANY_FAILED_STREAM_VERIFICATIONS;
            }
            z = true;
        }
        if (atsgVar == atsg.OFFLINE_DISK_ERROR) {
            aghe b = ((agrf) this.v.get()).a().b();
            agpj e = ((agrf) this.v.get()).a().e();
            if (b != null && e != null && b.c() != null && e.v()) {
                agxg.C(agpwVar, true);
            }
        }
        agxz a3 = agya.a(17);
        a3.f(str);
        a3.d = agpwVar;
        p(a3.a());
        if (agxqVar.getCause() == null || !(agxqVar.getCause() instanceof agxh)) {
            if (z) {
                agxz a4 = agya.a(10);
                a4.f(str);
                a4.d(agxqVar.b);
                a4.c(atsgVar);
                p(a4.a());
                return;
            }
            agxz a5 = agya.a(9);
            a5.f(str);
            p(a5.a());
            return;
        }
        agxh agxhVar = (agxh) agxqVar.getCause();
        atqv atqvVar2 = this.A.a.a().g;
        if (atqvVar2 == null) {
            atqvVar2 = atqv.a;
        }
        if (!atqvVar2.D || agxhVar.a <= a2.d - a2.c) {
            agxz a6 = agya.a(13);
            a6.f(str);
            a6.e(4096);
            p(a6.a());
            r();
            this.u.c(this.f45J, agxhVar.a);
            return;
        }
        agxz a7 = agya.a(10);
        a7.f(str);
        a7.d(agxqVar.b);
        a7.c(atsgVar);
        p(a7.a());
    }

    @Override // defpackage.agxt
    public final int e() {
        int size;
        synchronized (this.k) {
            size = this.Q.size() + this.R.size();
        }
        return size;
    }

    @Override // defpackage.agxt
    public final void f(String str, String str2, int i, agpw agpwVar) {
        agxe agxeVar = new agxe(str, str2, i, agpwVar, 0);
        agxz a2 = agya.a(2);
        a2.b = ampq.j(agxeVar);
        p(a2.a());
    }

    @Override // defpackage.agxt
    public final void h() {
        p(agya.a(12).a());
    }

    @Override // defpackage.agxt
    public final void i(String str) {
        agxz a2 = agya.a(19);
        a2.f(str);
        p(a2.a());
    }

    @Override // defpackage.agxt
    public final void j() {
        this.O = true;
        this.P = false;
        agyk agykVar = this.G;
        try {
            this.p.unregisterReceiver(agykVar);
        } catch (IllegalArgumentException unused) {
            String valueOf = String.valueOf(agykVar.getClass().getSimpleName());
            if (valueOf.length() != 0) {
                "[Offline] No need to unregister receiver which was not registered or already unregistered: ".concat(valueOf);
            }
        }
        agykVar.a = null;
        agym agymVar = this.H;
        aypg aypgVar = agymVar.c;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
        }
        aypg aypgVar2 = agymVar.d;
        if (aypgVar2 != null) {
            azof.f((AtomicReference) aypgVar2);
        }
        p(agya.a(14).a());
    }

    @Override // defpackage.agxt
    public final void k(String str, int i) {
        agxz a2 = agya.a(3);
        a2.f(str);
        a2.e(i);
        p(a2.a());
    }

    @Override // defpackage.agxt
    public final void l(String str) {
        agxz a2 = agya.a(1);
        a2.a = ampq.j(str);
        p(a2.a());
    }

    @Override // defpackage.agxt
    public final void m(String str) {
        agxz a2 = agya.a(20);
        a2.f(str);
        p(a2.a());
    }

    @Override // defpackage.agxt
    public final void n(String str) {
        synchronized (this.k) {
            if (this.g.contains(str)) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) this.R.remove(str);
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                agxz a2 = agya.a(11);
                a2.f(str);
                p(a2.a());
            }
        }
    }

    @Override // defpackage.agxt
    public final void o(awuy awuyVar) {
        agxz a2 = agya.a(21);
        a2.c = ampq.j(awuyVar);
        p(a2.a());
    }

    public final void p(agya agyaVar) {
        if (this.h) {
            return;
        }
        synchronized (this.k) {
            u();
            this.Q.add(agyaVar);
            q();
        }
    }

    public final void q() {
        ankt anktVar;
        synchronized (this.k) {
            if (!this.Q.isEmpty() && ((anktVar = this.l) == null || anktVar.isDone())) {
                ankt t = anlz.t(new agxw(this, 1), this.q);
                this.l = t;
                t.qY(new agxw(this), this.q);
            }
        }
    }

    @Override // defpackage.agyj
    public final void r() {
        p(agya.a(4).a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x0718, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyb.s():boolean");
    }

    @Override // defpackage.agxt
    public final void g(String str, Bundle bundle) {
        char c;
        String string;
        if (str == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 1134224607) {
            if (hashCode == 1897312741 && str.equals("com.google.android.libraries.youtube.offline.transfer.service.ActionDelayedMessage")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return;
            }
            p(agya.a(4).a());
        } else if (bundle == null || bundle.getInt("messageId") != 10 || (string = bundle.getString("messageData")) == null) {
        } else {
            agxz a2 = agya.a(11);
            a2.f(string);
            p(a2.a());
        }
    }
}
