package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SdkConfiguration$SdkConfigurationRequest extends aopi implements aoqv {
    private static final SdkConfiguration$SdkConfigurationRequest DEFAULT_INSTANCE;
    private static volatile aorb PARSER = null;
    public static final int REQUESTED_PARAMS_FIELD_NUMBER = 2;
    public static final int SDK_VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private anfs requestedParams_;
    private String sdkVersion_ = "";

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(SdkConfiguration$SdkConfigurationRequest.DEFAULT_INSTANCE);
        }

        public Builder setRequestedParams(anfs anfsVar) {
            copyOnWrite();
            ((SdkConfiguration$SdkConfigurationRequest) this.instance).setRequestedParams(anfsVar);
            return this;
        }

        public Builder setSdkVersion(String str) {
            copyOnWrite();
            ((SdkConfiguration$SdkConfigurationRequest) this.instance).setSdkVersion("1.218.0");
            return this;
        }

        public /* synthetic */ Builder(SdkConfiguration$1 sdkConfiguration$1) {
            this();
        }
    }

    static {
        SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest = new SdkConfiguration$SdkConfigurationRequest();
        DEFAULT_INSTANCE = sdkConfiguration$SdkConfigurationRequest;
        aopi.registerDefaultInstance(SdkConfiguration$SdkConfigurationRequest.class, sdkConfiguration$SdkConfigurationRequest);
    }

    private SdkConfiguration$SdkConfigurationRequest() {
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestedParams(anfs anfsVar) {
        anfsVar.getClass();
        this.requestedParams_ = anfsVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        this.bitField0_ |= 1;
        this.sdkVersion_ = "1.218.0";
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "sdkVersion_", "requestedParams_"});
            case 3:
                return new SdkConfiguration$SdkConfigurationRequest();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (SdkConfiguration$SdkConfigurationRequest.class) {
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
