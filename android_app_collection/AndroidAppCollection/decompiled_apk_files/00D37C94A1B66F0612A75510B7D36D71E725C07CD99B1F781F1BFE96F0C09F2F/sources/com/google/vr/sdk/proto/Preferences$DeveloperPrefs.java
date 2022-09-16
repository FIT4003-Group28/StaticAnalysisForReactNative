package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$DeveloperPrefs extends aopi implements aoqv {
    public static final int ALLOW_AR_SESSION_UPDATE_FIELD_NUMBER = 17;
    public static final int CAPTURE_ENABLED_FIELD_NUMBER = 9;
    private static final Preferences$DeveloperPrefs DEFAULT_INSTANCE;
    public static final int DEPRECATED_GVR_PLATFORM_LIBRARY_ENABLED_FIELD_NUMBER = 7;
    public static final int DEPRECATED_HEAD_TRACKING_SERVICE_ENABLED_FIELD_NUMBER = 8;
    public static final int DEPRECATED_MOTOPHO_PATCH_ENABLED_FIELD_NUMBER = 3;
    public static final int DEVELOPER_LOGGING_ENABLED_FIELD_NUMBER = 4;
    public static final int FORCE_UNDISTORTED_RENDERING_FIELD_NUMBER = 5;
    public static final int FRAME_TRACKER_ENABLED_FIELD_NUMBER = 11;
    public static final int MOTOPHO_PATCH_MODE_FIELD_NUMBER = 12;
    public static final int OPENGL_KHR_DEBUG_ENABLED_FIELD_NUMBER = 14;
    private static volatile aorb PARSER = null;
    public static final int PERFORMANCE_HUD_ENABLED_FIELD_NUMBER = 6;
    public static final int PERFORMANCE_LOGGING_ACTIVATED_FIELD_NUMBER = 13;
    public static final int PERFORMANCE_MONITORING_ENABLED_FIELD_NUMBER = 1;
    public static final int PLAY_AREA_SETTINGS_FIELD_NUMBER = 16;
    public static final int SAFETY_CYLINDER_PARAMS_FIELD_NUMBER = 10;
    public static final int SENSOR_LOGGING_ENABLED_FIELD_NUMBER = 2;
    public static final int TRACKING_CONFIGURATION_PARAMS_FIELD_NUMBER = 15;
    private boolean allowArSessionUpdate_;
    private int bitField0_;
    private boolean captureEnabled_;
    private boolean dEPRECATEDGvrPlatformLibraryEnabled_;
    private boolean dEPRECATEDHeadTrackingServiceEnabled_;
    private boolean dEPRECATEDMotophoPatchEnabled_;
    private boolean developerLoggingEnabled_;
    private boolean forceUndistortedRendering_;
    private boolean frameTrackerEnabled_;
    private int motophoPatchMode_;
    private boolean openglKhrDebugEnabled_;
    private boolean performanceHudEnabled_;
    private boolean performanceLoggingActivated_;
    private boolean performanceMonitoringEnabled_;
    private Preferences$PlayAreaSettings playAreaSettings_;
    private Preferences$SafetyCylinderParams safetyCylinderParams_;
    private boolean sensorLoggingEnabled_;
    private Preferences$TrackingConfigurationParams trackingConfigurationParams_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(Preferences$DeveloperPrefs.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum MotophoPatchMode implements aopm {
        NONE(0),
        VELOCITY(1),
        IMPULSE(2);
        
        public static final int IMPULSE_VALUE = 2;
        public static final int NONE_VALUE = 0;
        public static final int VELOCITY_VALUE = 1;
        private static final aopn internalValueMap = new aopn() { // from class: com.google.vr.sdk.proto.Preferences.DeveloperPrefs.MotophoPatchMode.1
            @Override // defpackage.aopn
            /* renamed from: findValueByNumber  reason: collision with other method in class */
            public MotophoPatchMode mo283findValueByNumber(int i) {
                return MotophoPatchMode.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class MotophoPatchModeVerifier implements aopo {
            static final aopo INSTANCE = new MotophoPatchModeVerifier();

            private MotophoPatchModeVerifier() {
            }

            @Override // defpackage.aopo
            public boolean isInRange(int i) {
                return MotophoPatchMode.forNumber(i) != null;
            }
        }

        MotophoPatchMode(int i) {
            this.value = i;
        }

        public static MotophoPatchMode forNumber(int i) {
            if (i != 0) {
                if (i == 1) {
                    return VELOCITY;
                }
                if (i == 2) {
                    return IMPULSE;
                }
                return null;
            }
            return NONE;
        }

        public static aopo internalGetVerifier() {
            return MotophoPatchModeVerifier.INSTANCE;
        }

        @Override // defpackage.aopm
        public final int getNumber() {
            return this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    static {
        Preferences$DeveloperPrefs preferences$DeveloperPrefs = new Preferences$DeveloperPrefs();
        DEFAULT_INSTANCE = preferences$DeveloperPrefs;
        aopi.registerDefaultInstance(Preferences$DeveloperPrefs.class, preferences$DeveloperPrefs);
    }

    private Preferences$DeveloperPrefs() {
    }

    public static Preferences$DeveloperPrefs getDefaultInstance() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဉ\t\u000bဇ\n\fဌ\u000b\rဇ\f\u000eဇ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဇ\u0010", new Object[]{"bitField0_", "performanceMonitoringEnabled_", "sensorLoggingEnabled_", "dEPRECATEDMotophoPatchEnabled_", "developerLoggingEnabled_", "forceUndistortedRendering_", "performanceHudEnabled_", "dEPRECATEDGvrPlatformLibraryEnabled_", "dEPRECATEDHeadTrackingServiceEnabled_", "captureEnabled_", "safetyCylinderParams_", "frameTrackerEnabled_", "motophoPatchMode_", MotophoPatchMode.internalGetVerifier(), "performanceLoggingActivated_", "openglKhrDebugEnabled_", "trackingConfigurationParams_", "playAreaSettings_", "allowArSessionUpdate_"});
            case 3:
                return new Preferences$DeveloperPrefs();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (Preferences$DeveloperPrefs.class) {
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

    public boolean getOpenglKhrDebugEnabled() {
        return this.openglKhrDebugEnabled_;
    }
}
