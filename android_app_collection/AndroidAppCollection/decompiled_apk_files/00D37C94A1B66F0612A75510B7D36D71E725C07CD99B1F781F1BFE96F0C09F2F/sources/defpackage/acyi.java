package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acyi  reason: default package */
/* loaded from: classes.dex */
public final class acyi implements adst, ynl {
    public static final String a = zep.a("MDX.CloudChannel");
    private Future A;
    private final axnm B;
    private adsr C;
    public final yni b;
    public Future d;
    public adss h;
    public acys i;
    public adsw j;
    public int m;
    public final acvh s;
    public final acyp t;
    private final Context v;
    private final ScheduledExecutorService w;
    private final int x;
    private final ExecutorService y = Executors.newSingleThreadExecutor(new yli("mdxMsg"));
    private final ExecutorService z = Executors.newSingleThreadExecutor(new yli("mdxConnect"));
    public final ExecutorService c = Executors.newSingleThreadExecutor(new yli("mdxHangingGet"));
    public final Object e = new Object();
    public final Queue f = new LinkedBlockingQueue(10);
    public final Object g = new Object();
    protected int k = 0;
    public final Object l = new Object();
    public final Object n = new Object();
    public int o = 0;
    public final Object p = new Object();
    public boolean q = false;
    public final Object r = new Object();
    final acyg u = new acyg(this);

    public acyi(Context context, acyp acypVar, yni yniVar, ScheduledExecutorService scheduledExecutorService, acvh acvhVar, axnm axnmVar, acwu acwuVar) {
        this.v = context;
        acypVar.getClass();
        this.t = acypVar;
        this.b = yniVar;
        this.w = scheduledExecutorService;
        this.s = !acwuVar.z ? new acvj() : acvhVar;
        int i = acwuVar.S;
        this.x = i <= 0 ? 2 : i;
        this.B = axnmVar;
    }

    @Override // defpackage.adst
    public final int a() {
        int i;
        synchronized (this.l) {
            i = this.k;
        }
        return i;
    }

    @Override // defpackage.adst
    public final void b(adss adssVar) {
        this.h = adssVar;
        c();
    }

