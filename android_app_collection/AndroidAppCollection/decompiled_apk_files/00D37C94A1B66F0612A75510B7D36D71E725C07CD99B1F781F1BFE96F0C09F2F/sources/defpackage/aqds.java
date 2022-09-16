package defpackage;
/* compiled from: PG */
/* renamed from: aqds  reason: default package */
/* loaded from: classes2.dex */
public final class aqds extends aopi implements aoqv {
    public static final aqds a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aqds aqdsVar = new aqds();
        a = aqdsVar;
        aopi.registerDefaultInstance(aqds.class, aqdsVar);
    }

    private aqds() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf760䂹\ue883鲓\u0002\u0000\u0000\u0000\uf760䂹ြ\u0000\ue883鲓ြ\u0000", new Object[]{"c", "b", aucf.class, avto.class});
            case 3:
                return new aqds();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqds.class) {
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
