package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ifg  reason: default package */
/* loaded from: classes.dex */
public final class ifg extends igt {
    public iuv a;
    public cqtv b;
    public cqtv c;
    public iuv d;
    public cqtv e;
    public cqtv f;
    private cqtv g;
    private cqtv h;

    @Override // defpackage.igt
    public final void b(cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.h = cqtvVar;
            return;
        }
        throw new NullPointerException("Null titlePaddingEnd");
    }

    @Override // defpackage.igt
    public final void c(cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.g = cqtvVar;
            return;
        }
        throw new NullPointerException("Null titlePaddingStart");
    }

    @Override // defpackage.igt
    public final igu a() {
        String str = this.g == null ? " titlePaddingStart" : "";
        if (this.h == null) {
            str = str.concat(" titlePaddingEnd");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" actionIconTintColor");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" actionIconPaddingStart");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" actionIconPaddingEnd");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" actionLabelColor");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" actionLabelPaddingStart");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" actionLabelPaddingEnd");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ifh(this.g, this.h, this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
