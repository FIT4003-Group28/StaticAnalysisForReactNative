package org.spongycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.spongycastle.pqc.crypto.rainbow.util.GF2Field;
/* loaded from: classes2.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private short[][] A1;
    private short[][] A1inv;
    private short[][] A2;
    private short[][] A2inv;
    private short[] b1;
    private short[] b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;
    private SecureRandom sr;

    /* renamed from: vi  reason: collision with root package name */
    private int[] f5689vi;

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(this.f5689vi[this.f5689vi.length - 1] - this.f5689vi[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.A1inv, this.b1, this.A2inv, this.b2, this.f5689vi, this.layers));
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.rainbowParams = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.sr = new SecureRandom();
        this.f5689vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(new SecureRandom(), new RainbowParameters()));
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    private void generateL1() {
        int i = this.f5689vi[this.f5689vi.length - 1] - this.f5689vi[0];
        this.A1 = (short[][]) Array.newInstance(short.class, i, i);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    this.A1[i2][i3] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.A1);
        }
        this.b1 = new short[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.b1[i4] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int i;
        int i2 = this.f5689vi[this.f5689vi.length - 1];
        this.A2 = (short[][]) Array.newInstance(short.class, i2, i2);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (true) {
            if (this.A2inv != null) {
                break;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    this.A2[i3][i4] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.A2);
        }
        this.b2 = new short[i2];
        for (i = 0; i < i2; i++) {
            this.b2[i] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i = 0;
        while (i < this.numOfLayers) {
            int i2 = i + 1;
            this.layers[i] = new Layer(this.f5689vi[i], this.f5689vi[i2], this.sr);
            i = i2;
        }
    }

    private void computePublicKey() {
        ComputeInField computeInField = new ComputeInField();
        int i = 0;
        int i2 = this.f5689vi[this.f5689vi.length - 1] - this.f5689vi[0];
        int i3 = this.f5689vi[this.f5689vi.length - 1];
        short[][][] sArr = (short[][][]) Array.newInstance(short.class, i2, i3, i3);
        this.pub_singular = (short[][]) Array.newInstance(short.class, i2, i3);
        this.pub_scalar = new short[i2];
        short[] sArr2 = new short[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.layers.length) {
            short[][][] coeffAlpha = this.layers[i4].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i4].getCoeffBeta();
            short[][] coeffGamma = this.layers[i4].getCoeffGamma();
            short[] coeffEta = this.layers[i4].getCoeffEta();
            int length = coeffAlpha[i].length;
            int length2 = coeffBeta[i].length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = 0;
                while (i7 < length) {
                    while (i < length2) {
                        int i8 = i2;
                        int i9 = i3;
                        int i10 = i7 + length2;
                        short[] multVect = computeInField.multVect(coeffAlpha[i6][i7][i], this.A2[i10]);
                        int i11 = i5 + i6;
                        sArr[i11] = computeInField.addSquareMatrix(sArr[i11], computeInField.multVects(multVect, this.A2[i]));
                        this.pub_singular[i11] = computeInField.addVect(computeInField.multVect(this.b2[i], multVect), this.pub_singular[i11]);
                        this.pub_singular[i11] = computeInField.addVect(computeInField.multVect(this.b2[i10], computeInField.multVect(coeffAlpha[i6][i7][i], this.A2[i])), this.pub_singular[i11]);
                        this.pub_scalar[i11] = GF2Field.addElem(this.pub_scalar[i11], GF2Field.multElem(GF2Field.multElem(coeffAlpha[i6][i7][i], this.b2[i10]), this.b2[i]));
                        i++;
                        i2 = i8;
                        i3 = i9;
                        i4 = i4;
                        coeffEta = coeffEta;
                        coeffAlpha = coeffAlpha;
                    }
                    i7++;
                    i = 0;
                }
                int i12 = i2;
                int i13 = i3;
                int i14 = i4;
                short[][][] sArr3 = coeffAlpha;
                short[] sArr4 = coeffEta;
                for (int i15 = 0; i15 < length2; i15++) {
                    for (int i16 = 0; i16 < length2; i16++) {
                        short[] multVect2 = computeInField.multVect(coeffBeta[i6][i15][i16], this.A2[i15]);
                        int i17 = i5 + i6;
                        sArr[i17] = computeInField.addSquareMatrix(sArr[i17], computeInField.multVects(multVect2, this.A2[i16]));
                        this.pub_singular[i17] = computeInField.addVect(computeInField.multVect(this.b2[i16], multVect2), this.pub_singular[i17]);
                        this.pub_singular[i17] = computeInField.addVect(computeInField.multVect(this.b2[i15], computeInField.multVect(coeffBeta[i6][i15][i16], this.A2[i16])), this.pub_singular[i17]);
                        this.pub_scalar[i17] = GF2Field.addElem(this.pub_scalar[i17], GF2Field.multElem(GF2Field.multElem(coeffBeta[i6][i15][i16], this.b2[i15]), this.b2[i16]));
                    }
                }
                for (int i18 = 0; i18 < length2 + length; i18++) {
                    int i19 = i5 + i6;
                    this.pub_singular[i19] = computeInField.addVect(computeInField.multVect(coeffGamma[i6][i18], this.A2[i18]), this.pub_singular[i19]);
                    this.pub_scalar[i19] = GF2Field.addElem(this.pub_scalar[i19], GF2Field.multElem(coeffGamma[i6][i18], this.b2[i18]));
                }
                int i20 = i5 + i6;
                this.pub_scalar[i20] = GF2Field.addElem(this.pub_scalar[i20], sArr4[i6]);
                i6++;
                i2 = i12;
                i3 = i13;
                i4 = i14;
                coeffEta = sArr4;
                coeffAlpha = sArr3;
                i = 0;
            }
            i5 += length;
            i4++;
            i = 0;
        }
        short[][][] sArr5 = (short[][][]) Array.newInstance(short.class, i2, i3, i3);
        short[][] sArr6 = (short[][]) Array.newInstance(short.class, i2, i3);
        short[] sArr7 = new short[i2];
        for (int i21 = 0; i21 < i2; i21++) {
            for (int i22 = 0; i22 < this.A1.length; i22++) {
                sArr5[i21] = computeInField.addSquareMatrix(sArr5[i21], computeInField.multMatrix(this.A1[i21][i22], sArr[i22]));
                sArr6[i21] = computeInField.addVect(sArr6[i21], computeInField.multVect(this.A1[i21][i22], this.pub_singular[i22]));
                sArr7[i21] = GF2Field.addElem(sArr7[i21], GF2Field.multElem(this.A1[i21][i22], this.pub_scalar[i22]));
            }
            sArr7[i21] = GF2Field.addElem(sArr7[i21], this.b1[i21]);
        }
        this.pub_singular = sArr6;
        this.pub_scalar = sArr7;
        compactPublicKey(sArr5);
    }

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance(short.class, length, ((length2 + 1) * length2) / 2);
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < length2) {
                int i4 = i3;
                for (int i5 = i2; i5 < length2; i5++) {
                    if (i5 == i2) {
                        this.pub_quadratic[i][i4] = sArr[i][i2][i5];
                    } else {
                        this.pub_quadratic[i][i4] = GF2Field.addElem(sArr[i][i2][i5], sArr[i][i5][i2]);
                    }
                    i4++;
                }
                i2++;
                i3 = i4;
            }
        }
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }
}
