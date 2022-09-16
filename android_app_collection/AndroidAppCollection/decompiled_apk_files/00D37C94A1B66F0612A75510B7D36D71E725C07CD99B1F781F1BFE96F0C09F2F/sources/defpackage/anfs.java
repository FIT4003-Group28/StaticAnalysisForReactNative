package defpackage;
/* compiled from: PG */
/* renamed from: anfs */
/* loaded from: classes.dex */
public final class anfs extends aopi implements aoqv {
    public static final int ALLOW_DYNAMIC_JAVA_LIBRARY_LOADING_FIELD_NUMBER = 11;
    public static final int ALLOW_DYNAMIC_LIBRARY_LOADING_FIELD_NUMBER = 4;
    public static final int ALLOW_HIGH_PRIORITY_APP_RENDER_THREAD_FIELD_NUMBER = 22;
    public static final int ALLOW_PASSTHROUGH_FIELD_NUMBER = 21;
    public static final int ALLOW_VRCORE_COMPOSITING_FIELD_NUMBER = 14;
    public static final int ALLOW_VRCORE_HEAD_TRACKING_FIELD_NUMBER = 13;
    public static final int ASYNC_REPROJECTION_CONFIG_FIELD_NUMBER = 7;
    public static final int CPU_LATE_LATCHING_ENABLED_FIELD_NUMBER = 5;
    public static final int DAYDREAM_IMAGE_ALIGNMENT_ENABLED_FIELD_NUMBER = 1;
    public static final int DAYDREAM_IMAGE_ALIGNMENT_FIELD_NUMBER = 6;
    public static final anfs DEFAULT_INSTANCE;
    public static final int DIM_UI_LAYER_FIELD_NUMBER = 19;
    public static final int DISALLOW_MULTIVIEW_FIELD_NUMBER = 18;
    public static final int ENABLE_FORCED_TRACKING_COMPAT_FIELD_NUMBER = 16;
    private static volatile aorb PARSER = null;
    public static final int PERFORMANCE_OVERLAY_INFO_FIELD_NUMBER = 15;
    public static final int SCREEN_CAPTURE_CONFIG_FIELD_NUMBER = 17;
    public static final int TOUCH_OVERLAY_ENABLED_FIELD_NUMBER = 12;
    public static final int USE_DEVICE_IDLE_DETECTION_FIELD_NUMBER = 9;
    public static final int USE_DIRECT_MODE_SENSORS_FIELD_NUMBER = 20;
    public static final int USE_MAGNETOMETER_IN_SENSOR_FUSION_FIELD_NUMBER = 3;
    public static final int USE_ONLINE_MAGNETOMETER_CALIBRATION_FIELD_NUMBER = 8;
    public static final int USE_STATIONARY_BIAS_CORRECTION_FIELD_NUMBER = 10;
    public static final int USE_SYSTEM_CLOCK_FOR_SENSOR_TIMESTAMPS_FIELD_NUMBER = 2;
    public boolean allowDynamicJavaLibraryLoading_;
    public boolean allowDynamicLibraryLoading_;
    private boolean allowHighPriorityAppRenderThread_;
    public boolean allowPassthrough_;
    public boolean allowVrcoreCompositing_;
    public boolean allowVrcoreHeadTracking_;
    public anfm asyncReprojectionConfig_;
    public int bitField0_;
    public boolean cpuLateLatchingEnabled_;
    private boolean daydreamImageAlignmentEnabled_;
    public int daydreamImageAlignment_;
    public boolean dimUiLayer_;
    public boolean disallowMultiview_;
    public boolean enableForcedTrackingCompat_;
    private anfq performanceOverlayInfo_;
    public anfr screenCaptureConfig_;
    public boolean touchOverlayEnabled_;
    public boolean useDeviceIdleDetection_;
    public boolean useDirectModeSensors_;
    public boolean useMagnetometerInSensorFusion_;
    public boolean useOnlineMagnetometerCalibration_;
    public boolean useStationaryBiasCorrection_;
    public boolean useSystemClockForSensorTimestamps_;

    static {
        anfs anfsVar = new anfs();
        DEFAULT_INSTANCE = anfsVar;
        aopi.registerDefaultInstance(anfs.class, anfsVar);
    }

    private anfs() {
    }

    public static /* synthetic */ void a(anfs anfsVar) {
        anfsVar.bitField0_ |= 2097152;
        anfsVar.allowHighPriorityAppRenderThread_ = true;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဉ\u000e\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new Object[]{"bitField0_", "daydreamImageAlignmentEnabled_", "useSystemClockForSensorTimestamps_", "useMagnetometerInSensorFusion_", "allowDynamicLibraryLoading_", "cpuLateLatchingEnabled_", "daydreamImageAlignment_", anfp.b(), "asyncReprojectionConfig_", "useOnlineMagnetometerCalibration_", "useDeviceIdleDetection_", "useStationaryBiasCorrection_", "allowDynamicJavaLibraryLoading_", "touchOverlayEnabled_", "allowVrcoreHeadTracking_", "allowVrcoreCompositing_", "performanceOverlayInfo_", "enableForcedTrackingCompat_", "screenCaptureConfig_", "disallowMultiview_", "dimUiLayer_", "useDirectModeSensors_", "allowPassthrough_", "allowHighPriorityAppRenderThread_"});
            case 3:
                return new anfs();
            case 4:
                return new aopa(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (anfs.class) {
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
}
