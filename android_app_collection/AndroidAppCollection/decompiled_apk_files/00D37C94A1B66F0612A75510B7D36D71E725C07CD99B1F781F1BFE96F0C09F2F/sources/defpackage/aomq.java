package defpackage;
/* compiled from: PG */
/* renamed from: aomq  reason: default package */
/* loaded from: classes.dex */
public final class aomq extends aopi implements aoqv {
    public static final aomq a;
    private static volatile aorb f;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        aomq aomqVar = new aomq();
        a = aomqVar;
        aopi.registerDefaultInstance(aomq.class, aomqVar);
    }

    private aomq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"g", "b", aoli.m, "c", aoli.k, "d", aoli.j, "e", aoli.q});
            case 3:
                return new aomq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aomq.class) {
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
