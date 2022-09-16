package org.spongycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import java.util.Vector;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.pqc.crypto.gmss.util.WinternitzOTSignature;
import org.spongycastle.util.Arrays;
/* loaded from: classes2.dex */
public class GMSSPrivateKeyParameters extends GMSSKeyParameters {
    private int[] K;
    private byte[][][] currentAuthPaths;
    private Vector[][] currentRetain;
    private byte[][] currentRootSig;
    private byte[][] currentSeeds;
    private Vector[] currentStack;
    private Treehash[][] currentTreehash;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private int[] index;
    private byte[][][] keep;
    private int mdLength;
    private Digest messDigestTrees;
    private int[] minTreehash;
    private byte[][][] nextAuthPaths;
    private GMSSLeaf[] nextNextLeaf;
    private GMSSRootCalc[] nextNextRoot;
    private byte[][] nextNextSeeds;
    private Vector[][] nextRetain;
    private byte[][] nextRoot;
    private GMSSRootSig[] nextRootSig;
    private Vector[] nextStack;
    private Treehash[][] nextTreehash;
    private int numLayer;
    private int[] numLeafs;
    private int[] otsIndex;
    private GMSSLeaf[] upperLeaf;
    private GMSSLeaf[] upperTreehashLeaf;
    private boolean used;

