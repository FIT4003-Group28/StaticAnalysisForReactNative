package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnim  reason: default package */
/* loaded from: classes3.dex */
public final class bnim extends bnjc {
    private Integer a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;

    @Override // defpackage.bnjc
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.bnjc
    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.bnjc
    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.bnjc
    public final void e(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bnjc
    public final void f(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.bnjc
    public final void g(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.bnjc
    public final void h(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.bnjc
    public final bnjd a() {
        String str = this.a == null ? " maxLines" : "";
        if (this.b == null) {
            str = str.concat(" isVisited");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" isVisitHistorySearch");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" shouldForceHideListAnnotations");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" shouldUseRankedAnnotations");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" shouldUsePhotoTiles");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" shouldUsePersonalScoreJustifications");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bnin(this.a.intValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue());
    }
}
