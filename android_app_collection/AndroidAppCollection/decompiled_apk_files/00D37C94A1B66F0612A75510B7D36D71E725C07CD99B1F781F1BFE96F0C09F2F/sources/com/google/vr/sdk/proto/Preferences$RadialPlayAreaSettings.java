package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$RadialPlayAreaSettings extends aopi implements aoqv {
    private static final Preferences$RadialPlayAreaSettings DEFAULT_INSTANCE;
    private static volatile aorb PARSER = null;
    public static final int RADIUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private float radius_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(Preferences$RadialPlayAreaSettings.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$RadialPlayAreaSettings preferences$RadialPlayAreaSettings = new Preferences$RadialPlayAreaSettings();
        DEFAULT_INSTANCE = preferences$RadialPlayAreaSettings;
        aopi.registerDefaultInstance(Preferences$RadialPlayAreaSettings.class, preferences$RadialPlayAreaSettings);
    }

    private Preferences$RadialPlayAreaSettings() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "radius_"});
            case 3:
                return new Preferences$RadialPlayAreaSettings();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (Preferences$RadialPlayAreaSettings.class) {
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
