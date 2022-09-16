package defpackage;
/* compiled from: PG */
/* renamed from: ahuc  reason: default package */
/* loaded from: classes.dex */
public final class ahuc {
    public final String a;
    public final acup b;

    public ahuc() {
    }

    public ahuc(String str, acup acupVar) {
        this.a = str;
        this.b = acupVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahuc) {
            ahuc ahucVar = (ahuc) obj;
            String str = this.a;
            if (str != null ? str.equals(ahucVar.a) : ahucVar.a == null) {
                if (this.b.equals(ahucVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.a;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48 + String.valueOf(valueOf).length());
        sb.append("WatchScreenParentInfo{parentCsn=");
        sb.append(str);
        sb.append(", parentVeType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
