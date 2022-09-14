package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dtb  reason: default package */
/* loaded from: classes6.dex */
public final class dtb implements degu<dsw> {
    final /* synthetic */ dqkc a;
    final /* synthetic */ dtc b;

    public dtb(dtc dtcVar, dqkc dqkcVar) {
        this.b = dtcVar;
        this.a = dqkcVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dsw dswVar) {
        if (dswVar.b) {
            return;
        }
        dta dtaVar = this.b.b;
        dqkc dqkcVar = this.a;
        jlp a = dtaVar.a.a();
        dta.a(a, 1);
        dxio a2 = ((dxjh) dtaVar.b).a();
        dta.a(a2, 2);
        gga a3 = dtaVar.c.a();
        dta.a(a3, 3);
        cpv a4 = dtaVar.d.a();
        dta.a(a4, 4);
        dta.a(dqkcVar, 5);
        dsz dszVar = new dsz(a, a2, a3, a4, dqkcVar);
        dszVar.a.a().a(dszVar);
    }
}
