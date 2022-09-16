package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: agrs  reason: default package */
/* loaded from: classes.dex */
public final class agrs implements ynl {
    static final long a = TimeUnit.MINUTES.toSeconds(15);
    static final long b = TimeUnit.HOURS.toSeconds(6);
    public static final /* synthetic */ int l = 0;
    public final azqb c;
    public final azqb d;
    public final snc e;
    public final azqb f;
    public final afvn g;
    public final ExecutorService h;
    public final yni i;
    public final axxr j;
    aypg k;
    private final azqb m;
    private final yjs n;

    public agrs(azqb azqbVar, azqb azqbVar2, snc sncVar, azqb azqbVar3, yjs yjsVar, afvn afvnVar, ExecutorService executorService, yni yniVar, azqb azqbVar4, axxr axxrVar) {
        this.c = azqbVar;
        this.d = azqbVar2;
        this.e = sncVar;
        this.f = azqbVar3;
        this.n = yjsVar;
        this.g = afvnVar;
        this.h = executorService;
        this.i = yniVar;
        this.m = azqbVar4;
        this.j = axxrVar;
    }

    private final long g(aahe aaheVar, long j) {
        aumo aumoVar;
        aahn aahnVar = (aahn) this.d.get();
        ArrayList arrayList = new ArrayList();
        aahp.c(agni.c, 5, Long.valueOf(j), aahnVar, arrayList);
        final aaho aahoVar = agni.c;
        aahnVar.c(aahoVar);
        arrayList.add(new aahk() { // from class: aahh
            @Override // defpackage.aahk
            public final void a(vou vouVar) {
                aaho aahoVar2 = aaho.this;
                vouVar.b(" ORDER BY ");
                aahoVar2.a(vouVar);
                vouVar.b(" ASC");
            }
        });
        arrayList.add(new aahk() { // from class: aahg
            @Override // defpackage.aahk
            public final void a(vou vouVar) {
                vouVar.b(" LIMIT ?");
                vouVar.c("1");
            }
        });
        amuk amukVar = (amuk) aaheVar.e(aahp.b(aahnVar, arrayList)).U();
        if (amukVar == null || amukVar.isEmpty() || (aumoVar = (aumo) aaheVar.f((String) amukVar.get(0)).g(aumo.class).W()) == null) {
            return 0L;
        }
        return aumoVar.getRefreshTime().longValue();
    }

    public final long a() {
        if (this.g.c().z()) {
            return 0L;
        }
        aahe a2 = ((aahf) this.c.get()).a(this.g.c());
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.e.c());
        long g = g(a2, seconds);
        if (g != 0) {
            return Math.max(g - seconds, a);
        }
        if (g(a2, 0L) <= 0) {
            return 0L;
        }
        return b;
    }

    public final void b() {
        if (this.g.c().z()) {
            return;
        }
        long j = ((awvb) ((agvn) this.m.get()).b.c()).e;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.e.c());
        long j2 = j - seconds;
        if (j2 > 0 && j2 < a) {
            return;
        }
        long a2 = a();
        if (a2 == 0) {
            return;
        }
        if (j != 0 && seconds <= j && seconds + a2 + a >= j) {
            return;
        }
        c(a2);
    }

    public final void c(long j) {
        if (j > 0) {
            this.n.e("offline_auto_refresh_wakeup", j, true, 1, null, null, false);
            ((agvn) this.m.get()).b.b(new fcp(TimeUnit.MILLISECONDS.toSeconds(this.e.c()) + j, 14));
        }
    }

    public final void d() {
        afvm c = this.g.c();
        if (!c.z() && !Objects.equals(null, c)) {
            e();
            this.k = ((aahf) this.c.get()).a(c).g(aumo.class).X(azpj.b(this.h)).at(new ayqb() { // from class: agrp
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    aajp aajpVar = (aajp) obj;
                    agrs.this.b();
                }
            }, aaga.h);
        }
    }

    public final void e() {
        aypg aypgVar = this.k;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.k = null;
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                d();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                e();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
