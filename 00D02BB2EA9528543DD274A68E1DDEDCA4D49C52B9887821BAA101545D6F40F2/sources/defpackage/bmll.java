package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmll  reason: default package */
/* loaded from: classes3.dex */
public class bmll extends ibd implements bmlh {
    private static final dcqe h = dcqe.c("bmll");
    public final Activity g;
    private final hzz i;
    private final gn j;
    private final begg k;
    private final iqs l;
    private final bmdk m;
    private final jkf n;
    private final behy o;
    @dzsi
    private final bege p;
    private List<iao> q;
    private final bmlj r;
    private List<begd> s;
    private ilo t;
    private final Runnable u;

    public bmll(behy behyVar, @dzsi bege begeVar, gn gnVar, Runnable runnable, Activity activity, cqhn cqhnVar, cjqy cjqyVar, begg beggVar, iqs iqsVar, bmdk bmdkVar, jkf jkfVar, btvo btvoVar, bnam bnamVar, cebr cebrVar) {
        super(cqhnVar, cjqyVar);
        bmli bmliVar = new bmli(this);
        this.i = bmliVar;
        this.q = new ArrayList();
        this.s = new ArrayList();
        this.t = null;
        cqir.a();
        this.u = runnable;
        this.g = activity;
        this.j = gnVar;
        this.k = beggVar;
        this.l = iqsVar;
        this.m = bmdkVar;
        this.o = behyVar;
        this.p = begeVar;
        this.r = new bmlj(gnVar);
        this.n = jkfVar;
        this.d.add(bmliVar);
    }

    @dzsi
    private final begd q(int i) {
        if (i < 0 || i >= this.s.size()) {
            return null;
        }
        return this.s.get(i);
    }

