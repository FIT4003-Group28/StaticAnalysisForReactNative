package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.util.Arrays;
/* loaded from: classes2.dex */
public class RainbowParameterSpec implements AlgorithmParameterSpec {
    private static final int[] DEFAULT_VI = {6, 12, 17, 22, 33};

    /* renamed from: vi  reason: collision with root package name */
    private int[] f5693vi;

    public RainbowParameterSpec() {
        this.f5693vi = DEFAULT_VI;
    }

    public RainbowParameterSpec(int[] iArr) {
        this.f5693vi = iArr;
        try {
            checkParams();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkParams() {
        if (this.f5693vi == null) {
            throw new IllegalArgumentException("no layers defined.");
        }
        if (this.f5693vi.length > 1) {
            int i = 0;
            while (i < this.f5693vi.length - 1) {
                int i2 = this.f5693vi[i];
                i++;
                if (i2 >= this.f5693vi[i]) {
                    throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
                }
            }
            return;
        }
        throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
    }

    public int getNumOfLayers() {
        return this.f5693vi.length - 1;
    }

    public int getDocumentLength() {
        return this.f5693vi[this.f5693vi.length - 1] - this.f5693vi[0];
    }

    public int[] getVi() {
        return Arrays.clone(this.f5693vi);
    }
}
