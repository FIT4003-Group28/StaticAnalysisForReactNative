package defpackage;
/* renamed from: cymt  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cymt implements dbrn {
    static final dbrn a = new cymt();

    private cymt() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cyle cyleVar = (cyle) obj;
        cyuu cyuuVar = new cyuu();
        String str = cyleVar.a;
        if (str != null) {
            cyuuVar.a = str;
            cyuuVar.b = cyleVar.c;
            cyuuVar.c = cyleVar.d;
            cyjt cyjtVar = cyleVar.b;
            if (cyjtVar == null) {
                cyjtVar = cyjt.g;
            }
            int b = cyiu.b(cyjtVar.a);
            if (b == 0) {
                b = 1;
            }
            duej a2 = cyjp.a(b);
            if (a2 != null) {
                cyuuVar.d = a2;
                cyjt cyjtVar2 = cyleVar.b;
                if (cyjtVar2 == null) {
                    cyjtVar2 = cyjt.g;
                }
                cyuuVar.e = cyjtVar2.b;
                cyjt cyjtVar3 = cyleVar.b;
                if (cyjtVar3 == null) {
                    cyjtVar3 = cyjt.g;
                }
                cyuuVar.f = Boolean.valueOf(cyjtVar3.c);
                String str2 = cyuuVar.a == null ? " displayName" : "";
                if (cyuuVar.d == null) {
                    str2 = str2.concat(" containerType");
                }
                if (cyuuVar.f == null) {
                    str2 = String.valueOf(str2).concat(" isPrimary");
                }
                if (str2.isEmpty()) {
                    return new cyuv(cyuuVar.a, cyuuVar.b, cyuuVar.c, cyuuVar.d, cyuuVar.e, cyuuVar.f.booleanValue());
                }
                String valueOf = String.valueOf(str2);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null containerType");
        }
        throw new NullPointerException("Null displayName");
    }
}
