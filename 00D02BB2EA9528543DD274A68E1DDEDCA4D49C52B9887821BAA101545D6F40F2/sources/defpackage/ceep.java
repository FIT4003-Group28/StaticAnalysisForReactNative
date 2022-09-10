package defpackage;
/* compiled from: PG */
/* renamed from: ceep  reason: default package */
/* loaded from: classes4.dex */
public final class ceep extends ceer {
    public dpyv a;
    public gfw b;
    private dhtc c;
    private drfs d;
    private Boolean e;
    private Boolean f;

    @Override // defpackage.ceer
    public final void b(dhtc dhtcVar) {
        if (dhtcVar != null) {
            this.c = dhtcVar;
            return;
        }
        throw new NullPointerException("Null creatorProfileInfo");
    }

    @Override // defpackage.ceer
    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.ceer
    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.ceer
    public final void e(drfs drfsVar) {
        if (drfsVar != null) {
            this.d = drfsVar;
            return;
        }
        throw new NullPointerException("Null topicFilterSpec");
    }

    @Override // defpackage.ceer
    public final cees a() {
        String str = this.c == null ? " creatorProfileInfo" : "";
        if (this.d == null) {
            str = str.concat(" topicFilterSpec");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" preExpandReviewsTopicCarousel");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" preloadProfileMainPage");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ceeq(this.c, this.a, this.b, this.d, this.e.booleanValue(), this.f.booleanValue());
    }
}
