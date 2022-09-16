package defpackage;
/* compiled from: PG */
/* renamed from: xhh  reason: default package */
/* loaded from: classes4.dex */
public final class xhh {
    private auwo a;
    private xho b;
    private wzr c;
    private Integer d;
    private Boolean e;
    private Float f;
    private Integer g;
    private Integer h;
    private xdb i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Float n;
    private Integer o;

    public final void b(wzr wzrVar) {
        if (wzrVar != null) {
            this.c = wzrVar;
            return;
        }
        throw new NullPointerException("Null adCountMetadata");
    }

    public final void c(xdb xdbVar) {
        if (xdbVar != null) {
            this.i = xdbVar;
            return;
        }
        throw new NullPointerException("Null breakType");
    }

    public final void d(xho xhoVar) {
        if (xhoVar != null) {
            this.b = xhoVar;
            return;
        }
        throw new NullPointerException("Null contentMetadata");
    }

    public final void e(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final void g(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public final void h(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    public final void i(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void j(int i) {
        this.o = Integer.valueOf(i);
    }

    public final void k(float f) {
        this.n = Float.valueOf(f);
    }

    public final void l(auwo auwoVar) {
        if (auwoVar != null) {
            this.a = auwoVar;
            return;
        }
        throw new NullPointerException("Null skipAdRenderer");
    }

    public final void m(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void n(float f) {
        this.f = Float.valueOf(f);
    }

    public final void o(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void p(int i) {
        this.g = Integer.valueOf(i);
    }

    public final xhi a() {
        xho xhoVar;
        wzr wzrVar;
        Integer num;
        auwo auwoVar = this.a;
        if (auwoVar == null || (xhoVar = this.b) == null || (wzrVar = this.c) == null || (num = this.d) == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.o == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" skipAdRenderer");
            }
            if (this.b == null) {
                sb.append(" contentMetadata");
            }
            if (this.c == null) {
                sb.append(" adCountMetadata");
            }
            if (this.d == null) {
                sb.append(" skipState");
            }
            if (this.e == null) {
                sb.append(" hidden");
            }
            if (this.f == null) {
                sb.append(" swipeToSkipProgress");
            }
            if (this.g == null) {
                sb.append(" timeRemainingUntilSkippableMillis");
            }
            if (this.h == null) {
                sb.append(" timeRemainingInAdMillis");
            }
            if (this.i == null) {
                sb.append(" breakType");
            }
            if (this.j == null) {
                sb.append(" DRCtaEnabled");
            }
            if (this.k == null) {
                sb.append(" fullscreen");
            }
            if (this.l == null) {
                sb.append(" countdownOnThumbnail");
            }
            if (this.m == null) {
                sb.append(" countdownNextToThumbnail");
            }
            if (this.n == null) {
                sb.append(" preskipScalingFactor");
            }
            if (this.o == null) {
                sb.append(" preskipPadding");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xhi(auwoVar, xhoVar, wzrVar, num.intValue(), this.e.booleanValue(), this.f.floatValue(), this.g.intValue(), this.h.intValue(), this.i, this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.floatValue(), this.o.intValue());
    }
}
