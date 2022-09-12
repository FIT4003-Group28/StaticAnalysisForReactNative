package defpackage;
/* compiled from: PG */
/* renamed from: btlr  reason: default package */
/* loaded from: classes4.dex */
public final class btlr extends btlw {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    public btlr(@dzsi String str, @dzsi String str2, @dzsi String str3, @dzsi String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    @Override // defpackage.btlw
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.btlw
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.btlw
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.btlw
    @dzsi
    public final String d() {
        return this.d;
    }

    @Override // defpackage.btlw
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btlw) {
            btlw btlwVar = (btlw) obj;
            String str = this.a;
            if (str != null ? str.equals(btlwVar.a()) : btlwVar.a() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(btlwVar.b()) : btlwVar.b() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(btlwVar.c()) : btlwVar.c() == null) {
                        String str4 = this.d;
                        if (str4 != null ? str4.equals(btlwVar.d()) : btlwVar.d() == null) {
                            if (this.e == btlwVar.e()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        boolean z = this.e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 86 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("OwnerInfo{displayName=");
        sb.append(str);
        sb.append(", givenName=");
        sb.append(str2);
        sb.append(", avatarUrl=");
        sb.append(str3);
        sb.append(", coverImageUrl=");
        sb.append(str4);
        sb.append(", isDasherAccount=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
