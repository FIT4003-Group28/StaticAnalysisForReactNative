package org.spongycastle.asn1.isismtt.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.GeneralName;
/* loaded from: classes.dex */
public class Admissions extends ASN1Object {
    private GeneralName admissionAuthority;
    private NamingAuthority namingAuthority;
    private ASN1Sequence professionInfos;

    public static Admissions getInstance(Object obj) {
        if (obj == null || (obj instanceof Admissions)) {
            return (Admissions) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new Admissions((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    private Admissions(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.size());
        }
        Enumeration objects = aSN1Sequence.getObjects();
        ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
            switch (aSN1TaggedObject.getTagNo()) {
                case 0:
                    this.admissionAuthority = GeneralName.getInstance(aSN1TaggedObject, true);
                    break;
                case 1:
                    this.namingAuthority = NamingAuthority.getInstance(aSN1TaggedObject, true);
                    break;
                default:
                    throw new IllegalArgumentException("Bad tag number: " + aSN1TaggedObject.getTagNo());
            }
            aSN1Encodable = (ASN1Encodable) objects.nextElement();
        }
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) aSN1Encodable;
            if (aSN1TaggedObject2.getTagNo() == 1) {
                this.namingAuthority = NamingAuthority.getInstance(aSN1TaggedObject2, true);
                aSN1Encodable = (ASN1Encodable) objects.nextElement();
            } else {
                throw new IllegalArgumentException("Bad tag number: " + aSN1TaggedObject2.getTagNo());
            }
        }
        this.professionInfos = ASN1Sequence.getInstance(aSN1Encodable);
        if (!objects.hasMoreElements()) {
            return;
        }
        throw new IllegalArgumentException("Bad object encountered: " + objects.nextElement().getClass());
    }

    public Admissions(GeneralName generalName, NamingAuthority namingAuthority, ProfessionInfo[] professionInfoArr) {
        this.admissionAuthority = generalName;
        this.namingAuthority = namingAuthority;
        this.professionInfos = new DERSequence(professionInfoArr);
    }

    public GeneralName getAdmissionAuthority() {
        return this.admissionAuthority;
    }

    public NamingAuthority getNamingAuthority() {
        return this.namingAuthority;
    }

    public ProfessionInfo[] getProfessionInfos() {
        ProfessionInfo[] professionInfoArr = new ProfessionInfo[this.professionInfos.size()];
        Enumeration objects = this.professionInfos.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            professionInfoArr[i] = ProfessionInfo.getInstance(objects.nextElement());
            i++;
        }
        return professionInfoArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.admissionAuthority != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.admissionAuthority));
        }
        if (this.namingAuthority != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, this.namingAuthority));
        }
        aSN1EncodableVector.add(this.professionInfos);
        return new DERSequence(aSN1EncodableVector);
    }
}
