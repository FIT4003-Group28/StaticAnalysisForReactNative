package defpackage;
/* compiled from: PG */
/* renamed from: rhc  reason: default package */
/* loaded from: classes7.dex */
final class rhc extends ril {
    private final String a;
    private final String b;

    public rhc(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null destinationId");
        }
        throw new NullPointerException("Null originId");
    }

    @Override // defpackage.ril
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ril
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ril) {
            ril rilVar = (ril) obj;
            if (this.a.equals(rilVar.a()) && this.b.equals(rilVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 29 + str2.length());
        sb.append("Id{originId=");
        sb.append(str);
        sb.append(", destinationId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
