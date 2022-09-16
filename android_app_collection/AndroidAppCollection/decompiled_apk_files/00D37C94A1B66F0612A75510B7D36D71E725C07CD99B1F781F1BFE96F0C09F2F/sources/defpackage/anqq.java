package defpackage;
/* compiled from: PG */
/* renamed from: anqq  reason: default package */
/* loaded from: classes.dex */
public final class anqq extends aopi implements aoqv {
    public static final anqq a;
    private static volatile aorb e;
    public anqt b;
    public anqo c;
    public int d;

    static {
        anqq anqqVar = new anqq();
        a = anqqVar;
        aopi.registerDefaultInstance(anqq.class, anqqVar);
    }

    private anqq() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"b", "c", "d"});
            case 3:
                return new anqq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (anqq.class) {
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
