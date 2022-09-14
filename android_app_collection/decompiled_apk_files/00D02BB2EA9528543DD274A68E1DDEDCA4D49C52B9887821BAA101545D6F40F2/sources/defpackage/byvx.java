package defpackage;
/* compiled from: PG */
/* renamed from: byvx  reason: default package */
/* loaded from: classes4.dex */
final class byvx extends bywt {
    private final String a;
    private final dlkp b;

    public byvx(String str, dlkp dlkpVar) {
        if (str != null) {
            this.a = str;
            if (dlkpVar != null) {
                this.b = dlkpVar;
                return;
            }
            throw new NullPointerException("Null vehicleType");
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.bywt
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bywt
    public final dlkp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bywt) {
            bywt bywtVar = (bywt) obj;
            if (this.a.equals(bywtVar.a()) && this.b.equals(bywtVar.b())) {
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
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(valueOf).length());
        sb.append("LineInfo{name=");
        sb.append(str);
        sb.append(", vehicleType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
