package org.spongycastle.asn1.cms;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
/* loaded from: classes.dex */
public class TimeStampTokenEvidence extends ASN1Object {
    private TimeStampAndCRL[] timeStampAndCRLs;

    public TimeStampTokenEvidence(TimeStampAndCRL[] timeStampAndCRLArr) {
        this.timeStampAndCRLs = timeStampAndCRLArr;
    }

    public TimeStampTokenEvidence(TimeStampAndCRL timeStampAndCRL) {
        this.timeStampAndCRLs = new TimeStampAndCRL[1];
        this.timeStampAndCRLs[0] = timeStampAndCRL;
    }

    private TimeStampTokenEvidence(ASN1Sequence aSN1Sequence) {
        this.timeStampAndCRLs = new TimeStampAndCRL[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            this.timeStampAndCRLs[i] = TimeStampAndCRL.getInstance(objects.nextElement());
            i++;
        }
    }

    public static TimeStampTokenEvidence getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static TimeStampTokenEvidence getInstance(Object obj) {
        if (obj instanceof TimeStampTokenEvidence) {
            return (TimeStampTokenEvidence) obj;
        }
        if (obj == null) {
            return null;
        }
        return new TimeStampTokenEvidence(ASN1Sequence.getInstance(obj));
    }

    public TimeStampAndCRL[] toTimeStampAndCRLArray() {
        return this.timeStampAndCRLs;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i = 0; i != this.timeStampAndCRLs.length; i++) {
            aSN1EncodableVector.add(this.timeStampAndCRLs[i]);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
