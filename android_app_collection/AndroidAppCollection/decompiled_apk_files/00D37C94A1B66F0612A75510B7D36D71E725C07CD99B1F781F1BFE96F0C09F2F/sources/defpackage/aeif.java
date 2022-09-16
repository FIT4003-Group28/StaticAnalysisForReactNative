package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: aeif  reason: default package */
/* loaded from: classes.dex */
public final class aeif extends aflh {
    public final amqo b;
    public asy c;
    public ati d;
    public final Map e;
    public aeub f;
    private final yrj g;
    private final PlayerConfigModel h;
    private final afjp i;
    private final snc j;
    private final ExecutorService k;
    private Exception l;
    private Uri m;
    private Future n;
    private final aeid o;
    private final boolean p;
    private final boolean q;
    private ampq r;
    private final afjz s;

    public aeif(amqo amqoVar, ati atiVar, yrj yrjVar, PlayerConfigModel playerConfigModel, afjz afjzVar, afjp afjpVar, snc sncVar, ExecutorService executorService, aeub aeubVar, boolean z, boolean z2) {
        super(atiVar);
        this.r = amon.a;
        this.b = amqoVar;
        this.g = yrjVar;
        this.h = playerConfigModel;
        this.s = afjzVar;
        this.i = afjpVar;
        this.j = sncVar;
        this.k = executorService;
        this.o = new aeid();
        this.f = aeubVar;
        this.e = DesugarCollections.synchronizedMap(new HashMap());
        this.p = z;
        this.q = z2;
    }

    private final long d(long j) {
        aeid aeidVar = this.o;
        if (aeidVar.b != 1) {
            return 0L;
        }
        int i = aeidVar.a(0).d;
        double d = this.s.n().n;
        if (d <= 0.0d) {
            d = 1.0d;
        }
        int i2 = this.s.n().k;
        double pow = Math.pow(d, i);
        afki afkiVar = afki.ABR;
        double d2 = i2;
        Double.isNaN(d2);
        return j + ((long) (d2 * pow));
    }

    private final void e(ate ateVar) {
        if (!this.g.o()) {
            return;
        }
        if (this.s.n().w && ateVar.getCause() != null && (ateVar.getCause() instanceof InterruptedIOException)) {
            return;
        }
        if ((ateVar instanceof afkb) && ((afkb) ateVar).e == 204) {
            return;
        }
        if ((ateVar instanceof afkc) && "x-segment-lmt".equals(((afkc) ateVar).e)) {
            return;
        }
        if (aeas.c(ateVar)) {
            aeid aeidVar = this.o;
            aeidVar.a(aeidVar.b).b++;
        } else {
            aeid aeidVar2 = this.o;
            aeidVar2.a(aeidVar2.b).a++;
        }
        if (this.o.b == 0) {
            this.l = ateVar;
        }
        afki afkiVar = afki.ABR;
    }

