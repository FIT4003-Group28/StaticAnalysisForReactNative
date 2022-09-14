package defpackage;
/* compiled from: PG */
/* renamed from: bbsj  reason: default package */
/* loaded from: classes3.dex */
public final class bbsj extends bbtr {
    public bbuy a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public String f;
    public aojq g;
    private Boolean h;
    private int i;

    @Override // defpackage.bbtr
    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtr
    public final void c() {
        this.i = 2;
    }

    @Override // defpackage.bbtr
    public final bbts a() {
        String str = this.a == null ? " afterUploadBehavior" : "";
        if (this.i == 0) {
            str = str.concat(" nextButtonBehavior");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" isSinglePhotoCaptureEnabled");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" isGalleryEnabled");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" isEditCaptionEnabled");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" isVideoRecordingEnabled");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" hidePhotosFromMediaScanners");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbsk(this.a, this.i, this.b, this.c, this.d, this.e, this.f, this.g, this.h.booleanValue());
    }
}