    public GMSSPrivateKeyParameters(byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][] bArr5, byte[][] bArr6, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        this(null, bArr, bArr2, bArr3, bArr4, null, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, null, null, null, null, bArr5, null, bArr6, null, gMSSParameters, gMSSDigestProvider);
    }

    public GMSSPrivateKeyParameters(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        super(true, gMSSParameters);
        this.used = false;
        this.messDigestTrees = gMSSDigestProvider.get();
        this.mdLength = this.messDigestTrees.getDigestSize();
        this.gmssPS = gMSSParameters;
        this.otsIndex = gMSSParameters.getWinternitzParameter();
        this.K = gMSSParameters.getK();
        this.heightOfTrees = gMSSParameters.getHeightOfTrees();
        this.numLayer = this.gmssPS.getNumOfLayers();
        if (iArr == null) {
            this.index = new int[this.numLayer];
            for (int i = 0; i < this.numLayer; i++) {
                this.index[i] = 0;
            }
        } else {
            this.index = iArr;
        }
        this.currentSeeds = bArr;
        this.nextNextSeeds = bArr2;
        this.currentAuthPaths = bArr3;
        this.nextAuthPaths = bArr4;
        if (bArr5 == null) {
            this.keep = new byte[this.numLayer][];
            for (int i2 = 0; i2 < this.numLayer; i2++) {
                this.keep[i2] = (byte[][]) Array.newInstance(byte.class, (int) Math.floor(this.heightOfTrees[i2] / 2), this.mdLength);
            }
        } else {
            this.keep = bArr5;
        }
        if (vectorArr == null) {
            this.currentStack = new Vector[this.numLayer];
            for (int i3 = 0; i3 < this.numLayer; i3++) {
                this.currentStack[i3] = new Vector();
            }
        } else {
            this.currentStack = vectorArr;
        }
        if (vectorArr2 == null) {
            this.nextStack = new Vector[this.numLayer - 1];
            int i4 = 0;
            for (int i5 = 1; i4 < this.numLayer - i5; i5 = 1) {
                this.nextStack[i4] = new Vector();
                i4++;
            }
        } else {
            this.nextStack = vectorArr2;
        }
        this.currentTreehash = treehashArr;
        this.nextTreehash = treehashArr2;
        this.currentRetain = vectorArr3;
        this.nextRetain = vectorArr4;
        this.nextRoot = bArr6;
        this.digestProvider = gMSSDigestProvider;
        if (gMSSRootCalcArr == null) {
            this.nextNextRoot = new GMSSRootCalc[this.numLayer - 1];
            int i6 = 0;
            for (int i7 = 1; i6 < this.numLayer - i7; i7 = 1) {
                int i8 = i6 + 1;
                this.nextNextRoot[i6] = new GMSSRootCalc(this.heightOfTrees[i8], this.K[i8], this.digestProvider);
                i6 = i8;
            }
        } else {
            this.nextNextRoot = gMSSRootCalcArr;
        }
        this.currentRootSig = bArr7;
        this.numLeafs = new int[this.numLayer];
        for (int i9 = 0; i9 < this.numLayer; i9++) {
            this.numLeafs[i9] = 1 << this.heightOfTrees[i9];
        }
        this.gmssRandom = new GMSSRandom(this.messDigestTrees);
        if (this.numLayer <= 1) {
            this.nextNextLeaf = new GMSSLeaf[0];
        } else if (gMSSLeafArr == null) {
            this.nextNextLeaf = new GMSSLeaf[this.numLayer - 2];
            int i10 = 0;
            while (i10 < this.numLayer - 2) {
                int i11 = i10 + 1;
                this.nextNextLeaf[i10] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i11], this.numLeafs[i10 + 2], this.nextNextSeeds[i10]);
                i10 = i11;
            }
        } else {
            this.nextNextLeaf = gMSSLeafArr;
        }
        if (gMSSLeafArr2 == null) {
            this.upperLeaf = new GMSSLeaf[this.numLayer - 1];
            int i12 = 0;
            for (int i13 = 1; i12 < this.numLayer - i13; i13 = 1) {
                int i14 = i12 + 1;
                this.upperLeaf[i12] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i12], this.numLeafs[i14], this.currentSeeds[i12]);
                i12 = i14;
            }
        } else {
            this.upperLeaf = gMSSLeafArr2;
        }
        if (gMSSLeafArr3 == null) {
            this.upperTreehashLeaf = new GMSSLeaf[this.numLayer - 1];
            int i15 = 0;
            for (int i16 = 1; i15 < this.numLayer - i16; i16 = 1) {
                int i17 = i15 + 1;
                this.upperTreehashLeaf[i15] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i15], this.numLeafs[i17]);
                i15 = i17;
            }
        } else {
            this.upperTreehashLeaf = gMSSLeafArr3;
        }
        if (iArr2 == null) {
            this.minTreehash = new int[this.numLayer - 1];
            int i18 = 0;
            for (int i19 = 1; i18 < this.numLayer - i19; i19 = 1) {
                this.minTreehash[i18] = -1;
                i18++;
            }
        } else {
            this.minTreehash = iArr2;
        }
        byte[] bArr8 = new byte[this.mdLength];
        byte[] bArr9 = new byte[this.mdLength];
        if (gMSSRootSigArr == null) {
            this.nextRootSig = new GMSSRootSig[this.numLayer - 1];
            int i20 = 0;
            while (i20 < this.numLayer - 1) {
                System.arraycopy(bArr[i20], 0, bArr8, 0, this.mdLength);
                this.gmssRandom.nextSeed(bArr8);
                byte[] nextSeed = this.gmssRandom.nextSeed(bArr8);
                int i21 = i20 + 1;
                this.nextRootSig[i20] = new GMSSRootSig(gMSSDigestProvider.get(), this.otsIndex[i20], this.heightOfTrees[i21]);
                this.nextRootSig[i20].initSign(nextSeed, bArr6[i20]);
                i20 = i21;
            }
            return;
        }
        this.nextRootSig = gMSSRootSigArr;
    }

    private GMSSPrivateKeyParameters(GMSSPrivateKeyParameters gMSSPrivateKeyParameters) {
        super(true, gMSSPrivateKeyParameters.getParameters());
        this.used = false;
        this.index = Arrays.clone(gMSSPrivateKeyParameters.index);
        this.currentSeeds = Arrays.clone(gMSSPrivateKeyParameters.currentSeeds);
        this.nextNextSeeds = Arrays.clone(gMSSPrivateKeyParameters.nextNextSeeds);
        this.currentAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.currentAuthPaths);
        this.nextAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.nextAuthPaths);
        this.currentTreehash = gMSSPrivateKeyParameters.currentTreehash;
        this.nextTreehash = gMSSPrivateKeyParameters.nextTreehash;
        this.currentStack = gMSSPrivateKeyParameters.currentStack;
        this.nextStack = gMSSPrivateKeyParameters.nextStack;
        this.currentRetain = gMSSPrivateKeyParameters.currentRetain;
        this.nextRetain = gMSSPrivateKeyParameters.nextRetain;
        this.keep = Arrays.clone(gMSSPrivateKeyParameters.keep);
        this.nextNextLeaf = gMSSPrivateKeyParameters.nextNextLeaf;
        this.upperLeaf = gMSSPrivateKeyParameters.upperLeaf;
        this.upperTreehashLeaf = gMSSPrivateKeyParameters.upperTreehashLeaf;
        this.minTreehash = gMSSPrivateKeyParameters.minTreehash;
        this.gmssPS = gMSSPrivateKeyParameters.gmssPS;
        this.nextRoot = Arrays.clone(gMSSPrivateKeyParameters.nextRoot);
        this.nextNextRoot = gMSSPrivateKeyParameters.nextNextRoot;
        this.currentRootSig = gMSSPrivateKeyParameters.currentRootSig;
        this.nextRootSig = gMSSPrivateKeyParameters.nextRootSig;
        this.digestProvider = gMSSPrivateKeyParameters.digestProvider;
        this.heightOfTrees = gMSSPrivateKeyParameters.heightOfTrees;
        this.otsIndex = gMSSPrivateKeyParameters.otsIndex;
        this.K = gMSSPrivateKeyParameters.K;
        this.numLayer = gMSSPrivateKeyParameters.numLayer;
        this.messDigestTrees = gMSSPrivateKeyParameters.messDigestTrees;
        this.mdLength = gMSSPrivateKeyParameters.mdLength;
        this.gmssRandom = gMSSPrivateKeyParameters.gmssRandom;
        this.numLeafs = gMSSPrivateKeyParameters.numLeafs;
    }

    public boolean isUsed() {
        return this.used;
    }

    public void markUsed() {
        this.used = true;
    }

    public GMSSPrivateKeyParameters nextKey() {
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = new GMSSPrivateKeyParameters(this);
        gMSSPrivateKeyParameters.nextKey(this.gmssPS.getNumOfLayers() - 1);
        return gMSSPrivateKeyParameters;
    }

    private void nextKey(int i) {
        if (i == this.numLayer - 1) {
            int[] iArr = this.index;
            iArr[i] = iArr[i] + 1;
        }
        if (this.index[i] == this.numLeafs[i]) {
            if (this.numLayer == 1) {
                return;
            }
            nextTree(i);
            this.index[i] = 0;
            return;
        }
        updateKey(i);
    }

    private void nextTree(int i) {
        if (i > 0) {
            int[] iArr = this.index;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            int i3 = i;
            boolean z = true;
            do {
                i3--;
                if (this.index[i3] < this.numLeafs[i3]) {
                    z = false;
                }
                if (!z) {
                    break;
                }
            } while (i3 > 0);
            if (z) {
                return;
            }
            this.gmssRandom.nextSeed(this.currentSeeds[i]);
            this.nextRootSig[i2].updateSign();
            if (i > 1) {
                int i4 = i2 - 1;
                this.nextNextLeaf[i4] = this.nextNextLeaf[i4].nextLeaf();
            }
            this.upperLeaf[i2] = this.upperLeaf[i2].nextLeaf();
            if (this.minTreehash[i2] >= 0) {
                this.upperTreehashLeaf[i2] = this.upperTreehashLeaf[i2].nextLeaf();
                try {
                    this.currentTreehash[i2][this.minTreehash[i2]].update(this.gmssRandom, this.upperTreehashLeaf[i2].getLeaf());
                    this.currentTreehash[i2][this.minTreehash[i2]].wasFinished();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            updateNextNextAuthRoot(i);
            this.currentRootSig[i2] = this.nextRootSig[i2].getSig();
            for (int i5 = 0; i5 < this.heightOfTrees[i] - this.K[i]; i5++) {
                this.currentTreehash[i][i5] = this.nextTreehash[i2][i5];
                this.nextTreehash[i2][i5] = this.nextNextRoot[i2].getTreehash()[i5];
            }
            for (int i6 = 0; i6 < this.heightOfTrees[i]; i6++) {
                System.arraycopy(this.nextAuthPaths[i2][i6], 0, this.currentAuthPaths[i][i6], 0, this.mdLength);
                System.arraycopy(this.nextNextRoot[i2].getAuthPath()[i6], 0, this.nextAuthPaths[i2][i6], 0, this.mdLength);
            }
            for (int i7 = 0; i7 < this.K[i] - 1; i7++) {
                this.currentRetain[i][i7] = this.nextRetain[i2][i7];
                this.nextRetain[i2][i7] = this.nextNextRoot[i2].getRetain()[i7];
            }
            this.currentStack[i] = this.nextStack[i2];
            this.nextStack[i2] = this.nextNextRoot[i2].getStack();
            this.nextRoot[i2] = this.nextNextRoot[i2].getRoot();
            byte[] bArr = new byte[this.mdLength];
            byte[] bArr2 = new byte[this.mdLength];
            System.arraycopy(this.currentSeeds[i2], 0, bArr2, 0, this.mdLength);
            this.gmssRandom.nextSeed(bArr2);
            this.gmssRandom.nextSeed(bArr2);
            this.nextRootSig[i2].initSign(this.gmssRandom.nextSeed(bArr2), this.nextRoot[i2]);
            nextKey(i2);
        }
    }

    private void updateKey(int i) {
        computeAuthPaths(i);
        if (i > 0) {
            if (i > 1) {
                int i2 = (i - 1) - 1;
                this.nextNextLeaf[i2] = this.nextNextLeaf[i2].nextLeaf();
            }
            int i3 = i - 1;
            this.upperLeaf[i3] = this.upperLeaf[i3].nextLeaf();
            int floor = (int) Math.floor((getNumLeafs(i) * 2) / (this.heightOfTrees[i3] - this.K[i3]));
            if (this.index[i] % floor == 1) {
                if (this.index[i] > 1 && this.minTreehash[i3] >= 0) {
                    try {
                        this.currentTreehash[i3][this.minTreehash[i3]].update(this.gmssRandom, this.upperTreehashLeaf[i3].getLeaf());
                        this.currentTreehash[i3][this.minTreehash[i3]].wasFinished();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                this.minTreehash[i3] = getMinTreehashIndex(i3);
                if (this.minTreehash[i3] >= 0) {
                    this.upperTreehashLeaf[i3] = new GMSSLeaf(this.digestProvider.get(), this.otsIndex[i3], floor, this.currentTreehash[i3][this.minTreehash[i3]].getSeedActive());
                    this.upperTreehashLeaf[i3] = this.upperTreehashLeaf[i3].nextLeaf();
                }
            } else if (this.minTreehash[i3] >= 0) {
                this.upperTreehashLeaf[i3] = this.upperTreehashLeaf[i3].nextLeaf();
            }
            this.nextRootSig[i3].updateSign();
            if (this.index[i] == 1) {
                this.nextNextRoot[i3].initialize(new Vector());
            }
            updateNextNextAuthRoot(i);
        }
    }

    private int getMinTreehashIndex(int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.heightOfTrees[i] - this.K[i]; i3++) {
            if (this.currentTreehash[i][i3].wasInitialized() && !this.currentTreehash[i][i3].wasFinished() && (i2 == -1 || this.currentTreehash[i][i3].getLowestNodeHeight() < this.currentTreehash[i][i2].getLowestNodeHeight())) {
                i2 = i3;
            }
        }
        return i2;
    }

    private void computeAuthPaths(int i) {
        int i2;
        int i3;
        byte[] bArr;
        int i4 = this.index[i];
        int i5 = this.heightOfTrees[i];
        int i6 = this.K[i];
        int i7 = 0;
        while (true) {
            i2 = i5 - i6;
            if (i7 >= i2) {
                break;
            }
            this.currentTreehash[i][i7].updateNextSeed(this.gmssRandom);
            i7++;
        }
        int heightOfPhi = heightOfPhi(i4);
        byte[] bArr2 = new byte[this.mdLength];
        byte[] nextSeed = this.gmssRandom.nextSeed(this.currentSeeds[i]);
        int i8 = (i4 >>> (heightOfPhi + 1)) & 1;
        byte[] bArr3 = new byte[this.mdLength];
        int i9 = i5 - 1;
        if (heightOfPhi < i9 && i8 == 0) {
            System.arraycopy(this.currentAuthPaths[i][heightOfPhi], 0, bArr3, 0, this.mdLength);
        }
        byte[] bArr4 = new byte[this.mdLength];
        if (heightOfPhi == 0) {
            if (i == this.numLayer - 1) {
                bArr = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getPublicKey();
            } else {
                byte[] bArr5 = new byte[this.mdLength];
                System.arraycopy(this.currentSeeds[i], 0, bArr5, 0, this.mdLength);
                this.gmssRandom.nextSeed(bArr5);
                byte[] leaf = this.upperLeaf[i].getLeaf();
                this.upperLeaf[i].initLeafCalc(bArr5);
                bArr = leaf;
            }
            System.arraycopy(bArr, 0, this.currentAuthPaths[i][0], 0, this.mdLength);
        } else {
            byte[] bArr6 = new byte[this.mdLength << 1];
            System.arraycopy(this.currentAuthPaths[i][heightOfPhi - 1], 0, bArr6, 0, this.mdLength);
            System.arraycopy(this.keep[i][(int) Math.floor(i3 / 2)], 0, bArr6, this.mdLength, this.mdLength);
            this.messDigestTrees.update(bArr6, 0, bArr6.length);
            this.currentAuthPaths[i][heightOfPhi] = new byte[this.messDigestTrees.getDigestSize()];
            this.messDigestTrees.doFinal(this.currentAuthPaths[i][heightOfPhi], 0);
            for (int i10 = 0; i10 < heightOfPhi; i10++) {
                if (i10 < i2) {
                    if (this.currentTreehash[i][i10].wasFinished()) {
                        System.arraycopy(this.currentTreehash[i][i10].getFirstNode(), 0, this.currentAuthPaths[i][i10], 0, this.mdLength);
                        this.currentTreehash[i][i10].destroy();
                    } else {
                        System.err.println("Treehash (" + i + "," + i10 + ") not finished when needed in AuthPathComputation");
                    }
                }
                if (i10 < i9 && i10 >= i2) {
                    int i11 = i10 - i2;
                    if (this.currentRetain[i][i11].size() > 0) {
                        System.arraycopy(this.currentRetain[i][i11].lastElement(), 0, this.currentAuthPaths[i][i10], 0, this.mdLength);
                        this.currentRetain[i][i11].removeElementAt(this.currentRetain[i][i11].size() - 1);
                    }
                }
                if (i10 < i2 && ((1 << i10) * 3) + i4 < this.numLeafs[i]) {
                    this.currentTreehash[i][i10].initialize();
                }
            }
        }
        if (heightOfPhi < i9 && i8 == 0) {
            System.arraycopy(bArr3, 0, this.keep[i][(int) Math.floor(heightOfPhi / 2)], 0, this.mdLength);
        }
        if (i == this.numLayer - 1) {
            for (int i12 = 1; i12 <= i2 / 2; i12++) {
                int minTreehashIndex = getMinTreehashIndex(i);
                if (minTreehashIndex >= 0) {
                    try {
                        byte[] bArr7 = new byte[this.mdLength];
                        System.arraycopy(this.currentTreehash[i][minTreehashIndex].getSeedActive(), 0, bArr7, 0, this.mdLength);
                        this.currentTreehash[i][minTreehashIndex].update(this.gmssRandom, new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr7), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
            return;
        }
        this.minTreehash[i] = getMinTreehashIndex(i);
    }

    private int heightOfPhi(int i) {
        if (i == 0) {
            return -1;
        }
        int i2 = 1;
        int i3 = 0;
        while (i % i2 == 0) {
            i2 *= 2;
            i3++;
        }
        return i3 - 1;
    }

    private void updateNextNextAuthRoot(int i) {
        byte[] bArr = new byte[this.mdLength];
        int i2 = i - 1;
        byte[] nextSeed = this.gmssRandom.nextSeed(this.nextNextSeeds[i2]);
        if (i == this.numLayer - 1) {
            this.nextNextRoot[i2].update(this.nextNextSeeds[i2], new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            return;
        }
        this.nextNextRoot[i2].update(this.nextNextSeeds[i2], this.nextNextLeaf[i2].getLeaf());
        this.nextNextLeaf[i2].initLeafCalc(this.nextNextSeeds[i2]);
    }

    public int[] getIndex() {
        return this.index;
    }

    public int getIndex(int i) {
        return this.index[i];
    }

    public byte[][] getCurrentSeeds() {
        return Arrays.clone(this.currentSeeds);
    }

    public byte[][][] getCurrentAuthPaths() {
        return Arrays.clone(this.currentAuthPaths);
    }

    public byte[] getSubtreeRootSig(int i) {
        return this.currentRootSig[i];
    }

    public GMSSDigestProvider getName() {
        return this.digestProvider;
    }

    public int getNumLeafs(int i) {
        return this.numLeafs[i];
    }
}
