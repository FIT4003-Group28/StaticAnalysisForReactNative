package defpackage;
/* compiled from: PG */
/* renamed from: aoxj  reason: default package */
/* loaded from: classes.dex */
public final class aoxj extends aopi implements aoqv {
    public static final aoxj a;
    private static volatile aorb e;
    public int b;
    public aoob c = aoob.b;
    public String d = "";

    static {
        aoxj aoxjVar = new aoxj();
        a = aoxjVar;
        aopi.registerDefaultInstance(aoxj.class, aoxjVar);
    }

    private aoxj() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ည\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new aoxj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aoxj.class) {
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
