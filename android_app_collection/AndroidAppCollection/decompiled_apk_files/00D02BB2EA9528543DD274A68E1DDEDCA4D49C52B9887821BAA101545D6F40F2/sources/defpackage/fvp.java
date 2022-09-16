package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fvp  reason: default package */
/* loaded from: classes6.dex */
final class fvp implements dxis {
    final /* synthetic */ fyu a;

    public fvp(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        awks awksVar = (awks) obj;
        bvrv e = this.a.a.e();
        dxjg.e(e);
        awksVar.a = e;
        awksVar.b = this.a.qc();
        awksVar.c = this.a.qM();
        this.a.cY();
        dxjg.e(this.a.a.rp());
        dxjg.e(this.a.a.rK());
        awksVar.d = this.a.qP();
        fyu fyuVar = this.a;
        Application a = fyuVar.a.a();
        dxjg.e(a);
        avki cN = fyuVar.cN();
        btrm rz = fyuVar.a.rz();
        dxjg.e(rz);
        bvrv e2 = fyuVar.a.e();
        dxjg.e(e2);
        crzm<avzg> dk = fyuVar.dk();
        dehq tg = fyuVar.a.tg();
        dxjg.e(tg);
        dehq tf = fyuVar.a.tf();
        dxjg.e(tf);
        awksVar.e = new awkq(a, cN, rz, e2, dk, tg, tf, fyuVar.qK(), fyuVar.qL());
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        akfa rK = this.a.a.rK();
        dxjg.e(rK);
        this.a.m();
        this.a.K();
        this.a.n();
        this.a.o();
        this.a.eY();
        fyu fyuVar2 = this.a;
        if (fyuVar2.eg == null) {
            fyuVar2.eg = new fxy(fyuVar2, 747);
        }
        this.a.E();
        this.a.dh();
        this.a.cV();
        this.a.k();
        this.a.aI();
        this.a.cT();
        this.a.cS();
        this.a.J();
        this.a.V();
        fyu fyuVar3 = this.a;
        if (fyuVar3.eh == null) {
            fyuVar3.eh = new fxy(fyuVar3, 748);
        }
        awksVar.f = new awkv(sV, rK);
        awksVar.g = this.a.qL();
        avpe qL = this.a.qL();
        dehq tg2 = this.a.a.tg();
        dxjg.e(tg2);
        awar qM = this.a.qM();
        akfa rK2 = this.a.a.rK();
        dxjg.e(rK2);
        awfh qP = this.a.qP();
        bvjj rB = this.a.a.rB();
        dxjg.e(rB);
        dxjg.e(this.a.a.rp());
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        awksVar.h = new avph(qL, tg2, qM, rK2, qP, rB, rR);
    }
}
