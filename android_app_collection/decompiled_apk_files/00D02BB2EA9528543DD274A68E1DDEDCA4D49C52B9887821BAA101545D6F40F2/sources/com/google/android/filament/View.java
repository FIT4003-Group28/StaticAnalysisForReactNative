package com.google.android.filament;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class View {
    private AmbientOcclusionOptions mAmbientOcclusionOptions;
    private Camera mCamera;
    private DynamicResolutionOptions mDynamicResolution;
    private String mName;
    private long mNativeObject;
    private RenderQuality mRenderQuality;
    private RenderTarget mRenderTarget;
    private Scene mScene;
    private Viewport mViewport = new Viewport(0, 0, 0, 0);
    private DepthPrepass mDepthPrepass = DepthPrepass.DEFAULT;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum AmbientOcclusion {
        NONE,
        SSAO
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class AmbientOcclusionOptions {
        public float radius = 0.3f;
        public float bias = 0.005f;
        public float power = 0.0f;
        public float resolution = 0.5f;
        public float intensity = 1.0f;
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum AntiAliasing {
        NONE,
        FXAA
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum DepthPrepass {
        DEFAULT(-1),
        DISABLED(0),
        ENABLED(1);
        
        final int value;

        DepthPrepass(int i) {
            this.value = i;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum Dithering {
        NONE,
        TEMPORAL
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class DynamicResolutionOptions {
        public boolean enabled = false;
        public boolean homogeneousScaling = false;
        public float targetFrameTimeMilli = 16.666666f;
        public float headRoomRatio = 0.0f;
        public float scaleRate = 0.125f;
        public float minScale = 0.5f;
        public float maxScale = 1.0f;
        public int history = 9;
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum QualityLevel {
        LOW,
        MEDIUM,
        HIGH,
        ULTRA
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class RenderQuality {
        public QualityLevel hdrColorBuffer = QualityLevel.HIGH;
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum ToneMapping {
        LINEAR,
        ACES
    }

    public View(long j) {
        this.mNativeObject = j;
    }

    private static native int nGetAmbientOcclusion(long j);

    private static native int nGetAntiAliasing(long j);

    private static native void nGetClearColor(long j, float[] fArr);

    private static native int nGetDithering(long j);

    private static native int nGetSampleCount(long j);

    private static native int nGetToneMapping(long j);

    private static native boolean nIsFrontFaceWindingInverted(long j);

    private static native boolean nIsPostProcessingEnabled(long j);

    private static native void nSetAmbientOcclusion(long j, int i);

    private static native void nSetAmbientOcclusionOptions(long j, float f, float f2, float f3, float f4, float f5);

    private static native void nSetAntiAliasing(long j, int i);

    private static native void nSetCamera(long j, long j2);

    private static native void nSetClearColor(long j, float f, float f2, float f3, float f4);

    private static native void nSetClearTargets(long j, boolean z, boolean z2, boolean z3);

    private static native void nSetDepthPrepass(long j, int i);

    private static native void nSetDithering(long j, int i);

    private static native void nSetDynamicLightingOptions(long j, float f, float f2);

    private static native void nSetDynamicResolutionOptions(long j, boolean z, boolean z2, float f, float f2, float f3, float f4, float f5, int i);

    private static native void nSetFrontFaceWindingInverted(long j, boolean z);

    private static native void nSetName(long j, String str);

    private static native void nSetPostProcessingEnabled(long j, boolean z);

    private static native void nSetRenderQuality(long j, int i);

    private static native void nSetRenderTarget(long j, long j2);

    private static native void nSetSampleCount(long j, int i);

    private static native void nSetScene(long j, long j2);

    private static native void nSetShadowsEnabled(long j, boolean z);

    private static native void nSetToneMapping(long j, int i);

    private static native void nSetViewport(long j, int i, int i2, int i3, int i4);

    private static native void nSetVisibleLayers(long j, int i, int i2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public AmbientOcclusion getAmbientOcclusion() {
        return AmbientOcclusion.values()[nGetAmbientOcclusion(getNativeObject())];
    }

    public AmbientOcclusionOptions getAmbientOcclusionOptions() {
        if (this.mAmbientOcclusionOptions == null) {
            this.mAmbientOcclusionOptions = new AmbientOcclusionOptions();
        }
        return this.mAmbientOcclusionOptions;
    }

    public AntiAliasing getAntiAliasing() {
        return AntiAliasing.values()[nGetAntiAliasing(getNativeObject())];
    }

    public Camera getCamera() {
        return this.mCamera;
    }

    public float[] getClearColor(float[] fArr) {
        float[] assertFloat4 = Asserts.assertFloat4(fArr);
        nGetClearColor(getNativeObject(), assertFloat4);
        return assertFloat4;
    }

    public DepthPrepass getDepthPrepass() {
        return this.mDepthPrepass;
    }

    public Dithering getDithering() {
        return Dithering.values()[nGetDithering(getNativeObject())];
    }

    public DynamicResolutionOptions getDynamicResolutionOptions() {
        if (this.mDynamicResolution == null) {
            this.mDynamicResolution = new DynamicResolutionOptions();
        }
        return this.mDynamicResolution;
    }

    public String getName() {
        return this.mName;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed View");
    }

    public RenderQuality getRenderQuality() {
        if (this.mRenderQuality == null) {
            this.mRenderQuality = new RenderQuality();
        }
        return this.mRenderQuality;
    }

    public RenderTarget getRenderTarget() {
        return this.mRenderTarget;
    }

    public int getSampleCount() {
        return nGetSampleCount(getNativeObject());
    }

    public Scene getScene() {
        return this.mScene;
    }

    public ToneMapping getToneMapping() {
        return ToneMapping.values()[nGetToneMapping(getNativeObject())];
    }

    public Viewport getViewport() {
        return this.mViewport;
    }

    public boolean isFrontFaceWindingInverted() {
        return nIsFrontFaceWindingInverted(getNativeObject());
    }

    public boolean isPostProcessingEnabled() {
        return nIsPostProcessingEnabled(getNativeObject());
    }

    public void setAmbientOcclusion(AmbientOcclusion ambientOcclusion) {
        nSetAmbientOcclusion(getNativeObject(), ambientOcclusion.ordinal());
    }

    public void setAmbientOcclusionOptions(AmbientOcclusionOptions ambientOcclusionOptions) {
        this.mAmbientOcclusionOptions = ambientOcclusionOptions;
        nSetAmbientOcclusionOptions(getNativeObject(), ambientOcclusionOptions.radius, ambientOcclusionOptions.bias, ambientOcclusionOptions.power, ambientOcclusionOptions.resolution, ambientOcclusionOptions.intensity);
    }

    public void setAntiAliasing(AntiAliasing antiAliasing) {
        nSetAntiAliasing(getNativeObject(), antiAliasing.ordinal());
    }

    public void setCamera(Camera camera) {
        this.mCamera = camera;
        nSetCamera(getNativeObject(), camera == null ? 0L : camera.getNativeObject());
    }

    public void setClearColor(float f, float f2, float f3, float f4) {
        nSetClearColor(getNativeObject(), f, f2, f3, f4);
    }

    public void setClearTargets(boolean z, boolean z2, boolean z3) {
        nSetClearTargets(getNativeObject(), z, z2, z3);
    }

    @Deprecated
    public void setDepthPrepass(DepthPrepass depthPrepass) {
        this.mDepthPrepass = depthPrepass;
        nSetDepthPrepass(getNativeObject(), depthPrepass.value);
    }

    public void setDithering(Dithering dithering) {
        nSetDithering(getNativeObject(), dithering.ordinal());
    }

    public void setDynamicLightingOptions(float f, float f2) {
        nSetDynamicLightingOptions(getNativeObject(), f, f2);
    }

    public void setDynamicResolutionOptions(DynamicResolutionOptions dynamicResolutionOptions) {
        this.mDynamicResolution = dynamicResolutionOptions;
        nSetDynamicResolutionOptions(getNativeObject(), dynamicResolutionOptions.enabled, dynamicResolutionOptions.homogeneousScaling, dynamicResolutionOptions.targetFrameTimeMilli, dynamicResolutionOptions.headRoomRatio, dynamicResolutionOptions.scaleRate, dynamicResolutionOptions.minScale, dynamicResolutionOptions.maxScale, dynamicResolutionOptions.history);
    }

    public void setFrontFaceWindingInverted(boolean z) {
        nSetFrontFaceWindingInverted(getNativeObject(), z);
    }

    public void setName(String str) {
        this.mName = str;
        nSetName(getNativeObject(), str);
    }

    public void setPostProcessingEnabled(boolean z) {
        nSetPostProcessingEnabled(getNativeObject(), z);
    }

    public void setRenderQuality(RenderQuality renderQuality) {
        this.mRenderQuality = renderQuality;
        nSetRenderQuality(getNativeObject(), renderQuality.hdrColorBuffer.ordinal());
    }

    public void setRenderTarget(RenderTarget renderTarget) {
        this.mRenderTarget = renderTarget;
        nSetRenderTarget(getNativeObject(), renderTarget != null ? renderTarget.getNativeObject() : 0L);
    }

    public void setSampleCount(int i) {
        nSetSampleCount(getNativeObject(), i);
    }

    public void setScene(Scene scene) {
        this.mScene = scene;
        nSetScene(getNativeObject(), scene == null ? 0L : scene.getNativeObject());
    }

    public void setShadowsEnabled(boolean z) {
        nSetShadowsEnabled(getNativeObject(), z);
    }

    public void setToneMapping(ToneMapping toneMapping) {
        nSetToneMapping(getNativeObject(), toneMapping.ordinal());
    }

    public void setViewport(Viewport viewport) {
        this.mViewport = viewport;
        long nativeObject = getNativeObject();
        Viewport viewport2 = this.mViewport;
        nSetViewport(nativeObject, viewport2.left, viewport2.bottom, viewport2.width, viewport2.height);
    }

    public void setVisibleLayers(int i, int i2) {
        nSetVisibleLayers(getNativeObject(), i & 255, i2 & 255);
    }
}