    public final void c() {
        synchronized (this.n) {
            this.m = 0;
        }
        synchronized (this.l) {
            final int i = this.k;
            if (i == 1) {
                zep.h(a, "Already in the process of connecting. Ignoring connect request");
                return;
            }
            this.k = 1;
            Future future = this.A;
            if (future != null && !future.isDone()) {
                this.A.cancel(true);
            }
            this.A = this.z.submit(new Runnable() { // from class: acyf
                @Override // java.lang.Runnable
                public final void run() {
                    acys acysVar;
                    acyl acylVar;
                    IOException iOException;
                    acyi acyiVar = acyi.this;
                    int i2 = i;
                    synchronized (acyiVar.r) {
                        acyiVar.q = false;
                    }
                    if (i2 == 2) {
                        acyiVar.h("MDX_CLIENT_BROWSER_CHANNEL_DISCONNECT_REASON_CANCELLED");
                    }
                    try {
                        acyp acypVar = acyiVar.t;
                        adsw adswVar = acyiVar.j;
                        HashMap hashMap = new HashMap();
                        if (acypVar.f.t) {
                            hashMap.put("x-use-alt-service", "true");
                        }
                        boolean z = acypVar.f.H && (adswVar.c == adim.DIAL || adswVar.c == adim.IN_APP_DIAL);
                        String str = ((advz) acypVar.a.get()).f;
                        azqb azqbVar = acypVar.b;
                        adnb adnbVar = adswVar.e;
                        HashMap hashMap2 = new HashMap((Map) acypVar.e.get());
                        hashMap2.put("magmaKey", adswVar.f);
                        if (adswVar.a()) {
                            hashMap2.put("method", adswVar.a.al);
                            if (adswVar.b()) {
                                hashMap2.put("params", adtb.b(adswVar.b).toString());
                            }
                        }
                        if (adswVar.d) {
                            hashMap2.put("ui", "");
                        }
                        adim adimVar = adswVar.c;
                        if (adimVar != null) {
                            hashMap2.put("pairing_type", adimVar.e);
                        }
                        acyiVar.i = new acyo(str, azqbVar, adnbVar, hashMap2, hashMap, acypVar.c, acypVar.d, acypVar.f.C, z);
                        acys acysVar2 = acyiVar.i;
                        ((acyo) acysVar2).c.a = new acyr(acysVar2, acyiVar.u);
                        acysVar = acyiVar.i;
                        acylVar = new acyl();
                        ((acyo) acysVar).c(((acyo) acysVar).e, acylVar);
                        ((acyo) acysVar).l = false;
                        iOException = acylVar.b;
                    } catch (acyv e) {
                        String str2 = acyi.a;
                        String c = aczo.c(e.a);
                        StringBuilder sb = new StringBuilder(c.length() + 37);
                        sb.append("Unauthorized error received on bind: ");
                        sb.append(c);
                        zep.f(str2, sb.toString(), e);
                        int i3 = e.a;
                        int i4 = i3 - 1;
                        if (i3 == 0) {
                            throw null;
                        }
                        if (i4 == 0 || i4 == 1 || i4 == 2) {
                            acyiVar.i.b();
                            acyiVar.i(atcv.MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED);
                            return;
                        } else if (i4 == 3) {
                            acyiVar.i.a();
                            acyiVar.l();
                            return;
                        }
                    } catch (acyw e2) {
                        String str3 = acyi.a;
                        int i5 = e2.b;
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("Unexpected response when binding channel: ");
                        sb2.append(i5);
                        zep.f(str3, sb2.toString(), e2);
                        int i6 = e2.b;
                        if (i6 == 401) {
                            acyiVar.i.b();
                            acyiVar.i(atcv.MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED);
                            return;
                        } else if (i6 == 403) {
                            acyiVar.i(atcv.MDX_SESSION_DISCONNECT_REASON_BROWSER_CHANNEL_ERROR);
                            return;
                        } else {
                            acyiVar.l();
                            return;
                        }
                    } catch (Exception e3) {
                        zep.f(acyi.a, "Error connecting to Remote Control server:", e3);
                        acyiVar.l();
                        return;
                    }
                    if (iOException == null) {
                        int i7 = acylVar.a;
                        if (((acyo) acysVar).f && i7 == 401) {
                            throw acyv.a(acylVar.c);
                        }
                        acyc acycVar = ((acyo) acysVar).c;
                        acyc.a(i7);
                        if (i7 == 200) {
                            ((acyo) acysVar).c.b(acylVar.c.toCharArray());
                        }
                        synchronized (acyiVar.l) {
                            acyiVar.k = 2;
                        }
                        synchronized (acyiVar.p) {
                            acyiVar.o = 0;
                        }
                        synchronized (acyiVar.e) {
                            acyiVar.d = acyiVar.c.submit(new acye(acyiVar, 1));
                        }
                        synchronized (acyiVar.l) {
                            if (acyiVar.k == 2) {
                                acyiVar.k();
                            }
                        }
                        return;
                    }
                    throw iOException;
                }
            });
        }
    }

    @Override // defpackage.adst
    public final void d() {
        synchronized (this.l) {
            if (this.k == 2) {
                l();
            }
        }
    }

    @Override // defpackage.adst
    public final void e(adil adilVar, adip adipVar) {
        this.b.d(new adag(adilVar, "cloud_bc"));
        this.s.q(asny.LATENCY_ACTION_MDX_COMMAND);
        this.s.t("mdx_cs", asny.LATENCY_ACTION_MDX_COMMAND);
        acvh acvhVar = this.s;
        asny asnyVar = asny.LATENCY_ACTION_MDX_COMMAND;
        aopa createBuilder = asno.a.createBuilder();
        aopa createBuilder2 = asnt.a.createBuilder();
        createBuilder2.copyOnWrite();
        asnt asntVar = (asnt) createBuilder2.instance;
        asntVar.e = 1;
        asntVar.b |= 4;
        String str = adilVar.al;
        createBuilder2.copyOnWrite();
        asnt asntVar2 = (asnt) createBuilder2.instance;
        str.getClass();
        asntVar2.b = 1 | asntVar2.b;
        asntVar2.c = str;
        asnt asntVar3 = (asnt) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asntVar3.getClass();
        asnoVar.w = asntVar3;
        asnoVar.c |= 1048576;
        acvhVar.n(asnyVar, (asno) createBuilder.mo39build());
        this.f.offer(new acyh(adilVar, adipVar));
        k();
    }

