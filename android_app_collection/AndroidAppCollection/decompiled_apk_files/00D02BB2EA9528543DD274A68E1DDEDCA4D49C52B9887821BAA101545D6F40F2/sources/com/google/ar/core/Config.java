package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Config {
    private static final String TAG = "ARCore-Config";
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum AugmentedFaceMode {
        DISABLED(0),
        POSE(1),
        MESH3D(2),
        MESH3D_IMPROVED_LIP_EYE(401),
        MESH3D_IMPROVED_EYE(405),
        MESH3D_FRONT_OR_BACK_PARTNER(418),
        POSE_LOW_FPS(100);
        
        final int nativeCode;

        AugmentedFaceMode(int i) {
            this.nativeCode = i;
        }

        public static AugmentedFaceMode forNumber(int i) {
            AugmentedFaceMode[] values;
            for (AugmentedFaceMode augmentedFaceMode : values()) {
                if (augmentedFaceMode.nativeCode == i) {
                    return augmentedFaceMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AugmentedFaceMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum AugmentedRegionMode {
        DISABLED(0),
        ENABLED(1);
        
        final int nativeCode;

        AugmentedRegionMode(int i) {
            this.nativeCode = i;
        }

        public static AugmentedRegionMode forNumber(int i) {
            AugmentedRegionMode[] values;
            for (AugmentedRegionMode augmentedRegionMode : values()) {
                if (augmentedRegionMode.nativeCode == i) {
                    return augmentedRegionMode;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native AugmentedRegionMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum CloudAnchorMode {
        DISABLED(0),
        ENABLED(1),
        ENABLED_WITH_EARTH_LOCALIZATION(2);
        
        final int nativeCode;

        CloudAnchorMode(int i) {
            this.nativeCode = i;
        }

        public static CloudAnchorMode forNumber(int i) {
            CloudAnchorMode[] values;
            for (CloudAnchorMode cloudAnchorMode : values()) {
                if (cloudAnchorMode.nativeCode == i) {
                    return cloudAnchorMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AnchorHostingMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum DepthMode {
        DISABLED(0),
        AUTOMATIC(1),
        STATIC_SCENE_WITH_MOVING_PEOPLE(2),
        RAW_DEPTH_ONLY(3);
        
        final int nativeCode;

        DepthMode(int i) {
            this.nativeCode = i;
        }

        public static DepthMode forNumber(int i) {
            DepthMode[] values;
            for (DepthMode depthMode : values()) {
                if (depthMode.nativeCode == i) {
                    return depthMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native DepthMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum EarthMode {
        DISABLED(0),
        ENABLED(1);
        
        final int nativeCode;

        EarthMode(int i) {
            this.nativeCode = i;
        }

        public static EarthMode forNumber(int i) {
            EarthMode[] values;
            for (EarthMode earthMode : values()) {
                if (earthMode.nativeCode == i) {
                    return earthMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native EarthMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum FlashMode {
        OFF(0),
        TORCH(2);
        
        final int nativeCode;

        FlashMode(int i) {
            this.nativeCode = i;
        }

        public static FlashMode forNumber(int i) {
            FlashMode[] values;
            for (FlashMode flashMode : values()) {
                if (flashMode.nativeCode == i) {
                    return flashMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native FlashMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum FocusMode {
        FIXED(0),
        AUTO(1);
        
        final int nativeCode;

        FocusMode(int i) {
            this.nativeCode = i;
        }

        public static FocusMode forNumber(int i) {
            FocusMode[] values;
            for (FocusMode focusMode : values()) {
                if (focusMode.nativeCode == i) {
                    return focusMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native FocusMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum InstantPlacementMode {
        DISABLED(0),
        ENABLED(1),
        LOCAL_Y_UP(2);
        
        final int nativeCode;

        InstantPlacementMode(int i) {
            this.nativeCode = i;
        }

        public static InstantPlacementMode forNumber(int i) {
            InstantPlacementMode[] values;
            for (InstantPlacementMode instantPlacementMode : values()) {
                if (instantPlacementMode.nativeCode == i) {
                    return instantPlacementMode;
                }
            }
            StringBuilder sb = new StringBuilder(67);
            sb.append("Unexpected value for native InstantPlacementMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum LightEstimationMode {
        DISABLED(0),
        AMBIENT_INTENSITY(1),
        ENVIRONMENTAL_HDR(2);
        
        final int nativeCode;

        LightEstimationMode(int i) {
            this.nativeCode = i;
        }

        public static LightEstimationMode forNumber(int i) {
            LightEstimationMode[] values;
            for (LightEstimationMode lightEstimationMode : values()) {
                if (lightEstimationMode.nativeCode == i) {
                    return lightEstimationMode;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native LightEstimationMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum MagicalSurfaceHitTestMode {
        DISABLED(0),
        ENABLED(1);
        
        final int nativeCode;

        MagicalSurfaceHitTestMode(int i) {
            this.nativeCode = i;
        }

        public static MagicalSurfaceHitTestMode forNumber(int i) {
            MagicalSurfaceHitTestMode[] values;
            for (MagicalSurfaceHitTestMode magicalSurfaceHitTestMode : values()) {
                if (magicalSurfaceHitTestMode.nativeCode == i) {
                    return magicalSurfaceHitTestMode;
                }
            }
            StringBuilder sb = new StringBuilder(72);
            sb.append("Unexpected value for native MagicalSurfaceHitTestMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum PlaneFindingMode {
        DISABLED(0),
        HORIZONTAL(1),
        VERTICAL(2),
        HORIZONTAL_AND_VERTICAL(3),
        HORIZONTAL_AND_VERTICAL_LOW_FEATURE_GROWTH(4);
        
        final int nativeCode;

        PlaneFindingMode(int i) {
            this.nativeCode = i;
        }

        public static PlaneFindingMode forNumber(int i) {
            PlaneFindingMode[] values;
            for (PlaneFindingMode planeFindingMode : values()) {
                if (planeFindingMode.nativeCode == i) {
                    return planeFindingMode;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native PlaneFindingMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum SegmentationMode {
        DISABLED(0),
        BACKGROUND(1),
        BACKGROUND_LITE(2),
        BACKGROUND_LITE_CPU(3),
        PEOPLE(6);
        
        final int nativeCode;

        SegmentationMode(int i) {
            this.nativeCode = i;
        }

        public static SegmentationMode forNumber(int i) {
            SegmentationMode[] values;
            for (SegmentationMode segmentationMode : values()) {
                if (segmentationMode.nativeCode == i) {
                    return segmentationMode;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native SegmentationMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum UpdateMode {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);
        
        final int nativeCode;

        UpdateMode(int i) {
            this.nativeCode = i;
        }

        public static UpdateMode forNumber(int i) {
            UpdateMode[] values;
            for (UpdateMode updateMode : values()) {
                if (updateMode.nativeCode == i) {
                    return updateMode;
                }
            }
            StringBuilder sb = new StringBuilder(57);
            sb.append("Unexpected value for native UpdateMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    protected Config() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    public Config(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreate(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j, long j2);

    private native int nativeGetAugmentedFaceMode(long j, long j2);

    private native long nativeGetAugmentedImageDatabase(long j, long j2);

    private native int nativeGetAugmentedRegionMode(long j, long j2);

    private native int nativeGetCloudAnchorMode(long j, long j2);

    private native int nativeGetDepthMode(long j, long j2);

    private native int nativeGetDepthModePrivate(long j, long j2);

    private native int nativeGetEarthMode(long j, long j2, long j3);

    private native int nativeGetFlashMode(long j, long j2);

    private native int nativeGetFocusMode(long j, long j2);

    private native int nativeGetInstantPlacementMode(long j, long j2);

    private native int nativeGetInstantPlacementModePrivate(long j, long j2);

    private native int nativeGetLightEstimationMode(long j, long j2);

    private native int nativeGetMagicalSurfaceHitTestModePrivate(long j, long j2);

    private native int nativeGetPlaneFindingMode(long j, long j2);

    private native int nativeGetSegmentationMode(long j, long j2);

    private native int nativeGetUpdateMode(long j, long j2);

    private native float nativeGetZoomLevel(long j, long j2);

    private native void nativeSetAugmentedFaceMode(long j, long j2, int i);

    private native void nativeSetAugmentedImageDatabase(long j, long j2, long j3);

    private native void nativeSetAugmentedRegionMode(long j, long j2, int i);

    private native void nativeSetCloudAnchorMode(long j, long j2, int i);

    private native void nativeSetDepthMode(long j, long j2, int i);

    private native void nativeSetDepthModePrivate(long j, long j2, int i);

    private native void nativeSetEarthMode(long j, long j2, long j3, int i);

    private native void nativeSetFlashMode(long j, long j2, int i);

    private native void nativeSetFocusMode(long j, long j2, int i);

    private native void nativeSetInstantPlacementMode(long j, long j2, int i);

    private native void nativeSetInstantPlacementModePrivate(long j, long j2, int i);

    private native void nativeSetLightEstimationMode(long j, long j2, int i);

    private native void nativeSetMagicalSurfaceHitTestModePrivate(long j, long j2, int i);

    private native void nativeSetPlaneFindingMode(long j, long j2, int i);

    private native void nativeSetSegmentationMode(long j, long j2, int i);

    private native void nativeSetUpdateMode(long j, long j2, int i);

    private native void nativeSetZoomLevel(long j, long j2, float f);

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public AugmentedFaceMode getAugmentedFaceMode() {
        return AugmentedFaceMode.forNumber(nativeGetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedImageDatabase getAugmentedImageDatabase() {
        return new AugmentedImageDatabase(this.session, nativeGetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedRegionMode getAugmentedRegionMode() {
        return AugmentedRegionMode.forNumber(nativeGetAugmentedRegionMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CloudAnchorMode getCloudAnchorMode() {
        return CloudAnchorMode.forNumber(nativeGetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public DepthMode getDepthMode() {
        return DepthMode.forNumber(nativeGetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public DepthMode getDepthModePrivate() {
        return DepthMode.forNumber(nativeGetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public EarthMode getEarthMode() {
        return EarthMode.forNumber(nativeGetEarthMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FlashMode getFlashMode() {
        return FlashMode.forNumber(nativeGetFlashMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FocusMode getFocusMode() {
        return FocusMode.forNumber(nativeGetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public InstantPlacementMode getInstantPlacementMode() {
        return InstantPlacementMode.forNumber(nativeGetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public InstantPlacementMode getInstantPlacementModePrivate() {
        return InstantPlacementMode.forNumber(nativeGetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public LightEstimationMode getLightEstimationMode() {
        return LightEstimationMode.forNumber(nativeGetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public MagicalSurfaceHitTestMode getMagicalSurfaceHitTestModePrivate() {
        return MagicalSurfaceHitTestMode.forNumber(nativeGetMagicalSurfaceHitTestModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public PlaneFindingMode getPlaneFindingMode() {
        return PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public SegmentationMode getSegmentationMode() {
        return SegmentationMode.forNumber(nativeGetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public UpdateMode getUpdateMode() {
        return UpdateMode.forNumber(nativeGetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public float getZoomLevel() {
        return nativeGetZoomLevel(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Config setAugmentedFaceMode(AugmentedFaceMode augmentedFaceMode) {
        nativeSetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedFaceMode.nativeCode);
        return this;
    }

    public Config setAugmentedImageDatabase(AugmentedImageDatabase augmentedImageDatabase) {
        nativeSetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle, augmentedImageDatabase == null ? 0L : augmentedImageDatabase.nativeHandle);
        return this;
    }

    public Config setAugmentedRegionMode(AugmentedRegionMode augmentedRegionMode) {
        nativeSetAugmentedRegionMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedRegionMode.nativeCode);
        return this;
    }

    public Config setCloudAnchorMode(CloudAnchorMode cloudAnchorMode) {
        nativeSetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle, cloudAnchorMode.nativeCode);
        return this;
    }

    public Config setDepthMode(DepthMode depthMode) {
        nativeSetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        return this;
    }

    public Config setDepthModePrivate(DepthMode depthMode) {
        nativeSetDepthModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        return this;
    }

    public Config setEarthMode(EarthMode earthMode) {
        nativeSetEarthMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle, earthMode.nativeCode);
        return this;
    }

    public Config setFlashMode(FlashMode flashMode) {
        nativeSetFlashMode(this.session.nativeWrapperHandle, this.nativeHandle, flashMode.nativeCode);
        return this;
    }

    public Config setFocusMode(FocusMode focusMode) {
        nativeSetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle, focusMode.nativeCode);
        return this;
    }

    public Config setInstantPlacementMode(InstantPlacementMode instantPlacementMode) {
        nativeSetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        return this;
    }

    public Config setInstantPlacementModePrivate(InstantPlacementMode instantPlacementMode) {
        nativeSetInstantPlacementModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        return this;
    }

    public Config setLightEstimationMode(LightEstimationMode lightEstimationMode) {
        nativeSetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle, lightEstimationMode.nativeCode);
        return this;
    }

    public Config setMagicalSurfaceHitTestModePrivate(MagicalSurfaceHitTestMode magicalSurfaceHitTestMode) {
        nativeSetMagicalSurfaceHitTestModePrivate(this.session.nativeWrapperHandle, this.nativeHandle, magicalSurfaceHitTestMode.nativeCode);
        return this;
    }

    public Config setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        nativeSetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle, planeFindingMode.nativeCode);
        return this;
    }

    public Config setSegmentationMode(SegmentationMode segmentationMode) {
        nativeSetSegmentationMode(this.session.nativeWrapperHandle, this.nativeHandle, segmentationMode.nativeCode);
        return this;
    }

    public Config setUpdateMode(UpdateMode updateMode) {
        nativeSetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, updateMode.nativeCode);
        return this;
    }

    public Config setZoomLevel(float f) {
        nativeSetZoomLevel(this.session.nativeWrapperHandle, this.nativeHandle, f);
        return this;
    }

    Config(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
