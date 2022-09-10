package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_ProfileId  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ProfileId extends ProfileId {
    public final CharSequence a;
    public final PersonFieldMetadata b;

    public C$AutoValue_ProfileId(CharSequence charSequence, PersonFieldMetadata personFieldMetadata) {
        if (charSequence != null) {
            this.a = charSequence;
            if (personFieldMetadata != null) {
                this.b = personFieldMetadata;
                return;
            }
            throw new NullPointerException("Null metadata");
        }
        throw new NullPointerException("Null value");
    }

    @Override // com.google.android.libraries.social.populous.core.ProfileId, com.google.android.libraries.social.populous.core.ContactMethodField
    public final CharSequence a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.ProfileId, com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyft
    public final PersonFieldMetadata b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProfileId) {
            ProfileId profileId = (ProfileId) obj;
            if (this.a.equals(profileId.a()) && this.b.equals(profileId.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.a;
        String valueOf = String.valueOf(this.b);
        String str = (String) charSequence;
        StringBuilder sb = new StringBuilder(str.length() + 28 + String.valueOf(valueOf).length());
        sb.append("ProfileId{value=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
