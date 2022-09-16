package defpackage;
/* compiled from: PG */
/* renamed from: anpr  reason: default package */
/* loaded from: classes.dex */
public final class anpr extends aopi implements aoqv {
    public static final anpr a;
    private static volatile aorb e;
    public int b;
    public aoob c = aoob.b;
    public anpt d;

    static {
        anpr anprVar = new anpr();
        a = anprVar;
        aopi.registerDefaultInstance(anpr.class, anprVar);
    }

    private anpr() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"b", "c", "d"});
            case 3:
                return new anpr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (anpr.class) {
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
