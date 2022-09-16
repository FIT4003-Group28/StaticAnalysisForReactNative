package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crlm  reason: default package */
/* loaded from: classes5.dex */
public final class crlm {
    public final btrm a;
    public final cqat b;
    public long c;
    public final Set<Long> d;
    public final Set<Long> e;
    final crlh f;
    final crlh g;
    private final btvo h;
    private final dcdn<doyd, Integer> i;
    private final bvjj j;
    private int k;

    public crlm(btrm btrmVar, bvjj bvjjVar, btvo btvoVar, cqat cqatVar) {
        this.a = btrmVar;
        this.h = btvoVar;
        dcdg p = dcdn.p();
        for (dkwy dkwyVar : btvoVar.getUgcParameters().Q().c) {
            int i = dkwyVar.b;
            if (i >= 0 && i <= 100) {
                doyd b = doyd.b(dkwyVar.a);
                p.f(b == null ? doyd.INCIDENT_ROAD_CLOSED : b, Integer.valueOf(i));
            }
        }
        this.i = p.b();
        this.j = bvjjVar;
        this.b = cqatVar;
        this.k = 0;
        this.c = 0L;
        this.d = new dzru();
        this.e = new dzru();
        this.f = new crlh(crli.a, dcdn.s(dcbg.b(btvoVar.getUgcParameters().ai()).s(crlj.a)), Integer.valueOf(btvoVar.getUgcParameters().ah()));
        this.g = new crlh(crlk.a, dcdn.s(dcbg.b(btvoVar.getNavigationParameters().O().c).s(crll.a)), Integer.valueOf(btvoVar.getNavigationParameters().O().b));
    }

    private final dkwz d() {
        return this.h.getUgcParameters().Q();
    }

    public final boolean a(doyd doydVar, long j) {
        if ((!this.i.containsKey(doydVar) || (j / 1000) % 100 < this.i.get(doydVar).intValue()) && this.k < d().a) {
            long millis = j - TimeUnit.DAYS.toMillis(1L);
            Iterator<String> it = this.j.F(bvjk.iX, new ArrayList()).iterator();
            int i = 0;
            while (it.hasNext()) {
                if (Long.parseLong(it.next()) > millis) {
                    i++;
                }
            }
            return i >= d().b;
        }
        return true;
    }

    public final dveh b() {
        return this.h.getNavigationParameters().O();
    }

    public final void c(long j) {
        this.k++;
        List<String> F = this.j.F(bvjk.iX, new ArrayList());
        F.add(0, Long.toString(j));
        this.j.ah(bvjk.iX, F.subList(0, Math.min(F.size(), d().b)));
    }
}
