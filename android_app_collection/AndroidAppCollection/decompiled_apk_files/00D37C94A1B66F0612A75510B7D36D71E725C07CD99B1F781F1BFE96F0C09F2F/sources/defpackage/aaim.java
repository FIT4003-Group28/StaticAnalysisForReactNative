package defpackage;
/* compiled from: PG */
/* renamed from: aaim  reason: default package */
/* loaded from: classes.dex */
final class aaim {
    public final String a;
    private final String b;

    public aaim() {
    }

    public aaim(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaim) {
            aaim aaimVar = (aaim) obj;
            if (this.a.equals(aaimVar.a) && this.b.equals(aaimVar.b)) {
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
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 49 + str2.length());
        sb.append("IndexFingerprint{indexName=");
        sb.append(str);
        sb.append(", rawCreateStatement=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
