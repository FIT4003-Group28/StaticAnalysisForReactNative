package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: uif  reason: default package */
/* loaded from: classes4.dex */
public final class uif implements uie {
    private final Set a;
    private final qst b;

    public uif(qst qstVar, Context context, Set set) {
        this.b = qstVar;
        this.a = set;
        uid.a(context);
    }

    @Override // defpackage.uie
    public final void a() {
        amzs it = ((amyg) this.a).iterator();
        while (it.hasNext()) {
            uig uigVar = (uig) it.next();
            try {
                rve B = this.b.B(uigVar.d(), uigVar.a(), (String[]) uigVar.c().toArray(new String[0]), uigVar.e());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                uwp.e();
                timeUnit.getClass();
                if (B.j()) {
                    uhy.a(B);
                } else {
                    uhx uhxVar = new uhx();
                    B.p(uhy.a, uhxVar);
                    B.o(uhy.a, uhxVar);
                    B.l(uhy.a, uhxVar);
                    if (!uhxVar.a.await(5000L, timeUnit)) {
                        throw new TimeoutException("Timed out waiting for Task.");
                        break;
                    }
                    uhy.a(B);
                }
                Object[] objArr = new Object[0];
                if (urq.e(4)) {
                    urq.c("PhenotypeManagerImpl", "Phenotype registration SUCCESS", objArr);
                }
                uigVar.b().a();
            } catch (InterruptedException e) {
                Object[] objArr2 = {uigVar.d()};
                if (urq.e(5)) {
                    Log.w("GnpSdk", urq.c("PhenotypeManagerImpl", "Phenotype registration interrupted [%s].", objArr2), e);
                }
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                urq.d("PhenotypeManagerImpl", e2, "Phenotype registration failed with error [%s].", uigVar.d());
            } catch (TimeoutException unused) {
                Object[] objArr3 = {uigVar.d()};
                if (urq.e(5)) {
                    Log.w("GnpSdk", urq.c("PhenotypeManagerImpl", "Phenotype registration timed out [%s].", objArr3));
                }
            }
        }
    }
}
