package defpackage;
/* compiled from: PG */
/* renamed from: bngk  reason: default package */
/* loaded from: classes3.dex */
public final class bngk implements bnep {
    private final String a;
    private final String b;
    private final bqsq c;

    public bngk(bqsq bqsqVar, cdjd cdjdVar) {
        String str;
        String a;
        this.c = bqsqVar;
        cdiz d = bneh.d(cdjdVar);
        dzvx.c(d, "$this$visitDate");
        eapy f = d.f().f();
        String str2 = "";
        this.a = (f == null || (str = bqsqVar.a(f)) == null) ? str2 : str;
        cdiz d2 = bneh.d(cdjdVar);
        dzvx.c(d2, "$this$text");
        cdjl f2 = d2.b().f();
        if (f2 != null && (a = f2.a()) != null) {
            str2 = a;
        }
        this.b = str2;
    }

    @Override // defpackage.bnep
    public String a() {
        return this.a;
    }

    @Override // defpackage.bnep
    public String b() {
        return this.b;
    }
}
