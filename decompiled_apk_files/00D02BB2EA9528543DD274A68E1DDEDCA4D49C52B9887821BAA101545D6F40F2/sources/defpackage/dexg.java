package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dexg  reason: default package */
/* loaded from: classes6.dex */
public final class dexg extends dexa {
    private final String b;
    private final String c = "google";

    public dexg(@dzsi String str) {
        this.b = str;
    }

    @Override // defpackage.dexa
    @dzsi
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dexa
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dexa) {
            dexa dexaVar = (dexa) obj;
            String str = this.b;
            if (str != null ? str.equals(dexaVar.a()) : dexaVar.a() == null) {
                if (this.c.equals(dexaVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31 + str2.length());
        sb.append("AuthContext{identifier=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
