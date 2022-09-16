package defpackage;
/* compiled from: PG */
/* renamed from: dezw  reason: default package */
/* loaded from: classes6.dex */
final class dezw extends dfas {
    private final String a;
    private final dexa b;
    private final String c;

    public dezw(String str, @dzsi dexa dexaVar, String str2) {
        if (str != null) {
            this.a = str;
            this.b = dexaVar;
            this.c = str2;
            return;
        }
        throw new NullPointerException("Null endpoint");
    }

    @Override // defpackage.dfas
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dfas
    @dzsi
    public final dexa b() {
        return this.b;
    }

    @Override // defpackage.dfas
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        dexa dexaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfas) {
            dfas dfasVar = (dfas) obj;
            if (this.a.equals(dfasVar.a()) && ((dexaVar = this.b) != null ? dexaVar.equals(dfasVar.b()) : dfasVar.b() == null) && this.c.equals(dfasVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dexa dexaVar = this.b;
        return ((hashCode ^ (dexaVar == null ? 0 : dexaVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 51 + String.valueOf(valueOf).length() + str2.length());
        sb.append("InterceptorId{endpoint=");
        sb.append(str);
        sb.append(", authContext=");
        sb.append(valueOf);
        sb.append(", methodName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
