package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abxx  reason: default package */
/* loaded from: classes2.dex */
public final class abxx {
    public final dcdc<aceh> a;
    public final dbsg<aceh> b;
    final dcdc<aceh> c;

    public abxx(dcdc<aceh> dcdcVar, dbsg<aceh> dbsgVar) {
        this.a = dcdcVar;
        this.b = dbsgVar;
        if (!dbsgVar.a() || a(dcdcVar, dbsgVar.b().c()).a()) {
            this.c = dcdcVar;
            return;
        }
        dccx F = dcdc.F();
        F.g(dbsgVar.b());
        F.i(dcdcVar);
        this.c = F.f();
    }

    public static dbsg<aceh> a(dcdc<aceh> dcdcVar, dspd dspdVar) {
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            aceh acehVar = dcdcVar.get(i);
            i++;
            if (acehVar.c().equals(dspdVar)) {
                return dbsg.i(acehVar);
            }
        }
        return dbpy.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abxx b() {
        return new abxx(dcdc.e(), dbpy.a);
    }
}
