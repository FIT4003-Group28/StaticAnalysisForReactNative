package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fcr  reason: default package */
/* loaded from: classes6.dex */
final class fcr implements dxis {
    final /* synthetic */ ftt a;

    public fcr(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        dlz dlzVar = (dlz) obj;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        dlzVar.ak = tr;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ((dev) dlzVar).al = tp;
        ((des) dlzVar).ad = this.a.eu();
        ((des) dlzVar).ae = dcdn.m(czh.LIGHTHOUSE, (czl) this.a.ei(), czh.CALIBRATOR, (czl) this.a.ej(), czh.WALKING_NAVIGATION, this.a.eq());
        dlzVar.af = new cjxo(this.a.a);
        aufc sB = this.a.eW.a.sB();
        dxjg.e(sB);
        ((det) dlzVar).ah = sB;
        ((det) dlzVar).ai = dxjc.c(this.a.eW.iU());
        dlzVar.aj = dxjc.c(this.a.eW.ie());
        fyu fyuVar = this.a.eW;
        Object obj3 = fyuVar.dn;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fyuVar.dn;
                if (obj2 instanceof dxjf) {
                    Application a = fyuVar.a.a();
                    dxjg.e(a);
                    cvin ab = fyuVar.ab();
                    Executor sV = fyuVar.a.sV();
                    dxjg.e(sV);
                    obj2 = new dku(a, ab, sV);
                    dxjc.d(fyuVar.dn, obj2);
                    fyuVar.dn = obj2;
                }
            }
            obj3 = obj2;
        }
        dlzVar.am = (dku) obj3;
        dlzVar.an = this.a.eW.jY();
        dlzVar.ao = new cpv();
    }
}
