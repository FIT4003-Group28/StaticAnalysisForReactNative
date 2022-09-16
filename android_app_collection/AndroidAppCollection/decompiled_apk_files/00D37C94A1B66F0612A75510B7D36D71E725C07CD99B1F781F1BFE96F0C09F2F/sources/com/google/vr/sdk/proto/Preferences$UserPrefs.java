package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$UserPrefs extends aopi implements aoqv {
    public static final int CONTROLLER_HANDEDNESS_FIELD_NUMBER = 1;
    private static final Preferences$UserPrefs DEFAULT_INSTANCE;
    public static final int DEVELOPER_PREFS_FIELD_NUMBER = 2;
    private static volatile aorb PARSER = null;
    public static final int RUNTIME_FEATURES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int controllerHandedness_;
    private Preferences$DeveloperPrefs developerPrefs_;
    private aopu runtimeFeatures_ = emptyProtobufList();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(Preferences$UserPrefs.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum Handedness implements aopm {
        RIGHT_HANDED(0),
        LEFT_HANDED(1);
        
        public static final int LEFT_HANDED_VALUE = 1;
        public static final int RIGHT_HANDED_VALUE = 0;
        private static final aopn internalValueMap = new aopn() { // from class: com.google.vr.sdk.proto.Preferences.UserPrefs.Handedness.1
            @Override // defpackage.aopn
            /* renamed from: findValueByNumber  reason: collision with other method in class */
            public Handedness mo283findValueByNumber(int i) {
                return Handedness.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class HandednessVerifier implements aopo {
            static final aopo INSTANCE = new HandednessVerifier();

            private HandednessVerifier() {
            }

            @Override // defpackage.aopo
            public boolean isInRange(int i) {
                return Handedness.forNumber(i) != null;
            }
        }

        Handedness(int i) {
            this.value = i;
        }

        public static Handedness forNumber(int i) {
            if (i != 0) {
                if (i == 1) {
                    return LEFT_HANDED;
                }
                return null;
            }
            return RIGHT_HANDED;
        }

        public static aopo internalGetVerifier() {
            return HandednessVerifier.INSTANCE;
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
        Preferences$UserPrefs preferences$UserPrefs = new Preferences$UserPrefs();
        DEFAULT_INSTANCE = preferences$UserPrefs;
        aopi.registerDefaultInstance(Preferences$UserPrefs.class, preferences$UserPrefs);
    }

    private Preferences$UserPrefs() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"bitField0_", "controllerHandedness_", Handedness.internalGetVerifier(), "developerPrefs_", "runtimeFeatures_", Preferences$RuntimeFeature.class});
            case 3:
                return new Preferences$UserPrefs();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (Preferences$UserPrefs.class) {
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

    public Preferences$DeveloperPrefs getDeveloperPrefs() {
        Preferences$DeveloperPrefs preferences$DeveloperPrefs = this.developerPrefs_;
        return preferences$DeveloperPrefs == null ? Preferences$DeveloperPrefs.getDefaultInstance() : preferences$DeveloperPrefs;
    }

    public boolean hasDeveloperPrefs() {
        return (this.bitField0_ & 2) != 0;
    }
}
