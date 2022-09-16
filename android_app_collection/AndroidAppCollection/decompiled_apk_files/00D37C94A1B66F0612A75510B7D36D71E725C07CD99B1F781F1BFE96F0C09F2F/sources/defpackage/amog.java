package defpackage;
/* compiled from: PG */
/* renamed from: amog  reason: default package */
/* loaded from: classes.dex */
public final class amog extends aopi implements aoqv {
    public static final amog a;
    private static volatile aorb g;
    public int b;
    public aoob c = aoob.b;
    public aoob d = aoob.b;
    public amof e;
    public amob f;

    static {
        amog amogVar = new amog();
        a = amogVar;
        aopi.registerDefaultInstance(amog.class, amogVar);
    }

    private amog() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new amog();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (amog.class) {
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
