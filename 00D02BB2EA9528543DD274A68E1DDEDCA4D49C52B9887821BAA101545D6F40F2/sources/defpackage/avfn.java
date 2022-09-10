package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avfn  reason: default package */
/* loaded from: classes2.dex */
public final class avfn {
    public final avbe a;
    @dzsi
    public final avlx b;
    public final avol c;
    public final bvow d;
    public final avhd e;
    public final avqz f;
    public final cjqy g;
    public final avtt h;
    public final Executor i;
    public final avgs j;

    public avfn(@dzsi avlx avlxVar, bvow bvowVar, avra avraVar, cjqy cjqyVar, avtt avttVar, Executor executor, avgs avgsVar, avbe avbeVar, avhd avhdVar, avol avolVar) {
        this.b = avlxVar;
        this.d = bvowVar;
        avfm avfmVar = new avfm(this);
        avfj avfjVar = new avfj(this);
        avop a = avraVar.a.a();
        avra.a(a, 1);
        dehq a2 = avraVar.b.a();
        avra.a(a2, 2);
        avqf a3 = avraVar.c.a();
        avra.a(a3, 3);
        avrd a4 = avraVar.d.a();
        avra.a(a4, 4);
        avrg a5 = avraVar.e.a();
        avra.a(a5, 5);
        avzj a6 = avraVar.f.a();
        avra.a(a6, 6);
        avra.a(avolVar, 7);
        avra.a(avfmVar, 8);
        avra.a(avfjVar, 9);
        this.f = new avqz(a, a2, a3, a4, a5, a6, avolVar, avfmVar, avfjVar);
        this.g = cjqyVar;
        this.h = avttVar;
        this.i = executor;
        this.j = avgsVar;
        this.a = avbeVar;
        this.e = avhdVar;
        this.c = avolVar;
    }

    public final void a(@dzsi avii aviiVar, @dzsi dlsw dlswVar) {
        dlrq b;
        dlrq b2;
        dltp bZ = dltq.c.bZ();
        if (aviiVar != null) {
            long i = this.c.i();
            this.e.a(i, aviiVar);
            avbe avbeVar = this.a;
            avol avolVar = this.c;
            dlok bZ2 = dlol.d.bZ();
            dbsk.s(dlswVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dlol dlolVar = (dlol) bZ2.b;
            dlswVar.getClass();
            dlolVar.b = dlswVar;
            int i2 = dlolVar.a | 1;
            dlolVar.a = i2;
            dlolVar.a = i2 | 2;
            dlolVar.c = i;
            try {
                b2 = (dlrq) dsqw.cq(dlrq.q, avolVar.c.b(avolVar.b, bZ2.bK().bS()));
            } catch (Exception e) {
                avolVar.a("addOperationIdToUpdate", e);
                b2 = avol.b();
            }
            avbeVar.a(b2);
        }
        try {
            boolean a = this.d.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dltq dltqVar = (dltq) bZ.b;
            dltqVar.a |= 1;
            dltqVar.b = a;
        } catch (bvov unused) {
        }
        avbe avbeVar2 = this.a;
        avol avolVar2 = this.c;
        try {
            b = (dlrq) dsqw.cq(dlrq.q, avolVar2.c.a(avolVar2.b, bZ.bK().bS()));
        } catch (Exception e2) {
            avolVar2.a("resumeInterruptedWork", e2);
            b = avol.b();
        }
        avbeVar2.a(b);
    }

    public final void b() {
        dlrq b;
        avbe avbeVar = this.a;
        avol avolVar = this.c;
        try {
            b = (dlrq) dsqw.cq(dlrq.q, avolVar.c.i(avolVar.b));
        } catch (Exception e) {
            avolVar.a("timeoutUpdate", e);
            b = avol.b();
        }
        avbeVar.a(b);
    }

    public final void c() {
        dlrq b;
        avbe avbeVar = this.a;
        avol avolVar = this.c;
        try {
            b = (dlrq) dsqw.cq(dlrq.q, avolVar.c.x(avolVar.b));
        } catch (Exception e) {
            avolVar.a("checkForExpiry", e);
            b = avol.b();
        }
        avbeVar.a(b);
    }

    public final void d(dlsw dlswVar) {
        dlrq b;
        avbe avbeVar = this.a;
        avol avolVar = this.c;
        try {
            b = (dlrq) dsqw.cq(dlrq.q, avolVar.c.y(avolVar.b, dlswVar.bS()));
        } catch (Exception e) {
            avolVar.a("maybeReportRegionUtilization", e);
            b = avol.b();
        }
        avbeVar.a(b);
    }

    public final void e(int i, avkh avkhVar, avqt avqtVar, dlsw dlswVar, int i2) {
        c();
        d(dlswVar);
        avqr avqrVar = new avqr(avkhVar, dlswVar, i, i2);
        dlua dluaVar = (dlua) dcft.d(this.c.f(dlswVar).a, dlua.h);
        dbsk.s(dluaVar);
        int a = dltx.a(dluaVar.b);
        this.f.a(avqrVar, (a == 0 || a == 1) ? false : true, avqtVar);
        ahnc a2 = avkhVar.a();
        if (a2 != null) {
            akqq akqqVar = new akqq(a2.getLatitude(), a2.getLongitude());
            avol avolVar = this.c;
            dlrm bZ = dlrn.b.bZ();
            bZ.a(akqqVar.r());
            dlrn bK = bZ.bK();
            dloy bZ2 = dlpa.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dlpa dlpaVar = (dlpa) bZ2.b;
            dlpaVar.b = 1;
            dlpaVar.a |= 1;
            avolVar.h(dlswVar, bK, bZ2.bK());
        }
    }
}
