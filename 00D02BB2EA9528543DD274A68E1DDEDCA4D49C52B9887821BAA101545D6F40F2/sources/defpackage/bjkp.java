package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjkp  reason: default package */
/* loaded from: classes.dex */
public class bjkp implements bjkk, begs {
    public final bjbu a;
    @dzsi
    public bjcg b;
    private final gga d;
    private final bjqf e;
    private final bjcj f;
    private final boolean g;
    @dzsi
    private bjlc h;
    @dzsi
    private CharSequence i;
    private bjqe j;
    private boolean l;
    bwrs<ilo> c = bwrs.a(null);
    private Runnable k = bjkl.a;

    public bjkp(gga ggaVar, cqhn cqhnVar, bjbu bjbuVar, bjqf bjqfVar, bjcj bjcjVar, boolean z) {
        this.d = ggaVar;
        this.a = bjbuVar;
        this.e = bjqfVar;
        this.f = bjcjVar;
        this.g = z;
    }

    private final void k() {
        this.b = null;
        this.h = null;
        this.i = null;
        l().c = null;
        this.c = bwrs.a(null);
        this.k = bjkn.a;
        this.l = false;
    }

    private final bjqe l() {
        if (this.j == null) {
            bjqf bjqfVar = this.e;
            bjko bjkoVar = new bjko(this);
            bveo a = bjqfVar.a.a();
            bjqf.a(a, 1);
            bjqf.a(bjkoVar, 2);
            this.j = new bjqe(a, bjkoVar);
        }
        return this.j;
    }

    @Override // defpackage.bjkk
    public String a() {
        ilo c = this.c.c();
        if (c == null) {
            return this.d.getString(R.string.PLACE_QA_SUMMARY_CARD_TITLE);
        }
        return this.d.getString(R.string.PLACE_QA_SUMMARY_CARD_TITLE_CONTENT_DESCRIPTION, new Object[]{c.n()});
    }

    @Override // defpackage.bjkk
    @dzsi
    public bjlc b() {
        return this.h;
    }

    @Override // defpackage.bjkk
    @dzsi
    public bjcg c() {
        if (g().booleanValue()) {
            return null;
        }
        return this.b;
    }

    @Override // defpackage.bjkk
    public cqkl d() {
        this.k.run();
        return cqkl.a;
    }

    @Override // defpackage.bjkk
    @dzsi
    public CharSequence e() {
        return this.i;
    }

    @Override // defpackage.bjkk
    public cqkl f() {
        bjcg bjcgVar = this.b;
        if (bjcgVar != null) {
            bjcgVar.b();
        }
        return cqkl.a;
    }

