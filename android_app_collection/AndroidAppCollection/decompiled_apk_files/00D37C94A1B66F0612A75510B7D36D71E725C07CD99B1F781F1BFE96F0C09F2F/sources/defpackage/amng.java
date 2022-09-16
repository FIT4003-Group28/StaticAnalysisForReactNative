package defpackage;
/* compiled from: PG */
/* renamed from: amng  reason: default package */
/* loaded from: classes.dex */
public final class amng extends aopi implements aoqv {
    public static final amng a;
    private static volatile aorb h;
    public int b = 0;
    public Object c;
    public amno d;
    public amnq e;
    public amnp f;
    public amnu g;

    static {
        amng amngVar = new amng();
        a = amngVar;
        aopi.registerDefaultInstance(amng.class, amngVar);
    }

    private amng() {
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
                return newMessageInfo(a, "\u0000\t\u0001\u0000\u0001\r\t\u0000\u0000\u0000\u0001<\u0000\u0002\t\u0003\t\u0004\t\u0006Ȼ\u0000\u0007Ȼ\u0000\n\t\f<\u0000\r=\u0000", new Object[]{"c", "b", amnm.class, "d", "e", "f", "g", amnx.class});
            case 3:
                return new amng();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (amng.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
