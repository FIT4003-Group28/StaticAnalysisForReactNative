package defpackage;
/* compiled from: PG */
/* renamed from: brsa  reason: default package */
/* loaded from: classes4.dex */
public final class brsa extends brru {
    public Runnable a;
    private dbsg<bnhz> b = dbpy.a;

    @Override // defpackage.brru
    public final void b(dbsg<bnhz> dbsgVar) {
        this.b = dbsgVar;
    }

    @Override // defpackage.brru
    public final brrv a() {
        String str = this.a == null ? " placeCardClickHandler" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new brsb(this.b, this.a);
    }
}
