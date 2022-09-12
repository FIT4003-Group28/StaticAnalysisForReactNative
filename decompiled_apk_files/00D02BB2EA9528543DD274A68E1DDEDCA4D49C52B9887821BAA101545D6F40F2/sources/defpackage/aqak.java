package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqak  reason: default package */
/* loaded from: classes2.dex */
public final class aqak implements csuh {
    public static final Handler q = new Handler(Looper.getMainLooper());
    public static final dcdn<auhh, aqcp> r = dcdn.m(auhh.SUPPRESSED, aqcp.SUPPRESSED_BY_SYSTEM, auhh.SUPPRESSED_FOR_OPTOUT, aqcp.SUPPRESSED_FOR_OPTOUT, auhh.SUPPRESSED_FOR_COUNTERFACTUAL, aqcp.SUPPRESSED_FOR_COUNTERFACTUAL);
    public static final dcdn<auhh, ddci> s = dcdn.m(auhh.SUPPRESSED, ddci.SUPPRESSED_BY_SYSTEM, auhh.SUPPRESSED_FOR_OPTOUT, ddci.SUPPRESSED_FOR_OPTOUT, auhh.SUPPRESSED_FOR_COUNTERFACTUAL, ddci.SUPPRESSED_FOR_COUNTERFACTUAL);
    public final apyv a;
    public final dxio<apyy> b;
    public final auhi c;
    public final acyp d;
    public final dxio<aqaa> e;
    public final dxio<aqdj> f;
    public final dxio<aqbv> g;
    public final dxio<aqcm> h;
    public final dxio<aqcz> i;
    public final dxio<apzy> j;
    public final dxio<auon> k;
    public final ckcw l;
    public final cjqy m;
    public final Executor n;
    public final dxio<akfa> o;
    public final dxio<aqbw> p;
    public final aqrr t;
    private final bvjj u;
    private final dxio<aqav> v;
    private final dxio<afec> w;

    public aqak(apyv apyvVar, dxio dxioVar, auhi auhiVar, aqrr aqrrVar, bvjj bvjjVar, acyp acypVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5, dxio dxioVar6, dxio dxioVar7, dxio dxioVar8, dxio dxioVar9, ckcw ckcwVar, cjqy cjqyVar, Executor executor, dxio dxioVar10, dxio dxioVar11, dxio dxioVar12) {
        this.a = apyvVar;
        this.b = dxioVar;
        this.c = auhiVar;
        this.t = aqrrVar;
        this.u = bvjjVar;
        this.d = acypVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.v = dxioVar4;
        this.g = dxioVar5;
        this.h = dxioVar6;
        this.i = dxioVar7;
        this.j = dxioVar8;
        this.k = dxioVar9;
        this.l = ckcwVar;
        this.m = cjqyVar;
        this.n = executor;
        this.o = dxioVar10;
        this.w = dxioVar11;
        this.p = dxioVar12;
    }

    public final void a(btlu btluVar) {
        if (this.d.a()) {
            this.u.T(bvjk.bp, btluVar, false);
        }
    }

    @Override // defpackage.csuv
    public final void b(ContactId contactId) {
        if (this.o.a().j().m() || this.w.a().a()) {
            return;
        }
        deha.q(this.v.a().b().a(contactId), new aqah(this, contactId), dege.a);
    }

    public final void c(ctyy ctyyVar, final Runnable runnable) {
        if (!aqda.c(ctyyVar)) {
            runnable.run();
        } else {
            bvqj.e(this.g.a().a(ctyyVar), new bvqg(this, runnable) { // from class: aqaf
                private final aqak a;
                private final Runnable b;

                {
                    this.a = this;
                    this.b = runnable;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    aqak aqakVar = this.a;
                    Runnable runnable2 = this.b;
                    dbsg dbsgVar = (dbsg) obj;
                    if (dbsgVar == null || !dbsgVar.a() || !aqakVar.a.b((btlu) dbsgVar.b())) {
                        return;
                    }
                    runnable2.run();
                }
            }, dege.a);
        }
    }

    @Override // defpackage.csuv
    public final void d() {
    }

    @Override // defpackage.csuv
    public final void e() {
    }
}