    final void c(long j) {
        aeid aeidVar = this.o;
        aeidVar.a(aeidVar.b).a();
        if (this.s.n().k > 0) {
            aeid aeidVar2 = this.o;
            if (aeidVar2.b != 1) {
                return;
            }
            if (this.n != null || aeidVar2.a(0).c == 0 || j <= this.o.a(0).c) {
                Future future = this.n;
                if (future == null || !future.isDone()) {
                    return;
                }
                try {
                    if (((Boolean) this.n.get()).booleanValue()) {
                        this.o.a(0).a();
                        this.o.a(0).c = 0L;
                    } else {
                        this.o.a(0).d++;
                        this.o.a(0).c = d(j);
                    }
                    this.n = null;
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    return;
                }
            }
            this.n = this.k.submit(new Callable() { // from class: aeie
                /* JADX WARN: Type inference failed for: r2v15, types: [ati, java.lang.Object] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str;
                    aeif aeifVar = aeif.this;
                    asy asyVar = aeifVar.c;
                    if (aeifVar.d == null) {
                        aeifVar.d = aeifVar.b.get();
                    }
                    aeifVar.d.l();
                    for (Map.Entry entry : aeifVar.e.entrySet()) {
                        aeifVar.d.m((String) entry.getKey(), (String) entry.getValue());
                    }
                    boolean z = false;
                    try {
                        try {
                            asy c = asyVar.c(0L, 4096L);
                            aeifVar.d.h(c);
                            byte[] bArr = new byte[4096];
                            int i = 0;
                            while (true) {
                                int g = aeifVar.d.g(bArr, i, ((int) c.h) - i);
                                if (g <= 0) {
                                    break;
                                }
                                i += g;
                            }
                            str = "none";
                            pxi.I(aeifVar.d);
                            z = true;
                        } catch (Exception e) {
                            if (aeas.c(e)) {
                                str = "timeout";
                            } else {
                                str = e instanceof IOException ? "io" : "unknown";
                            }
                            pxi.I(aeifVar.d);
                        }
                        aeifVar.f.e("fbprb", str.length() != 0 ? "err.".concat(str) : new String("err."));
                        return Boolean.valueOf(z);
                    } catch (Throwable th) {
                        pxi.I(aeifVar.d);
                        throw th;
                    }
                }
            });
        }
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        try {
            int g = super.g(bArr, i, i2);
            c(this.j.c());
            return g;
        } catch (ate e) {
            e(e);
            throw e;
        }
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.asv
    public final long h(asy asyVar) {
        boolean equals;
        ampq d;
        Uri uri;
        Exception exc;
        if (this.p && asyVar.a != null && !this.r.h()) {
            this.r = aeik.d(asyVar.a, this.s.m());
        }
        if (this.h.aY()) {
            equals = aeik.g(asyVar.a, this.m);
        } else {
            equals = asyVar.a.equals(this.m);
        }
        if (!equals) {
            if (this.q || (exc = this.l) == null || !aeas.c(exc)) {
                this.l = null;
                Arrays.fill(this.o.a, 0, 3, (Object) null);
            }
            this.m = asyVar.a;
        }
        this.c = asyVar;
        Uri uri2 = asyVar.a;
        if (this.p) {
            d = this.r;
        } else if (uri2 != null) {
            d = aeik.d(uri2, this.s.m());
        } else {
            d = amon.a;
        }
        try {
            if (d.h()) {
                aeic a = this.o.a(0);
                aeic a2 = this.o.a(1);
                if (this.s.A() && ((a.a >= this.s.n().j || a.b >= this.s.n().m) && a2.a + a2.b <= a.a + a.b)) {
                    Uri.Builder authority = asyVar.a.buildUpon().authority((String) d.c());
                    authority.appendQueryParameter("fallback_count", "1");
                    asyVar = asyVar.d(authority.build());
                    aeid aeidVar = this.o;
                    aeidVar.b = 1;
                    if (aeidVar.a(0).c == 0) {
                        this.o.a(0).c = d(this.j.c());
                    }
                    afki afkiVar = afki.ABR;
                    long h = super.h(asyVar);
                    this.i.D(super.k(), super.a());
                    c(this.j.c());
                    return h;
                }
            }
            if (!this.s.n().p || !aeik.h(uri)) {
                aeic a3 = this.o.a(0);
                aeic a4 = this.o.a(2);
                if (this.h.ah() && a3.a + a3.b > this.h.u() && a4.a + a4.b == 0) {
                    Uri uri3 = asyVar.a;
                    String authority2 = uri3.getAuthority();
                    Uri.Builder authority3 = uri3.buildUpon().authority("redirector.googlevideo.com");
                    afms.a(authority2);
                    if (authority2.endsWith("a1.googlevideo.com")) {
                        uri3 = authority3.appendQueryParameter("cmo", "pf=1").appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
                    } else if (authority2.endsWith("googlevideo.com")) {
                        uri3 = authority3.appendQueryParameter("cmo", "pf=1").build();
                    } else if (authority2.endsWith("c.youtube.com")) {
                        uri3 = authority3.appendQueryParameter("cmo", "td=c.youtube.com").build();
                    }
                    asyVar = asyVar.d(uri3);
                    this.o.b = 2;
                    afki afkiVar2 = afki.ABR;
                    long h2 = super.h(asyVar);
                    this.i.D(super.k(), super.a());
                    c(this.j.c());
                    return h2;
                }
            }
            afki afkiVar22 = afki.ABR;
            long h22 = super.h(asyVar);
            this.i.D(super.k(), super.a());
            c(this.j.c());
            return h22;
        } catch (ate e) {
            e(e);
            throw e;
        }
        uri = asyVar.a;
        this.o.b = 0;
    }

    @Override // defpackage.aflh, defpackage.ati
    public final void l() {
        super.l();
        this.e.clear();
    }

    @Override // defpackage.aflh, defpackage.ati
    public final void m(String str, String str2) {
        super.m(str, str2);
        this.e.put(str, str2);
    }
}
