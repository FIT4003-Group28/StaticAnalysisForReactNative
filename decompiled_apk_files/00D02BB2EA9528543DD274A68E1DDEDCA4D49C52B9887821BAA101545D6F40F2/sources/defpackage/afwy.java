package defpackage;
/* compiled from: PG */
/* renamed from: afwy  reason: default package */
/* loaded from: classes2.dex */
final class afwy extends afya {
    public int a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private afyc f;

    @Override // defpackage.afya
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.afya
    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.afya
    public final void d(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.afya
    public final void e(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.afya
    public final void f(int i) {
        this.a = i;
    }

    @Override // defpackage.afya
    public final void g(afyc afycVar) {
        if (afycVar != null) {
            this.f = afycVar;
            return;
        }
        throw new NullPointerException("Null lensPhotoEntryPoint");
    }

    @Override // defpackage.afya
    public final afyb a() {
        String str = this.b == null ? " enableLensIcon" : "";
        if (this.a == 0) {
            str = str.concat(" lensIconFilter");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" enableLensTranslateSuggestionAction");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" enableLensSearchDishSuggestionAction");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" enableLensSearchPlacesSuggestionAction");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" lensPhotoEntryPoint");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new afwz(this.b.booleanValue(), this.a, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f);
    }
}
