package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Name  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Name extends Name {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final PersonFieldMetadata e;

    public C$AutoValue_Name(CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi CharSequence charSequence3, CharSequence charSequence4, PersonFieldMetadata personFieldMetadata) {
        if (charSequence != null) {
            this.a = charSequence;
            this.b = charSequence2;
            this.c = charSequence3;
            if (charSequence4 != null) {
                this.d = charSequence4;
                if (personFieldMetadata != null) {
                    this.e = personFieldMetadata;
                    return;
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null label");
        }
        throw new NullPointerException("Null displayName");
    }

    @Override // com.google.android.libraries.social.populous.core.Name
    public final CharSequence a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.Name, defpackage.cyft
    public final PersonFieldMetadata b() {
        return this.e;
    }

    @Override // com.google.android.libraries.social.populous.core.Name
    @dzsi
    public final CharSequence c() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.Name
    @dzsi
    public final CharSequence d() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.Name
    public final CharSequence e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Name) {
            Name name = (Name) obj;
            if (this.a.equals(name.a()) && ((charSequence = this.b) != null ? charSequence.equals(name.c()) : name.c() == null) && ((charSequence2 = this.c) != null ? charSequence2.equals(name.d()) : name.d() == null) && this.d.equals(name.e()) && this.e.equals(name.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        CharSequence charSequence = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        CharSequence charSequence2 = this.c;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        CharSequence charSequence2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        String str = (String) charSequence;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        String str2 = (String) charSequence2;
        StringBuilder sb = new StringBuilder(length + 62 + length2 + length3 + str2.length() + String.valueOf(valueOf3).length());
        sb.append("Name{displayName=");
        sb.append(str);
        sb.append(", givenName=");
        sb.append(valueOf);
        sb.append(", familyName=");
        sb.append(valueOf2);
        sb.append(", label=");
        sb.append(str2);
        sb.append(", metadata=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
