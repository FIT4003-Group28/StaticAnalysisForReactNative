package defpackage;
/* compiled from: PG */
/* renamed from: afig  reason: default package */
/* loaded from: classes2.dex */
public final class afig extends afir {
    public final String a;
    public final boolean b;

    public afig(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null filename");
    }

    @Override // defpackage.afir
    public final String a() {
        return this.a;
    }

    @Override // defpackage.afir
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afir) {
            afir afirVar = (afir) obj;
            if (this.a.equals(afirVar.a()) && this.b == afirVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Values{filename=");
        sb.append(str);
        sb.append(", shouldPreserveActivity=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
