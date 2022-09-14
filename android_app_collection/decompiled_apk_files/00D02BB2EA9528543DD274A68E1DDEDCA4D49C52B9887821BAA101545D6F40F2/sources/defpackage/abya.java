package defpackage;
/* compiled from: PG */
/* renamed from: abya  reason: default package */
/* loaded from: classes2.dex */
final class abya {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static acef a(dkei dkeiVar) {
        dbsg<aceg> dbsgVar;
        dccx F = dcdc.F();
        for (dkei dkeiVar2 : dkeiVar.b) {
            F.g(a(dkeiVar2));
        }
        dkeh dkehVar = dkeiVar.c;
        if (dkehVar == null) {
            dkehVar = dkeh.e;
        }
        dbsg<acej> a = abyt.a(dkehVar);
        if ((dkeiVar.a & 2) != 0) {
            dqlw dqlwVar = dkeiVar.d;
            if (dqlwVar == null) {
                dqlwVar = dqlw.i;
            }
            dbsg dbsgVar2 = dbpy.a;
            if ((dqlwVar.a & 2) != 0) {
                dbsgVar2 = dbsg.i(dqlwVar.c);
            }
            dbsgVar = dbsg.i(new acdz(dqlwVar.b, dbsgVar2, dqlwVar.f));
        } else {
            dbsgVar = dbpy.a;
        }
        acdx acdxVar = new acdx();
        acdxVar.a(dcdc.e());
        acdxVar.b = dbpy.a;
        acdxVar.a(F.f());
        acdxVar.b = a;
        acdxVar.c = dbsgVar;
        String str = acdxVar.a == null ? " childElements" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new acdy(acdxVar.a, acdxVar.b, acdxVar.c);
    }
}
