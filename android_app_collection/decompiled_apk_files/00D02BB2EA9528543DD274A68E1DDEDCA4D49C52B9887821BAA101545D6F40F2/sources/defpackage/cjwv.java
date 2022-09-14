package defpackage;
/* compiled from: PG */
/* renamed from: cjwv  reason: default package */
/* loaded from: classes4.dex */
public final class cjwv extends cjxi {
    public final String a;
    public final String b;

    public cjwv(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null context");
        }
        throw new NullPointerException("Null code");
    }

    @Override // defpackage.cjxi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cjxi
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjxi) {
            cjxi cjxiVar = (cjxi) obj;
            if (this.a.equals(cjxiVar.a()) && this.b.equals(cjxiVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 35 + str2.length());
        sb.append("PlusCodeAndContext{code=");
        sb.append(str);
        sb.append(", context=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
