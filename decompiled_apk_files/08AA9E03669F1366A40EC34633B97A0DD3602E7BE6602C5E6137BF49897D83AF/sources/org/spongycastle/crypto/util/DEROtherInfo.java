package org.spongycastle.crypto.util;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
/* loaded from: classes.dex */
public class DEROtherInfo {
    private final DERSequence sequence;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final AlgorithmIdentifier algorithmID;
        private final ASN1OctetString partyUVInfo;
        private final ASN1OctetString partyVInfo;
        private ASN1TaggedObject suppPrivInfo;
        private ASN1TaggedObject suppPubInfo;

        public Builder(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2) {
            this.algorithmID = algorithmIdentifier;
            this.partyUVInfo = DerUtil.getOctetString(bArr);
            this.partyVInfo = DerUtil.getOctetString(bArr2);
        }

        public Builder withSuppPubInfo(byte[] bArr) {
            this.suppPubInfo = new DERTaggedObject(false, 0, DerUtil.getOctetString(bArr));
            return this;
        }

        public Builder withSuppPrivInfo(byte[] bArr) {
            this.suppPrivInfo = new DERTaggedObject(false, 1, DerUtil.getOctetString(bArr));
            return this;
        }

        public DEROtherInfo build() {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(this.algorithmID);
            aSN1EncodableVector.add(this.partyUVInfo);
            aSN1EncodableVector.add(this.partyVInfo);
            if (this.suppPubInfo != null) {
                aSN1EncodableVector.add(this.suppPubInfo);
            }
            if (this.suppPrivInfo != null) {
                aSN1EncodableVector.add(this.suppPrivInfo);
            }
            return new DEROtherInfo(new DERSequence(aSN1EncodableVector));
        }
    }

    private DEROtherInfo(DERSequence dERSequence) {
        this.sequence = dERSequence;
    }

    public byte[] getEncoded() {
        return this.sequence.getEncoded();
    }
}
