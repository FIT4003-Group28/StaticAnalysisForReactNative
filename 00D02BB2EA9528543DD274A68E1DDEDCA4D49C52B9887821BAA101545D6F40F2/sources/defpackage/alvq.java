package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alvq  reason: default package */
/* loaded from: classes.dex */
public final class alvq extends alyc {
    private Integer a;
    private alxl b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Float f;
    private Float g;
    private Float h;
    private Integer i;
    private Integer j;
    private Integer k;
    private Float l;
    private dcdc<dmlo> m;
    private Boolean n;
    private Boolean o;
    private int p;

    @Override // defpackage.alyc
    public final int a() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"dropShadowMajorAxisOffset\" has not been set");
    }

    @Override // defpackage.alyc
    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"dropShadowMinorAxisOffset\" has not been set");
    }

    @Override // defpackage.alyc
    public final float c() {
        Float f = this.f;
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalStateException("Property \"dropShadowBlurRadius\" has not been set");
    }

    @Override // defpackage.alyc
    public final float d() {
        Float f = this.g;
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalStateException("Property \"majorAxisPadding\" has not been set");
    }

    @Override // defpackage.alyc
    public final float e() {
        Float f = this.h;
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalStateException("Property \"minorAxisPadding\" has not been set");
    }

    @Override // defpackage.alyc
    public final int f() {
        Integer num = this.i;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"caretHeight\" has not been set");
    }

    @Override // defpackage.alyc
    public final int g() {
        Integer num = this.j;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"caretHeightCorner\" has not been set");
    }

    @Override // defpackage.alyc
    public final int h() {
        Integer num = this.k;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Property \"caretCornerOffsetDistance\" has not been set");
    }

    @Override // defpackage.alyc
    public final float i() {
        Float f = this.l;
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalStateException("Property \"cornerRadius\" has not been set");
    }

    @Override // defpackage.alyc
    public final void k(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.alyc
    public final void l(int i) {
        this.k = Integer.valueOf(i);
    }

    @Override // defpackage.alyc
    public final void m(int i) {
        this.i = Integer.valueOf(i);
    }

    @Override // defpackage.alyc
    public final void n(int i) {
        this.j = Integer.valueOf(i);
    }

    @Override // defpackage.alyc
    public final void o(float f) {
        this.l = Float.valueOf(f);
    }

    @Override // defpackage.alyc
    public final void p(float f) {
        this.f = Float.valueOf(f);
    }

    @Override // defpackage.alyc
    public final void q(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.alyc
    public final void r(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.alyc
    public final void s(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.alyc
    public final void t(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.alyc
    public final void u(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.alyc
    public final void v(float f) {
        this.g = Float.valueOf(f);
    }

    @Override // defpackage.alyc
    public final void w(float f) {
        this.h = Float.valueOf(f);
    }

    @Override // defpackage.alyc
    public final void x(alxl alxlVar) {
        if (alxlVar != null) {
            this.b = alxlVar;
            return;
        }
        throw new NullPointerException("Null outline");
    }

    @Override // defpackage.alyc
    public final void y(dcdc<dmlo> dcdcVar) {
        if (dcdcVar != null) {
            this.m = dcdcVar;
            return;
        }
        throw new NullPointerException("Null supportedAnchorPoints");
    }

    @Override // defpackage.alyc
    public final void z(int i) {
        if (i != 0) {
            this.p = i;
            return;
        }
        throw new NullPointerException("Null shapeType");
    }

    @Override // defpackage.alyc
    public final alyd j() {
        String str = this.a == null ? " fillColor" : "";
        if (this.b == null) {
            str = str.concat(" outline");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" dropShadowMajorAxisOffset");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" dropShadowMinorAxisOffset");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" dropShadowColor");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" dropShadowBlurRadius");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" majorAxisPadding");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" minorAxisPadding");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" caretHeight");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" caretHeightCorner");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" caretCornerOffsetDistance");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" cornerRadius");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" supportedAnchorPoints");
        }
        if (this.p == 0) {
            str = String.valueOf(str).concat(" shapeType");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" allowIconNestling");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" isRasterBox");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new alvr(this.a.intValue(), this.b, this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.floatValue(), this.g.floatValue(), this.h.floatValue(), this.i.intValue(), this.j.intValue(), this.k.intValue(), this.l.floatValue(), this.m, this.p, this.n.booleanValue(), this.o.booleanValue());
    }
}
