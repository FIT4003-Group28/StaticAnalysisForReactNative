package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email_Certificate_CertificateStatus  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Email_Certificate_CertificateStatus extends Email.Certificate.CertificateStatus {
    public final double a;
    public final int b;

    public C$AutoValue_Email_Certificate_CertificateStatus(double d, int i) {
        this.a = d;
        if (i != 0) {
            this.b = i;
            return;
        }
        throw new NullPointerException("Null statusCode");
    }

    @Override // com.google.android.libraries.social.populous.core.Email.Certificate.CertificateStatus
    public final double a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.Email.Certificate.CertificateStatus
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Email.Certificate.CertificateStatus) {
            Email.Certificate.CertificateStatus certificateStatus = (Email.Certificate.CertificateStatus) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(certificateStatus.a()) && this.b == certificateStatus.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        String valueOf = String.valueOf(Integer.toString(this.b - 1));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("CertificateStatus{notAfterSec=");
        sb.append(d);
        sb.append(", statusCode=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
