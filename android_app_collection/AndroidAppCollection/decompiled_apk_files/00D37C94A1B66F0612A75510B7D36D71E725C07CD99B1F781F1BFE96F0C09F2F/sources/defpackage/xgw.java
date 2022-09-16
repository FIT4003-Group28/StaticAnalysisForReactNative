package defpackage;
/* compiled from: PG */
/* renamed from: xgw  reason: default package */
/* loaded from: classes4.dex */
public final class xgw {
    public final int a;
    public final boolean b;
    public final wzr c;

    public xgw() {
    }

    public xgw(int i, boolean z, wzr wzrVar) {
        this.a = i;
        this.b = z;
        this.c = wzrVar;
    }

    public static xgv b() {
        xgv xgvVar = new xgv();
        xgvVar.d(-1);
        xgvVar.c(false);
        xgvVar.b(wzr.a);
        return xgvVar;
    }

    public final xgv a() {
        xgv b = b();
        b.d(this.a);
        b.c(this.b);
        b.b(this.c);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgw) {
            xgw xgwVar = (xgw) obj;
            if (this.a == xgwVar.a && this.b == xgwVar.b && this.c.equals(xgwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
        sb.append("AdProgressTextState{timeRemainingMillis=");
        sb.append(i);
        sb.append(", showAdChoices=");
        sb.append(z);
        sb.append(", adCountMetadata=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
