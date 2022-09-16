package defpackage;
/* compiled from: PG */
/* renamed from: arkc  reason: default package */
/* loaded from: classes2.dex */
public final class arkc {
    public final dbsg<czc> a;

    public arkc(dbsg<dtt> dbsgVar, dbsg<dap> dbsgVar2, arla arlaVar, btvo btvoVar) {
        arkx arkxVar = ((arjz) arlaVar).c.b;
        if ((arkxVar == null ? arkx.g : arkxVar).f || !btvoVar.getNavigationParameters().J().j) {
            if (dbsgVar.a()) {
                this.a = dbsg.i(dbsgVar.b());
                return;
            }
        } else if (dbsgVar2.a()) {
            this.a = dbsg.i(dbsgVar2.b());
            return;
        }
        this.a = dbpy.a;
    }
}
