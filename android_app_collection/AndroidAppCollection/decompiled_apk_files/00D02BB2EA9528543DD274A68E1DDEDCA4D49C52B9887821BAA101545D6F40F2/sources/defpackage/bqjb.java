package defpackage;
/* compiled from: PG */
/* renamed from: bqjb  reason: default package */
/* loaded from: classes4.dex */
public final class bqjb extends bqle {
    public dbsg<djgl> a = dbpy.a;
    public int b;
    private bwrs<ilo> c;
    private docg d;

    @Override // defpackage.bqle
    public final void b(docg docgVar) {
        if (docgVar != null) {
            this.d = docgVar;
            return;
        }
        throw new NullPointerException("Null mergedReview");
    }

    @Override // defpackage.bqle
    public final void c(bwrs<ilo> bwrsVar) {
        if (bwrsVar != null) {
            this.c = bwrsVar;
            return;
        }
        throw new NullPointerException("Null placemarkRef");
    }

    @Override // defpackage.bqle
    public final bqlf a() {
        String str = this.c == null ? " placemarkRef" : "";
        if (this.d == null) {
            str = str.concat(" mergedReview");
        }
        if (this.b == 0) {
            str = String.valueOf(str).concat(" eventType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bqjc(this.c, this.d, this.b, this.a);
    }
}
