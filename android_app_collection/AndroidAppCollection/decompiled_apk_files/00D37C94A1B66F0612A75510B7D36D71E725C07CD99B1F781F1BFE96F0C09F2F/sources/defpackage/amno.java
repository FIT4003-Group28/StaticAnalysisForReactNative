package defpackage;
/* compiled from: PG */
/* renamed from: amno  reason: default package */
/* loaded from: classes.dex */
public final class amno extends aopi implements aoqv {
    public static final amno a;
    private static volatile aorb e;
    public int b;
    public int c;
    public int d;

    static {
        amno amnoVar = new amno();
        a = amnoVar;
        aopi.registerDefaultInstance(amno.class, amnoVar);
    }

    private amno() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new amno();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (amno.class) {
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
