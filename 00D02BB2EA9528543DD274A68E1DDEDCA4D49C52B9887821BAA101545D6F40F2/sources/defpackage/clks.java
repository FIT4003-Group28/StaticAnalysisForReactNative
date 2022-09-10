package defpackage;

import android.content.IntentFilter;
import java.net.URI;
import java.nio.channels.WritableByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: clks  reason: default package */
/* loaded from: classes5.dex */
public final class clks {
    public static final SimpleDateFormat b;
    public static final Object c;
    public final dcdn<String, cllf> d;
    public final Executor e;
    public final IdentityHashMap<dbsz<clkr>, Executor> f = new IdentityHashMap<>();
    public final Queue<clkq> g = new ArrayDeque();
    public final List<degp<cljx>> h = new ArrayList();
    public final Object i = new Object();
    public int j = 0;
    public int k = 0;
    public final clkv l;
    private final clja n;
    private static final dcep<String> m = dcep.C("http", "https");
    public static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(\\d+|\\*)");

    static {
        Object obj = new Object();
        c = obj;
        synchronized (obj) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            b = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
    }

    public clks(clkp clkpVar) {
        boolean z = false;
        dcdn<String, cllf> r = dcdn.r(clkpVar.a);
        dbsk.b(!r.isEmpty(), "Must have at least one UrlEngine");
        dbsk.b(clkpVar.b != null, "Must set a callback executor");
        dbsk.b(clkpVar.d != null, "Must set a logger");
        dbsk.b(clkpVar.c != null ? true : z, "Must set a connectivity handler");
        this.d = r;
        this.e = clkpVar.b;
        this.l = clkpVar.d;
        this.n = clkpVar.c;
    }

    public static long f(clli clliVar) {
        Date parse;
        List<String> list = clliVar.b().get("Last-Modified");
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        String str = list.get(0);
        try {
            synchronized (c) {
                parse = b.parse(str);
            }
            if (parse != null) {
                return TimeUnit.MILLISECONDS.toSeconds(parse.getTime());
            }
            String valueOf = String.valueOf(str);
            throw new cljt(valueOf.length() != 0 ? "Invalid Last-Modified header: ".concat(valueOf) : new String("Invalid Last-Modified header: "));
        } catch (ParseException e) {
            String valueOf2 = String.valueOf(str);
            throw new cljt(valueOf2.length() != 0 ? "Invalid Last-Modified header: ".concat(valueOf2) : new String("Invalid Last-Modified header: "), e);
        }
    }

    public static void g(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new cljt(String.format(str, objArr));
    }

    private final void h(final clkq clkqVar) {
        this.g.add(clkqVar);
        clkqVar.b().Pk(new Runnable(this, clkqVar) { // from class: clkl
            private final clks a;
            private final clkq b;

            {
                this.a = this;
                this.b = clkqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                clks clksVar = this.a;
                clkq clkqVar2 = this.b;
                synchronized (clksVar.i) {
                    if (clksVar.g.remove(clkqVar2)) {
                        clksVar.e();
                    }
                }
            }
        }, dege.a);
        e();
    }

    public final void b(clkq clkqVar) {
        synchronized (this.i) {
            h(clkqVar);
        }
        clkqVar.a().a();
        a();
    }

