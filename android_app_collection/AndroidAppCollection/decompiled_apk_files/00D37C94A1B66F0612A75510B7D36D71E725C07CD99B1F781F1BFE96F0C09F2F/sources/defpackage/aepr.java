package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.youtube.libraries.bandwidth.BandwidthSampleGenerator;
import com.youtube.libraries.bandwidth.CompletionEvent;
import com.youtube.libraries.bandwidth.RequestType;
import com.youtube.libraries.bandwidth.ResponseEvent;
import com.youtube.libraries.bandwidth.TransferEvent;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aepr  reason: default package */
/* loaded from: classes.dex */
public final class aepr implements aepl {
    public final aepv a;
    public apmv b;
    public volatile ByteBuffer c;
    public PlayerConfigModel f;
    private final aadd h;
    private final aeqt i;
    private final ScheduledExecutorService j;
    private final axnm k;
    private final axnm l;
    private final axnm m;
    private volatile long p;
    private long s;
    private long t;
    private int u;
    private volatile boolean q = true;
    public volatile boolean d = true;
    private final AtomicReference r = new AtomicReference(aepy.u);
    public final AtomicReference e = new AtomicReference(aepy.u);
    private int v = 0;
    private volatile long o = -1;
    private final awv g = new awv();
    private final azpm n = azpm.aI(ByteBuffer.allocateDirect(0));

    public aepr(PlayerConfigModel playerConfigModel, aepv aepvVar, aeqt aeqtVar, aadd aaddVar, ScheduledExecutorService scheduledExecutorService, axnm axnmVar, axnm axnmVar2, axnm axnmVar3) {
        this.f = playerConfigModel;
        this.h = aaddVar;
        this.a = aepvVar;
        this.i = aeqtVar;
        this.j = scheduledExecutorService;
        this.k = axnmVar;
        this.l = axnmVar2;
        this.m = axnmVar3;
    }

    private final Class q() {
        int be = this.f.be(2) - 1;
        return be != 2 ? be != 3 ? be != 4 ? be != 5 ? aeps.class : aeqh.class : aepn.class : aepw.class : aeqa.class;
    }

    private final void r(PlayerConfigModel playerConfigModel) {
        aeps aepsVar = new aeps(playerConfigModel.bd(), playerConfigModel.bc());
        aepv aepvVar = this.a;
        if (aepvVar != null) {
            j(aepvVar.a(), aepsVar, false);
        }
        this.r.set(aepsVar);
    }

    private final void s(int i, long j, long j2) {
        this.g.b(i, j, j2);
    }

    private final void t(aepy aepyVar, boolean z) {
        float b = aepyVar.b();
        long j = -1;
        if (z) {
            if (!Float.isNaN(b)) {
                j = b;
            }
            this.p = j;
            return;
        }
        if (aepyVar.i() && b == -1.0f) {
            r(this.f);
        }
        if (!Float.isNaN(b)) {
            j = b;
        }
        this.o = j;
    }

    @Override // defpackage.atk
    public final synchronized void a(asv asvVar, asy asyVar, boolean z, int i) {
        BandwidthSampleGenerator a;
        String queryParameter;
        long j = i;
        this.s += j;
        aepy aepyVar = (aepy) this.r.get();
        String queryParameter2 = asyVar.a.getQueryParameter("cpn");
        if (!aepyVar.i() || queryParameter2 == null || (a = ((aeqh) aepyVar).a(queryParameter2)) == null) {
            return;
        }
        try {
            if (asyVar.a.getQueryParameter("rn") == null) {
                u(14);
            } else {
                a.onTransfer(new TransferEvent(Integer.parseInt(queryParameter), ((float) SystemClock.elapsedRealtime()) / 1000.0f, j));
            }
        } catch (NumberFormatException unused) {
            u(14);
        }
    }

    @Override // defpackage.atk
    public final synchronized void b(asv asvVar, asy asyVar, boolean z) {
        BandwidthSampleGenerator a;
        String queryParameter;
        ptx.e(this.u > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.t);
        aepy aepyVar = (aepy) this.r.get();
        String queryParameter2 = asyVar.a.getQueryParameter("cpn");
        if (aepyVar.i() && queryParameter2 != null && (a = ((aeqh) aepyVar).a(queryParameter2)) != null) {
            try {
                if (asyVar.a.getQueryParameter("rn") == null) {
                    u(14);
                    return;
                }
                a.onCompletion(new CompletionEvent(Integer.parseInt(queryParameter), ((float) elapsedRealtime) / 1000.0f));
            } catch (NumberFormatException unused) {
                u(14);
            }
        }
        if (i > 0) {
            long j = this.s;
            if (j >= this.v) {
                long j2 = (j * 8000) / i;
                aepy aepyVar2 = (aepy) this.e.get();
                if (!aepyVar.i()) {
                    aepyVar.f((float) j2);
                }
                t(aepyVar, false);
                aepyVar2.f((float) j2);
                t(aepyVar2, true);
                s(i, this.s, this.o);
                aepv aepvVar = this.a;
                if (aepvVar != null) {
                    aepvVar.b(this.s, j2);
                }
            }
        }
        int i2 = this.u - 1;
        this.u = i2;
        if (i2 > 0) {
            this.t = elapsedRealtime;
        }
        this.s = 0L;
    }

