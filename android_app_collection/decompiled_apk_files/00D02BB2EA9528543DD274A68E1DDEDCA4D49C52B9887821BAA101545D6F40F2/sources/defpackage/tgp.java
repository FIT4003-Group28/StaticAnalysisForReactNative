package defpackage;
/* compiled from: PG */
/* renamed from: tgp  reason: default package */
/* loaded from: classes7.dex */
public final class tgp extends tgs {
    public btlu a;
    public tgu d;
    public int e;
    public thc f;
    public dbsg<amve> b = dbpy.a;
    public dbsg<Integer> c = dbpy.a;
    private dbsg<dqvj> g = dbpy.a;

    @Override // defpackage.tgs
    public final void b(dbsg<dqvj> dbsgVar) {
        if (dbsgVar != null) {
            this.g = dbsgVar;
            return;
        }
        throw new NullPointerException("Null highlightedTravelMode");
    }

    @Override // defpackage.tgs
    public final tgv a() {
        String str = this.e == 0 ? " fetchReason" : "";
        if (this.a == null) {
            str = str.concat(" gmmAccount");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" optionsTransformer");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" directionsParametersProvider");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new tgr(this.e, this.a, this.b, this.c, this.g, this.d, this.f);
    }
}
