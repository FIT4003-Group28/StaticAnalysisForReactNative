package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public enum Preferences$PlayAreaType implements aopm {
    GVR_PLAY_AREA_TYPE_NOT_SET(0),
    GVR_PLAY_AREA_TYPE_RADIAL(1);
    
    public static final int GVR_PLAY_AREA_TYPE_NOT_SET_VALUE = 0;
    public static final int GVR_PLAY_AREA_TYPE_RADIAL_VALUE = 1;
    private static final aopn internalValueMap = new aopn() { // from class: com.google.vr.sdk.proto.Preferences$PlayAreaType.1
        @Override // defpackage.aopn
        /* renamed from: findValueByNumber  reason: collision with other method in class */
        public Preferences$PlayAreaType mo283findValueByNumber(int i) {
            return Preferences$PlayAreaType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    final class PlayAreaTypeVerifier implements aopo {
        static final aopo INSTANCE = new PlayAreaTypeVerifier();

        private PlayAreaTypeVerifier() {
        }

        @Override // defpackage.aopo
        public boolean isInRange(int i) {
            return Preferences$PlayAreaType.forNumber(i) != null;
        }
    }

    Preferences$PlayAreaType(int i) {
        this.value = i;
    }

    public static Preferences$PlayAreaType forNumber(int i) {
        if (i != 0) {
            if (i == 1) {
                return GVR_PLAY_AREA_TYPE_RADIAL;
            }
            return null;
        }
        return GVR_PLAY_AREA_TYPE_NOT_SET;
    }

    public static aopo internalGetVerifier() {
        return PlayAreaTypeVerifier.INSTANCE;
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
