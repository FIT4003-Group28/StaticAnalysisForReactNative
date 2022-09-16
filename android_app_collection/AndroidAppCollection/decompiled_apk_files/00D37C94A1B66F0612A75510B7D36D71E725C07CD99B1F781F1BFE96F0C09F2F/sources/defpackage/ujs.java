package defpackage;
/* compiled from: PG */
/* renamed from: ujs  reason: default package */
/* loaded from: classes4.dex */
public final class ujs {
    public final boolean a;
    private final int b;

    public ujs() {
    }

    public ujs(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujs) {
            ujs ujsVar = (ujs) obj;
            if (this.a == ujsVar.a) {
                int i = this.b;
                int i2 = ujsVar.b;
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
        int i = true != this.a ? 1237 : 1231;
        int i2 = this.b;
        ujr.b(i2);
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        boolean z = this.a;
        String a = ujr.a(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 47);
        sb.append("GaiaAccountData{isG1User=");
        sb.append(z);
        sb.append(", isUnicornUser=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
