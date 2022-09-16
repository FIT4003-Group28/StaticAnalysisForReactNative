package defpackage;
/* compiled from: PG */
/* renamed from: aduo  reason: default package */
/* loaded from: classes.dex */
public final class aduo {
    public final String a;
    public final aduh b;

    public aduo(String str, aduh aduhVar) {
        if (str != null) {
            this.a = str;
            this.b = aduhVar;
            return;
        }
        throw new NullPointerException("Null appStatusUri");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aduo) {
            aduo aduoVar = (aduo) obj;
            if (this.a.equals(aduoVar.a) && this.b.equals(aduoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 41 + String.valueOf(valueOf).length());
        sb.append("AuthCodeRequest{appStatusUri=");
        sb.append(str);
        sb.append(", callback=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public aduo() {
    }
}
