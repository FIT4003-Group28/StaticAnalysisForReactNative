package com.google.vr.sdk.proto;

import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$DeviceParamsList extends aopi implements aoqv {
    private static final CardboardDevice$DeviceParamsList DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile aorb PARSER;
    private aopu params_ = emptyProtobufList();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    static {
        CardboardDevice$DeviceParamsList cardboardDevice$DeviceParamsList = new CardboardDevice$DeviceParamsList();
        DEFAULT_INSTANCE = cardboardDevice$DeviceParamsList;
        aopi.registerDefaultInstance(CardboardDevice$DeviceParamsList.class, cardboardDevice$DeviceParamsList);
    }

    private CardboardDevice$DeviceParamsList() {
    }

    public static CardboardDevice$DeviceParamsList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"params_", CardboardDevice$DeviceParams.class});
            case 3:
                return new CardboardDevice$DeviceParamsList();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (CardboardDevice$DeviceParamsList.class) {
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

    public List getParamsList() {
        return this.params_;
    }
}
