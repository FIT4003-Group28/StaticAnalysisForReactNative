package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: agtd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agtd implements anir {
    public final /* synthetic */ amuk a;
    public final /* synthetic */ ScheduledExecutorService b;
    public final /* synthetic */ amvn c;
    public final /* synthetic */ ankt d;
    private final /* synthetic */ int e;

    public /* synthetic */ agtd(amuk amukVar, ScheduledExecutorService scheduledExecutorService, amvn amvnVar, ankt anktVar) {
        this.a = amukVar;
        this.b = scheduledExecutorService;
        this.c = amvnVar;
        this.d = anktVar;
    }

    public /* synthetic */ agtd(amuk amukVar, ScheduledExecutorService scheduledExecutorService, amvn amvnVar, ankt anktVar, int i) {
        this.e = i;
        this.a = amukVar;
        this.b = scheduledExecutorService;
        this.c = amvnVar;
        this.d = anktVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = 2;
        if (this.e == 0) {
            amuk amukVar = this.a;
            ScheduledExecutorService scheduledExecutorService = this.b;
            amvn amvnVar = this.c;
            ankt anktVar = this.d;
            ankt anktVar2 = (ankt) amukVar.get(0);
            if (true == (((Exception) obj) instanceof TimeoutException)) {
                i = 1;
            }
            return agtj.a(agtj.b(anktVar2, i, scheduledExecutorService), amvnVar, new agtd(amukVar, scheduledExecutorService, amvnVar, anktVar, 1), scheduledExecutorService);
        }
        amuk amukVar2 = this.a;
        final ScheduledExecutorService scheduledExecutorService2 = this.b;
        amvn amvnVar2 = this.c;
        final ankt anktVar3 = this.d;
        Exception exc = (Exception) obj;
        return agtj.a(agtj.b((ankt) amukVar2.get(1), 2, scheduledExecutorService2), amvnVar2, new anir() { // from class: agte
            @Override // defpackage.anir
            public final ankt a(Object obj2) {
                Exception exc2 = (Exception) obj2;
                return agtj.b(ankt.this, 0, scheduledExecutorService2);
            }
        }, scheduledExecutorService2);
    }
}
