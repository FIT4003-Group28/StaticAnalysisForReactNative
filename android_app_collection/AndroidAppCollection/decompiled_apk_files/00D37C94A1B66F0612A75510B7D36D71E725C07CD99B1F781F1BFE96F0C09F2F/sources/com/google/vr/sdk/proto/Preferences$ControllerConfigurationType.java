package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public enum Preferences$ControllerConfigurationType implements aopm {
    GVR_CONTROLLER_CONFIGURATION_UNKNOWN(0),
    GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED(1),
    GVR_CONTROLLER_CONFIGURATION_3DOF_1(2),
    GVR_CONTROLLER_CONFIGURATION_6DOF_2(3),
    GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED(4);
    
    public static final int GVR_CONTROLLER_CONFIGURATION_3DOF_1_VALUE = 2;
    public static final int GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED_VALUE = 4;
    public static final int GVR_CONTROLLER_CONFIGURATION_6DOF_2_VALUE = 3;
    public static final int GVR_CONTROLLER_CONFIGURATION_UNKNOWN_VALUE = 0;
    public static final int GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED_VALUE = 1;
    private static final aopn internalValueMap = new aopn() { // from class: com.google.vr.sdk.proto.Preferences$ControllerConfigurationType.1
        @Override // defpackage.aopn
        /* renamed from: findValueByNumber  reason: collision with other method in class */
        public Preferences$ControllerConfigurationType mo283findValueByNumber(int i) {
            return Preferences$ControllerConfigurationType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    final class ControllerConfigurationTypeVerifier implements aopo {
        static final aopo INSTANCE = new ControllerConfigurationTypeVerifier();

        private ControllerConfigurationTypeVerifier() {
        }

        @Override // defpackage.aopo
        public boolean isInRange(int i) {
            return Preferences$ControllerConfigurationType.forNumber(i) != null;
        }
    }

    Preferences$ControllerConfigurationType(int i) {
        this.value = i;
    }

    public static Preferences$ControllerConfigurationType forNumber(int i) {
        if (i != 0) {
            if (i == 1) {
                return GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED;
            }
            if (i == 2) {
                return GVR_CONTROLLER_CONFIGURATION_3DOF_1;
            }
            if (i == 3) {
                return GVR_CONTROLLER_CONFIGURATION_6DOF_2;
            }
            if (i == 4) {
                return GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED;
            }
            return null;
        }
        return GVR_CONTROLLER_CONFIGURATION_UNKNOWN;
    }

    public static aopo internalGetVerifier() {
        return ControllerConfigurationTypeVerifier.INSTANCE;
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
