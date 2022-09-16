package defpackage;
/* compiled from: PG */
/* renamed from: aseu  reason: default package */
/* loaded from: classes2.dex */
public final class aseu extends aopi implements aoqv {
    public static final aseu a;
    private static volatile aorb c;
    public avia b;
    private int d;

    static {
        aseu aseuVar = new aseu();
        a = aseuVar;
        aopi.registerDefaultInstance(aseu.class, aseuVar);
    }

    private aseu() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uec98\u218a\uec98\u218a\u0001\u0000\u0000\u0000\uec98\u218aဉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new aseu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aseu.class) {
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
