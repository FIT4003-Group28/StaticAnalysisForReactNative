package defpackage;

import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.gmm.directions.commute.hub.api.CommuteHubDirective$RouteInfo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qsw  reason: default package */
/* loaded from: classes7.dex */
public final class qsw {
    public final cqat b;
    public final qts c;
    private final Executor e;
    private final dxio<akfa> f;
    private final qjk g;
    private final qtx h;
    private final quf i;
    private static final eaow d = eaow.c(5);
    public static final eaow a = eaow.b(3);

    public qsw(Executor executor, cqat cqatVar, dxio<akfa> dxioVar, qjk qjkVar, qtx qtxVar, qts qtsVar, quf qufVar) {
        this.e = executor;
        this.b = cqatVar;
        this.f = dxioVar;
        this.g = qjkVar;
        this.h = qtxVar;
        this.c = qtsVar;
        this.i = qufVar;
    }

    @dzsi
    private final dspd e(domy domyVar, dndr dndrVar) {
        dnld dnldVar;
        if (domyVar.equals(domy.TRANSIT) || domyVar.equals(domy.MULTIMODAL)) {
            dbsg<dnlg> dbsgVar = dbpy.a;
            if (dndrVar.equals(dndr.HOME)) {
                dbsgVar = this.g.s();
            } else if (dndrVar.equals(dndr.WORK)) {
                dbsgVar = this.g.p();
            }
            if (dbsgVar.a()) {
                dnlg b = dbsgVar.b();
                if (b.a == 3) {
                    dnldVar = (dnld) b.b;
                } else {
                    dnldVar = dnld.e;
                }
                if ((dnldVar.a & 2) != 0) {
                    dnlg b2 = dbsgVar.b();
                    return (b2.a == 3 ? (dnld) b2.b : dnld.e).c;
                }
            }
            return null;
        }
        return null;
    }

    public final dehn<Runnable> a() {
        return b(null, null, null, dbpy.a);
    }

    public final dehn<Runnable> b(@dzsi final quw quwVar, @dzsi quy quyVar, @dzsi final qux quxVar, final dbsg<dnqh> dbsgVar) {
        if (quyVar != null) {
            return deha.a(c(quyVar, quwVar, quxVar, dbsgVar));
        }
        return deee.g(deew.h(this.h.a(), new dbrn(this, quwVar, quxVar, dbsgVar) { // from class: qsu
            private final qsw a;
            private final quw b;
            private final qux c;
            private final dbsg d;

            {
                this.a = this;
                this.b = quwVar;
                this.c = quxVar;
                this.d = dbsgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.c((quy) obj, this.b, this.c, this.d);
            }
        }, this.e), qtw.class, new dbrn(this) { // from class: qsv
            private final qsw a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                qtw qtwVar = (qtw) obj;
                return this.a.c.a(qup.g(quq.INTERNAL_ERROR), quy.c(qjn.i(null, null), domy.UNKNOWN_TRAVEL_MODE), dbpy.a, null);
            }
        }, this.e);
    }

    public final Runnable c(quy quyVar, @dzsi quw quwVar, @dzsi qux quxVar, dbsg<dnqh> dbsgVar) {
        Fragment$SavedState fragment$SavedState = null;
        if (quxVar != null) {
            qul qulVar = (qul) quxVar;
            if (eaow.e(this.b.e() - qulVar.d).q(d)) {
                boolean equals = quyVar.equals(qulVar.a);
                boolean z = true;
                if (quwVar != null && !quwVar.equals(qulVar.b)) {
                    z = false;
                }
                if (equals && z) {
                    quwVar = qulVar.b;
                    fragment$SavedState = qulVar.c;
                }
            }
        }
        qup d2 = d(quyVar);
        if (quwVar != null) {
            quk qukVar = (quk) quwVar;
            dndr dndrVar = qukVar.a;
            domy domyVar = qukVar.b;
            ArrayList arrayList = new ArrayList();
            dspd e = e(domyVar, dndrVar);
            if (e != null) {
                arrayList.add(CommuteHubDirective$RouteInfo.b(e));
            }
            d2 = qup.f(dndrVar, domyVar, dcdc.q(arrayList), d2.d(), this.b.e());
        }
        return this.c.a(d2, quyVar, dbsgVar, fragment$SavedState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r5 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r5 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        r0 = r0.c.a();
        r5 = defpackage.dcep.N();
        r6 = r0.c.j().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
        if (r6.hasNext() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
        r5.b(defpackage.qry.a(r6.next().intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
        r5 = r5.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
        if (r5.isEmpty() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r0 = defpackage.dbpy.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
        r6 = new defpackage.eaol(r0.b.b());
        r7 = r6.g();
        r8 = defpackage.qry.a(r7.B());
        r9 = defpackage.qry.a(r7.r().B());
        r10 = r0.c.l();
        r0 = r0.c.n();
        r10 = defpackage.sht.v(r10);
        r11 = defpackage.sht.v(r0);
        r10 = r7.h(r10);
        r0 = r7.h(r11).k(defpackage.sht.j(r0) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012f, code lost:
        if (r10.w(r0) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0131, code lost:
        r0 = defpackage.dbpy.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0134, code lost:
        r7 = r5.contains(r8);
        r8 = new defpackage.eape(r10.n(defpackage.qrt.a), r0.j(defpackage.qrt.a).s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014d, code lost:
        if (r7 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0153, code lost:
        if (r8.h(r6) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
        r0 = defpackage.dbsg.i(defpackage.qrt.a(r6, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015e, code lost:
        r0 = r5.contains(r9);
        r5 = new defpackage.eape(r8.e().r(), r8.g().r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0177, code lost:
        if (r0 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017d, code lost:
        if (r5.h(r6) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017f, code lost:
        r0 = defpackage.dbsg.i(defpackage.qrt.a(r6, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
        r0 = defpackage.dbpy.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018e, code lost:
        if (r0.a() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0190, code lost:
        r5 = defpackage.dndr.UNKNOWN_ALIAS_TYPE;
        r0 = ((defpackage.dndr) r0.b()).ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019d, code lost:
        if (r0 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a0, code lost:
        if (r0 == 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a2, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a4, code lost:
        defpackage.dbsk.s(r3);
        r0 = r3.C();
        r3 = defpackage.akra.f(r1.e);
        defpackage.dbsk.s(r3);
        r4 = defpackage.akra.f(r2.e);
        defpackage.dbsk.s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c7, code lost:
        if (r0.y(r3) >= r0.y(r4)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qup d(defpackage.quy r13) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsw.d(quy):qup");
    }
}
