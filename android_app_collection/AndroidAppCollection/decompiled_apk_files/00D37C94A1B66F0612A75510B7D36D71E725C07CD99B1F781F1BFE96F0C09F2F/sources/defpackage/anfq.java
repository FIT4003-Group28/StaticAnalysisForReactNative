package defpackage;
/* compiled from: PG */
/* renamed from: anfq  reason: default package */
/* loaded from: classes.dex */
public final class anfq extends aopi implements aoqv {
    public static final anfq DEFAULT_INSTANCE;
    private static volatile aorb PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private String version_ = "";

    static {
        anfq anfqVar = new anfq();
        DEFAULT_INSTANCE = anfqVar;
        aopi.registerDefaultInstance(anfq.class, anfqVar);
    }

    private anfq() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "version_"});
            case 3:
                return new anfq();
            case 4:
                return new aopa(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                aorb aorbVar = PARSER;
                if (aorbVar == null) {
                    synchronized (anfq.class) {
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
