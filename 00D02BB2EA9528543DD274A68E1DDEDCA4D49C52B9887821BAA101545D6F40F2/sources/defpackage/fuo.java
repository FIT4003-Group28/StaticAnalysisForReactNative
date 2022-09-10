package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fuo  reason: default package */
/* loaded from: classes6.dex */
final class fuo<T> implements dzsj<T> {
    final /* synthetic */ fup a;

    public fuo(fup fupVar) {
        this.a = fupVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        fup fupVar = this.a;
        Application a = fupVar.a.a.a();
        dxjg.e(a);
        akai hw = fupVar.a.hw();
        fyu fyuVar = fupVar.a;
        Object obj2 = fyuVar.ec;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = fyuVar.ec;
                if (obj instanceof dxjf) {
                    Context b = fyuVar.a.b();
                    dxjg.e(b);
                    obj = new aias(b);
                    dxjc.d(fyuVar.ec, obj);
                    fyuVar.ec = obj;
                }
            }
            obj2 = obj;
        }
        ajsj es = fupVar.a.es();
        Executor sV = fupVar.a.a.sV();
        dxjg.e(sV);
        aijz eJ = fupVar.a.eJ();
        ajmq eP = fupVar.a.eP();
        ahzd ahzdVar = new ahzd(fupVar.a.hw(), fupVar.a.es(), fupVar.b());
        ahzh ahzhVar = new ahzh(fupVar.a.hw(), fupVar.a.es(), fupVar.b());
        btvo rp = fupVar.a.a.rp();
        dxjg.e(rp);
        ajln hs = fupVar.a.hs();
        ckcw rU = fupVar.a.a.rU();
        dxjg.e(rU);
        return (T) new aiar(a, hw, (aias) obj2, es, sV, eJ, eP, ahzdVar, ahzhVar, rp, hs, rU);
    }
}
