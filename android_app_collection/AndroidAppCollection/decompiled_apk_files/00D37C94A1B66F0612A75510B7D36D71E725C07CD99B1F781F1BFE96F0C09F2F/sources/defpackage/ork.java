package defpackage;
/* compiled from: PG */
/* renamed from: ork  reason: default package */
/* loaded from: classes4.dex */
public final class ork extends aopi implements aoqv {
    public static final ork a;
    private static volatile aorb f;
    public int b;
    public arow c;
    public aoob d = aoob.b;
    public aoob e = aoob.b;

    static {
        ork orkVar = new ork();
        a = orkVar;
        aopi.registerDefaultInstance(ork.class, orkVar);
    }

    private ork() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ork();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ork.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
