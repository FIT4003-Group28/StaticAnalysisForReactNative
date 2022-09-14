package defpackage;
/* compiled from: PG */
/* renamed from: mzh  reason: default package */
/* loaded from: classes7.dex */
public final class mzh extends mzn {
    private final String a;
    private final String b;
    private final String c;
    private final dpej d;

    public mzh(String str, String str2, String str3, @dzsi dpej dpejVar) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = dpejVar;
                    return;
                }
                throw new NullPointerException("Null secondLine");
            }
            throw new NullPointerException("Null distanceText");
        }
        throw new NullPointerException("Null timeRemainingText");
    }

    @Override // defpackage.mzn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.mzn
    public final String b() {
        return this.b;
    }

    @Override // defpackage.mzn
    public final String c() {
        return this.c;
    }

    @Override // defpackage.mzn
    @dzsi
    public final dpej d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        dpej dpejVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzn) {
            mzn mznVar = (mzn) obj;
            if (this.a.equals(mznVar.a()) && this.b.equals(mznVar.b()) && this.c.equals(mznVar.c()) && ((dpejVar = this.d) != null ? dpejVar.equals(mznVar.d()) : mznVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        dpej dpejVar = this.d;
        return hashCode ^ (dpejVar == null ? 0 : dpejVar.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 82 + length2 + str3.length() + String.valueOf(valueOf).length());
        sb.append("TrafficInformation{timeRemainingText=");
        sb.append(str);
        sb.append(", distanceText=");
        sb.append(str2);
        sb.append(", secondLine=");
        sb.append(str3);
        sb.append(", delayCategory=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
