package defpackage;
/* compiled from: PG */
/* renamed from: apwm  reason: default package */
/* loaded from: classes2.dex */
final class apwm implements degu<Boolean> {
    final /* synthetic */ String a;
    final /* synthetic */ btlu b;
    final /* synthetic */ apwn c;

    public apwm(apwn apwnVar, String str, btlu btluVar) {
        this.c = apwnVar;
        this.a = str;
        this.b = btluVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.i(this.a, 2, this.b);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        aqwq aqwqVar = this.c.e;
        String str = this.a;
        boolean equals = Boolean.TRUE.equals(bool);
        btlu btluVar = this.b;
        synchronized (aqwqVar.e) {
            aqxf aqxfVar = (aqxf) aqwqVar.d.N(aqwq.e(str), btluVar, (dssr) aqxf.c.cu(7), aqxf.c);
            dbsk.s(aqxfVar);
            dsqp dsqpVar = (dsqp) aqxfVar.cu(5);
            dsqpVar.bC(aqxfVar);
            aqxe aqxeVar = (aqxe) dsqpVar;
            if (aqxeVar.c) {
                aqxeVar.bF();
                aqxeVar.c = false;
            }
            ((aqxf) aqxeVar.b).b = equals;
            aqxf bK = aqxeVar.bK();
            aqwqVar.d.am(aqwq.e(str), btluVar, bK);
            aqwx.a(bK);
        }
        this.c.i(this.a, 3, this.b);
    }
}
