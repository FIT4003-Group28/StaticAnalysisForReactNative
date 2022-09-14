package com.google.android.filament;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Skybox {
    private long mNativeObject;

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
                Skybox.nDestroyBuilder(j);
            }
        }

        public Builder() {
            long nCreateBuilder = Skybox.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public Skybox build(Engine engine) {
            long nBuilderBuild = Skybox.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (nBuilderBuild == 0) {
                throw new IllegalStateException("Couldn't create Skybox");
            }
            return new Skybox(nBuilderBuild);
        }

        public Builder environment(Texture texture) {
            Skybox.nBuilderEnvironment(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }

        public Builder intensity(float f) {
            Skybox.nBuilderIntensity(this.mNativeBuilder, f);
            return this;
        }

        public Builder showSun(boolean z) {
            Skybox.nBuilderShowSun(this.mNativeBuilder, z);
            return this;
        }
    }

    public Skybox(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderEnvironment(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShowSun(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native float nGetIntensity(long j);

    private static native int nGetLayerMask(long j);

    private static native void nSetLayerMask(long j, int i, int i2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public float getIntensity() {
        return nGetIntensity(getNativeObject());
    }

    public int getLayerMask() {
        return nGetLayerMask(getNativeObject());
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Skybox");
    }

    public void setLayerMask(int i, int i2) {
        nSetLayerMask(getNativeObject(), i & 255, i2 & 255);
    }
}
