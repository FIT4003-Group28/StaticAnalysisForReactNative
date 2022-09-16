package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$VignetteParams extends aopi implements aoqv {
    public static final int CONDITION_FIELD_NUMBER = 2;
    private static final CardboardDevice$VignetteParams DEFAULT_INSTANCE;
    private static volatile aorb PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int condition_;
    private float value_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(CardboardDevice$VignetteParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum VignetteParamsCondition implements aopm {
        NO_VIGNETTE_CONDITION(0),
        HORIZ_DIMEN_LESS_THAN_METER(1);
        
        public static final int HORIZ_DIMEN_LESS_THAN_METER_VALUE = 1;
        public static final int NO_VIGNETTE_CONDITION_VALUE = 0;
        private static final aopn internalValueMap = new aopn() { // from class: com.google.vr.sdk.proto.CardboardDevice.VignetteParams.VignetteParamsCondition.1
            @Override // defpackage.aopn
            /* renamed from: findValueByNumber  reason: collision with other method in class */
            public VignetteParamsCondition mo283findValueByNumber(int i) {
                return VignetteParamsCondition.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class VignetteParamsConditionVerifier implements aopo {
            static final aopo INSTANCE = new VignetteParamsConditionVerifier();

            private VignetteParamsConditionVerifier() {
            }

            @Override // defpackage.aopo
            public boolean isInRange(int i) {
                return VignetteParamsCondition.forNumber(i) != null;
            }
        }

        VignetteParamsCondition(int i) {
            this.value = i;
        }

        public static VignetteParamsCondition forNumber(int i) {
            if (i != 0) {
                if (i == 1) {
                    return HORIZ_DIMEN_LESS_THAN_METER;
                }
                return null;
            }
            return NO_VIGNETTE_CONDITION;
        }

        public static aopo internalGetVerifier() {
            return VignetteParamsConditionVerifier.INSTANCE;
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
        CardboardDevice$VignetteParams cardboardDevice$VignetteParams = new CardboardDevice$VignetteParams();
        DEFAULT_INSTANCE = cardboardDevice$VignetteParams;
        aopi.registerDefaultInstance(CardboardDevice$VignetteParams.class, cardboardDevice$VignetteParams);
    }

    private CardboardDevice$VignetteParams() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ခ\u0001", new Object[]{"bitField0_", "condition_", VignetteParamsCondition.internalGetVerifier(), "value_"});
            case 3:
                return new CardboardDevice$VignetteParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (CardboardDevice$VignetteParams.class) {
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
