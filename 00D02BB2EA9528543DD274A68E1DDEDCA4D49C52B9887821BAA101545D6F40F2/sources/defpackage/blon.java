package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: blon  reason: default package */
/* loaded from: classes3.dex */
public class blon implements bllb {
    public final bksv c;
    public final bllx d;
    public final bktk e;
    public final bllh f;
    public final blij g;
    public bwrs<ilo> h;
    private final blhs i;
    private final blld j;
    private final cqqw k;
    private final blkt l;
    private final boolean m;
    private final blom n = new blom(this);
    private final gga o;
    private boolean p;
    private final View.OnAttachStateChangeListener q;

    public blon(gga ggaVar, cqhn cqhnVar, cqhu cqhuVar, blht blhtVar, blly bllyVar, bktl bktlVar, blle blleVar, bksw bkswVar, blli blliVar, blki blkiVar, begg beggVar, blik blikVar, btvo btvoVar) {
        blhs a = blhtVar.a(false, cdjk.PLACESHEET_REVIEWS);
        this.i = a;
        this.d = bllyVar.a(cdjk.PLACESHEET_REVIEWS, dtxy.cR);
        bktl.a(a, 1);
        gga a2 = bktlVar.a.a();
        bktl.a(a2, 2);
        btvo a3 = bktlVar.b.a();
        bktl.a(a3, 3);
        cqhn a4 = bktlVar.c.a();
        bktl.a(a4, 4);
        cqhu a5 = bktlVar.d.a();
        bktl.a(a5, 5);
        dxio a6 = ((dxjh) bktlVar.e).a();
        bktl.a(a6, 6);
        jkf a7 = bktlVar.f.a();
        bktl.a(a7, 7);
        isd a8 = bktlVar.g.a();
        bktl.a(a8, 8);
        bktp a9 = bktlVar.h.a();
        bktl.a(a9, 9);
        bktk bktkVar = new bktk(a, a2, a3, a4, a5, a6, a7, a8, a9);
        this.e = bktkVar;
        bllh a10 = blliVar.a(a);
        this.f = a10;
        this.o = ggaVar;
        this.m = btvoVar.getUgcParameters().be();
        bktkVar.t(this, bllb.a);
        a10.o(this);
        blof blofVar = new blof(this);
        this.l = blofVar;
        this.j = blleVar.a();
        bkrx bkrxVar = new bkrx(this) { // from class: bloc
            private final blon a;

            {
                this.a = this;
            }

            @Override // defpackage.bkrx
            public final void a(djck djckVar, String str) {
                blon blonVar = this.a;
                if (djckVar == null) {
                    djckVar = djck.i;
                }
                blonVar.n(null, null, djckVar, str);
            }
        };
        blod blodVar = new blod(this);
        Activity activity = (Activity) ((dxjd) bkswVar.a).a;
        bksw.a(activity, 1);
        Resources a11 = bkswVar.b.a();
        bksw.a(a11, 2);
        btvo a12 = bkswVar.c.a();
        bksw.a(a12, 3);
        cqhn a13 = bkswVar.d.a();
        bksw.a(a13, 4);
        cqhu a14 = bkswVar.e.a();
        bksw.a(a14, 5);
        bktc a15 = bkswVar.f.a();
        bksw.a(a15, 6);
        bksi a16 = bkswVar.g.a();
        bksw.a(a16, 7);
        bksl a17 = bkswVar.h.a();
        bksw.a(a17, 8);
        bkpk a18 = bkswVar.i.a();
        bksw.a(a18, 9);
        bksw.a(bkrxVar, 10);
        bksv bksvVar = new bksv(activity, a11, a12, a13, a14, a15, a16, a17, a18, bkrxVar, blodVar, true, false);
        this.c = bksvVar;
        bksvVar.m(bktkVar);
        bloi bloiVar = new bloi(this, blikVar);
        this.g = bloiVar;
        bksvVar.n(new bloj(this, this));
        bkpj D = bksvVar.D();
        Activity activity2 = (Activity) ((dxjd) blkiVar.a).a;
        blki.a(activity2, 1);
        cpv a19 = blkiVar.b.a();
        blki.a(a19, 2);
        blki.a(D, 3);
        blki.a(bloiVar, 4);
        blkh blkhVar = new blkh(activity2, a19, D, bloiVar);
        this.q = blkhVar.f;
        this.k = new blju(dcep.D(blofVar, bksvVar.x(), blkhVar.i));
        bktkVar.u(new blol(this, this));
    }

    private final boolean u() {
        if (h().booleanValue()) {
            return false;
        }
        return this.e.x().booleanValue() || (this.i.g() && dcft.a(this.f.d()) == 0);
    }

    @Override // defpackage.bllb
    public blku a() {
        return this.j;
    }

    @Override // defpackage.bllb
    public Boolean b() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.bllb
    public bksa c() {
        return this.c;
    }

    @Override // defpackage.bllb
    public bkse d() {
        return this.e;
    }

    @Override // defpackage.bllb
    public bllc e() {
        return this.d;
    }

    @Override // defpackage.bllb
    public blkv f() {
        return this.f;
    }

    @Override // defpackage.bllb
    public cqqw g() {
        return this.k;
    }

