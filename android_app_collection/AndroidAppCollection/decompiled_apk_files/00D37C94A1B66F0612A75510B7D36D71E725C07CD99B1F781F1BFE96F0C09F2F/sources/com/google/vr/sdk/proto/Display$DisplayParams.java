package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Display$DisplayParams extends aopi implements aoqv {
    public static final int BOTTOM_BEZEL_HEIGHT_FIELD_NUMBER = 3;
    private static final Display$DisplayParams DEFAULT_INSTANCE;
    public static final int DEPRECATED_GYRO_BIAS_FIELD_NUMBER = 4;
    private static volatile aorb PARSER = null;
    public static final int X_PPI_FIELD_NUMBER = 1;
    public static final int Y_PPI_FIELD_NUMBER = 2;
    private int bitField0_;
    private float bottomBezelHeight_;
    private int dEPRECATEDGyroBiasMemoizedSerializedSize = -1;
    private aopp dEPRECATEDGyroBias_ = emptyFloatList();
    private float xPpi_;
    private float yPpi_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(Display$DisplayParams.DEFAULT_INSTANCE);
        }

        public float getXPpi() {
            return ((Display$DisplayParams) this.instance).getXPpi();
        }

        public float getYPpi() {
            return ((Display$DisplayParams) this.instance).getYPpi();
        }

        public Builder setBottomBezelHeight(float f) {
            copyOnWrite();
            ((Display$DisplayParams) this.instance).setBottomBezelHeight(f);
            return this;
        }

        public Builder setXPpi(float f) {
            copyOnWrite();
            ((Display$DisplayParams) this.instance).setXPpi(f);
            return this;
        }

        public Builder setYPpi(float f) {
            copyOnWrite();
            ((Display$DisplayParams) this.instance).setYPpi(f);
            return this;
        }

        public /* synthetic */ Builder(Display$1 display$1) {
            this();
        }
    }

    static {
        Display$DisplayParams display$DisplayParams = new Display$DisplayParams();
        DEFAULT_INSTANCE = display$DisplayParams;
        aopi.registerDefaultInstance(Display$DisplayParams.class, display$DisplayParams);
    }

    private Display$DisplayParams() {
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomBezelHeight(float f) {
        this.bitField0_ |= 4;
        this.bottomBezelHeight_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXPpi(float f) {
        this.bitField0_ |= 1;
        this.xPpi_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYPpi(float f) {
        this.bitField0_ |= 2;
        this.yPpi_ = f;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004$", new Object[]{"bitField0_", "xPpi_", "yPpi_", "bottomBezelHeight_", "dEPRECATEDGyroBias_"});
            case 3:
                return new Display$DisplayParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (Display$DisplayParams.class) {
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

    public float getBottomBezelHeight() {
        return this.bottomBezelHeight_;
    }

    public float getXPpi() {
        return this.xPpi_;
    }

    public float getYPpi() {
        return this.yPpi_;
    }

    public boolean hasBottomBezelHeight() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasXPpi() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasYPpi() {
        return (this.bitField0_ & 2) != 0;
    }
}
