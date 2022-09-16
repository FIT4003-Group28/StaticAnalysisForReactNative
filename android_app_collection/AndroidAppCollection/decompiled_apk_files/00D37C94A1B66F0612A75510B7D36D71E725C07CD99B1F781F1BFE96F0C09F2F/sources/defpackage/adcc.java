package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adcc  reason: default package */
/* loaded from: classes.dex */
public final class adcc implements adcd, akuk {
    public static final /* synthetic */ int b = 0;
    private static final long c = TimeUnit.HOURS.toMillis(2);
    private static final String d = zep.a("MDX.FeedbackFiller");
    public final yrj a;
    private final adoa e;
    private final snc f;
    private final advw g;
    private final azqb h;
    private final adgc i;
    private final boolean j;
    private long m = -1;
    private final adny n = new adcb(this);
    private final Object k = new Object();
    private Map l = new HashMap();

    public adcc(adoa adoaVar, snc sncVar, advw advwVar, yrj yrjVar, azqb azqbVar, adgc adgcVar, aczr aczrVar) {
        this.f = sncVar;
        this.e = adoaVar;
        this.g = advwVar;
        this.a = yrjVar;
        this.h = azqbVar;
        this.i = adgcVar;
        this.j = aczrVar.c.equals("m");
    }

    private static void e(Map map, adnt adntVar) {
        if (adntVar.j() instanceof adib) {
            map.put("mdx_screen_identifier", ((adib) adntVar.j()).f.c);
        }
        String str = "unknown";
        if (adntVar.k() instanceof adid) {
            adid adidVar = (adid) adntVar.k();
            map.put("mdx_dial_manufacturer", zgh.h(adidVar.f));
            map.put("mdx_dial_model", zgh.h(adidVar.g));
            map.put("mdx_dial_is_wol", String.valueOf(adidVar.o()));
            int a = adidVar.a.a();
            map.put("mdx_dial_app_status", a != -1 ? a != 0 ? a != 1 ? a != 2 ? a != 3 ? str : "hidden" : "stopped" : "running" : "installable" : "not found");
            map.put("mdx_dial_is_sleeping", String.valueOf(adidVar.n()));
        }
        int i = adntVar.o().i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            str = "cast";
        } else if (i2 == 2) {
            str = "dial";
        } else if (i2 == 3) {
            str = "cloud";
        }
        map.put("mdx_session_type", str);
        int a2 = adntVar.a();
        map.put("mdx_session_state", a2 != 0 ? a2 != 1 ? "disconnected" : "connected" : "connecting");
        map.put("mdx_session_nonce", adntVar.o().g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if ((r8.f.c() - r8.m) >= defpackage.adcc.c) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:5:0x0013, B:7:0x001b, B:9:0x0023, B:12:0x0037, B:14:0x003f, B:15:0x005c, B:11:0x0032), top: B:35:0x0013 }] */
    @Override // defpackage.akuk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r9, android.os.Bundle r10) {
        /*
            r8 = this;
            defpackage.ylr.c()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            adoa r0 = r8.e
            adnt r0 = r0.e()
            java.lang.Object r1 = r8.k
            monitor-enter(r1)
            if (r0 != 0) goto L32
            java.util.Map r2 = r8.l     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto L37
            long r2 = r8.m     // Catch: java.lang.Throwable -> Lc5
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L37
            snc r2 = r8.f     // Catch: java.lang.Throwable -> Lc5
            long r2 = r2.c()     // Catch: java.lang.Throwable -> Lc5
            long r4 = r8.m     // Catch: java.lang.Throwable -> Lc5
            long r2 = r2 - r4
            long r4 = defpackage.adcc.c     // Catch: java.lang.Throwable -> Lc5
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L37
        L32:
            java.util.Map r2 = r8.l     // Catch: java.lang.Throwable -> Lc5
            r2.clear()     // Catch: java.lang.Throwable -> Lc5
        L37:
            java.util.Map r2 = r8.l     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto L5c
            java.util.Map r2 = r8.l     // Catch: java.lang.Throwable -> Lc5
            r9.putAll(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "mdx_seconds_since_session_cached"
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lc5
            snc r4 = r8.f     // Catch: java.lang.Throwable -> Lc5
            long r4 = r4.c()     // Catch: java.lang.Throwable -> Lc5
            long r6 = r8.m     // Catch: java.lang.Throwable -> Lc5
            long r4 = r4 - r6
            long r3 = r3.toSeconds(r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lc5
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> Lc5
        L5c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L62
            e(r9, r0)
        L62:
            boolean r0 = r8.j
            if (r0 == 0) goto L8c
            adgc r0 = r8.i
            adgn r0 = r0.e
            if (r0 != 0) goto L78
            java.lang.String r0 = "selected_media_route_type"
            r1 = 0
            r9.put(r0, r1)
            java.lang.String r0 = "selected_media_route_name"
            r9.put(r0, r1)
            goto L8c
        L78:
            java.lang.String r1 = "selected_media_route_type"
            int r2 = r0.a()
            java.lang.String r2 = defpackage.adyf.e(r2)
            r9.put(r1, r2)
            java.lang.String r1 = "selected_media_route_name"
            java.lang.String r0 = r0.a
            r9.put(r1, r0)
        L8c:
            adii r0 = defpackage.adik.a()
            advw r1 = r8.g
            ankt r1 = r1.a(r0)
            adbz r2 = new adbz
            r2.<init>()
            defpackage.ylx.i(r1, r2)
            java.util.Set r0 = r9.keySet()
            java.util.Iterator r0 = r0.iterator()
        La6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r10.putString(r1, r2)
            goto La6
        Lbc:
            snc r9 = r8.f
            long r9 = r9.c()
            r8.m = r9
            return
        Lc5:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            goto Lc9
        Lc8:
            throw r9
        Lc9:
            goto Lc8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcc.a(java.lang.String, android.os.Bundle):void");
    }

    public final void b(adnt adntVar) {
        HashMap hashMap = new HashMap();
        e(hashMap, adntVar);
        if (hashMap.isEmpty()) {
            return;
        }
        synchronized (this.k) {
            this.l = hashMap;
        }
        this.m = this.f.c();
    }

    @Override // defpackage.adcd
    public final void c() {
        adnt e = this.e.e();
        if (e != null) {
            b(e);
        }
        this.e.g(this.n);
    }

    @Override // defpackage.akuk
    public final void d(Bundle bundle) {
        adnt e = this.e.e();
        if (e == null || !(e.k() instanceof adhz)) {
            return;
        }
        CastDevice castDevice = ((adhz) e.k()).a;
        adby adbyVar = (adby) this.h.get();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        final adca adcaVar = new adca(bundle, countDownLatch);
        InetAddress inetAddress = castDevice.c;
        Inet4Address inet4Address = (inetAddress == null || !(inetAddress instanceof Inet4Address)) ? null : (Inet4Address) inetAddress;
        if (inet4Address != null) {
            String uuid = UUID.randomUUID().toString();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uuid", uuid);
                adbyVar.b.a(new yty(String.format(Locale.US, "http://%s:%d/%s", inet4Address.getHostAddress(), 8008, "setup/send_log_report"), jSONObject, new cfa() { // from class: adbx
                    @Override // defpackage.cfa
                    public final void lG(Object obj) {
                        String str;
                        adca adcaVar2 = adca.this;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String str2 = adby.a;
                        try {
                            str = jSONObject2.getString("crash_report_id");
                        } catch (JSONException e2) {
                            zep.f(adby.a, "Failed extracting crash report id from response", e2);
                            str = null;
                        }
                        adcaVar2.a(str);
                    }
                }, new cez() { // from class: adbw
                    @Override // defpackage.cez
                    public final void kV(cff cffVar) {
                        adca adcaVar2 = adca.this;
                        String str = adby.a;
                        String valueOf = String.valueOf(cffVar.getMessage());
                        zep.c(str, valueOf.length() != 0 ? "Failed getting crash report id: ".concat(valueOf) : new String("Failed getting crash report id: "));
                        adcaVar2.a(null);
                    }
                }, true));
            } catch (JSONException e2) {
                zep.f(adby.a, "Failed creating json object", e2);
                adcaVar.a(null);
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e3) {
            zep.f(d, "Failed filling casting crash report id", e3);
        }
    }
}
