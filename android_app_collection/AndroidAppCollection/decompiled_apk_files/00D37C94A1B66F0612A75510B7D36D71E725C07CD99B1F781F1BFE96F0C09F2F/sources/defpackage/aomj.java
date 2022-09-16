package defpackage;
/* compiled from: PG */
/* renamed from: aomj  reason: default package */
/* loaded from: classes.dex */
public final class aomj extends aopi implements aoqv {
    public static final aomj a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aomj aomjVar = new aomj();
        a = aomjVar;
        aopi.registerDefaultInstance(aomj.class, aomjVar);
    }

    private aomj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"c", "b", aoma.class});
            case 3:
                return new aomj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aomj.class) {
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
