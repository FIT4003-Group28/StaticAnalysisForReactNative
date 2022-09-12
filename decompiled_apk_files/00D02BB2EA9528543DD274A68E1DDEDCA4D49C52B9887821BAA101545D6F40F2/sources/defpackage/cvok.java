package defpackage;
/* compiled from: PG */
/* renamed from: cvok  reason: default package */
/* loaded from: classes5.dex */
public final class cvok extends cvoo {
    private final String a;
    private final String b;
    private final int c;

    public cvok(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // defpackage.cvoo
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cvoo
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cvoo
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvoo) {
            cvoo cvooVar = (cvoo) obj;
            if (this.a.equals(cvooVar.a()) && this.b.equals(cvooVar.b())) {
                int i = this.c;
                int c = cvooVar.c();
                if (i == 0) {
                    throw null;
                }
                if (i == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.c;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "IMPORTANCE_NONE" : "IMPORTANCE_LOW" : "IMPORTANCE_HIGH" : "IMPORTANCE_DEFAULT" : "IMPORTANCE_UNSPECIFIED";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(str2).length() + str3.length());
        sb.append("ChimeNotificationChannel{id=");
        sb.append(str);
        sb.append(", group=");
        sb.append(str2);
        sb.append(", importance=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
