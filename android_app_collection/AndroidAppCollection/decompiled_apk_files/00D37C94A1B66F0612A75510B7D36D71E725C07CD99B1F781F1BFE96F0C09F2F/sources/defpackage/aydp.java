package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: aydp  reason: default package */
/* loaded from: classes2.dex */
public abstract class aydp extends aydu implements ayeo, ayka {
    public static final Logger q = Logger.getLogger(aydp.class.getName());
    private final ayha a;
    private ayat b;
    private volatile boolean c;

    /* JADX INFO: Access modifiers changed from: protected */
    public aydp(aymk aymkVar, ayat ayatVar, axyd axydVar) {
        ayhf.h(axydVar);
        this.a = new aykb(this, aymkVar);
        this.b = ayatVar;
    }

    @Override // defpackage.ayeo
    public final void b(ayhk ayhkVar) {
        ayhkVar.b("remote_addr", a().c(axzg.a));
    }

    @Override // defpackage.ayeo
    public final void c(Status status) {
        aqxo.q(!status.f(), "Should not cancel with OK status");
        this.c = true;
        aydi u = u();
        ayhi ayhiVar = u.a.p;
        ayaq ayaqVar = ayhi.m;
        synchronized (ayhiVar.r) {
            ayhi ayhiVar2 = u.a.p;
            if (ayhiVar2.u) {
                return;
            }
            ayhiVar2.u = true;
            ayhiVar2.w = status;
            for (aydh aydhVar : ayhiVar2.s) {
                aydhVar.a.clear();
            }
            ayhiVar2.s.clear();
            aydj aydjVar = u.a;
            BidirectionalStream bidirectionalStream = aydjVar.k;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                aydjVar.i.a(aydjVar, status);
            }
        }
    }

    @Override // defpackage.ayeo
    public final void e() {
        if (!t().k) {
            t().k = true;
            aykb aykbVar = (aykb) v();
            if (aykbVar.f) {
                return;
            }
            aykbVar.f = true;
            aydn aydnVar = aykbVar.j;
            if (aydnVar != null && aydnVar.a() == 0 && aykbVar.j != null) {
                aykbVar.j = null;
            }
            aykbVar.b(true, true);
        }
    }

    @Override // defpackage.ayeo
    public final void i(axyy axyyVar) {
        this.b.d(ayhf.a);
        this.b.f(ayhf.a, Long.valueOf(Math.max(0L, axyyVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.ayeo
    public final void j(axzb axzbVar) {
        aydt t = t();
        aqxo.z(t.i == null, "Already called start");
        axzbVar.getClass();
        t.j = axzbVar;
    }

    @Override // defpackage.ayeo
    public final void k(int i) {
        ((ayjx) t().a).b = i;
    }

    @Override // defpackage.ayeo
    public final void l(int i) {
        aykb aykbVar = (aykb) this.a;
        aqxo.z(aykbVar.a == -1, "max size already set");
        aykbVar.a = i;
    }

    @Override // defpackage.ayeo
    public final void m(ayeq ayeqVar) {
        aydt t = t();
        aqxo.z(t.i == null, "Already called setListener");
        t.i = ayeqVar;
        aydi u = u();
        u.a.j.run();
        aydj aydjVar = u.a;
        if (aydjVar.o != null) {
            aydg aydgVar = new aydg(aydjVar);
            aydj aydjVar2 = u.a;
            ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder = ((ExperimentalCronetEngine) aydjVar2.o.a).newBidirectionalStreamBuilder(aydjVar2.d, aydgVar, aydjVar2.g);
            if (u.a.l) {
                newBidirectionalStreamBuilder.mo548delayRequestHeadersUntilFirstFlush(true);
            }
            aydj aydjVar3 = u.a;
            Object obj = aydjVar3.m;
            if (obj != null || aydjVar3.n != null) {
                if (obj != null) {
                    aydj.q(newBidirectionalStreamBuilder, obj);
                }
                Collection<Object> collection = u.a.n;
                if (collection != null) {
                    for (Object obj2 : collection) {
                        aydj.q(newBidirectionalStreamBuilder, obj2);
                    }
                }
            }
            aydj aydjVar4 = u.a;
            newBidirectionalStreamBuilder.mo546addHeader(ayhf.h.a, aydjVar4.e);
            newBidirectionalStreamBuilder.mo546addHeader(ayhf.f.a, "application/grpc");
            newBidirectionalStreamBuilder.mo546addHeader("te", "trailers");
            byte[][] a = aymq.a(aydjVar4.h);
            for (int i = 0; i < a.length; i += 2) {
                String str = new String(a[i], Charset.forName("UTF-8"));
                if (!ayhf.f.a.equalsIgnoreCase(str) && !ayhf.h.a.equalsIgnoreCase(str) && !ayhf.g.a.equalsIgnoreCase(str)) {
                    newBidirectionalStreamBuilder.mo546addHeader(str, new String(a[i + 1], Charset.forName("UTF-8")));
                }
            }
            u.a.k = newBidirectionalStreamBuilder.mo547build();
            u.a.k.start();
        }
        this.b = null;
    }

    @Override // defpackage.aydu, defpackage.ayml
    public final boolean o() {
        return !((aykb) v()).f && p().c() && !this.c;
    }

    @Override // defpackage.aydu
    public /* bridge */ /* synthetic */ aydt p() {
        throw null;
    }

    protected abstract aydt t();

    protected abstract aydi u();

    @Override // defpackage.aydu
    protected final ayha v() {
        return this.a;
    }

    @Override // defpackage.ayka
    public final void w(aydn aydnVar, boolean z, boolean z2) {
        ByteBuffer byteBuffer;
        boolean z3 = true;
        if (aydnVar == null && !z) {
            z3 = false;
        }
        aqxo.q(z3, "null frame before EOS");
        aydi u = u();
        ayhi ayhiVar = u.a.p;
        ayaq ayaqVar = ayhi.m;
        synchronized (ayhiVar.r) {
            if (u.a.p.u) {
                return;
            }
            if (aydnVar != null) {
                byteBuffer = aydnVar.a;
                byteBuffer.flip();
            } else {
                byteBuffer = aydj.a;
            }
            aydj aydjVar = u.a;
            int remaining = byteBuffer.remaining();
            ayhi ayhiVar2 = aydjVar.p;
            synchronized (ayhiVar2.b) {
                ayhiVar2.e += remaining;
            }
            aydj aydjVar2 = u.a;
            ayhi ayhiVar3 = aydjVar2.p;
            if (!ayhiVar3.t) {
                ayhiVar3.s.add(new aydh(byteBuffer, z, z2));
            } else {
                aydjVar2.s(byteBuffer, z, z2);
            }
        }
    }
}
