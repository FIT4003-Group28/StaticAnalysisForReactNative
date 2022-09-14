package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.x9.X962Parameters;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.spongycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.math.ec.ECCurve;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ECUtils {
    ECUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X9ECParameters getDomainParametersFromGenSpec(ECGenParameterSpec eCGenParameterSpec) {
        return getDomainParametersFromName(eCGenParameterSpec.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X9ECParameters getDomainParametersFromName(String str) {
        X9ECParameters namedCurveByName;
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                namedCurveByName = ECUtil.getNamedCurveByOid(new ASN1ObjectIdentifier(str));
                str = str;
            } else if (str.indexOf(32) > 0) {
                String substring = str.substring(str.indexOf(32) + 1);
                try {
                    X9ECParameters namedCurveByName2 = ECUtil.getNamedCurveByName(substring);
                    namedCurveByName = namedCurveByName2;
                    str = namedCurveByName2;
                } catch (IllegalArgumentException unused) {
                    str = substring;
                    return ECUtil.getNamedCurveByName(str);
                }
            } else {
                namedCurveByName = ECUtil.getNamedCurveByName(str);
                str = str;
            }
            return namedCurveByName;
        } catch (IllegalArgumentException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X962Parameters getDomainParametersFromName(ECParameterSpec eCParameterSpec, boolean z) {
        if (!(eCParameterSpec instanceof ECNamedCurveSpec)) {
            if (eCParameterSpec == null) {
                return new X962Parameters((ASN1Null) DERNull.INSTANCE);
            }
            ECCurve convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new X962Parameters(new X9ECParameters(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator(), z), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        ECNamedCurveSpec eCNamedCurveSpec = (ECNamedCurveSpec) eCParameterSpec;
        ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(eCNamedCurveSpec.getName());
        if (namedCurveOid == null) {
            namedCurveOid = new ASN1ObjectIdentifier(eCNamedCurveSpec.getName());
        }
        return new X962Parameters(namedCurveOid);
    }
}
