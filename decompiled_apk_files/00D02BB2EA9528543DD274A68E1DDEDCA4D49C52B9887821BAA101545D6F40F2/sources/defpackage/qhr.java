package defpackage;
/* compiled from: PG */
/* renamed from: qhr  reason: default package */
/* loaded from: classes7.dex */
public final class qhr {
    public static final qhq a(amuk amukVar, dowd dowdVar) {
        dbsk.a(amsr.e(dowdVar));
        qhd qhdVar = new qhd();
        dnoh dnohVar = dowdVar.c;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        qhdVar.a = akqq.e(dnohVar);
        qhdVar.b = amukVar;
        qhdVar.c = Integer.valueOf(dowdVar.d);
        qhdVar.e = dbsg.i(dowdVar.b);
        if ((dowdVar.a & 16) != 0) {
            qhdVar.d = dbsg.i(Integer.valueOf(dowdVar.e));
        }
        String str = qhdVar.a == null ? " location" : "";
        if (qhdVar.b == null) {
            str = str.concat(" provider");
        }
        if (qhdVar.c == null) {
            str = String.valueOf(str).concat(" availableBikes");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qhe(qhdVar.a, qhdVar.b, qhdVar.c.intValue(), qhdVar.d, qhdVar.e);
    }
}
