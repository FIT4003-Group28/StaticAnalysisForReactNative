package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Email extends Email {
    public final CharSequence a;
    public final PersonFieldMetadata b;
    public final Email.ExtendedData c;
    public final dcdc<Email.Certificate> d;

    public C$AutoValue_Email(CharSequence charSequence, PersonFieldMetadata personFieldMetadata, @dzsi Email.ExtendedData extendedData, dcdc<Email.Certificate> dcdcVar) {
        if (charSequence != null) {
            this.a = charSequence;
            if (personFieldMetadata != null) {
                this.b = personFieldMetadata;
                this.c = extendedData;
                if (dcdcVar != null) {
                    this.d = dcdcVar;
                    return;
                }
                throw new NullPointerException("Null certificates");
            }
            throw new NullPointerException("Null metadata");
        }
        throw new NullPointerException("Null value");
    }

    @Override // com.google.android.libraries.social.populous.core.Email, com.google.android.libraries.social.populous.core.ContactMethodField
    public final CharSequence a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.Email, com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyft
    public final PersonFieldMetadata b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.Email
    @dzsi
    public final Email.ExtendedData c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.Email
    public final dcdc<Email.Certificate> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Email.ExtendedData extendedData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Email) {
            Email email = (Email) obj;
            if (this.a.equals(email.a()) && this.b.equals(email.b()) && ((extendedData = this.c) != null ? extendedData.equals(email.c()) : email.c() == null) && dchl.m(this.d, email.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Email.ExtendedData extendedData = this.c;
        return ((hashCode ^ (extendedData == null ? 0 : extendedData.hashCode())) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String str = (String) charSequence;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 54 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Email{value=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(valueOf);
        sb.append(", extendedData=");
        sb.append(valueOf2);
        sb.append(", certificates=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
