package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProviders;
/* compiled from: PG */
/* renamed from: ytu  reason: default package */
/* loaded from: classes4.dex */
final class ytu implements Runnable, ysv {
    public final yua a;
    public final yts b;
    public final ysq c;
    public final zex d;
    public final String e;
    private final Executor f;
    private final ytk g;
    private String i;
    private cer j;
    private long k;
    private yth m;
    private final yuc n;
    private final yrh o;
    private boolean l = false;
    private final yrs h = new yrs();

    public ytu(Executor executor, yua yuaVar, ytk ytkVar, yts ytsVar, ysq ysqVar, zex zexVar, String str) {
        this.f = executor;
        this.a = yuaVar;
        this.g = ytkVar;
        this.b = ytsVar;
        this.c = ysqVar;
        ysp yspVar = (ysp) ytkVar;
        this.n = (yuc) yspVar.q.get();
        this.o = yspVar.r;
        this.d = zexVar;
        this.e = str;
    }

    private final void e(cfb cfbVar) {
        Executor executor;
        this.d.a(this.e, this.a.m(), "Delivering response to caller.", cfbVar.c);
        this.c.a(this.a, cfbVar);
        if (cfbVar.c()) {
            yuc yucVar = this.n;
            Object obj = cfbVar.a;
            yucVar.c();
        } else {
            yuc yucVar2 = this.n;
            cff cffVar = cfbVar.c;
            yucVar2.a();
        }
        this.b.b(this.a, cfbVar);
        final yth ythVar = this.m;
        if (ythVar != null) {
            RequestFinishedInfo requestFinishedInfo = ythVar.f;
            if (requestFinishedInfo == null || (executor = ythVar.c) == null) {
                String str = requestFinishedInfo == null ? "requestFinishedInfo doesn't exist." : "requestFinishedListenerExecutor doesn't exist.";
                zex zexVar = ythVar.e;
                String str2 = ythVar.d;
                CronetException cronetException = null;
                String url = requestFinishedInfo == null ? null : requestFinishedInfo.getUrl();
                String format = String.format(Locale.US, "Response is delievered but requestFinishedListener is not notified. Reason: %s", str);
                RequestFinishedInfo requestFinishedInfo2 = ythVar.f;
                if (requestFinishedInfo2 != null) {
                    cronetException = requestFinishedInfo2.getException();
                }
                zexVar.a(str2, url, format, cronetException);
                return;
            }
            executor.execute(new Runnable() { // from class: ytf
                @Override // java.lang.Runnable
                public final void run() {
                    yth ythVar2 = yth.this;
                    ythVar2.b.a(yrt.a(ythVar2.f, ythVar2.d));
                }
            });
        }
    }