    @Override // defpackage.adst
    public final void g() {
        ((acyo) this.i).i = null;
    }

    public final void h(String str) {
        synchronized (this.e) {
            Future future = this.d;
            if (future != null && !future.isDone()) {
                this.d.cancel(true);
                this.d = null;
            }
        }
        acys acysVar = this.i;
        HashMap hashMap = new HashMap();
        hashMap.put("TYPE", "terminate");
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("clientDisconnectReason", str);
            if (atcv.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER.name().equals(str)) {
                hashMap.put("ui", "");
            }
        }
        try {
            ((acyo) acysVar).c(hashMap, new adbh(1));
        } catch (IOException e) {
            zep.f(acyo.a, "Terminate request failed", e);
        }
        ((acyo) acysVar).g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(atcv atcvVar) {
        synchronized (this.r) {
            String.valueOf(String.valueOf(atcvVar)).length();
            this.q = true;
        }
        this.f.clear();
        synchronized (this.l) {
            if (this.k == 2) {
                h(atcvVar.name());
            }
            this.k = 0;
        }
        adsr adsrVar = this.C;
        if (adsrVar != null && !((adpl) adsrVar).aE()) {
            ((adqy) adsrVar).D(atcvVar);
        }
        this.h = null;
        this.C = null;
    }

    @Override // defpackage.adst
    public final void j(boolean z) {
        atcv atcvVar;
        if (z) {
            atcvVar = atcv.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
        } else {
            atcvVar = atcv.MDX_SESSION_DISCONNECT_REASON_BROWSER_CHANNEL_ERROR;
        }
        i(atcvVar);
    }

