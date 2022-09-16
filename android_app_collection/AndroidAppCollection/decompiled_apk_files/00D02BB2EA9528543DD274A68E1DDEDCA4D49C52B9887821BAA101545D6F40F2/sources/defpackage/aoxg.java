package defpackage;
/* compiled from: PG */
/* renamed from: aoxg  reason: default package */
/* loaded from: classes2.dex */
final class aoxg extends aoyh {
    public dbsg<ilo> a;
    public int b;
    private aoyi c;
    private dbsg<aoxp> d;

    public aoxg() {
        this.d = dbpy.a;
        this.a = dbpy.a;
    }

    public aoxg(aoyj aoyjVar) {
        this.d = dbpy.a;
        this.a = dbpy.a;
        aoxh aoxhVar = (aoxh) aoyjVar;
        this.c = aoxhVar.a;
        this.b = aoxhVar.d;
        this.d = aoxhVar.b;
        this.a = aoxhVar.c;
    }

    @Override // defpackage.aoyh
    public final void b(dbsg<aoxp> dbsgVar) {
        if (dbsgVar != null) {
            this.d = dbsgVar;
            return;
        }
        throw new NullPointerException("Null categoryFilter");
    }

    @Override // defpackage.aoyh
    public final void c(aoyi aoyiVar) {
        if (aoyiVar != null) {
            this.c = aoyiVar;
            return;
        }
        throw new NullPointerException("Null ordering");
    }

    @Override // defpackage.aoyh
    public final aoyj a() {
        String str = this.c == null ? " ordering" : "";
        if (this.b == 0) {
            str = str.concat(" placeType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aoxh(this.c, this.b, this.d, this.a);
    }
}
