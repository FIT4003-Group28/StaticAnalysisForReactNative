package org.spongycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Pack;
/* loaded from: classes.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte[] partyAInfo;
    private byte[] z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr.length - i2 < i) {
            throw new DataLengthException("output buffer too small");
        }
        long j = i2;
        int digestSize = this.digest.getDigestSize();
        if (j > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j2 = digestSize;
        int i4 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i5 = 0;
        int i6 = i2;
        int i7 = i;
        int i8 = 0;
        int i9 = 1;
        while (i8 < i4) {
            this.digest.update(this.z, i5, this.z.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i9)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                i3 = i4;
                aSN1EncodableVector.add(new DERTaggedObject(true, 0, new DEROctetString(this.partyAInfo)));
            } else {
                i3 = i4;
            }
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i6 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i7, digestSize);
                    i7 += digestSize;
                    i6 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i7, i6);
                }
                i9++;
                i8++;
                i4 = i3;
                i5 = 0;
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to encode parameter info: " + e.getMessage());
            }
        }
        this.digest.reset();
        return (int) j;
    }
}
