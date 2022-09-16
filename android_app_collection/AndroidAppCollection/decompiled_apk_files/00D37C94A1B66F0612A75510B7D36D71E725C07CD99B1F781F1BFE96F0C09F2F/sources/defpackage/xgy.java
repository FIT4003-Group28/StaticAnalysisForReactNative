package defpackage;
/* compiled from: PG */
/* renamed from: xgy  reason: default package */
/* loaded from: classes4.dex */
public final class xgy {
    public final apoj a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xgy() {
    }

    public xgy(apoj apojVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = apojVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static xgx b() {
        xgx xgxVar = new xgx();
        xgxVar.f(apoj.a);
        xgxVar.d(false);
        xgxVar.e(false);
        xgxVar.b(false);
        xgxVar.c(false);
        return xgxVar;
    }

    public final xgx a() {
        xgx b = b();
        b.f(this.a);
        b.d(this.b);
        b.e(this.c);
        b.b(this.d);
        b.c(this.e);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgy) {
            xgy xgyVar = (xgy) obj;
            if (this.a.equals(xgyVar.a) && this.b == xgyVar.b && this.c == xgyVar.c && this.d == xgyVar.d && this.e == xgyVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 111);
        sb.append("AdReEngagementState{renderer=");
        sb.append(valueOf);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", fullscreen=");
        sb.append(z2);
        sb.append(", annotationEnabled=");
        sb.append(z3);
        sb.append(", appPromoEnabled=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
