package org.spongycastle.crypto.generators;

import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.MacDerivationFunction;
import org.spongycastle.crypto.params.KDFCounterParameters;
import org.spongycastle.crypto.params.KeyParameter;
/* loaded from: classes.dex */
public class KDFCounterBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] fixedInputDataCtrPrefix;
    private byte[] fixedInputData_afterCtr;
    private int generatedBytes;
    private final int h;
    private byte[] ios;
    private byte[] k;
    private int maxSizeExcl;
    private final Mac prf;

    public KDFCounterBytesGenerator(Mac mac) {
        this.prf = mac;
        this.h = mac.getMacSize();
        this.k = new byte[this.h];
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFCounterParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFCounterParameters kDFCounterParameters = (KDFCounterParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFCounterParameters.getKI()));
        this.fixedInputDataCtrPrefix = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.fixedInputData_afterCtr = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r = kDFCounterParameters.getR();
        this.ios = new byte[r / 8];
        BigInteger multiply = TWO.pow(r).multiply(BigInteger.valueOf(this.h));
        this.maxSizeExcl = multiply.compareTo(INTEGER_MAX) == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : multiply.intValue();
        this.generatedBytes = 0;
    }

    @Override // org.spongycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) {
        int i3 = this.generatedBytes + i2;
        if (i3 < 0 || i3 >= this.maxSizeExcl) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.maxSizeExcl + " bytes");
        }
        if (this.generatedBytes % this.h == 0) {
            generateNext();
        }
        int i4 = this.generatedBytes % this.h;
        int min = Math.min(this.h - (this.generatedBytes % this.h), i2);
        System.arraycopy(this.k, i4, bArr, i, min);
        this.generatedBytes += min;
        int i5 = i2 - min;
        int i6 = i + min;
        while (i5 > 0) {
            generateNext();
            int min2 = Math.min(this.h, i5);
            System.arraycopy(this.k, 0, bArr, i6, min2);
            this.generatedBytes += min2;
            i5 -= min2;
            i6 += min2;
        }
        return i2;
    }

    private void generateNext() {
        int i = (this.generatedBytes / this.h) + 1;
        switch (this.ios.length) {
            case 1:
                break;
            case 4:
                this.ios[0] = (byte) (i >>> 24);
            case 3:
                this.ios[this.ios.length - 3] = (byte) (i >>> 16);
            case 2:
                this.ios[this.ios.length - 2] = (byte) (i >>> 8);
                break;
            default:
                throw new IllegalStateException("Unsupported size of counter i");
        }
        this.ios[this.ios.length - 1] = (byte) i;
        this.prf.update(this.fixedInputDataCtrPrefix, 0, this.fixedInputDataCtrPrefix.length);
        this.prf.update(this.ios, 0, this.ios.length);
        this.prf.update(this.fixedInputData_afterCtr, 0, this.fixedInputData_afterCtr.length);
        this.prf.doFinal(this.k, 0);
    }
}
