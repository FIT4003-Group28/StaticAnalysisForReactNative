package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: adta  reason: default package */
/* loaded from: classes.dex */
public final class adta implements adss, adtj {
    private static final String d = zep.a("MDX.transport");
    private static final long e = TimeUnit.SECONDS.toMillis(2);
    int b;
    Handler c;
    private final adss f;
    private HandlerThread g;
    private final acrr h;
    final Map a = new HashMap(100);
    private final AtomicInteger i = new AtomicInteger(0);
    private final AtomicInteger j = new AtomicInteger(0);
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);

    public adta(adss adssVar, acrr acrrVar) {
        this.f = adssVar;
        this.h = acrrVar;
    }

    private final synchronized void e() {
        aopa createBuilder = atbp.a.createBuilder();
        int andSet = this.j.getAndSet(0);
        createBuilder.copyOnWrite();
        atbp atbpVar = (atbp) createBuilder.instance;
        atbpVar.b |= 2;
        atbpVar.d = andSet;
        int andSet2 = this.l.getAndSet(0);
        createBuilder.copyOnWrite();
        atbp atbpVar2 = (atbp) createBuilder.instance;
        atbpVar2.b |= 8;
        atbpVar2.f = andSet2;
        int andSet3 = this.i.getAndSet(0);
        createBuilder.copyOnWrite();
        atbp atbpVar3 = (atbp) createBuilder.instance;
        atbpVar3.b |= 1;
        atbpVar3.c = andSet3;
        int andSet4 = this.k.getAndSet(0);
        createBuilder.copyOnWrite();
        atbp atbpVar4 = (atbp) createBuilder.instance;
        atbpVar4.b |= 4;
        atbpVar4.e = andSet4;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cV((atbp) createBuilder.mo39build());
        this.h.c((arrh) a.mo39build());
    }

    private final synchronized void f() {
        if (j(this.b)) {
            int i = this.b + 1;
            this.b = i;
            String.format("Now expected MSN(%d)", Integer.valueOf(i));
            f();
        }
    }

    private final synchronized void g(adtd adtdVar) {
        if (this.g == null) {
            this.b = adtdVar.a();
            HandlerThread handlerThread = new HandlerThread(getClass().getName(), 10);
            this.g = handlerThread;
            handlerThread.start();
            this.c = new Handler(this.g.getLooper());
            String.format("Starting with MSN(%d): %s", Integer.valueOf(this.b), adtdVar);
            b(adtdVar);
        }
    }

    private final synchronized boolean h(adtd adtdVar) {
        Runnable runnable;
        if (this.a.size() == 100) {
            String.format("Queue too big, dropping message: %s", adtdVar);
            this.i.incrementAndGet();
            return false;
        }
        final int a = adtdVar.a();
        if (a >= this.b) {
            Map map = this.a;
            Integer valueOf = Integer.valueOf(a);
            if (!map.containsKey(valueOf)) {
                String.format("Queueing MSN(%d): %s", valueOf, adtdVar);
                Runnable runnable2 = new Runnable() { // from class: adsx
                    @Override // java.lang.Runnable
                    public final void run() {
                        adta.this.c(a);
                    }
                };
                Map map2 = this.a;
                adsy adsyVar = new adsy();
                adsyVar.b = runnable2;
                if (adtdVar != null) {
                    adsyVar.a = adtdVar;
                    adtd adtdVar2 = adsyVar.a;
                    if (adtdVar2 != null && (runnable = adsyVar.b) != null) {
                        map2.put(valueOf, new adsz(adtdVar2, runnable));
                        this.j.incrementAndGet();
                        Handler handler = this.c;
                        if (handler != null) {
                            handler.postDelayed(runnable2, e);
                        }
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (adsyVar.a == null) {
                        sb.append(" message");
                    }
                    if (adsyVar.b == null) {
                        sb.append(" timeoutRunnable");
                    }
                    String valueOf2 = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf2);
                    throw new IllegalStateException(sb2.toString());
                }
                throw new NullPointerException("Null message");
            }
        }
        this.l.incrementAndGet();
        String.format("Dropping MSN(%d): %s", Integer.valueOf(a), adtdVar);
        return false;
    }

    private final synchronized boolean i() {
        return this.g != null;
    }

    private final synchronized boolean j(int i) {
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
        adsz adszVar = (adsz) map.remove(valueOf);
        if (adszVar == null) {
            return false;
        }
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacks(adszVar.b);
        }
        String.format("Processing deduped message MSN(%d): %s", valueOf, adszVar.a);
        this.f.b(adszVar.a);
        return true;
    }

    @Override // defpackage.adtj
    public final void a(adtd adtdVar) {
        try {
            g(adtdVar);
        } catch (JSONException unused) {
            zep.c(d, String.format("Invalid format for Session Status: %s", adtdVar));
        }
    }

    @Override // defpackage.adss
    public final void b(adtd adtdVar) {
        if (!i() || !adtdVar.b.has("senderMsn")) {
            this.f.b(adtdVar);
        } else if (!h(adtdVar)) {
        } else {
            f();
        }
    }

    public final synchronized void c(int i) {
        this.k.incrementAndGet();
        String.format("Cleaning MSN(%d)", Integer.valueOf(i));
        for (int i2 = this.b; i2 <= i; i2++) {
            try {
                j(i2);
            } catch (JSONException e2) {
                zep.f(d, String.format("Problem cleaning MSN(%d)", Integer.valueOf(i2)), e2);
            }
        }
        int i3 = i + 1;
        this.b = i3;
        String.format("Now expected MSN(%d)", Integer.valueOf(i3));
        try {
            f();
        } catch (JSONException e3) {
            zep.f(d, "Problem processing the queue", e3);
        }
    }

    public final synchronized void d() {
        HandlerThread handlerThread = this.g;
        if (handlerThread != null) {
            handlerThread.quit();
            this.g = null;
            this.c = null;
            this.a.clear();
            e();
        }
    }
}