    public final void a() {
        ytx ytxVar;
        try {
            if (this.c.c()) {
                this.b.a(this.a);
                this.c.d();
                return;
            }
            String m = this.a.m();
            String a = ((zgr) ((ysp) this.g).c.get()).a(m).a(m);
            ytk ytkVar = this.g;
            if (!((ysp) ytkVar).v) {
                synchronized (ytkVar) {
                    if (!((ysp) ytkVar).v) {
                        ((ysp) ytkVar).y = ((ysp) ytkVar).j.a.c ? new zav() : null;
                        ((ysp) ytkVar).v = true;
                    }
                }
            }
            zav zavVar = ((ysp) ytkVar).y;
            if (zavVar != null) {
                zav.e(a);
            }
            HashMap hashMap = new HashMap();
            cer cerVar = this.j;
            if (cerVar != null) {
                String str = cerVar.b;
                if (str != null) {
                    hashMap.put("If-None-Match", str);
                }
                long j = this.j.d;
                if (j > 0) {
                    hashMap.put("If-Modified-Since", ytt.a.format(new Date(j)));
                }
            }
            ytz ytzVar = ytz.LOW;
            yua yuaVar = this.a;
            int i = yuaVar.j - 1;
            int i2 = 2;
            if (i == 1 || i == 2 || i == 7) {
                hashMap.put("Content-Type", yuaVar.kY());
            }
            hashMap.putAll(this.a.f());
            byte[] qA = this.a.qA();
            if (((ysp) this.g).f.j && this.a.kX().b() > 0) {
                ytk ytkVar2 = this.g;
                ytxVar = new ytm(((ysp) ytkVar2).g, ((ysp) ytkVar2).n, this.a.kX().b());
            } else {
                ytxVar = ytx.c;
            }
            ysw yswVar = new ysw(((ysp) this.g).e, zavVar, this.f, this.a, this.j, this, ytxVar, this.o, null);
            anjk anjkVar = anjk.a;
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) ((CronetEngine) ((ysp) this.g).a.get()).mo551newUrlRequestBuilder(a, yswVar, anjkVar);
            builder.mo564allowDirectExecutor();
            if (qA != null) {
                builder.mo569setUploadDataProvider(UploadDataProviders.create(qA), (Executor) anjkVar);
            }
            ((ysj) ((ysp) this.g).b.get()).b(builder, hashMap.entrySet());
            builder.mo567setHttpMethod(zav.f(this.a.j));
            int ordinal = this.a.i().ordinal();
            if (ordinal == 0) {
                i2 = 1;
            } else if (ordinal == 2) {
                i2 = 3;
            } else if (ordinal == 3) {
                i2 = 4;
            }
            builder.mo568setPriority(i2);
            builder.addRequestAnnotation(this.h);
            ytk ytkVar3 = this.g;
            yqm yqmVar = ((ysp) ytkVar3).h;
            if (yqmVar != null) {
                yth ythVar = new yth(this.h, yqmVar, ((ysp) ytkVar3).i, this.e, this.d);
                this.m = ythVar;
                yqm yqmVar2 = ythVar.b;
                Executor executor = ythVar.c;
                if (executor != null) {
                    builder.setRequestFinishedListener(new ytg(ythVar, ythVar.d, yqmVar2, executor));
                }
            } else {
                this.d.a(this.e, this.a.m(), "No RequestFinishedListener for this request.", null);
            }
            ExperimentalUrlRequest mo565build = builder.mo565build();
            yswVar.d.c();
            yswVar.f = yswVar.a.d();
            yswVar.c.g(new yst(yswVar, mo565build));
            yre yreVar = (yre) this.a.k(yre.class);
            if (yreVar != null) {
                yreVar.b();
            }
            mo565build.start();
            this.c.b(mo565build);
            this.n.b();
            this.d.a(this.e, a, "Dispatched to network.", null);
        } catch (ceq e) {
            if (d(e)) {
                this.d.a(this.e, this.a.m(), "A retryable auth error thrown when dispatching to network.", e);
                a();
                return;
            }
            this.d.a(this.e, this.a.m(), "An unretryable auth error thrown when dispatching to network.", e);
            c(null, e);
        } catch (yue e2) {
            this.d.a(this.e, this.a.m(), "The request is blocked when dispatching to network.", e2);
            c(null, new cff(e2));
        }
    }

    public final void b(Exception exc) {
        e(cfb.a(new cff(exc)));
    }

    public final boolean d(cff cffVar) {
        try {
            this.a.kX().c(cffVar);
            return true;
        } catch (cff unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.e, this.a.m(), "Begin executing a request task", null);
        if (this.c.c()) {
            this.d.a(this.e, this.a.m(), "Request canceled", null);
            this.b.a(this.a);
            this.c.d();
            return;
        }
        this.i = this.a.l();
        if (this.a.e) {
            ((ysp) this.g).k.f(this.i);
        }
        if (this.a.h) {
            this.j = ((ysp) this.g).k.a(this.i);
        }
        cer cerVar = this.j;
        if (cerVar != null && !cerVar.a()) {
            cer cerVar2 = this.j;
            c(new cew(cerVar2.a, cerVar2.g), null);
            if (!this.j.b()) {
                this.d.a(this.e, this.a.m(), "Cache reused.", null);
                return;
            }
        }
        try {
            if (this.g.w() != null) {
                this.l = true;
                afxz w = this.g.w();
                yua yuaVar = this.a;
                if (yuaVar instanceof afyl) {
                    ylx.i(w.a.c(), new afxx((afyl) yuaVar));
                } else {
                    ylx.i(w.a.d(), new afyv(yuaVar, 1));
                }
                this.k = w.b.d();
            }
            a();
        } catch (Exception e) {
            this.d.a(this.e, this.a.m(), "Unchecked expcetion thrown in run().", e);
            b(e);
        }
    }

    public final void c(final cew cewVar, cff cffVar) {
        cer cerVar;
        try {
            if (cffVar == null) {
                if (this.l && cewVar != null) {
                    final afxz w = this.g.w();
                    final yua yuaVar = this.a;
                    final Long valueOf = Long.valueOf(this.k);
                    if (yuaVar instanceof afyl) {
                        final afyl afylVar = (afyl) yuaVar;
                        final long d = w.b.d() - valueOf.longValue();
                        final ankt c = w.a.c();
                        final ankt e = w.a.e();
                        ylx.m(anlz.k(c, e).a(new Callable() { // from class: afxy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ankt anktVar = ankt.this;
                                afyl afylVar2 = afylVar;
                                long j = d;
                                cew cewVar2 = cewVar;
                                ankt anktVar2 = e;
                                if (((Boolean) anlz.y(anktVar)).booleanValue()) {
                                    zep.g(String.format(Locale.US, "Response for %s took %d ms and had status code %d", afylVar2.m(), Long.valueOf(j), Integer.valueOf(cewVar2.a)));
                                }
                                if (((Boolean) anlz.y(anktVar2)).booleanValue()) {
                                    zep.g("Logging response for YouTube API call.");
                                    for (String str : afylVar2.w(cewVar2)) {
                                        zep.g(str);
                                    }
                                    return null;
                                }
                                return null;
                            }
                        }, anjk.a), afsc.f);
                    } else {
                        ylx.i(w.a.d(), new ylw() { // from class: afxw
                            @Override // defpackage.ylw, defpackage.zdt
                            public final void a(Object obj) {
                                afxz afxzVar = afxz.this;
                                Long l = valueOf;
                                yua yuaVar2 = yuaVar;
                                cew cewVar2 = cewVar;
                                if (((Boolean) obj).booleanValue()) {
                                    zep.g(String.format(Locale.US, "Response for %s took %d ms and had status code %d", yuaVar2.m(), Long.valueOf(afxzVar.b.d() - l.longValue()), Integer.valueOf(cewVar2.a)));
                                }
                            }
                        });
                    }
                }
                cfb qy = this.a.qy(cewVar);
                if (this.a.h && (cerVar = qy.b) != null) {
                    ((ysp) this.g).k.d(this.i, cerVar);
                }
                this.h.a(this.a.g);
                e(qy);
                return;
            }
            cff d2 = this.a.d(cffVar);
            this.h.a(this.a.g);
            e(cfb.a(d2));
        } catch (Exception e2) {
            this.d.a(this.e, this.a.m(), "Unchecked exception thrown in returnToCaller().", e2);
            b(e2);
        }
    }
}
