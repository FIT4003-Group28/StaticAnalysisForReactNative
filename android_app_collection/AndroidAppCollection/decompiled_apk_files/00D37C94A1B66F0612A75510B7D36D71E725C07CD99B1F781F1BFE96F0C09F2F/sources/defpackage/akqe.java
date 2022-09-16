package defpackage;
/* compiled from: PG */
/* renamed from: akqe  reason: default package */
/* loaded from: classes.dex */
public final class akqe {
    public final String a;
    public final String b;
    public final String c;

    public akqe() {
    }

    public akqe(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static akqe a(String str, String str2, String str3) {
        aqxo.u(!"AppGlobalScope".equals(str), "userId cannot be %s. Use createAppGlobalKey to generate an app scoped key.", "AppGlobalScope");
        aqxo.u(!"SignedOutID".equals(str), "userId cannot be %s. Use createSignedOutUserKey to generate a key for signed out user.", "SignedOutID");
        return c(str, str2, str3);
    }

    public static akqe b(String str, String str2) {
        return c("SignedOutID", str, str2);
    }

    private static akqe c(String str, String str2, String str3) {
        String str4;
        String str5;
        akqd akqdVar = new akqd();
        akqdVar.a = str2;
        if (str3 != null) {
            akqdVar.c = str3;
            akqdVar.b = str;
            String str6 = akqdVar.a;
            if (str6 == null || (str4 = akqdVar.b) == null || (str5 = akqdVar.c) == null) {
                StringBuilder sb = new StringBuilder();
                if (akqdVar.a == null) {
                    sb.append(" namespace");
                }
                if (akqdVar.b == null) {
                    sb.append(" userId");
                }
                if (akqdVar.c == null) {
                    sb.append(" key");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            akqe akqeVar = new akqe(str6, str4, str5);
            aqxo.q(!akqeVar.b.isEmpty(), "userId cannot be empty");
            aqxo.q(!akqeVar.c.isEmpty(), "Key cannot be empty.");
            aqxo.q(!akqeVar.a.isEmpty(), "namespace cannot be empty.");
            return akqeVar;
        }
        throw new NullPointerException("Null key");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akqe) {
            akqe akqeVar = (akqe) obj;
            if (this.a.equals(akqeVar.a) && this.b.equals(akqeVar.b) && this.c.equals(akqeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 41 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("BlobStorageKey{namespace=");
        sb.append(str);
        sb.append(", userId=");
        sb.append(str2);
        sb.append(", key=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
