package com.google.android.libraries.social.populous;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.$AutoValue_PersonMetadata  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_PersonMetadata extends PersonMetadata {
    public final String a;
    public final IdentityInfo b;
    public final int c;

    public C$AutoValue_PersonMetadata(@dzsi String str, @dzsi IdentityInfo identityInfo, int i) {
        this.a = str;
        this.b = identityInfo;
        if (i != 0) {
            this.c = i;
            return;
        }
        throw new NullPointerException("Null autocompletionType");
    }

    @Override // com.google.android.libraries.social.populous.PersonMetadata
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.PersonMetadata
    @dzsi
    public final IdentityInfo b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.PersonMetadata
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersonMetadata) {
            PersonMetadata personMetadata = (PersonMetadata) obj;
            String str = this.a;
            if (str != null ? str.equals(personMetadata.a()) : personMetadata.a() == null) {
                IdentityInfo identityInfo = this.b;
                if (identityInfo != null ? identityInfo.equals(personMetadata.b()) : personMetadata.b() == null) {
                    if (this.c == personMetadata.c()) {
                        return true;
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
        IdentityInfo identityInfo = this.b;
        if (identityInfo != null) {
            i = identityInfo.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        String str2 = i != 1 ? i != 2 ? "GOOGLE_GROUP" : "PERSON" : "UNSPECIFIED";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60 + String.valueOf(valueOf).length() + str2.length());
        sb.append("PersonMetadata{ownerId=");
        sb.append(str);
        sb.append(", identityInfo=");
        sb.append(valueOf);
        sb.append(", autocompletionType=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
