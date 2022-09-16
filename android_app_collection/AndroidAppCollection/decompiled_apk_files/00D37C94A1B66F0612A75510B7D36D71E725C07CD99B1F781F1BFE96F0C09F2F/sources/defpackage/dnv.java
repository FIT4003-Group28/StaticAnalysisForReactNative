package defpackage;
/* compiled from: PG */
/* renamed from: dnv  reason: default package */
/* loaded from: classes3.dex */
public final class dnv extends aopi implements aoqv {
    public static final dnv a;
    private static volatile aorb g;
    public int b;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;

    static {
        dnv dnvVar = new dnv();
        a = dnvVar;
        aopi.registerDefaultInstance(dnv.class, dnvVar);
    }

    private dnv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new dnv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (dnv.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
