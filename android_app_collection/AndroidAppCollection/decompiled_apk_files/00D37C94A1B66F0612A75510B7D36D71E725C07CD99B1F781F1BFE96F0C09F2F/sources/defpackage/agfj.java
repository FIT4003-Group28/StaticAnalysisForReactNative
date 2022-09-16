package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agfj  reason: default package */
/* loaded from: classes.dex */
public final class agfj implements agfu, ynl {
    public final Executor a;
    public final String b;
    public final agfh c;
    public final azqb d;
    public final aadd e;
    public int f;
    public final int g;
    int h;
    private final azqb i;
    private final yni j;
    private final askx k;
    private final int l;
    private final yjs m;
    private final agfe n;

    public agfj(azqb azqbVar, yjs yjsVar, yrj yrjVar, yni yniVar, Executor executor, aadd aaddVar, agff agffVar, azqb azqbVar2, agfh agfhVar, String str, String str2, int i, askx askxVar, int i2) {
        this.i = azqbVar;
        this.m = yjsVar;
        this.j = yniVar;
        this.a = executor;
        this.c = agfhVar;
        this.b = str2;
        this.g = i;
        this.k = askxVar;
        this.d = azqbVar2;
        this.e = aaddVar;
        zgh.m(str);
        if (yrjVar.o()) {
            this.h = 2;
        } else {
            this.h = 1;
        }
        snc sncVar = (snc) agffVar.a.get();
        sncVar.getClass();
        agbu agbuVar = (agbu) agffVar.b.get();
        agbuVar.getClass();
        this.n = new agfe(sncVar, agbuVar, agffVar.c, str2, this);
        this.l = i2;
    }

    private static String h(int i) {
        StringBuilder sb = new StringBuilder(40);
        sb.append("gcm_subscription_retry_topic_");
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        askx askxVar = this.k;
        if (askxVar != null) {
            return askxVar.c;
        }
        return 1;
    }

    public final void b() {
        rve d;
        if (this.f < a()) {
            int i = this.h;
            final int i2 = 2;
            if (i != 3 && i != 2) {
                return;
            }
            final agfe agfeVar = this.n;
            int i3 = this.g;
            if (!agfeVar.b.b()) {
                agfeVar.e.d("Waiting on FirebaseClient to initialize");
                return;
            }
            final long d2 = agfeVar.a.d();
            FirebaseMessaging firebaseMessaging = (FirebaseMessaging) agfeVar.c.get();
            if (i3 == 1) {
                i2 = i3;
                d = firebaseMessaging.f.d(new aobt(agfeVar.d, 1));
            } else {
                d = firebaseMessaging.f.d(new aobt(agfeVar.d));
            }
            d.q(new rut() { // from class: agfd
                @Override // defpackage.rut
                public final void a(rve rveVar) {
                    agfe agfeVar2 = agfe.this;
                    long j = d2;
                    int i4 = i2;
                    if (rveVar.k()) {
                        agfu agfuVar = agfeVar2.e;
                        long d3 = agfeVar2.a.d();
                        agfj agfjVar = (agfj) agfuVar;
                        agfjVar.f++;
                        String.format(Locale.US, "Attempting %s %s %d of %d SUCCESS took %s ms", aggw.l(agfjVar.g), agfjVar.b, Integer.valueOf(agfjVar.f), Integer.valueOf(agfjVar.a()), Long.valueOf(d3 - j));
                        if (agfjVar.g == 1) {
                            agcj.c(agfjVar.d, "SUBSCRIBED", true, agfjVar.e);
                        } else {
                            agcj.c(agfjVar.d, "UNSUBSCRIBED", true, agfjVar.e);
                        }
                        final agfo agfoVar = (agfo) agfjVar.c;
                        int i5 = agfoVar.h;
                        if (i5 == 1) {
                            agfoVar.h = 2;
                            for (agcc agccVar : new HashSet(agfoVar.c)) {
                                agccVar.b(agfoVar.a);
                            }
                            if (agfoVar.c.isEmpty()) {
                                agfoVar.f.e();
                                agfoVar.f = null;
                                agfoVar.b();
                                return;
                            }
                        } else if (i5 == 3) {
                            agfoVar.h = 4;
                            if (!agfoVar.c.isEmpty()) {
                                agfoVar.f.e();
                                agfoVar.f = null;
                                agfoVar.a();
                                return;
                            } else if (agfoVar.c.isEmpty()) {
                                agfoVar.d.execute(new Runnable() { // from class: agfl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        agfo agfoVar2 = agfo.this;
                                        agfn agfnVar = agfoVar2.e;
                                        String str = agfoVar2.b;
                                        ylr.c();
                                        agfs agfsVar = (agfs) agfnVar;
                                        agfsVar.b.remove(str);
                                        aggw.i(agfsVar);
                                    }
                                });
                            }
                        }
                        aggw.j(agfoVar, false);
                        agfj agfjVar2 = agfoVar.f;
                        if (agfjVar2 != null) {
                            agfjVar2.e();
                        }
                        agfoVar.f = null;
                        return;
                    }
                    agfeVar2.e.d(String.format(Locale.US, "FCM %s fail", aggw.l(i4)));
                }
            });
        }
    }

    public final void c() {
        this.h = 3;
        this.f = 0;
        b();
    }

    @Override // defpackage.agfu
    public final void d(String str) {
        double d;
        this.f++;
        String.format(Locale.US, "Attempting %s %s %d of %d FAIL %s", aggw.l(this.g), this.b, Integer.valueOf(this.f), Integer.valueOf(a()), str);
        if (this.g == 1) {
            agcj.c(this.d, "SUBSCRIBED", false, this.e);
        } else {
            agcj.c(this.d, "UNSUBSCRIBED", false, this.e);
        }
        zep.c("Exception while attempting to subscribe to GCM topic", str);
        if (this.f >= a()) {
            this.h = 4;
            agfo agfoVar = (agfo) this.c;
            agfoVar.f.e();
            agfoVar.f = null;
            return;
        }
        this.h = 3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        askx askxVar = this.k;
        int i = this.f;
        int i2 = askxVar.b;
        double pow = Math.pow(askxVar.e, i - 1);
        int i3 = askxVar.d;
        Double.isNaN(i2);
        this.m.e(h(this.l), (int) Math.max(1L, timeUnit.toSeconds(Math.min((int) (d * pow), i3))), true, 0, null, null, false);
    }

    public final void e() {
        this.j.m(this);
        ((agfi) ((yjm) this.i.get()).a(h(this.l))).a = null;
    }

    public final void g() {
        this.j.g(this);
        String h = h(this.l);
        agfi agfiVar = (agfi) ((yjm) this.i.get()).a(h);
        if (agfiVar == null) {
            ((yjm) this.i.get()).b(h, usw.n);
            agfiVar = (agfi) ((yjm) this.i.get()).a(h);
        }
        agfiVar.a = this;
        if (this.h == 2) {
            this.a.execute(new agfg(this));
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (((ypy) obj).a() && this.h == 1) {
                    this.h = 2;
                    this.a.execute(new agfg(this, 1));
                    return null;
                }
                this.h = 1;
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ypy.class};
    }
}
