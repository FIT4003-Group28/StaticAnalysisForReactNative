package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_ClientVersion  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ClientVersion extends ClientVersion {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public C$AutoValue_ClientVersion(String str, String str2, @dzsi String str3, int i) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                if (i != 0) {
                    this.d = i;
                    return;
                }
                throw new NullPointerException("Null platform");
            }
            throw new NullPointerException("Null clientVersion");
        }
        throw new NullPointerException("Null clientName");
    }

    @Override // com.google.android.libraries.social.populous.core.ClientVersion
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.ClientVersion
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.ClientVersion
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.ClientVersion
    public final cyek d() {
        return new cybw(this);
    }

    @Override // com.google.android.libraries.social.populous.core.ClientVersion
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientVersion) {
            ClientVersion clientVersion = (ClientVersion) obj;
            if (this.a.equals(clientVersion.a()) && this.b.equals(clientVersion.b()) && ((str = this.c) != null ? str.equals(clientVersion.c()) : clientVersion.c() == null) && this.d == clientVersion.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        String str4 = i != 1 ? i != 2 ? i != 3 ? "JRE" : "J2CL" : "GWT" : "ANDROID_LIB";
        StringBuilder sb = new StringBuilder(str.length() + 67 + str2.length() + String.valueOf(str3).length() + str4.length());
        sb.append("ClientVersion{clientName=");
        sb.append(str);
        sb.append(", clientVersion=");
        sb.append(str2);
        sb.append(", packageName=");
        sb.append(str3);
        sb.append(", platform=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
