package defpackage;
/* compiled from: PG */
/* renamed from: dail  reason: default package */
/* loaded from: classes5.dex */
final class dail extends daij {
    final /* synthetic */ daij b;
    final /* synthetic */ dair c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dail(dair dairVar, dane daneVar, daij daijVar) {
        super(daneVar);
        this.c = dairVar;
        this.b = daijVar;
    }

    @Override // defpackage.daij
    public final void a() {
        dair dairVar = this.c;
        daij daijVar = this.b;
        if (dairVar.j != 0 || dairVar.e) {
            if (dairVar.e) {
                dairVar.b.c("Waiting to bind to the service.", new Object[0]);
                dairVar.d.add(daijVar);
                return;
            }
            daijVar.run();
            return;
        }
        dairVar.b.c("Initiate binding to the service.", new Object[0]);
        dairVar.d.add(daijVar);
        dairVar.i = new daiq(dairVar);
        dairVar.e = true;
        if (dairVar.a.bindService(dairVar.f, dairVar.i, 1)) {
            return;
        }
        dairVar.b.c("Failed to bind to the service.", new Object[0]);
        dairVar.e = false;
        for (daij daijVar2 : dairVar.d) {
            dane<?> daneVar = daijVar2.a;
            if (daneVar != null) {
                daneVar.a(new dais());
            }
        }
        dairVar.d.clear();
    }
}
