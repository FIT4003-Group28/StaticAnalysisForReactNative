package defpackage;
/* compiled from: PG */
/* renamed from: ucc  reason: default package */
/* loaded from: classes4.dex */
public final class ucc {
    public final uce a;
    public final int b;

    public ucc() {
    }

    public ucc(uce uceVar, int i) {
        this.a = uceVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucc) {
            ucc uccVar = (ucc) obj;
            if (this.a.equals(uccVar.a)) {
                int i = this.b;
                int i2 = uccVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.b;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "NOTIFY" : "DROP" : "UNKNOWN_PREFERENCE";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + str.length());
        sb.append("PreferenceEntry{preferenceKey=");
        sb.append(valueOf);
        sb.append(", preference=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
