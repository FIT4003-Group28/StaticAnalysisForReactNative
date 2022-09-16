package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$FreeformDistortion extends aopi implements aoqv {
    public static final int BLUE_VIRTUAL_EYE_TAN_ANGLE_FIELD_NUMBER = 9;
    private static final CardboardDevice$FreeformDistortion DEFAULT_INSTANCE;
    public static final int EYE_TAN_ANGLE_MAX_X_FIELD_NUMBER = 4;
    public static final int EYE_TAN_ANGLE_MAX_Y_FIELD_NUMBER = 6;
    public static final int EYE_TAN_ANGLE_MIN_X_FIELD_NUMBER = 3;
    public static final int EYE_TAN_ANGLE_MIN_Y_FIELD_NUMBER = 5;
    public static final int GREEN_VIRTUAL_EYE_TAN_ANGLE_FIELD_NUMBER = 8;
    private static volatile aorb PARSER = null;
    public static final int RESOLUTION_X_FIELD_NUMBER = 1;
    public static final int RESOLUTION_Y_FIELD_NUMBER = 2;
    public static final int VIRTUAL_EYE_TAN_ANGLE_FIELD_NUMBER = 7;
    private int bitField0_;
    private float eyeTanAngleMaxX_;
    private float eyeTanAngleMaxY_;
    private float eyeTanAngleMinX_;
    private float eyeTanAngleMinY_;
    private int resolutionX_;
    private int resolutionY_;
    private aopp virtualEyeTanAngle_ = emptyFloatList();
    private aopp greenVirtualEyeTanAngle_ = emptyFloatList();
    private aopp blueVirtualEyeTanAngle_ = emptyFloatList();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(CardboardDevice$FreeformDistortion.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    static {
        CardboardDevice$FreeformDistortion cardboardDevice$FreeformDistortion = new CardboardDevice$FreeformDistortion();
        DEFAULT_INSTANCE = cardboardDevice$FreeformDistortion;
        aopi.registerDefaultInstance(CardboardDevice$FreeformDistortion.class, cardboardDevice$FreeformDistortion);
    }

    private CardboardDevice$FreeformDistortion() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007\u0013\b\u0013\t\u0013", new Object[]{"bitField0_", "resolutionX_", "resolutionY_", "eyeTanAngleMinX_", "eyeTanAngleMaxX_", "eyeTanAngleMinY_", "eyeTanAngleMaxY_", "virtualEyeTanAngle_", "greenVirtualEyeTanAngle_", "blueVirtualEyeTanAngle_"});
            case 3:
                return new CardboardDevice$FreeformDistortion();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (CardboardDevice$FreeformDistortion.class) {
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
