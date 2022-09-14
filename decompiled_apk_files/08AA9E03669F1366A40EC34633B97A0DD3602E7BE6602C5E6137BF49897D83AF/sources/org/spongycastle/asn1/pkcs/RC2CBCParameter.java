package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
/* loaded from: classes.dex */
public class RC2CBCParameter extends ASN1Object {
    ASN1OctetString iv;
    ASN1Integer version;

    public static RC2CBCParameter getInstance(Object obj) {
        if (obj instanceof RC2CBCParameter) {
            return (RC2CBCParameter) obj;
        }
        if (obj == null) {
            return null;
        }
        return new RC2CBCParameter(ASN1Sequence.getInstance(obj));
    }

    public RC2CBCParameter(byte[] bArr) {
        this.version = null;
        this.iv = new DEROctetString(bArr);
    }

    public RC2CBCParameter(int i, byte[] bArr) {
        this.version = new ASN1Integer(i);
        this.iv = new DEROctetString(bArr);
    }

    private RC2CBCParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 1) {
            this.version = null;
            this.iv = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
            return;
        }
        this.version = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.iv = (ASN1OctetString) aSN1Sequence.getObjectAt(1);
    }

    public BigInteger getRC2ParameterVersion() {
        if (this.version == null) {
            return null;
        }
        return this.version.getValue();
    }

    public byte[] getIV() {
        return this.iv.getOctets();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.version != null) {
            aSN1EncodableVector.add(this.version);
        }
        aSN1EncodableVector.add(this.iv);
        return new DERSequence(aSN1EncodableVector);
    }
}
