package defpackage;
/* compiled from: PG */
/* renamed from: aomr  reason: default package */
/* loaded from: classes.dex */
public final class aomr extends aopi implements aoqv {
    public static final aomr a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        aomr aomrVar = new aomr();
        a = aomrVar;
        aopi.registerDefaultInstance(aomr.class, aomrVar);
    }

    private aomr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", aoli.m, "d", aoli.k, "e", aoli.j, "f", aoli.q});
            case 3:
                return new aomr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aomr.class) {
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
