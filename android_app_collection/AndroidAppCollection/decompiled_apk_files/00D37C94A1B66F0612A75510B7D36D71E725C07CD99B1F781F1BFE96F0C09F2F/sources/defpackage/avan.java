package defpackage;
/* compiled from: PG */
/* renamed from: avan  reason: default package */
/* loaded from: classes2.dex */
public final class avan extends aopi implements aoqv {
    public static final avan a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        avan avanVar = new avan();
        a = avanVar;
        aopi.registerDefaultInstance(avan.class, avanVar);
    }

    private avan() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue5a9䄉\ue5a9䄉\u0001\u0000\u0000\u0000\ue5a9䄉ြ\u0000", new Object[]{"c", "b", avav.class});
            case 3:
                return new avan();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avan.class) {
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
