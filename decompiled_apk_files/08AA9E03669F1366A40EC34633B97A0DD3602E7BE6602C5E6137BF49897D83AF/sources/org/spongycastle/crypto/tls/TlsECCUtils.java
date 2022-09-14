package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import org.spongycastle.asn1.x9.ECNamedCurveTable;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.agreement.ECDHBasicAgreement;
import org.spongycastle.crypto.ec.CustomNamedCurves;
import org.spongycastle.crypto.generators.ECKeyPairGenerator;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyGenerationParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.field.PolynomialExtensionField;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.Integers;
/* loaded from: classes.dex */
public class TlsECCUtils {
    public static final Integer EXT_elliptic_curves = Integers.valueOf(10);
    public static final Integer EXT_ec_point_formats = Integers.valueOf(11);
    private static final String[] CURVE_NAMES = {"sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1"};

    public static boolean isECCCipherSuite(int i) {
        if (i != 52396) {
            switch (i) {
                case CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA /* 49153 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA /* 49154 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49155 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA /* 49156 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA /* 49157 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA /* 49158 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA /* 49159 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49160 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA /* 49161 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA /* 49162 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA /* 49163 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA /* 49164 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA /* 49165 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA /* 49166 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA /* 49167 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA /* 49168 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA /* 49169 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA /* 49170 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA /* 49171 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA /* 49172 */:
                case CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA /* 49173 */:
                case CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA /* 49174 */:
                case CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA /* 49175 */:
                case CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA /* 49176 */:
                case CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA /* 49177 */:
                    return true;
                default:
                    switch (i) {
                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
                        case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
                        case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
                        case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
                        case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
                        case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
                        case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
                        case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
                        case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
                        case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
                        case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                        case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
                        case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
                        case CipherSuite.TLS_ECDHE_PSK_WITH_RC4_128_SHA /* 49203 */:
                        case CipherSuite.TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA /* 49204 */:
                        case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA /* 49205 */:
                        case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA /* 49206 */:
                        case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256 /* 49207 */:
                        case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384 /* 49208 */:
                        case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA /* 49209 */:
                        case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA256 /* 49210 */:
                        case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA384 /* 49211 */:
                            return true;
                        default:
                            switch (i) {
                                case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
                                case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
                                case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
                                case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
                                case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
                                case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
                                case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
                                case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
                                    return true;
                                default:
                                    switch (i) {
                                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                                        case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                                        case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                                        case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                                        case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                                        case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                                        case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                                            return true;
                                        default:
                                            switch (i) {
                                                case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49306 */:
                                                case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49307 */:
                                                    return true;
                                                default:
                                                    switch (i) {
                                                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
                                                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
                                                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
                                                        case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52392 */:
                                                                case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52393 */:
                                                                    return true;
                                                                default:
                                                                    switch (i) {
                                                                        case 65282:
                                                                        case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_AES_256_OCB /* 65283 */:
                                                                        case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_128_OCB /* 65284 */:
                                                                        case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_256_OCB /* 65285 */:
                                                                            return true;
                                                                        default:
                                                                            switch (i) {
                                                                                case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_128_OCB /* 65300 */:
                                                                                case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_256_OCB /* 65301 */:
                                                                                    return true;
                                                                                default:
                                                                                    return false;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return true;
    }

    public static ECPublicKeyParameters validateECPublicKey(ECPublicKeyParameters eCPublicKeyParameters) {
        return eCPublicKeyParameters;
    }

    public static void addSupportedEllipticCurvesExtension(Hashtable hashtable, int[] iArr) {
        hashtable.put(EXT_elliptic_curves, createSupportedEllipticCurvesExtension(iArr));
    }

    public static void addSupportedPointFormatsExtension(Hashtable hashtable, short[] sArr) {
        hashtable.put(EXT_ec_point_formats, createSupportedPointFormatsExtension(sArr));
    }

    public static int[] getSupportedEllipticCurvesExtension(Hashtable hashtable) {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, EXT_elliptic_curves);
        if (extensionData == null) {
            return null;
        }
        return readSupportedEllipticCurvesExtension(extensionData);
    }

    public static short[] getSupportedPointFormatsExtension(Hashtable hashtable) {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, EXT_ec_point_formats);
        if (extensionData == null) {
            return null;
        }
        return readSupportedPointFormatsExtension(extensionData);
    }

    public static byte[] createSupportedEllipticCurvesExtension(int[] iArr) {
        if (iArr == null || iArr.length < 1) {
            throw new TlsFatalAlert((short) 80);
        }
        return TlsUtils.encodeUint16ArrayWithUint16Length(iArr);
    }

    public static byte[] createSupportedPointFormatsExtension(short[] sArr) {
        if (sArr == null || !Arrays.contains(sArr, (short) 0)) {
            sArr = Arrays.append(sArr, (short) 0);
        }
        return TlsUtils.encodeUint8ArrayWithUint8Length(sArr);
    }

    public static int[] readSupportedEllipticCurvesExtension(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int readUint16 = TlsUtils.readUint16(byteArrayInputStream);
        if (readUint16 < 2 || (readUint16 & 1) != 0) {
            throw new TlsFatalAlert((short) 50);
        }
        int[] readUint16Array = TlsUtils.readUint16Array(readUint16 / 2, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        return readUint16Array;
    }

    public static short[] readSupportedPointFormatsExtension(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        short readUint8 = TlsUtils.readUint8(byteArrayInputStream);
        if (readUint8 < 1) {
            throw new TlsFatalAlert((short) 50);
        }
        short[] readUint8Array = TlsUtils.readUint8Array(readUint8, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        if (Arrays.contains(readUint8Array, (short) 0)) {
            return readUint8Array;
        }
        throw new TlsFatalAlert((short) 47);
    }

    public static String getNameOfNamedCurve(int i) {
        if (isSupportedNamedCurve(i)) {
            return CURVE_NAMES[i - 1];
        }
        return null;
    }

    public static ECDomainParameters getParametersForNamedCurve(int i) {
        String nameOfNamedCurve = getNameOfNamedCurve(i);
        if (nameOfNamedCurve == null) {
            return null;
        }
        X9ECParameters byName = CustomNamedCurves.getByName(nameOfNamedCurve);
        if (byName != null || (byName = ECNamedCurveTable.getByName(nameOfNamedCurve)) != null) {
            return new ECDomainParameters(byName.getCurve(), byName.getG(), byName.getN(), byName.getH(), byName.getSeed());
        }
        return null;
    }

    public static boolean hasAnySupportedNamedCurves() {
        return CURVE_NAMES.length > 0;
    }

    public static boolean containsECCCipherSuites(int[] iArr) {
        for (int i : iArr) {
            if (isECCCipherSuite(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean areOnSameCurve(ECDomainParameters eCDomainParameters, ECDomainParameters eCDomainParameters2) {
        return eCDomainParameters != null && eCDomainParameters.equals(eCDomainParameters2);
    }

    public static boolean isSupportedNamedCurve(int i) {
        return i > 0 && i <= CURVE_NAMES.length;
    }

    public static boolean isCompressionPreferred(short[] sArr, short s) {
        short s2;
        if (sArr == null) {
            return false;
        }
        for (int i = 0; i < sArr.length && (s2 = sArr[i]) != 0; i++) {
            if (s2 == s) {
                return true;
            }
        }
        return false;
    }

    public static byte[] serializeECFieldElement(int i, BigInteger bigInteger) {
        return BigIntegers.asUnsignedByteArray((i + 7) / 8, bigInteger);
    }

    public static byte[] serializeECPoint(short[] sArr, ECPoint eCPoint) {
        boolean isCompressionPreferred;
        ECCurve curve = eCPoint.getCurve();
        if (ECAlgorithms.isFpCurve(curve)) {
            isCompressionPreferred = isCompressionPreferred(sArr, (short) 1);
        } else {
            isCompressionPreferred = ECAlgorithms.isF2mCurve(curve) ? isCompressionPreferred(sArr, (short) 2) : false;
        }
        return eCPoint.getEncoded(isCompressionPreferred);
    }

    public static byte[] serializeECPublicKey(short[] sArr, ECPublicKeyParameters eCPublicKeyParameters) {
        return serializeECPoint(sArr, eCPublicKeyParameters.getQ());
    }

    public static BigInteger deserializeECFieldElement(int i, byte[] bArr) {
        if (bArr.length != (i + 7) / 8) {
            throw new TlsFatalAlert((short) 50);
        }
        return new BigInteger(1, bArr);
    }

    public static ECPoint deserializeECPoint(short[] sArr, ECCurve eCCurve, byte[] bArr) {
        if (bArr != null) {
            short s = 1;
            if (bArr.length >= 1) {
                switch (bArr[0]) {
                    case 2:
                    case 3:
                        if (ECAlgorithms.isF2mCurve(eCCurve)) {
                            s = 2;
                            break;
                        } else if (!ECAlgorithms.isFpCurve(eCCurve)) {
                            throw new TlsFatalAlert((short) 47);
                        }
                        break;
                    case 4:
                        s = 0;
                        break;
                    default:
                        throw new TlsFatalAlert((short) 47);
                }
                if (s != 0 && (sArr == null || !Arrays.contains(sArr, s))) {
                    throw new TlsFatalAlert((short) 47);
                }
                return eCCurve.decodePoint(bArr);
            }
        }
        throw new TlsFatalAlert((short) 47);
    }

    public static ECPublicKeyParameters deserializeECPublicKey(short[] sArr, ECDomainParameters eCDomainParameters, byte[] bArr) {
        try {
            return new ECPublicKeyParameters(deserializeECPoint(sArr, eCDomainParameters.getCurve(), bArr), eCDomainParameters);
        } catch (RuntimeException e) {
            throw new TlsFatalAlert((short) 47, e);
        }
    }

    public static byte[] calculateECDHBasicAgreement(ECPublicKeyParameters eCPublicKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters) {
        ECDHBasicAgreement eCDHBasicAgreement = new ECDHBasicAgreement();
        eCDHBasicAgreement.init(eCPrivateKeyParameters);
        return BigIntegers.asUnsignedByteArray(eCDHBasicAgreement.getFieldSize(), eCDHBasicAgreement.calculateAgreement(eCPublicKeyParameters));
    }

    public static AsymmetricCipherKeyPair generateECKeyPair(SecureRandom secureRandom, ECDomainParameters eCDomainParameters) {
        ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
        eCKeyPairGenerator.init(new ECKeyGenerationParameters(eCDomainParameters, secureRandom));
        return eCKeyPairGenerator.generateKeyPair();
    }

    public static ECPrivateKeyParameters generateEphemeralClientKeyExchange(SecureRandom secureRandom, short[] sArr, ECDomainParameters eCDomainParameters, OutputStream outputStream) {
        AsymmetricCipherKeyPair generateECKeyPair = generateECKeyPair(secureRandom, eCDomainParameters);
        writeECPoint(sArr, ((ECPublicKeyParameters) generateECKeyPair.getPublic()).getQ(), outputStream);
        return (ECPrivateKeyParameters) generateECKeyPair.getPrivate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ECPrivateKeyParameters generateEphemeralServerKeyExchange(SecureRandom secureRandom, int[] iArr, short[] sArr, OutputStream outputStream) {
        int i;
        if (iArr != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr.length) {
                    i = -1;
                    break;
                }
                int i3 = iArr[i2];
                if (NamedCurve.isValid(i3) && isSupportedNamedCurve(i3)) {
                    i = i3;
                    break;
                }
                i2++;
            }
        } else {
            i = 23;
        }
        ECDomainParameters eCDomainParameters = null;
        if (i >= 0) {
            eCDomainParameters = getParametersForNamedCurve(i);
        } else if (Arrays.contains(iArr, 65281)) {
            eCDomainParameters = getParametersForNamedCurve(23);
        } else if (Arrays.contains(iArr, 65282)) {
            eCDomainParameters = getParametersForNamedCurve(10);
        }
        if (eCDomainParameters == null) {
            throw new TlsFatalAlert((short) 80);
        }
        if (i < 0) {
            writeExplicitECParameters(sArr, eCDomainParameters, outputStream);
        } else {
            writeNamedECParameters(i, outputStream);
        }
        return generateEphemeralClientKeyExchange(secureRandom, sArr, eCDomainParameters, outputStream);
    }

    public static int readECExponent(int i, InputStream inputStream) {
        int intValue;
        BigInteger readECParameter = readECParameter(inputStream);
        if (readECParameter.bitLength() >= 32 || (intValue = readECParameter.intValue()) <= 0 || intValue >= i) {
            throw new TlsFatalAlert((short) 47);
        }
        return intValue;
    }

    public static BigInteger readECFieldElement(int i, InputStream inputStream) {
        return deserializeECFieldElement(i, TlsUtils.readOpaque8(inputStream));
    }

    public static BigInteger readECParameter(InputStream inputStream) {
        return new BigInteger(1, TlsUtils.readOpaque8(inputStream));
    }

    public static ECDomainParameters readECParameters(int[] iArr, short[] sArr, InputStream inputStream) {
        int i;
        int i2;
        try {
            switch (TlsUtils.readUint8(inputStream)) {
                case 1:
                    checkNamedCurve(iArr, 65281);
                    BigInteger readECParameter = readECParameter(inputStream);
                    BigInteger readECFieldElement = readECFieldElement(readECParameter.bitLength(), inputStream);
                    BigInteger readECFieldElement2 = readECFieldElement(readECParameter.bitLength(), inputStream);
                    byte[] readOpaque8 = TlsUtils.readOpaque8(inputStream);
                    BigInteger readECParameter2 = readECParameter(inputStream);
                    BigInteger readECParameter3 = readECParameter(inputStream);
                    ECCurve.Fp fp = new ECCurve.Fp(readECParameter, readECFieldElement, readECFieldElement2, readECParameter2, readECParameter3);
                    return new ECDomainParameters(fp, deserializeECPoint(sArr, fp, readOpaque8), readECParameter2, readECParameter3);
                case 2:
                    checkNamedCurve(iArr, 65282);
                    int readUint16 = TlsUtils.readUint16(inputStream);
                    short readUint8 = TlsUtils.readUint8(inputStream);
                    if (!ECBasisType.isValid(readUint8)) {
                        throw new TlsFatalAlert((short) 47);
                    }
                    int readECExponent = readECExponent(readUint16, inputStream);
                    if (readUint8 == 2) {
                        int readECExponent2 = readECExponent(readUint16, inputStream);
                        i2 = readECExponent(readUint16, inputStream);
                        i = readECExponent2;
                    } else {
                        i = -1;
                        i2 = -1;
                    }
                    BigInteger readECFieldElement3 = readECFieldElement(readUint16, inputStream);
                    BigInteger readECFieldElement4 = readECFieldElement(readUint16, inputStream);
                    byte[] readOpaque82 = TlsUtils.readOpaque8(inputStream);
                    BigInteger readECParameter4 = readECParameter(inputStream);
                    BigInteger readECParameter5 = readECParameter(inputStream);
                    ECCurve.F2m f2m = readUint8 == 2 ? new ECCurve.F2m(readUint16, readECExponent, i, i2, readECFieldElement3, readECFieldElement4, readECParameter4, readECParameter5) : new ECCurve.F2m(readUint16, readECExponent, readECFieldElement3, readECFieldElement4, readECParameter4, readECParameter5);
                    return new ECDomainParameters(f2m, deserializeECPoint(sArr, f2m, readOpaque82), readECParameter4, readECParameter5);
                case 3:
                    int readUint162 = TlsUtils.readUint16(inputStream);
                    if (!NamedCurve.refersToASpecificNamedCurve(readUint162)) {
                        throw new TlsFatalAlert((short) 47);
                    }
                    checkNamedCurve(iArr, readUint162);
                    return getParametersForNamedCurve(readUint162);
                default:
                    throw new TlsFatalAlert((short) 47);
            }
        } catch (RuntimeException e) {
            throw new TlsFatalAlert((short) 47, e);
        }
    }

    private static void checkNamedCurve(int[] iArr, int i) {
        if (iArr == null || Arrays.contains(iArr, i)) {
            return;
        }
        throw new TlsFatalAlert((short) 47);
    }

    public static void writeECExponent(int i, OutputStream outputStream) {
        writeECParameter(BigInteger.valueOf(i), outputStream);
    }

    public static void writeECFieldElement(ECFieldElement eCFieldElement, OutputStream outputStream) {
        TlsUtils.writeOpaque8(eCFieldElement.getEncoded(), outputStream);
    }

    public static void writeECFieldElement(int i, BigInteger bigInteger, OutputStream outputStream) {
        TlsUtils.writeOpaque8(serializeECFieldElement(i, bigInteger), outputStream);
    }

    public static void writeECParameter(BigInteger bigInteger, OutputStream outputStream) {
        TlsUtils.writeOpaque8(BigIntegers.asUnsignedByteArray(bigInteger), outputStream);
    }

    public static void writeExplicitECParameters(short[] sArr, ECDomainParameters eCDomainParameters, OutputStream outputStream) {
        ECCurve curve = eCDomainParameters.getCurve();
        if (ECAlgorithms.isFpCurve(curve)) {
            TlsUtils.writeUint8((short) 1, outputStream);
            writeECParameter(curve.getField().getCharacteristic(), outputStream);
        } else if (ECAlgorithms.isF2mCurve(curve)) {
            int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
            TlsUtils.writeUint8((short) 2, outputStream);
            int i = exponentsPresent[exponentsPresent.length - 1];
            TlsUtils.checkUint16(i);
            TlsUtils.writeUint16(i, outputStream);
            if (exponentsPresent.length == 3) {
                TlsUtils.writeUint8((short) 1, outputStream);
                writeECExponent(exponentsPresent[1], outputStream);
            } else if (exponentsPresent.length == 5) {
                TlsUtils.writeUint8((short) 2, outputStream);
                writeECExponent(exponentsPresent[1], outputStream);
                writeECExponent(exponentsPresent[2], outputStream);
                writeECExponent(exponentsPresent[3], outputStream);
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        } else {
            throw new IllegalArgumentException("'ecParameters' not a known curve type");
        }
        writeECFieldElement(curve.getA(), outputStream);
        writeECFieldElement(curve.getB(), outputStream);
        TlsUtils.writeOpaque8(serializeECPoint(sArr, eCDomainParameters.getG()), outputStream);
        writeECParameter(eCDomainParameters.getN(), outputStream);
        writeECParameter(eCDomainParameters.getH(), outputStream);
    }

    public static void writeECPoint(short[] sArr, ECPoint eCPoint, OutputStream outputStream) {
        TlsUtils.writeOpaque8(serializeECPoint(sArr, eCPoint), outputStream);
    }

    public static void writeNamedECParameters(int i, OutputStream outputStream) {
        if (!NamedCurve.refersToASpecificNamedCurve(i)) {
            throw new TlsFatalAlert((short) 80);
        }
        TlsUtils.writeUint8((short) 3, outputStream);
        TlsUtils.checkUint16(i);
        TlsUtils.writeUint16(i, outputStream);
    }
}
