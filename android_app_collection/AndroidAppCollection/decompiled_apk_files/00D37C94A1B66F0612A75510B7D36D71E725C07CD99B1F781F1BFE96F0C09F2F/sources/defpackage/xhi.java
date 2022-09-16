package defpackage;
/* compiled from: PG */
/* renamed from: xhi  reason: default package */
/* loaded from: classes4.dex */
public final class xhi {
    public final auwo a;
    public final xho b;
    public final wzr c;
    public final int d;
    public final boolean e;
    public final float f;
    public final int g;
    public final int h;
    public final xdb i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final float n;
    public final int o;

    public xhi() {
    }

    public xhi(auwo auwoVar, xho xhoVar, wzr wzrVar, int i, boolean z, float f, int i2, int i3, xdb xdbVar, boolean z2, boolean z3, boolean z4, boolean z5, float f2, int i4) {
        this.a = auwoVar;
        this.b = xhoVar;
        this.c = wzrVar;
        this.d = i;
        this.e = z;
        this.f = f;
        this.g = i2;
        this.h = i3;
        this.i = xdbVar;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = f2;
        this.o = i4;
    }

    public static xhh b() {
        xhh xhhVar = new xhh();
        xhhVar.l(auwo.a);
        xhhVar.d(xho.a);
        xhhVar.b(wzr.a);
        xhhVar.m(3);
        xhhVar.i(false);
        xhhVar.n(0.0f);
        xhhVar.p(-1);
        xhhVar.o(-1);
        xhhVar.c(xdb.PRE_ROLL);
        xhhVar.g(false);
        xhhVar.h(false);
        xhhVar.f(false);
        xhhVar.e(false);
        xhhVar.k(0.0f);
        xhhVar.j(0);
        return xhhVar;
    }

    public final xhh a() {
        xhh b = b();
        b.l(this.a);
        b.d(this.b);
        b.b(this.c);
        b.m(this.d);
        b.i(this.e);
        b.n(this.f);
        b.p(this.g);
        b.o(this.h);
        b.c(this.i);
        b.g(this.j);
        b.h(this.k);
        b.f(this.l);
        b.e(this.m);
        b.k(this.n);
        b.j(this.o);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xhi) {
            xhi xhiVar = (xhi) obj;
            if (this.a.equals(xhiVar.a) && this.b.equals(xhiVar.b) && this.c.equals(xhiVar.c) && this.d == xhiVar.d && this.e == xhiVar.e && Float.floatToIntBits(this.f) == Float.floatToIntBits(xhiVar.f) && this.g == xhiVar.g && this.h == xhiVar.h && this.i.equals(xhiVar.i) && this.j == xhiVar.j && this.k == xhiVar.k && this.l == xhiVar.l && this.m == xhiVar.m && Float.floatToIntBits(this.n) == Float.floatToIntBits(xhiVar.n) && this.o == xhiVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003;
        if (true == this.m) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ Float.floatToIntBits(this.n)) * 1000003) ^ this.o;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        boolean z = this.e;
        float f = this.f;
        int i2 = this.g;
        int i3 = this.h;
        String valueOf4 = String.valueOf(this.i);
        boolean z2 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        boolean z5 = this.m;
        float f2 = this.n;
        int i4 = this.o;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 402 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SkipButtonState{skipAdRenderer=");
        sb.append(valueOf);
        sb.append(", contentMetadata=");
        sb.append(valueOf2);
        sb.append(", adCountMetadata=");
        sb.append(valueOf3);
        sb.append(", skipState=");
        sb.append(i);
        sb.append(", hidden=");
        sb.append(z);
        sb.append(", swipeToSkipProgress=");
        sb.append(f);
        sb.append(", timeRemainingUntilSkippableMillis=");
        sb.append(i2);
        sb.append(", timeRemainingInAdMillis=");
        sb.append(i3);
        sb.append(", breakType=");
        sb.append(valueOf4);
        sb.append(", DRCtaEnabled=");
        sb.append(z2);
        sb.append(", fullscreen=");
        sb.append(z3);
        sb.append(", countdownOnThumbnail=");
        sb.append(z4);
        sb.append(", countdownNextToThumbnail=");
        sb.append(z5);
        sb.append(", preskipScalingFactor=");
        sb.append(f2);
        sb.append(", preskipPadding=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
