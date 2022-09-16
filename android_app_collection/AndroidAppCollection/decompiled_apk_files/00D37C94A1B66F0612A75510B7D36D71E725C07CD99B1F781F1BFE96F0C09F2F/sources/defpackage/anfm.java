package defpackage;
/* compiled from: PG */
/* renamed from: anfm  reason: default package */
/* loaded from: classes.dex */
public final class anfm extends aopi implements aoqv {
    public static final int ADDITIONAL_AHARDWAREBUFFER_USAGE_FIELD_NUMBER = 6;
    public static final int BACK_RGB16_WITH_BGR16_FIELD_NUMBER = 7;
    public static final int BLACK_BOOST_FIELD_NUMBER = 3;
    public static final int COMPOSITOR_DRAWS_FLANGE_FIELD_NUMBER = 8;
    public static final anfm DEFAULT_INSTANCE;
    public static final int DISPLAY_LATENCY_MICROS_FIELD_NUMBER = 2;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile aorb PARSER = null;
    public static final int SCANOUT_OFFSET_MICROS_FIELD_NUMBER = 9;
    public static final int SCHEDULING_SLACK_MICROS_FIELD_NUMBER = 10;
    public static final int STRIPS_PER_FRAME_FIELD_NUMBER = 5;
    public static final int VSYNC_GRACE_PERIOD_MICROS_FIELD_NUMBER = 4;
    private long additionalAhardwarebufferUsage_;
    private boolean backRgb16WithBgr16_;
    public int bitField0_;
    private long blackBoost_;
    private boolean compositorDrawsFlange_;
    private long displayLatencyMicros_;
    public long flags_;
    private long scanoutOffsetMicros_;
    private long schedulingSlackMicros_;
    private long stripsPerFrame_;
    private long vsyncGracePeriodMicros_;

    static {
        anfm anfmVar = new anfm();
        DEFAULT_INSTANCE = anfmVar;
        aopi.registerDefaultInstance(anfm.class, anfmVar);
    }

    private anfm() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဇ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"bitField0_", "flags_", "displayLatencyMicros_", "blackBoost_", "vsyncGracePeriodMicros_", "stripsPerFrame_", "additionalAhardwarebufferUsage_", "backRgb16WithBgr16_", "compositorDrawsFlange_", "scanoutOffsetMicros_", "schedulingSlackMicros_"});
            case 3:
                return new anfm();
            case 4:
                return new aopa(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (anfm.class) {
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
