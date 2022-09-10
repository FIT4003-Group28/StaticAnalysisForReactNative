package defpackage;
/* compiled from: PG */
/* renamed from: bfkb  reason: default package */
/* loaded from: classes3.dex */
public final class bfkb extends bfkd {
    public ddho a;
    public ddho b;
    public ddho c;
    public ddho d;
    public ddho e;
    private Boolean f;

    public bfkb() {
    }

    public bfkb(bfke bfkeVar) {
        bfkc bfkcVar = (bfkc) bfkeVar;
        this.a = bfkcVar.a;
        this.b = bfkcVar.b;
        this.c = bfkcVar.c;
        this.d = bfkcVar.d;
        this.e = bfkcVar.e;
        this.f = Boolean.valueOf(bfkcVar.f);
    }

    @Override // defpackage.bfkd
    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.bfkd
    public final void c(ddho ddhoVar) {
        this.a = ddhoVar;
    }

    @Override // defpackage.bfkd
    public final void d(ddho ddhoVar) {
        this.b = ddhoVar;
    }

    @Override // defpackage.bfkd
    public final bfke a() {
        String str = this.a == null ? " photoCarouselVe" : "";
        if (this.b == null) {
            str = str.concat(" photoVe");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" addAPhotoVe");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" morePhotosVe");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" panoPhotoVe");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" allowPanoPhotoVe");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bfkc(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue());
    }
}
