package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$PlayAreaSettings extends aopi implements aoqv {
    public static final int ANCHOR_IDS_FIELD_NUMBER = 1;
    private static final Preferences$PlayAreaSettings DEFAULT_INSTANCE;
    private static volatile aorb PARSER = null;
    public static final int PLAY_AREA_TYPE_FIELD_NUMBER = 2;
    public static final int RADIAL_PLAY_AREA_FIELD_NUMBER = 3;
    private aopu anchorIds_ = aopi.emptyProtobufList();
    private int bitField0_;
    private int playAreaType_;
    private Preferences$RadialPlayAreaSettings radialPlayArea_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(Preferences$PlayAreaSettings.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$PlayAreaSettings preferences$PlayAreaSettings = new Preferences$PlayAreaSettings();
        DEFAULT_INSTANCE = preferences$PlayAreaSettings;
        aopi.registerDefaultInstance(Preferences$PlayAreaSettings.class, preferences$PlayAreaSettings);
    }

    private Preferences$PlayAreaSettings() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "anchorIds_", "playAreaType_", Preferences$PlayAreaType.internalGetVerifier(), "radialPlayArea_"});
            case 3:
                return new Preferences$PlayAreaSettings();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (Preferences$PlayAreaSettings.class) {
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
