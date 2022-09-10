package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email_Certificate  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Email_Certificate extends Email.Certificate {
    public final PersonFieldMetadata a;
    public final Email.Certificate.CertificateStatus b;
    public final String c;

    public C$AutoValue_Email_Certificate(PersonFieldMetadata personFieldMetadata, Email.Certificate.CertificateStatus certificateStatus, String str) {
        if (personFieldMetadata != null) {
            this.a = personFieldMetadata;
            if (certificateStatus != null) {
                this.b = certificateStatus;
                if (str != null) {
                    this.c = str;
                    return;
                }
                throw new NullPointerException("Null configurationName");
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // com.google.android.libraries.social.populous.core.Email.Certificate
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.Email.Certificate
    public final Email.Certificate.CertificateStatus b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.Email.Certificate
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Email.Certificate) {
            Email.Certificate certificate = (Email.Certificate) obj;
            if (this.a.equals(certificate.a()) && this.b.equals(certificate.b()) && this.c.equals(certificate.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 51 + String.valueOf(valueOf2).length() + str.length());
        sb.append("Certificate{metadata=");
        sb.append(valueOf);
        sb.append(", status=");
        sb.append(valueOf2);
        sb.append(", configurationName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
