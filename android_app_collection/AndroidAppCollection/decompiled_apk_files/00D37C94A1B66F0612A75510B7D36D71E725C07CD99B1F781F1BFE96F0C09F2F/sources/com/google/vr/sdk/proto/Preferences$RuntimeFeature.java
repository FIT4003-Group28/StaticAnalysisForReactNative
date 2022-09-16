package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$RuntimeFeature extends aopi implements aoqv {
    private static final Preferences$RuntimeFeature DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile aorb PARSER;
    private int bitField0_;
    private boolean enabled_;
    private int id_ = -1;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(Preferences$RuntimeFeature.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$RuntimeFeature preferences$RuntimeFeature = new Preferences$RuntimeFeature();
        DEFAULT_INSTANCE = preferences$RuntimeFeature;
        aopi.registerDefaultInstance(Preferences$RuntimeFeature.class, preferences$RuntimeFeature);
    }

    private Preferences$RuntimeFeature() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "id_", "enabled_"});
            case 3:
                return new Preferences$RuntimeFeature();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (Preferences$RuntimeFeature.class) {
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
