package defpackage;
/* compiled from: PG */
/* renamed from: aovr  reason: default package */
/* loaded from: classes.dex */
public final class aovr extends aopi implements aoqv {
    public static final aovr a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aovu d;

    static {
        aovr aovrVar = new aovr();
        a = aovrVar;
        aopi.registerDefaultInstance(aovr.class, aovrVar);
    }

    private aovr() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new aovr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aovr.class) {
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
