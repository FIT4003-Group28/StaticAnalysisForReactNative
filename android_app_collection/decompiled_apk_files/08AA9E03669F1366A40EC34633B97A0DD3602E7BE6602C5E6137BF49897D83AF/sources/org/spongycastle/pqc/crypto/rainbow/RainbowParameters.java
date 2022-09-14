package org.spongycastle.pqc.crypto.rainbow;

import org.spongycastle.crypto.CipherParameters;
/* loaded from: classes2.dex */
public class RainbowParameters implements CipherParameters {
    private final int[] DEFAULT_VI;

    /* renamed from: vi  reason: collision with root package name */
    private int[] f5690vi;

    public RainbowParameters() {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.f5690vi = this.DEFAULT_VI;
    }

    public RainbowParameters(int[] iArr) {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.f5690vi = iArr;
        try {
            checkParams();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkParams() {
        if (this.f5690vi == null) {
            throw new Exception("no layers defined.");
        }
        if (this.f5690vi.length > 1) {
            int i = 0;
            while (i < this.f5690vi.length - 1) {
                int i2 = this.f5690vi[i];
                i++;
                if (i2 >= this.f5690vi[i]) {
                    throw new Exception("v[i] has to be smaller than v[i+1]");
                }
            }
            return;
        }
        throw new Exception("Rainbow needs at least 1 layer, such that v1 < v2.");
    }

    public int getNumOfLayers() {
        return this.f5690vi.length - 1;
    }

    public int getDocLength() {
        return this.f5690vi[this.f5690vi.length - 1] - this.f5690vi[0];
    }

    public int[] getVi() {
        return this.f5690vi;
    }
}
