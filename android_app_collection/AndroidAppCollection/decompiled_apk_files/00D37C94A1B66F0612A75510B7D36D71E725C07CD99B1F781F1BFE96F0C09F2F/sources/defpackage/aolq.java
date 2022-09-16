package defpackage;
/* compiled from: PG */
/* renamed from: aolq  reason: default package */
/* loaded from: classes.dex */
public final class aolq extends aopi implements aoqv {
    public static final aolq a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public long d;
    public long e;

    static {
        aolq aolqVar = new aolq();
        a = aolqVar;
        aopi.registerDefaultInstance(aolq.class, aolqVar);
    }

    private aolq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဂ\u0001\u0004ဈ\u0000\u0005ဂ\u0002", new Object[]{"b", "d", "c", "e"});
            case 3:
                return new aolq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aolq.class) {
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