    @Override // defpackage.atk
    public final void c(asv asvVar, asy asyVar, boolean z) {
    }

    @Override // defpackage.atk
    public final synchronized void d(asv asvVar, asy asyVar, boolean z) {
        RequestType requestType;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.u;
        if (i == 0) {
            this.t = elapsedRealtime;
            i = 0;
        }
        this.u = i + 1;
        String queryParameter = asyVar.a.getQueryParameter("cpn");
        aepy aepyVar = (aepy) this.r.get();
        if (!aepyVar.i() || queryParameter == null) {
            return;
        }
        BandwidthSampleGenerator a = ((aeqh) aepyVar).a(queryParameter);
        Object obj = asyVar.k;
        Long l = null;
        if (true != (obj instanceof aejz)) {
            obj = null;
        }
        Long l2 = obj != null ? ((aejz) obj).b : null;
        long j = 0;
        long longValue = l2 != null ? l2.longValue() : 0L;
        if (obj != null) {
            l = ((aejz) obj).c;
        }
        if (l != null) {
            j = l.longValue();
        }
        if (a != null) {
            String queryParameter2 = asyVar.a.getQueryParameter("mime");
            String path = asyVar.a.getPath();
            String queryParameter3 = asyVar.a.getQueryParameter("rn");
            if (path != null && queryParameter3 != null && (path.startsWith("/initplayback") || queryParameter2 != null)) {
                if (path.startsWith("/initplayback")) {
                    requestType = RequestType.ONESIE;
                } else if (queryParameter2 == null || !queryParameter2.contains("audio")) {
                    requestType = RequestType.VIDEO;
                } else {
                    requestType = RequestType.AUDIO;
                }
                RequestType requestType2 = requestType;
                try {
                    int parseInt = Integer.parseInt(queryParameter3);
                    long j2 = asyVar.h;
                    if (j2 == -1) {
                        j2 = ((((float) j) / 8.0f) * ((float) longValue)) / 1000.0f;
                    }
                    a.onResponse(new ResponseEvent(parseInt, ((float) elapsedRealtime) / 1000.0f, requestType2, j2, ((float) longValue) / 1000.0f));
                    return;
                } catch (NumberFormatException unused) {
                    u(14);
                    return;
                }
            }
            u(14);
            return;
        }
        r(this.f);
    }

    @Override // defpackage.awx
    public final long e() {
        return this.o;
    }

    @Override // defpackage.awx
    public final void f(Handler handler, aww awwVar) {
        this.g.a(handler, awwVar);
    }

    @Override // defpackage.awx
    public final void g(aww awwVar) {
        this.g.c(awwVar);
    }

    @Override // defpackage.aepl
    public final long h() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final aepy i(boolean z, PlayerConfigModel playerConfigModel) {
        int be = playerConfigModel.be(2) - 1;
        if (be == 2) {
            return new aeqa(playerConfigModel.bd(), playerConfigModel.bc());
        }
        if (be != 3) {
            if (be == 4) {
                return new aepn(playerConfigModel.bd(), playerConfigModel.bc());
            }
            if (be == 5) {
                apmv apmvVar = this.b;
                if (playerConfigModel.i && apmvVar != null) {
                    ByteBuffer byteBuffer = this.c;
                    if ((apmvVar.b & 16) != 0 && byteBuffer != null && byteBuffer.capacity() != 0) {
                        apmw apmwVar = apmvVar.e;
                        if (apmwVar == null) {
                            apmwVar = apmw.a;
                        }
                        if ((apmwVar.b & 1) != 0) {
                            apmw apmwVar2 = apmvVar.e;
                            if (apmwVar2 == null) {
                                apmwVar2 = apmw.a;
                            }
                            aeqh aeqhVar = new aeqh(this.h, (afhj) this.l.get(), (acrr) this.k.get(), byteBuffer, apmwVar2.c, this.i);
                            if (aeqhVar.c()) {
                                return aeqhVar;
                            }
                        }
                    }
                    u(11);
                }
            }
            return new aeps(playerConfigModel.bd(), playerConfigModel.bc());
        }
        aepw k = aepw.k(this.h, z);
        if (k != null) {
            return k;
        }
        return new aeps(playerConfigModel.bd(), playerConfigModel.bc());
    }

