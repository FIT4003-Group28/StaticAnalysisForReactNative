package defpackage;
/* compiled from: PG */
/* renamed from: cbsd  reason: default package */
/* loaded from: classes4.dex */
public final class cbsd implements cbsc {
    public final crzo<cbuf> a;
    public final cbsk b;
    public final cbsh c;
    public final cbrx d;
    public final cbss e;

    public cbsd(cbsl cbslVar, cbsi cbsiVar, ges gesVar) {
        crzo<cbuf> crzoVar = new crzo<>(cbuf.UNKNOWN);
        this.a = crzoVar;
        cbsq a = cbslVar.a.a();
        cbsl.a(a, 1);
        cbtc a2 = cbslVar.b.a();
        cbsl.a(a2, 2);
        cbsl.a(gesVar, 3);
        cbsk cbskVar = new cbsk(a, a2, gesVar);
        this.b = cbskVar;
        gga a3 = cbsiVar.a.a();
        cbsi.a(a3);
        cbsh cbshVar = new cbsh(a3);
        this.c = cbshVar;
        cbry cbryVar = new cbry();
        cbryVar.a = cbskVar;
        cbryVar.b = cbshVar;
        String str = "";
        String str2 = cbryVar.b == null ? " placeTopic" : str;
        str2 = cbryVar.a == null ? str2.concat(" review") : str2;
        if (!str2.isEmpty()) {
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        this.d = new cbrz(cbryVar.b, cbryVar.a);
        cbsa cbsaVar = new cbsa();
        cbsaVar.a = crzoVar.a;
        cbsaVar.b = cbshVar.a();
        cbsaVar.c = cbskVar.g();
        str = cbsaVar.a == null ? " taskType" : str;
        str = cbsaVar.b == null ? str.concat(" placeTopic") : str;
        str = cbsaVar.c == null ? String.valueOf(str).concat(" review") : str;
        if (!str.isEmpty()) {
            String valueOf2 = String.valueOf(str);
            throw new IllegalStateException(valueOf2.length() != 0 ? "Missing required properties:".concat(valueOf2) : new String("Missing required properties:"));
        } else {
            this.e = new cbsb(cbsaVar.a, cbsaVar.b, cbsaVar.c);
        }
    }
}
