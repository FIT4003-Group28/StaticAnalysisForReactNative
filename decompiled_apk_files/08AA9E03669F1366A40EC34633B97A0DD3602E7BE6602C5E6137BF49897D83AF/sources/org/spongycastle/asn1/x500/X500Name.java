package org.spongycastle.asn1.x500;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.style.BCStyle;
/* loaded from: classes.dex */
public class X500Name extends ASN1Object implements ASN1Choice {
    private static X500NameStyle defaultStyle = BCStyle.INSTANCE;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private RDN[] rdns;
    private X500NameStyle style;

    public X500Name(X500NameStyle x500NameStyle, X500Name x500Name) {
        this.rdns = x500Name.rdns;
        this.style = x500NameStyle;
    }

    public static X500Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
    }

    public static X500Name getInstance(Object obj) {
        if (obj instanceof X500Name) {
            return (X500Name) obj;
        }
        if (obj == null) {
            return null;
        }
        return new X500Name(ASN1Sequence.getInstance(obj));
    }

    public static X500Name getInstance(X500NameStyle x500NameStyle, Object obj) {
        if (obj instanceof X500Name) {
            return new X500Name(x500NameStyle, (X500Name) obj);
        }
        if (obj == null) {
            return null;
        }
        return new X500Name(x500NameStyle, ASN1Sequence.getInstance(obj));
    }

    private X500Name(ASN1Sequence aSN1Sequence) {
        this(defaultStyle, aSN1Sequence);
    }

    private X500Name(X500NameStyle x500NameStyle, ASN1Sequence aSN1Sequence) {
        this.style = x500NameStyle;
        this.rdns = new RDN[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            this.rdns[i] = RDN.getInstance(objects.nextElement());
            i++;
        }
    }

    public X500Name(RDN[] rdnArr) {
        this(defaultStyle, rdnArr);
    }

    public X500Name(X500NameStyle x500NameStyle, RDN[] rdnArr) {
        this.rdns = rdnArr;
        this.style = x500NameStyle;
    }

    public X500Name(String str) {
        this(defaultStyle, str);
    }

    public X500Name(X500NameStyle x500NameStyle, String str) {
        this(x500NameStyle.fromString(str));
        this.style = x500NameStyle;
    }

    public RDN[] getRDNs() {
        RDN[] rdnArr = new RDN[this.rdns.length];
        System.arraycopy(this.rdns, 0, rdnArr, 0, rdnArr.length);
        return rdnArr;
    }

    public ASN1ObjectIdentifier[] getAttributeTypes() {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 != this.rdns.length; i3++) {
            i2 += this.rdns[i3].size();
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[i2];
        int i4 = 0;
        for (int i5 = 0; i5 != this.rdns.length; i5++) {
            RDN rdn = this.rdns[i5];
            if (rdn.isMultiValued()) {
                AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
                i = i4;
                int i6 = 0;
                while (i6 != typesAndValues.length) {
                    aSN1ObjectIdentifierArr[i] = typesAndValues[i6].getType();
                    i6++;
                    i++;
                }
            } else if (rdn.size() != 0) {
                i = i4 + 1;
                aSN1ObjectIdentifierArr[i4] = rdn.getFirst().getType();
            }
            i4 = i;
        }
        return aSN1ObjectIdentifierArr;
    }

    public RDN[] getRDNs(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i;
        RDN[] rdnArr = new RDN[this.rdns.length];
        int i2 = 0;
        for (int i3 = 0; i3 != this.rdns.length; i3++) {
            RDN rdn = this.rdns[i3];
            if (rdn.isMultiValued()) {
                AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
                for (int i4 = 0; i4 != typesAndValues.length; i4++) {
                    if (typesAndValues[i4].getType().equals(aSN1ObjectIdentifier)) {
                        i = i2 + 1;
                        rdnArr[i2] = rdn;
                        i2 = i;
                        break;
                    }
                }
            } else if (rdn.getFirst().getType().equals(aSN1ObjectIdentifier)) {
                i = i2 + 1;
                rdnArr[i2] = rdn;
                i2 = i;
                break;
            }
        }
        RDN[] rdnArr2 = new RDN[i2];
        System.arraycopy(rdnArr, 0, rdnArr2, 0, rdnArr2.length);
        return rdnArr2;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.rdns);
    }

    @Override // org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        }
        this.isHashCodeCalculated = true;
        this.hashCodeValue = this.style.calculateHashCode(this);
        return this.hashCodeValue;
    }

    @Override // org.spongycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X500Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            return this.style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable) obj).toASN1Primitive())));
        } catch (Exception unused) {
            return false;
        }
    }

    public String toString() {
        return this.style.toString(this);
    }

    public static void setDefaultStyle(X500NameStyle x500NameStyle) {
        if (x500NameStyle == null) {
            throw new NullPointerException("cannot set style to null");
        }
        defaultStyle = x500NameStyle;
    }

    public static X500NameStyle getDefaultStyle() {
        return defaultStyle;
    }
}