    public final void k() {
        this.y.submit(new Runnable() { // from class: acyd
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                acyi acyiVar = acyi.this;
                synchronized (acyiVar.g) {
                    acyh acyhVar = (acyh) acyiVar.f.peek();
                    if (acyhVar == null) {
                        return;
                    }
                    if (System.currentTimeMillis() - acyhVar.c > 5000) {
                        String str2 = acyi.a;
                        Locale locale = Locale.US;
                        String valueOf = String.valueOf(acyhVar.a);
                        String valueOf2 = String.valueOf(acyhVar.b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
                        sb.append(valueOf);
                        sb.append(": ");
                        sb.append(valueOf2);
                        zep.h(str2, String.format(locale, "Message: %s is older than %dms. Dropping.", sb.toString(), 5000));
                        acyiVar.f.poll();
                    } else {
                        adil adilVar = acyhVar.a;
                        adip adipVar = acyhVar.b;
                        synchronized (acyiVar.l) {
                            int i = acyiVar.k;
                            if (i == 1) {
                                zep.h(acyi.a, String.format(Locale.US, "Attempting to send a message while still in CONNECTING or RECONNECTING state.", new Object[0]));
                            } else if (i != 2) {
                                acyiVar.f.clear();
                                zep.h(acyi.a, String.format(Locale.US, "Dropping all calls from the queue because not connected.", new Object[0]));
                            } else {
                                String.valueOf(String.valueOf(adilVar)).length();
                                try {
                                    acys acysVar = acyiVar.i;
                                    acyn acynVar = new acyn();
                                    int i2 = ((acyo) acysVar).j;
                                    ((acyo) acysVar).j = i2 + 1;
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("count", "1");
                                    hashMap.put(String.format("req%s__sc", String.valueOf(i2)), adilVar.al);
                                    Iterator it = adipVar.iterator();
                                    while (it.hasNext()) {
                                        adio mo416next = ((adin) it).mo416next();
                                        hashMap.put(String.format("req%s_%s", String.valueOf(i2), mo416next.a), mo416next.b);
                                    }
                                    String.valueOf(String.valueOf(hashMap)).length();
                                    ((acyo) acysVar).c(hashMap, acynVar);
                                    ((acyo) acysVar).l = false;
                                    if (((acyo) acysVar).f && acynVar.a == 401 && (str = acynVar.c) != null) {
                                        acyv a2 = acyv.a(str);
                                        int i3 = a2.a;
                                        int i4 = i3 - 1;
                                        if (i3 == 0) {
                                            throw null;
                                        }
                                        if (i4 == 0 || i4 == 1 || i4 == 2) {
                                            throw a2;
                                        }
                                        if (i4 == 3) {
                                            ((acyo) acysVar).a();
                                        }
                                    }
                                    if (acynVar.a == 200) {
                                        acyiVar.f.poll();
                                        synchronized (acyiVar.n) {
                                            acyiVar.m = 0;
                                        }
                                    }
                                } catch (acyv e) {
                                    int i5 = e.a;
                                    int i6 = i5 - 1;
                                    if (i5 == 0) {
                                        throw null;
                                    }
                                    if (i6 == 0 || i6 == 1 || i6 == 2) {
                                        String str3 = acyi.a;
                                        String c = aczo.c(e.a);
                                        StringBuilder sb2 = new StringBuilder(c.length() + 60);
                                        sb2.append("Unauthorized error received on send message, disconnecting: ");
                                        sb2.append(c);
                                        zep.f(str3, sb2.toString(), e);
                                        acyiVar.i.b();
                                        acyiVar.i(atcv.MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED);
                                    } else {
                                        String str4 = acyi.a;
                                        String c2 = aczo.c(e.a);
                                        StringBuilder sb3 = new StringBuilder(c2.length() + 77);
                                        sb3.append("Unexpected UnauthorizedErrorException on send message that shouldn't happen: ");
                                        sb3.append(c2);
                                        zep.f(str4, sb3.toString(), e);
                                    }
                                } catch (Exception e2) {
                                    String str5 = acyi.a;
                                    String valueOf3 = String.valueOf(adilVar);
                                    String valueOf4 = String.valueOf(adipVar);
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 35 + String.valueOf(valueOf4).length());
                                    sb4.append("Exception while sending message: ");
                                    sb4.append(valueOf3);
                                    sb4.append(": ");
                                    sb4.append(valueOf4);
                                    zep.f(str5, sb4.toString(), e2);
                                }
                                synchronized (acyiVar.n) {
                                    int i7 = acyiVar.m + 1;
                                    acyiVar.m = i7;
                                    if (i7 < 2) {
                                        String str6 = acyi.a;
                                        int i8 = acyiVar.m;
                                        StringBuilder sb5 = new StringBuilder(50);
                                        sb5.append("Increasing recent errors and retrying: ");
                                        sb5.append(i8);
                                        zep.h(str6, sb5.toString());
                                    } else {
                                        String str7 = acyi.a;
                                        Locale locale2 = Locale.US;
                                        String valueOf5 = String.valueOf(adilVar);
                                        String valueOf6 = String.valueOf(adipVar);
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 2 + String.valueOf(valueOf6).length());
                                        sb6.append(valueOf5);
                                        sb6.append(": ");
                                        sb6.append(valueOf6);
                                        zep.h(str7, String.format(locale2, "Too many errors on sending %s. Reconnecting...", sb6.toString()));
                                        acyiVar.l();
                                    }
                                }
                            }
                        }
                    }
                    acyiVar.k();
                }
            }
        });
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (((wgh) obj).a() != wgg.FINISHED) {
                    return null;
                }
                l();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{wgh.class};
    }

    public final void l() {
        synchronized (this.l) {
            this.k = 0;
            h("MDX_CLIENT_BROWSER_CHANNEL_DISCONNECT_REASON_RECONNECT");
        }
        synchronized (this.r) {
            if (this.q) {
                return;
            }
            if (!((yrj) this.B.get()).p()) {
                this.v.sendBroadcast(adhx.CLOUD_SERVICE_NO_NETWORK.a());
                return;
            }
            synchronized (this.p) {
                if (this.o >= this.x) {
                    zep.c(a, "Reconnect Scheduler: Reconnecting for too long, abort");
                    this.v.sendBroadcast(adhx.LOUNGE_SERVER_CONNECTION_ERROR.a());
                    this.o = 0;
                    return;
                }
                int i = this.o;
                this.o = i + 1;
                this.w.schedule(new acye(this), Math.scalb(((int) (Math.random() * 1000.0d)) + 2000, i), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // defpackage.adst
    public final void m(adsr adsrVar) {
        this.C = adsrVar;
    }

    @Override // defpackage.adst
    public final void n(adsw adswVar) {
        this.j = adswVar;
    }
}
