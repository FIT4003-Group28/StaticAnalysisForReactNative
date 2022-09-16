package defpackage;
/* compiled from: PG */
/* renamed from: azzx  reason: default package */
/* loaded from: classes3.dex */
public final class azzx extends baag {
    private final String a;
    private final String b;
    private final String c;
    private final dpop d;

    public azzx(String str, String str2, @dzsi String str3, @dzsi dpop dpopVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dpopVar;
    }

    @Override // defpackage.baag
    public final String a() {
        return this.a;
    }

    @Override // defpackage.baag
    public final String b() {
        return this.b;
    }

    @Override // defpackage.baag
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.baag
    @dzsi
    public final dpop d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        dpop dpopVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof baag) {
            baag baagVar = (baag) obj;
            if (this.a.equals(baagVar.a()) && this.b.equals(baagVar.b()) && ((str = this.c) != null ? str.equals(baagVar.c()) : baagVar.c() == null) && ((dpopVar = this.d) != null ? dpopVar.equals(baagVar.d()) : baagVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        dpop dpopVar = this.d;
        if (dpopVar != null && (i = dpopVar.bC) == 0) {
            i = dsst.a.b(dpopVar).c(dpopVar);
            dpopVar.bC = i;
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 57 + length2 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
        sb.append("DealData{dealId=");
        sb.append(str);
        sb.append(", businessName=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", duration=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
