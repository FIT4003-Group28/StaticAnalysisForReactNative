package defpackage;
/* compiled from: PG */
/* renamed from: cvgo  reason: default package */
/* loaded from: classes5.dex */
public final class cvgo extends cvgp {
    private final String a;
    private final int b;
    private final int c;

    public cvgo(String str, int i, int i2) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.cvgp
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cvgp
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cvgp
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvgp) {
            cvgp cvgpVar = (cvgp) obj;
            if (this.a.equals(cvgpVar.a()) && this.b == cvgpVar.b() && this.c == cvgpVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 73);
        sb.append("InputVectorSpecification{name=");
        sb.append(str);
        sb.append(", length=");
        sb.append(i);
        sb.append(", bitWidth=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
