package defpackage;
/* compiled from: PG */
/* renamed from: aehq  reason: default package */
/* loaded from: classes.dex */
public final class aehq extends aopi implements aoqv {
    public static final aehq a;
    private static volatile aorb c;
    public aopq b = emptyIntList();

    static {
        aehq aehqVar = new aehq();
        a = aehqVar;
        aopi.registerDefaultInstance(aehq.class, aehqVar);
    }

    private aehq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"b", orl.b()});
            case 3:
                return new aehq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aehq.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
