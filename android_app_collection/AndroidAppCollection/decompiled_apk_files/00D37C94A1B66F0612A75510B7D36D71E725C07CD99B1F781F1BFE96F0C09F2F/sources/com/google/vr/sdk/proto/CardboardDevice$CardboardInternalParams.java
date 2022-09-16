package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$CardboardInternalParams extends aopi implements aoqv {
    public static final int ACCELEROMETER_FIELD_NUMBER = 5;
    private static final CardboardDevice$CardboardInternalParams DEFAULT_INSTANCE;
    public static final int EYE_ORIENTATIONS_FIELD_NUMBER = 1;
    public static final int GYROSCOPE_FIELD_NUMBER = 6;
    private static volatile aorb PARSER = null;
    public static final int SCREEN_CENTER_TO_LENS_DISTANCE_FIELD_NUMBER = 2;
    public static final int X_PPI_OVERRIDE_FIELD_NUMBER = 3;
    public static final int Y_PPI_OVERRIDE_FIELD_NUMBER = 4;
    private static final aopr eyeOrientations_converter_ = new aopr() { // from class: com.google.vr.sdk.proto.CardboardDevice$CardboardInternalParams.1
        @Override // defpackage.aopr
        public OrientationType convert(Integer num) {
            OrientationType forNumber = OrientationType.forNumber(num.intValue());
            return forNumber == null ? OrientationType.CCW_0_DEGREES : forNumber;
        }
    };
    private int bitField0_;
    private int eyeOrientationsMemoizedSerializedSize;
    private float screenCenterToLensDistance_;
    private float xPpiOverride_;
    private float yPpiOverride_;
    private aopq eyeOrientations_ = emptyIntList();
    private String accelerometer_ = "";
    private String gyroscope_ = "";

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(CardboardDevice$CardboardInternalParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum OrientationType implements aopm {
        CCW_0_DEGREES(0),
        CCW_90_DEGREES(1),
        CCW_180_DEGREES(2),
        CCW_270_DEGREES(3),
        CCW_0_DEGREES_MIRRORED(4),
        CCW_90_DEGREES_MIRRORED(5),
        CCW_180_DEGREES_MIRRORED(6),
        CCW_270_DEGREES_MIRRORED(7);
        
        public static final int CCW_0_DEGREES_MIRRORED_VALUE = 4;
        public static final int CCW_0_DEGREES_VALUE = 0;
        public static final int CCW_180_DEGREES_MIRRORED_VALUE = 6;
        public static final int CCW_180_DEGREES_VALUE = 2;
        public static final int CCW_270_DEGREES_MIRRORED_VALUE = 7;
        public static final int CCW_270_DEGREES_VALUE = 3;
        public static final int CCW_90_DEGREES_MIRRORED_VALUE = 5;
        public static final int CCW_90_DEGREES_VALUE = 1;
        private static final aopn internalValueMap = new aopn() { // from class: com.google.vr.sdk.proto.CardboardDevice.CardboardInternalParams.OrientationType.1
            @Override // defpackage.aopn
            /* renamed from: findValueByNumber  reason: collision with other method in class */
            public OrientationType mo283findValueByNumber(int i) {
                return OrientationType.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class OrientationTypeVerifier implements aopo {
            static final aopo INSTANCE = new OrientationTypeVerifier();

            private OrientationTypeVerifier() {
            }

            @Override // defpackage.aopo
            public boolean isInRange(int i) {
                return OrientationType.forNumber(i) != null;
            }
        }

        OrientationType(int i) {
            this.value = i;
        }

        public static OrientationType forNumber(int i) {
            switch (i) {
                case 0:
                    return CCW_0_DEGREES;
                case 1:
                    return CCW_90_DEGREES;
                case 2:
                    return CCW_180_DEGREES;
                case 3:
                    return CCW_270_DEGREES;
                case 4:
                    return CCW_0_DEGREES_MIRRORED;
                case 5:
                    return CCW_90_DEGREES_MIRRORED;
                case 6:
                    return CCW_180_DEGREES_MIRRORED;
                case 7:
                    return CCW_270_DEGREES_MIRRORED;
                default:
                    return null;
            }
        }

        public static aopo internalGetVerifier() {
            return OrientationTypeVerifier.INSTANCE;
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
        CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams = new CardboardDevice$CardboardInternalParams();
        DEFAULT_INSTANCE = cardboardDevice$CardboardInternalParams;
        aopi.registerDefaultInstance(CardboardDevice$CardboardInternalParams.class, cardboardDevice$CardboardInternalParams);
    }

    private CardboardDevice$CardboardInternalParams() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001,\u0002ခ\u0000\u0003ခ\u0001\u0004ခ\u0002\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"bitField0_", "eyeOrientations_", OrientationType.internalGetVerifier(), "screenCenterToLensDistance_", "xPpiOverride_", "yPpiOverride_", "accelerometer_", "gyroscope_"});
            case 3:
                return new CardboardDevice$CardboardInternalParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (CardboardDevice$CardboardInternalParams.class) {
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