    private final int r(@dzsi bege begeVar) {
        if (begeVar != null) {
            for (int i = 0; i < this.s.size(); i++) {
                if (this.s.get(i).aR().equals(begeVar)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @dzsi
    private final begd s() {
        return q(b().intValue());
    }

    private static final void t(begg beggVar, Runnable runnable, begd begdVar, boolean z) {
        beggVar.m(jjn.FULLY_EXPANDED);
        runnable.run();
        if (!z) {
            begdVar.aT();
        }
        if (begdVar instanceof begp) {
            ((begp) begdVar).aU();
        }
    }

    private final void u(bege begeVar, @dzsi begd begdVar) {
        int r = r(begeVar);
        if (r != -1) {
            if (begdVar != null) {
                begd begdVar2 = this.s.get(r);
                dbsk.a(begdVar2.getClass().equals(begdVar.getClass()));
                gz b = this.j.b();
                b.u(begdVar2.Ny());
                b.r();
                this.s.set(r, begdVar);
                this.r.s(this.s);
            }
            int intValue = b().intValue();
            NP(r);
            cqkx.p(this);
            t(this.k, this.u, this.s.get(r), intValue != r);
        }
    }

    @Override // defpackage.bmlh
    public boolean d(bege begeVar) {
        return r(begeVar) != -1;
    }

    @Override // defpackage.bmlh
    public boolean e() {
        return this.p == null ? b().intValue() == 0 : b().intValue() == r(this.p);
    }

    @Override // defpackage.bmlh
    @dzsi
    public bege f() {
        begd s = s();
        if (s != null) {
            return s.aR();
        }
        return null;
    }

    @Override // defpackage.bmlh
    @dzsi
    public begd g(bege begeVar) {
        return q(r(begeVar));
    }

    @Override // defpackage.bmlh
    public void h(bege begeVar, boolean z) {
        u(begeVar, null);
    }

    @Override // defpackage.bmlh
    public void i(bege begeVar, @dzsi begd begdVar) {
        u(begeVar, begdVar);
    }

    @Override // defpackage.bmlh
    public behy j() {
        return this.o;
    }

    @Override // defpackage.bmlh
    public gt k() {
        return this.r;
    }

    @Override // defpackage.bmlh
    public List<iao> l() {
        return this.q;
    }

    @Override // defpackage.bmlh
    public boolean m() {
        if (!p()) {
            return false;
        }
        begd s = s();
        if (s instanceof ges) {
            return ((ges) s).e();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i, int i2) {
        boolean z = true;
        if (i >= this.q.size() || i >= this.s.size()) {
            bvoo.h("Can't access index %d. Current buttons size %d, fragments size %d.", Integer.valueOf(i), Integer.valueOf(this.q.size()), Integer.valueOf(this.s.size()));
            return;
        }
        int r = r(this.p);
        if (r <= 0) {
            r = 0;
        }
        if (i2 == r && i2 != i) {
            this.n.l().L();
        }
        begg beggVar = this.k;
        Runnable runnable = this.u;
        begd begdVar = this.s.get(i);
        if (i2 == i) {
            z = false;
        }
        t(beggVar, runnable, begdVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(defpackage.bwrs<defpackage.ilo> r12) {
        /*
            r11 = this;
            gn r0 = r11.j
            java.util.List r0 = r0.q()
            ilo r1 = r11.t
            if (r1 != 0) goto L2d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2d
            gn r1 = r11.j
            gz r1 = r1.b()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            fd r2 = (defpackage.fd) r2
            r1.u(r2)
            goto L1a
        L2a:
            r1.r()
        L2d:
            java.io.Serializable r0 = defpackage.bwrs.b(r12)
            ilo r0 = (defpackage.ilo) r0
            defpackage.dbsk.s(r0)
            ilo r1 = r11.t
            if (r0 == r1) goto L4e
            java.util.ArrayList r1 = new java.util.ArrayList
            behy r2 = r11.o
            java.util.List r2 = r2.a()
            r1.<init>(r2)
            r11.s = r1
            iqs r1 = r11.l
            r1.e(r12)
            r11.t = r0
        L4e:
            bmlj r1 = r11.r
            java.util.List<begd> r2 = r11.s
            boolean r1 = r1.t(r2)
            if (r1 != 0) goto L59
            return
        L59:
            bege r1 = r11.p
            int r1 = r11.r(r1)
            r2 = 0
            if (r1 > 0) goto L65
            r11.NP(r2)
        L65:
            bmlj r3 = r11.r
            java.util.List<begd> r4 = r11.s
            r3.s(r4)
            java.util.List<begd> r3 = r11.s
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Lf1
            dccx r3 = defpackage.dcdc.F()
            cjtd r0 = r0.bZ()
            cjta r0 = defpackage.cjtd.c(r0)
        L80:
            java.util.List<begd> r4 = r11.s
            int r4 = r4.size()
            if (r2 >= r4) goto Le1
            java.util.List<begd> r4 = r11.s
            java.lang.Object r4 = r4.get(r2)
            begd r4 = (defpackage.begd) r4
            bege r9 = r4.aR()
            bmlk r10 = new bmlk
            bege r4 = defpackage.bege.OVERVIEW
            int r4 = r9.ordinal()
            r5 = 2
            if (r4 == r5) goto La7
            java.lang.Integer r4 = r9.k
            int r4 = r4.intValue()
        La5:
            r7 = r4
            goto Lbd
        La7:
            bmdk r4 = r11.m
            boolean r4 = r4.a(r12)
            if (r4 == 0) goto Lb6
            r4 = 2131957829(0x7f131845, float:1.9552253E38)
            r7 = 2131957829(0x7f131845, float:1.9552253E38)
            goto Lbd
        Lb6:
            java.lang.Integer r4 = r9.k
            int r4 = r4.intValue()
            goto La5
        Lbd:
            int r4 = r9.ordinal()
            if (r4 == r5) goto Lc7
            ddho r4 = r9.l
        Lc5:
            r8 = r4
            goto Ld5
        Lc7:
            bmdk r4 = r11.m
            boolean r4 = r4.a(r12)
            if (r4 == 0) goto Ld2
            ddho r4 = defpackage.dtxy.mp
            goto Lc5
        Ld2:
            ddho r4 = r9.l
            goto Lc5
        Ld5:
            r4 = r10
            r5 = r11
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r3.g(r10)
            int r2 = r2 + 1
            goto L80
        Le1:
            dcdc r12 = r3.f()
            r11.q = r12
            if (r1 <= 0) goto Lf1
            r11.NP(r1)
            java.lang.Runnable r12 = r11.u
            r12.run()
        Lf1:
            defpackage.cqkx.p(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmll.o(bwrs):void");
    }

    public boolean p() {
        return !this.s.isEmpty();
    }
}
