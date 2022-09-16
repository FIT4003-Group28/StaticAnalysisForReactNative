package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: fuf  reason: default package */
/* loaded from: classes6.dex */
final class fuf<T> implements dzsj<T> {
    final /* synthetic */ fug a;

    public fuf(fug fugVar) {
        this.a = fugVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        Object obj3;
        fug fugVar = this.a;
        Object obj4 = fugVar.c;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = fugVar.c;
                if (obj instanceof dxjf) {
                    Object obj5 = fugVar.b;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj2 = fugVar.b;
                            if (obj2 instanceof dxjf) {
                                Context b = fugVar.d.a.b();
                                dxjg.e(b);
                                cqat rR = fugVar.d.a.rR();
                                dxjg.e(rR);
                                Object obj6 = fugVar.a;
                                if (obj6 instanceof dxjf) {
                                    synchronized (obj6) {
                                        obj3 = fugVar.a;
                                        if (obj3 instanceof dxjf) {
                                            obj3 = fugVar.d.a.tf();
                                            dxjg.e(obj3);
                                            dxjc.d(fugVar.a, obj3);
                                            fugVar.a = obj3;
                                        }
                                    }
                                    obj6 = obj3;
                                }
                                dmks dmksVar = new dmks(b, rR, (ScheduledExecutorService) obj6);
                                dxjc.d(fugVar.b, dmksVar);
                                fugVar.b = dmksVar;
                                obj2 = dmksVar;
                            }
                        }
                        obj5 = obj2;
                    }
                    obj = new dmkg((dmkj) obj5);
                    dxjc.d(fugVar.c, obj);
                    fugVar.c = obj;
                }
            }
            obj4 = obj;
        }
        return (T) ((dmkd) obj4);
    }
}