    public final void j(List list, aepy aepyVar, boolean z) {
        if (aepyVar.i()) {
            aepyVar.g();
            t(aepyVar, z);
        } else if (list.isEmpty()) {
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aepyVar.f((float) ((Long) it.next()).longValue());
            }
            t(aepyVar, z);
        }
    }

    @Override // defpackage.aepl
    public final synchronized void k() {
        aepy aepyVar = (aepy) this.r.get();
        if (aepyVar != null) {
            aepyVar.h();
        }
        ((aepy) this.e.get()).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(PlayerConfigModel playerConfigModel) {
        aepy aepyVar = (aepy) this.r.get();
        boolean z = q() == aeqh.class && !playerConfigModel.i;
        if (aepyVar == null || !q().isInstance(aepyVar) || z) {
            aepy i = i(false, playerConfigModel);
            aepv aepvVar = this.a;
            if (aepvVar != null) {
                j(aepvVar.a(), i, false);
            }
            this.r.set(i);
        }
    }

    @Override // defpackage.aepl
    public final synchronized void m(long j) {
        l(this.f);
        aepy aepyVar = (aepy) this.r.get();
        aepy aepyVar2 = (aepy) this.e.get();
        if (!aepyVar.i()) {
            aepyVar.f((float) j);
            t(aepyVar, false);
        } else {
            this.o = j;
        }
        aepyVar2.f((float) j);
        t(aepyVar2, true);
        aepv aepvVar = this.a;
        if (aepvVar != null) {
            aepvVar.b(1L, j);
        }
        s(0, 0L, this.o);
    }

    @Override // defpackage.aepl
    public final void n() {
        ayoi.m(this.h.a.V(aaku.f).B(), this.n, nti.n).X(azpj.b(this.j)).as(new ayqb() { // from class: aepp
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aepr aeprVar = aepr.this;
                aepq aepqVar = (aepq) obj;
                apmv apmvVar = aepqVar.a;
                ByteBuffer byteBuffer = aepqVar.b;
                aeprVar.d = true;
                apmv apmvVar2 = aeprVar.b;
                if (apmvVar2 == null || !apmvVar2.equals(apmvVar)) {
                    aeprVar.b = apmvVar;
                    aepy aepyVar = aepy.u;
                    if ((aeprVar.b.b & 2) != 0) {
                        aepyVar = aeprVar.i(true, aeprVar.f);
                        aepv aepvVar = aeprVar.a;
                        if (aepvVar != null) {
                            aeprVar.j(aepvVar.a(), aepyVar, true);
                        }
                    }
                    aeprVar.e.set(aepyVar);
                }
                if (aeprVar.f.be(1) != 6 || byteBuffer.capacity() == 0) {
                    return;
                }
                if (aeprVar.c != null && byteBuffer.equals(aeprVar.c)) {
                    return;
                }
                aeprVar.c = byteBuffer;
                aeprVar.l(aeprVar.f);
            }
        });
        if (this.f.be(1) == 6) {
            aeqf aeqfVar = (aeqf) this.m.get();
            atdy atdyVar = this.h.a().i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            apmv apmvVar = atdyVar.e;
            if (apmvVar == null) {
                apmvVar = apmv.a;
            }
            apmw apmwVar = apmvVar.e;
            if (apmwVar == null) {
                apmwVar = apmw.a;
            }
            aeqfVar.a(apmwVar.c, this.n);
        }
    }

    @Override // defpackage.aepl
    public final void o(PlayerConfigModel playerConfigModel) {
        this.f = playerConfigModel;
        this.v = playerConfigModel.l();
        PlayerConfigModel playerConfigModel2 = this.f;
        playerConfigModel2.i = true;
        l(playerConfigModel2);
        this.q = true;
    }

    @Override // defpackage.aepl
    public final int p() {
        return ((aepy) this.r.get()).j();
    }

    private final void u(int i) {
        if (i == 14) {
            if (!this.q) {
                return;
            }
            aeqh.d(14, (acrr) this.k.get());
            this.q = false;
        } else if (i != 11 || !this.d) {
        } else {
            aeqh.d(11, (acrr) this.k.get());
            this.d = false;
        }
    }
}
