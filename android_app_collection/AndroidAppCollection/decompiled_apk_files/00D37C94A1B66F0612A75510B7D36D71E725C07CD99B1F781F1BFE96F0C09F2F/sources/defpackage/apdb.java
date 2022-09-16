package defpackage;
/* compiled from: PG */
/* renamed from: apdb  reason: default package */
/* loaded from: classes.dex */
public final class apdb extends aopi implements aoqv {
    public static final apdb a;
    private static volatile aorb e;
    public int b;
    public apda c;
    public int d;

    static {
        apdb apdbVar = new apdb();
        a = apdbVar;
        aopi.registerDefaultInstance(apdb.class, apdbVar);
    }

    private apdb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဌ\u0001", new Object[]{"b", "c", "d", aoxm.n});
            case 3:
                return new apdb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apdb.class) {
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
