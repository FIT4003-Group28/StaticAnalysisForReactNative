package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Email extends ContactMethodField implements Parcelable {
    private String a;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class Certificate implements Comparable<Certificate>, Parcelable {

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        public abstract class CertificateStatus implements Comparable<CertificateStatus>, Parcelable {
            static {
                d(dcyn.a, 1);
            }

            public static CertificateStatus d(double d, int i) {
                return new AutoValue_Email_Certificate_CertificateStatus(d, i);
            }

            public abstract double a();

            public abstract int b();

            @Override // java.lang.Comparable
            /* renamed from: c */
            public final int compareTo(CertificateStatus certificateStatus) {
                if (b() != certificateStatus.b()) {
                    int b = b();
                    int i = b - 1;
                    if (b == 0) {
                        throw null;
                    }
                    int b2 = certificateStatus.b();
                    int i2 = b2 - 1;
                    if (b2 == 0) {
                        throw null;
                    }
                    return Integer.compare(i, i2);
                }
                return Double.compare(certificateStatus.a(), a());
            }
        }

        public static Certificate d(PersonFieldMetadata personFieldMetadata, CertificateStatus certificateStatus, String str) {
            return new AutoValue_Email_Certificate(personFieldMetadata, certificateStatus, str);
        }

        public abstract PersonFieldMetadata a();

        public abstract CertificateStatus b();

        public abstract String c();

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Certificate certificate) {
            Certificate certificate2 = certificate;
            return a().a() != certificate2.a().a() ? !a().a() ? 1 : -1 : b().compareTo(certificate2.b()) != 0 ? b().compareTo(certificate2.b()) : c().compareTo(certificate2.c());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class EmailSecurityData implements Parcelable {
        public static EmailSecurityData b(boolean z) {
            return new AutoValue_Email_EmailSecurityData(z);
        }

        public abstract boolean a();
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class ExtendedData implements Parcelable {
        public static ExtendedData d(boolean z, EmailSecurityData emailSecurityData, dsiu dsiuVar) {
            return new AutoValue_Email_ExtendedData(z, emailSecurityData, dsiuVar);
        }

        public abstract boolean a();

        @dzsi
        public abstract EmailSecurityData b();

        public abstract dsiu c();
    }

    public static cyey e() {
        cybx cybxVar = new cybx();
        cybxVar.c(dcdc.e());
        return cybxVar;
    }

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField
    public final cyep SA() {
        return cyep.EMAIL;
    }

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField
    public abstract CharSequence a();

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyft
    public abstract PersonFieldMetadata b();

    @dzsi
    public abstract ExtendedData c();

    public abstract dcdc<Certificate> d();

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyff
    public final String k() {
        if (this.a == null) {
            this.a = l(cyfj.EMAIL, cyez.a(a().toString()));
        }
        return this.a;
    }
}
