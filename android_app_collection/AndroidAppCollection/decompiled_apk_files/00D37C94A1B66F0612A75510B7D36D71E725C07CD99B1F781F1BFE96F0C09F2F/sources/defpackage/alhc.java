package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alhc  reason: default package */
/* loaded from: classes.dex */
public final class alhc {
    static final Duration a = Duration.ofHours(10);
    public static final /* synthetic */ int g = 0;
    public final snc b;
    public final ScheduledExecutorService c;
    public final akzp d;
    public final akze e;
    public final albf f;
    private final aadd h;
    private final alfb i;

    public alhc(snc sncVar, ScheduledExecutorService scheduledExecutorService, aadd aaddVar, akzp akzpVar, akze akzeVar, albf albfVar, alfb alfbVar) {
        this.b = sncVar;
        this.c = scheduledExecutorService;
        this.h = aaddVar;
        this.d = akzpVar;
        this.e = akzeVar;
        this.f = albfVar;
        this.i = alfbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alhf a(Iterable iterable, algt algtVar) {
        String str = ((alhf) iterable.iterator().next()).a;
        algr algrVar = ((alhf) iterable.iterator().next()).c;
        return new alhf(str, this, algrVar, anii.i(anlz.w(iterable), new algv(this, str, algtVar, algrVar), anjk.a));
    }

    public final alhf b(Iterable iterable, String str, algt algtVar, algr algrVar) {
        if (arey.v(iterable, akxb.f)) {
            HashSet hashSet = new HashSet();
            ampq ampqVar = amon.a;
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                alhe alheVar = (alhe) it.next();
                if (!alheVar.b()) {
                    hashSet.addAll(alheVar.b);
                    ampq ampqVar2 = alheVar.c;
                    if (ampqVar2.h()) {
                        if (ampqVar.h()) {
                            Duration duration = (Duration) ampqVar.c();
                            Duration duration2 = (Duration) ampqVar2.c();
                            if (duration.compareTo(duration2) > 0) {
                                duration = duration2;
                            }
                            ampqVar = ampq.j(duration);
                        } else {
                            ampqVar = ampqVar2;
                        }
                    }
                }
            }
            alhd a2 = alhe.a(str);
            a2.c(amvn.p(hashSet));
            a2.b(ampqVar);
            alhe a3 = a2.a();
            String f = algtVar.f();
            String valueOf = String.valueOf(a3);
            f.length();
            String.valueOf(valueOf).length();
            return new alhf(str, this, algrVar, anlz.q(a3));
        }
        algtVar.f().concat(" unblocked");
        return c(str, algrVar, algtVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alhf c(final String str, final algr algrVar, final algt algtVar) {
        return new alhf(str, this, algrVar, amel.a(new amek() { // from class: algu
            @Override // defpackage.amek
            public final Object a(amej amejVar) {
                return alhc.this.d(str, algtVar, algrVar, new alhb(amejVar));
            }
        }, TimeUnit.HOURS, this.c));
    }

    public final String d(final String str, final algt algtVar, final algr algrVar, final alhb alhbVar) {
        this.c.execute(new Runnable() { // from class: algw
            @Override // java.lang.Runnable
            public final void run() {
                albu a2;
                ankt p;
                alhc alhcVar = alhc.this;
                alhb alhbVar2 = alhbVar;
                String str2 = str;
                algt algtVar2 = algtVar;
                algr algrVar2 = algrVar;
                if (alhbVar2.d()) {
                    return;
                }
                try {
                    alcw b = alhcVar.d.b(str2);
                    if (b == null) {
                        zep.c("UploadTaskController", "Cannot call executeOrUndoTask because job doesn't exist in database");
                        alhbVar2.a.c(new NullPointerException());
                        return;
                    }
                    alct b2 = algtVar2.b(b);
                    boolean z = b2 == null ? false : b.ac;
                    String f = algtVar2.f();
                    int i = 1;
                    String str3 = true != z ? " execute" : " undo";
                    String concat = str3.length() != 0 ? f.concat(str3) : new String(f);
                    if (b2 != null) {
                        if (!alht.k(b2)) {
                            int z2 = araa.z(b2.c);
                            if (z2 != 0 && z2 == 3 && b2.f > alhcVar.b.c()) {
                                String.valueOf(concat).concat(" skipped because RETRY is not ready yet");
                                alhcVar.e(str2, b2, algtVar2, algrVar2, alhbVar2, concat);
                                return;
                            }
                        } else {
                            String.valueOf(concat).concat(" skipped because State is already finished");
                            alhcVar.e(str2, b2, algtVar2, algrVar2, alhbVar2, concat);
                            return;
                        }
                    }
                    if (z) {
                        a2 = algtVar2.l();
                    } else {
                        a2 = algtVar2.a(b);
                    }
                    if (a2 != null && !b.ad) {
                        albv g2 = a2.g();
                        if (!g2.b) {
                            algtVar2.f().concat(" halted due to unmet requirements");
                            alhd a3 = alhe.a(str2);
                            a3.c(amvn.r(a2));
                            alhe a4 = a3.a();
                            albf albfVar = alhcVar.f;
                            String str4 = b.e;
                            avuo avuoVar = algtVar2.j;
                            int i2 = g2.c;
                            aopa createBuilder = avub.a.createBuilder();
                            avtw a5 = albfVar.a(str2);
                            createBuilder.copyOnWrite();
                            avub avubVar = (avub) createBuilder.instance;
                            a5.getClass();
                            avubVar.c = a5;
                            avubVar.b |= 1;
                            createBuilder.copyOnWrite();
                            avub avubVar2 = (avub) createBuilder.instance;
                            avubVar2.d = avuoVar.R;
                            avubVar2.b |= 2;
                            if (i2 == 1) {
                                i = 2;
                            } else if (i2 == 2) {
                                i = 3;
                            } else if (i2 == 3) {
                                i = 4;
                            } else if (i2 == 4) {
                                i = 7;
                            } else if (i2 == 5) {
                                i = 9;
                            }
                            createBuilder.copyOnWrite();
                            avub avubVar3 = (avub) createBuilder.instance;
                            avubVar3.e = i - 1;
                            avubVar3.b |= 8;
                            arrf a6 = arrh.a();
                            a6.copyOnWrite();
                            ((arrh) a6.instance).dU((avub) createBuilder.mo39build());
                            albfVar.b(str4, (arrh) a6.mo39build());
                            alhbVar2.a.b(a4);
                            return;
                        }
                    }
                    long c = alhcVar.b.c();
                    String.valueOf(concat).concat(" start");
                    if (z) {
                        p = algtVar2.d(str2, alhcVar.d);
                    } else {
                        albf albfVar2 = alhcVar.f;
                        String str5 = b.e;
                        avuo avuoVar2 = algtVar2.j;
                        aopa createBuilder2 = avuc.a.createBuilder();
                        avtw a7 = albfVar2.a(str2);
                        createBuilder2.copyOnWrite();
                        avuc avucVar = (avuc) createBuilder2.instance;
                        a7.getClass();
                        avucVar.c = a7;
                        avucVar.b |= 1;
                        createBuilder2.copyOnWrite();
                        avuc avucVar2 = (avuc) createBuilder2.instance;
                        avucVar2.d = avuoVar2.R;
                        avucVar2.b |= 2;
                        arrf a8 = arrh.a();
                        a8.copyOnWrite();
                        ((arrh) a8.instance).dV((avuc) createBuilder2.mo39build());
                        albfVar2.b(str5, (arrh) a8.mo39build());
                        p = algtVar2.p(str2, alhcVar.d);
                    }
                    alhbVar2.b(p);
                    anlz.A(p, new algz(alhcVar, str2, algtVar2, algrVar2, alhbVar2, c, z, concat, p), alhcVar.c);
                } catch (akzq e) {
                    zep.f("UploadTaskController", "Storage exception trying to read job before executing upload task", e);
                    alhbVar2.a.c(e);
                }
            }
        });
        String f = algtVar.f();
        return f.length() != 0 ? "Executing UploadTask ".concat(f) : new String("Executing UploadTask ");
    }

    public final void e(final String str, alct alctVar, final algt algtVar, final algr algrVar, final alhb alhbVar, String str2) {
        if (alctVar == null) {
            alhbVar.a.b(alhe.a(str).a());
            return;
        }
        int z = araa.z(alctVar.c);
        if (z == 0 || z != 3) {
            alhbVar.a.b(alhe.a(str).a());
            return;
        }
        Duration between = Duration.between(Instant.ofEpochMilli(this.b.c()), Instant.ofEpochMilli(alctVar.f));
        if (between.compareTo(Duration.ZERO) > 0) {
            avvf avvfVar = this.h.a().h;
            if (avvfVar == null) {
                avvfVar = avvf.a;
            }
            long j = avvfVar.s;
            if (j == 0) {
                j = a.toMillis();
            }
            if (between.toMillis() <= j) {
                between.getSeconds();
                String.valueOf(str2).length();
                alhbVar.c(this.c.schedule(new Callable() { // from class: algy
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return alhc.this.d(str, algtVar, algrVar, alhbVar);
                    }
                }, between.toMillis(), TimeUnit.MILLISECONDS));
                return;
            }
            between.getSeconds();
            String.valueOf(str2).length();
            alhd a2 = alhe.a(str);
            a2.b(ampq.j(between));
            alhbVar.a.b(a2.a());
            return;
        }
        this.c.execute(new Runnable() { // from class: algx
            @Override // java.lang.Runnable
            public final void run() {
                alhc.this.d(str, algtVar, algrVar, alhbVar);
            }
        });
    }

    public final void f(String str, akzs akzsVar, algt algtVar, algr algrVar, alhb alhbVar, long j, boolean z, String str2) {
        String str3;
        alct b;
        if (algrVar.a()) {
            try {
                alcw b2 = this.d.b(str);
                if (b2 != null && b2.s && !b2.t) {
                    String.valueOf(str2).concat(" interrupted completion.");
                    return;
                }
            } catch (akzq e) {
                this.e.b("Missing job while evaluating interruption, completing with exception.", e);
                zep.c("UploadTaskController", "Missing job while evaluating interruption, completing with exception.");
                alhbVar.a.c(e);
                return;
            }
        }
        try {
            albg a2 = this.d.a(str, akzsVar);
            this.i.a(a2);
            alcw alcwVar = a2.a;
            alcw alcwVar2 = a2.b;
            if (alcwVar != null) {
                str3 = alcwVar.e;
            } else {
                str3 = alcwVar2 != null ? alcwVar2.e : "";
            }
            if (alcwVar2 == null) {
                String.valueOf(str2).concat(" finished and job removed");
                b = null;
            } else {
                b = algtVar.b(alcwVar2);
                String valueOf = String.valueOf(b);
                String.valueOf(str2).length();
                String.valueOf(valueOf).length();
            }
            if (!z) {
                int i = 1;
                if (b == null) {
                    aopa createBuilder = alct.a.createBuilder();
                    createBuilder.copyOnWrite();
                    alct alctVar = (alct) createBuilder.instance;
                    alctVar.c = 1;
                    alctVar.b |= 1;
                    b = (alct) createBuilder.mo39build();
                }
                albf albfVar = this.f;
                avuo avuoVar = algtVar.j;
                int z2 = araa.z(b.c);
                if (z2 == 0) {
                    z2 = 1;
                }
                avun b3 = avun.b(b.d);
                if (b3 == null) {
                    b3 = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
                }
                aopa createBuilder2 = avty.a.createBuilder();
                avtw a3 = albfVar.a(str);
                createBuilder2.copyOnWrite();
                avty avtyVar = (avty) createBuilder2.instance;
                a3.getClass();
                avtyVar.c = a3;
                avtyVar.b |= 1;
                createBuilder2.copyOnWrite();
                avty avtyVar2 = (avty) createBuilder2.instance;
                avtyVar2.d = avuoVar.R;
                avtyVar2.b |= 2;
                int i2 = z2 - 1;
                if (i2 == 1) {
                    i = 2;
                } else if (i2 == 2) {
                    i = 3;
                } else if (i2 == 3) {
                    i = 4;
                }
                createBuilder2.copyOnWrite();
                avty avtyVar3 = (avty) createBuilder2.instance;
                avtyVar3.e = i - 1;
                avtyVar3.b |= 4;
                createBuilder2.copyOnWrite();
                avty avtyVar4 = (avty) createBuilder2.instance;
                avtyVar4.f = b3.aB;
                avtyVar4.b |= 8;
                arrf a4 = arrh.a();
                a4.copyOnWrite();
                ((arrh) a4.instance).dT((avty) createBuilder2.mo39build());
                albfVar.b(str3, (arrh) a4.mo39build());
                algtVar.r(this.b.c() - j, alcwVar2);
            }
            e(str, b, algtVar, algrVar, alhbVar, str2);
        } catch (akzq e2) {
            alhbVar.a.c(e2);
        }
    }
}
