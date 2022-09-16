package defpackage;
/* compiled from: PG */
/* renamed from: agck  reason: default package */
/* loaded from: classes2.dex */
final class agck extends agoa {
    public Integer a;
    public Boolean b;
    private Boolean c;
    private Integer d;
    private Boolean e;
    private Boolean f;
    private Boolean g;

    @Override // defpackage.agoa
    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.agoa
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.agoa
    public final void d(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.agoa
    public final void e(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.agoa
    public final void f(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.agoa
    public final agob a() {
        String str = this.a == null ? " shortDescriptionMaxLines" : "";
        if (this.c == null) {
            str = str.concat(" showCoverPhoto");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" coverPhotoHeightInDp");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" showEditorialSummary");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" showPlaceRank");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" showSaveButton");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" useFixedLayoutHeight");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new agcl(this.a.intValue(), this.c.booleanValue(), this.d.intValue(), this.e.booleanValue(), this.b.booleanValue(), this.f.booleanValue(), this.g.booleanValue());
    }
}
