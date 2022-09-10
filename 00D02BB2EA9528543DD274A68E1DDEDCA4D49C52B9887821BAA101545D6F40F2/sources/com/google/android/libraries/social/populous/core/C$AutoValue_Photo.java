package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Photo  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Photo extends Photo {
    public final int a;
    public final String b;
    public final PersonFieldMetadata c;
    public final boolean d;

    public C$AutoValue_Photo(int i, String str, PersonFieldMetadata personFieldMetadata, boolean z) {
        this.a = i;
        if (str != null) {
            this.b = str;
            if (personFieldMetadata != null) {
                this.c = personFieldMetadata;
                this.d = z;
                return;
            }
            throw new NullPointerException("Null metadata");
        }
        throw new NullPointerException("Null value");
    }

    @Override // com.google.android.libraries.social.populous.core.Photo
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.Photo, defpackage.cyft
    public final PersonFieldMetadata b() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.Photo
    public final String c() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.Photo
    public final boolean d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.core.Photo
    public final cygi e() {
        return new cycd(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Photo) {
            Photo photo = (Photo) obj;
            if (this.a == photo.a() && this.b.equals(photo.c()) && this.c.equals(photo.b()) && this.d == photo.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 61 + String.valueOf(valueOf).length());
        sb.append("Photo{source=");
        sb.append(i);
        sb.append(", value=");
        sb.append(str);
        sb.append(", metadata=");
        sb.append(valueOf);
        sb.append(", isDefault=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
