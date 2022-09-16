package defpackage;
/* compiled from: PG */
/* renamed from: amcc  reason: default package */
/* loaded from: classes.dex */
public final class amcc {
    public final String a;
    public final amca b;

    public amcc() {
    }

    public amcc(String str, amca amcaVar) {
        this.a = str;
        this.b = amcaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amcc) {
            amcc amccVar = (amcc) obj;
            if (this.a.equals(amccVar.a) && this.b.equals(amccVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(valueOf).length());
        sb.append("AccountProviderConfig{type=");
        sb.append(str);
        sb.append(", provider=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
