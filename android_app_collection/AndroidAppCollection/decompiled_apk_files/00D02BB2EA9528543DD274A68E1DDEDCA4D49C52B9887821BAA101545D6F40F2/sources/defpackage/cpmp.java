package defpackage;
/* compiled from: PG */
/* renamed from: cpmp  reason: default package */
/* loaded from: classes5.dex */
final class cpmp extends cpmr {
    public Boolean a;
    private Integer b;
    private String c;

    @Override // defpackage.cpmr
    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cpmr
    public final void c(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null language");
    }

    @Override // defpackage.cpmr
    public final cpms a() {
        String str = this.a == null ? " addressLabelVisible" : "";
        if (this.b == null) {
            str = str.concat(" autocompleteRightPadding");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" language");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cpmq(this.a.booleanValue(), this.b.intValue(), this.c);
    }
}
