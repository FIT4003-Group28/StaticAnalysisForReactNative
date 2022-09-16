package defpackage;

import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acro  reason: default package */
/* loaded from: classes.dex */
public final class acro implements Runnable {
    final /* synthetic */ arrg a;
    final /* synthetic */ acrp b;
    final /* synthetic */ aopa c;

    public acro(acrp acrpVar, arrg arrgVar, aopa aopaVar) {
        this.b = acrpVar;
        this.a = arrgVar;
        this.c = aopaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqll b;
        acrp acrpVar = this.b;
        acrs acrsVar = acrpVar.b;
        if (acrsVar.f) {
            arrg arrgVar = this.a;
            if (!acrsVar.e.containsKey(arrgVar)) {
                b = aqll.DELAYED_EVENT_TIER_DEFAULT;
            } else {
                b = aqll.b(((Integer) acrsVar.e.get(arrgVar)).intValue());
            }
            aqwl aqwlVar = this.b.b.a;
            if ((aqwlVar.b & 256) != 0 && aqwlVar.g) {
                b = aqll.DELAYED_EVENT_TIER_IMMEDIATE;
            }
            this.b.a.o(b, this.c);
        } else {
            acrpVar.a.n(this.c);
        }
        if (this.b.c.isPresent()) {
            ((Consumer) this.b.c.get()).accept((oro) this.c.mo39build());
        }
    }
}
