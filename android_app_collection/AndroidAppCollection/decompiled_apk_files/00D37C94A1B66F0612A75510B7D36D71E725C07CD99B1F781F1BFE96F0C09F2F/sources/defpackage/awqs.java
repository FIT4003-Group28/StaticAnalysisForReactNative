package defpackage;
/* compiled from: PG */
/* renamed from: awqs  reason: default package */
/* loaded from: classes2.dex */
public final class awqs extends aopi implements aoqv {
    public static final awqs a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public String d = "";
    public long e;

    static {
        awqs awqsVar = new awqs();
        a = awqsVar;
        aopi.registerDefaultInstance(awqs.class, awqsVar);
    }

    private awqs() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new awqs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awqs.class) {
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
