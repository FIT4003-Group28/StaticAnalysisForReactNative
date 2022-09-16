package org.spongycastle.asn1.bc;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.spongycastle.asn1.x509.Certificate;
/* loaded from: classes.dex */
public class EncryptedPrivateKeyData extends ASN1Object {
    private final Certificate[] certificateChain;
    private final EncryptedPrivateKeyInfo encryptedPrivateKeyInfo;

    public EncryptedPrivateKeyData(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, Certificate[] certificateArr) {
        this.encryptedPrivateKeyInfo = encryptedPrivateKeyInfo;
        this.certificateChain = new Certificate[certificateArr.length];
        System.arraycopy(certificateArr, 0, this.certificateChain, 0, certificateArr.length);
    }

    private EncryptedPrivateKeyData(ASN1Sequence aSN1Sequence) {
        this.encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.certificateChain = new Certificate[aSN1Sequence2.size()];
        for (int i = 0; i != this.certificateChain.length; i++) {
            this.certificateChain[i] = Certificate.getInstance(aSN1Sequence2.getObjectAt(i));
        }
    }

    public static EncryptedPrivateKeyData getInstance(Object obj) {
        if (obj instanceof EncryptedPrivateKeyData) {
            return (EncryptedPrivateKeyData) obj;
        }
        if (obj == null) {
            return null;
        }
        return new EncryptedPrivateKeyData(ASN1Sequence.getInstance(obj));
    }

    public Certificate[] getCertificateChain() {
        Certificate[] certificateArr = new Certificate[this.certificateChain.length];
        System.arraycopy(this.certificateChain, 0, certificateArr, 0, this.certificateChain.length);
        return certificateArr;
    }

    public EncryptedPrivateKeyInfo getEncryptedPrivateKeyInfo() {
        return this.encryptedPrivateKeyInfo;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.encryptedPrivateKeyInfo);
        aSN1EncodableVector.add(new DERSequence(this.certificateChain));
        return new DERSequence(aSN1EncodableVector);
    }
}
