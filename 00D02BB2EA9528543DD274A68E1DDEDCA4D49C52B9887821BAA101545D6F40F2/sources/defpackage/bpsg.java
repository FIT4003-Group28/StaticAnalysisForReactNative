package defpackage;
/* compiled from: PG */
/* renamed from: bpsg  reason: default package */
/* loaded from: classes4.dex */
final class bpsg extends bpsv {
    private final String a;
    private final String b;
    private final dbsg<akqq> c;
    private final String d;

    public bpsg(String str, String str2, dbsg<akqq> dbsgVar, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = dbsgVar;
                if (str3 != null) {
                    this.d = str3;
                    return;
                }
                throw new NullPointerException("Null singleLineAddress");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.bpsv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bpsv
    public final String b() {
        return this.b;
    }

    @Override // defpackage.bpsv
    public final dbsg<akqq> c() {
        return this.c;
    }

    @Override // defpackage.bpsv
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpsv) {
            bpsv bpsvVar = (bpsv) obj;
            if (this.a.equals(bpsvVar.a()) && this.b.equals(bpsvVar.b()) && this.c.equals(bpsvVar.c()) && this.d.equals(bpsvVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String str3 = this.d;
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 58 + length2 + String.valueOf(valueOf).length() + str3.length());
        sb.append("RapFeature{featureId=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", latLng=");
        sb.append(valueOf);
        sb.append(", singleLineAddress=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
