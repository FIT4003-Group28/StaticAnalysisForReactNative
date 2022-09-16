package defpackage;
/* compiled from: PG */
/* renamed from: tqp  reason: default package */
/* loaded from: classes4.dex */
public final class tqp extends aopi implements aoqv {
    public static final tqp a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;

    static {
        tqp tqpVar = new tqp();
        a = tqpVar;
        aopi.registerDefaultInstance(tqp.class, tqpVar);
    }

    private tqp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0003\u0004ဂ\u0002", new Object[]{"b", "c", sml.r, "d", sml.q, "f", sml.p, "e"});
            case 3:
                return new tqp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (tqp.class) {
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
