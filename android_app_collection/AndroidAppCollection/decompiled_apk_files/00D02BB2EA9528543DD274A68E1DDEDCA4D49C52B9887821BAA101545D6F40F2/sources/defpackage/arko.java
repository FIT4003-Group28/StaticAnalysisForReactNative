package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: arko  reason: default package */
/* loaded from: classes2.dex */
public final class arko implements arka {
    public final czz a;
    public final dbsg<czo> b;
    public final cjqq c;
    private final btvo d;
    private final arlc e;
    private final czt f;
    private final cze g;
    private final arku h;
    @dzsi
    private daf i;
    @dzsi
    private dai j;
    @dzsi
    private dfen k;
    @dzsi
    private czv l;
    @dzsi
    private czu m;
    @dzsi
    private dtk n;
    @dzsi
    private dtk o;
    @dzsi
    private arlb p;

    public arko(btvo btvoVar, arlc arlcVar, czt cztVar, czz czzVar, arku arkuVar, cze czeVar, dbsg<czo> dbsgVar, cjqq cjqqVar) {
        this.d = btvoVar;
        this.e = arlcVar;
        this.f = cztVar;
        this.a = czzVar;
        this.h = arkuVar;
        this.g = czeVar;
        this.b = dbsgVar;
        this.c = cjqqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
        if (r2.equals(r1) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(defpackage.dtk r5) {
        /*
            r4 = this;
            bvrj r0 = defpackage.bvrj.UI_THREAD
            r0.c()
            defpackage.dbsk.s(r5)
            czv r0 = r4.l
            if (r0 != 0) goto Ld
            return
        Ld:
            dtk r1 = r4.n
            r4.n = r5
            boolean r2 = r5.b
            if (r2 == 0) goto L23
            dsrj<dtj> r2 = r5.d
            int r2 = r2.size()
            if (r2 <= 0) goto L23
            int r2 = r5.c
            if (r2 < 0) goto L23
            r4.o = r5
        L23:
            boolean r2 = r5.b
            if (r2 == 0) goto L7c
            dth r2 = r5.e
            if (r2 != 0) goto L2d
            dth r2 = defpackage.dth.f
        L2d:
            int r2 = r2.a
            r2 = r2 & 2
            if (r2 == 0) goto L7c
            if (r1 == 0) goto L5a
            int r2 = r1.a
            r2 = r2 & 4
            if (r2 == 0) goto L5a
            dth r2 = r5.e
            if (r2 != 0) goto L41
            dth r2 = defpackage.dth.f
        L41:
            doxf r2 = r2.c
            if (r2 != 0) goto L47
            doxf r2 = defpackage.doxf.k
        L47:
            dth r1 = r1.e
            if (r1 != 0) goto L4d
            dth r1 = defpackage.dth.f
        L4d:
            doxf r1 = r1.c
            if (r1 != 0) goto L53
            doxf r1 = defpackage.doxf.k
        L53:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L5a
            goto L7f
        L5a:
            arlb r1 = new arlb
            dth r2 = r5.e
            if (r2 != 0) goto L62
            dth r2 = defpackage.dth.f
        L62:
            doxf r2 = r2.c
            if (r2 != 0) goto L68
            doxf r2 = defpackage.doxf.k
        L68:
            dth r3 = r5.e
            if (r3 != 0) goto L6e
            dth r3 = defpackage.dth.f
        L6e:
            dvzn r3 = r3.b
            if (r3 != 0) goto L74
            dvzn r3 = defpackage.dvzn.e
        L74:
            akrk r3 = defpackage.akrk.h(r3)
            r1.<init>(r2, r3)
            goto L7d
        L7c:
            r1 = 0
        L7d:
            r4.p = r1
        L7f:
            arlb r1 = r4.p
            r0.f(r1)
            daf r0 = r4.i
            if (r0 == 0) goto L8b
            r0.b(r5)
        L8b:
            dai r5 = r4.j
            defpackage.dbsk.s(r5)
            dtk r0 = r4.o
            r5.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arko.h(dtk):void");
    }

    @Override // defpackage.arka
    public final void a(@dzsi Bundle bundle) {
        this.o = (dtk) bvrs.f(bundle, "LAST_KNOWN_VALID_ACTIVE_STATE_REF_BUNDLE_KEY", (dssr) dtk.f.cu(7));
        dhly dhlyVar = this.d.getNavigationParameters().J().h;
        if (dhlyVar == null) {
            dhlyVar = dhly.e;
        }
        if (dhlyVar.b) {
            daj m = this.a.m();
            final arku arkuVar = this.h;
            arkuVar.getClass();
            daf b = m.b(new dbrn(arkuVar) { // from class: arkm
                private final arku a;

                {
                    this.a = arkuVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    Point b2;
                    akqq akqqVar = (akqq) obj;
                    dld dldVar = this.a.a;
                    Bitmap bitmap = dldVar.l;
                    alrh alrhVar = dldVar.A;
                    if (bitmap == null || alrhVar == null || (b2 = alrhVar.b(akqqVar)) == null) {
                        return null;
                    }
                    int i = b2.x;
                    int width = bitmap.getWidth();
                    int i2 = b2.y;
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(-dldVar.z, 0.5f, 0.5f);
                    float[] fArr = {(i + 0.5f) / width, 1.0f - ((i2 + 0.5f) / height)};
                    matrix.mapPoints(fArr);
                    return new akse(fArr[0], fArr[1]);
                }
            }, this.g);
            this.i = b;
            arku arkuVar2 = this.h;
            dbsk.s(b);
            arkuVar2.h(b.c());
            this.h.a.p = this.i;
        }
        dhly dhlyVar2 = this.d.getNavigationParameters().J().h;
        if (dhlyVar2 == null) {
            dhlyVar2 = dhly.e;
        }
        if (dhlyVar2.a) {
            this.k = this.a.m().c(this.g);
        }
        this.j = this.a.m().d(this.g);
    }

    @Override // defpackage.arka
    public final void b() {
        this.l = this.f.a(czh.WALKING_NAVIGATION, czs.NONE);
        czu czuVar = new czu(this) { // from class: arkn
            private final arko a;

            {
                this.a = this;
            }

            @Override // defpackage.czu
            public final void a(Throwable th) {
                arko arkoVar = this.a;
                bvoo.j(th);
                dbsk.m(arkoVar.b.a(), "Ending an AR navigation session without a launcher present should be impossible, as a launcher was necessary to launch the AR session in the first place.");
                cjqp f = arkoVar.c.f(arkoVar.a.a());
                cjta b = cjtd.b();
                b.d = dtxw.u;
                f.d(b.a());
                arkoVar.b.b().c(czh.WALKING_NAVIGATION);
            }
        };
        this.m = czuVar;
        this.l.d(czuVar);
        dtk dtkVar = this.n;
        if (dtkVar != null) {
            h(dtkVar);
        }
    }

    @Override // defpackage.arka
    public final void c() {
        czv czvVar = this.l;
        if (czvVar != null) {
            czvVar.f(null);
            czv czvVar2 = this.l;
            czu czuVar = this.m;
            dbsk.s(czuVar);
            czvVar2.e(czuVar);
            this.l.c();
            this.l = null;
        }
    }

    @Override // defpackage.arka
    public final void d(Bundle bundle) {
        dtk dtkVar = this.o;
        if (dtkVar != null) {
            bvrs.k(bundle, "LAST_KNOWN_VALID_ACTIVE_STATE_REF_BUNDLE_KEY", dtkVar);
        }
    }

    @Override // defpackage.arka
    public final void e(Configuration configuration) {
    }

    @Override // defpackage.arka
    public final void f() {
        dfen dfenVar = this.k;
        if (dfenVar != null) {
            dfenVar.a();
            this.k = null;
        }
        dai daiVar = this.j;
        dbsk.s(daiVar);
        daiVar.a();
        this.j = null;
        daf dafVar = this.i;
        if (dafVar != null) {
            dafVar.a();
            this.i = null;
        }
        this.h.h(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a7  */
    @Override // defpackage.arka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.atlq r26, @defpackage.dzsi defpackage.atlq r27) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arko.g(atlq, atlq):void");
    }
}
