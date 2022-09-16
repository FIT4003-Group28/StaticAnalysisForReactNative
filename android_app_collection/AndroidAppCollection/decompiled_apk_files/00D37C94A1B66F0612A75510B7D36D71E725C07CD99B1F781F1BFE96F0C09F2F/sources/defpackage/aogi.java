package defpackage;
/* compiled from: PG */
/* renamed from: aogi  reason: default package */
/* loaded from: classes.dex */
public final class aogi extends aopi implements aoqv {
    public static final aogi a;
    private static volatile aorb c;
    public aoqp b = aoqp.a;
    private aoqp d = aoqp.a;
    private aoqp e = aoqp.a;

    static {
        aogi aogiVar = new aogi();
        a = aogiVar;
        aopi.registerDefaultInstance(aogi.class, aogiVar);
    }

    private aogi() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u0002࠲\u00032", new Object[]{"b", aogf.a, "e", aoge.a, anfo.n, "d", aogh.a});
            case 3:
                return new aogi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aogi.class) {
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
