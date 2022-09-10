package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.place.timeline.service.postvisitbadge.PostVisitBadgeService;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fwv  reason: default package */
/* loaded from: classes6.dex */
final class fwv implements dxis {
    final /* synthetic */ fyu a;
    private volatile Object b = new dxjf();
    private volatile Object c = new dxjf();

    public fwv(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        PostVisitBadgeService postVisitBadgeService = (PostVisitBadgeService) obj;
        Object obj4 = this.c;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj2 = this.c;
                if (obj2 instanceof dxjf) {
                    dxio c = dxjc.c(this.a.p());
                    dxio c2 = dxjc.c(this.a.at());
                    Object obj5 = this.b;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj3 = this.b;
                            if (obj3 instanceof dxjf) {
                                bmpi bmpiVar = new bmpi(this.a.V(), this.a.m(), this.a.K(), dxjh.c(this.a.at()), dxjh.c(this.a.p()), this.a.kb(), this.a.aI(), this.a.mb());
                                final Application a = this.a.a.a();
                                dxjg.e(a);
                                obj3 = bmpiVar.a(new bmpg(a) { // from class: bmsz
                                    private final Application a;

                                    {
                                        this.a = a;
                                    }

                                    @Override // defpackage.bmpg
                                    public final coqh a() {
                                        return coqk.b(this.a);
                                    }
                                });
                                dxjc.d(this.b, obj3);
                                this.b = obj3;
                            }
                        }
                        obj5 = obj3;
                    }
                    obj2 = new bmop(c, c2, (bmnh) obj5);
                    dxjc.d(this.c, obj2);
                    this.c = obj2;
                }
            }
            obj4 = obj2;
        }
        postVisitBadgeService.a = (bmni) obj4;
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        postVisitBadgeService.b = rU;
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        postVisitBadgeService.c = sV;
    }
}
