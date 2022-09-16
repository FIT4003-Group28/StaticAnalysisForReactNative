package com.google.vr.sdk.proto;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$SafetyCylinderParams extends aopi implements aoqv {
    public static final int ANCHOR_WARNING_DISTANCE_FIELD_NUMBER = 8;
    public static final int COLLISION_SPHERE_RADIUS_FIELD_NUMBER = 1;
    private static final Preferences$SafetyCylinderParams DEFAULT_INSTANCE;
    public static final int ENTER_EVENT_RADIUS_FIELD_NUMBER = 6;
    public static final int EXIT_EVENT_RADIUS_FIELD_NUMBER = 7;
    public static final int GRAPHICS_ENABLED_FIELD_NUMBER = 9;
    public static final int INNER_FOG_COLOR_FIELD_NUMBER = 4;
    public static final int INNER_RADIUS_FIELD_NUMBER = 2;
    public static final int OUTER_FOG_COLOR_FIELD_NUMBER = 5;
    public static final int OUTER_RADIUS_FIELD_NUMBER = 3;
    private static volatile aorb PARSER;
    private float anchorWarningDistance_;
    private int bitField0_;
    private float collisionSphereRadius_;
    private float enterEventRadius_;
    private float exitEventRadius_;
    private float innerRadius_;
    private float outerRadius_;
    private aopp innerFogColor_ = emptyFloatList();
    private aopp outerFogColor_ = emptyFloatList();
    private boolean graphicsEnabled_ = true;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aopa implements aoqv {
        private Builder() {
            super(Preferences$SafetyCylinderParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$SafetyCylinderParams preferences$SafetyCylinderParams = new Preferences$SafetyCylinderParams();
        DEFAULT_INSTANCE = preferences$SafetyCylinderParams;
        aopi.registerDefaultInstance(Preferences$SafetyCylinderParams.class, preferences$SafetyCylinderParams);
    }

    private Preferences$SafetyCylinderParams() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004\u0013\u0005\u0013\u0006ခ\u0003\u0007ခ\u0004\bခ\u0005\tဇ\u0006", new Object[]{"bitField0_", "collisionSphereRadius_", "innerRadius_", "outerRadius_", "innerFogColor_", "outerFogColor_", "enterEventRadius_", "exitEventRadius_", "anchorWarningDistance_", "graphicsEnabled_"});
            case 3:
                return new Preferences$SafetyCylinderParams();
            case 4:
                return new Builder(null);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (Preferences$SafetyCylinderParams.class) {
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
