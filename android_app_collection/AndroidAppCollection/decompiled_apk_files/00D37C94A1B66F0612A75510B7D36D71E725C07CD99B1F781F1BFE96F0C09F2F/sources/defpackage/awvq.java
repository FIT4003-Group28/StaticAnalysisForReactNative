package defpackage;
/* compiled from: PG */
/* renamed from: awvq  reason: default package */
/* loaded from: classes2.dex */
public final class awvq extends aopi implements aoqv {
    public static final awvq a;
    private static volatile aorb f;
    public int b;
    public aorw d;
    public aorw e;
    private String g = "";
    public aoob c = aoob.b;

    static {
        awvq awvqVar = new awvq();
        a = awvqVar;
        aopi.registerDefaultInstance(awvq.class, awvqVar);
    }

    private awvq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "g", "c", "d", "e"});
            case 3:
                return new awvq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awvq.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
