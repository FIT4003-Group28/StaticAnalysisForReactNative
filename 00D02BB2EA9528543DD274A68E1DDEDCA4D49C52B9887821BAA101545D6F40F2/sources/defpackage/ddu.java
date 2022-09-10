package defpackage;
/* compiled from: PG */
/* renamed from: ddu  reason: default package */
/* loaded from: classes6.dex */
public final class ddu {
    public final dbsg<czc> a;

    public ddu(dbsg<dtt> dbsgVar, dbsg<dap> dbsgVar2, btvo btvoVar) {
        dkhv dkhvVar = btvoVar.getAugmentedRealityParameters().b;
        if (!(dkhvVar == null ? dkhv.g : dkhvVar).f) {
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
