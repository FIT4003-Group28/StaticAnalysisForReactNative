package defpackage;
/* compiled from: PG */
/* renamed from: awub  reason: default package */
/* loaded from: classes2.dex */
public final class awub extends aopi implements aoqv {
    public static final awub a;
    private static volatile aorb h;
    public int b;
    public long c;
    public long d;
    public aopq e = emptyIntList();
    public aopq f = emptyIntList();
    public long g;

    static {
        awub awubVar = new awub();
        a = awubVar;
        aopi.registerDefaultInstance(awub.class, awubVar);
    }

    private awub() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u0016\u0004\u0016\u0005ဂ\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new awub();
            case 4:
                return new aopa((boolean[][][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awub.class) {
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
