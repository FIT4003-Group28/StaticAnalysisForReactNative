package defpackage;
/* compiled from: PG */
/* renamed from: bczv  reason: default package */
/* loaded from: classes3.dex */
final class bczv extends bczw {
    private final dwfl a;
    private final String b;

    public bczv(dwfl dwflVar, String str) {
        if (dwflVar != null) {
            this.a = dwflVar;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null timestamp");
        }
        throw new NullPointerException("Null photo");
    }

    @Override // defpackage.bczw
    public final dwfl a() {
        return this.a;
    }

    @Override // defpackage.bczw
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczw) {
            bczw bczwVar = (bczw) obj;
            if (this.a.equals(bczwVar.a()) && this.b.equals(bczwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dwfl dwflVar = this.a;
        int i = dwflVar.bC;
        if (i == 0) {
            i = dsst.a.b(dwflVar).c(dwflVar);
            dwflVar.bC = i;
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + str.length());
        sb.append("LightboxItem{photo=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
