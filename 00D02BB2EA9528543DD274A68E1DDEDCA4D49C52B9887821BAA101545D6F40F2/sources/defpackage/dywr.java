package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: dywr  reason: default package */
/* loaded from: classes6.dex */
public final class dywr implements dymc, dyvz {
    private static final Map<dyxw, dyjb> F;
    private static final dywk[] G;
    public static final Logger a;
    public long A;
    public final Runnable B;
    public final int C;
    public final dyvr D;
    @dzsi
    final dyge E;
    private final dygo H;
    private int I;
    private final dyuz J;
    private final int K;
    private boolean L;
    private boolean M;
    private ScheduledExecutorService N;
    private final dype<dywk> O;
    public final InetSocketAddress b;
    public final String c;
    public final String d;
    public final Random e = new Random();
    public final int f;
    public dysl g;
    public dywa h;
    public dyxd i;
    public final Object j;
    public final Map<Integer, dywk> k;
    public final Executor l;
    public int m;
    public dywq n;
    public dyel o;
    public dyjb p;
    public dypd q;
    public boolean r;
    public final SocketFactory s;
    public SSLSocketFactory t;
    public int u;
    public final Deque<dywk> v;
    public final dyxh w;
    public dyqg x;
    public boolean y;
    public long z;

    static {
        EnumMap enumMap = new EnumMap(dyxw.class);
        enumMap.put((EnumMap) dyxw.NO_ERROR, (dyxw) dyjb.l.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) dyxw.PROTOCOL_ERROR, (dyxw) dyjb.l.g("Protocol error"));
        enumMap.put((EnumMap) dyxw.INTERNAL_ERROR, (dyxw) dyjb.l.g("Internal error"));
        enumMap.put((EnumMap) dyxw.FLOW_CONTROL_ERROR, (dyxw) dyjb.l.g("Flow control error"));
        enumMap.put((EnumMap) dyxw.STREAM_CLOSED, (dyxw) dyjb.l.g("Stream closed"));
        enumMap.put((EnumMap) dyxw.FRAME_TOO_LARGE, (dyxw) dyjb.l.g("Frame too large"));
        enumMap.put((EnumMap) dyxw.REFUSED_STREAM, (dyxw) dyjb.m.g("Refused stream"));
        enumMap.put((EnumMap) dyxw.CANCEL, (dyxw) dyjb.c.g("Cancelled"));
        enumMap.put((EnumMap) dyxw.COMPRESSION_ERROR, (dyxw) dyjb.l.g("Compression error"));
        enumMap.put((EnumMap) dyxw.CONNECT_ERROR, (dyxw) dyjb.l.g("Connect error"));
        enumMap.put((EnumMap) dyxw.ENHANCE_YOUR_CALM, (dyxw) dyjb.j.g("Enhance your calm"));
        enumMap.put((EnumMap) dyxw.INADEQUATE_SECURITY, (dyxw) dyjb.h.g("Inadequate security"));
        F = Collections.unmodifiableMap(enumMap);
        a = Logger.getLogger(dywr.class.getName());
        G = new dywk[0];
    }

    public dywr(InetSocketAddress inetSocketAddress, String str, @dzsi String str2, dyel dyelVar, Executor executor, @dzsi SSLSocketFactory sSLSocketFactory, dyxh dyxhVar, int i, int i2, @dzsi dyge dygeVar, Runnable runnable, int i3, dyvr dyvrVar) {
        Object obj = new Object();
        this.j = obj;
        this.k = new HashMap();
        this.u = 0;
        this.v = new LinkedList();
        this.O = new dywl(this);
        dbsk.t(inetSocketAddress, "address");
        this.b = inetSocketAddress;
        this.c = str;
        this.K = 4194304;
        this.f = 65535;
        dbsk.t(executor, "executor");
        this.l = executor;
        this.J = new dyuz(executor);
        this.I = 3;
        this.s = SocketFactory.getDefault();
        this.t = sSLSocketFactory;
        dbsk.t(dyxhVar, "connectionSpec");
        this.w = dyxhVar;
        dyhs<Long> dyhsVar = dyow.a;
        this.d = dyow.d("okhttp", str2);
        this.E = dygeVar;
        this.B = runnable;
        this.C = Integer.MAX_VALUE;
        this.D = dyvrVar;
        this.H = dygo.a(getClass(), inetSocketAddress.toString());
        dyej b = dyel.b();
        b.b(dyop.b, dyelVar);
        this.o = b.a();
        synchronized (obj) {
        }
    }

    public static String h(eajy eajyVar) {
        eaiz eaizVar = new eaiz();
        while (eajyVar.Te(eaizVar, 1L) != -1) {
            if (eaizVar.i(eaizVar.b - 1) == 10) {
                long C = eaizVar.C((byte) 10, 0L, Long.MAX_VALUE);
                if (C == -1) {
                    eaiz eaizVar2 = new eaiz();
                    eaizVar.G(eaizVar2, 0L, Math.min(32L, eaizVar.b));
                    long min = Math.min(eaizVar.b, Long.MAX_VALUE);
                    String e = eaizVar2.n().e();
                    StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 50);
                    sb.append("\\n not found: limit=");
                    sb.append(min);
                    sb.append(" content=");
                    sb.append(e);
                    sb.append((char) 8230);
                    throw new EOFException(sb.toString());
                }
                return eaizVar.u(C);
            }
        }
        String valueOf = String.valueOf(eaizVar.n().e());
        throw new EOFException(valueOf.length() != 0 ? "\\n not found: ".concat(valueOf) : new String("\\n not found: "));
    }

    public static dyjb t(dyxw dyxwVar) {
        dyjb dyjbVar = F.get(dyxwVar);
        if (dyjbVar != null) {
            return dyjbVar;
        }
        dyjb dyjbVar2 = dyjb.d;
        int i = dyxwVar.s;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown http2 error code: ");
        sb.append(i);
        return dyjbVar2.g(sb.toString());
    }

    private final void u() {
        if (this.p == null || !this.k.isEmpty() || !this.v.isEmpty() || this.r) {
            return;
        }
        this.r = true;
        dyqg dyqgVar = this.x;
        if (dyqgVar != null) {
            dyqgVar.e();
            dyvg.e(dyow.m, this.N);
            this.N = null;
        }
        dypd dypdVar = this.q;
        if (dypdVar != null) {
            Throwable q = q();
            synchronized (dypdVar) {
                if (!dypdVar.d) {
                    dypdVar.d = true;
                    dypdVar.e = q;
                    Map<dyqe, Executor> map = dypdVar.c;
                    dypdVar.c = null;
                    for (Map.Entry<dyqe, Executor> entry : map.entrySet()) {
                        dypd.b(entry.getKey(), entry.getValue(), q);
                    }
                }
            }
            this.q = null;
        }
        if (!this.L) {
            this.L = true;
            this.h.i(dyxw.NO_ERROR, new byte[0]);
        }
        this.h.close();
    }

    @Override // defpackage.dyvz
    public final void a(Throwable th) {
        m(0, dyxw.INTERNAL_ERROR, dyjb.m.f(th));
    }

    public final void b(dywk dywkVar) {
        boolean z = true;
        dbsk.m(dywkVar.g == -1, "StreamId already assigned");
        this.k.put(Integer.valueOf(this.I), dywkVar);
        p(dywkVar);
        dywj dywjVar = dywkVar.h;
        int i = this.I;
        if (dywjVar.w.g != -1) {
            z = false;
        }
        dbsk.n(z, "the stream has been started with id %s", i);
        dywjVar.w.g = i;
        dywjVar.w.h.a();
        if (dywjVar.u) {
            dywa dywaVar = dywjVar.g;
            dywk dywkVar2 = dywjVar.w;
            try {
                dywaVar.b.j(dywkVar2.i, dywkVar2.g, dywjVar.b);
            } catch (IOException e) {
                dywaVar.a.a(e);
            }
            dywjVar.w.d.b();
            dywjVar.b = null;
            if (dywjVar.c.b > 0) {
                dywjVar.h.a(dywjVar.d, dywjVar.w.g, dywjVar.c, dywjVar.e);
            }
            dywjVar.u = false;
        }
        if ((dywkVar.o() != dyhz.UNARY && dywkVar.o() != dyhz.SERVER_STREAMING) || dywkVar.i) {
            this.h.c();
        }
        int i2 = this.I;
        if (i2 < 2147483645) {
            this.I = i2 + 2;
            return;
        }
        this.I = Integer.MAX_VALUE;
        m(Integer.MAX_VALUE, dyxw.NO_ERROR, dyjb.m.g("Stream ids exhausted"));
    }

    @Override // defpackage.dysm
    public final Runnable c(dysl dyslVar) {
        this.g = dyslVar;
        if (this.y) {
            this.N = (ScheduledExecutorService) dyvg.a(dyow.m);
            dyqg dyqgVar = new dyqg(new dyqf(this), this.N, this.z, this.A);
            this.x = dyqgVar;
            dyqgVar.a();
        }
        if (this.b != null) {
            dyvy dyvyVar = new dyvy(this.J, this);
            dyyi dyyiVar = new dyyi();
            dyyh dyyhVar = new dyyh(eajl.b(dyvyVar));
            synchronized (this.j) {
                this.h = new dywa(this, dyyhVar, new dywu(Level.FINE, dywr.class));
                this.i = new dyxd(this, this.h);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.J.execute(new dywo(this, countDownLatch, dyvyVar, dyyiVar));
            try {
                synchronized (this.j) {
                    dywa dywaVar = this.h;
                    try {
                        dywaVar.b.a();
                    } catch (IOException e) {
                        dywaVar.a.a(e);
                    }
                    dyyl dyylVar = new dyyl();
                    dyylVar.d(7, this.f);
                    dywa dywaVar2 = this.h;
                    dywaVar2.c.d(2, dyylVar);
                    try {
                        dywaVar2.b.f(dyylVar);
                    } catch (IOException e2) {
                        dywaVar2.a.a(e2);
                    }
                }
                countDownLatch.countDown();
                this.J.execute(new dywp(this));
                return null;
            } catch (Throwable th) {
                countDownLatch.countDown();
                throw th;
            }
        }
        synchronized (this.j) {
            this.h = new dywa(this, null, null);
            this.i = new dyxd(this, this.h);
        }
        this.J.execute(new dywm(this));
        return null;
    }

    @Override // defpackage.dylv
    public final /* bridge */ /* synthetic */ dyls d(dyib dyibVar, dyhw dyhwVar, dyet dyetVar) {
        dbsk.t(dyibVar, "method");
        dbsk.t(dyhwVar, "headers");
        dyvi a2 = dyvi.a(dyetVar, this.o, dyhwVar);
        synchronized (this.j) {
            try {
                try {
                    return new dywk(dyibVar, dyhwVar, this.h, this, this.i, this.j, this.K, this.f, this.c, this.d, a2, this.D, dyetVar);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.dysm
    public final void e(dyjb dyjbVar) {
        synchronized (this.j) {
            if (this.p != null) {
                return;
            }
            this.p = dyjbVar;
            this.g.c(dyjbVar);
            u();
        }
    }

    @Override // defpackage.dysm
    public final void f(dyjb dyjbVar) {
        e(dyjbVar);
        synchronized (this.j) {
            Iterator<Map.Entry<Integer, dywk>> it = this.k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, dywk> next = it.next();
                it.remove();
                next.getValue().h.h(dyjbVar, false, new dyhw());
                o(next.getValue());
            }
            for (dywk dywkVar : this.v) {
                dywkVar.h.h(dyjbVar, true, new dyhw());
                o(dywkVar);
            }
            this.v.clear();
            u();
        }
    }

    public final boolean g() {
        boolean z = false;
        while (!this.v.isEmpty() && this.k.size() < this.u) {
            b(this.v.poll());
            z = true;
        }
        return z;
    }

    public final dywk[] i() {
        dywk[] dywkVarArr;
        synchronized (this.j) {
            dywkVarArr = (dywk[]) this.k.values().toArray(G);
        }
        return dywkVarArr;
    }

    public final void j(dyxw dyxwVar, String str) {
        m(0, dyxwVar, t(dyxwVar).h(str));
    }

    @Override // defpackage.dygs
    public final dygo k() {
        return this.H;
    }

    @Override // defpackage.dymc
    public final dyel l() {
        return this.o;
    }

    public final void m(int i, dyxw dyxwVar, dyjb dyjbVar) {
        synchronized (this.j) {
            if (this.p == null) {
                this.p = dyjbVar;
                this.g.c(dyjbVar);
            }
            if (dyxwVar != null && !this.L) {
                this.L = true;
                this.h.i(dyxwVar, new byte[0]);
            }
            Iterator<Map.Entry<Integer, dywk>> it = this.k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, dywk> next = it.next();
                if (next.getKey().intValue() > i) {
                    it.remove();
                    next.getValue().h.i(dyjbVar, dylt.REFUSED, false, new dyhw());
                    o(next.getValue());
                }
            }
            for (dywk dywkVar : this.v) {
                dywkVar.h.i(dyjbVar, dylt.REFUSED, true, new dyhw());
                o(dywkVar);
            }
            this.v.clear();
            u();
        }
    }

    public final void n(int i, @dzsi dyjb dyjbVar, dylt dyltVar, boolean z, @dzsi dyxw dyxwVar, @dzsi dyhw dyhwVar) {
        synchronized (this.j) {
            dywk remove = this.k.remove(Integer.valueOf(i));
            if (remove != null) {
                if (dyxwVar != null) {
                    this.h.d(i, dyxw.CANCEL);
                }
                if (dyjbVar != null) {
                    dywj dywjVar = remove.h;
                    if (dyhwVar == null) {
                        dyhwVar = new dyhw();
                    }
                    dywjVar.i(dyjbVar, dyltVar, z, dyhwVar);
                }
                if (!g()) {
                    u();
                    o(remove);
                }
            }
        }
    }

    public final void o(dywk dywkVar) {
        if (this.M && this.v.isEmpty() && this.k.isEmpty()) {
            this.M = false;
            dyqg dyqgVar = this.x;
            if (dyqgVar != null) {
                dyqgVar.d();
            }
        }
        if (dywkVar.t) {
            this.O.a(dywkVar, false);
        }
    }

    public final void p(dywk dywkVar) {
        if (!this.M) {
            this.M = true;
            dyqg dyqgVar = this.x;
            if (dyqgVar != null) {
                dyqgVar.c();
            }
        }
        if (dywkVar.t) {
            this.O.a(dywkVar, true);
        }
    }

    public final boolean r(int i) {
        boolean z;
        synchronized (this.j) {
            z = false;
            if (i < this.I && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    public final dywk s(int i) {
        dywk dywkVar;
        synchronized (this.j) {
            dywkVar = this.k.get(Integer.valueOf(i));
        }
        return dywkVar;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.g("logId", this.H.a);
        b.b("address", this.b);
        return b.toString();
    }

    public final Throwable q() {
        synchronized (this.j) {
            dyjb dyjbVar = this.p;
            if (dyjbVar == null) {
                return dyjb.m.g("Connection closed").l();
            }
            return dyjbVar.l();
        }
    }
}
