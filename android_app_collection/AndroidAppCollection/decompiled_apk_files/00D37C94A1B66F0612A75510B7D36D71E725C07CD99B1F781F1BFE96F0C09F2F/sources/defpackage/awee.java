package defpackage;
/* compiled from: PG */
/* renamed from: awee  reason: default package */
/* loaded from: classes2.dex */
public final class awee extends aopi implements aoqv {
    public static final awee a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        awee aweeVar = new awee();
        a = aweeVar;
        aopi.registerDefaultInstance(awee.class, aweeVar);
    }

    private awee() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"b", "c", auqn.a()});
            case 3:
                return new awee();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awee.class) {
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
