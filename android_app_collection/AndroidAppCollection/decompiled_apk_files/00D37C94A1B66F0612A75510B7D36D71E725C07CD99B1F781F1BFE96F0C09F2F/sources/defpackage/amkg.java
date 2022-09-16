package defpackage;
/* compiled from: PG */
/* renamed from: amkg  reason: default package */
/* loaded from: classes.dex */
public final class amkg extends aopi implements aoqv {
    public static final amkg a;
    private static volatile aorb g;
    public int b;
    public amkj c;
    public long d;
    public long e;
    public int f;

    static {
        amkg amkgVar = new amkg();
        a = amkgVar;
        aopi.registerDefaultInstance(amkg.class, amkgVar);
    }

    private amkg() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new amkg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (amkg.class) {
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
