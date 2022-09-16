package defpackage;
/* compiled from: PG */
/* renamed from: xhc  reason: default package */
/* loaded from: classes4.dex */
public final class xhc {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final apnr f;
    public final int g;

    public xhc() {
    }

    public xhc(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, apnr apnrVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.g = i;
        this.f = apnrVar;
    }

    public static xhb b() {
        xhb xhbVar = new xhb();
        xhbVar.g(true);
        xhbVar.e(false);
        xhbVar.c(false);
        xhbVar.d(false);
        xhbVar.f(false);
        xhbVar.b(1);
        xhbVar.h(apnr.a);
        return xhbVar;
    }

    public final xhb a() {
        xhb b = b();
        b.g(this.a);
        b.e(this.b);
        b.c(this.c);
        b.d(this.d);
        b.f(this.e);
        b.b(this.g);
        b.h(this.f);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xhc) {
            xhc xhcVar = (xhc) obj;
            if (this.a == xhcVar.a && this.b == xhcVar.b && this.c == xhcVar.c && this.d == xhcVar.d && this.e == xhcVar.e) {
                int i = this.g;
                int i2 = xhcVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.f.equals(xhcVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        int i4 = this.g;
        if (i4 != 0) {
            return ((i3 ^ i4) * 1000003) ^ this.f.hashCode();
        }
        throw null;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        int i = this.g;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "DISLIKE" : "LIKE" : "NONE";
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(str.length() + 142 + String.valueOf(valueOf).length());
        sb.append("BrandInteractionState{hidden=");
        sb.append(z);
        sb.append(", enabled=");
        sb.append(z2);
        sb.append(", annotationEnabled=");
        sb.append(z3);
        sb.append(", appPromoEnabled=");
        sb.append(z4);
        sb.append(", fullscreen=");
        sb.append(z5);
        sb.append(", activeButton=");
        sb.append(str);
        sb.append(", renderer=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
