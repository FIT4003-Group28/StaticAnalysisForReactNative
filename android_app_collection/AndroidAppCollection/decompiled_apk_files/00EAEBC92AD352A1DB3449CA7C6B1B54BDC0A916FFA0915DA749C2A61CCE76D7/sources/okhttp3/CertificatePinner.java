package okhttp3;

import h.f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
/* loaded from: classes.dex */
public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public Builder add(String str, String... strArr) {
            if (str != null) {
                for (String str2 : strArr) {
                    this.pins.add(new Pin(str, str2));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }

        public CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet(this.pins), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Pin {
        private static final String WILDCARD = "*.";
        final String canonicalHostname;
        final f hash;
        final String hashAlgorithm;
        final String pattern;

        Pin(String str, String str2) {
            StringBuilder sb;
            int i;
            this.pattern = str;
            if (str.startsWith(WILDCARD)) {
                sb = new StringBuilder();
                sb.append("http://");
                str = str.substring(2);
            } else {
                sb = new StringBuilder();
                sb.append("http://");
            }
            sb.append(str);
            this.canonicalHostname = HttpUrl.get(sb.toString()).host();
            if (str2.startsWith("sha1/")) {
                this.hashAlgorithm = "sha1/";
                i = 5;
            } else if (!str2.startsWith("sha256/")) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            } else {
                this.hashAlgorithm = "sha256/";
                i = 7;
            }
            this.hash = f.a(str2.substring(i));
            if (this.hash != null) {
                return;
            }
            throw new IllegalArgumentException("pins must be base64: " + str2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof Pin) {
                Pin pin = (Pin) obj;
                if (this.pattern.equals(pin.pattern) && this.hashAlgorithm.equals(pin.hashAlgorithm) && this.hash.equals(pin.hash)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.pattern.hashCode()) * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        boolean matches(String str) {
            if (this.pattern.startsWith(WILDCARD)) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == this.canonicalHostname.length()) {
                    String str2 = this.canonicalHostname;
                    if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                        return true;
                    }
                }
                return false;
            }
            return str.equals(this.canonicalHostname);
        }

        public String toString() {
            return this.hashAlgorithm + this.hash.a();
        }
    }

    CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static String pin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + sha256((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static f sha1(X509Certificate x509Certificate) {
        return f.a(x509Certificate.getPublicKey().getEncoded()).e();
    }

    static f sha256(X509Certificate x509Certificate) {
        return f.a(x509Certificate.getPublicKey().getEncoded()).f();
    }

    public void check(String str, List<Certificate> list) {
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            list = certificateChainCleaner.clean(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = findMatchingPins.size();
            f fVar = null;
            f fVar2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                Pin pin = findMatchingPins.get(i2);
                if (pin.hashAlgorithm.equals("sha256/")) {
                    if (fVar == null) {
                        fVar = sha256(x509Certificate);
                    }
                    if (pin.hash.equals(fVar)) {
                        return;
                    }
                } else if (!pin.hashAlgorithm.equals("sha1/")) {
                    throw new AssertionError("unsupported hashAlgorithm: " + pin.hashAlgorithm);
                } else {
                    if (fVar2 == null) {
                        fVar2 = sha1(x509Certificate);
                    }
                    if (pin.hash.equals(fVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = findMatchingPins.size();
        for (int i4 = 0; i4 < size4; i4++) {
            sb.append("\n    ");
            sb.append(findMatchingPins.get(i4));
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public void check(String str, Certificate... certificateArr) {
        check(str, Arrays.asList(certificateArr));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Util.equal(this.certificateChainCleaner, certificatePinner.certificateChainCleaner) && this.pins.equals(certificatePinner.pins)) {
                return true;
            }
        }
        return false;
    }

    List<Pin> findMatchingPins(String str) {
        List<Pin> emptyList = Collections.emptyList();
        for (Pin pin : this.pins) {
            if (pin.matches(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(pin);
            }
        }
        return emptyList;
    }

    public int hashCode() {
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return ((certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0) * 31) + this.pins.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CertificatePinner withCertificateChainCleaner(CertificateChainCleaner certificateChainCleaner) {
        return Util.equal(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }
}
