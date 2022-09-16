package defpackage;

import android.database.sqlite.SQLiteException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: agsj  reason: default package */
/* loaded from: classes.dex */
public final class agsj implements Runnable {
    public ankt a;
    private final ankw b;
    private final ScheduledExecutorService c;
    private final Map d;
    private final agsd e;
    private final agrz f;
    private final snc g;

    public agsj(ankw ankwVar, ScheduledExecutorService scheduledExecutorService, Map map, agsd agsdVar, agrz agrzVar, snc sncVar) {
        this.b = ankwVar;
        this.c = scheduledExecutorService;
        this.d = map;
        this.e = agsdVar;
        this.f = agrzVar;
        this.g = sncVar;
    }

    public static /* synthetic */ void a(Throwable th) {
        zep.d("Problem with orchestration worker", th);
        afus.c(2, 28, "Problem with orchestration worker", th);
    }

    private static amuk c(amuk amukVar) {
        amuf f = amuk.f();
        for (int i = 0; i < ((amxx) amukVar).c; i++) {
            f.h(agru.c);
        }
        return f.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(final defpackage.agsg r16, final defpackage.agrv r17, defpackage.agru r18, long r19, long r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsj.d(agsg, agrv, agru, long, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        ankt anktVar = this.a;
        if (anktVar == null || anktVar.isDone()) {
            ankt qo = this.b.qo(this);
            this.a = qo;
            ylx.j(qo, anjk.a, afsc.k);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        agru agruVar;
        amuk c;
        agru agruVar2;
        ampq i = ampq.i((agsg) this.e.h.get());
        if (!i.h()) {
            return;
        }
        agsg agsgVar = (agsg) i.c();
        for (agrv a = agsgVar.a(); a != null; a = agsgVar.a()) {
            agry agryVar = (agry) this.d.get(Integer.valueOf(a.b));
            if (agryVar != null) {
                amuk b = agsgVar.b(a, agryVar.a(a.c));
                amxx amxxVar = (amxx) b;
                if (amxxVar.c > 1) {
                    amzt listIterator = b.listIterator();
                    while (listIterator.hasNext()) {
                        agsgVar.k((agrv) listIterator.next(), 3);
                    }
                    long d = this.g.d();
                    try {
                        afvm afvmVar = agsgVar.a;
                        amuf f = amuk.f();
                        amzt listIterator2 = b.listIterator();
                        while (listIterator2.hasNext()) {
                            f.h(((agrv) listIterator2.next()).c);
                        }
                        c = (amuk) ((ankq) agryVar.c(afvmVar, f.g())).b;
                    } catch (SQLiteException | InterruptedException | ExecutionException unused) {
                        c = c(b);
                    } catch (RuntimeException e) {
                        zep.d("Problem with a controller", e);
                        c = c(b);
                    }
                    long d2 = this.g.d() - d;
                    long c2 = this.g.c();
                    if (amxxVar.c != c.size()) {
                        int i2 = ((agrv) b.get(0)).b;
                        StringBuilder sb = new StringBuilder(63);
                        sb.append("BatchedResult size does not match actions for type: ");
                        sb.append(i2);
                        zep.l(sb.toString());
                    }
                    amzt listIterator3 = b.listIterator();
                    Iterator it = c.iterator();
                    while (listIterator3.hasNext()) {
                        agrv agrvVar = (agrv) listIterator3.next();
                        if (it.hasNext()) {
                            agruVar2 = (agru) it.next();
                        } else {
                            agruVar2 = agru.b;
                        }
                        d(agsgVar, agrvVar, agruVar2, d2, c2);
                    }
                } else {
                    agsgVar.k(a, 3);
                    long d3 = this.g.d();
                    try {
                        agruVar = (agru) agryVar.b(agsgVar.a, a.c).get();
                    } catch (SQLiteException | InterruptedException | ExecutionException unused2) {
                        agruVar = agru.c;
                    } catch (RuntimeException e2) {
                        zep.d("Problem with a controller", e2);
                        agruVar = agru.c;
                    }
                    d(agsgVar, a, agruVar, this.g.d() - d3, this.g.c());
                }
            }
        }
    }
}
