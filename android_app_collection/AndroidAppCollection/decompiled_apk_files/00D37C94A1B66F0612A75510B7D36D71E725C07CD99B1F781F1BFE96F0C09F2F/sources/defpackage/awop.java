package defpackage;
/* compiled from: PG */
/* renamed from: awop  reason: default package */
/* loaded from: classes2.dex */
public final class awop extends aopi implements aoqv {
    public static final awop a;
    public static final aopg b;
    private static volatile aorb e;
    public String c = "";
    public aoob d = aoob.b;
    private int f;

    static {
        awop awopVar = new awop();
        a = awopVar;
        aopi.registerDefaultInstance(awop.class, awopVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awopVar, awopVar, null, 170382720, aosj.MESSAGE, awop.class);
    }

    private awop() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new awop();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awop.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
