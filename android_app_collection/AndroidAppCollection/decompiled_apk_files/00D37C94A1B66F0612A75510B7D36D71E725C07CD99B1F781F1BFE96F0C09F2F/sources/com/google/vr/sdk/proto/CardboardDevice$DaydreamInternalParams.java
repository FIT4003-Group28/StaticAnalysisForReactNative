package com.google.vr.sdk.proto;

import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$DaydreamInternalParams extends aopi implements aoqv {
    public static final int ALIGNMENT_MARKERS_FIELD_NUMBER = 2;
    public static final int CLAMP_DISTORTION_TO_MAXIMUM_FIELD_OF_VIEW_FIELD_NUMBER = 8;
    public static final int CLIP_FIELD_OF_VIEW_TO_DISPLAY_FIELD_NUMBER = 7;
    private static final CardboardDevice$DaydreamInternalParams DEFAULT_INSTANCE;
    public static final int DISABLE_VIGNETTE_FIELD_NUMBER = 9;
    public static final int DISTORTION_MESH_RESOLUTION_FIELD_NUMBER = 6;
    private static volatile aorb PARSER = null;
    public static final int SENSOR_ORIENTATION_INDEPENDENT_OF_DISPLAY_FIELD_NUMBER = 4;
    public static final int SWAP_DISPLAYS_FIELD_NUMBER = 10;
    public static final int USE_ROTATIONAL_ALIGNMENT_CORRECTION_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int VIGNETTE_PARAMS_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean clampDistortionToMaximumFieldOfView_;
    private boolean disableVignette_;
    private boolean sensorOrientationIndependentOfDisplay_;
    private boolean swapDisplays_;
    private boolean useRotationalAlignmentCorrection_;
    private int version_;
    private CardboardDevice$VignetteParams vignetteParams_;
    private aopu alignmentMarkers_ = emptyProtobufList();
    private int distortionMeshResolution_ = 40;
    private boolean clipFieldOfViewToDisplay_ = true;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(CardboardDevice$DaydreamInternalParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    static {
        CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = new CardboardDevice$DaydreamInternalParams();
        DEFAULT_INSTANCE = cardboardDevice$DaydreamInternalParams;
        aopi.registerDefaultInstance(CardboardDevice$DaydreamInternalParams.class, cardboardDevice$DaydreamInternalParams);
    }

    private CardboardDevice$DaydreamInternalParams() {
    }

    public static CardboardDevice$DaydreamInternalParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဉ\u0003\u0006င\u0004\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\nဇ\b", new Object[]{"bitField0_", "version_", "alignmentMarkers_", CardboardDevice$ScreenAlignmentMarker.class, "useRotationalAlignmentCorrection_", "sensorOrientationIndependentOfDisplay_", "vignetteParams_", "distortionMeshResolution_", "clipFieldOfViewToDisplay_", "clampDistortionToMaximumFieldOfView_", "disableVignette_", "swapDisplays_"});
            case 3:
                return new CardboardDevice$DaydreamInternalParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (CardboardDevice$DaydreamInternalParams.class) {
                        aorbVar = PARSER;
                        if (aorbVar == null) {
                            aorbVar = new aopb(DEFAULT_INSTANCE);
                            PARSER = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int getAlignmentMarkersCount() {
        return this.alignmentMarkers_.size();
    }

    public List getAlignmentMarkersList() {
        return this.alignmentMarkers_;
    }

    public boolean getUseRotationalAlignmentCorrection() {
        return this.useRotationalAlignmentCorrection_;
    }
}
