package defpackage;
/* compiled from: PG */
/* renamed from: apmj  reason: default package */
/* loaded from: classes.dex */
public final class apmj extends aopi implements aoqv {
    public static final apmj a;
    private static volatile aorb c;
    public int b;
    private int d;

    static {
        apmj apmjVar = new apmj();
        a = apmjVar;
        aopi.registerDefaultInstance(apmj.class, apmjVar);
    }

    private apmj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", apiv.l});
            case 3:
                return new apmj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apmj.class) {
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
