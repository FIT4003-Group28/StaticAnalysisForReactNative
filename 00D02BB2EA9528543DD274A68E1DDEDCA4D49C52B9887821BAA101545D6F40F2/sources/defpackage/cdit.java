package defpackage;
/* compiled from: PG */
/* renamed from: cdit  reason: default package */
/* loaded from: classes4.dex */
public final class cdit extends cdje {
    public dcdc<bbtm> a;
    public cdjd b;
    private chbv c;
    private dnqh d;

    @Override // defpackage.cdje
    public final void b(dnqh dnqhVar) {
        if (dnqhVar != null) {
            this.d = dnqhVar;
            return;
        }
        throw new NullPointerException("Null loggingParams");
    }

    @Override // defpackage.cdje
    public final void c(chbv chbvVar) {
        if (chbvVar != null) {
            this.c = chbvVar;
            return;
        }
        throw new NullPointerException("Null thanksOnSubmit");
    }

    @Override // defpackage.cdje
    public final cdjf a() {
        String str = this.a == null ? " photosToPreselect" : "";
        if (this.c == null) {
            str = str.concat(" thanksOnSubmit");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" loggingParams");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cdiu(this.a, this.c, this.d, this.b);
    }
}
