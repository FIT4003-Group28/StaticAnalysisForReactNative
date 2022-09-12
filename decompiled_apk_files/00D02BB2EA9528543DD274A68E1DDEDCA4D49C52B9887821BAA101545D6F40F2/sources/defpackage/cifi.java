package defpackage;
/* compiled from: PG */
/* renamed from: cifi  reason: default package */
/* loaded from: classes4.dex */
final class cifi extends cifr {
    private final String a;
    private final String b;
    private final String c;

    public cifi(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null hours");
            }
            throw new NullPointerException("Null dayDescription");
        }
        throw new NullPointerException("Null day");
    }

    @Override // defpackage.cifr
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cifr
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cifr
    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cifr) {
            cifr cifrVar = (cifr) obj;
            if (this.a.equals(cifrVar.a()) && this.b.equals(cifrVar.b()) && this.c.equals(cifrVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 60 + str2.length() + str3.length());
        sb.append("OpeningHoursItemViewModelImpl{day=");
        sb.append(str);
        sb.append(", dayDescription=");
        sb.append(str2);
        sb.append(", hours=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
