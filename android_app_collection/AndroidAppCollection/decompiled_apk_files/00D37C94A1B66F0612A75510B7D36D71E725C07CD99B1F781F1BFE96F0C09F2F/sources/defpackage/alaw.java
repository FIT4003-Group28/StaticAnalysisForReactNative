package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alaw  reason: default package */
/* loaded from: classes.dex */
public final class alaw implements afzf {
    final /* synthetic */ List a;
    final /* synthetic */ alaz b;

    public alaw(alaz alazVar, List list) {
        this.b = alazVar;
        this.a = list;
    }

    @Override // defpackage.cez
    public final void kV(final cff cffVar) {
        zep.f("UploadFeedbackPoller", "onErrorResponse", cffVar);
        ScheduledExecutorService scheduledExecutorService = this.b.d;
        final List list = this.a;
        scheduledExecutorService.execute(new Runnable() { // from class: alav
            @Override // java.lang.Runnable
            public final void run() {
                alaw alawVar = alaw.this;
                List<alay> list2 = list;
                cff cffVar2 = cffVar;
                alaz alazVar = alawVar.b;
                list2.getClass();
                for (alay alayVar : list2) {
                    alay alayVar2 = new alay(alayVar.a, alayVar.b, alayVar.c, 5000 + alazVar.b.c(), alayVar.e, alayVar.f + 1);
                    if (alayVar2.f > 3) {
                        Iterator it = alazVar.f.iterator();
                        while (it.hasNext()) {
                            ((alax) it.next()).f(alayVar2.c, cffVar2);
                            alazVar.e(alayVar2.b, alayVar2.c);
                        }
                    } else {
                        alazVar.e.add(alayVar2);
                    }
                }
                alazVar.g();
            }
        });
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        final asfl asflVar = (asfl) obj;
        this.b.d.execute(new Runnable() { // from class: alau
            @Override // java.lang.Runnable
            public final void run() {
                alaw alawVar = alaw.this;
                asfl asflVar2 = asflVar;
                alaz alazVar = alawVar.b;
                asflVar2.getClass();
                for (asfr asfrVar : asflVar2.c) {
                    if (asfrVar.b == 64128279) {
                        alazVar.d((avuq) asfrVar.c);
                    }
                }
                for (auna aunaVar : asflVar2.d) {
                    if (aunaVar.qn(avuq.b)) {
                        alazVar.d((avuq) aunaVar.qm(avuq.b));
                    }
                }
                alazVar.g();
            }
        });
    }
}
