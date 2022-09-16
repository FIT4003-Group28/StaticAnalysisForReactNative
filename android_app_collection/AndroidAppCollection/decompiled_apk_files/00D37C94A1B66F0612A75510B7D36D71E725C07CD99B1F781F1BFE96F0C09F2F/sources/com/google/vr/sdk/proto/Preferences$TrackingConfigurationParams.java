package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$TrackingConfigurationParams extends aopi implements aoqv {
    public static final int CONTROLLER_CONFIG_TYPE_FIELD_NUMBER = 1;
    private static final Preferences$TrackingConfigurationParams DEFAULT_INSTANCE;
    private static volatile aorb PARSER;
    private int bitField0_;
    private int controllerConfigType_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(Preferences$TrackingConfigurationParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$TrackingConfigurationParams preferences$TrackingConfigurationParams = new Preferences$TrackingConfigurationParams();
        DEFAULT_INSTANCE = preferences$TrackingConfigurationParams;
        aopi.registerDefaultInstance(Preferences$TrackingConfigurationParams.class, preferences$TrackingConfigurationParams);
    }

    private Preferences$TrackingConfigurationParams() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "controllerConfigType_", Preferences$ControllerConfigurationType.internalGetVerifier()});
            case 3:
                return new Preferences$TrackingConfigurationParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (Preferences$TrackingConfigurationParams.class) {
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
