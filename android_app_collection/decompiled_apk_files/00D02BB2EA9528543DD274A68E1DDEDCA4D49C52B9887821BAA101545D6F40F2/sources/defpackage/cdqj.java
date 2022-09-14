package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdqj  reason: default package */
/* loaded from: classes4.dex */
public final class cdqj extends cdrl {
    public bvrt<docg> a;
    public cdja b;
    public dbsg<cdis> c;
    private dbsg<cdrt> d;
    private dbsg<cdrh> e;

    public cdqj() {
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.c = dbpy.a;
    }

    public cdqj(cdrr cdrrVar) {
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.c = dbpy.a;
        cdqk cdqkVar = (cdqk) cdrrVar;
        this.a = cdqkVar.a;
        this.b = cdqkVar.b;
        this.d = cdqkVar.c;
        this.e = cdqkVar.d;
        this.c = cdqkVar.e;
    }

    @Override // defpackage.cdrl
    public final void b(dbsg<cdrh> dbsgVar) {
        if (dbsgVar != null) {
            this.e = dbsgVar;
            return;
        }
        throw new NullPointerException("Null tactileReviewOwnerResponse");
    }

    @Override // defpackage.cdrl
    public final void c(dbsg<cdrt> dbsgVar) {
        if (dbsgVar != null) {
            this.d = dbsgVar;
            return;
        }
        throw new NullPointerException("Null tactileReviewText");
    }

    @Override // defpackage.cdrl
    public final cdrr a() {
        String str = this.a == null ? " serializableReview" : "";
        if (this.b == null) {
            str = str.concat(" publicationState");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cdqk(this.a, this.b, this.d, this.e, this.c);
    }
}
