package defpackage;

import android.app.Activity;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxzg  reason: default package */
/* loaded from: classes4.dex */
public class bxzg implements bxxs {
    public final bxzm a;
    public List<cqix<?>> b = dcdc.e();
    private final bxty c;
    private final Executor d;

    public bxzg(bxty bxtyVar, Executor executor, bxzm bxzmVar) {
        this.c = bxtyVar;
        this.d = executor;
        this.a = bxzmVar;
    }

    @Override // defpackage.bxxs
    public List<cqix<?>> a() {
        return this.b;
    }

    public dehn<Void> b(boolean z) {
        final deig d = deig.d();
        bxty bxtyVar = this.c;
        final deig d2 = deig.d();
        awvw f = awvx.f();
        f.e(bxrz.a);
        bxrz bxrzVar = (bxrz) bxtyVar;
        f.b(bxrzVar.e.a().aa());
        bxrzVar.b.c(f.a(), bvpj.b(new bxry(bxrzVar, z, d2)), bvrj.BACKGROUND_THREADPOOL);
        deha.q(deha.k(d2).b(new Callable(d2) { // from class: bxrx
            private final dehn a;

            {
                this.a = d2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dehn dehnVar = this.a;
                awwt awwtVar = bxrz.a;
                try {
                    return dcdc.r(((dvjd) ((awwb) deha.r(dehnVar)).a(awvv.E).c(dvjd.d)).b);
                } catch (ExecutionException unused) {
                    return dcdc.e();
                }
            }
        }, bxrzVar.c), bvqj.a(new bvqg(this, d) { // from class: bxzf
            private final bxzg a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                List<cqix<?>> list;
                bxzg bxzgVar = this.a;
                deig deigVar = this.b;
                dcdc dcdcVar = (dcdc) obj;
                bxzm bxzmVar = bxzgVar.a;
                ((ckco) bxzmVar.c.a().a(ckke.c)).a(dcdcVar.size());
                Set<String> set = bxzmVar.b.a.a;
                cqiv cqivVar = new cqiv();
                Iterator<E> it = dcdcVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        dqig dqigVar = (dqig) it.next();
                        dqmr dqmrVar = dqigVar.g;
                        if (dqmrVar == null) {
                            dqmrVar = dqmr.h;
                        }
                        if (!set.contains(dqmrVar.b)) {
                            bxwg bxwgVar = new bxwg();
                            bxzl bxzlVar = bxzmVar.a;
                            bxzl.a(dqigVar, 1);
                            btrm a = bxzlVar.a.a();
                            bxzl.a(a, 2);
                            cvv a2 = bxzlVar.b.a();
                            bxzl.a(a2, 3);
                            dxio a3 = ((dxjh) bxzlVar.c).a();
                            bxzl.a(a3, 4);
                            dxio a4 = ((dxjh) bxzlVar.d).a();
                            bxzl.a(a4, 5);
                            btvo a5 = bxzlVar.e.a();
                            bxzl.a(a5, 6);
                            Activity activity = (Activity) ((dxjd) bxzlVar.f).a;
                            bxzl.a(activity, 7);
                            cyt a6 = bxzlVar.g.a();
                            bxzl.a(a6, 8);
                            cqivVar.a(bxwgVar, new bxzk(dqigVar, a, a2, a3, a4, a5, activity, a6));
                            list = cqivVar.a;
                            break;
                        }
                    } else {
                        list = cqivVar.a;
                        break;
                    }
                }
                if (!list.equals(bxzgVar.b)) {
                    bxzgVar.b = list;
                    cqkx.p(bxzgVar);
                }
                deigVar.j(null);
            }
        }), this.d);
        return d;
    }
}
