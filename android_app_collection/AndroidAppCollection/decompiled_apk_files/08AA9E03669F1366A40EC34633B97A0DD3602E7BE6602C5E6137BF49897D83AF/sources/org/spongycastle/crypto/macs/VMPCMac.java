package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
/* loaded from: classes.dex */
public class VMPCMac implements Mac {
    private byte[] T;
    private byte g;
    private byte[] workingIV;
    private byte[] workingKey;
    private byte x1;
    private byte x2;
    private byte x3;
    private byte x4;
    private byte n = 0;
    private byte[] P = null;
    private byte s = 0;

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        for (int i2 = 1; i2 < 25; i2++) {
            this.s = this.P[(this.s + this.P[this.n & 255]) & 255];
            this.x4 = this.P[(this.x4 + this.x3 + i2) & 255];
            this.x3 = this.P[(this.x3 + this.x2 + i2) & 255];
            this.x2 = this.P[(this.x2 + this.x1 + i2) & 255];
            this.x1 = this.P[(this.x1 + this.s + i2) & 255];
            this.T[this.g & 31] = (byte) (this.T[this.g & 31] ^ this.x1);
            this.T[(this.g + 1) & 31] = (byte) (this.T[(this.g + 1) & 31] ^ this.x2);
            this.T[(this.g + 2) & 31] = (byte) (this.T[(this.g + 2) & 31] ^ this.x3);
            this.T[(this.g + 3) & 31] = (byte) (this.T[(this.g + 3) & 31] ^ this.x4);
            this.g = (byte) ((this.g + 4) & 31);
            byte b2 = this.P[this.n & 255];
            this.P[this.n & 255] = this.P[this.s & 255];
            this.P[this.s & 255] = b2;
            this.n = (byte) ((this.n + 1) & 255);
        }
        for (int i3 = 0; i3 < 768; i3++) {
            int i4 = i3 & 255;
            this.s = this.P[(this.s + this.P[i4] + this.T[i3 & 31]) & 255];
            byte b3 = this.P[i4];
            this.P[i4] = this.P[this.s & 255];
            this.P[this.s & 255] = b3;
        }
        byte[] bArr2 = new byte[20];
        for (int i5 = 0; i5 < 20; i5++) {
            int i6 = i5 & 255;
            this.s = this.P[(this.s + this.P[i6]) & 255];
            bArr2[i5] = this.P[(this.P[this.P[this.s & 255] & 255] + 1) & 255];
            byte b4 = this.P[i6];
            this.P[i6] = this.P[this.s & 255];
            this.P[this.s & 255] = b4;
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        reset();
        return bArr2.length;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        this.workingIV = parametersWithIV.getIV();
        if (this.workingIV == null || this.workingIV.length < 1 || this.workingIV.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.s = (byte) 0;
        this.P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            int i3 = i2 & 255;
            this.s = this.P[(this.s + this.P[i3] + bArr[i2 % bArr.length]) & 255];
            byte b2 = this.P[i3];
            this.P[i3] = this.P[this.s & 255];
            this.P[this.s & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            int i5 = i4 & 255;
            this.s = this.P[(this.s + this.P[i5] + bArr2[i4 % bArr2.length]) & 255];
            byte b3 = this.P[i5];
            this.P[i5] = this.P[this.s & 255];
            this.P[this.s & 255] = b3;
        }
        this.n = (byte) 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.n = (byte) 0;
        this.x4 = (byte) 0;
        this.x3 = (byte) 0;
        this.x2 = (byte) 0;
        this.x1 = (byte) 0;
        this.g = (byte) 0;
        this.T = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.T[i] = 0;
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b2) {
        this.s = this.P[(this.s + this.P[this.n & 255]) & 255];
        this.x4 = this.P[(this.x4 + this.x3) & 255];
        this.x3 = this.P[(this.x3 + this.x2) & 255];
        this.x2 = this.P[(this.x2 + this.x1) & 255];
        this.x1 = this.P[(this.x1 + this.s + ((byte) (b2 ^ this.P[(this.P[this.P[this.s & 255] & 255] + 1) & 255]))) & 255];
        this.T[this.g & 31] = (byte) (this.T[this.g & 31] ^ this.x1);
        this.T[(this.g + 1) & 31] = (byte) (this.T[(this.g + 1) & 31] ^ this.x2);
        this.T[(this.g + 2) & 31] = (byte) (this.T[(this.g + 2) & 31] ^ this.x3);
        this.T[(this.g + 3) & 31] = (byte) (this.T[(this.g + 3) & 31] ^ this.x4);
        this.g = (byte) ((this.g + 4) & 31);
        byte b3 = this.P[this.n & 255];
        this.P[this.n & 255] = this.P[this.s & 255];
        this.P[this.s & 255] = b3;
        this.n = (byte) ((this.n + 1) & 255);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
