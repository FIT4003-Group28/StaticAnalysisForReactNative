package org.spongycastle.pqc.asn1;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.bc.BCObjectIdentifiers;
import org.spongycastle.pqc.crypto.gmss.GMSSKeyPairGenerator;
import org.spongycastle.pqc.crypto.mceliece.McElieceFujisakiCipher;
import org.spongycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher;
import org.spongycastle.pqc.crypto.mceliece.McEliecePointchevalCipher;
/* loaded from: classes2.dex */
public interface PQCObjectIdentifiers {
    public static final ASN1ObjectIdentifier rainbow = new ASN1ObjectIdentifier("1.3.6.1.4.1.8301.3.1.3.5.3.2");
    public static final ASN1ObjectIdentifier rainbowWithSha1 = rainbow.branch("1");
    public static final ASN1ObjectIdentifier rainbowWithSha224 = rainbow.branch("2");
    public static final ASN1ObjectIdentifier rainbowWithSha256 = rainbow.branch("3");
    public static final ASN1ObjectIdentifier rainbowWithSha384 = rainbow.branch("4");
    public static final ASN1ObjectIdentifier rainbowWithSha512 = rainbow.branch("5");
    public static final ASN1ObjectIdentifier gmss = new ASN1ObjectIdentifier(GMSSKeyPairGenerator.OID);
    public static final ASN1ObjectIdentifier gmssWithSha1 = gmss.branch("1");
    public static final ASN1ObjectIdentifier gmssWithSha224 = gmss.branch("2");
    public static final ASN1ObjectIdentifier gmssWithSha256 = gmss.branch("3");
    public static final ASN1ObjectIdentifier gmssWithSha384 = gmss.branch("4");
    public static final ASN1ObjectIdentifier gmssWithSha512 = gmss.branch("5");
    public static final ASN1ObjectIdentifier mcEliece = new ASN1ObjectIdentifier("1.3.6.1.4.1.8301.3.1.3.4.1");
    public static final ASN1ObjectIdentifier mcElieceCca2 = new ASN1ObjectIdentifier("1.3.6.1.4.1.8301.3.1.3.4.2");
    public static final ASN1ObjectIdentifier mcElieceFujisaki = new ASN1ObjectIdentifier(McElieceFujisakiCipher.OID);
    public static final ASN1ObjectIdentifier mcEliecePointcheval = new ASN1ObjectIdentifier(McEliecePointchevalCipher.OID);
    public static final ASN1ObjectIdentifier mcElieceKobara_Imai = new ASN1ObjectIdentifier(McElieceKobaraImaiCipher.OID);
    public static final ASN1ObjectIdentifier sphincs256 = BCObjectIdentifiers.sphincs256;
    public static final ASN1ObjectIdentifier sphincs256_with_BLAKE512 = BCObjectIdentifiers.sphincs256_with_BLAKE512;
    public static final ASN1ObjectIdentifier sphincs256_with_SHA512 = BCObjectIdentifiers.sphincs256_with_SHA512;
    public static final ASN1ObjectIdentifier sphincs256_with_SHA3_512 = BCObjectIdentifiers.sphincs256_with_SHA3_512;
    public static final ASN1ObjectIdentifier newHope = BCObjectIdentifiers.newHope;
}
