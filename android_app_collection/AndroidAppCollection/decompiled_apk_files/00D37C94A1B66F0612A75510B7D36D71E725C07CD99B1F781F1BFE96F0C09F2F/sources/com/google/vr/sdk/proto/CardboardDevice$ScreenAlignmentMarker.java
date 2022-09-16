package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$ScreenAlignmentMarker extends aopi implements aoqv {
    private static final CardboardDevice$ScreenAlignmentMarker DEFAULT_INSTANCE;
    public static final int HORIZONTAL_FIELD_NUMBER = 1;
    private static volatile aorb PARSER = null;
    public static final int VERTICAL_FIELD_NUMBER = 2;
    private int bitField0_;
    private float horizontal_;
    private float vertical_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(CardboardDevice$ScreenAlignmentMarker.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    static {
        CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = new CardboardDevice$ScreenAlignmentMarker();
        DEFAULT_INSTANCE = cardboardDevice$ScreenAlignmentMarker;
        aopi.registerDefaultInstance(CardboardDevice$ScreenAlignmentMarker.class, cardboardDevice$ScreenAlignmentMarker);
    }

    private CardboardDevice$ScreenAlignmentMarker() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "horizontal_", "vertical_"});
            case 3:
                return new CardboardDevice$ScreenAlignmentMarker();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (CardboardDevice$ScreenAlignmentMarker.class) {
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

    public float getHorizontal() {
        return this.horizontal_;
    }

    public float getVertical() {
        return this.vertical_;
    }
}
