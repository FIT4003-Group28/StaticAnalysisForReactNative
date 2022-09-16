package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: brmt  reason: default package */
/* loaded from: classes4.dex */
public final class brmt implements crzp<brmi> {
    public final Activity a;
    public final akox b;
    public final brat c;
    public final Executor d;
    @dzsi
    public brch f;
    @dzsi
    public ixr g;
    @dzsi
    public amml h;
    private final btvo i;
    private final dehq j;
    @dzsi
    private dehn<?> l;
    private brmi k = brmi.NO_LABELS;
    public final crzo<amml> e = new crzo<>();

    public brmt(Activity activity, btvo btvoVar, akox akoxVar, brat bratVar, Executor executor, dehq dehqVar) {
        this.a = activity;
        this.i = btvoVar;
        this.b = akoxVar;
        this.c = bratVar;
        this.d = executor;
        this.j = dehqVar;
    }

    @dzsi
    private final amml h() {
        return this.e.a.l();
    }

    @Override // defpackage.crzp
    public final void On(crzm<brmi> crzmVar) {
        brmi brmiVar;
        if (crzmVar.l() != null) {
            brmiVar = crzmVar.l();
            dbsk.s(brmiVar);
        } else {
            brmiVar = brmi.NO_LABELS;
        }
        this.k = brmiVar;
        if (brmiVar == brmi.HAS_LABELS) {
            f();
        } else {
            g();
        }
    }

    public final void b(dfpo dfpoVar) {
        akrw f;
        dnbh dnbhVar;
        amml h = h();
        dcep<dpvf> dcepVar = this.c.c;
        dpvf b = dpvf.b(dfpoVar.d);
        if (b == null) {
            b = dpvf.UNKNOWN_CATEGORY;
        }
        if (!dcepVar.contains(b)) {
            if (dfpoVar.g.size() > 0) {
                f = akrw.h(dfpoVar);
            } else {
                f = akrw.f(dfpoVar);
            }
        } else {
            f = akrw.g(dfpoVar);
        }
        alyk q = alyl.q();
        alvg alvgVar = (alvg) q;
        alvgVar.a = dfpoVar;
        if (f.b == akry.SEARCH_RESULTS) {
            if (btpf.d(this.a.getResources().getConfiguration()).e) {
                dnbhVar = dnbh.CLIENT_MOBILE_TABLET;
            } else {
                dnbhVar = dnbh.CLIENT_MOBILE_PHONE;
            }
            alvgVar.e = dnbhVar;
            q.h(dcbg.b(this.i.getCategoricalSearchParameters().i().a).s(brmq.a).z());
        }
        alyl b2 = q.b();
        if (h == null || !h.f.equals(b2)) {
            this.e.a(this.b.N(this.a.getResources(), f, b2));
        }
    }

    public final void c() {
        e();
        this.g = null;
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if ((r4.a & 1) != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r7 = this;
            amml r0 = r7.h()
            if (r0 != 0) goto L7
            return
        L7:
            ixr r1 = r7.g
            r2 = 1
            if (r1 != 0) goto Ld
            goto L64
        Ld:
            r1.ag(r2)
            dehn<?> r1 = r7.l
            if (r1 == 0) goto L1a
            boolean r1 = r1.isDone()
            if (r1 == 0) goto L64
        L1a:
            dehq r1 = r7.j
            brmr r3 = new brmr
            r3.<init>(r7)
            brmi r4 = r7.k
            brmi r5 = defpackage.brmi.HAS_LABELS
            r6 = 2000(0x7d0, float:2.803E-42)
            if (r4 != r5) goto L2a
            goto L5b
        L2a:
            amml r4 = r7.h()
            if (r4 == 0) goto L4a
            alyl r5 = r4.f
            if (r5 == 0) goto L4a
            dfpo r5 = r5.a()
            if (r5 != 0) goto L3b
            goto L4a
        L3b:
            alyl r4 = r4.f
            dfpo r4 = r4.a()
            defpackage.dbsk.s(r4)
            int r4 = r4.a
            r4 = r4 & r2
            if (r4 == 0) goto L4a
            goto L5b
        L4a:
            brat r4 = r7.c
            int r4 = r4.c()
            r5 = 3
            if (r4 != r5) goto L5b
            btvo r4 = r7.i
            dksh r4 = r4.getOfflineMapsParameters()
            int r6 = r4.e
        L5b:
            long r4 = (long) r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            dehu r1 = r1.d(r3, r4, r6)
            r7.l = r1
        L64:
            akox r1 = r7.b
            java.lang.String r3 = "SEARCH_RESULTS_LAYER"
            r1.P(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brmt.d():void");
    }

    public final void e() {
        if (h() == null) {
            return;
        }
        this.b.Q("SEARCH_RESULTS_LAYER");
        f();
    }

    public final void f() {
        ixr ixrVar = this.g;
        if (ixrVar == null) {
            return;
        }
        ixrVar.ag(false);
        dehn<?> dehnVar = this.l;
        if (dehnVar == null || dehnVar.isDone()) {
            return;
        }
        this.l.cancel(true);
    }

    public final void g() {
        ixr ixrVar;
        if (this.f == null || (ixrVar = this.g) == null || ixrVar.QG().equals(izr.LOADING)) {
            return;
        }
        dbsk.s(this.f);
    }
}
