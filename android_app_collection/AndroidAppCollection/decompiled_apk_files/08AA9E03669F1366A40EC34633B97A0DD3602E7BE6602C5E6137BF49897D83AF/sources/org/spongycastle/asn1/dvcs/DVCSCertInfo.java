package org.spongycastle.asn1.dvcs;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.cmp.PKIStatusInfo;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.PolicyInformation;
/* loaded from: classes.dex */
public class DVCSCertInfo extends ASN1Object {
    private static final int DEFAULT_VERSION = 1;
    private static final int TAG_CERTS = 3;
    private static final int TAG_DV_STATUS = 0;
    private static final int TAG_POLICY = 1;
    private static final int TAG_REQ_SIGNATURE = 2;
    private ASN1Sequence certs;
    private DVCSRequestInformation dvReqInfo;
    private PKIStatusInfo dvStatus;
    private Extensions extensions;
    private DigestInfo messageImprint;
    private PolicyInformation policy;
    private ASN1Set reqSignature;
    private DVCSTime responseTime;
    private ASN1Integer serialNumber;
    private int version;

    public DVCSCertInfo(DVCSRequestInformation dVCSRequestInformation, DigestInfo digestInfo, ASN1Integer aSN1Integer, DVCSTime dVCSTime) {
        this.version = 1;
        this.dvReqInfo = dVCSRequestInformation;
        this.messageImprint = digestInfo;
        this.serialNumber = aSN1Integer;
        this.responseTime = dVCSTime;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private DVCSCertInfo(org.spongycastle.asn1.ASN1Sequence r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.version = r0
            r1 = 0
            org.spongycastle.asn1.ASN1Encodable r2 = r5.getObjectAt(r1)
            org.spongycastle.asn1.ASN1Integer r3 = org.spongycastle.asn1.ASN1Integer.getInstance(r2)     // Catch: java.lang.IllegalArgumentException -> L1f
            java.math.BigInteger r3 = r3.getValue()     // Catch: java.lang.IllegalArgumentException -> L1f
            int r3 = r3.intValue()     // Catch: java.lang.IllegalArgumentException -> L1f
            r4.version = r3     // Catch: java.lang.IllegalArgumentException -> L1f
            r3 = 2
            org.spongycastle.asn1.ASN1Encodable r0 = r5.getObjectAt(r0)     // Catch: java.lang.IllegalArgumentException -> L20
            goto L21
        L1f:
            r3 = 1
        L20:
            r0 = r2
        L21:
            org.spongycastle.asn1.dvcs.DVCSRequestInformation r0 = org.spongycastle.asn1.dvcs.DVCSRequestInformation.getInstance(r0)
            r4.dvReqInfo = r0
            int r0 = r3 + 1
            org.spongycastle.asn1.ASN1Encodable r2 = r5.getObjectAt(r3)
            org.spongycastle.asn1.x509.DigestInfo r2 = org.spongycastle.asn1.x509.DigestInfo.getInstance(r2)
            r4.messageImprint = r2
            int r2 = r0 + 1
            org.spongycastle.asn1.ASN1Encodable r0 = r5.getObjectAt(r0)
            org.spongycastle.asn1.ASN1Integer r0 = org.spongycastle.asn1.ASN1Integer.getInstance(r0)
            r4.serialNumber = r0
            int r0 = r2 + 1
            org.spongycastle.asn1.ASN1Encodable r2 = r5.getObjectAt(r2)
            org.spongycastle.asn1.dvcs.DVCSTime r2 = org.spongycastle.asn1.dvcs.DVCSTime.getInstance(r2)
            r4.responseTime = r2
        L4b:
            int r2 = r5.size()
            if (r0 >= r2) goto La5
            int r2 = r0 + 1
            org.spongycastle.asn1.ASN1Encodable r0 = r5.getObjectAt(r0)
            boolean r3 = r0 instanceof org.spongycastle.asn1.ASN1TaggedObject
            if (r3 == 0) goto L9d
            org.spongycastle.asn1.ASN1TaggedObject r0 = org.spongycastle.asn1.ASN1TaggedObject.getInstance(r0)
            int r3 = r0.getTagNo()
            switch(r3) {
                case 0: goto L96;
                case 1: goto L8b;
                case 2: goto L84;
                case 3: goto L7d;
                default: goto L66;
            }
        L66:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown tag encountered: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L7d:
            org.spongycastle.asn1.ASN1Sequence r0 = org.spongycastle.asn1.ASN1Sequence.getInstance(r0, r1)
            r4.certs = r0
            goto La3
        L84:
            org.spongycastle.asn1.ASN1Set r0 = org.spongycastle.asn1.ASN1Set.getInstance(r0, r1)
            r4.reqSignature = r0
            goto La3
        L8b:
            org.spongycastle.asn1.ASN1Sequence r0 = org.spongycastle.asn1.ASN1Sequence.getInstance(r0, r1)
            org.spongycastle.asn1.x509.PolicyInformation r0 = org.spongycastle.asn1.x509.PolicyInformation.getInstance(r0)
            r4.policy = r0
            goto La3
        L96:
            org.spongycastle.asn1.cmp.PKIStatusInfo r0 = org.spongycastle.asn1.cmp.PKIStatusInfo.getInstance(r0, r1)
            r4.dvStatus = r0
            goto La3
        L9d:
            org.spongycastle.asn1.x509.Extensions r0 = org.spongycastle.asn1.x509.Extensions.getInstance(r0)     // Catch: java.lang.IllegalArgumentException -> La3
            r4.extensions = r0     // Catch: java.lang.IllegalArgumentException -> La3
        La3:
            r0 = r2
            goto L4b
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.asn1.dvcs.DVCSCertInfo.<init>(org.spongycastle.asn1.ASN1Sequence):void");
    }

    public static DVCSCertInfo getInstance(Object obj) {
        if (obj instanceof DVCSCertInfo) {
            return (DVCSCertInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        return new DVCSCertInfo(ASN1Sequence.getInstance(obj));
    }

    public static DVCSCertInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.version != 1) {
            aSN1EncodableVector.add(new ASN1Integer(this.version));
        }
        aSN1EncodableVector.add(this.dvReqInfo);
        aSN1EncodableVector.add(this.messageImprint);
        aSN1EncodableVector.add(this.serialNumber);
        aSN1EncodableVector.add(this.responseTime);
        if (this.dvStatus != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this.dvStatus));
        }
        if (this.policy != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, this.policy));
        }
        if (this.reqSignature != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, this.reqSignature));
        }
        if (this.certs != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, this.certs));
        }
        if (this.extensions != null) {
            aSN1EncodableVector.add(this.extensions);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DVCSCertInfo {\n");
        if (this.version != 1) {
            stringBuffer.append("version: " + this.version + "\n");
        }
        stringBuffer.append("dvReqInfo: " + this.dvReqInfo + "\n");
        stringBuffer.append("messageImprint: " + this.messageImprint + "\n");
        stringBuffer.append("serialNumber: " + this.serialNumber + "\n");
        stringBuffer.append("responseTime: " + this.responseTime + "\n");
        if (this.dvStatus != null) {
            stringBuffer.append("dvStatus: " + this.dvStatus + "\n");
        }
        if (this.policy != null) {
            stringBuffer.append("policy: " + this.policy + "\n");
        }
        if (this.reqSignature != null) {
            stringBuffer.append("reqSignature: " + this.reqSignature + "\n");
        }
        if (this.certs != null) {
            stringBuffer.append("certs: " + this.certs + "\n");
        }
        if (this.extensions != null) {
            stringBuffer.append("extensions: " + this.extensions + "\n");
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    public int getVersion() {
        return this.version;
    }

    private void setVersion(int i) {
        this.version = i;
    }

    public DVCSRequestInformation getDvReqInfo() {
        return this.dvReqInfo;
    }

    private void setDvReqInfo(DVCSRequestInformation dVCSRequestInformation) {
        this.dvReqInfo = dVCSRequestInformation;
    }

    public DigestInfo getMessageImprint() {
        return this.messageImprint;
    }

    private void setMessageImprint(DigestInfo digestInfo) {
        this.messageImprint = digestInfo;
    }

    public ASN1Integer getSerialNumber() {
        return this.serialNumber;
    }

    public DVCSTime getResponseTime() {
        return this.responseTime;
    }

    public PKIStatusInfo getDvStatus() {
        return this.dvStatus;
    }

    public PolicyInformation getPolicy() {
        return this.policy;
    }

    public ASN1Set getReqSignature() {
        return this.reqSignature;
    }

    public TargetEtcChain[] getCerts() {
        if (this.certs != null) {
            return TargetEtcChain.arrayFromSequence(this.certs);
        }
        return null;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }
}
