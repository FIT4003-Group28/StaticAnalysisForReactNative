package org.spongycastle.asn1.esf;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.Attribute;
import org.spongycastle.asn1.x509.AttributeCertificate;
/* loaded from: classes.dex */
public class SignerAttribute extends ASN1Object {
    private Object[] values;

    public static SignerAttribute getInstance(Object obj) {
        if (obj instanceof SignerAttribute) {
            return (SignerAttribute) obj;
        }
        if (obj == null) {
            return null;
        }
        return new SignerAttribute(ASN1Sequence.getInstance(obj));
    }

    private SignerAttribute(ASN1Sequence aSN1Sequence) {
        this.values = new Object[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            if (aSN1TaggedObject.getTagNo() == 0) {
                ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1TaggedObject, true);
                Attribute[] attributeArr = new Attribute[aSN1Sequence2.size()];
                for (int i2 = 0; i2 != attributeArr.length; i2++) {
                    attributeArr[i2] = Attribute.getInstance(aSN1Sequence2.getObjectAt(i2));
                }
                this.values[i] = attributeArr;
            } else if (aSN1TaggedObject.getTagNo() == 1) {
                this.values[i] = AttributeCertificate.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
            } else {
                throw new IllegalArgumentException("illegal tag: " + aSN1TaggedObject.getTagNo());
            }
            i++;
        }
    }

    public SignerAttribute(Attribute[] attributeArr) {
        this.values = new Object[1];
        this.values[0] = attributeArr;
    }

    public SignerAttribute(AttributeCertificate attributeCertificate) {
        this.values = new Object[1];
        this.values[0] = attributeCertificate;
    }

    public Object[] getValues() {
        Object[] objArr = new Object[this.values.length];
        System.arraycopy(this.values, 0, objArr, 0, objArr.length);
        return objArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i = 0; i != this.values.length; i++) {
            if (this.values[i] instanceof Attribute[]) {
                aSN1EncodableVector.add(new DERTaggedObject(0, new DERSequence((Attribute[]) this.values[i])));
            } else {
                aSN1EncodableVector.add(new DERTaggedObject(1, (AttributeCertificate) this.values[i]));
            }
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
