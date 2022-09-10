package defpackage;
/* compiled from: PG */
/* renamed from: aoiy  reason: default package */
/* loaded from: classes2.dex */
class aoiy implements aoix {
    private final aola a;
    private final aokw b;
    private final anhg c;

    public aoiy(aola aolaVar, aokw aokwVar, anhg anhgVar) {
        this.a = aolaVar;
        this.b = aokwVar;
        this.c = anhgVar;
    }

    @Override // defpackage.aoix
    public cqkl a() {
        this.b.b(this.a);
        aogb.f(new eapg(this.a.b));
        aola aolaVar = this.a;
        dsqp dsqpVar = (dsqp) aolaVar.cu(5);
        dsqpVar.bC(aolaVar);
        aokx aokxVar = (aokx) dsqpVar;
        if (aokxVar.c) {
            aokxVar.bF();
            aokxVar.c = false;
        }
        aola aolaVar2 = (aola) aokxVar.b;
        aolaVar2.d = 1;
        aolaVar2.a |= 32;
        aokxVar.bK();
        return cqkl.a;
    }

    @Override // defpackage.aoix
    public cqkl b() {
        this.b.b(this.a);
        this.c.E();
        return cqkl.a;
    }

    @Override // defpackage.aoix
    public Boolean c() {
        int a = aokz.a(this.a.d);
        return Boolean.valueOf(a != 0 && a == 2);
    }

    @Override // defpackage.aoix
    public cqsn d() {
        if (c().booleanValue()) {
            return cqrt.l(anfx.MAPS_ACTIVITY_TIMELINE_RECEIPT_UPLOAD_PROGESS_TEXT);
        }
        return cqrt.l(anfx.MAPS_ACTIVITY_TIMELINE_RECEIPT_UPLOAD_FAILED_TEXT);
    }
}
