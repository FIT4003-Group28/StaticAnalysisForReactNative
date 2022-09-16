package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cvps  reason: default package */
/* loaded from: classes5.dex */
public final class cvps implements cvpp {
    public final Set<cvpu> a;
    private final coxz b;

    public cvps(coxz coxzVar, Context context, Set<cvpu> set) {
        this.b = coxzVar;
        this.a = set;
        cxju.c(context);
    }

    @Override // defpackage.cvpp
    public final void a() {
        dcpd it = ((dcnn) this.a).iterator();
        while (it.hasNext()) {
            cvpu cvpuVar = (cvpu) it.next();
            try {
                cpcq<Void> a = this.b.a(cvpuVar.c(), cvpuVar.a(), (String[]) cvpuVar.d().toArray(new String[0]), cvpuVar.e());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                czhz.c();
                dbsk.t(a, "Task cannot be null.");
                dbsk.t(timeUnit, "Time unit cannot be null.");
                if (a.a()) {
                    cvpj.a(a);
                } else {
                    cvpi cvpiVar = new cvpi();
                    a.p(cvpj.a, cvpiVar);
                    a.o(cvpj.a, cvpiVar);
                    a.l(cvpj.a, cvpiVar);
                    if (!cvpiVar.a.await(5000L, timeUnit)) {
                        throw new TimeoutException("Timed out waiting for Task.");
                        break;
                    }
                    cvpj.a(a);
                }
                Object[] objArr = new Object[0];
                if (cvpg.a(4)) {
                    cvpg.c("PhenotypeManagerImpl", "Phenotype registration SUCCESS", objArr);
                }
                cvpuVar.b().g("");
            } catch (InterruptedException unused) {
                Object[] objArr2 = {cvpuVar.c()};
                if (cvpg.a(5)) {
                    cvpg.c("PhenotypeManagerImpl", "Phenotype registration interrupted [%s].", objArr2);
                }
                Thread.currentThread().interrupt();
            } catch (ExecutionException unused2) {
                cvpg.b("PhenotypeManagerImpl", "Phenotype registration failed with error [%s].", cvpuVar.c());
            } catch (TimeoutException unused3) {
                Object[] objArr3 = {cvpuVar.c()};
                if (cvpg.a(5)) {
                    cvpg.c("PhenotypeManagerImpl", "Phenotype registration timed out [%s].", objArr3);
                }
            }
        }
    }
}
