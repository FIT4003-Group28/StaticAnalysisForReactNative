package defpackage;
/* compiled from: PG */
/* renamed from: aqaw  reason: default package */
/* loaded from: classes2.dex */
public final class aqaw extends aopi implements aoqv {
    public static final aqaw a;
    private static volatile aorb c;
    public int b;
    private int d;

    static {
        aqaw aqawVar = new aqaw();
        a = aqawVar;
        aopi.registerDefaultInstance(aqaw.class, aqawVar);
    }

    private aqaw() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", apvq.r});
            case 3:
                return new aqaw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqaw.class) {
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
