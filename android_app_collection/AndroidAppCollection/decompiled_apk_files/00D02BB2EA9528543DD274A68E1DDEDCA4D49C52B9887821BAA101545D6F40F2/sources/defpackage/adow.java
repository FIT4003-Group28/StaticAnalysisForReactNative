package defpackage;
/* compiled from: PG */
/* renamed from: adow  reason: default package */
/* loaded from: classes2.dex */
final class adow extends adps {
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Boolean f;
    private Boolean g;

    @Override // defpackage.adps
    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.adps
    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.adps
    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.adps
    public final void e(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.adps
    public final void f(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.adps
    public final void g(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.adps
    public final void h(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.adps
    public final adpt a() {
        String str = this.a == null ? " paddingTopInDp" : "";
        if (this.b == null) {
            str = str.concat(" paddingBottomInDp");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" paddingStartInDp");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" paddingEndInDp");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" marginBetweenTextAndPhotoInDp");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" useFixedLayoutHeight");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" showPlaceImage");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new adox(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.booleanValue(), this.g.booleanValue());
    }
}
