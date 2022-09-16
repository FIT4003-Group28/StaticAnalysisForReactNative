package defpackage;
/* compiled from: PG */
/* renamed from: aojx  reason: default package */
/* loaded from: classes.dex */
public final class aojx extends aopi implements aoqv {
    public static final aojx a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aojx aojxVar = new aojx();
        a = aojxVar;
        aopi.registerDefaultInstance(aojx.class, aojxVar);
    }

    private aojx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ဿ\u0000", new Object[]{"c", "b", aoix.n});
            case 3:
                return new aojx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aojx.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
