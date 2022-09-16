package org.spongycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;
import org.spongycastle.crypto.util.PublicKeyFactory;
/* loaded from: classes.dex */
public class TlsDHKeyExchange extends AbstractTlsKeyExchange {
    protected TlsAgreementCredentials agreementCredentials;
    protected DHPrivateKeyParameters dhAgreePrivateKey;
    protected DHPublicKeyParameters dhAgreePublicKey;
    protected DHParameters dhParameters;
    protected AsymmetricKeyParameter serverPublicKey;
    protected TlsSigner tlsSigner;

    protected int getMinimumPrimeBits() {
        return 1024;
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientCertificate(Certificate certificate) {
    }

    public TlsDHKeyExchange(int i, Vector vector, DHParameters dHParameters) {
        super(i, vector);
        if (i == 3) {
            this.tlsSigner = new TlsDSSSigner();
        } else if (i == 5) {
            this.tlsSigner = new TlsRSASigner();
        } else if (i == 7 || i == 9) {
            this.tlsSigner = null;
        } else {
            throw new IllegalArgumentException("unsupported key exchange algorithm");
        }
        this.dhParameters = dHParameters;
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void init(TlsContext tlsContext) {
        super.init(tlsContext);
        if (this.tlsSigner != null) {
            this.tlsSigner.init(tlsContext);
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void skipServerCredentials() {
        throw new TlsFatalAlert((short) 10);
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerCertificate(Certificate certificate) {
        if (certificate.isEmpty()) {
            throw new TlsFatalAlert((short) 42);
        }
        org.spongycastle.asn1.x509.Certificate certificateAt = certificate.getCertificateAt(0);
        try {
            this.serverPublicKey = PublicKeyFactory.createKey(certificateAt.getSubjectPublicKeyInfo());
            if (this.tlsSigner == null) {
                try {
                    this.dhAgreePublicKey = TlsDHUtils.validateDHPublicKey((DHPublicKeyParameters) this.serverPublicKey);
                    this.dhParameters = validateDHParameters(this.dhAgreePublicKey.getParameters());
                    TlsUtils.validateKeyUsage(certificateAt, 8);
                } catch (ClassCastException e) {
                    throw new TlsFatalAlert((short) 46, e);
                }
            } else if (!this.tlsSigner.isValidPublicKey(this.serverPublicKey)) {
                throw new TlsFatalAlert((short) 46);
            } else {
                TlsUtils.validateKeyUsage(certificateAt, 128);
            }
            super.processServerCertificate(certificate);
        } catch (RuntimeException e2) {
            throw new TlsFatalAlert((short) 43, e2);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public boolean requiresServerKeyExchange() {
        int i = this.keyExchange;
        return i == 3 || i == 5 || i == 11;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void validateCertificateRequest(CertificateRequest certificateRequest) {
        short[] certificateTypes;
        for (short s : certificateRequest.getCertificateTypes()) {
            if (s != 64) {
                switch (s) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        break;
                    default:
                        throw new TlsFatalAlert((short) 47);
                }
            }
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientCredentials(TlsCredentials tlsCredentials) {
        if (tlsCredentials instanceof TlsAgreementCredentials) {
            this.agreementCredentials = (TlsAgreementCredentials) tlsCredentials;
        } else if (!(tlsCredentials instanceof TlsSignerCredentials)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void generateClientKeyExchange(OutputStream outputStream) {
        if (this.agreementCredentials == null) {
            this.dhAgreePrivateKey = TlsDHUtils.generateEphemeralClientKeyExchange(this.context.getSecureRandom(), this.dhParameters, outputStream);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientKeyExchange(InputStream inputStream) {
        if (this.dhAgreePublicKey != null) {
            return;
        }
        this.dhAgreePublicKey = TlsDHUtils.validateDHPublicKey(new DHPublicKeyParameters(TlsDHUtils.readDHParameter(inputStream), this.dhParameters));
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public byte[] generatePremasterSecret() {
        if (this.agreementCredentials != null) {
            return this.agreementCredentials.generateAgreement(this.dhAgreePublicKey);
        }
        if (this.dhAgreePrivateKey != null) {
            return TlsDHUtils.calculateDHBasicAgreement(this.dhAgreePublicKey, this.dhAgreePrivateKey);
        }
        throw new TlsFatalAlert((short) 80);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DHParameters validateDHParameters(DHParameters dHParameters) {
        if (dHParameters.getP().bitLength() < getMinimumPrimeBits()) {
            throw new TlsFatalAlert((short) 71);
        }
        return TlsDHUtils.validateDHParameters(dHParameters);
    }
}