    public final defw<cljx> c(final cljw cljwVar) {
        defw<cljx> e;
        synchronized (this.i) {
            deho b2 = deho.b(clkj.a);
            e = defw.b(b2).e(new defq(this, cljwVar) { // from class: clkk
                private final clks a;
                private final cljw b;

                {
                    this.a = this;
                    this.b = cljwVar;
                }

                @Override // defpackage.defq
                public final defw a(defu defuVar, Object obj) {
                    dehn a2;
                    String format;
                    clks clksVar = this.a;
                    cljw cljwVar2 = this.b;
                    Void r9 = (Void) obj;
                    URI a3 = cljwVar2.a();
                    cllf cllfVar = clksVar.d.get(a3.getScheme());
                    dbsk.s(cllfVar);
                    final cllg a4 = cllfVar.a(a3.toString());
                    dcpd<Map.Entry<String, String>> it = cljwVar2.b().I().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, String> next = it.next();
                        a4.b(next.getKey(), next.getValue());
                    }
                    long a5 = cljwVar2.e().a();
                    if (a5 > 0) {
                        StringBuilder sb = new StringBuilder(27);
                        sb.append("bytes=");
                        sb.append(a5);
                        sb.append("-");
                        a4.b("Range", sb.toString());
                        clju b3 = cljwVar2.e().b();
                        String a6 = b3.a();
                        long b4 = b3.b();
                        if (!a6.isEmpty()) {
                            a4.b("If-Range", a6);
                        } else if (b4 > 0) {
                            synchronized (clks.c) {
                                format = clks.b.format(new Date(TimeUnit.SECONDS.toMillis(b4)));
                            }
                            a4.b("If-Range", format);
                        }
                    }
                    clkx d = cljwVar2.d();
                    if (d != null) {
                        a2 = deew.h(d.a(), new dbrn(a4) { // from class: clkm
                            private final cllg a;

                            {
                                this.a = a4;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj2) {
                                cllg cllgVar = this.a;
                                String str = (String) obj2;
                                Pattern pattern = clks.a;
                                if (str != null) {
                                    cllgVar.b("Authorization", str.length() != 0 ? "Bearer ".concat(str) : new String("Bearer "));
                                }
                                return cllgVar.a();
                            }
                        }, clksVar.e);
                    } else {
                        a2 = deha.a(a4.a());
                    }
                    return defw.b(a2).d(clkn.a, clksVar.e).e(new defq(clksVar, cljwVar2) { // from class: cljz
                        private final clks a;
                        private final cljw b;

                        {
                            this.a = clksVar;
                            this.b = cljwVar2;
                        }

                        @Override // defpackage.defq
                        public final defw a(defu defuVar2, Object obj2) {
                            clks clksVar2 = this.a;
                            cljw cljwVar3 = this.b;
                            dehn<clli> dehnVar = (dehn) obj2;
                            dbsk.s(dehnVar);
                            return clksVar2.d(cljwVar3, dehnVar);
                        }
                    }, clksVar.e);
                }
            }, this.e);
            h(new cliw(cljwVar, b2, e));
        }
        return e;
    }

    public final defw<cljx> d(final cljw cljwVar, dehn<clli> dehnVar) {
        defw e = defw.b(dehnVar).e(new defq(this, cljwVar) { // from class: clka
            private final clks a;
            private final cljw b;

            {
                this.a = this;
                this.b = cljwVar;
            }

            @Override // defpackage.defq
            public final defw a(defu defuVar, Object obj) {
                long parseLong;
                clks clksVar = this.a;
                cljw cljwVar2 = this.b;
                clli clliVar = (clli) obj;
                dbsk.s(clliVar);
                defuVar.a(clliVar, clksVar.e);
                cljs e2 = cljwVar2.e();
                if (cljwVar2.b().m("Range")) {
                    dbsk.s(clliVar);
                    if (clliVar.a() != 206) {
                        e2.c();
                    }
                }
                if (clliVar.a() != 206) {
                    parseLong = 0;
                } else {
                    List<String> list = clliVar.b().get("Content-Range");
                    clks.g(list != null && !list.isEmpty(), "Host returned 206/PARTIAL response code but didn't provide a 'Content-Range' response header", new Object[0]);
                    dbsk.s(list);
                    String str = list.get(0);
                    Matcher matcher = clks.a.matcher(str);
                    clks.g(matcher.matches() && matcher.groupCount() > 0, "Content-Range response header didn't match expected pattern. Was '%s', expected '%s'", str, clks.a.pattern());
                    String group = matcher.group(1);
                    dbsk.s(group);
                    parseLong = Long.parseLong(group);
                }
                List<String> list2 = clliVar.b().get("ETag");
                new clis((list2 == null || list2.isEmpty()) ? "" : list2.get(0), clks.f(clliVar));
                WritableByteChannel d = e2.d(parseLong);
                defuVar.a(d, clksVar.e);
                dbsk.s(clliVar);
                return defw.b(clliVar.c(d));
            }
        }, this.e);
        deft deftVar = clkb.a;
        Executor executor = this.e;
        defw d = e.g((degp) deee.h(e.c, clle.class, new defn(e, deftVar), executor)).d(new deft(cljwVar) { // from class: clkc
            private final cljw a;

            {
                this.a = cljwVar;
            }

            @Override // defpackage.deft
            public final Object a(defu defuVar, Object obj) {
                Long l = (Long) obj;
                dbsk.s(l);
                dbsk.s(l);
                return new cliv(l.longValue());
            }
        }, this.e);
        defq defqVar = new defq(this, cljwVar) { // from class: clkd
            private final clks a;
            private final cljw b;

            {
                this.a = this;
                this.b = cljwVar;
            }

            @Override // defpackage.defq
            public final defw a(defu defuVar, Object obj) {
                defw<cljx> c2;
                clks clksVar = this.a;
                cljw cljwVar2 = this.b;
                Exception exc = (Exception) obj;
                synchronized (clksVar.i) {
                    clle clleVar = null;
                    if (exc != null) {
                        clleVar = (clle) dcft.l(dbue.f(exc), dbst.d(clle.class), null);
                    }
                    if (clleVar != null && clleVar.a.d()) {
                        clksVar.j--;
                        c2 = clksVar.c(cljwVar2);
                    } else {
                        throw new cljt(exc);
                    }
                }
                clksVar.a();
                return c2;
            }
        };
        Executor executor2 = this.e;
        return d.g((degp) deee.h(d.c, Exception.class, new defo(d, defqVar), executor2));
    }

    public final void e() {
        final clix clixVar = new clix(this.j, this.g.size(), this.k);
        for (final Map.Entry<dbsz<clkr>, Executor> entry : this.f.entrySet()) {
            entry.getValue().execute(new Runnable(entry, clixVar) { // from class: clke
                private final Map.Entry a;
                private final clkr b;

                {
                    this.a = entry;
                    this.b = clixVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Map.Entry entry2 = this.a;
                    clkr clkrVar = this.b;
                    Pattern pattern = clks.a;
                    ((dbsz) entry2.getKey()).NU(clkrVar);
                }
            });
        }
    }

    public final void a() {
        final dehn<?> h;
        while (true) {
            synchronized (this.i) {
                if (this.j >= 3) {
                    return;
                }
                clkq poll = this.g.poll();
                if (poll == null) {
                    return;
                }
                final cljw a2 = poll.a();
                if (!m.contains(a2.a().getScheme())) {
                    h = dehk.a;
                } else {
                    clja cljaVar = this.n;
                    cljr c2 = a2.c();
                    if (((clip) cljaVar).a(c2)) {
                        h = dehk.a;
                    } else {
                        deho b2 = deho.b(clim.a);
                        final clio clioVar = new clio((clip) cljaVar, c2, b2);
                        ((clip) cljaVar).a.registerReceiver(clioVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        final clip clipVar = (clip) cljaVar;
                        b2.Pk(new Runnable(clipVar, clioVar) { // from class: clin
                            private final clip a;
                            private final clio b;

                            {
                                this.a = clipVar;
                                this.b = clioVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                clip clipVar2 = this.a;
                                clipVar2.a.unregisterReceiver(this.b);
                            }
                        }, dege.a);
                        long j = ((clip) cljaVar).c;
                        h = deha.h(b2, 10000L, TimeUnit.MILLISECONDS, ((clip) cljaVar).b);
                    }
                }
                if (h.isDone()) {
                    a2.a();
                    this.j++;
                    poll.c().c().Pk(new Runnable(this, a2) { // from class: clkg
                        private final clks a;
                        private final cljw b;

                        {
                            this.a = this;
                            this.b = a2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            clks clksVar = this.a;
                            cljw cljwVar = this.b;
                            synchronized (clksVar.i) {
                                clksVar.j--;
                                clksVar.e();
                            }
                            cljwVar.a();
                            clksVar.a();
                        }
                    }, this.e);
                    e();
                    poll.b().run();
                } else {
                    a2.a();
                    this.k++;
                    h.Pk(new Runnable(this) { // from class: clkh
                        private final clks a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            clks clksVar = this.a;
                            synchronized (clksVar.i) {
                                clksVar.k--;
                                clksVar.e();
                            }
                        }
                    }, dege.a);
                    e();
                    deha.q(h, new clko(this, poll), this.e);
                    poll.b().Pk(new Runnable(this, h) { // from class: clki
                        private final clks a;
                        private final dehn b;

                        {
                            this.a = this;
                            this.b = h;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            clks clksVar = this.a;
                            dehn dehnVar = this.b;
                            synchronized (clksVar.i) {
                                clksVar.e();
                                dehnVar.cancel(false);
                            }
                        }
                    }, dege.a);
                }
            }
        }
    }
}
