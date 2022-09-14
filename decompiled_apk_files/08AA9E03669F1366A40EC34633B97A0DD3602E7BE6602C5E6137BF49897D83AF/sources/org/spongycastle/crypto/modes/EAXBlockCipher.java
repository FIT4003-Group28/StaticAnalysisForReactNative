package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.macs.CMac;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
/* loaded from: classes.dex */
public class EAXBlockCipher implements AEADBlockCipher {
    private static final byte cTAG = 2;
    private static final byte hTAG = 1;
    private static final byte nTAG = 0;
    private byte[] associatedTextMac;
    private int blockSize;
    private byte[] bufBlock;
    private int bufOff;
    private SICBlockCipher cipher;
    private boolean cipherInitialized;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private Mac mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonceMac;

    public EAXBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        this.mac = new CMac(blockCipher);
        this.macBlock = new byte[this.blockSize];
        this.associatedTextMac = new byte[this.mac.getMacSize()];
        this.nonceMac = new byte[this.mac.getMacSize()];
        this.cipher = new SICBlockCipher(blockCipher);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + "/EAX";
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher.getUnderlyingCipher();
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        byte[] iv;
        CipherParameters parameters;
        this.forEncryption = z;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.mac.getMacSize() / 2;
            parameters = parametersWithIV.getParameters();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        }
        this.bufBlock = new byte[z ? this.blockSize : this.blockSize + this.macSize];
        byte[] bArr = new byte[this.blockSize];
        this.mac.init(parameters);
        bArr[this.blockSize - 1] = 0;
        this.mac.update(bArr, 0, this.blockSize);
        this.mac.update(iv, 0, iv.length);
        this.mac.doFinal(this.nonceMac, 0);
        this.cipher.init(true, new ParametersWithIV(null, this.nonceMac));
        reset();
    }

    private void initCipher() {
        if (this.cipherInitialized) {
            return;
        }
        this.cipherInitialized = true;
        this.mac.doFinal(this.associatedTextMac, 0);
        byte[] bArr = new byte[this.blockSize];
        bArr[this.blockSize - 1] = cTAG;
        this.mac.update(bArr, 0, this.blockSize);
    }

    private void calculateMac() {
        byte[] bArr = new byte[this.blockSize];
        this.mac.doFinal(bArr, 0);
        for (int i = 0; i < this.macBlock.length; i++) {
            this.macBlock[i] = (byte) ((this.nonceMac[i] ^ this.associatedTextMac[i]) ^ bArr[i]);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z) {
        this.cipher.reset();
        this.mac.reset();
        this.bufOff = 0;
        Arrays.fill(this.bufBlock, (byte) 0);
        if (z) {
            Arrays.fill(this.macBlock, (byte) 0);
        }
        byte[] bArr = new byte[this.blockSize];
        bArr[this.blockSize - 1] = hTAG;
        this.mac.update(bArr, 0, this.blockSize);
        this.cipherInitialized = false;
        if (this.initialAssociatedText != null) {
            processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b2) {
        if (this.cipherInitialized) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.mac.update(b2);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (this.cipherInitialized) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.mac.update(bArr, i, i2);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b2, byte[] bArr, int i) {
        initCipher();
        return process(b2, bArr, i);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        initCipher();
        if (bArr.length < i + i2) {
            throw new DataLengthException("Input buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 != i2; i5++) {
            i4 += process(bArr[i + i5], bArr2, i3 + i4);
        }
        return i4;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i) {
        initCipher();
        int i2 = this.bufOff;
        byte[] bArr2 = new byte[this.bufBlock.length];
        this.bufOff = 0;
        if (this.forEncryption) {
            int i3 = i + i2;
            if (bArr.length < this.macSize + i3) {
                throw new OutputLengthException("Output buffer too short");
            }
            this.cipher.processBlock(this.bufBlock, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i, i2);
            this.mac.update(bArr2, 0, i2);
            calculateMac();
            System.arraycopy(this.macBlock, 0, bArr, i3, this.macSize);
            reset(false);
            return i2 + this.macSize;
        } else if (i2 < this.macSize) {
            throw new InvalidCipherTextException("data too short");
        } else {
            if (bArr.length < (i + i2) - this.macSize) {
                throw new OutputLengthException("Output buffer too short");
            }
            if (i2 > this.macSize) {
                this.mac.update(this.bufBlock, 0, i2 - this.macSize);
                this.cipher.processBlock(this.bufBlock, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, i2 - this.macSize);
            }
            calculateMac();
            if (!verifyMac(this.bufBlock, i2 - this.macSize)) {
                throw new InvalidCipherTextException("mac check in EAX failed");
            }
            reset(false);
            return i2 - this.macSize;
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        byte[] bArr = new byte[this.macSize];
        System.arraycopy(this.macBlock, 0, bArr, 0, this.macSize);
        return bArr;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        if (!this.forEncryption) {
            if (i2 < this.macSize) {
                return 0;
            }
            i2 -= this.macSize;
        }
        return i2 - (i2 % this.blockSize);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i) {
        int i2 = i + this.bufOff;
        if (this.forEncryption) {
            return i2 + this.macSize;
        }
        if (i2 >= this.macSize) {
            return i2 - this.macSize;
        }
        return 0;
    }

    private int process(byte b2, byte[] bArr, int i) {
        int processBlock;
        byte[] bArr2 = this.bufBlock;
        int i2 = this.bufOff;
        this.bufOff = i2 + 1;
        bArr2[i2] = b2;
        if (this.bufOff == this.bufBlock.length) {
            if (bArr.length < this.blockSize + i) {
                throw new OutputLengthException("Output buffer is too short");
            }
            if (this.forEncryption) {
                processBlock = this.cipher.processBlock(this.bufBlock, 0, bArr, i);
                this.mac.update(bArr, i, this.blockSize);
            } else {
                this.mac.update(this.bufBlock, 0, this.blockSize);
                processBlock = this.cipher.processBlock(this.bufBlock, 0, bArr, i);
            }
            this.bufOff = 0;
            if (!this.forEncryption) {
                System.arraycopy(this.bufBlock, this.blockSize, this.bufBlock, 0, this.macSize);
                this.bufOff = this.macSize;
            }
            return processBlock;
        }
        return 0;
    }

    private boolean verifyMac(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.macSize; i3++) {
            i2 |= this.macBlock[i3] ^ bArr[i + i3];
        }
        return i2 == 0;
    }
}
