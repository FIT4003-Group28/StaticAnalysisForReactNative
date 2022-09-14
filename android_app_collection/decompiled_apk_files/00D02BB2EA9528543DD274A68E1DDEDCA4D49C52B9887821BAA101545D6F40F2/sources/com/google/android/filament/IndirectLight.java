package com.google.android.filament;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IndirectLight {
    long mNativeObject;

    public IndirectLight(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderReflections(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nGetColorEstimate(long j, float[] fArr, float f, float f2, float f3);

    private static native void nGetColorEstimateStatic(float[] fArr, float[] fArr2, float f, float f2, float f3);

    private static native void nGetDirectionEstimate(long j, float[] fArr);

    private static native void nGetDirectionEstimateStatic(float[] fArr, float[] fArr2);

    private static native float nGetIntensity(long j);

    private static native void nGetRotation(long j, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIntensity(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIrradiance(long j, int i, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIrradianceAsTexture(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nRadiance(long j, int i, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nRotation(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9);

    private static native void nSetIntensity(long j, float f);

    private static native void nSetRotation(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public float[] getColorEstimate(float[] fArr, float f, float f2, float f3) {
        float[] assertFloat4 = Asserts.assertFloat4(fArr);
        nGetColorEstimate(getNativeObject(), assertFloat4, f, f2, f3);
        return assertFloat4;
    }

    public float[] getDirectionEstimate(float[] fArr) {
        float[] assertFloat3 = Asserts.assertFloat3(fArr);
        nGetDirectionEstimate(getNativeObject(), assertFloat3);
        return assertFloat3;
    }

    public float getIntensity() {
        return nGetIntensity(getNativeObject());
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed IndirectLight");
    }

    public float[] getRotation(float[] fArr) {
        float[] assertMat3f = Asserts.assertMat3f(fArr);
        nGetRotation(getNativeObject(), assertMat3f);
        return assertMat3f;
    }

    public void setIntensity(float f) {
        nSetIntensity(getNativeObject(), f);
    }

    public void setRotation(float[] fArr) {
        Asserts.assertMat3fIn(fArr);
        nSetRotation(getNativeObject(), fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8]);
    }

    public static float[] getColorEstimate(float[] fArr, float[] fArr2, float f, float f2, float f3) {
        if (fArr2.length < 27) {
            throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
        }
        float[] assertFloat4 = Asserts.assertFloat4(fArr);
        nGetColorEstimateStatic(assertFloat4, fArr2, f, f2, f3);
        return assertFloat4;
    }

    public static float[] getDirectionEstimate(float[] fArr, float[] fArr2) {
        if (fArr.length < 27) {
            throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
        }
        float[] assertFloat3 = Asserts.assertFloat3(fArr2);
        nGetDirectionEstimateStatic(fArr, assertFloat3);
        return assertFloat3;
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j) {
                this.mNativeObject = j;
            }

            public void finalize() {
                long j;
                try {
                    super.finalize();
                    j = this.mNativeObject;
                } catch (Throwable unused) {
                    j = this.mNativeObject;
                }
                IndirectLight.nDestroyBuilder(j);
            }
        }

        public Builder() {
            long nCreateBuilder = IndirectLight.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public IndirectLight build(Engine engine) {
            long nBuilderBuild = IndirectLight.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (nBuilderBuild == 0) {
                throw new IllegalStateException("Couldn't create IndirectLight");
            }
            return new IndirectLight(nBuilderBuild);
        }

        public Builder intensity(float f) {
            IndirectLight.nIntensity(this.mNativeBuilder, f);
            return this;
        }

        public Builder irradiance(int i, float[] fArr) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (fArr.length < 27) {
                            throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                        }
                    } else {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                } else if (fArr.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            } else if (fArr.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            IndirectLight.nIrradiance(this.mNativeBuilder, i, fArr);
            return this;
        }

        public Builder radiance(int i, float[] fArr) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (fArr.length < 27) {
                            throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                        }
                    } else {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                } else if (fArr.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            } else if (fArr.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            IndirectLight.nRadiance(this.mNativeBuilder, i, fArr);
            return this;
        }

        public Builder reflections(Texture texture) {
            IndirectLight.nBuilderReflections(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }

        public Builder rotation(float[] fArr) {
            IndirectLight.nRotation(this.mNativeBuilder, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8]);
            return this;
        }

        public Builder irradiance(Texture texture) {
            IndirectLight.nIrradianceAsTexture(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }
    }
}