    @Override // defpackage.bjkk
    public Boolean g() {
        boolean z = false;
        if (!this.g && this.h != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bjkk
    public cjtd h() {
        ddho ddhoVar;
        ilo c = this.c.c();
        if (c == null) {
            return cjtd.b;
        }
        djai djaiVar = c.h().bd;
        if (djaiVar == null) {
            djaiVar = djai.g;
        }
        dqcu dqcuVar = djaiVar.f;
        if (dqcuVar == null) {
            dqcuVar = dqcu.c;
        }
        int a = dqct.a(dqcuVar.b);
        if (a == 0 || a == 2) {
            ddhoVar = dtxy.lk;
        } else {
            ddhoVar = this.g ? dtxo.bf : dtxl.aa;
        }
        cjta c2 = cjtd.c(c.bZ());
        c2.d = ddhoVar;
        return c2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.djai r8, boolean r9) {
        /*
            r7 = this;
            gga r0 = r7.d
            java.lang.Runnable r1 = r7.k
            boolean r2 = r7.g
            dsrj<djao> r3 = r8.b
            boolean r3 = r3.isEmpty()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L12
        L10:
            r3 = r5
            goto L32
        L12:
            dsrj<djao> r3 = r8.b
            java.lang.Object r3 = r3.get(r4)
            djao r3 = (defpackage.djao) r3
            djam r3 = r3.b
            if (r3 != 0) goto L20
            djam r3 = defpackage.djam.m
        L20:
            int r3 = r3.g
            int r3 = defpackage.djal.a(r3)
            if (r3 != 0) goto L29
            goto L10
        L29:
            r6 = 2
            if (r3 == r6) goto L2d
            goto L10
        L2d:
            bjld r3 = new bjld
            r3.<init>(r0, r1, r8, r2)
        L32:
            r7.h = r3
            int r0 = r8.c
            gga r1 = r7.d
            if (r0 <= 0) goto L3e
            r2 = 2131956473(0x7f1312f9, float:1.9549503E38)
            goto L41
        L3e:
            r2 = 2131956472(0x7f1312f8, float:1.95495E38)
        L41:
            java.lang.String r1 = r1.getString(r2)
            r7.j(r1)
            if (r0 <= 0) goto L64
            boolean r1 = r7.g
            if (r1 == 0) goto L52
            bjlc r1 = r7.h
            if (r1 != 0) goto L64
        L52:
            gga r1 = r7.d
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r4] = r0
            r0 = 2131956503(0x7f131317, float:1.9549564E38)
            java.lang.String r5 = r1.getString(r0, r2)
        L64:
            r7.i = r5
            if (r9 == 0) goto Lb6
            bwrs<ilo> r9 = r7.c
            java.io.Serializable r9 = r9.c()
            ilo r9 = (defpackage.ilo) r9
            defpackage.dbsk.s(r9)
            bwrs<ilo> r0 = r7.c
            ily r1 = r9.g()
            dvyw r9 = r9.h()
            r2 = 5
            java.lang.Object r2 = r9.cu(r2)
            dsqp r2 = (defpackage.dsqp) r2
            r2.bC(r9)
            dvya r2 = (defpackage.dvya) r2
            boolean r9 = r2.c
            if (r9 == 0) goto L92
            r2.bF()
            r2.c = r4
        L92:
            MessageType extends dsqw<MessageType, BuilderType> r9 = r2.b
            dvyw r9 = (defpackage.dvyw) r9
            dvyw r3 = defpackage.dvyw.bv
            r8.getClass()
            r9.bd = r8
            int r8 = r9.d
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r9.d = r8
            dsqw r8 = r2.bK()
            dvyw r8 = (defpackage.dvyw) r8
            r1.E(r8)
            ilo r8 = r1.d()
            r0.d(r8)
            defpackage.cqkx.p(r7)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjkp.i(djai, boolean):void");
    }

    public final void j(String str) {
        bjci bjciVar;
        if (this.c.c() != null) {
            bjcj bjcjVar = this.f;
            bwrs<ilo> bwrsVar = this.c;
            ddho ddhoVar = dtxy.lj;
            gga a = bjcjVar.a.a();
            bjcj.b(a, 1);
            bwqv a2 = bjcjVar.b.a();
            bjcj.b(a2, 2);
            bjhc a3 = bjcjVar.c.a();
            bjcj.b(a3, 3);
            cafi a4 = bjcjVar.d.a();
            bjcj.b(a4, 4);
            bjgb a5 = bjcjVar.e.a();
            bjcj.b(a5, 5);
            bjcj.b(bwrsVar, 6);
            bjcj.b(ddhoVar, 7);
            bjcj.b(str, 8);
            bjciVar = new bjci(a, a2, a3, a4, a5, bwrsVar, ddhoVar, str);
        } else {
            bjciVar = null;
        }
        this.b = bjciVar;
    }

    @Override // defpackage.begs
    public void m(btrm btrmVar) {
        bjqe l = l();
        if (l.b == null) {
            l.b = btrmVar;
            dceq a = dcet.a();
            a.b(bjfg.class, new bjqg(0, bjfg.class, l, bvrj.UI_THREAD));
            a.b(gds.class, new bjqg(1, gds.class, l, bvrj.UI_THREAD));
            a.b(ccih.class, new bjqg(2, ccih.class, l, bvrj.UI_THREAD));
            btrmVar.g(l, a.a());
        }
    }

    @Override // defpackage.begs
    public void n(btrm btrmVar) {
        bjqe l = l();
        if (l.b == btrmVar) {
            btrmVar.a(l);
            l.b = null;
        }
    }

    @Override // defpackage.bega
    public void t(final bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c != null && c.h && c.h().aO) {
            djai djaiVar = c.h().bd;
            if (djaiVar == null) {
                djaiVar = djai.g;
            }
            dqcu dqcuVar = djaiVar.f;
            if (dqcuVar == null) {
                dqcuVar = dqcu.c;
            }
            int a = dqct.a(dqcuVar.b);
            if ((a == 0 || a == 2) && this.g) {
                this.c = bwrsVar;
                this.l = true;
                l().c = c.ai().o();
                this.k = new Runnable(this, bwrsVar) { // from class: bjkm
                    private final bjkp a;
                    private final bwrs b;

                    {
                        this.a = this;
                        this.b = bwrsVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bjkp bjkpVar = this.a;
                        bjkpVar.a.a(this.b);
                    }
                };
                djai djaiVar2 = c.h().bd;
                if (djaiVar2 == null) {
                    djaiVar2 = djai.g;
                }
                i(djaiVar2, false);
                return;
            }
        }
        k();
    }

    @Override // defpackage.bega
    public void u() {
        k();
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = false;
        if (this.l && (this.g || !btpf.a(this.d) || !btpf.c(this.d).f)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
