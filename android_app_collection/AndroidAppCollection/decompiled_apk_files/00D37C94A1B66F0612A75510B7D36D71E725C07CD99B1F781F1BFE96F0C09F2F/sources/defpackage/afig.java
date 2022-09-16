package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: afig  reason: default package */
/* loaded from: classes.dex */
public final class afig {
    public final amqo a;
    public final acvh b;
    public final acrr c;
    public final afvn d;
    public afhz e;
    public final afjz f;
    private final ankx g;
    private afhz h;
    private ankt i;
    private ankv j;

    public afig(amqo amqoVar, ankx ankxVar, afjz afjzVar, acvh acvhVar, acrr acrrVar, afvn afvnVar) {
        this.a = amqoVar;
        this.g = ankxVar;
        this.f = afjzVar;
        this.b = acvhVar;
        this.c = acrrVar;
        this.d = afvnVar;
    }

    private final synchronized void g(final amqo amqoVar) {
        ankt anktVar = this.i;
        if (anktVar == null || anktVar.isDone()) {
            ankt u = anlz.u(new Callable() { // from class: afif
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    afig afigVar = afig.this;
                    amqo amqoVar2 = amqoVar;
                    acvg c = afigVar.b.c(asny.LATENCY_ACTION_PROOF_OF_ORIGIN_TOKEN_CREATE);
                    byte[] bytes = ((String) amqoVar2.get()).getBytes("UTF-8");
                    aujo r = afigVar.f.r();
                    c.e();
                    afhz b = ((afia) afigVar.a.get()).b(bytes, r);
                    c.c("potpe");
                    return b;
                }
            }, this.g);
            this.i = u;
            ylx.k(u, anjk.a, new ylv() { // from class: afib
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    int i;
                    acrr acrrVar = afig.this.c;
                    int i2 = 1;
                    if (th instanceof TimeoutException) {
                        i = 3;
                    } else {
                        i = (!(th instanceof ExecutionException) || !(th.getCause() instanceof qsq)) ? 1 : 2;
                    }
                    if (awwc.bS(1) != 0) {
                        i2 = awwc.bS(1);
                    }
                    aopa createBuilder = aujp.a.createBuilder();
                    createBuilder.copyOnWrite();
                    aujp aujpVar = (aujp) createBuilder.instance;
                    aujpVar.d = i - 1;
                    aujpVar.b |= 4;
                    createBuilder.copyOnWrite();
                    aujp aujpVar2 = (aujp) createBuilder.instance;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    aujpVar2.c = i3;
                    aujpVar2.b = 2 | aujpVar2.b;
                    arrf a = arrh.a();
                    a.copyOnWrite();
                    ((arrh) a.instance).dx((aujp) createBuilder.mo39build());
                    acrrVar.c((arrh) a.mo39build());
                }
            }, new ylw() { // from class: afic
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    afig afigVar = afig.this;
                    afhz afhzVar = (afhz) obj;
                    synchronized (afigVar) {
                        afigVar.e = afhzVar;
                    }
                }
            });
            return;
        }
        afkj.a(afki.PO, "Token creation already in progress.");
    }

    public final synchronized afhz a() {
        if (this.f.r().c && !this.f.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_DO_NOT_ATTACH_PROOF_OF_ORIGIN_TOKENS_TO_SERVER_REQUESTS)) {
            return this.h;
        }
        return null;
    }

    public final synchronized afhz b() {
        if (this.f.r().b && !this.f.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_DO_NOT_ATTACH_PROOF_OF_ORIGIN_TOKENS_TO_SERVER_REQUESTS)) {
            return this.e;
        }
        return null;
    }

    public final synchronized void c() {
        this.h = null;
    }

    public final synchronized void d() {
        ankt anktVar = this.i;
        if (anktVar != null) {
            anktVar.cancel(true);
            this.i = null;
        }
        e();
    }

    public final void e() {
        final aujo r = this.f.r();
        if (r.b) {
            g(new amqo() { // from class: afid
                @Override // defpackage.amqo
                public final Object get() {
                    String g;
                    afig afigVar = afig.this;
                    int bT = awwc.bT(r.e);
                    if (bT == 0) {
                        bT = 1;
                    }
                    if (bT == 2) {
                        g = afigVar.d.g();
                        if (g == null) {
                            return "fake_session_content_binding";
                        }
                    } else if (bT != 3) {
                        return "fake_session_content_binding";
                    } else {
                        if (!afigVar.d.t() || afigVar.d.c() == null) {
                            g = afigVar.d.g();
                        } else {
                            g = afigVar.d.c().b();
                        }
                        if (g == null) {
                            return "fake_session_content_binding";
                        }
                    }
                    return g;
                }
            });
            int i = r.d;
            if (i <= 0) {
                return;
            }
            synchronized (this) {
                ankv ankvVar = this.j;
                if (ankvVar != null) {
                    ankvVar.cancel(true);
                }
                this.j = this.g.b(new Runnable() { // from class: afie
                    @Override // java.lang.Runnable
                    public final void run() {
                        afig.this.e();
                    }
                }, i, TimeUnit.SECONDS);
            }
        }
    }

    public final synchronized void f(afhz afhzVar) {
        this.h = afhzVar;
    }
}
