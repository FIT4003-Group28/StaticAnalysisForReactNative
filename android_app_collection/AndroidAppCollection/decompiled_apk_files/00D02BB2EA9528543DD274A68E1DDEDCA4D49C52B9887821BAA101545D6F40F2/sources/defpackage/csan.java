package defpackage;
/* compiled from: PG */
/* renamed from: csan  reason: default package */
/* loaded from: classes5.dex */
public final class csan implements dyey {
    private static csan a;
    private final dbty<Boolean> b;

    private csan(dbty<Boolean> dbtyVar) {
        this.b = dbtyVar;
    }

    public static synchronized csan b() {
        csan csanVar;
        synchronized (csan.class) {
            if (a == null) {
                a = new csan(csah.a);
            }
            csanVar = a;
        }
        return csanVar;
    }

    public static csan c(dbty<Boolean> dbtyVar) {
        return new csan(dbtyVar);
    }

    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        csam csamVar;
        if (!this.b.a().booleanValue()) {
            return dyeuVar.a(dyibVar, dyetVar);
        }
        cwsv cwsvVar = (cwsv) dyetVar.e(csad.a);
        if (cwsvVar == null) {
            String b = dyeuVar.b();
            String str = dyibVar.b;
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 9 + str.length());
            sb.append("https://");
            sb.append(b);
            sb.append("/");
            sb.append(str);
            csamVar = new csam(new cxaj(sb.toString()));
        } else {
            csamVar = new csam(cxaj.a(dyeuVar.b(), cwsvVar));
        }
        return new csaj(dyeuVar.a(dyibVar, dyetVar.c(csamVar)), csamVar);
    }
}
