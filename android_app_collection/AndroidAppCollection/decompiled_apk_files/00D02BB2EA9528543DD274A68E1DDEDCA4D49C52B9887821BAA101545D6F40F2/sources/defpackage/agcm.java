package defpackage;
/* compiled from: PG */
/* renamed from: agcm  reason: default package */
/* loaded from: classes2.dex */
final class agcm extends agrd {
    public Object a;
    private Boolean b;
    private Boolean c;
    private Float d;
    private Integer e;
    private Integer f;
    private Integer g;

    @Override // defpackage.agrd
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.agrd
    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.agrd
    public final void d(float f) {
        this.d = Float.valueOf(f);
    }

    @Override // defpackage.agrd
    public final void e(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.agrd
    public final void f(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.agrd
    public final void g(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.agrd
    public final agre a() {
        String str = this.b == null ? " fillParentWidth" : "";
        if (this.c == null) {
            str = str.concat(" fillParentHeight");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" layoutWeight");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" marginTopDp");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" marginBottomDp");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" marginEndDp");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new agcn(this.b.booleanValue(), this.c.booleanValue(), this.d.floatValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.a);
    }
}
