package defpackage;
/* compiled from: PG */
/* renamed from: bpcv  reason: default package */
/* loaded from: classes3.dex */
final class bpcv extends bpde {
    private final String a;
    private final String b;

    public bpcv(String str, @dzsi String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.bpde
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bpde
    @dzsi
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpde) {
            bpde bpdeVar = (bpde) obj;
            if (this.a.equals(bpdeVar.a()) && ((str = this.b) != null ? str.equals(bpdeVar.b()) : bpdeVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 28 + String.valueOf(str2).length());
        sb.append("SuboptionData{text=");
        sb.append(str);
        sb.append(", value=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
