package defpackage;
/* compiled from: PG */
/* renamed from: cvud  reason: default package */
/* loaded from: classes5.dex */
public final class cvud extends cvug {
    private final boolean a;
    private final int b;

    public cvud(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.cvug
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cvug
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvug) {
            cvug cvugVar = (cvug) obj;
            if (this.a == cvugVar.a()) {
                int i = this.b;
                int b = cvugVar.b();
                if (i == 0) {
                    throw null;
                }
                if (i == b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ cvuf.b(this.b);
    }

    public final String toString() {
        boolean z = this.a;
        String a = cvuf.a(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 47);
        sb.append("GaiaAccountData{isG1User=");
        sb.append(z);
        sb.append(", isUnicornUser=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
