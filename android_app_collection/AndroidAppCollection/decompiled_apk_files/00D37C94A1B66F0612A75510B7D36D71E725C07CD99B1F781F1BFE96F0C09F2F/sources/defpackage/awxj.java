package defpackage;
/* compiled from: PG */
/* renamed from: awxj  reason: default package */
/* loaded from: classes2.dex */
public final class awxj extends aopi implements aoqv {
    public static final awxj a;
    private static volatile aorb f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        awxj awxjVar = new awxj();
        a = awxjVar;
        aopi.registerDefaultInstance(awxj.class, awxjVar);
    }

    private awxj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0002\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001ွ\u0000\u0002ျ\u0000\u0004ွ\u0001\u0005ျ\u0001", new Object[]{"c", "b", "e", "d"});
            case 3:
                return new awxj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awxj.class) {
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
