package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: algq  reason: default package */
/* loaded from: classes.dex */
public final class algq {
    public final ScheduledExecutorService a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    final Map c = new HashMap();
    final Map d = new HashMap();
    final Map e = new HashMap();
    private final Context f;
    private final akzp g;
    private final akze h;
    private final alak i;
    private final albf j;
    private final alht k;
    private final alfb l;
    private final yjs m;

    public algq(Context context, akzp akzpVar, alak alakVar, albf albfVar, ScheduledExecutorService scheduledExecutorService, akze akzeVar, yjs yjsVar, alht alhtVar, alfb alfbVar) {
        this.f = context;
        this.g = akzpVar;
        this.a = scheduledExecutorService;
        this.h = akzeVar;
        this.i = alakVar;
        this.j = albfVar;
        this.m = yjsVar;
        this.k = alhtVar;
        this.l = alfbVar;
    }

    private static void l(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            algn algnVar = (algn) it.next();
            algnVar.b.d(algnVar);
            it.remove();
        }
    }

    private final void m(String str, int i) {
        avun avunVar;
        try {
            if (this.g.b(str) == null) {
                this.h.a("Unknown Upload job while updating UI for requirements.");
            } else if (i != 1 && i != 3) {
            } else {
                aopa createBuilder = alct.a.createBuilder();
                createBuilder.copyOnWrite();
                alct alctVar = (alct) createBuilder.instance;
                alctVar.c = 0;
                alctVar.b = 1 | alctVar.b;
                if (i == 3) {
                    avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_WIFI;
                } else {
                    avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_WAITING_FOR_NETWORK;
                }
                createBuilder.copyOnWrite();
                alct alctVar2 = (alct) createBuilder.instance;
                alctVar2.d = avunVar.aB;
                alctVar2.b |= 2;
                this.i.g(str, (alct) createBuilder.mo39build());
            }
        } catch (akzq e) {
            this.h.b("Can't update UI.", e);
        }
    }

    public final void a(algp algpVar) {
        this.b.addIfAbsent(algpVar);
    }

    public final synchronized void b(String str, boolean z) {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d.remove(str);
        if (scheduledFuture != null && z) {
            scheduledFuture.cancel(false);
        }
        List list = (List) this.e.remove(str);
        if (list != null) {
            l(list);
        }
    }

    final void c(String str, alfd alfdVar) {
        algj a;
        alcw b = this.g.b(str);
        if (b == null) {
            String valueOf = String.valueOf(str);
            throw new akzq(valueOf.length() != 0 ? "Job not found ".concat(valueOf) : new String("Job not found "));
        } else if (!this.c.containsKey(str)) {
            alcu a2 = alcu.a(b.l);
            if (a2 == null) {
                a2 = alcu.UNKNOWN_UPLOAD;
            }
            algb algbVar = alfdVar != null ? alfdVar.h : null;
            if (algbVar != null) {
                a = algbVar.a();
            } else {
                dxf iU = ((alga) zew.F(this.f, alga.class)).iU();
                iU.b(str);
                iU.c(a2);
                a = iU.a().a();
            }
            alhf a3 = a.a(b);
            anlz.A(a3, new algl(this, str), this.a);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((algp) it.next()).q(str, b);
            }
            this.l.a(new albg(null, b));
            this.c.put(str, new algo(a3));
        } else {
            String valueOf2 = String.valueOf(str);
            throw new IllegalStateException(valueOf2.length() != 0 ? "UploadFlow Future already exists for ".concat(valueOf2) : new String("UploadFlow Future already exists for "));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a1, code lost:
        if (r7 == false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(java.lang.String r22, defpackage.alhe r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.algq.d(java.lang.String, alhe):void");
    }

    public final synchronized boolean e(String str) {
        boolean z;
        if (!this.c.containsKey(str)) {
            c(str, null);
            z = true;
        }
        z = false;
        return z;
    }

    public final synchronized boolean f(String str) {
        return this.c.containsKey(str);
    }

    public final synchronized boolean g(String str) {
        boolean z;
        if (!this.d.containsKey(str)) {
            if (!this.e.containsKey(str)) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized int h(String str) {
        if (!this.c.containsKey(str)) {
            return 2;
        }
        algo algoVar = (algo) this.c.remove(str);
        if (algoVar == null) {
            return 3;
        }
        if (algoVar.b == 1) {
            this.a.execute(new algk(this, str));
        }
        return algoVar.b;
    }

    public final synchronized void i(String str) {
        akzr akzrVar = null;
        try {
            alcw b = this.g.b(str);
            if (b != null && b.ac) {
                akzrVar = b.ad ? new akzr(1) : new akzr();
            }
        } catch (akzq e) {
            zep.d("UploadFlowController", e);
        }
        if (akzrVar != null) {
            this.g.a(str, akzrVar);
            return;
        }
        b(str, true);
        algo algoVar = (algo) this.c.get(str);
        if (algoVar != null) {
            algoVar.b = 1;
            algoVar.a.cancel(true);
        }
        albg a = this.g.a(str, new akzl(this.k, this.j));
        if (algoVar == null) {
            this.a.execute(new algk(this, str, 1));
        }
        this.l.a(a);
    }

    public final synchronized void j(alfd alfdVar) {
        try {
            String str = alfdVar.b;
            if (this.c.containsKey(str)) {
                return;
            }
            c(str, alfdVar);
        } catch (Exception unused) {
        }
    }

    public final synchronized void k(String str, boolean z) {
        algo algoVar;
        if (f(str) || g(str)) {
            b(str, true);
            if (z) {
                algoVar = (algo) this.c.remove(str);
            } else {
                algoVar = (algo) this.c.get(str);
            }
            if (algoVar != null) {
                algoVar.b = 2;
                if (z) {
                    alhf alhfVar = algoVar.a;
                    algr algrVar = alhfVar.c;
                    synchronized (algrVar) {
                        algrVar.a = true;
                    }
                    alhfVar.b.cancel(true);
                    return;
                }
                algoVar.a.cancel(true);
            }
        }
    }
}
