package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azmb  reason: default package */
/* loaded from: classes3.dex */
public final class azmb implements axwz {
    public final batm a;
    public final dbuj<dndr, dcdc<azxa>> b;
    private final azof c;
    private final cjnx d;
    private final akfa e;

    public azmb(azof azofVar, batm batmVar, cjnx cjnxVar, akfa akfaVar) {
        this.c = azofVar;
        this.a = batmVar;
        this.d = cjnxVar;
        this.e = akfaVar;
        dbuo<Object, Object> a = dbuo.a();
        a.f(1);
        a.i(10);
        a.h(6L, TimeUnit.MINUTES);
        this.b = a.e();
    }

    @Override // defpackage.axwz
    public final dcdc<azxa> a() {
        bvrj.UI_THREAD.d();
        try {
            btlu j = this.e.j();
            if (j != null && btlu.i(j) == btlt.GOOGLE) {
                dcdc<azxa> c = this.b.c(dndr.UNKNOWN_ALIAS_TYPE, new Callable(this) { // from class: azma
                    private final azmb a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.b();
                    }
                });
                if (this.d.l(j).get().booleanValue()) {
                    return c;
                }
                dccx F = dcdc.F();
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    azxa azxaVar = c.get(i);
                    if (azxaVar.g() != dndr.INFERRED_HOME && azxaVar.g() != dndr.INFERRED_WORK && (azxaVar.g() == dndr.HOME || azxaVar.g() == dndr.WORK)) {
                        dofy k = azxaVar.k();
                        dsqp dsqpVar = (dsqp) k.cu(5);
                        dsqpVar.bC(k);
                        dofx dofxVar = (dofx) dsqpVar;
                        if (dofxVar.c) {
                            dofxVar.bF();
                            dofxVar.c = false;
                        }
                        dofy dofyVar = (dofy) dofxVar.b;
                        dofy dofyVar2 = dofy.i;
                        dofyVar.a &= -65;
                        dofyVar.h = 0;
                        F.g(new azwz(dofxVar.bK()).b());
                    }
                }
                return F.f();
            }
            return dcdc.e();
        } catch (InterruptedException | ExecutionException unused) {
            return dcdc.e();
        }
    }

    public final dcdc<azxa> b() {
        bvrj.UI_THREAD.d();
        try {
            return this.c.a(azxm.h);
        } catch (axxc unused) {
            return dcdc.e();
        }
    }
}
