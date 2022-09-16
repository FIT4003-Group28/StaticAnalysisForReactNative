package defpackage;
/* compiled from: PG */
/* renamed from: asjx  reason: default package */
/* loaded from: classes2.dex */
public final class asjx extends aopi implements aoqv {
    public static final asjx a;
    private static volatile aorb d;
    public int b;
    public long c;

    static {
        asjx asjxVar = new asjx();
        a = asjxVar;
        aopi.registerDefaultInstance(asjx.class, asjxVar);
    }

    private asjx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
            case 3:
                return new asjx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asjx.class) {
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
