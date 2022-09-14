package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Phone  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Phone extends Phone {
    public final CharSequence a;
    public final CharSequence b;
    public final PersonFieldMetadata c;

    public C$AutoValue_Phone(CharSequence charSequence, @dzsi CharSequence charSequence2, PersonFieldMetadata personFieldMetadata) {
        if (charSequence != null) {
            this.a = charSequence;
            this.b = charSequence2;
            if (personFieldMetadata != null) {
                this.c = personFieldMetadata;
                return;
            }
            throw new NullPointerException("Null metadata");
        }
        throw new NullPointerException("Null value");
    }

    @Override // com.google.android.libraries.social.populous.core.Phone, com.google.android.libraries.social.populous.core.ContactMethodField
    public final CharSequence a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.Phone, com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyft
    public final PersonFieldMetadata b() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.Phone
    @dzsi
    public final CharSequence d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Phone) {
            Phone phone = (Phone) obj;
            if (this.a.equals(phone.a()) && ((charSequence = this.b) != null ? charSequence.equals(phone.d()) : phone.d() == null) && this.c.equals(phone.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        CharSequence charSequence = this.b;
        return ((hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = (String) charSequence;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 41 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Phone{value=");
        sb.append(str);
        sb.append(", canonicalValue=");
        sb.append(valueOf);
        sb.append(", metadata=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
