package defpackage;
/* compiled from: PG */
/* renamed from: dnr  reason: default package */
/* loaded from: classes3.dex */
public final class dnr extends aopi implements aoqv {
    public static final dnr a;
    private static volatile aorb d;
    public int b;
    public int c = 2;

    static {
        dnr dnrVar = new dnr();
        a = dnrVar;
        aopi.registerDefaultInstance(dnr.class, dnrVar);
    }

    private dnr() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"b", "c", dnn.c});
            case 3:
                return new dnr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (dnr.class) {
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
