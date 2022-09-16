package defpackage;
/* compiled from: PG */
/* renamed from: ukp  reason: default package */
/* loaded from: classes4.dex */
public final class ukp {
    public final String a;
    private final ukm b;

    public ukp() {
    }

    public ukp(ukm ukmVar, String str) {
        this.b = ukmVar;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ukp) {
            ukp ukpVar = (ukp) obj;
            if (this.b.equals(ukpVar.b)) {
                String str = this.a;
                String str2 = ukpVar.a;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * (-721379959);
        String str = this.a;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.a;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 84 + "null".length() + String.valueOf(str).length());
        sb.append("RingContent{scalableRingDrawableFactory=");
        sb.append(valueOf);
        sb.append(", ringDrawableFactory=");
        sb.append("null");
        sb.append(", contentDescription=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
