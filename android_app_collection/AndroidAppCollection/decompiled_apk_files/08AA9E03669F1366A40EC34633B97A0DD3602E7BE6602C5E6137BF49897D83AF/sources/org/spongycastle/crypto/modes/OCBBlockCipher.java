package org.spongycastle.crypto.modes;

import java.util.Vector;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.util.Arrays;
/* loaded from: classes.dex */
public class OCBBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] Checksum;
    private Vector L;
    private byte[] L_Asterisk;
    private byte[] L_Dollar;
    private byte[] OffsetHASH;
    private byte[] Sum;
    private boolean forEncryption;
    private byte[] hashBlock;
    private long hashBlockCount;
    private int hashBlockPos;
    private BlockCipher hashCipher;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private byte[] mainBlock;
    private long mainBlockCount;
    private int mainBlockPos;
    private BlockCipher mainCipher;
    private byte[] KtopInput = null;
    private byte[] Stretch = new byte[24];
    private byte[] OffsetMAIN_0 = new byte[16];
    private byte[] OffsetMAIN = new byte[16];

    protected static int OCB_ntz(long j) {
        if (j == 0) {
            return 64;
        }
        int i = 0;
        while ((1 & j) == 0) {
            i++;
            j >>>= 1;
        }
        return i;
    }

    public OCBBlockCipher(BlockCipher blockCipher, BlockCipher blockCipher2) {
        if (blockCipher == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (blockCipher2 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (blockCipher2.getBlockSize() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.hashCipher = blockCipher;
        this.mainCipher = blockCipher2;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.mainCipher;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.mainCipher.getAlgorithmName() + "/OCB";
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        byte[] iv;
        KeyParameter keyParameter;
        boolean z2 = this.forEncryption;
        this.forEncryption = z;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
            this.macSize = macSize / 8;
            keyParameter = aEADParameters.getKey();
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to OCB");
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[z ? 16 : this.macSize + 16];
        if (iv == null) {
            iv = new byte[0];
        }
        if (iv.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (keyParameter != null) {
            this.hashCipher.init(true, keyParameter);
            this.mainCipher.init(z, keyParameter);
            this.KtopInput = null;
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        this.L_Asterisk = new byte[16];
        this.hashCipher.processBlock(this.L_Asterisk, 0, this.L_Asterisk, 0);
        this.L_Dollar = OCB_double(this.L_Asterisk);
        this.L = new Vector();
        this.L.addElement(OCB_double(this.L_Dollar));
        int processNonce = processNonce(iv);
        int i = processNonce % 8;
        int i2 = processNonce / 8;
        if (i == 0) {
            System.arraycopy(this.Stretch, i2, this.OffsetMAIN_0, 0, 16);
        } else {
            int i3 = i2;
            for (int i4 = 0; i4 < 16; i4++) {
                i3++;
                this.OffsetMAIN_0[i4] = (byte) (((this.Stretch[i3] & 255) << i) | ((this.Stretch[i3] & 255) >>> (8 - i)));
            }
        }
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        this.OffsetHASH = new byte[16];
        this.Sum = new byte[16];
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.Checksum = new byte[16];
        if (this.initialAssociatedText == null) {
            return;
        }
        processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length);
    }

    protected int processNonce(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        System.arraycopy(bArr, 0, bArr2, bArr2.length - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.macSize << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        int i2 = bArr2[15] & 63;
        bArr2[15] = (byte) (bArr2[15] & 192);
        if (this.KtopInput == null || !Arrays.areEqual(bArr2, this.KtopInput)) {
            byte[] bArr3 = new byte[16];
            this.KtopInput = bArr2;
            this.hashCipher.processBlock(this.KtopInput, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, this.Stretch, 0, 16);
            while (i < 8) {
                byte[] bArr4 = this.Stretch;
                int i3 = i + 16;
                byte b2 = bArr3[i];
                i++;
                bArr4[i3] = (byte) (b2 ^ bArr3[i]);
            }
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        if (this.macBlock == null) {
            return new byte[this.macSize];
        }
        return Arrays.clone(this.macBlock);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i) {
        int i2 = i + this.mainBlockPos;
        if (this.forEncryption) {
            return i2 + this.macSize;
        }
        if (i2 >= this.macSize) {
            return i2 - this.macSize;
        }
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.mainBlockPos;
        if (!this.forEncryption) {
            if (i2 < this.macSize) {
                return 0;
            }
            i2 -= this.macSize;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b2) {
        this.hashBlock[this.hashBlockPos] = b2;
        int i = this.hashBlockPos + 1;
        this.hashBlockPos = i;
        if (i == this.hashBlock.length) {
            processHashBlock();
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.hashBlock[this.hashBlockPos] = bArr[i + i3];
            int i4 = this.hashBlockPos + 1;
            this.hashBlockPos = i4;
            if (i4 == this.hashBlock.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b2, byte[] bArr, int i) {
        this.mainBlock[this.mainBlockPos] = b2;
        int i2 = this.mainBlockPos + 1;
        this.mainBlockPos = i2;
        if (i2 == this.mainBlock.length) {
            processMainBlock(bArr, i);
            return 16;
        }
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new DataLengthException("Input buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            this.mainBlock[this.mainBlockPos] = bArr[i + i5];
            int i6 = this.mainBlockPos + 1;
            this.mainBlockPos = i6;
            if (i6 == this.mainBlock.length) {
                processMainBlock(bArr2, i3 + i4);
                i4 += 16;
            }
        }
        return i4;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2;
        if (this.forEncryption) {
            bArr2 = null;
        } else if (this.mainBlockPos < this.macSize) {
            throw new InvalidCipherTextException("data too short");
        } else {
            this.mainBlockPos -= this.macSize;
            bArr2 = new byte[this.macSize];
            System.arraycopy(this.mainBlock, this.mainBlockPos, bArr2, 0, this.macSize);
        }
        if (this.hashBlockPos > 0) {
            OCB_extend(this.hashBlock, this.hashBlockPos);
            updateHASH(this.L_Asterisk);
        }
        if (this.mainBlockPos > 0) {
            if (this.forEncryption) {
                OCB_extend(this.mainBlock, this.mainBlockPos);
                xor(this.Checksum, this.mainBlock);
            }
            xor(this.OffsetMAIN, this.L_Asterisk);
            byte[] bArr3 = new byte[16];
            this.hashCipher.processBlock(this.OffsetMAIN, 0, bArr3, 0);
            xor(this.mainBlock, bArr3);
            if (bArr.length < this.mainBlockPos + i) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.mainBlock, 0, bArr, i, this.mainBlockPos);
            if (!this.forEncryption) {
                OCB_extend(this.mainBlock, this.mainBlockPos);
                xor(this.Checksum, this.mainBlock);
            }
        }
        xor(this.Checksum, this.OffsetMAIN);
        xor(this.Checksum, this.L_Dollar);
        this.hashCipher.processBlock(this.Checksum, 0, this.Checksum, 0);
        xor(this.Checksum, this.Sum);
        this.macBlock = new byte[this.macSize];
        System.arraycopy(this.Checksum, 0, this.macBlock, 0, this.macSize);
        int i2 = this.mainBlockPos;
        if (this.forEncryption) {
            int i3 = i + i2;
            if (bArr.length < this.macSize + i3) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.macBlock, 0, bArr, i3, this.macSize);
            i2 += this.macSize;
        } else if (!Arrays.constantTimeAreEqual(this.macBlock, bArr2)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        reset(false);
        return i2;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        reset(true);
    }

    protected void clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    protected byte[] getLSub(int i) {
        while (i >= this.L.size()) {
            this.L.addElement(OCB_double((byte[]) this.L.lastElement()));
        }
        return (byte[]) this.L.elementAt(i);
    }

    protected void processHashBlock() {
        long j = this.hashBlockCount + 1;
        this.hashBlockCount = j;
        updateHASH(getLSub(OCB_ntz(j)));
        this.hashBlockPos = 0;
    }

    protected void processMainBlock(byte[] bArr, int i) {
        if (bArr.length < i + 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            xor(this.Checksum, this.mainBlock);
            this.mainBlockPos = 0;
        }
        byte[] bArr2 = this.OffsetMAIN;
        long j = this.mainBlockCount + 1;
        this.mainBlockCount = j;
        xor(bArr2, getLSub(OCB_ntz(j)));
        xor(this.mainBlock, this.OffsetMAIN);
        this.mainCipher.processBlock(this.mainBlock, 0, this.mainBlock, 0);
        xor(this.mainBlock, this.OffsetMAIN);
        System.arraycopy(this.mainBlock, 0, bArr, i, 16);
        if (this.forEncryption) {
            return;
        }
        xor(this.Checksum, this.mainBlock);
        System.arraycopy(this.mainBlock, 16, this.mainBlock, 0, this.macSize);
        this.mainBlockPos = this.macSize;
    }

    protected void reset(boolean z) {
        this.hashCipher.reset();
        this.mainCipher.reset();
        clear(this.hashBlock);
        clear(this.mainBlock);
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        clear(this.OffsetHASH);
        clear(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        clear(this.Checksum);
        if (z) {
            this.macBlock = null;
        }
        if (this.initialAssociatedText != null) {
            processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length);
        }
    }

    protected void updateHASH(byte[] bArr) {
        xor(this.OffsetHASH, bArr);
        xor(this.hashBlock, this.OffsetHASH);
        this.hashCipher.processBlock(this.hashBlock, 0, this.hashBlock, 0);
        xor(this.Sum, this.hashBlock);
    }

    protected static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int shiftLeft = shiftLeft(bArr, bArr2);
        bArr2[15] = (byte) ((CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA >>> ((1 - shiftLeft) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    protected static void OCB_extend(byte[] bArr, int i) {
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i < 16) {
                bArr[i] = 0;
            } else {
                return;
            }
        }
    }

    protected static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                int i3 = bArr[i] & 255;
                bArr2[i] = (byte) (i2 | (i3 << 1));
                i2 = (i3 >>> 7) & 1;
            } else {
                return i2;
            }
        }
    }

    protected static void xor(byte[] bArr, byte[] bArr2) {
        for (int i = 15; i >= 0; i--) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }
}