    @Override // defpackage.bllb
    public Boolean h() {
        bksv bksvVar = this.c;
        boolean z = false;
        if (bksvVar != null && bksvVar.w().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bllb
    public Boolean i() {
        return Boolean.valueOf(this.i.e().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    @Override // defpackage.bllb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqtv j() {
        /*
            r7 = this;
            java.lang.Boolean r0 = r7.h()
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto Ld
        Lb:
            r2 = 0
            goto L45
        Ld:
            android.support.v7.widget.RecyclerView r0 = r7.p()
            if (r0 != 0) goto L14
            goto Lb
        L14:
            int r2 = r0.getHeight()
            bksv r3 = r7.c
            defpackage.dbsk.s(r3)
            int r3 = r3.z()
            int r2 = r2 + r3
            cqjg r3 = defpackage.bllb.b
            android.view.View r3 = defpackage.cqhu.a(r0, r3)
            r4 = 0
            r5 = 0
        L2a:
            int r6 = r0.getChildCount()
            if (r4 >= r6) goto L44
            android.view.View r6 = r0.getChildAt(r4)
            if (r6 == 0) goto L41
            if (r6 != r3) goto L39
            goto L41
        L39:
            int r6 = r6.getHeight()
            int r5 = r5 + r6
            if (r5 <= r2) goto L41
            goto Lb
        L41:
            int r4 = r4 + 1
            goto L2a
        L44:
            int r2 = r2 - r5
        L45:
            boolean r0 = r7.u()
            if (r0 != 0) goto L4c
            goto L7c
        L4c:
            android.support.v7.widget.RecyclerView r0 = r7.p()
            if (r0 != 0) goto L53
            goto L7c
        L53:
            int r0 = r0.getHeight()
            java.lang.Boolean r3 = r7.h()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6b
            bksv r3 = r7.c
            defpackage.dbsk.s(r3)
            int r3 = r3.v()
            goto L6c
        L6b:
            r3 = 0
        L6c:
            int r0 = r0 - r3
            bktk r3 = r7.e
            java.lang.Integer r3 = r3.w()
            int r3 = r3.intValue()
            int r0 = r0 - r3
            int r1 = java.lang.Math.max(r1, r0)
        L7c:
            int r0 = java.lang.Math.max(r2, r1)
            double r0 = (double) r0
            cqrp r0 = defpackage.cqrp.c(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blon.j():cqtv");
    }

    @Override // defpackage.bllb
    public View.OnAttachStateChangeListener k() {
        return this.q;
    }

    public void l(boolean z) {
        if (z || !this.e.x().booleanValue()) {
            return;
        }
        this.e.y();
    }

    public void m() {
        this.e.l(false);
        RecyclerView p = p();
        if (p == null) {
            return;
        }
        p.post(new Runnable(this) { // from class: bloe
            private final blon a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                blon blonVar = this.a;
                if (blonVar.h().booleanValue()) {
                    bksv bksvVar = blonVar.c;
                    dbsk.s(bksvVar);
                    bksvVar.B();
                }
            }
        });
    }

    public void n(@dzsi String str, @dzsi djuu djuuVar, @dzsi djck djckVar, @dzsi String str2) {
        if (!u()) {
            o();
        }
        blif blifVar = null;
        if (djuuVar == null && djckVar != null) {
            blif blifVar2 = blif.a;
            if (h().booleanValue()) {
                bksv bksvVar = this.c;
                dbsk.s(bksvVar);
                if (bksvVar.k().booleanValue()) {
                    djuuVar = djuu.QUALITY_SCORE;
                }
            }
            djuuVar = null;
        }
        if (djuuVar != null) {
            blif[] blifVarArr = blif.b;
            int length = blifVarArr.length;
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                }
                blif blifVar3 = blifVarArr[i];
                if (blifVar3.e().equals(djuuVar)) {
                    blifVar = blifVar3;
                    break;
                }
                i++;
            }
        }
        this.i.h(str, blifVar, djckVar, str2);
    }

    public void o() {
        RecyclerView p = p();
        if (p == null) {
            return;
        }
        if (!h().booleanValue()) {
            this.g.a(p, 0);
        } else if (this.e.x().booleanValue()) {
            blij blijVar = this.g;
            bksv bksvVar = this.c;
            dbsk.s(bksvVar);
            blijVar.a(p, bksvVar.z());
        } else {
            blij blijVar2 = this.g;
            bksv bksvVar2 = this.c;
            dbsk.s(bksvVar2);
            blijVar2.a(p, bksvVar2.y());
        }
    }

    @dzsi
    public final RecyclerView p() {
        for (View view : cqkx.n(this)) {
            RecyclerView recyclerView = (RecyclerView) cqhu.a(view, bllb.a);
            if (recyclerView != null) {
                return recyclerView;
            }
        }
        return null;
    }

    public void q(bwrs<ilo> bwrsVar) {
        this.h = bwrsVar;
        this.j.l(this.o, bwrsVar);
        bksv bksvVar = this.c;
        if (bksvVar != null) {
            bksvVar.t(bwrsVar);
        }
        this.d.t(bwrsVar);
        this.f.n(bwrsVar);
    }

    public void r(@dzsi Class<? extends bqld> cls) {
        this.d.I(cls);
    }

    public void s(btrm btrmVar) {
        this.d.m(btrmVar);
        this.f.l(btrmVar);
        if (!this.p) {
            blom blomVar = this.n;
            dceq a = dcet.a();
            a.b(bqje.class, new bloo(0, bqje.class, blomVar, bvrj.UI_THREAD));
            a.b(cdjh.class, new bloo(1, cdjh.class, blomVar, bvrj.UI_THREAD));
            btrmVar.g(blomVar, a.a());
            this.p = true;
        }
    }

    public void t(btrm btrmVar) {
        this.d.n(btrmVar);
        this.f.m(btrmVar);
        if (this.p) {
            btrmVar.a(this.n);
            this.p = false;
        }
    }
}
