package defpackage;
/* compiled from: PG */
/* renamed from: abvv  reason: default package */
/* loaded from: classes.dex */
public class abvv implements abpr {
    private final bjhg a;

    public abvv(bjhi bjhiVar, dbsg<ilo> dbsgVar, absg absgVar) {
        bjhh a = bjhiVar.a(absgVar);
        this.a = a;
        if (dbsgVar.a()) {
            d(a, dbsgVar.b());
        }
    }

    private static void d(bjhg bjhgVar, ilo iloVar) {
        bjhgVar.u();
        bjhgVar.t(bwrs.a(iloVar));
    }

    @Override // defpackage.abpr
    public Boolean a() {
        return this.a.w();
    }

    @Override // defpackage.abpr
    @dzsi
    public bjhg b() {
        if (a().booleanValue()) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.abpr
    public void c(ilo iloVar) {
        d(this.a, iloVar);
    }
}
