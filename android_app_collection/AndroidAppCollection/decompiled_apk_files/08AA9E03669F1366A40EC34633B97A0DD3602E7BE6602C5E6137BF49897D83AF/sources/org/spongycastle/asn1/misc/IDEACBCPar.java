package org.spongycastle.asn1.misc;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.util.Arrays;
/* loaded from: classes.dex */
public class IDEACBCPar extends ASN1Object {
    ASN1OctetString iv;

    public static IDEACBCPar getInstance(Object obj) {
        if (obj instanceof IDEACBCPar) {
            return (IDEACBCPar) obj;
        }
        if (obj == null) {
            return null;
        }
        return new IDEACBCPar(ASN1Sequence.getInstance(obj));
    }

    public IDEACBCPar(byte[] bArr) {
        this.iv = new DEROctetString(bArr);
    }

    public IDEACBCPar(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 1) {
            this.iv = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        } else {
            this.iv = null;
        }
    }

    public byte[] getIV() {
        if (this.iv != null) {
            return Arrays.clone(this.iv.getOctets());
        }
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.iv != null) {
            aSN1EncodableVector.add(this.iv);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
