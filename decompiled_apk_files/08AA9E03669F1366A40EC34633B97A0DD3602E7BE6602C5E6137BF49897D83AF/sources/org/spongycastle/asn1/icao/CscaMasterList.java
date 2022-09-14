package org.spongycastle.asn1.icao;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.x509.Certificate;
/* loaded from: classes.dex */
public class CscaMasterList extends ASN1Object {
    private Certificate[] certList;
    private ASN1Integer version;

    public static CscaMasterList getInstance(Object obj) {
        if (obj instanceof CscaMasterList) {
            return (CscaMasterList) obj;
        }
        if (obj == null) {
            return null;
        }
        return new CscaMasterList(ASN1Sequence.getInstance(obj));
    }

    private CscaMasterList(ASN1Sequence aSN1Sequence) {
        this.version = new ASN1Integer(0L);
        if (aSN1Sequence == null || aSN1Sequence.size() == 0) {
            throw new IllegalArgumentException("null or empty sequence passed.");
        }
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("Incorrect sequence size: " + aSN1Sequence.size());
        }
        this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        ASN1Set aSN1Set = ASN1Set.getInstance(aSN1Sequence.getObjectAt(1));
        this.certList = new Certificate[aSN1Set.size()];
        for (int i = 0; i < this.certList.length; i++) {
            this.certList[i] = Certificate.getInstance(aSN1Set.getObjectAt(i));
        }
    }

    public CscaMasterList(Certificate[] certificateArr) {
        this.version = new ASN1Integer(0L);
        this.certList = copyCertList(certificateArr);
    }

    public int getVersion() {
        return this.version.getValue().intValue();
    }

    public Certificate[] getCertStructs() {
        return copyCertList(this.certList);
    }

    private Certificate[] copyCertList(Certificate[] certificateArr) {
        Certificate[] certificateArr2 = new Certificate[certificateArr.length];
        for (int i = 0; i != certificateArr2.length; i++) {
            certificateArr2[i] = certificateArr[i];
        }
        return certificateArr2;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.version);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        for (int i = 0; i < this.certList.length; i++) {
            aSN1EncodableVector2.add(this.certList[i]);
        }
        aSN1EncodableVector.add(new DERSet(aSN1EncodableVector2));
        return new DERSequence(aSN1EncodableVector);
    }
}
