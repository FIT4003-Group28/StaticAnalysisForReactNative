package defpackage;
/* compiled from: PG */
/* renamed from: cvkw  reason: default package */
/* loaded from: classes5.dex */
final class cvkw extends cvkz {
    public final String a;
    public final int b;
    private final String c;
    private final int d;
    private final int e;

    public cvkw(@dzsi String str, @dzsi int i, @dzsi int i2, @dzsi int i3, @dzsi String str2) {
        this.c = str;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.a = str2;
    }

    @Override // defpackage.cvkz
    @dzsi
    public final String a() {
        return this.c;
    }

    @Override // defpackage.cvkz
    @dzsi
    public final String b() {
        return this.a;
    }

    @Override // defpackage.cvkz
    @dzsi
    public final int c() {
        return this.b;
    }

    @Override // defpackage.cvkz
    @dzsi
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cvkz
    @dzsi
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvkz) {
            cvkz cvkzVar = (cvkz) obj;
            String str = this.c;
            if (str != null ? str.equals(cvkzVar.a()) : cvkzVar.a() == null) {
                int i = this.b;
                if (i != 0 ? i == cvkzVar.c() : cvkzVar.c() == 0) {
                    int i2 = this.d;
                    if (i2 != 0 ? i2 == cvkzVar.d() : cvkzVar.d() == 0) {
                        int i3 = this.e;
                        if (i3 != 0 ? i3 == cvkzVar.e() : cvkzVar.e() == 0) {
                            String str2 = this.a;
                            if (str2 != null ? str2.equals(cvkzVar.b()) : cvkzVar.b() == null) {
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
        String str = this.c;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        int i2 = this.b;
        if (i2 == 0) {
            i2 = 0;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        int i4 = this.d;
        if (i4 == 0) {
            i4 = 0;
        }
        int i5 = (i3 ^ i4) * 1000003;
        int i6 = this.e;
        if (i6 == 0) {
            i6 = 0;
        }
        int i7 = (i5 ^ i6) * 1000003;
        String str2 = this.a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i7 ^ i;
    }

    public final String toString() {
        String str = this.c;
        int i = this.b;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "SEND_ERROR" : "SEND_EVENT" : "DELETED" : "MESSAGE" : "MESSAGE_TYPE_UNSPECIFIED";
        String a = cvky.a(this.d);
        String a2 = cvky.a(this.e);
        String str3 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 90 + str2.length() + a.length() + a2.length() + String.valueOf(str3).length());
        sb.append("GcmMessage{messageId=");
        sb.append(str);
        sb.append(", messageType=");
        sb.append(str2);
        sb.append(", priorityOriginal=");
        sb.append(a);
        sb.append(", priorityDelivered=");
        sb.append(a2);
        sb.append(", chimePayload=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
