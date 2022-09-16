package defpackage;
/* compiled from: PG */
/* renamed from: anfr  reason: default package */
/* loaded from: classes.dex */
public final class anfr extends aopi implements aoqv {
    public static final int ALLOW_CASTING_FIELD_NUMBER = 1;
    public static final int ALLOW_SCREENSHOT_FIELD_NUMBER = 3;
    public static final int ALLOW_SCREEN_RECORD_FIELD_NUMBER = 2;
    public static final anfr DEFAULT_INSTANCE;
    private static volatile aorb PARSER;
    private boolean allowCasting_;
    private boolean allowScreenRecord_;
    private boolean allowScreenshot_;
    private int bitField0_;

    static {
        anfr anfrVar = new anfr();
        DEFAULT_INSTANCE = anfrVar;
        aopi.registerDefaultInstance(anfr.class, anfrVar);
    }

    private anfr() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "allowCasting_", "allowScreenRecord_", "allowScreenshot_"});
            case 3:
                return new anfr();
            case 4:
                return new aopa(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (anfr.class) {
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
