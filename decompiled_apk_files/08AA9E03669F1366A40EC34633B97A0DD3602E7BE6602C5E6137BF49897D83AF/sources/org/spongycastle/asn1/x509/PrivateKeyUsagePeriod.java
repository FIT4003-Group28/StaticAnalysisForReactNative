package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
/* loaded from: classes.dex */
public class PrivateKeyUsagePeriod extends ASN1Object {
    private ASN1GeneralizedTime _notAfter;
    private ASN1GeneralizedTime _notBefore;

    public static PrivateKeyUsagePeriod getInstance(Object obj) {
        if (obj instanceof PrivateKeyUsagePeriod) {
            return (PrivateKeyUsagePeriod) obj;
        }
        if (obj == null) {
            return null;
        }
        return new PrivateKeyUsagePeriod(ASN1Sequence.getInstance(obj));
    }

    private PrivateKeyUsagePeriod(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            if (aSN1TaggedObject.getTagNo() == 0) {
                this._notBefore = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, false);
            } else if (aSN1TaggedObject.getTagNo() == 1) {
                this._notAfter = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, false);
            }
        }
    }

    public ASN1GeneralizedTime getNotBefore() {
        return this._notBefore;
    }

    public ASN1GeneralizedTime getNotAfter() {
        return this._notAfter;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this._notBefore != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this._notBefore));
        }
        if (this._notAfter != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this._notAfter));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
