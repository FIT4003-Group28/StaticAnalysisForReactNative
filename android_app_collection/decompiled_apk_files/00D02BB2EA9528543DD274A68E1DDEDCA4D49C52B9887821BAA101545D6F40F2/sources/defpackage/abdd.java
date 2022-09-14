package defpackage;
/* compiled from: PG */
/* renamed from: abdd  reason: default package */
/* loaded from: classes2.dex */
public final class abdd implements degu<dhpd> {
    final /* synthetic */ abdm a;

    public abdd(abdm abdmVar) {
        this.a = abdmVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.a(dbpy.a, false);
        cqkx.p(this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dhpd dhpdVar) {
        dbsg<dqps> dbsgVar;
        dhpd dhpdVar2 = dhpdVar;
        abdm abdmVar = this.a;
        dhpc dhpcVar = dhpdVar2.a;
        if (dhpcVar == null) {
            dhpcVar = dhpc.c;
        }
        dqhy b = dqhy.b(dhpcVar.a);
        if (b == null) {
            b = dqhy.UNKNOWN_STATUS_CODE;
        }
        if (b == dqhy.OK) {
            dhpc dhpcVar2 = dhpdVar2.a;
            if (dhpcVar2 == null) {
                dhpcVar2 = dhpc.c;
            }
            dqps dqpsVar = dhpcVar2.b;
            if (dqpsVar == null) {
                dqpsVar = dqps.e;
            }
            dbsgVar = dbsg.i(dqpsVar);
        } else {
            dbsgVar = dbpy.a;
        }
        abdmVar.a(dbsgVar, false);
        cqkx.p(this.a);
    }
}
