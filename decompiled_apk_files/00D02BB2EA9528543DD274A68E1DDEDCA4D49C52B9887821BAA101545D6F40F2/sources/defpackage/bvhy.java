package defpackage;
/* compiled from: PG */
/* renamed from: bvhy  reason: default package */
/* loaded from: classes4.dex */
final class bvhy extends bvim {
    private CharSequence a;
    private CharSequence b;
    private cjtd c;
    private Boolean d;
    private Boolean e;
    private Boolean f;

    @Override // defpackage.bvim
    public final void b(CharSequence charSequence) {
        if (charSequence != null) {
            this.a = charSequence;
            return;
        }
        throw new NullPointerException("Null backwardContentDescription");
    }

    @Override // defpackage.bvim
    public final void c(CharSequence charSequence) {
        if (charSequence != null) {
            this.b = charSequence;
            return;
        }
        throw new NullPointerException("Null forwardContentDescription");
    }

    @Override // defpackage.bvim
    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.bvim
    public final void e(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.bvim
    public final void f(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bvim
    public final void g(cjtd cjtdVar) {
        if (cjtdVar != null) {
            this.c = cjtdVar;
            return;
        }
        throw new NullPointerException("Null ue3Params");
    }

    @Override // defpackage.bvim
    public final bvin a() {
        String str = this.a == null ? " backwardContentDescription" : "";
        if (this.b == null) {
            str = str.concat(" forwardContentDescription");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" ue3Params");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" shouldSupportLongPressToPause");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" isSwipeable");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" isImageSlideshowFocusable");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bvhz(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue());
    }
}
