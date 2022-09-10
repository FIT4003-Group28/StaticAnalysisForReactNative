package defpackage;
/* compiled from: PG */
/* renamed from: afdo  reason: default package */
/* loaded from: classes2.dex */
public final class afdo extends afdr {
    public Integer a;
    public dktk b;
    private Integer c;
    private Integer d;
    private Boolean e;
    private Integer f;
    private afds g;
    private Boolean h;

    @Override // defpackage.afdr
    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.afdr
    public final void c(afds afdsVar) {
        if (afdsVar != null) {
            this.g = afdsVar;
            return;
        }
        throw new NullPointerException("Null onDisableIncognitoCallback");
    }

    @Override // defpackage.afdr
    public final void d(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.afdr
    public final void e(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.afdr
    public final void f(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.afdr
    public final void g(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.afdr
    public final afdt a() {
        String str = this.c == null ? " titleResId" : "";
        if (this.d == null) {
            str = str.concat(" titleContentDescriptionResId");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" showToolbarNavigationButton");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" bodyResId");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" buttonTextResId");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" onDisableIncognitoCallback");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" searchboxEnabled");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new afdp(this.c.intValue(), this.d.intValue(), this.e.booleanValue(), this.f.intValue(), this.a.intValue(), this.g, this.b, this.h.booleanValue());
    }
}
