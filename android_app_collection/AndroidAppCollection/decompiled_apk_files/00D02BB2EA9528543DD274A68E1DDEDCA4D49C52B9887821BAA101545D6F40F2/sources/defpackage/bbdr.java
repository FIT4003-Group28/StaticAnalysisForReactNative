package defpackage;
/* compiled from: PG */
/* renamed from: bbdr  reason: default package */
/* loaded from: classes3.dex */
public final class bbdr extends bbdw {
    public bwrs<ilo> a;
    private Boolean b;
    private Boolean c;
    private Boolean d;

    @Override // defpackage.bbdw
    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bbdw
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.bbdw
    public final void d(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.bbdw
    public final bbdx a() {
        String str = this.a == null ? " placemark" : "";
        if (this.b == null) {
            str = str.concat(" filterPlaceSentimentFeedback");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" enablePersonalizationFeedback");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" enableDiningPreferencesOption");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbds(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue());
    }
}
